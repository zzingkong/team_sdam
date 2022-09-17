<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="root" value="${pageContext.request.contextPath }/"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>쓰담쓰담</title>
<meta content="width=device-width, initial-scale=1.0" name="viewport" />
<meta content="" name="keywords" />
<meta content="" name="description" />

<!-- Bootstrap CDN -->
<!-- <link rel="stylesheet" -->
<!-- 	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css"> -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>


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
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css"
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
    <div
      id="spinner"
      class="show bg-white position-fixed translate-middle w-100 vh-100 top-50 start-50 d-flex align-items-center justify-content-center"
    >
      <div
        class="spinner-border text-primary"
        style="width: 3rem; height: 3rem"
        role="status"
      >
        <span class="sr-only">Loading...</span>
      </div>
    </div>
    <!-- Spinner End -->
	
	<!-- TOP MENU -->
	<c:import url="/WEB-INF/views/include/top_menu.jsp"></c:import>

	<!-- Page Header Start -->
	<div class="container-fluid header-bg py-5 my-n2 wow fadeIn"
		data-wow-delay="0.1s">
		<div class="container py-5">
		<h1 class="display-4 text-white mb-3 animated slideInDown">
          테라피스트 (Therapist)
		</h1>
		<nav aria-label="breadcrumb animated slideInDown">
			<ol class="breadcrumb mb-0">
				<li class="breadcrumb-item">
					<a class="text-white" href="${root }main">Home &nbsp;/</a>
				</li>
				<li class="breadcrumb-item text-white">
					테라피 &nbsp;/
				</li>
				<li class="breadcrumb-item text-primary active" aria-current="page">
					테라피스트
				</li>
			</ol>
		</nav>
	</div>
	</div>
	<!-- Page Header End -->
	
	<!-- Service Start -->
	<div class="container-xxl py-5">
		<div class="container">
			<div class="row g-5 mb-4 wow fadeInUp label" data-wow-delay="0.1s">
				
				<div class="col-2 p-1 mb-5">
					<select class="form-select" aria-label="Default select example">
						<option selected>지역별</option>
						<option value="1">서울/경기</option>
						<option value="2">충청도</option>
						<option value="3">경상도</option>
					</select> 
				</div>
				<div class="col-2 p-1 mb-5">
						<select class="form-select" aria-label="Default select example">
							<option selected>경력</option>
							<option value="1">1년~5년</option>
							<option value="2">5년~10년</option>
							<option value="3">10년~15년</option>
							<option value="3">15년 이상</option>
						</select> 
				</div>
					
				<div class="col-2 p-1 mb-5">
					<select class="form-select" aria-label="Default select example">
						<option selected>별점순</option>
						<option value="1">1.0~3.0</option>
						<option value="2">3.0~4.0</option>
						<option value="3">4.0~5.0</option>
					</select> 					
				</div>
					
				<div class="col-2 p-1 mb-5">
					<select class="form-select" aria-label="Default select example">
						<option selected>성별</option>
						<option value="1">여자 테라피스트</option>
						<option value="2">남자 테라피스트</option>
					</select>
				</div>	
				<div class="col-3 p-1 mb-5 offset-1">	
					<div class="input-group mb-2">
	  						<input type="text" class="form-control" placeholder="검색어를 입력하세요" aria-label="Recipient's username" aria-describedby="button-addon2">
	  						<button class="btn btn-primary" type="button" id="button-addon2">검색</button>
					</div>	
				</div>
 

 <!--  <div class="album py-5 bg-light"> -->

      <div class="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3">
        <div class="col">
          <div class="card shadow-sm mb-5" style="width:392px" >
          <div>
          	<img src="${root}/image/therapist2 .jpg">
          </div>
            <!-- <svg class="bd-placeholder-img card-img-top" width="100%" height="225" role="img"  preserveAspectRatio="xMidYMid slice" focusable="false"></svg> -->
             <div class="card-body">
              <p class="card-text">김혜진테라피스트<br>주요지역: 제주도</p>
              <div class="d-flex justify-content-between align-items-center">
                <div class="col">
                	 <a href="${root}service/therapistdetail" class="btn btn-primary" style="width:100px">더보기</a>
                 </div>
                <small class="text-muted"><img src="${root}/image/heart.png"><span class="align-bottom"></small>
              </div>
            </div>
          </div>
        </div>
        
        <div class="col">
          <div class="card shadow-sm mb-5" style="width:392px">
           <!--  <svg class="bd-placeholder-img card-img-top" width="100%" height="225" role="img"  preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" /></svg> -->
              <div>
	          	<img src="${root}/image/therapist2 .jpg">
	          </div>
             <div class="card-body">
              <p class="card-text">김혜진 테라피스트<br>주요지역: 제주도</p>
              <div class="d-flex justify-content-between align-items-center">
                <div class="col">
                	 <a href="${root}service/therapistdetail" class="btn btn-primary" style="width:100px">더보기</a>
                 </div>
              <small class="text-muted"><img src="${root}/image/heart.png"><span class="align-bottom"></small> 
              </div>
            </div>
          </div>
        </div>
        
        <div class="col">
          <div class="card shadow-sm mb-5" style="width:392px">
            <!-- <svg class="bd-placeholder-img card-img-top" width="100%" height="225" role="img"  preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" /></svg> -->
             <div>
	          	<img src="${root}/image/therapist2 .jpg">
	          </div>
             <div class="card-body">
              <p class="card-text">김혜진테라피스트<br>주요지역: 제주도</p>
              <div class="d-flex justify-content-between align-items-center">
                <div class="col">
                	 <a href="${root}service/therapistdetail" class="btn btn-primary" style="width:100px">더보기</a>
                 </div>
                <small class="text-muted"><img src="${root}/image/heart.png"><span class="align-bottom"></small>
              </div>
            </div>
          </div>
        </div>

       <div class="col">
          <div class="card shadow-sm mb-5" style="width:392px" >
          <div>
          	<img src="${root}/image/therapist2 .jpg">
          </div>
             <div class="card-body">
              <p class="card-text">김혜진테라피스트<br>주요지역: 제주도</p>
              <div class="d-flex justify-content-between align-items-center">
                 <div class="col">
                	 <a href="${root}service/therapistdetail" class="btn btn-primary" style="width:100px">더보기</a>
                 </div>
                <small class="text-muted"><img src="${root}/image/heart.png"><span class="align-bottom"></small>
              </div>
            </div>
          </div>
        </div>
        
       <div class="col">
          <div class="card shadow-sm mb-5" style="width:392px">
          <div>
          	<img src="${root}/image/therapist2 .jpg">
          </div>          
             <div class="card-body">
              <p class="card-text">김혜진테라피스트<br>주요지역: 제주도</p>
              <div class="d-flex justify-content-between align-items-center">
                 <div class="col">
                	 <a href="${root}service/therapistdetail" class="btn btn-primary" style="width:100px">더보기</a>
                 </div>
                <small class="text-muted"><img src="${root}/image/heart.png"><span class="align-bottom"></small>
              </div>
            </div>
          </div>
        </div>
        
       <div class="col">
          <div class="card shadow-sm mb-5" style="width:392px">
          <div>
          	<img src="${root}/image/therapist2 .jpg">
          </div>  
             <div class="card-body">
              <p class="card-text">김혜진테라피스트<br>주요지역: 제주도</p>
              <div class="d-flex justify-content-between align-items-center">
                 <div class="col">
                	 <a href="${root}service/therapistdetail" class="btn btn-primary" style="width:100px">더보기</a>
                 </div>
                <small class="text-muted"><img src="${root}/image/heart.png"><span class="align-bottom"></small>
              </div>
            </div>
          </div>
        </div>

       <div class="col">
          <div class="card shadow-sm mb-5" style="width:392px">
          <div>
          	<img src="${root}/image/therapist2 .jpg">
          </div>  
             <div class="card-body">
              <p class="card-text">김혜진테라피스트<br>주요지역: 제주도</p>
              <div class="d-flex justify-content-between align-items-center">
                 <div class="col">
                	 <a href="${root}service/therapistdetail" class="btn btn-primary" style="width:100px">더보기</a>
                 </div>
                <small class="text-muted"><img src="${root}/image/heart.png"><span class="align-bottom"></small>
              </div>
            </div>
          </div>
        </div>
        
        <div class="col">
           <div class="card shadow-sm mb-5" style="width:392px">
          <div>
          	<img src="${root}/image/therapist2 .jpg">
          </div>  
             <div class="card-body">
              <p class="card-text">김혜진테라피스트<br>주요지역: 제주도</p>
              <div class="d-flex justify-content-between align-items-center">
                 <div class="col">
                	 <a href="${root}service/therapistdetail" class="btn btn-primary" style="width:100px">더보기</a>
                 </div>
                <small class="text-muted"><img src="${root}/image/heart.png"><span class="align-bottom"></small>
              </div>
            </div>
          </div>
        </div>
        
   		<div class="col">
          <div class="card shadow-sm mb-5" style="width:392px">
          <div>
          	<img src="${root}/image/therapist2 .jpg">
          </div>  
             <div class="card-body">
              <p class="card-text">김혜진테라피스트<br>주요지역: 제주도</p>
              <div class="d-flex justify-content-between align-items-center">
                 <div class="col">
                	 <a href="${root}service/therapistdetail" class="btn btn-primary" style="width:100px">더보기</a>
                 </div>
                <small class="text-muted"><img src="${root}/image/heart.png"><span class="align-bottom"></small>
              </div>
            </div>
          </div>
        </div>
				
			<%-- 	
