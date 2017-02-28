CREATE database `matricula`;

use `matricula`;

CREATE TABLE ESTUDIANTE (
CEDULA VARCHAR(12) NOT NULL,
PASSWORD VARCHAR(255) NOT NULL,
TIPO INT NOT NULL,
NOMBRE VARCHAR(255) NOT NULL,
F_NACIMIENTO VARCHAR(255),
CORREO VARCHAR(255) NOT NULL,
TELEFONO INT NOT NULL,
COD_CARRERA VARCHAR(12) NOT NULL,
CONSTRAINT PK_ESTUDIANTE PRIMARY KEY (CEDULA)
);

CREATE TABLE CARRERA (
CODIGO VARCHAR(12) NOT NULL,
NOMBRE VARCHAR(255) NOT NULL,
constraint pk_codigo_carrera primary key(CODIGO)
);

CREATE TABLE CURSO (
CODIGO VARCHAR(12) NOT NULL,
NOMBRE VARCHAR(255),
CREDITOS INT,
H_SEMANALES INT,
COD_CARRERA VARCHAR(12),
NUM_CICLO INT NOT NULL,
constraint COD_CARRERA foreign key (COD_CARRERA) references CARRERA (CODIGO),
constraint pk_codigo_curso PRIMARY KEY (CODIGO)
);

CREATE TABLE GRUPO (
NUMERO INT NOT NULL,
ID_PROF VARCHAR(12),
COD_CURSO VARCHAR(12),
constraint COD_CURSO foreign key (COD_CURSO) references CURSO (CODIGO),
constraint ID_PROF foreign key (ID_PROF) references PROFESOR (CEDULA)
);

CREATE TABLE CICLO (
ID INT NOT NULL,
ANNO INT NOT NULL,
NUM_CICLO INT NOT NULL,
FECHA_INICIO VARCHAR(10),
FECHA_FINAL VARCHAR(10),
CONSTRAINT PK_CICLO PRIMARY KEY (ID)
);


INSERT INTO USUARIO(USER,PASSWORD,TIPO) VALUES ('1','1',1);

INSERT INTO ADMINISTRADOR (CEDULA,NOMBRE,CORREO,TELEFONO) VALUES('1','ROOT','@ ',855);

