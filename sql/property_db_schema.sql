--
-- PostgreSQL database dump
--

-- Dumped from database version 16.4
-- Dumped by pg_dump version 16.4

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- Name: flat_house_type; Type: TYPE; Schema: public; Owner: postgres
--

CREATE TYPE public.flat_house_type AS ENUM (
    'TYPE_BRICK',
    'TYPE_MONOLITHIC',
    'TYPE_PANEL',
    'TYPE_BLOCK',
    'TYPE_WOODEN',
    'TYPE_STALIN',
    'TYPE_MONOLITHIC_BRICK'
);


ALTER TYPE public.flat_house_type OWNER TO postgres;

--
-- Name: garage_type; Type: TYPE; Schema: public; Owner: postgres
--

CREATE TYPE public.garage_type AS ENUM (
    'TYPE_BRICK',
    'TYPE_STONE',
    'TYPE_METAL',
    'TYPE_CINDER_BLOCK',
    'TYPE_FOAM_BLOCK'
);


ALTER TYPE public.garage_type OWNER TO postgres;

--
-- Name: gas_enum; Type: TYPE; Schema: public; Owner: postgres
--

CREATE TYPE public.gas_enum AS ENUM (
    'PIPELINE',
    'GAS_HOLDER',
    'NONE'
);


ALTER TYPE public.gas_enum OWNER TO postgres;

--
-- Name: land_category_enum; Type: TYPE; Schema: public; Owner: postgres
--

CREATE TYPE public.land_category_enum AS ENUM (
    'LANDS_OF_SETTLEMENTS',
    'AGRICULTURE_LANDS',
    'CATEGORY_OTHER'
);


ALTER TYPE public.land_category_enum OWNER TO postgres;

--
-- Name: listing_property_type; Type: TYPE; Schema: public; Owner: postgres
--

CREATE TYPE public.listing_property_type AS ENUM (
    'FLAT',
    'GARAGE',
    'LAND_PLOT',
    'PRIVATE_HOUSE'
);


ALTER TYPE public.listing_property_type OWNER TO postgres;

--
-- Name: parking_type; Type: TYPE; Schema: public; Owner: postgres
--

CREATE TYPE public.parking_type AS ENUM (
    'PARKING_SURFACE',
    'PARKING_MULTILEVEL',
    'PARKING_UNDERGROUND',
    'PARKING_ROOF'
);


ALTER TYPE public.parking_type OWNER TO postgres;

--
-- Name: plot_state_enum; Type: TYPE; Schema: public; Owner: postgres
--

CREATE TYPE public.plot_state_enum AS ENUM (
    'INVALID_HOUSING',
    'DNT',
    'GARDENING',
    'FARMLAND',
    'HOUSEHOLD_PLOT'
);


ALTER TYPE public.plot_state_enum OWNER TO postgres;

--
-- Name: private_house_type; Type: TYPE; Schema: public; Owner: postgres
--

CREATE TYPE public.private_house_type AS ENUM (
    'TYPE_COTTAGE',
    'TYPE_HOUSE',
    'TYPE_TOWNHOUSE'
);


ALTER TYPE public.private_house_type OWNER TO postgres;

--
-- Name: renovation_type; Type: TYPE; Schema: public; Owner: postgres
--

CREATE TYPE public.renovation_type AS ENUM (
    'RENOVATION_NO',
    'RENOVATION_COSMETIC',
    'RENOVATION_EURO',
    'RENOVATION_DESIGNER'
);


ALTER TYPE public.renovation_type OWNER TO postgres;

--
-- Name: role; Type: TYPE; Schema: public; Owner: postgres
--

CREATE TYPE public.role AS ENUM (
    'ROLE_USER',
    'ROLE_ADMIN'
);


ALTER TYPE public.role OWNER TO postgres;

--
-- Name: sewage_enum; Type: TYPE; Schema: public; Owner: postgres
--

CREATE TYPE public.sewage_enum AS ENUM (
    'CENTRAL',
    'SEPTIC',
    'CESSPOOL',
    'NONE'
);


ALTER TYPE public.sewage_enum OWNER TO postgres;

--
-- Name: water_enum; Type: TYPE; Schema: public; Owner: postgres
--

CREATE TYPE public.water_enum AS ENUM (
    'PIPED',
    'WELL',
    'NONE'
);


