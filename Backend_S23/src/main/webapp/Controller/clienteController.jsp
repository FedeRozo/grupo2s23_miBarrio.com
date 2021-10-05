<%@page import="TO.TOUsuarios"%>
<%@page import="TO.TOClientes"%>
<%@page import="controller.CtrClientes"%>
<%@page import="com.google.gson.Gson"%>
<%@page import="java.util.ArrayList"%>
<% CtrClientes clientesCtr = new CtrClientes();
String opcion = request.getParameter("opcion");
if ("listar".equals(opcion)){
    ArrayList<TOClientes> clientes = clientesCtr.consultarClientes();
    out.print(new Gson().toJson(clientes));
    ////ojoooo
}else if("insertar".equals(opcion)){
    String cliente = request.getParameter("data");
    TOUsuarios usuariosTo = new Gson().fromJson(cliente, TOUsuarios.class);
    TOClientes clientesTo = new Gson().fromJson(cliente, TOClientes.class);
    clientesCtr.isertarClientes(usuariosTo, clientesTo);
}else if("actualizar".equals(opcion)){
    String datos = request.getParameter("data");
    TOUsuarios usuariosTo = new Gson().fromJson(datos, TOUsuarios.class);
    TOClientes clientesTo = new Gson().fromJson(datos, TOClientes.class);
    clientesCtr.modificarCliente(usuariosTo, clientesTo);
}else if("eliminar".equals(opcion)){
    String datos = request.getParameter("data");
    TOClientes clientesTo = new Gson().fromJson(datos, TOClientes.class);
    clientesCtr.eliminarCliente(clientesTo);
} else{
    out.print("Opcion no Valida");
}
%>