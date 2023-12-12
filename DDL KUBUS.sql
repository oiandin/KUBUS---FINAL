BEGIN;

CREATE TABLE IF NOT EXISTS public.buku
(
    kodebuku character varying(4) COLLATE pg_catalog."default" NOT NULL,
    judulbuku character varying(50) COLLATE pg_catalog."default" NOT NULL,
    subjudulbuku character varying(50) COLLATE pg_catalog."default" DEFAULT '-'::character varying,
    pengarang character(30) COLLATE pg_catalog."default" NOT NULL,
    penerbit character varying(50) COLLATE pg_catalog."default" NOT NULL,
    tahunterbit integer,
    halaman integer,
    isbn character varying COLLATE pg_catalog."default",
    kategori character varying(25) COLLATE pg_catalog."default",
    CONSTRAINT "Buku_pkey" PRIMARY KEY (kodebuku)
);

CREATE TABLE IF NOT EXISTS public.peminjamanbuku
(
    kodepinjamb character varying(6) COLLATE pg_catalog."default" NOT NULL,
    kodebuku character varying(4) COLLATE pg_catalog."default" NOT NULL,
    nama character varying(20) COLLATE pg_catalog."default",
    nim character varying(14) COLLATE pg_catalog."default",
    angkatan integer,
    tglpinjam date,
    tglbalik date,
    status character varying COLLATE pg_catalog."default",
    CONSTRAINT peminjamanbuku_pkey PRIMARY KEY (kodepinjamb)
);

CREATE TABLE IF NOT EXISTS public.peminjamanskripsi
(
    kodepinjams character varying(6) COLLATE pg_catalog."default" NOT NULL,
    kodeskripsi character varying(4) COLLATE pg_catalog."default" NOT NULL,
    nama character varying(20) COLLATE pg_catalog."default",
    nim character varying(14) COLLATE pg_catalog."default",
    angkatan integer,
    tglpinjam date,
    tglbalik date,
    status character varying COLLATE pg_catalog."default",
    CONSTRAINT peminjamanskripsi_pkey PRIMARY KEY (kodepinjams)
);

CREATE TABLE IF NOT EXISTS public.petugas
(
    username character varying(20) COLLATE pg_catalog."default" NOT NULL,
    fullname character(30) COLLATE pg_catalog."default",
    password character varying(20) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT "Petugas_pkey" PRIMARY KEY (username)
);

CREATE TABLE IF NOT EXISTS public.skripsi
(
    kodeskripsi character varying(4) COLLATE pg_catalog."default" NOT NULL,
    judulskripsi character varying(50) COLLATE pg_catalog."default" NOT NULL,
    penulis character(30) COLLATE pg_catalog."default" NOT NULL,
    tahun integer,
    halaman integer,
    CONSTRAINT "Skripsi_pkey" PRIMARY KEY (kodeskripsi)
);

ALTER TABLE IF EXISTS public.peminjamanbuku
    ADD CONSTRAINT kode_buku FOREIGN KEY (kodebuku)
    REFERENCES public.buku (kodebuku) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION
    NOT VALID;

ALTER TABLE IF EXISTS public.peminjamanskripsi
    ADD CONSTRAINT kode_skripsi FOREIGN KEY (kodeskripsi)
    REFERENCES public.skripsi (kodeskripsi) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION;

END;