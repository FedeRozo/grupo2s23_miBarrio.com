<%@page import="TO.TOProductos"%>
<%@page import="controller.CtrProductos"%>
<%@page import="com.google.gson.Gson"%>
<%@page import="java.util.ArrayList"%>
<% CtrProductos productosCtr = new CtrProductos();
String opcion = request.getParameter("opcion");
if ("listar".equals(opcion)){
    ArrayList<TOProductos> productos = productosCtr.consultarProductos();
    out.print(new Gson().toJson(productos));
} else{
    out.print("Opcion no Valida");
}
%>
