<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>수정페이지</h1>
	<form action="update.action">
		<div>
			<label></label><input type="text" name="bean.sabun" value="${bean.sabun }" placeholder="번호" readonly/>
			<span>${fieldErrors.sabun }</span>
		</div> 
		<div>
			<label></label><input type="text" name="bean.name" value="${bean.name}" placeholder="이름"/>
			<span>${fieldErrors.name }</span>
		</div> 
		<div>
			<label></label><input type="text" name="bean.pay" value="${bean.pay }" placeholder="돈"/>
			<span>${fieldErrors.pay}</span>
		</div> 
		<div>
			<button>수정</button>
		</div> 
	</form>
</body>
</html>