ALTER TYPE public.water_enum OWNER TO postgres;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: address; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.address (
    id uuid NOT NULL,
    country character varying(128) NOT NULL,
    region character varying(128) NOT NULL,
    settlement character varying(128) NOT NULL,
    public_transport character varying(512),
    street character varying(128),
    building character varying(128) NOT NULL,
    block character varying(128),
    apartment character varying(128),
    zip_code character varying(32)
);


ALTER TABLE public.address OWNER TO postgres;

--
-- Name: flat_for_sale; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.flat_for_sale (
    id uuid NOT NULL,
    cadastral_number text,
    floor integer,
    house_floor_amount integer,
    construction_year integer,
    ceiling_height integer,
    flat_number character varying(5),
    rooms_amount integer,
    total_area numeric(10,2) NOT NULL,
    living_area numeric(10,2),
    logia_amount integer,
    balcony_amount integer,
    bathroom_amount integer,
    combined_bathroom_amount integer,
    has_street_view boolean,
    has_yard_view boolean,
    renovation_type public.renovation_type NOT NULL,
    cargo_elevator_amount integer,
    passenger_elevator_amount integer,
    has_wheelchair_ramp boolean,
    has_garbage_chute boolean,
    parking_type public.parking_type,
    has_furniture_in_rooms boolean,
    has_furniture_in_kitchen boolean,
    has_bath boolean,
    has_shower_cabin boolean,
    has_air_conditioner boolean,
    has_refrigerator boolean,
    has_tv boolean,
    has_dishwasher boolean,
    has_washing_machine boolean,
    flat_house_type public.flat_house_type,
    created_at timestamp without time zone DEFAULT CURRENT_TIMESTAMP,
    updated_at timestamp without time zone DEFAULT CURRENT_TIMESTAMP,
    deleted_at timestamp without time zone,
    is_active boolean DEFAULT true,
    CONSTRAINT flat_for_sale_balcony_amount_check CHECK ((balcony_amount >= 0)),
    CONSTRAINT flat_for_sale_bathroom_amount_check CHECK ((bathroom_amount >= 0)),
    CONSTRAINT flat_for_sale_cadastral_number_check CHECK ((cadastral_number ~ '^\d{2}:\d{2}:\d{6,7}:\d{2}$'::text)),
    CONSTRAINT flat_for_sale_cargo_elevator_amount_check CHECK ((cargo_elevator_amount >= 0)),
    CONSTRAINT flat_for_sale_ceiling_height_check CHECK (((ceiling_height > 0) AND (ceiling_height < 100))),
    CONSTRAINT flat_for_sale_combined_bathroom_amount_check CHECK ((combined_bathroom_amount >= 0)),
    CONSTRAINT flat_for_sale_construction_year_check CHECK ((construction_year < 2025)),
    CONSTRAINT flat_for_sale_living_area_check CHECK ((living_area >= (0)::numeric)),
    CONSTRAINT flat_for_sale_logia_amount_check CHECK ((logia_amount >= 0)),
    CONSTRAINT flat_for_sale_passenger_elevator_amount_check CHECK ((passenger_elevator_amount >= 0)),
    CONSTRAINT flat_for_sale_rooms_amount_check CHECK ((rooms_amount > 0)),
    CONSTRAINT flat_for_sale_total_area_check CHECK ((total_area >= (0)::numeric))
);


ALTER TABLE public.flat_for_sale OWNER TO postgres;

--
-- Name: garage_for_sale; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.garage_for_sale (
    id uuid NOT NULL,
    cadastral_number text NOT NULL,
    garage_type public.garage_type NOT NULL,
    area numeric(10,2) NOT NULL,
    ceiling_height integer,
    construction_year integer,
    has_electricity boolean DEFAULT false NOT NULL,
    has_heating boolean DEFAULT false NOT NULL,
    has_water_supply boolean DEFAULT false NOT NULL,
    has_sewerage boolean DEFAULT false NOT NULL,
    has_automatic_door boolean DEFAULT false NOT NULL,
    has_ramp boolean DEFAULT false NOT NULL,
    parking_spots integer,
    is_reinforced boolean DEFAULT false NOT NULL,
    created_at timestamp without time zone DEFAULT CURRENT_TIMESTAMP NOT NULL,
    updated_at timestamp without time zone DEFAULT CURRENT_TIMESTAMP NOT NULL,
    deleted_at timestamp without time zone,
    is_active boolean DEFAULT true NOT NULL,
    CONSTRAINT garage_for_sale_area_check CHECK ((area >= (0)::numeric)),
    CONSTRAINT garage_for_sale_cadastral_number_check CHECK ((cadastral_number ~ '^\d{2}:\d{2}:\d{6,7}:\d{2}$'::text)),
    CONSTRAINT garage_for_sale_ceiling_height_check CHECK (((ceiling_height > 0) AND (ceiling_height < 100))),
    CONSTRAINT garage_for_sale_construction_year_check CHECK ((construction_year < 2025)),
    CONSTRAINT garage_for_sale_parking_spots_check CHECK ((parking_spots >= 0))
);


