<%@page import="com.google.gson.Gson"%>
<%@page import="java.util.ArrayList"%>
<%@page import="TO.TOUsuarios"%>
<%@page import="controller.CtrUsuarios"%>
<% CtrUsuarios usuariosCtr = new CtrUsuarios();
String opcion = request.getParameter("opcion");
if ("listar".equals(opcion)){
    ArrayList<TOUsuarios> usuarios = usuariosCtr.consultarUsuarios();
    out.print(new Gson().toJson(usuarios));
} else{
    out.print("Opcion no Valida");
}
%>

