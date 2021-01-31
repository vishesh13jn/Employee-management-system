<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<form action="addEmployee">
		<input type="text" name="id"><br>
		<input type="text" name="name"><br>	
		<input type="text" name="department"><br>
		<input type="submit"><br>
	</form>
	
	<form action="showEmployee">
		<input type="text" name="id"><br>
		<input type="submit"><br>
	</form>
	
	<form action="deleteEmployee">
		<input type="text" name="id"><br>
		<input type="submit"><br>
	</form>
	
</body>
</html>