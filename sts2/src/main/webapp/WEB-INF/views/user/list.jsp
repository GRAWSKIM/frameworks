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
	<jsp:include page="/template/header.jsp"></jsp:include>
	<jsp:include page="/template/menu.jsp">
		<jsp:param value="2" name="active"/>
	</jsp:include>
	<h1>리스트페이지</h1>
	<table>
		<tr>
			<th>번호</th>
			<th>사번</th>
			<th>이름</th>
			<th>날짜</th>
		</tr>
		<c:forEach items="${alist }" var="bean">
			<tr>
				<td>${bean.num }</td>
				<td>${bean.sabun }</td>
				<td><a href="detail?idx=${bean.num}">${bean.name }</a></td>
				<td>${bean.nalja }</td>
			</tr>
		</c:forEach>
		<a href="add">add</a>
	</table>
	<jsp:include page="/template/footer.jsp"></jsp:include>
</body>
</html>