ALTER TABLE public.garage_for_sale OWNER TO postgres;

--
-- Name: land_plot_for_sale; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.land_plot_for_sale (
    id uuid NOT NULL,
    cadastral_number text NOT NULL,
    land_category public.land_category_enum NOT NULL,
    land_plot_state public.plot_state_enum NOT NULL,
    size_area numeric(10,2) NOT NULL,
    sewage public.sewage_enum DEFAULT 'NONE'::public.sewage_enum NOT NULL,
    water public.water_enum DEFAULT 'NONE'::public.water_enum NOT NULL,
    gas public.gas_enum DEFAULT 'NONE'::public.gas_enum NOT NULL,
    electricity boolean DEFAULT false NOT NULL,
    description character varying(1000),
    created_at timestamp without time zone DEFAULT CURRENT_TIMESTAMP NOT NULL,
    updated_at timestamp without time zone DEFAULT CURRENT_TIMESTAMP NOT NULL,
    deleted_at timestamp without time zone,
    is_active boolean DEFAULT true NOT NULL,
    CONSTRAINT land_plot_for_sale_cadastral_number_check CHECK ((cadastral_number ~ '^\d{2}:\d{2}:\d{6,7}:\d{2}$'::text)),
    CONSTRAINT land_plot_for_sale_size_area_check CHECK ((size_area > (0)::numeric))
);


ALTER TABLE public.land_plot_for_sale OWNER TO postgres;

--
-- Name: listing; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.listing (
    id uuid NOT NULL,
    user_id uuid NOT NULL,
    property_type public.listing_property_type NOT NULL,
    created_at timestamp without time zone DEFAULT CURRENT_TIMESTAMP,
    updated_at timestamp without time zone DEFAULT CURRENT_TIMESTAMP,
    is_active boolean DEFAULT true,
    address_id uuid NOT NULL
);


ALTER TABLE public.listing OWNER TO postgres;

--
-- Name: listing_property_sale; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.listing_property_sale (
    listing_id uuid NOT NULL,
    flat_for_sale_id uuid,
    garage_for_sale_id uuid,
    land_plot_for_sale_id uuid,
    private_house_for_sale_id uuid,
    CONSTRAINT listing_property_sale_check CHECK (((((((flat_for_sale_id IS NOT NULL))::integer + ((garage_for_sale_id IS NOT NULL))::integer) + ((land_plot_for_sale_id IS NOT NULL))::integer) + ((private_house_for_sale_id IS NOT NULL))::integer) = 1))
);


ALTER TABLE public.listing_property_sale OWNER TO postgres;

--
-- Name: photo; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.photo (
    id uuid DEFAULT gen_random_uuid() NOT NULL,
    photo text NOT NULL,
    listing_id uuid NOT NULL
);


ALTER TABLE public.photo OWNER TO postgres;

