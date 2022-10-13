<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:set var="root" value="${pageContext.request.contextPath }/"/>

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
<!-- google icon -->
<link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@48,500,0,0" />

<!-- Libraries Stylesheet -->
<link href="../lib/animate/animate.min.css" rel="stylesheet" />
<link href="../lib/lightbox/css/lightbox.min.css" rel="stylesheet" />
<link href="../lib/owlcarousel/assets/owl.carousel.min.css"
	rel="stylesheet" />
<!-- Customized Bootstrap Stylesheet -->
<link href="../css/bootstrap.min.css" rel="stylesheet" />
<!-- Template Stylesheet -->
<link href="../css/style.css" rel="stylesheet" />
<link href="../css/rome.css" rel="stylesheet" >
<link href="../css/bootstrap-datepicker.kr.js" rel="stylesheet" />
<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/timepicker/1.3.5/jquery.timepicker.min.css">




<c:forEach var="obj" items="${dogBookList}">
        <div class="col">
            <div class="card2 mb-4 rounded-3">
                
                <div class="form-check form-inline-block py-3" style="margin: 0 auto;">
                    <input class="form-check-input h4" type="radio" value="24" name="dog_idx" id="${obj.dog_idx}">
                    <label class="form-check-label h5 pt-2" for="${obj.dog_idx}">${obj.dog_name}</label>
                </div>
                
                <div class="card-body">
                    <div class="position-relative"  style="min-height: 500px;">
                    <img class="img-fluid" src="${root }upload/${obj.dog_picture}" alt="테라피독 ${obj.dog_name}" />
                        <div class="animal-text p-4">
                            <h5 class="text-white mb-0">${obj.dog_name}</h5>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </c:forEach> 
    
<nav aria-label="Page navigation example" style="margin: 0 auto;">
    <ul class="pagination">
        <li class="page-item"><a class="page-link" href="?page=1" aria-label="Previous"><span aria-hidden="true">&laquo;</span></a></li> 
        <li class="page-item"><a class="page-link" href="?page=${pager.prev}"><span aria-hidden="true" style="font-size:0.6em;"><i class="bi bi-chevron-left"></i></span></a></li>		
                        
        <c:forEach var="page" items="${pager.list}">
        <li class="page-item"><a class="page-link" href="?page=${page}">${page}</a></li>
        </c:forEach>
                    
        <li class="page-item"><a class="page-link" href="?page=${pager.next}"><span aria-hidden="true" style="font-size:0.6em;"><i class="bi bi-chevron-right"></i></span></a></li>
        <li class="page-item"><a class="page-link" aria-label="Next" href="?page=${pager.last}"><span aria-hidden="true">&raquo;</span></a></li>
    </ul>
</nav>	