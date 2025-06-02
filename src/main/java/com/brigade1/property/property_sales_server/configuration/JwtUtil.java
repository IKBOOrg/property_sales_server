package com.brigade1.property.property_sales_server.configuration;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.brigade1.property.property_sales_server.models.types.Role;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.time.ZonedDateTime;
import java.util.Collections;
import java.util.Date;
import java.util.UUID;

@Component
public class JwtUtil {

    @Value("${jwt_secret}")
    private String SECRET_KEY;


    public String generateToken(String email, Role role, UUID userId) {
        Date expirationDate = Date.from(ZonedDateTime.now().plusMinutes(60).toInstant());

        return JWT.create()
                .withSubject("User details")
                .withClaim("email", email)
                .withClaim("role", role.name())
                .withClaim("user_id", userId.toString())
                .withIssuedAt(new Date())
                .withIssuer("springapp")
                .withExpiresAt(expirationDate)
                .sign(Algorithm.HMAC256(SECRET_KEY));
    }


    /**
     * Валидация токена и извлечение имени пользователя.
     */
    public UUID validateTokenAndRetrieveUserId(String token) throws JWTVerificationException {
        JWTVerifier verifier = JWT.require(Algorithm.HMAC256(SECRET_KEY))
                .withSubject("User details")
                .withIssuer("springapp")
                .build();

        DecodedJWT jwt = verifier.verify(token);
        return UUID.fromString(jwt.getClaim("user_id").asString());
    }



    /**
     * Валидация токена и извлечение роли пользователя.
     */
    public Role validateTokenAndRetrieveRole(String token) throws JWTVerificationException {
        JWTVerifier verifier = JWT.require(Algorithm.HMAC256(SECRET_KEY))
                .withSubject("User details")
                .withIssuer("springapp")
                .build();

        DecodedJWT jwt = verifier.verify(token);
        return Role.valueOf(jwt.getClaim("role").asString()); // Извлекаем роль из токена
    }

    public String validateTokenAndRetrieveClaim(String token) throws JWTVerificationException {
        JWTVerifier verifier = JWT.require(Algorithm.HMAC256(SECRET_KEY))
                .withSubject("User details")
                .withIssuer("springapp")
                .build();

        DecodedJWT jwt = verifier.verify(token);
        return jwt.getClaim("email").asString(); // Получаем email из токена
    }

}