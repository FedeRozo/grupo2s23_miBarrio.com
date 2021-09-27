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
-- Table structure for table `Entradas`
--

DROP TABLE IF EXISTS `Entradas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Entradas` (
  `idEntradas` int(11) NOT NULL AUTO_INCREMENT,
  `idProductoEntrada` int(11) NOT NULL,
  `idCompraEntrada` int(11) NOT NULL,
  `cantidadEntrada` int(11) NOT NULL,
  `precioEntrada` double NOT NULL,
  PRIMARY KEY (`idEntradas`),
  UNIQUE KEY `idEntradas_UNIQUE` (`idEntradas`),
  KEY `EntradasCompras_idx` (`idCompraEntrada`),
  KEY `EntradaProducto_idx` (`idProductoEntrada`),
  CONSTRAINT `EntradaProducto` FOREIGN KEY (`idProductoEntrada`) REFERENCES `Productos` (`idProducto`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `EntradasCompras` FOREIGN KEY (`idCompraEntrada`) REFERENCES `Compras` (`idCompras`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Entradas`
--

LOCK TABLES `Entradas` WRITE;
/*!40000 ALTER TABLE `Entradas` DISABLE KEYS */;
/*!40000 ALTER TABLE `Entradas` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-09-26 20:04:51
