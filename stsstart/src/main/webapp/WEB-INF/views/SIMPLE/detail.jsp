<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>상세</h1>
	<label>${bean.sabun }</label><br/>
	<label>${bean.name }</label><br/>
	<label>${bean.nalja }</label><br/>
	<label>${bean.pay }</label><br/>
	
	<a href="../edit/${bean.sabun }">수정</a><br/>
	<a href="../delete/${bean.sabun }">삭제</a>
</body>
</html>