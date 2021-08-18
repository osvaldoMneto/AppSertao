<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %> 

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
  <h2>Meu Sertão: Saudosas Memórias</h2>
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner">

      <div class="item active">
        <img src="img/ponte.jpg" alt="Juazeiro-Ba" style="width:100%;">
        <div class="carousel-caption">
          <h3>Juazeiro</h3>
          <p>Eu gosto de Juazeiro, mas adoro Petrolina!</p>
        </div>
      </div>

      <div class="item">
        <img src="img/acudegrande.jpg" alt="Cajazeiras-Pb" style="width:100%;">
        <div class="carousel-caption">
          <h3>Cajazeiras</h3>
          <p>Cajazeiras, meu amor!!</p>
        </div>
      </div>
    
      <div class="item">
        <img src="img/Luis.jpg" alt="LuisGonzaga" style="width:100%;">
        <div class="carousel-caption">
          <h3>Luis</h3>
          <p>Eu vou voltar pra meu Sertão!</p>
        </div>
      </div>
  
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>

</body>
</html>
