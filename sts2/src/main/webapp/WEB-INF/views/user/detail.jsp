<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="/template/header.jsp"></jsp:include>
	<jsp:include page="/template/menu.jsp"></jsp:include>
	<h1>상세</h1>
	<label>${bean.num }</label><br/>
	<label>${bean.sabun }</label><br/>
	<label>${bean.name }</label><br/>
	<label>${bean.nalja }</label><br/>
	
	<a href="edit?idx=${bean.num }">수정</a><br/>
	<a href="del?idx=${bean.num }">삭제</a>
	<jsp:include page="/template/footer.jsp"></jsp:include>
</body>
</html>