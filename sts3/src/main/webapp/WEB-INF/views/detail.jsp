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
	<script src="/day03/resources/js/jquery-1.12.4.js"></script>
	<script type="text/javascript">
	 $(document).ready(function(){
		 $("#deletebut").click(function () {
			$("#sabun")
		})
		 
	 })
	</script>
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
						${bean.name }님의<small>asdsa</small>
					</h1>
								<div>
					${bean.name }
					${bean.num }
					${bean.sabun }
					${bean.nalja }
				</div>
				<div id="update">
		    		<form class="form-horizontal" method="post">
					  <div class="form-group">
					  <input type="hidden" name="_method" value="put">
					    <label for="sabun" class="col-sm-2 control-label">사번</label>
					    <div class="col-sm-10">
					      <input type="text" value="${bean.sabun }" name="sabun" class="form-control" id="sabun" placeholder="sabun" readonly="readonly">
					    </div>
					  </div>
					  <div class="form-group">
					    <label for="name" class="col-sm-2 control-label">이름</label>
					    <div class="col-sm-10">
					      <input type="text" value="${bean.name }" name="name" class="form-control" id="name" placeholder="name">
					    </div>
					  </div>
					  <div class="form-group">
					    <label for="pay" class="col-sm-2 control-label">금액</label>
					    <div class="col-sm-10">
					      <input type="text" value="${bean.num }" name="num" class="form-control" id="pay" placeholder="pay">
					    </div>
					  </div>
					  
					  <div class="form-group">
					    <div class="col-sm-offset-2 col-sm-10">
					      <button type="submit" class="btn btn-default">수 정</button>
					      <button id="deletebut" class="btn btn-default">삭제</button>
					    </div>
					  </div>
					</form>
		    	</div>
				</div>
	
			</div>
		</div>	
	</body>

</html>