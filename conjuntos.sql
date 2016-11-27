CREATE DATABASE conjuntos;

CREATE TABLE casas(
	id SERIAL PRIMARY KEY NOT NULL,
	direccion VARCHAR(30) NOT NULL,
	valor_administracion INTEGER NOT NULL
);

CREATE TABLE propietarios(
	cedula VARCHAR(11) PRIMARY KEY NOT NULL,
	primer_nombre VARCHAR(15) NOT NULL,
	segundo_nombre VARCHAR(15) DEFAULT '---',
	primer_apellido VARCHAR(15) NOT NULL,
	segundo_apellido VARCHAR(15) DEFAULT '---',
	correo VARCHAR(40)
);

CREATE TABLE telefonos_propietarios(
	id SERIAL PRIMARY KEY NOT NULL,
	telefono VARCHAR(11) NOT NULL,
	propietario_id VARCHAR(11) NOT NULL REFERENCES propietarios(cedula)
);

CREATE TABLE casas_propietarios(
	fecha_asignacion DATE NOT NULL,
	casa_id INTEGER NOT NULL REFERENCES casas(id),
	propietario_id VARCHAR(11) NOT NULL REFERENCES propietarios(cedula),
	PRIMARY KEY (casa_id,propietario_id)
);

CREATE TABLE carteras(
	id SERIAL PRIMARY KEY NOT NULL,
	periodo VARCHAR (10) NOT NULL,
	fecha_causacion DATE NOT NULL,
	pago_oportuno DATE NOT NULL,
	intereses FLOAT NOT NULL,
	casa_id INTEGER NOT NULL REFERENCES casas(id)
);

CREATE TABLE facturas(
	id SERIAL PRIMARY KEY NOT NULL,
	total INTEGER NOT NULL,
	cartera_id INTEGER NOT NULL REFERENCES carteras(id)
);

#tabla de usurios que tienen acceso al sistema#

CREATE TABLE usurios(
	id serial PRIMARY KEY NOT NULL,
	nombre VARCHAR (20) NOT NULL,
	pass VARCHAR (20) NOT NULL
);

INSERT INTO usurios (nombre,pass)
VALUES
	('admin','123456');