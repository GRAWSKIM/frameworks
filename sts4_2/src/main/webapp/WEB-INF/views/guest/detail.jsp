<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
 	<h1>상세페이지</h1>
 	<p>${bean.sabun }</p>
 	<p>${bean.num }</p>
 	<p>${bean.name }</p>
 	<p>${bean.nalja }</p>
 	<p><a href="${root }/guest/add/${bean.sabun }">수정</a></p>
 	<p><a href="${root }/guest/del/${bean.sabun }">삭제</a></p>
</body>
</html>