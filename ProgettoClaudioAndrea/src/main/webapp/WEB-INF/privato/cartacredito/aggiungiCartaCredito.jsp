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
<%@page import="it.unirc.pwm.ht.join.dao.ComponeDAO"%>
<%-- <%@page import="it.unirc.pwm.ht.dao.ProdottoDAO"%> --%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%-- <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> --%>
<%@page import="it.unirc.pwm.ht.Cliente"%>
<%@page import="it.unirc.pwm.ht.dao.CartaCreditoDAO"%>
<%@page import="it.unirc.pwm.ht.CartaCredito"%>
<%@ page import="java.util.Vector"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<title>Aggiungi Carta di Credito</title>
<%@include file="/WEB-INF/head.jsp"%>

<link rel="stylesheet" type="text/css"
	href="/css/AggiungiCartaCredito.css">

</head>
<body>

	<%-- <%@ include file="/WEB-INF/checkCliente.jsp" %> --%>


	<%@include file="/WEB-INF/preload.jsp"%>
	<%-- 
	<%@include file="/WEB-INF/header-scriptlet.jsp"%> --%>

	<%-- 	<%@include file="/WEB-INF/header.jsp"%> --%>



	<section id="contact-us" class="contact-us section">
		<div class="container">
			<div class="contact-head">
				<div class="row">
					<div class="col-lg-12 col-12">
						<div class="form-main">
							<div class="title">
								<h3 style="color: #f7941d">Aggiungi carta credito</h3>
							</div>
							
							<s:form id="form" class="form" method="post"
								action="/actions/privato/cartacredito/AggiungiCartaCredito"
								theme="simple">
								<div class="row">
									<div class="col-lg-6 col-12">
										<div class="form-group">
											<label for="numeroCarta" class="font-weight-bold">Numero
												Carta</label>
											<s:textfield id="numeroCarta" placeholder="numero di carta"
												type="text" onkeypress="return onlyNumbers(event)"
												title="Il numero carta deve avere tra 13 e 16 cifre"
												name="carta.numeroCarta" maxlength="16" pattern=".{13,16}"
												requiredLabel="true" />
											<!-- small element serve per mostrare un messaggio d'errore nel caso 
					in cui gli input siano errati -->
											<small></small>
										</div>
									</div>
									<div class="col-lg-6 col-12">
										<div class="form-group">
											<label for="intestatario" class="font-weight-bold">Intestatario</label>
											<s:textfield id="intestatario" placeholder="intestatario"
												type="text" name="carta.intestatario"
												onkeypress="return alphaOnly(event)" requiredLabel="true" />
											<small></small>
										</div>
									</div>
									
									<div class="col-lg-6 col-12">
										<div class="form-group">
											<label for="codiceSicurezza" class="font-weight-bold">Codice
												Sicurezza</label>
											<s:textfield id="codiceSicurezza"
												placeholder="codice di sicurezza" type="text"
												name="carta.codiceSicurezza" pattern=".{3,}"
												onkeypress="return onlyNumbers(event)" />
											<small></small>
										</div>
									</div>
									<div class="col-12">
										<div class="form-group button">
											<button class="btn" onclick="history.go(-1); return false;">Annulla</button>
											<button type="submit" class="btn" >Aggiungi</button>
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

	<script type="text/javascript" charset="UTF-8"
		src="/js/CartaCredito/funzioni.js"></script>

</body>
</html>