CREATE TABLE public.alumnos
(
    id serial NOT NULL,
    apellido character varying(128) NOT NULL,
    nombre character varying(128) NOT NULL,
    sexo character varying(20) NOT NULL,
    PRIMARY KEY (id)
);

ALTER TABLE public.alumnos
    OWNER to dbadm;