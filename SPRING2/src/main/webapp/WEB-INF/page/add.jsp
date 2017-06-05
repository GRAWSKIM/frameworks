<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta name="viewport" content="width=device-width,initial-scale=1.0">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Comppatible" content="IE=edge">
<title>Insert title here</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
</head>
<script src="https://code.jquery.com/jquery-1.12.4.min.js" integrity="sha256-ZosEbRLbNQzLpnKIkEdrPv7lOy9C27hHQ+Xp8a4MxAQ=" crossorigin="anonymous"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<body>
	<div class="container">
		<div class="row header">
			<div class="col-md-12">
				<h2>안녕안녕</h2>
			</div>
		</div>
		
		
		<div class="row content">
			<div class="jumbotron">
				<h1>addADDad</h1>
				<p>addADDad</p>
				<p></p>				
			</div>
			<div class="page-header">
				<h1>입력<small>폼을 채워줄래</small></h1>
			</div>
		</div>
		
		<form class="form-horizontal" id="fora" action="insert.do">
		<button class="btn btn-primary btn-lg" >안녕</button>
		  <div class="form-group">
		    <label class="col-sm-2 control-label">이름</label>
		    <div class="col-sm-10">
		      <p class="form-control-static">email@example.com</p>
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="inputPassword" class="col-sm-2 control-label">name</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" id="inputPassword" name="name">
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="inputPassword" class="col-sm-2 control-label">sabun</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" id="inputPassword" name="sabun">
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="inputPassword" class="col-sm-2 control-label">pay</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" id="inputPassword" name="pay">
		    </div>
		  </div>
		  
		</form>
		
		<div class="row footer">
			<div class="col-md-12"></div>
		</div>
	</div>
</body>
</html>