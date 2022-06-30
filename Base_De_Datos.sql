/*Crear la base de datos directorio*/
CREATE DATABASE directorio;

/*Crear la tabla usuarios*/
CREATE TABLE usuarios(
	documento nvarchar(30) NOT NULL, 
	usuario nvarchar(15) NOT NULL, 
	clave nvarchar(15) NOT NULL, 
	fechaCreacion int NOT NULL, 
	fechaActualizacion char(1) NOT NULL, 
	activo bit NOT NULL, 
	primary key(documento)
);

/*Crear la tabla*/
CREATE TABLE datosPersonales(
	documento nvarchar(30) NOT NULL,
	nombreCompleto nvarchar(30) NOT NULL, 
	direccion nvarchar(50) NOT NULL, 
	ciudad nvarchar(50) NOT NULL,
	barrio nvarchar(30) NOT NULL,
	genero nvarchar(1) NOT NULL,
	fechaNacimiento date NOT NULL, 
	ciudadNacimiento nvarchar(50) NOT NULL,
	paisNacimiento nvarchar(30) NOT NULL,
	telefono nvarchar(15) NOT NULL,
	telefonoEmergencia nvarchar(15) NOT NULL,
	codPais nvarchar(5) NOT NULL,
	activo bit NOT NULL,
	primary key(documento)
);

INSERT INTO datosPesonales VALUES('000','sebastian pabon lopez','Calle 80 N° 69B - 07','Bogotá','Kennedy','M','2001-06-13','Bogotá','Colombia','3223142488','57',1);