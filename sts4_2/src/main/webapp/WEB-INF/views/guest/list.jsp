<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>상세페이지</h1>
	<table style="width:60%">	
		<tr> <th>1</th><th>2</th><th>3</th><th>4</th> </tr>
		<c:forEach items="${alist }" var ="bean">
		<tr> 
		<td><a href="detail/${bean.sabun }">${bean.sabun }</a></td><td>${bean.num }</td><td>${bean.name }</td><td>${bean.nalja }</td>
		<a href="${root }/guest/detail/${bean.sabun}">sad</a>
		</tr>
		</c:forEach>
	</table>	
	<a href="${root }/guest/add">입력</a>
</body>
</html>