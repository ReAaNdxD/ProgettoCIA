<%@ taglib uri="/struts-tags" prefix="s"%>
<%@page import="it.unirc.pwm.ht.Sottocategoria"%>
<%-- <%@page import="it.unirc.pwm.ht.dao.SottocategoriaDAO"%> --%>
<%@page import="java.util.Enumeration"%>
<%@page import="java.util.HashMap"%>
<%@page import="it.unirc.db.ecommerce.views.ViewProduct"%>
<%@page import="it.unirc.pwm.ht.dao.CategoriaDAO"%>
<%@page import="it.unirc.pwm.ht.Categoria"%>
<%@page import="it.unirc.pwm.ht.Carrello"%>
<%@page import="it.unirc.pwm.ht.dao.CarrelloDAO"%>
<%@page import="it.unirc.pwm.ht.dao.ArticoloDAO"%>
<%@page import="it.unirc.db.ecommerce.views.GridProduct"%>
<%@page import="it.unirc.pwm.ht.Prodotto"%>
<%@page
	import="it.unirc.pwm.ht.join.dao.ComponeDAO"%>
<%-- <%@page import="it.unirc.pwm.ht.dao.ProdottoDAO"%> --%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%-- <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> --%>
<%@page import="it.unirc.pwm.ht.Cliente"%>
<%@page import="it.unirc.pwm.ht.dao.CartaCreditoDAO"%>
<%@page import="it.unirc.pwm.ht.CartaCredito"%>
<%@ page import="java.util.Vector"%>
<!DOCTYPE html>
<html>
<head>
<title>Visualizza Carte Di Credito</title>
<%@include file="/WEB-INF/head.jsp" %>

</head>
<body>


	<%@include file="/WEB-INF/preload.jsp"%>
	<%@include file="/WEB-INF/header.jsp"%>




	<!-- Shopping Cart Section -->

	<div class="shopping-cart section">
		<div class="container">
			<div class="row">
				<div class="col-12">
					<!-- Shopping Summery -->
					<table class="table shopping-summery">
						<thead>
							<tr class="main-hading">
								<th class="text-center">NUMERO CARTA</th>
								<th class="text-center">INTESTATARIO</th>
								<th class="text-center"></th>
							</tr>
						</thead>
						<tbody>
							<s:iterator value="#session.carteCredito" var="carta">
							
								<tr>
								<%-- <s:hidden value="#carta.idCartaCredito" name="id"
										label="" /> --%>
									<td style="text-align: center;"><s:property
											value="#carta.numeroCarta" /></td>
									<td style="text-align: center;"><s:property
											value="#carta.intestatario" /></td>
									<td>
										<div class="button">
											<a
												href="/actions/privato/cartacredito/RichiediModificaCartaCredito?id=<s:property value="#carta.idCartaCredito" />">
												<button type="button" class="btn btn-primary">Modifica</button>
											</a>
										</div>
									</td>
								</tr>
							</s:iterator>
					</table>
					
					<!--/ End Shopping Summery -->
				</div>
			</div>
		</div>
		
		<br>
		<div align="center">
			<a type="button"
				href="/actions/privato/cartacredito/RichiediAggiungiCartaCredito"
				class="btn btn-primary">Aggiungi carta</a>
		</div>
	</div>
	
	<%@include file="/WEB-INF/footer.jsp"%>
	<%-- 	<%@include file="/WEB-INF/js.jsp"%> --%>

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
	<!-- Fancybox JS -->
	<script src="/js/facnybox.min.js"></script>
	<!-- Waypoints JS -->
	<script src="/js/waypoints.min.js"></script>
	<!-- Countdown JS -->
	<script src="/js/finalcountdown.min.js"></script>
	<!-- Nice Select JS -->
	<script src="/js/nicesellect.js"></script>
	<!-- Ytplayer JS -->
	<script src="/js/ytplayer.min.js"></script>
	<!-- Flex Slider JS -->
	<script src="/js/flex-slider.js"></script>
	<!-- ScrollUp JS -->
	<script src="/js/scrollup.js"></script>
	<!-- Onepage Nav JS -->
	<script src="/js/onepage-nav.min.js"></script>
	<!-- Easing JS -->
	<script src="/js/easing.js"></script>
	<!-- Active JS -->
	<script src="/js/CartaCredito/funzioniVisualizzaCC.js"></script>
	<script src="/js/active.js"></script>
	<script src="/js/myscript.js"></script>


</body>
</html>