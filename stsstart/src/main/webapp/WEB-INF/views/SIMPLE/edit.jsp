<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>입력페이지</h1>
	<form action="../update" method="post">
		<p><input type="text" name="sabun" placeholder="num" value="${bean.sabun }" readonly></p>
		<p><input type="text" name="name" placeholder="name" value="${bean.name }"></p>
		<p><input type="text" name="pay" placeholder="pay" value="${bean.pay }"></p>
		<button>send</button>
	</form>
</body>
</html>