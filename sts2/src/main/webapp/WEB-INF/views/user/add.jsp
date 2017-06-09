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
	<jsp:include page="/template/menu.jsp">
		<jsp:param value="2" name="active"/>
	</jsp:include>
	<h1>${title }페이지</h1>
	<form action="${nxturl }" method="post">
		<p><input type="text" name="sabun" placeholder="sabun" value="${bean.sabun }"></p>
		<p><input type="text" name="name" placeholder="name" value="${bean.name }"></p>
		<p><input type="text" name="num" placeholder="num" value="${bean.num }"></p>
		<span >${bean.nalja }</span>
		<button>send</button>
	</form>
	<jsp:include page="/template/footer.jsp"></jsp:include>
</body>
</html>