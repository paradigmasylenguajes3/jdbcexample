CREATE TABLE public.cursos
(
    id_curso integer NOT NULL DEFAULT nextval('cursos_id_curso_seq'::regclass),
    nombre character varying(100) COLLATE pg_catalog."default",
    duracion integer,
    CONSTRAINT pk_id_curso PRIMARY KEY (id_curso)
)

TABLESPACE pg_default;

ALTER TABLE public.cursos
    OWNER to postgres;