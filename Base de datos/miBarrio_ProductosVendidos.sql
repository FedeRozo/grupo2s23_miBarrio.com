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
-- Table structure for table `ProductosVendidos`
--

DROP TABLE IF EXISTS `ProductosVendidos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ProductosVendidos` (
  `idProductosVendidos` int(11) NOT NULL AUTO_INCREMENT,
  `idVentasProducto` int(11) NOT NULL,
  `idProductoVentas` int(11) NOT NULL,
  `cantidadVendida` int(11) NOT NULL,
  `costoVenta` double NOT NULL,
  `costoCompra` double NOT NULL,
  `totalIva` double NOT NULL,
  `FechaVenta` datetime NOT NULL,
  PRIMARY KEY (`idProductosVendidos`),
  UNIQUE KEY `idProductosVendidos_UNIQUE` (`idProductosVendidos`),
  KEY `FacturaVenta_idx` (`idVentasProducto`),
  KEY `ProductoVendido_idx` (`idProductoVentas`),
  CONSTRAINT `FacturaVenta` FOREIGN KEY (`idVentasProducto`) REFERENCES `Ventas` (`idVentas`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `ProductoVendido` FOREIGN KEY (`idProductoVentas`) REFERENCES `Productos` (`idProducto`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ProductosVendidos`
--

LOCK TABLES `ProductosVendidos` WRITE;
/*!40000 ALTER TABLE `ProductosVendidos` DISABLE KEYS */;
/*!40000 ALTER TABLE `ProductosVendidos` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-09-25 14:23:03