<!-- 					<div class="col-3">									 -->
<!-- 						<div class="position-relative mx-auto" style="max-width:400px;"> -->

<!-- 							<input class="form-control border-0 w-100 py-3 ps-4 pe-5;"  -->
<!-- 								type="text" placeholder="검색어를 입력하세요" /> -->
<!-- 							<button type="button"  -->
<!-- 							class="btn btn-primary py-2 position-absolute top-0 end-0 mt-2 me-2"> -->
<!-- 								검색 -->
<!-- 							</button> -->
<!-- 					</div> -->
				
				<div class="card" style="width: 18rem; margin-left:5px; margin-right:45px;">
				  <img src="${root}image/therapist.JPG" class="card-img-top"  style="height:30rem;" alt="...">
					  <div class="card-body">
					    <h5 class="card-title">김혜진 테라피스트</h5>
					    <p class="card-text">주요지역 : 경북 / 경남 <br>
						경력: 6년<br></p>

			           <div class="row">
				           <div class="col"><a href="${root}service/therapistdetail" class="btn btn-primary" style="width:100px; margin-top:20px;">더보기</a></div>	   
				           <div class="col text-end pt-4"><img src="${root}/image/heart.png"><span class="align-bottom"> 2,500</span> </div>
			           </div>
					</div>
				</div>
						--%>
				
			</div>
		</div>		
		</div>
</div>

	<c:import url="/WEB-INF/views/include/bottom_info.jsp"></c:import>

	<!-- Back to Top -->
	<a href="#" class="btn btn-lg btn-primary btn-lg-square back-to-top"><i
		class="bi bi-arrow-up"></i></a>

	<!-- JavaScript Libraries -->
	<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js"></script>
	<script src="../lib/wow/wow.min.js"></script>
	<script src="../lib/easing/easing.min.js"></script>
	<script src="../lib/waypoints/waypoints.min.js"></script>
	<script src="../lib/counterup/counterup.min.js"></script>
	<script src="../lib/owlcarousel/owl.carousel.min.js"></script>
	<script src="../lib/lightbox/js/lightbox.min.js"></script>

	<!--Template Javascript  -->
	<script src="../js/main.js"></script>
</body>
</html>
