<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>List PaGe</h1>
	
	<table>
		<tr>
			<th>사번</th>
			<th>이름</th>
			<th>날짜</th>
			<th>금액</th>
		</tr>
		<c:forEach items="${list }" var="bean">
		<tr>
			<td>${bean.sabun }</td>
			<td>${bean.name }</td>
			<td>${bean.nalja }</td>
			<td>${bean.pay }</td>
		</tr>
		</c:forEach>
	</table>
	
</body>
</html>