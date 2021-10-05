<%@page import="TO.TOUsuarios"%>
<%@page import="TO.TOProveedores"%>
<%@page import="controller.CtrProveedores"%>
<%@page import="com.google.gson.Gson"%>
<%@page import="java.util.ArrayList"%>
<% CtrProveedores proveedoresCtr = new CtrProveedores();
String opcion = request.getParameter("opcion");
if ("listar".equals(opcion)){
    ArrayList<TOProveedores> proveedores = proveedoresCtr.consultarProveedores();
    out.print(new Gson().toJson(proveedores));
    
}else if("insertar".equals(opcion)){
    String proveedor = request.getParameter("data");
    TOUsuarios usuariosTo = new Gson().fromJson(proveedor, TOUsuarios.class);
    TOProveedores proveedoresTo = new Gson().fromJson(proveedor, TOProveedores.class);
    proveedoresCtr.insertarProveedores(usuariosTo, proveedoresTo);
}else if("actualizar".equals(opcion)){
    String datos = request.getParameter("data");
    TOUsuarios usuariosTo = new Gson().fromJson(datos, TOUsuarios.class);
    TOProveedores proveedoresTo = new Gson().fromJson(datos, TOProveedores.class);
    proveedoresCtr.modificarProveedor(usuariosTo, proveedoresTo);
}else if("eliminar".equals(opcion)){
    String datos = request.getParameter("data");
    TOProveedores proveedoresTo = new Gson().fromJson(datos, TOProveedores.class);
    proveedoresCtr.eliminarProveedor(proveedoresTo);
} else{
    out.print("Opcion no Valida");
}
%>