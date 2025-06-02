package com.brigade1.property.property_sales_server.configuration;

import com.brigade1.property.property_sales_server.models.types.Role;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.Collections;
import java.util.UUID;

@Component
public class JwtFilter extends OncePerRequestFilter {

    private final JwtUtil jwtUtil;
    private final CustomUserDetailsService customUserDetailsService;

    public JwtFilter(JwtUtil jwtUtil, CustomUserDetailsService customUserDetailsService) {
        this.jwtUtil = jwtUtil;
        this.customUserDetailsService = customUserDetailsService;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {

        String requestURI = request.getRequestURI();
        String authHeader = request.getHeader("Authorization");

        System.out.println("=== JWT Filter Debug ===");
        System.out.println("Request URI: " + requestURI);
        System.out.println("Authorization header: " + authHeader);

        if (authHeader != null && !authHeader.isBlank() && authHeader.startsWith("Bearer ")) {
            String jwt = authHeader.substring(7);
            System.out.println("JWT token extracted: " + jwt.substring(0, Math.min(50, jwt.length())) + "...");

            if (jwt.isBlank()) {
                System.out.println("JWT token is blank!");
                response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Invalid JWT Token in Bearer Header");
                return;
            }

            try {
                System.out.println("Validating JWT token...");
                String email = jwtUtil.validateTokenAndRetrieveClaim(jwt);
                UUID userId = jwtUtil.validateTokenAndRetrieveUserId(jwt);

                System.out.println("JWT validation successful:");
                System.out.println("- Email: " + email);
                System.out.println("- User ID: " + userId);

                UserDetails userDetails = customUserDetailsService.loadUserByUsername(email);
                System.out.println("UserDetails loaded: " + userDetails.getUsername());
                System.out.println("Authorities: " + userDetails.getAuthorities());

                UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(
                        userDetails,
                        null,
                        userDetails.getAuthorities()
                );

                if (SecurityContextHolder.getContext().getAuthentication() == null) {
                    SecurityContextHolder.getContext().setAuthentication(authentication);
                    System.out.println("Authentication set in SecurityContext");
                } else {
                    System.out.println("Authentication already exists in SecurityContext");
                }

                request.setAttribute("user_id", userId);
                System.out.println("User ID set as request attribute");

            } catch (Exception e) {
                System.out.println("JWT validation failed: " + e.getClass().getSimpleName() + ": " + e.getMessage());
                e.printStackTrace();
                response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Invalid or Expired JWT Token");
                return;
            }
        } else {
            System.out.println("No Bearer token found in Authorization header");
        }

        System.out.println("Proceeding with filter chain...");
        System.out.println("========================");
        filterChain.doFilter(request, response);
    }
}