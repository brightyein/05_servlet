<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>File Upload</h1>
	
	<h4>common file upload</h4>
	<form action="commons" method="post" enctype="multipart/form-data">
		<input type="file" name="singlefile"><br>
		<input type="file" name="multifile" multiple><br>
		<input type="text" name="description">
		<button type="submit">파일 전송</button>
	</form>
	
	<h4>thumbnailator (이미지 -> 썸네일 변환)</h4>
	<button onclick="location.href='transferTothumbnail'">Thumbnail 이미지 변화</button>
</body>
</html>