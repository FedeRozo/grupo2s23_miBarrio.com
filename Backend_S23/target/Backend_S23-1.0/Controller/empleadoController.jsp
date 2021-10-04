<%@page import="controller.CtrEmpleados"%>
<%@page import="TO.TOEmpleados"%>
<%@page import="TO.TOUsuarios"%>
<%@page import="com.google.gson.Gson"%>
<%@page import="java.util.ArrayList"%>
<% CtrEmpleados empleadosCtr = new CtrEmpleados();
String opcion = request.getParameter("opcion");
if ("listar".equals(opcion)){
    ArrayList<TOEmpleados> empleados = empleadosCtr.consultarEmpleados();
    out.print(new Gson().toJson(empleados));
} else if("login".equals(opcion)){
    String data = request.getParameter("data");
    TOEmpleados empleado = new Gson().fromJson(data, TOEmpleados.class);
    empleado = empleadosCtr.verificarEmpleados(empleado.getUsuario(), empleado.getClave());
    out.print(new Gson().toJson(empleado));
}else if("insertar".equals(opcion)){
    String empleado = request.getParameter("data");
    TOUsuarios usuariosTo = new Gson().fromJson(empleado, TOUsuarios.class);
    TOEmpleados empleadosTo = new Gson().fromJson(empleado, TOEmpleados.class);
    empleadosCtr.isertarEmpleado(usuariosTo, empleadosTo);
}else if("actualizar".equals(opcion)){
    String datos = request.getParameter("data");
    TOUsuarios usuariosTo = new Gson().fromJson(datos, TOUsuarios.class);
    TOEmpleados empleadosTo = new Gson().fromJson(datos, TOEmpleados.class);
    empleadosCtr.modificarEmpleado(usuariosTo, empleadosTo);
}else if("eliminar".equals(opcion)){
    String datos = request.getParameter("data");
    TOEmpleados empleadosTo = new Gson().fromJson(datos, TOEmpleados.class);
    empleadosCtr.eliminarEmpleado(empleadosTo);
}else{
    out.print("Opcion no Valida");
}
%>