--
-- Name: private_house_for_sale; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.private_house_for_sale (
    id uuid NOT NULL,
    cadastral_number text,
    private_house_type public.private_house_type NOT NULL,
    rooms_amount integer NOT NULL,
    construction_year integer,
    living_area numeric(10,2) NOT NULL,
    total_area numeric(10,2) NOT NULL,
    ceiling_height integer,
    attic_area numeric(10,2),
    basement_area numeric(10,2),
    renovation_type public.renovation_type NOT NULL,
    has_bathroom boolean DEFAULT false NOT NULL,
    has_toilet boolean DEFAULT false NOT NULL,
    has_garage boolean DEFAULT false NOT NULL,
    garage_area numeric(10,2),
    has_garden boolean DEFAULT false NOT NULL,
    garden_area numeric(10,2),
    has_balcony boolean DEFAULT false NOT NULL,
    has_boiler boolean DEFAULT false NOT NULL,
    has_fireplace boolean DEFAULT false NOT NULL,
    has_furniture_in_rooms boolean DEFAULT false NOT NULL,
    has_furniture_in_kitchen boolean DEFAULT false NOT NULL,
    has_street_view boolean DEFAULT false NOT NULL,
    has_yard_view boolean DEFAULT false NOT NULL,
    created_at timestamp without time zone DEFAULT CURRENT_TIMESTAMP NOT NULL,
    updated_at timestamp without time zone DEFAULT CURRENT_TIMESTAMP NOT NULL,
    deleted_at timestamp without time zone,
    is_active boolean DEFAULT true NOT NULL,
    CONSTRAINT private_house_for_sale_attic_area_check CHECK ((attic_area >= (0)::numeric)),
    CONSTRAINT private_house_for_sale_basement_area_check CHECK ((basement_area >= (0)::numeric)),
    CONSTRAINT private_house_for_sale_cadastral_number_check CHECK ((cadastral_number ~ '^\d{2}:\d{2}:\d{6,7}:\d{2}$'::text)),
    CONSTRAINT private_house_for_sale_ceiling_height_check CHECK (((ceiling_height > 0) AND (ceiling_height < 100))),
    CONSTRAINT private_house_for_sale_construction_year_check CHECK ((construction_year < 2025)),
    CONSTRAINT private_house_for_sale_garage_area_check CHECK ((garage_area >= (0)::numeric)),
    CONSTRAINT private_house_for_sale_garden_area_check CHECK ((garden_area >= (0)::numeric)),
    CONSTRAINT private_house_for_sale_living_area_check CHECK ((living_area >= (0)::numeric)),
    CONSTRAINT private_house_for_sale_rooms_amount_check CHECK ((rooms_amount > 0)),
    CONSTRAINT private_house_for_sale_total_area_check CHECK ((total_area >= (0)::numeric))
);


ALTER TABLE public.private_house_for_sale OWNER TO postgres;

--
-- Name: user; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public."user" (
    id uuid NOT NULL,
    email character varying(256) NOT NULL,
    password character varying(1024) NOT NULL,
    role public.role DEFAULT 'ROLE_USER'::public.role NOT NULL
);


ALTER TABLE public."user" OWNER TO postgres;

--
-- Data for Name: address; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.address (id, country, region, settlement, public_transport, street, building, block, apartment, zip_code) FROM stdin;
\.


--
-- Data for Name: flat_for_sale; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.flat_for_sale (id, cadastral_number, floor, house_floor_amount, construction_year, ceiling_height, flat_number, rooms_amount, total_area, living_area, logia_amount, balcony_amount, bathroom_amount, combined_bathroom_amount, has_street_view, has_yard_view, renovation_type, cargo_elevator_amount, passenger_elevator_amount, has_wheelchair_ramp, has_garbage_chute, parking_type, has_furniture_in_rooms, has_furniture_in_kitchen, has_bath, has_shower_cabin, has_air_conditioner, has_refrigerator, has_tv, has_dishwasher, has_washing_machine, flat_house_type, created_at, updated_at, deleted_at, is_active) FROM stdin;
\.


--
-- Data for Name: garage_for_sale; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.garage_for_sale (id, cadastral_number, garage_type, area, ceiling_height, construction_year, has_electricity, has_heating, has_water_supply, has_sewerage, has_automatic_door, has_ramp, parking_spots, is_reinforced, created_at, updated_at, deleted_at, is_active) FROM stdin;
\.


--
-- Data for Name: land_plot_for_sale; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.land_plot_for_sale (id, cadastral_number, land_category, land_plot_state, size_area, sewage, water, gas, electricity, description, created_at, updated_at, deleted_at, is_active) FROM stdin;
\.


--
-- Data for Name: listing; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.listing (id, user_id, property_type, created_at, updated_at, is_active, address_id) FROM stdin;
\.


--
-- Data for Name: listing_property_sale; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.listing_property_sale (listing_id, flat_for_sale_id, garage_for_sale_id, land_plot_for_sale_id, private_house_for_sale_id) FROM stdin;
\.


--
-- Data for Name: photo; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.photo (id, photo, listing_id) FROM stdin;
\.


--
-- Data for Name: private_house_for_sale; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.private_house_for_sale (id, cadastral_number, private_house_type, rooms_amount, construction_year, living_area, total_area, ceiling_height, attic_area, basement_area, renovation_type, has_bathroom, has_toilet, has_garage, garage_area, has_garden, garden_area, has_balcony, has_boiler, has_fireplace, has_furniture_in_rooms, has_furniture_in_kitchen, has_street_view, has_yard_view, created_at, updated_at, deleted_at, is_active) FROM stdin;
\.


