<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath }/"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>마이페이지</title>
<meta content="width=device-width, initial-scale=1.0" name="viewport" />
<meta content="" name="keywords" />
<meta content="" name="description" />

<!-- Bootstrap CDN -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>

<!-- Favicon -->
<link href="../img/favicon.ico" rel="icon" />

<!-- Google Web Fonts -->
<link rel="preconnect" href="https://fonts.googleapis.com" />
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
<link href="https://fonts.googleapis.com/css2?family=Open+Sans:wght@400;500&family=Quicksand:wght@600;700&display=swap" rel="stylesheet" />

<!-- Icon Font Stylesheet -->
<link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet" />
<link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css" rel="stylesheet" />

<!-- Libraries Stylesheet -->
<link href="../lib/animate/animate.min.css" rel="stylesheet" />
<link href="../lib/lightbox/css/lightbox.min.css" rel="stylesheet" />
<link href="../lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet" />

<!-- Customized Bootstrap Stylesheet -->
<link href="../css/bootstrap.min.css" rel="stylesheet" />

<!-- Template Stylesheet -->
<link href="../css/style.css" rel="stylesheet" />
</head>

<body class="bg-light">
<!-- Spinner Start -->
<div id="spinner" class="show bg-white position-fixed translate-middle w-100 vh-100 top-50 start-50 d-flex align-items-center justify-content-center">
	<div class="spinner-border text-primary" style="width: 3rem; height: 3rem" role="status">
        <span class="sr-only">Loading...</span>
	</div>
</div>
<!-- Spinner End -->
	
<!-- TOP MENU -->
<c:import url="/WEB-INF/views/include/top_menu.jsp"></c:import>

<!-- Page Header Start -->
<div class="container-fluid header-bg py-5 mb-5 wow fadeIn" data-wow-delay="0.1s">
	<div class="container py-5">
		<h1 class="display-4 text-white mb-3 animated slideInDown">
          마이페이지 (My Page)
		</h1>
		<nav aria-label="breadcrumb animated slideInDown">
			<ol class="breadcrumb mb-0">
				<li class="breadcrumb-item">
					<a class="text-white" href="${root }main">Home &nbsp;/ </a>
				</li>
				<li class="breadcrumb-item text-primary active" aria-current="page">
					마이페이지
				</li>
			</ol>
		</nav>
	</div>
</div>
<!-- Page Header End -->

이 화면이 회원정보 화면인걸 어떻게 알려줄까?

<!-- Start -->
<div class="container-xxl py-5" style="display:flex;">
	
<%-- <div class="collapse navbar-collapse py-4 py-lg-0" >
			<div class="navbar-nav ms-auto">
				<div class=" dropdown">
					<a href="${root }introduce/intro" class="nav-item nav-link">쓰담쓰담소개</a>
				</div> --%>

<!-- <div class="container"> -->
	<div class="col-lg-3">
<!-- 	<p class="mb-3"><a href="#">회원정보</a>회원정보</p>
		<p class="mb-3">예약관리</p>
		<p class="mb-3">게시물관리</p>
		<p class="mb-3">회원탈퇴</p> -->

		<nav class="nav flex-column">
			<a class="nav-link active" aria-current="page" href="#">회원정보</a> <!-- aria-current 현재페이지 -->
			<a class="nav-link" href="#">예약관리</a>
			<a class="nav-link" href="#">게시물관리</a>
			<a class="nav-link" href="#">회원탈퇴</a> 
			<!-- tabindex="-1" aria-disabled="true" 키보드 사용자 상호작용 불가 / https://getbootstrap.kr/docs/5.1/utilities/interactions/-->
		</nav>	
	</div>
	
	<div class="col-lg-9 bg-white card shadow">  
<!-- <div class="owl-carousel testimonial-carousel wow fadeInUp text-center" data-wow-delay="0.1s"> -->
		<div class="testimonial-item">
		<div class="mt-4 mb-4 ms-5 wow fadeInUp">
			<img class="img-fluid rounded-circle border border-2 p-2 mx-auto mb-4" src="../image/testimonial-1.jpg" style="width: 100px; height: 100px"/>
			<h4 class="display-7" data-wow-delay="0.1s">테라피스트 차은우님 안녕하세요.</h4>
		</div>
			<div class="testimonial-text rounded p-4 ms-4">
				<p class="mb-1">이름</p>
				<p class="mb-1">아이디</p>
				<p class="mb-1">전화번호</p>
				<p class="mb-1">생일</p>
				<p class="mb-2">주소</p><br/>
				<span class="fst-italic">회원정보수정</span>
			</div>
        </div>
<!-- </div> -->
	</div>
<!-- 	</div> -->
</div>
<!-- End -->

<!-- BOTTOM MENU -->
<c:import url="/WEB-INF/views/include/bottom_info.jsp"></c:import>

<!-- Back to Top -->
<a href="#" class="btn btn-lg btn-primary btn-lg-square back-to-top"><i class="bi bi-arrow-up"></i></a>

<!-- JavaScript Libraries -->
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js"></script>
<script src="../lib/wow/wow.min.js"></script>
<script src="../lib/easing/easing.min.js"></script>
<script src="../lib/waypoints/waypoints.min.js"></script>
<script src="../lib/counterup/counterup.min.js"></script>
<script src="../lib/owlcarousel/owl.carousel.min.js"></script>
<script src="../lib/lightbox/js/lightbox.min.js"></script>

<!-- Template Javascript -->
<script src="../js/main.js"></script>

</body>
</html>
