-- MySQL dump 10.13  Distrib 5.7.17, for macos10.12 (x86_64)
--
-- Host: localhost    Database: miBarrio
-- ------------------------------------------------------
-- Server version	5.7.26

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Usuarios`
--

DROP TABLE IF EXISTS `Usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Usuarios` (
  `idUsuarios` int(11) NOT NULL AUTO_INCREMENT,
  `nombres` varchar(45) NOT NULL,
  `apellidos` varchar(45) NOT NULL,
  `tipoUsuario` varchar(45) NOT NULL,
  `tipoDocumento` varchar(45) DEFAULT NULL,
  `documento` varchar(45) DEFAULT NULL,
  `telefono` varchar(45) DEFAULT NULL,
  `direccion` varchar(45) DEFAULT NULL,
  `correo` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idUsuarios`),
  UNIQUE KEY `idUsuarios_UNIQUE` (`idUsuarios`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Usuarios`
--

LOCK TABLES `Usuarios` WRITE;
/*!40000 ALTER TABLE `Usuarios` DISABLE KEYS */;
INSERT INTO `Usuarios` VALUES (1,'Federico','Rozo Murcia','empleado','Cedula de ciudadania','81003223','6018767456','carrera 2b # 12 - 02','gato23@gmail.com'),(2,'Carolina','Rozo Murcia','empleado','Cedula de ciudadania','20543678','6018767456','carrera 2b # 12 - 02','carito@gmail.com'),(3,'Carlos','Cantor','proveedor','Cedula de ciudadania','2984765','3209845734','Calle laverde','Cantor@gmail.com'),(4,'camila','castro','cliente','cc','345879','345890234','calle 23 # 24 - 43','cami-castro@gmail.com'),(5,'Danilo','Navas','cliente','cc','10935893','321897479','calle 8 # 11 - 48','daniloco@gmail.com'),(6,'Camilo','Murcia','empleado','Cedula de ciudadania','78476384','3209845753','calle 11 # 5a 23','cami@gmail.com'),(7,'Gloria','Murcia','empleado','Cedula de ciudadania','8947284','3209841245','Calle 5 # 2 -89','Loria@gmail.com'),(8,'Carmen','Delgado','empleado','Cedula de ciudadania','984763456','3209847615','calle24 # 12 - 40','Caemen@gmail.com'),(9,'Jose','Murcia','Empleado','Cedula de ciudadania','89034726','3202187462','calle 2 # 18 - 23','jose@gmail.com'),(11,'diego','Pardo','Cliente','Cedula de ciudadania','8975654','9807645','Calle Porton','Pardo@gmail.com'),(12,'Jaime','Montoya','Cliente','Cedula de ciudadania','2874694','32067498376','Calle Porton','Montoya@gmail.com'),(13,'Diego','Pardo','Cliente','Cedula de ciudadania','298476354','3209846534','Calle Porton','Diego@gmail.com'),(14,'Andr??s','Mojica','Cliente','Cedula de ciudadania','12387645','984763','Calle Calamidad','Mojica@gmail.com'),(15,'Danilo','Navas','Cliente','Cedula de ciudadania','98708976','3209878763','Camellos del abra','Danilo@gmail.com'),(16,'Dario','Cano','Proveedor','Cedula de ciudadania','398476384','32098874638','Calle 26s # 25 a12','Cano@gmail.com'),(17,'Jorge','Huiza','Empleado','Cedula de ciudadania','1298765489','2387469','calle 24 # 23 - 2','HomeroHuiza@gmail.com');
/*!40000 ALTER TABLE `Usuarios` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-10-05 17:44:18
