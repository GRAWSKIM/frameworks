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
  <h1 class="display-3">수정 페이지!</h1>
  <p class="lead">idon'tknowwhy</p>
  <hr class="my-4">
  <p>It uses utility classes for typography and spacing to space content out within the larger container.</p>
    	
	<form action="update.action">
 
  <p class="lead">
    <button class="btn btn-primary btn-lg" role="button" >update하기</button>
  </p>
  
  <div class="form-group row">
  <label for="사번" class="col-2 col-form-label">사번</label>
  <div class="col-10">
    <input class="form-control" type="text" id="" name="sabun" value="${bean.sabun }" readonly>
  </div>
</div>

  <div class="form-group row">
  <label for="이름" class="col-2 col-form-label">이름</label>
  <div class="col-10">
    <input class="form-control" type="text" id="" name="name"  value="${bean.name }">
  </div>
</div>

  <div class="form-group row">
  <label for="pay" class="col-2 col-form-label">pay</label>
  <div class="col-10">
    <input class="form-control" type="text" id="" name="pay"  value="${bean.pay }">
  </div>
</div>

<div class="form-group row">
  <label for="example-datetime-local-input" class="col-2 col-form-label">Date</label>
  <div class="col-10">
    <input class="form-control" type="datetime-local" id="nalja"  value="${bean.nalja }">
  </div>
</div>
</form>
</div>
  </div>
	
   
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  
    <script src="../js/bootstrap.min.js"></script>
  </body>
</html>