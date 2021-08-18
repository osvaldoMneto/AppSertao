<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

<!DOCTYPE html>
<html lang="en">
<head>
  <title>MeuSertao</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>


	<c:import url="/WEB-INF/jsp/menu.jsp"/>




	<div class="container">
		<c:if test="${not empty mensagem }">
			<div class="alert alert-success alert-dismissible">
			    <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			    <strong>Successo!</strong> ${mensagem}
			</div>   
		 </c:if>
		
		<h3><a href="/artista">Incluir Novo Artista</a></h3>
		
		<c:if test="${not empty artistas"}>
			<h2>Listagem de Artistas: ${artistas.size()}</h2>
			
		 <table class="table table-striped">
			   <thead>
			      <tr>
			      	<th>id</th>
			        <th>Nome</th>
			        <th> Sigla da Cidade</th>
			      	<th></th>
			      	<th></th>
			 </thead>
			 <tbody>
				 <c:forEach var= "artista" items="${artistas}">
			        <tr>
			        <td>${id.count}</td>
			        <td>${art.nome}</td>
			        <td>${art.siglaCidade}</td>
			        <td><a href="/artista/${id.count}/excluir">Excluir</a></td>
			        <td><a href="/artista/consultar">Detalhar</a></td>
			        </tr>	
			    </c:forEach>
			 </tbody>
			  </table>
			  
			  
			  <c:if teste = "${empty artistas}">
					<h2>Não existem artistas cadastrados!!!</h2>			  
				</c:if>
	
		</c:if>

	</div>

</body>
</html>
