<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Jsp page sample</title>
</head>
<body>
 
<h1>로그인</h1>

    <form action="/join" method="post">
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
                <td>비밀번호 확인</td>
                <td><input type="text" name="passwordCheck" placeholder="비밀번호 확인"></td>
            </tr>
            <tr>
                <td>이름</td>
                <td><input type="text" name="name" placeholder="이름 입력"></td>
            </tr>
            <tr>
                <td>이메일</td>
                <td><input type="text" name="email" placeholder="이메일 입력"></td>
            </tr>
            <tr>
                <td><input type="submit" value="회원가입"></td>
                <td><a href="/main"><button type="button" class="btn btn-secondary">홈으로</button></a></td>
            </tr>
        </table>
    </form>
        
</body>
</html>