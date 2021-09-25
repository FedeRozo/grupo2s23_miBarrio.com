<%@page import="TO.TOClientes"%>
<%@page import="controller.CtrClientes"%>
<%@page import="com.google.gson.Gson"%>
<%@page import="java.util.ArrayList"%>
<% CtrClientes clientesCtr = new CtrClientes();
String opcion = request.getParameter("opcion");
if ("listar".equals(opcion)){
    ArrayList<TOClientes> clientes = clientesCtr.consultarClientes();
    out.print(new Gson().toJson(clientes));
} else{
    out.print("Opcion no Valida");
}
%>