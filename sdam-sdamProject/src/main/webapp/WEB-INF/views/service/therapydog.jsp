<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath }/"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>마음을 치료하는 테라피독</title>
<meta content="width=device-width, initial-scale=1.0" name="viewport" />
<meta content="" name="keywords" />
<meta content="" name="description" />

<!-- Bootstrap CDN -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
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

<body>
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
          테라피독 (Therapy Dog)
		</h1>
		<nav aria-label="breadcrumb animated slideInDown">
			<ol class="breadcrumb mb-0">
				<li class="breadcrumb-item">
					<a class="text-white" href="${root }main">Home</a>
				</li>
				<li class="breadcrumb-item text-white">
					테라피
				</li>
				<li class="breadcrumb-item text-primary active" aria-current="page">
					테라피독
				</li>
			</ol>
		</nav>
	</div>
</div>
<!-- Page Header End -->

<!-- Animal Start -->
<div class="container-xxl py-5">
	<div class="container">
		<div class="row g-5 mb-5 align-items-end wow fadeInUp" data-wow-delay="0.1s">
			<div class="col-lg-6" >
				<p><span class="text-primary me-2">#</span>테라피독(Therapy Dog)</p>
				<h1 class="display-6 mb-0">우리는 쓰담쓰담의 <span class="text-primary">테라피독</span>입니다</h1>
			</div>
			<div class="col-lg-6 text-lg-end">
				<a class="btn btn-primary py-3 px-5" href="">테라피독 등록하기</a>
			</div>
		</div>
		
		<!-- class g-5 mb-5로 그리드(레이아웃) 수정 -> 출력 순서 등 조정 -> 디비에서 뿌리기 -->
<!-- 		<div class="row g-4">
		
			<div class="col-lg-4 col-md-6 wow fadeInUp" data-wow-delay="0.2s"> -->
			<div class="row">
		
			<div class="wow fadeInUp" data-wow-delay="0.2s" style="display:flex; flex-direction:row; flex-wrap:wrap;">
			
				<!-- <div class="row g-4"> -->
					<div class="col-lg-4 col-md-6" style="padding-bottom:4em;">
						<a class="animal-item" href="../img/animal-md-1.jpg" data-lightbox="animal">
							<div class="position-relative">
							<img class="img-fluid" src="../img/animal-md-1.jpg" alt="" />
								<div class="animal-text p-4">
									<p class="text-white small text-uppercase mb-0">#대전 #리트리버 #귀여움</p>
									<h5 class="text-white mb-0">임댕댕 >></h5>
								</div>
							</div>
						</a>
					</div>
					<div class="col-lg-4 col-md-6">
						<a class="animal-item" href="../img/animal-md-1.jpg" data-lightbox="animal">
							<div class="position-relative">
							<img class="img-fluid" src="../img/animal-md-1.jpg" alt="" />
								<div class="animal-text p-4">
									<p class="text-white small text-uppercase mb-0">#테라피독지역추가(user에서추출?) #견종 #?</p>
									<h5 class="text-white mb-0">테라피독이름 >></h5>
								</div>
							</div>
						</a>
					</div>
					<div class="col-lg-4 col-md-6">
						<a class="animal-item" href="../img/animal-md-1.jpg" data-lightbox="animal">
							<div class="position-relative">
							<img class="img-fluid" src="../img/animal-md-1.jpg" alt="" />
								<div class="animal-text p-4">
									<p class="text-white small text-uppercase mb-0">#대전 #리트리버 #귀여움</p>
									<h5 class="text-white mb-0">임댕댕 >></h5>
								</div>
							</div>
						</a>
					</div>
					<div class="col-lg-4 col-md-6">
						<a class="animal-item" href="../img/animal-md-1.jpg" data-lightbox="animal">
							<div class="position-relative">
							<img class="img-fluid" src="../img/animal-md-1.jpg" alt="" />
								<div class="animal-text p-4">
									<p class="text-white small text-uppercase mb-0">#대전 #리트리버 #귀여움</p>
									<h5 class="text-white mb-0">임댕댕 >></h5>
								</div>
							</div>
						</a>
					</div>
				<!-- </div> -->
				
			</div>
			
			<!-- <div class="col-lg-4 col-md-6 wow fadeInUp" data-wow-delay="0.3s">
				<div class="row g-4">
					<div class="col-12">
						<a class="animal-item" href="../img/animal-lg-2.jpg" data-lightbox="animal">
							<div class="position-relative">
							<img class="img-fluid" src="../img/animal-lg-2.jpg" alt="" />
								<div class="animal-text p-4">
									<p class="text-white small text-uppercase mb-0">Animal</p>
									<h5 class="text-white mb-0">Elephant</h5>
								</div>
							</div>
						</a>
					</div>
				</div>
			</div>
			
			<div class="col-lg-4 col-md-6 wow fadeInUp" data-wow-delay="0.5s">
				<div class="row g-4">
					<div class="col-12">
						<a class="animal-item" href="../img/animal-md-3.jpg" data-lightbox="animal">
							<div class="position-relative">
							<img class="img-fluid" src="../img/animal-md-3.jpg" alt="" />
								<div class="animal-text p-4">
									<p class="text-white small text-uppercase mb-0">Animal</p>
									<h5 class="text-white mb-0">Elephant</h5>
								</div>
							</div>
						</a>
					</div>
				</div>
			</div> -->
			
		</div>
		<!-- 수정 -->
		
	</div>
</div>

<!-- Animal End -->
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