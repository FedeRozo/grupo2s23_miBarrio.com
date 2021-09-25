<%@page import="TO.TOEmpleados"%>
<%@page import="controller.CtrEmpleados"%>
<%@page import="com.google.gson.Gson"%>
<%@page import="java.util.ArrayList"%>
<% CtrEmpleados empleadosCtr = new CtrEmpleados();
String opcion = request.getParameter("opcion");
if ("listar".equals(opcion)){
    ArrayList<TOEmpleados> empleados = empleadosCtr.consultarEmpleados();
    out.print(new Gson().toJson(empleados));
} else{
    out.print("Opcion no Valida");
}
%>