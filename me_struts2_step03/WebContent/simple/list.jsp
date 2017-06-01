<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
  
    <title>Bootstrap 101 Template</title>

    <link href="css/bootstrap.min.css" rel="stylesheet">

    
  </head>
  <body>
    <div class="container">
    <%@ include file="../css/nav.jspf" %>
  <div class="jumbotron">
  
  <span style="color:red;font-size:28px;">${msg }</span>
  <h1 class="display-3">리스트 페이지!</h1>
  <p class="lead">idon'tknowwhy</p>
  <hr class="my-4">
  <p>It uses utility classes for typography and spacing to space content out within the larger container.</p>
    	
	<table class="table">
  <thead>
    <tr>
      <th>#</th>
      <th>사번</th>
      <th>이름</th>
      <th>날짜</th>
      <th>돈</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach items="${list }" var="bean">
    <tr>
      <th scope="row">+</th>
      <td>${bean.sabun}</td>
      <td><a href="detail.action?sabun=${bean.sabun }">${bean.name}</a></td>
      <td>${bean.nalja}</td>
      <td>${bean.pay}</td>
    </tr>
    </c:forEach>
  </tbody>
</table>
  <p class="lead">
    <a class="btn btn-primary btn-lg" href="add.action" role="button">add하기</a>
  </p>
</div>
 
	</div>
   
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  
    <script src="../js/bootstrap.min.js"></script>
  </body>
</html>