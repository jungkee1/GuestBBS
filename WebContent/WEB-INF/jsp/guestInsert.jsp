<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="left">
<form method="post" action="gInsert.m">
<table>
	<tr>
		<td>글쓴이</td>
		<td><input type="text" name="name"> *20글자 이내 (0);</td>
	</tr>
	<tr>
		<td>내용</td>
		<td><input type="text" name="content" size="50"> *200글자 이내(0)</td>
	</tr>
	<tr>
		<td>평가</td>
		<td><input type="radio" name="grade" value="execellent">아주잘함
			<input type="radio" name="grade" value="good">잘함
			<input type="radio" name="grade" value="normal">보통
			<input type="radio" name="grade" value="fail">노력
		</td>
	</tr>
</table>
<input type="submit" value="입력">

</form>
</div>

</body>
</html>