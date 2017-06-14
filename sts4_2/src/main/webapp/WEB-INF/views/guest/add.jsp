<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>입력</h1>
<form  method="post">
	<input type="text" name="sabun" placeholder="sabun">
	<input type="text" name="num" placeholder="num">
	<input type="text" name="name" placeholder="name">
	<button>전송</button>
</form>
<form  action="${root }/guest/insert" method="post">
	
	<input type="text" name="sabun" placeholder="sabun" value="${bean.sabun }">
	<input type="text" name="num" placeholder="num" value="${bean.num }">
	<input type="text" name="name" placeholder="name" value="${bean.name }">
	<label>${bean.nalja }</label>
	<button>전송</button>
</form>
</body>
</html>