<%@page import="TO.TOProveedores"%>
<%@page import="controller.CtrProveedores"%>
<%@page import="com.google.gson.Gson"%>
<%@page import="java.util.ArrayList"%>
<% CtrProveedores proveedoresCtr = new CtrProveedores();
String opcion = request.getParameter("opcion");
if ("listar".equals(opcion)){
    ArrayList<TOProveedores> proveedores = proveedoresCtr.consultarProveedores();
    out.print(new Gson().toJson(proveedores));
} else{
    out.print("Opcion no Valida");
}
%>