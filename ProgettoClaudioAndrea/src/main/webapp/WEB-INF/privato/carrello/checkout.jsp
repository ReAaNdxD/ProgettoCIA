<%@ taglib prefix="s" uri="/struts-tags"%>
<%@page import="it.unirc.db.ecommerce.views.GridProduct"%>
<%@page import="it.unirc.pwm.ht.Cliente"%>
<%@page import="it.unirc.pwm.ht.dao.ClienteDAO"%>
<%@page import="it.unirc.pwm.ht.dao.ClienteDAOFactory"%>
<%@page import="it.unirc.db.ecommerce.views.ViewProduct"%>
<%@page import="it.unirc.pwm.ht.dao.ArticoloDAO"%>
<%@page import="it.unirc.pwm.ht.dao.ArticoloDAOFactory"%>
<%@page import="it.unirc.db.ecommerce.views.Compone"%>
<%@page import="java.util.Vector"%>
<%@page import="java.util.List"%>
<%@page import="it.unirc.pwm.ht.Carrello"%>
<%@page import="it.unirc.pwm.ht.dao.CarrelloDAO"%>
<%-- <%@page import="it.unirc.db.ecommerce.beans.join.ArticoloComponeCarrelloDAO"%><!--  --> --%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@page import="it.unirc.pwm.ht.dao.CategoriaDAO"%>
<%@page import="it.unirc.pwm.ht.dao.CategoriaDAOFactory"%>
<%@page import="it.unirc.pwm.ht.Categoria"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Checkout</title>
<%@include file="/WEB-INF/head.jsp"%>
<link rel="stylesheet" href="/css/AggiungiCartaCredito.css">
</head>
<body class="js">



	<%@include file="/WEB-INF/preload.jsp"%>
	<%@include file="/WEB-INF/header.jsp"%>

	<section class="product-area shop-sidebar shop section">
		<div class="container">
			<div class="row account">


				<!--/ End Product Style 1  -->

				<div class="col-lg-12 col-12 contact-us">
					<div class="contact-head">
						<div class="form-main">
							<div class="title text-center">
								<h3 style="color: #f7941d;">
									Ordine
									<svg xmlns="http://www.w3.org/2000/svg" width="20" height="16"
										fill="currentColor" class="bi bi-person-check-fill"
										viewBox="0 0 16 16">
                  <path fill-rule="evenodd"
											d="M15.854 5.146a.5.5 0 0 1 0 .708l-3 3a.5.5 0 0 1-.708 0l-1.5-1.5a.5.5 0 0 1 .708-.708L12.5 7.793l2.646-2.647a.5.5 0 0 1 .708 0z" />
                  <path
											d="M1 14s-1 0-1-1 1-4 6-4 6 3 6 4-1 1-1 1H1zm5-6a3 3 0 1 0 0-6 3 3 0 0 0 0 6z" />
                </svg>
								</h3>
							</div>
							
							<s:form class="form" method="post">
								<div class="row">
									<div class="col-12">
										<div class="form-group">
											<label class="font-weight-bold" style="text-align: center;">Ciao
												<s:property value="#session.cliente.nome" /> il tuo ordine è stato preso in
												carico</label>
										</div>
									</div>


								</div>
							</s:form>



						</div>
					</div>
				</div>
			</div>
		</div>
	</section>


	<%@ include file="/WEB-INF/footer.jsp"%>

	<!-- Jquery -->
	<script src="/js/jquery.min.js"></script>
	<script src="/js/jquery-migrate-3.0.0.js"></script>
	<script src="/js/jquery-ui.min.js"></script>
	<!-- Popper JS -->
	<script src="/js/popper.min.js"></script>
	<!-- Bootstrap JS -->
	<script src="/js/bootstrap.min.js"></script>
	<!-- Color JS -->
	<script src="/js/colors.js"></script>
	<!-- Slicknav JS -->
	<script src="/js/slicknav.min.js"></script>
	<!-- Owl Carousel JS -->
	<script src="/js/owl-carousel.js"></script>
	<!-- Magnific Popup JS -->
	<script src="/js/magnific-popup.js"></script>
	<!-- Waypoints JS -->
	<script src="/js/waypoints.min.js"></script>
	<!-- Countdown JS -->
	<script src="/js/finalcountdown.min.js"></script>
	<!-- Nice Select JS -->
	<script src="/js/nicesellect.js"></script>
	<!-- Flex Slider JS -->
	<script src="/js/flex-slider.js"></script>
	<!-- ScrollUp JS -->
	<script src="/js/scrollup.js"></script>
	<!-- Onepage Nav JS -->
	<script src="/js/onepage-nav.min.js"></script>
	<!-- Easing JS -->
	<script src="/js/easing.js"></script>
	<!-- Active JS -->
	<script src="/js/active.js"></script>
	<script src="/js/myscript.js"></script>


</body>
</html>