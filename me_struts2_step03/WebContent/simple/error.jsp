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
    		
	<div class="alert alert-success" role="alert">
  	<strong>틀렸어</strong> 틀렸어틀렸어
	</div>
	<div class="alert alert-info" role="alert">
	  <strong>잘못왔어</strong>잘못왔어
	</div>
	<div class="alert alert-warning" role="alert">
	  <strong>잘못왔어</strong> 잘못왔어
	</div>
	<div class="alert alert-danger" role="alert">
	  <strong>잘못왔어</strong> ㅃㅃㅃ
	</div>
    <a class="btn btn-primary btn-lg" href="index.action" role="button">돌아가</a>
    </div>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  
    <script src="../js/bootstrap.min.js"></script>
  </body>
</html>