--
-- Data for Name: user; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public."user" (id, email, password, role) FROM stdin;
\.


--
-- Name: address address_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.address
    ADD CONSTRAINT address_pkey PRIMARY KEY (id);


--
-- Name: flat_for_sale flat_for_sale_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.flat_for_sale
    ADD CONSTRAINT flat_for_sale_pkey PRIMARY KEY (id);


--
-- Name: garage_for_sale garage_for_sale_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.garage_for_sale
    ADD CONSTRAINT garage_for_sale_pkey PRIMARY KEY (id);


--
-- Name: land_plot_for_sale land_plot_for_sale_cadastral_number_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.land_plot_for_sale
    ADD CONSTRAINT land_plot_for_sale_cadastral_number_key UNIQUE (cadastral_number);


--
-- Name: land_plot_for_sale land_plot_for_sale_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.land_plot_for_sale
    ADD CONSTRAINT land_plot_for_sale_pkey PRIMARY KEY (id);


--
-- Name: listing listing_address_unique; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.listing
    ADD CONSTRAINT listing_address_unique UNIQUE (address_id);


--
-- Name: listing listing_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.listing
    ADD CONSTRAINT listing_pkey PRIMARY KEY (id);


--
-- Name: listing_property_sale listing_property_sale_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.listing_property_sale
    ADD CONSTRAINT listing_property_sale_pkey PRIMARY KEY (listing_id);


--
-- Name: photo photos_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.photo
    ADD CONSTRAINT photos_pkey PRIMARY KEY (id);


--
-- Name: private_house_for_sale private_house_for_sale_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.private_house_for_sale
    ADD CONSTRAINT private_house_for_sale_pkey PRIMARY KEY (id);


--
-- Name: user user_email_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."user"
    ADD CONSTRAINT user_email_key UNIQUE (email);


--
-- Name: user user_email_unique; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."user"
    ADD CONSTRAINT user_email_unique UNIQUE (email);


--
-- Name: user user_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."user"
    ADD CONSTRAINT user_pkey PRIMARY KEY (id);


--
-- Name: listing listing_address_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.listing
    ADD CONSTRAINT listing_address_id_fkey FOREIGN KEY (address_id) REFERENCES public.address(id);


--
-- Name: listing_property_sale listing_property_sale_flat_for_sale_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.listing_property_sale
    ADD CONSTRAINT listing_property_sale_flat_for_sale_id_fkey FOREIGN KEY (flat_for_sale_id) REFERENCES public.flat_for_sale(id) ON DELETE CASCADE;


--
-- Name: listing_property_sale listing_property_sale_garage_for_sale_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.listing_property_sale
    ADD CONSTRAINT listing_property_sale_garage_for_sale_id_fkey FOREIGN KEY (garage_for_sale_id) REFERENCES public.garage_for_sale(id) ON DELETE CASCADE;


--
-- Name: listing_property_sale listing_property_sale_land_plot_for_sale_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.listing_property_sale
    ADD CONSTRAINT listing_property_sale_land_plot_for_sale_id_fkey FOREIGN KEY (land_plot_for_sale_id) REFERENCES public.land_plot_for_sale(id) ON DELETE CASCADE;


--
-- Name: listing_property_sale listing_property_sale_listing_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.listing_property_sale
    ADD CONSTRAINT listing_property_sale_listing_id_fkey FOREIGN KEY (listing_id) REFERENCES public.listing(id) ON DELETE CASCADE;


--
-- Name: listing_property_sale listing_property_sale_private_house_for_sale_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.listing_property_sale
    ADD CONSTRAINT listing_property_sale_private_house_for_sale_id_fkey FOREIGN KEY (private_house_for_sale_id) REFERENCES public.private_house_for_sale(id) ON DELETE CASCADE;


--
-- Name: listing listing_user_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.listing
    ADD CONSTRAINT listing_user_id_fkey FOREIGN KEY (user_id) REFERENCES public."user"(id);


--
-- Name: photo photo_listing_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.photo
    ADD CONSTRAINT photo_listing_fk FOREIGN KEY (listing_id) REFERENCES public.listing(id) ON DELETE CASCADE;


--
-- PostgreSQL database dump complete
--

