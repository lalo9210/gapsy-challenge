CREATE DATABASE `ehg_gapsy_challenge` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

CREATE USER 'ehg_challenge_gapsy_usr'@'%';
SET PASSWORD FOR 'ehg_challenge_gapsy_usr'@'%' = PASSWORD('ehg_challenge_gapsy_usr');
GRANT Alter ON ehg_gapsy_challenge.* TO 'ehg_challenge_gapsy_usr'@'%';
GRANT Create ON ehg_gapsy_challenge.* TO 'ehg_challenge_gapsy_usr'@'%';
GRANT Create view ON ehg_gapsy_challenge.* TO 'ehg_challenge_gapsy_usr'@'%';
GRANT Delete ON ehg_gapsy_challenge.* TO 'ehg_challenge_gapsy_usr'@'%';
GRANT Delete history ON ehg_gapsy_challenge.* TO 'ehg_challenge_gapsy_usr'@'%';
GRANT Drop ON ehg_gapsy_challenge.* TO 'ehg_challenge_gapsy_usr'@'%';
GRANT Grant option ON ehg_gapsy_challenge.* TO 'ehg_challenge_gapsy_usr'@'%';
GRANT Index ON ehg_gapsy_challenge.* TO 'ehg_challenge_gapsy_usr'@'%';
GRANT Insert ON ehg_gapsy_challenge.* TO 'ehg_challenge_gapsy_usr'@'%';
GRANT References ON ehg_gapsy_challenge.* TO 'ehg_challenge_gapsy_usr'@'%';
GRANT Select ON ehg_gapsy_challenge.* TO 'ehg_challenge_gapsy_usr'@'%';
GRANT Show view ON ehg_gapsy_challenge.* TO 'ehg_challenge_gapsy_usr'@'%';
GRANT Trigger ON ehg_gapsy_challenge.* TO 'ehg_challenge_gapsy_usr'@'%';
GRANT Update ON ehg_gapsy_challenge.* TO 'ehg_challenge_gapsy_usr'@'%';

CREATE TABLE `producto` (
  `id_articulo` varchar(10) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `descripcion` varchar(200) NOT NULL,
  `precio` decimal(10,2) NOT NULL,
  `modelo` varchar(10) NOT NULL,
  PRIMARY KEY (`id_articulo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO ehg_gapsy_challenge.producto (id_articulo, nombre, descripcion, precio, modelo) 
VALUES('SKU0000001', 'Libreta tipo frances', 'Libreta tipo francesa con pasta dura', 10.99, 'AZULP');
INSERT INTO ehg_gapsy_challenge.producto (id_articulo, nombre, descripcion, precio, modelo) 
VALUES('SKU0000002', 'Calculadora digital', 'Calculadora digital con operaciones basicas', 29.99, 'CALC001');