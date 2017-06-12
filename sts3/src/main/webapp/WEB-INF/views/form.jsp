<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE>
<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
	</head>
	<link rel="stylesheet" href="/day03/resources/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="/day03/resources//css/bootstrap-theme.min.css"
	integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp"
	crossorigin="anonymous">

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<!-- Latest compiled and minified JavaScript -->
<script src="/day03/resources/js/bootstrap.min.js"
	integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
	crossorigin="anonymous"></script>
	<body>
		<nav class="navbar navbar-default">
		  <div class="container-fluid">
		    <!-- Brand and toggle get grouped for better mobile display -->
		    <div class="navbar-header">
		      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
		        <span class="sr-only">Toggle navigation</span>
		        <span class="icon-bar"></span>
		        <span class="icon-bar"></span>
		        <span class="icon-bar"></span>
		      </button>
		      <a class="navbar-brand" href="/day03/"> 
		      	<img alt="Brand" src="resources/imgs/23.jpg" style="width:40px;">
		      </a>
		    </div>
			<a class="navbar-text" href="/day03/list">LIST</a>			
		    <a class="navbar-text" href="/day03/">HOME</a>
		    <a class="navbar-text" href="/day03/guest">INSERT</a>
		  </div><!-- /.container-fluid -->
		</nav>	
		<div class="container">
			<div class="row">
				<ol class="breadcrumb">
					<li><a href="/day03/">Home</a></li>
					<li><a href="/day03/list">List</a></li>
					<li><a href="/day03/guest">add</a></li>
				</ol>
			</div>
			
			<div class="row">
			<div class="col-md-4">
				<ul class="nav nav-pills nav-stacked">
					<li><a href="/day03/">Home</a></li>
					<li><a href="/day03/list">List</a></li>
				</ul>
			</div>
				<div class="page-header col-md-8">
					<h1>
						입력<small>asdsa</small>
					</h1>
				</div>
				<div>
					<form class="form-inline" method="post">
					  <div class="form-group">
					    <label class="sr-only" for="exampleInputEmail3">Email address</label>
					    <input type="text" class="form-control"  name="sabun" placeholder="sabun">
					  </div>
					  <div class="form-group">
					    <label class="sr-only" for="exampleInputPassword3">Password</label>
					    <input type="text" class="form-control" name="num" placeholder="num">
					  </div>
					  <div class="form-group">
					    <label class="sr-only" for="exampleInputPassword3">Password</label>
					    <input type="text" class="form-control" name="name" placeholder="name">
					  </div>
										
					
					  <button type="submit" class="btn btn-default">send</button>
					</form>
				</div>
			</div>
		</div>	
	</body>

</html>