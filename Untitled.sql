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
-- Table structure for table `Clientes`
--

DROP TABLE IF EXISTS `Clientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Clientes` (
  `idClientes` int(11) NOT NULL AUTO_INCREMENT,
  `idUsuarioCliente` int(11) NOT NULL,
  `credito` varchar(4) NOT NULL,
  `estadoCliente` varchar(45) NOT NULL,
  PRIMARY KEY (`idClientes`),
  UNIQUE KEY `idClientes_UNIQUE` (`idClientes`),
  KEY `UsuariCliente_idx` (`idUsuarioCliente`),
  CONSTRAINT `UsuariCliente` FOREIGN KEY (`idUsuarioCliente`) REFERENCES `Usuarios` (`idUsuarios`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Clientes`
--

LOCK TABLES `Clientes` WRITE;
/*!40000 ALTER TABLE `Clientes` DISABLE KEYS */;
INSERT INTO `Clientes` VALUES (1,4,'0','activo'),(2,15,'Si','Activo');
/*!40000 ALTER TABLE `Clientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Compras`
--

DROP TABLE IF EXISTS `Compras`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Compras` (
  `idCompras` int(11) NOT NULL AUTO_INCREMENT,
  `idEmpleadoCompras` int(11) NOT NULL,
  `IdEntradaCompras` int(11) NOT NULL,
  `idProveedorCompras` int(11) NOT NULL,
  `pago` double NOT NULL,
  `formaPago` varchar(45) NOT NULL,
  `fechaCompra` datetime NOT NULL,
  PRIMARY KEY (`idCompras`),
  UNIQUE KEY `idCompras_UNIQUE` (`idCompras`),
  KEY `EmpladoCompra_idx` (`idEmpleadoCompras`),
  KEY `CompraProveedor_idx` (`idProveedorCompras`),
  CONSTRAINT `CompraProveedor` FOREIGN KEY (`idProveedorCompras`) REFERENCES `Proveedores` (`idProveedores`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `EmpladoCompra` FOREIGN KEY (`idEmpleadoCompras`) REFERENCES `Empleados` (`idEmpleados`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Compras`
--

LOCK TABLES `Compras` WRITE;
/*!40000 ALTER TABLE `Compras` DISABLE KEYS */;
/*!40000 ALTER TABLE `Compras` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Empleados`
--

DROP TABLE IF EXISTS `Empleados`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Empleados` (
  `idEmpleados` int(11) NOT NULL AUTO_INCREMENT,
  `salario` double NOT NULL,
  `idUsuarioEmpleado` int(11) NOT NULL,
  `fechaIngreso` varchar(20) DEFAULT NULL,
  `estadoEmpleado` varchar(45) NOT NULL,
  `cargo` varchar(45) NOT NULL,
  `usuario` varchar(45) NOT NULL,
  `clave` varchar(10) NOT NULL,
  `fechaEgreso` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`idEmpleados`),
  UNIQUE KEY `idVendedor_UNIQUE` (`idEmpleados`),
  KEY `UsuarioVendedor_idx` (`idUsuarioEmpleado`),
  CONSTRAINT `UsuarioVendedor` FOREIGN KEY (`idUsuarioEmpleado`) REFERENCES `Usuarios` (`idUsuarios`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Empleados`
--

LOCK TABLES `Empleados` WRITE;
/*!40000 ALTER TABLE `Empleados` DISABLE KEYS */;
INSERT INTO `Empleados` VALUES (2,1200000,1,'1900-01-01','Activo','Administrador','FedeR','1234fe','1900-01-01'),(3,1200000,2,'1900-01-01','Activo','Vendedor','Carol','1134Ca','1900-01-01'),(4,1000000,8,'1900-01-01','Activo','Vendedor','CarDel','123456','1900-01-01'),(5,1200000,9,'1900-01-01','Activo','Almacenista','Jose','123489','1900-01-01'),(6,1000000,17,'1900-01-01','Activo','Almacenista','Homero','123457','1900-01-01');
/*!40000 ALTER TABLE `Empleados` ENABLE KEYS */;
UNLOCK TABLES;

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
  CONSTRAINT `EntradaProducto` FOREIGN KEY (`idProductoEntrada`) REFERENCES `Productos` (`idProductos`) ON DELETE NO ACTION ON UPDATE NO ACTION,
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

--
-- Table structure for table `Productos`
--

DROP TABLE IF EXISTS `Productos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Productos` (
  `idProductos` int(11) NOT NULL AUTO_INCREMENT,
  `idProveedorProducto` int(11) NOT NULL,
  `codigoProducto` varchar(45) DEFAULT NULL,
  `nombreProducto` varchar(45) NOT NULL,
  `presentacion` varchar(45) NOT NULL,
  `tipoProducto` varchar(45) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `cantidadMinima` int(11) NOT NULL,
  `precioCompra` double NOT NULL,
  `precioVenta` double NOT NULL,
  `estadoProducto` varchar(45) NOT NULL,
  `iva` double NOT NULL,
  PRIMARY KEY (`idProductos`),
  UNIQUE KEY `idProducto_UNIQUE` (`idProductos`),
  KEY `ProveedorProducto_idx` (`idProveedorProducto`),
  CONSTRAINT `ProveedorProducto` FOREIGN KEY (`idProveedorProducto`) REFERENCES `Proveedores` (`idProveedores`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Productos`
--

LOCK TABLES `Productos` WRITE;
/*!40000 ALTER TABLE `Productos` DISABLE KEYS */;
INSERT INTO `Productos` VALUES (1,1,'770315629302','CocaCola','350ml','gaseosa',60,30,1000,1200,'activo',0.16),(2,1,'770315629310','quatro','350ml','gaseosa',60,30,1000,1200,'activo',0.16),(3,1,'770315629320','sprite','350ml','gaseosa',60,30,1000,1200,'activo',0.16),(4,1,'770315639450','Cocacola','1 1/2 L','gaseosa',60,30,3000,3500,'activo',0.16),(5,1,'770315639412','quatro','1 1/2 L','gaseosa',10,10,3000,3500,'activo',0.16);
/*!40000 ALTER TABLE `Productos` ENABLE KEYS */;
UNLOCK TABLES;

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
  CONSTRAINT `ProductoVendido` FOREIGN KEY (`idProductoVentas`) REFERENCES `Productos` (`idProductos`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ProductosVendidos`
--

LOCK TABLES `ProductosVendidos` WRITE;
/*!40000 ALTER TABLE `ProductosVendidos` DISABLE KEYS */;
/*!40000 ALTER TABLE `ProductosVendidos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Proveedores`
--

DROP TABLE IF EXISTS `Proveedores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Proveedores` (
  `idProveedores` int(11) NOT NULL AUTO_INCREMENT,
  `idUsuarioProveedor` int(11) NOT NULL,
  `empresa` varchar(45) NOT NULL,
  `estadoProveedor` varchar(45) NOT NULL,
  `nitEmpresa` varchar(45) NOT NULL,
  `telefonoEmpresa` varchar(45) NOT NULL,
  `direccionEmpresa` varchar(45) DEFAULT NULL,
  `correoEmpresa` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idProveedores`),
  UNIQUE KEY `idProveedor_UNIQUE` (`idProveedores`),
  KEY `UsuarioProveedor_idx` (`idUsuarioProveedor`),
  CONSTRAINT `UsuarioProveedor` FOREIGN KEY (`idUsuarioProveedor`) REFERENCES `Usuarios` (`idUsuarios`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Proveedores`
--

LOCK TABLES `Proveedores` WRITE;
/*!40000 ALTER TABLE `Proveedores` DISABLE KEYS */;
INSERT INTO `Proveedores` VALUES (1,3,'cocacola','activo','234894789','6018746837','calle 26 # 103 - 23','ventas@cocacola.com'),(2,16,'Grasas s.a.','Activo','3198347734','3098746284','clle13 23 - 72','Ventas@Grasas.co');
/*!40000 ALTER TABLE `Proveedores` ENABLE KEYS */;
UNLOCK TABLES;

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
INSERT INTO `Usuarios` VALUES (1,'Federico','Rozo Murcia','empleado','Cedula de ciudadania','81003223','6018767456','carrera 2b # 12 - 02','gato23@gmail.com'),(2,'Carolina','Rozo Murcia','empleado','Cedula de ciudadania','20543678','6018767456','carrera 2b # 12 - 02','carito@gmail.com'),(3,'Carlos','Cantor','proveedor','Cedula de ciudadania','2984765','3209845734','Calle laverde','Cantor@gmail.com'),(4,'camila','castro','cliente','cc','345879','345890234','calle 23 # 24 - 43','cami-castro@gmail.com'),(5,'Danilo','Navas','cliente','cc','10935893','321897479','calle 8 # 11 - 48','daniloco@gmail.com'),(6,'Camilo','Murcia','empleado','Cedula de ciudadania','78476384','3209845753','calle 11 # 5a 23','cami@gmail.com'),(7,'Gloria','Murcia','empleado','Cedula de ciudadania','8947284','3209841245','Calle 5 # 2 -89','Loria@gmail.com'),(8,'Carmen','Delgado','empleado','Cedula de ciudadania','984763456','3209847615','calle24 # 12 - 40','Caemen@gmail.com'),(9,'Jose','Murcia','Empleado','Cedula de ciudadania','89034726','3202187462','calle 2 # 18 - 23','jose@gmail.com'),(11,'diego','Pardo','Cliente','Cedula de ciudadania','8975654','9807645','Calle Porton','Pardo@gmail.com'),(12,'Jaime','Montoya','Cliente','Cedula de ciudadania','2874694','32067498376','Calle Porton','Montoya@gmail.com'),(13,'Diego','Pardo','Cliente','Cedula de ciudadania','298476354','3209846534','Calle Porton','Diego@gmail.com'),(14,'Andrés','Mojica','Cliente','Cedula de ciudadania','12387645','984763','Calle Calamidad','Mojica@gmail.com'),(15,'Danilo','Navas','Cliente','Cedula de ciudadania','98708976','3209878763','Camellos del abra','Danilo@gmail.com'),(16,'Dario','Cano','Proveedor','Cedula de ciudadania','398476384','32098874638','Calle 26s # 25 a12','Cano@gmail.com'),(17,'Jorge','Huiza','Empleado','Cedula de ciudadania','1298765489','2387469','calle 24 # 23 - 2','HomeroHuiza@gmail.com');
/*!40000 ALTER TABLE `Usuarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Ventas`
--

DROP TABLE IF EXISTS `Ventas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Ventas` (
  `idVentas` int(11) NOT NULL AUTO_INCREMENT,
  `idVendevorVenta` int(11) NOT NULL,
  `fechaVenta` datetime NOT NULL,
  `idClienteVenta` int(11) NOT NULL,
  `totalVenta` double NOT NULL,
  `totalIva` double NOT NULL,
  `estadoVenta` varchar(45) NOT NULL,
  PRIMARY KEY (`idVentas`),
  UNIQUE KEY `idFactura_UNIQUE` (`idVentas`),
  KEY `VentasVendedor_idx` (`idVendevorVenta`),
  KEY `ClienteVentas_idx` (`idClienteVenta`),
  CONSTRAINT `ClienteVentas` FOREIGN KEY (`idClienteVenta`) REFERENCES `Clientes` (`idClientes`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `VentasVendedor` FOREIGN KEY (`idVendevorVenta`) REFERENCES `Empleados` (`idEmpleados`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Ventas`
--

LOCK TABLES `Ventas` WRITE;
/*!40000 ALTER TABLE `Ventas` DISABLE KEYS */;
/*!40000 ALTER TABLE `Ventas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `vistaclientes`
--

DROP TABLE IF EXISTS `vistaclientes`;
/*!50001 DROP VIEW IF EXISTS `vistaclientes`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `vistaclientes` AS SELECT 
 1 AS `idClientes`,
 1 AS `idUsuarioCliente`,
 1 AS `credito`,
 1 AS `estadoCliente`,
 1 AS `idUsuarios`,
 1 AS `nombres`,
 1 AS `apellidos`,
 1 AS `tipoUsuario`,
 1 AS `tipoDocumento`,
 1 AS `documento`,
 1 AS `telefono`,
 1 AS `direccion`,
 1 AS `correo`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `vistaempleados`
--

DROP TABLE IF EXISTS `vistaempleados`;
/*!50001 DROP VIEW IF EXISTS `vistaempleados`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `vistaempleados` AS SELECT 
 1 AS `idEmpleados`,
 1 AS `salario`,
 1 AS `idUsuarioEmpleado`,
 1 AS `fechaIngreso`,
 1 AS `estadoEmpleado`,
 1 AS `cargo`,
 1 AS `usuario`,
 1 AS `clave`,
 1 AS `fechaEgreso`,
 1 AS `idUsuarios`,
 1 AS `nombres`,
 1 AS `apellidos`,
 1 AS `tipoUsuario`,
 1 AS `tipoDocumento`,
 1 AS `documento`,
 1 AS `telefono`,
 1 AS `direccion`,
 1 AS `correo`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `vistaproductos`
--

DROP TABLE IF EXISTS `vistaproductos`;
/*!50001 DROP VIEW IF EXISTS `vistaproductos`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `vistaproductos` AS SELECT 
 1 AS `idProductos`,
 1 AS `idProveedorProducto`,
 1 AS `codigoProducto`,
 1 AS `nombreProducto`,
 1 AS `presentacion`,
 1 AS `tipoProducto`,
 1 AS `cantidad`,
 1 AS `cantidadMinima`,
 1 AS `precioCompra`,
 1 AS `precioVenta`,
 1 AS `estadoProducto`,
 1 AS `iva`,
 1 AS `idProveedores`,
 1 AS `idUsuarioProveedor`,
 1 AS `empresa`,
 1 AS `estadoProveedor`,
 1 AS `nitEmpresa`,
 1 AS `telefonoEmpresa`,
 1 AS `direccionEmpresa`,
 1 AS `correoEmpresa`,
 1 AS `idUsuarios`,
 1 AS `nombres`,
 1 AS `apellidos`,
 1 AS `tipoUsuario`,
 1 AS `tipoDocumento`,
 1 AS `documento`,
 1 AS `telefono`,
 1 AS `direccion`,
 1 AS `correo`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `vistaproveedor`
--

DROP TABLE IF EXISTS `vistaproveedor`;
/*!50001 DROP VIEW IF EXISTS `vistaproveedor`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `vistaproveedor` AS SELECT 
 1 AS `idProveedores`,
 1 AS `idUsuarioProveedor`,
 1 AS `empresa`,
 1 AS `estadoProveedor`,
 1 AS `nitEmpresa`,
 1 AS `telefonoEmpresa`,
 1 AS `direccionEmpresa`,
 1 AS `correoEmpresa`,
 1 AS `idUsuarios`,
 1 AS `nombres`,
 1 AS `apellidos`,
 1 AS `tipoUsuario`,
 1 AS `tipoDocumento`,
 1 AS `documento`,
 1 AS `telefono`,
 1 AS `direccion`,
 1 AS `correo`*/;
SET character_set_client = @saved_cs_client;

--
-- Final view structure for view `vistaclientes`
--

/*!50001 DROP VIEW IF EXISTS `vistaclientes`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `vistaclientes` AS select `clientes`.`idClientes` AS `idClientes`,`clientes`.`idUsuarioCliente` AS `idUsuarioCliente`,`clientes`.`credito` AS `credito`,`clientes`.`estadoCliente` AS `estadoCliente`,`usuarios`.`idUsuarios` AS `idUsuarios`,`usuarios`.`nombres` AS `nombres`,`usuarios`.`apellidos` AS `apellidos`,`usuarios`.`tipoUsuario` AS `tipoUsuario`,`usuarios`.`tipoDocumento` AS `tipoDocumento`,`usuarios`.`documento` AS `documento`,`usuarios`.`telefono` AS `telefono`,`usuarios`.`direccion` AS `direccion`,`usuarios`.`correo` AS `correo` from (`clientes` join `usuarios` on((`clientes`.`idUsuarioCliente` = `usuarios`.`idUsuarios`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `vistaempleados`
--

/*!50001 DROP VIEW IF EXISTS `vistaempleados`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `vistaempleados` AS select `empleados`.`idEmpleados` AS `idEmpleados`,`empleados`.`salario` AS `salario`,`empleados`.`idUsuarioEmpleado` AS `idUsuarioEmpleado`,`empleados`.`fechaIngreso` AS `fechaIngreso`,`empleados`.`estadoEmpleado` AS `estadoEmpleado`,`empleados`.`cargo` AS `cargo`,`empleados`.`usuario` AS `usuario`,`empleados`.`clave` AS `clave`,`empleados`.`fechaEgreso` AS `fechaEgreso`,`usuarios`.`idUsuarios` AS `idUsuarios`,`usuarios`.`nombres` AS `nombres`,`usuarios`.`apellidos` AS `apellidos`,`usuarios`.`tipoUsuario` AS `tipoUsuario`,`usuarios`.`tipoDocumento` AS `tipoDocumento`,`usuarios`.`documento` AS `documento`,`usuarios`.`telefono` AS `telefono`,`usuarios`.`direccion` AS `direccion`,`usuarios`.`correo` AS `correo` from (`empleados` join `usuarios` on((`empleados`.`idUsuarioEmpleado` = `usuarios`.`idUsuarios`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `vistaproductos`
--

/*!50001 DROP VIEW IF EXISTS `vistaproductos`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `vistaproductos` AS select `productos`.`idProductos` AS `idProductos`,`productos`.`idProveedorProducto` AS `idProveedorProducto`,`productos`.`codigoProducto` AS `codigoProducto`,`productos`.`nombreProducto` AS `nombreProducto`,`productos`.`presentacion` AS `presentacion`,`productos`.`tipoProducto` AS `tipoProducto`,`productos`.`cantidad` AS `cantidad`,`productos`.`cantidadMinima` AS `cantidadMinima`,`productos`.`precioCompra` AS `precioCompra`,`productos`.`precioVenta` AS `precioVenta`,`productos`.`estadoProducto` AS `estadoProducto`,`productos`.`iva` AS `iva`,`proveedores`.`idProveedores` AS `idProveedores`,`proveedores`.`idUsuarioProveedor` AS `idUsuarioProveedor`,`proveedores`.`empresa` AS `empresa`,`proveedores`.`estadoProveedor` AS `estadoProveedor`,`proveedores`.`nitEmpresa` AS `nitEmpresa`,`proveedores`.`telefonoEmpresa` AS `telefonoEmpresa`,`proveedores`.`direccionEmpresa` AS `direccionEmpresa`,`proveedores`.`correoEmpresa` AS `correoEmpresa`,`usuarios`.`idUsuarios` AS `idUsuarios`,`usuarios`.`nombres` AS `nombres`,`usuarios`.`apellidos` AS `apellidos`,`usuarios`.`tipoUsuario` AS `tipoUsuario`,`usuarios`.`tipoDocumento` AS `tipoDocumento`,`usuarios`.`documento` AS `documento`,`usuarios`.`telefono` AS `telefono`,`usuarios`.`direccion` AS `direccion`,`usuarios`.`correo` AS `correo` from ((`productos` join `proveedores` on((`productos`.`idProveedorProducto` = `proveedores`.`idProveedores`))) join `usuarios` on((`proveedores`.`idUsuarioProveedor` = `usuarios`.`idUsuarios`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `vistaproveedor`
--

/*!50001 DROP VIEW IF EXISTS `vistaproveedor`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `vistaproveedor` AS select `proveedores`.`idProveedores` AS `idProveedores`,`proveedores`.`idUsuarioProveedor` AS `idUsuarioProveedor`,`proveedores`.`empresa` AS `empresa`,`proveedores`.`estadoProveedor` AS `estadoProveedor`,`proveedores`.`nitEmpresa` AS `nitEmpresa`,`proveedores`.`telefonoEmpresa` AS `telefonoEmpresa`,`proveedores`.`direccionEmpresa` AS `direccionEmpresa`,`proveedores`.`correoEmpresa` AS `correoEmpresa`,`usuarios`.`idUsuarios` AS `idUsuarios`,`usuarios`.`nombres` AS `nombres`,`usuarios`.`apellidos` AS `apellidos`,`usuarios`.`tipoUsuario` AS `tipoUsuario`,`usuarios`.`tipoDocumento` AS `tipoDocumento`,`usuarios`.`documento` AS `documento`,`usuarios`.`telefono` AS `telefono`,`usuarios`.`direccion` AS `direccion`,`usuarios`.`correo` AS `correo` from (`proveedores` join `usuarios` on((`proveedores`.`idUsuarioProveedor` = `usuarios`.`idUsuarios`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-10-05 17:45:10
