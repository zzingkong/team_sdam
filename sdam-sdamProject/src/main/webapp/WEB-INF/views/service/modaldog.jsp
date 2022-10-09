<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>테라피독 정보</title>
</head>
<body>
	<div class="mt-3"> ${dogInfo.dog_type} / ${dogInfo.dog_sex} / ${dogInfo.dog_age} / ${dogInfo.company_local}</div>
	<div>${dogInfo.dog_memo}</div>
</body>
</html>