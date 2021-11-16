<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="../setting/setting_taglib.jsp"></jsp:include>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>로그인</title>
        <link rel="stylesheet" href="/css/sign_in.css">
	</head>
	<body>
        <main>
            <div class="wrap_banner">
                <div class="logo">
                    <img src="/images/todologo.png"/>
                </div>
            </div>
            <div class="wrap_form">
                <form action="/auth/signin" method="post">
	                <div class="login_wrap">
	                    <input name="username" class="item_ip" placeholder="이메일"/><br/>
	                    <input type="password" name="password" class="item_ip" placeholder="비밀번호"/><br/>
                    </div>
                    <input type="submit" value="로그인" class="item_btn"/>
                </form>
                <button onclick="location.href='/auth/signup'" class="item_btn">회원가입</button>
            </div>
        </main>
		
	</body>
</html>