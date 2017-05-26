<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>list hello</h1>
	<table>
		<tr>
			<th></th>
			<th></th>
			<th></th>
			<th></th>
		</tr>
		<c:forEach items="${alist}" var = "map">
		<tr>
			<td>${map.sabun }</td>
			<td><a href="detail.do?idx=${map.sabun }">${map.name }</a></td>
			<td>${map.nalja }</td>
			<td>${map.pay }</td>
		</tr>
		</c:forEach>
		
	</table>
	<a href="add.do">입력</a>
</body>
</html>