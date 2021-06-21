<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Jsp page sample</title>
</head>
<body>
<c:choose>
	<c:when test="${not empty loginId}">
		<h1>${loginId}${loginMessage}</h1>
		<a href="/logout"><button type="button" class="btn btn-secondary">로그아웃</button></a>
		<a href="/myPage"><button type="button" class="btn btn-secondary">마이페이지</button></a>
	</c:when>
	<c:otherwise>
		<h1>${message}</h1>
		<a href="/loginPage"><button type="button" class="btn btn-secondary">로그인</button></a>
		<a href="/joinPage"><button type="button" class="btn btn-secondary">회원가입</button></a>
	</c:otherwise>
</c:choose>

	
</body>
</html>