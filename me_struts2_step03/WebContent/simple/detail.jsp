<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
  <h1 class="display-3">Detail page</h1>
  <p class="lead">yeeah </p>
  <hr class="my-4">
	
	<div class="alert alert-success" role="alert">
	  <strong>사번</strong> ${bean.sabun }
	</div>
	<div class="alert alert-info" role="alert">
	  <strong>이름</strong> ${bean.name }
	</div>
	<div class="alert alert-warning" role="alert">
	  <strong>날짜</strong> ${bean.nalja }
	</div>
	<div class="alert alert-danger" role="alert">
	  <strong>ㅠㅔ이</strong> ${bean.pay }
	</div>
	  <p class="lead">
    <a class="btn btn-primary btn-lg" href="edit.action?sabun=${bean.sabun }" role="button">수정</a>
    <a class="btn btn-primary btn-lg" href="del.action?sabun=${bean.sabun }" role="button">삭제</a>
  </p>
</div>
     </div>
	
   
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>