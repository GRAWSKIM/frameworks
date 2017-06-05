<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
				<h2>리스트페이지</h2>
				<span style="color:red;">${msg }</span>
			</div>
		</div>
		<div class="row content">
			<div class="jumbotron">
				<h1>리스트페이지</h1>
				<p>여기는 리스트페이지</p>
				<p><a class="btn btn-primary btn-lg" href="add.do">글쓰러</a></p>
				
			</div>
			<div class="page-header">
				<h1>게시판<small>글을작성한다</small></h1>
			</div>
			<table class="table table-striped">
				<tr>
					<th>사번</th>
					<th>이름</th>
					<th>날짜</th>
					<th>금액</th>
				</tr>
				<c:forEach items="${alist }" var="bean">
				<tr>
					<td>${bean.sabun }</td>
					<td><a href="detail.do?sabun=${bean.sabun }">${bean.name }</a></td>
					<td>${bean.nalja }</td>
					<td>${bean.pay }</td>
				</tr>
				</c:forEach>
			</table>
		</div>
		<div class="row footer">
			<div class="col-md-12"></div>
		</div>
	</div>
</body>
</html>