<%@ taglib prefix="s" uri="/struts-tags"%>
<%@page import="it.unirc.pwm.ht.Sottocategoria"%>
<%-- <%@page import="it.unirc.pwm.ht.dao.SottocategoriaDAO"%> --%>
<%@page import="java.util.Enumeration"%>
<%@page import="java.util.HashMap"%>
<%@page import="it.unirc.pwm.ht.Cliente"%>
<%@page import="it.unirc.pwm.ht.dao.ClienteDAO"%>
<%@page import="it.unirc.pwm.ht.dao.ClienteDAOFactory"%>
<%@page import="it.unirc.db.ecommerce.views.ViewProduct"%>
<%@page import="it.unirc.pwm.ht.dao.CategoriaDAO"%>
<%@page import="it.unirc.pwm.ht.dao.CategoriaDAOFactory"%>
<%@page import="it.unirc.db.ecommerce.views.Compone"%>
<%@page import="java.util.List"%>
<%@page import="it.unirc.pwm.ht.Categoria"%>
<%@page import="it.unirc.pwm.ht.Carrello"%>
<%@page import="it.unirc.pwm.ht.dao.CarrelloDAO"%>
<%@page import="it.unirc.pwm.ht.dao.ArticoloDAO"%>
<%@page import="it.unirc.pwm.ht.dao.ArticoloDAOFactory"%>
<%@page import="it.unirc.db.ecommerce.views.GridProduct"%>
<%@page import="it.unirc.pwm.ht.Prodotto"%>
<%@page import="it.unirc.pwm.ht.join.dao.ComponeDAO"%>
<%@page import="java.util.Vector"%>
<%-- <%@page import="it.unirc.pwm.ht.dao.ProdottoDAO"%> --%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%-- <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> --%>
<%@page import="it.unirc.pwm.ht.Cliente"%>
<!DOCTYPE html>
<html lang="zxx">
<head>

<%@include file="/WEB-INF/head.jsp"%>
<link rel="stylesheet" href="/css/product.css">



</head>
<body class="js">


	<%@include file="/WEB-INF/header.jsp"%>






	<!-- Product Style -->
	<section class="product-area shop-sidebar shop section">
		<div class="container">
			<div class="row">
				
				<div class="col-lg-12 col-md-12 col-12">


					<div class="row">
						<s:iterator value="#session.articoli" var="articolo">
							<div class="col-lg-3 col-md-4 col-12">
								<div class="single-product">
									<div class="product-img">
										<s:form action="/actions/privato/articolo/ProductDetails"
											method="post">
											<s:textfield name="articolo.idArticolo"
												value="%{#articolo.idArticolo}" type="hidden"
												readonly="true" />
											<button type="submit">
												<img class="hover-img"
													src="https://via.placeholder.com/550x750" alt="#">
											</button>

										</s:form>
									</div>
									<div class="product-content">
										<h3>

											<s:property value="#articolo.prodotto.nome" />









										</h3>
										<div class="product-price">
											<span><s:property value="#articolo.prezzo" />€</span>
										</div>
									</div>
								</div>
							</div>
						</s:iterator>

					</div>
				</div>
			</div>
		</div>
	</section>
	<!--/ End Product Style 1  -->


	

	<%@include file="/WEB-INF/footer.jsp"%>
	<%-- 	<%@include file="/WEB-INF/js.jsp"%> --%>

	<!-- Jquery -->
	<script src="js/jquery.min.js"></script>
	<script src="js/jquery-migrate-3.0.0.js"></script>
	<script src="js/jquery-ui.min.js"></script>
	<!-- Popper JS -->
	<script src="js/popper.min.js"></script>
	<!-- Bootstrap JS -->
	<script src="js/bootstrap.min.js"></script>
	<!-- Color JS -->
	<script src="js/colors.js"></script>
	<!-- Slicknav JS -->
	<script src="js/slicknav.min.js"></script>
	<!-- Owl Carousel JS -->
	<script src="js/owl-carousel.js"></script>
	<!-- Magnific Popup JS -->
	<script src="js/magnific-popup.js"></script>
	<!-- Fancybox JS -->
	<script src="js/facnybox.min.js"></script>
	<!-- Waypoints JS -->
	<script src="js/waypoints.min.js"></script>
	<!-- Countdown JS -->
	<script src="js/finalcountdown.min.js"></script>
	<!-- Nice Select JS -->
	<script src="js/nicesellect.js"></script>
	<!-- Ytplayer JS -->
	<script src="js/ytplayer.min.js"></script>
	<!-- Flex Slider JS -->
	<script src="js/flex-slider.js"></script>
	<!-- ScrollUp JS -->
	<script src="js/scrollup.js"></script>
	<!-- Onepage Nav JS -->
	<script src="js/onepage-nav.min.js"></script>
	<!-- Easing JS -->
	<script src="js/easing.js"></script>
	<!-- Active JS -->
	<script src="js/active.js"></script>
	<script src="js/myscript.js"></script>



</body>
</html>