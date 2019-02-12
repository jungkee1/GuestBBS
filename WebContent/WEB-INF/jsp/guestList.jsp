<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<table>
	<tr>
		<td>번호</td>
		<td>이름</td>
		<td>내용</td>
		<td>등급</td>
		<td>생성일</td>
		<td>아이피</td>
		<td>비고</td>
	</tr>
<c:forEach items="${dto }" var="dto">
	<tr>
		<td><a href="gDetail.m?num=${dto.num}">${dto.num }</a></td>
		<td>${dto.name }</td>
		<td>${dto.content }</td>
		<td>${dto.grade }</td>
		<td>${dto.created }</td>
		<td>${dto.ipaddr }</td>
		<td><a href="gDelete.m?num=${dto.num }">삭제</a></td>
	</tr>
</c:forEach>

</table>




</div>

</body>
</html>