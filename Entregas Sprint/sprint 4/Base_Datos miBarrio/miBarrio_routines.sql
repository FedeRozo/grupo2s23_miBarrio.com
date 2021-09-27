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
-- Temporary view structure for view `vistaproducto`
--

DROP TABLE IF EXISTS `vistaproducto`;
/*!50001 DROP VIEW IF EXISTS `vistaproducto`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `vistaproducto` AS SELECT 
 1 AS `idProducto`,
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
 1 AS `idProveedor`,
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
 1 AS `idEmpleado`,
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
-- Temporary view structure for view `vistaproveedor`
--

DROP TABLE IF EXISTS `vistaproveedor`;
/*!50001 DROP VIEW IF EXISTS `vistaproveedor`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `vistaproveedor` AS SELECT 
 1 AS `idProveedor`,
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
-- Final view structure for view `vistaproducto`
--

/*!50001 DROP VIEW IF EXISTS `vistaproducto`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `vistaproducto` AS select `productos`.`idProducto` AS `idProducto`,`productos`.`idProveedorProducto` AS `idProveedorProducto`,`productos`.`codigoProducto` AS `codigoProducto`,`productos`.`nombreProducto` AS `nombreProducto`,`productos`.`presentacion` AS `presentacion`,`productos`.`tipoProducto` AS `tipoProducto`,`productos`.`cantidad` AS `cantidad`,`productos`.`cantidadMinima` AS `cantidadMinima`,`productos`.`precioCompra` AS `precioCompra`,`productos`.`precioVenta` AS `precioVenta`,`productos`.`estadoProducto` AS `estadoProducto`,`productos`.`iva` AS `iva`,`proveedores`.`idProveedor` AS `idProveedor`,`proveedores`.`idUsuarioProveedor` AS `idUsuarioProveedor`,`proveedores`.`empresa` AS `empresa`,`proveedores`.`estadoProveedor` AS `estadoProveedor`,`proveedores`.`nitEmpresa` AS `nitEmpresa`,`proveedores`.`telefonoEmpresa` AS `telefonoEmpresa`,`proveedores`.`direccionEmpresa` AS `direccionEmpresa`,`proveedores`.`correoEmpresa` AS `correoEmpresa`,`usuarios`.`idUsuarios` AS `idUsuarios`,`usuarios`.`nombres` AS `nombres`,`usuarios`.`apellidos` AS `apellidos`,`usuarios`.`tipoUsuario` AS `tipoUsuario`,`usuarios`.`tipoDocumento` AS `tipoDocumento`,`usuarios`.`documento` AS `documento`,`usuarios`.`telefono` AS `telefono`,`usuarios`.`direccion` AS `direccion`,`usuarios`.`correo` AS `correo` from ((`productos` join `proveedores` on((`productos`.`idProveedorProducto` = `proveedores`.`idProveedor`))) join `usuarios` on((`proveedores`.`idUsuarioProveedor` = `usuarios`.`idUsuarios`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

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
/*!50001 VIEW `vistaempleados` AS select `empleados`.`idEmpleado` AS `idEmpleado`,`empleados`.`salario` AS `salario`,`empleados`.`idUsuarioEmpleado` AS `idUsuarioEmpleado`,`empleados`.`fechaIngreso` AS `fechaIngreso`,`empleados`.`estadoEmpleado` AS `estadoEmpleado`,`empleados`.`cargo` AS `cargo`,`empleados`.`usuario` AS `usuario`,`empleados`.`clave` AS `clave`,`empleados`.`fechaEgreso` AS `fechaEgreso`,`usuarios`.`idUsuarios` AS `idUsuarios`,`usuarios`.`nombres` AS `nombres`,`usuarios`.`apellidos` AS `apellidos`,`usuarios`.`tipoUsuario` AS `tipoUsuario`,`usuarios`.`tipoDocumento` AS `tipoDocumento`,`usuarios`.`documento` AS `documento`,`usuarios`.`telefono` AS `telefono`,`usuarios`.`direccion` AS `direccion`,`usuarios`.`correo` AS `correo` from (`empleados` join `usuarios` on((`empleados`.`idUsuarioEmpleado` = `usuarios`.`idUsuarios`))) */;
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
/*!50001 VIEW `vistaproveedor` AS select `proveedores`.`idProveedor` AS `idProveedor`,`proveedores`.`idUsuarioProveedor` AS `idUsuarioProveedor`,`proveedores`.`empresa` AS `empresa`,`proveedores`.`estadoProveedor` AS `estadoProveedor`,`proveedores`.`nitEmpresa` AS `nitEmpresa`,`proveedores`.`telefonoEmpresa` AS `telefonoEmpresa`,`proveedores`.`direccionEmpresa` AS `direccionEmpresa`,`proveedores`.`correoEmpresa` AS `correoEmpresa`,`usuarios`.`idUsuarios` AS `idUsuarios`,`usuarios`.`nombres` AS `nombres`,`usuarios`.`apellidos` AS `apellidos`,`usuarios`.`tipoUsuario` AS `tipoUsuario`,`usuarios`.`tipoDocumento` AS `tipoDocumento`,`usuarios`.`documento` AS `documento`,`usuarios`.`telefono` AS `telefono`,`usuarios`.`direccion` AS `direccion`,`usuarios`.`correo` AS `correo` from (`proveedores` join `usuarios` on((`proveedores`.`idUsuarioProveedor` = `usuarios`.`idUsuarios`))) */;
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

-- Dump completed on 2021-09-26 20:04:51
