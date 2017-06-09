<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="/day02/resources/css/bootstrap.min.css">
<script src="/day02/resources/js/jquery-1.12.4.js" type="text/javascript"></script>
<script src="/day02/resources/js/bootstrap.min.js"></script>
<script>

</script>
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="/template/header.jsp"></jsp:include>
	<jsp:include page="/template/menu.jsp"></jsp:include>
  	
		<div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
		  <!-- Indicators -->
		  <ol class="carousel-indicators">
		    <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
		    <li data-target="#carousel-example-generic" data-slide-to="1"></li>
		    <li data-target="#carousel-example-generic" data-slide-to="2"></li>
		  </ol>
		
		  <!-- Wrapper for slides -->
		  <div class="carousel-inner" role="listbox">
		    <div class="item active">
		      <img src="resources/imgs/12.jpg" alt="..." style="height:300px;width:300px;margin:0px auto;">
		      <div class="carousel-caption">
		        <h3>FirstIamge</h3>
							 <p>today is a good day</p>
		      </div>
		    </div>
		    <div class="item">
		      <img src="resources/imgs/23.jpg" alt="..." style="height:300px;width:300px;margin:0px auto;">
		      <div class="carousel-caption">
		      <h3>Scondary Image</h3>
							 <p>good day is a today</p>
		      </div>
		    </div>
		    <div class="item">
		      <img src="resources/imgs/235.JPG" alt="..." style="height:300px;width:300px;margin:0px auto;">
		      <div class="carousel-caption">
		      <h3>thirden Image</h3>
							 <p>everyday good day</p>
		      </div>
		    </div>
		    ...
		  </div>
		
		  <!-- Controls -->
		  <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
		    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
		    <span class="sr-only">Previous</span>
		  </a>
		  <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
		    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
		    <span class="sr-only">Next</span>
		  </a>
		</div>  	
		
	<jsp:include page="/template/footer.jsp"></jsp:include>
</body>
</html>