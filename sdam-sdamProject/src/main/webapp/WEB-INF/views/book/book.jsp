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
<!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css"> -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>


<!-- 22.09.13 데이터피커 -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet">
<!-- <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.min.css"> -->
<!-- <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-alpha3/dist/js/bootstrap.bundle.min.js"></script> -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js"></script>





<!-- Favicon -->
<link href="../img/favicon.ico" rel="icon" />

<!-- Google Web Fonts -->
<link rel="preconnect" href="https://fonts.googleapis.com" />
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
<link
	href="https://fonts.googleapis.com/css2?family=Open+Sans:wght@400;500&family=Quicksand:wght@600;700&display=swap"
	rel="stylesheet" />

<!-- Icon Font Stylesheet -->
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css"
	rel="stylesheet" />
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.3/font/bootstrap-icons.css"
	rel="stylesheet" />

<!-- Libraries Stylesheet -->
<link href="../lib/animate/animate.min.css" rel="stylesheet" />
<link href="../lib/lightbox/css/lightbox.min.css" rel="stylesheet" />
<link href="../lib/owlcarousel/assets/owl.carousel.min.css"
	rel="stylesheet" />

<!-- Customized Bootstrap Stylesheet -->
<link href="../css/bootstrap.min.css" rel="stylesheet" />

<!-- Template Stylesheet -->
<link href="../css/style.css" rel="stylesheet" />



</head>

<body>
	<!-- Spinner Start -->
	<div id="spinner"
		class="show bg-white position-fixed translate-middle w-100 vh-100 top-50 start-50 d-flex align-items-center justify-content-center">
		<div class="spinner-border text-primary"
			style="width: 3rem; height: 3rem" role="status">
			<span class="sr-only">Loading...</span>
		</div>
	</div>
	<!-- Spinner End -->

	<!-- TOP MENU -->
	<c:import url="/WEB-INF/views/include/top_menu.jsp"></c:import>

	<!-- Page Header Start -->
	<div class="container-fluid header-bg py-5 mb-5 wow fadeIn"
		data-wow-delay="0.1s">
		<div class="container py-5">
			<h1 class="display-4 text-white mb-3 animated slideInDown">예약하기</h1>
			<nav aria-label="breadcrumb animated slideInDown">
				<ol class="breadcrumb mb-0">
					<li class="breadcrumb-item"><a class="text-white"
						href="${root }main">Home &nbsp;/</a></li>
					<li class="breadcrumb-item text-primary active" aria-current="page">
						예약하기</li>
				</ol>
			</nav>
		</div>
	</div>
	<!-- Page Header End -->



	<div class="container-xxl py-5">
		<div class="container">
			<div class="row g-5 mb-5 align-items-end wow fadeInUp"
				data-wow-delay="0.1s">
				<div class="col-lg-6">
					<p>
						<span class="text-primary me-2">#</span>테라피독&nbsp;
						<span class="text-primary me-2">#</span>테라피스트
					</p>
					<h1 class="display-6 mb-0 pb-3">예약하기</h1>

				</div>
			</div>
		</div>
	</div>

	<div class="container my-3">
		<div class="py-5">
			<h2 class="pb-2 border-bottom">
				<span class="text-primary me-2">1</span> 지역 선택
			</h2>
			<div class="form-check">
				<div class="form-check form-check-inline">
					<input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault1" checked>
					<label class="form-check-label" for="flexRadioDefault1"> 서울 </label>
				</div>
				<div class="form-check form-check-inline">
					<input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault2">
						<label class="form-check-label" for="flexRadioDefault2"> 경기도 </label>
				</div>
				<div class="form-check form-check-inline">
					<input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault3">
						<label class="form-check-label" for="flexRadioDefault3"> 대전 </label>
				</div>
				<div class="form-check form-check-inline">
					<input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault4">
						<label class="form-check-label" for="flexRadioDefault4"> 광주 </label>
				</div>
				<div class="form-check form-check-inline">
					<input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault5">
						<label class="form-check-label" for="flexRadioDefault5"> 대구 </label>
				</div>
				<div class="form-check form-check-inline">
					<input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault6">
						<label class="form-check-label" for="flexRadioDefault6"> 울산 </label>
				</div>
				<div class="form-check form-check-inline">
					<input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault7">
						<label class="form-check-label" for="flexRadioDefault7"> 부산 </label>
				</div>
				<div class="form-check form-check-inline">
					<input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault8">
						<label class="form-check-label" for="flexRadioDefault8"> 충청 </label>
				</div>
				<div class="form-check form-check-inline">
					<input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault9">
						<label class="form-check-label" for="flexRadioDefault9"> 전라 </label>
				</div>
				<div class="form-check form-check-inline">
					<input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault10">
						<label class="form-check-label" for="flexRadioDefault10"> 경상 </label>
				</div>
				<div class="form-check form-check-inline">
					<input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault11">
						<label class="form-check-label" for="flexRadioDefault11"> 제주 </label>
				</div>
			</div>
		</div>


	<div class="py-5">
		<h2 class="pb-2 border-bottom mt-5">
			<span class="text-primary me-2">2</span> 날짜 선택
		</h2>

			<form>
				<div class="row form-group">
					<label for="date" class="col-sm-1 col-form-label">Date</label>
					<div class="col-sm-4">
						<div class="input-group date" id="datepicker">
							<input type="text" class="form-control">
								<span class="input-group-append" style="cursor: pointer;"> <span class="input-group-text bg-white d-block"> <i class="fa fa-calendar"></i>
							</span>
							</span>
						</div>
					</div>
				</div>
			</form>
  </div>
			
			
			  <div class="content">
    
    <div class="container text-left">
      <div class="row justify-content-center">
        <div class="col-lg-3">
          <h2 class="mb-5 text-center">Calendar #4</h2>
          <form action="#" class="row">
            <div class="col-md-12">
              <div class="form-group">
                <label for="input_from">Select Date</label>
                <input type="text" class="form-control" id="input">
              </div>
            </div>
          </form>
        </div>
      </div>
          
    </div>    
			
			
			
			
			

		</div>

	
	
	







	</div>




<c:import url="/WEB-INF/views/include/bottom_info.jsp"></c:import>

<!-- Back to Top -->
<a href="#" class="btn btn-lg btn-primary btn-lg-square back-to-top"><i	class="bi bi-arrow-up"></i></a>

<!-- JavaScript Libraries -->
<!-- 데이트피커 적용을 위하여 주석처리 <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script> -->
<script	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js"></script>
<script src="../lib/wow/wow.min.js"></script>
<script src="../lib/easing/easing.min.js"></script>
<script src="../lib/waypoints/waypoints.min.js"></script>
<script src="../lib/counterup/counterup.min.js"></script>
<script src="../lib/owlcarousel/owl.carousel.min.js"></script>
<script src="../lib/lightbox/js/lightbox.min.js"></script>

<!-- Template Javascript -->
<script src="../js/main.js"></script>



<!-- 데이트피커 -->
<script type="text/javascript">
$(function(){
  $('#datepicker').datepicker();
});
</script>


</body>
</html>