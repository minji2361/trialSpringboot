<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Jsp page sample</title>
</head>
<body>
 
<h1>로그인</h1>

    <form action="/login" method="post">
        <table>
            <tr>
                <td>아이디</td>
                <td><input type="text" name="id" placeholder="아이디 입력"></td>
            </tr>
            <tr>
                <td>비밀번호</td>
                <td><input type="text" name="password" placeholder="비밀번호 입력"></td>
            </tr>
            <tr>
                <td><input type="submit" value="로그인"></td>
                <td><a href="/joinPage"><button type="button" class="btn btn-secondary">회원가입</button></a></td>
            </tr>
        </table>
    </form>
        
</body>
</html>