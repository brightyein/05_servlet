<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>영화 예매 화면</h2>
<form action="reservation" method="get">
<label>영화: </label>
<select name="movie">
<option value="서울의봄">서울의봄</option>
<option value="이프">이프</option>
<option value="그녀가죽었다">그녀가죽었다</option>
<option value="퓨리오사">퓨리오사</option>
<option value="설계자">설계자</option>
<option value="범죄도시">범죄도시</option>
</select>

<label>좌석수 : </label>
<select name="seat">
<option value="0">0명</option>
<option value="1">1명</option>
<option value="2">2명</option>
<option value="3">3명</option>
<option value="4">4명</option>
</select>
<input type="submit" value="예매하기">

</form>

</body>
</html>