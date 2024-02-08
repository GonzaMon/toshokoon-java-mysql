<%@page import="java.util.List"%>
<%@page import="edu.toshokoteca.pojo.Historieta"%>
<html>
	<head>
		<%@include file="head.jsp" %>	
	</head>
	
	<body>
		<!-- ACA VA EL NAVBAR  -->
		<%@include file="navbar.jsp" %>
		<main>
			<div class="container">
				<section>
					<h1>Listado</h1>
					<table class="table">
					  <thead>
					    <tr>
					      <th scope="col">ID</th>
					      <th scope="col">NOMBRE</th>
					      <th scope="col">GUIONISTA</th>
					      <th scope="col">ARTISTA</th>
                          <th scope="col">EDITORIAL</th>
                          <th scope="col">PAGINAS</th>
                          <th scope="col">FECHA</th>
                          <th scope="col">REGION</th>
					      <th scope="col">&nbsp;</th>
					    </tr>
					  </thead>
					  <% 
					  	//codigo java
					  	//obtener el listado desde el request
					  	//se guardo bajo el nombre de "listado"
					  	List<Historieta> listado = (List<Historieta>)request.getAttribute("listado");
					  %>
					  <tbody>
					   <!-- ESTO SE REPITE TANTA CANDTIDAD DE VECES COMO ARTICULOS TENGA -->
					   <%
					   	for( Historieta unaHistorieta : listado) {
					   %>
					    <tr>
					      <th scope="row"> <%=unaHistorieta.getId()%> </th>
					      <td><%=unaHistorieta.getNombre() %></td>
                          <td><%=unaHistorieta.getGuionista() %></td>
					      <td><%=unaHistorieta.getArtista() %></td>
					      <td><%=unaHistorieta.getEditorial() %></td>
                          <td><%=unaHistorieta.getPaginas() %></td>
                          <td><%=unaHistorieta.getFecha_creacion() %></td>
					      <td><%=unaHistorieta.getRegion() %></td>
					      <td>
					      	<a class="btn btn-danger" href="" role="button">Eliminar</a> | 
					      	<a class="btn btn-secondary" href="" role="button">Editar</a>
					      </td>
					    </tr>
					   <%
					   	}
					   %>
					  </tbody>
					</table>
				</section>
			</div>
		</main>
	</body>	
</html>