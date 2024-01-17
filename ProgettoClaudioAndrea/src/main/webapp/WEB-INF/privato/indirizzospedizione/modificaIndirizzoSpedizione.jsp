<%@ taglib uri="/struts-tags" prefix="s"%>
<%@page import="java.util.Enumeration"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="java.text.NumberFormat"%>
<%@page import="it.unirc.db.ecommerce.views.ViewProduct"%>
<%@page
	import="it.unirc.pwm.actions.privato.indirizzospedizione.VisualizzaIndirizzoSpedizione"%>
<%@page import="java.util.Vector"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Modifica Indirizzo Spedizione</title>
<%@ include file="/WEB-INF/head.jsp"%>
<link rel="stylesheet" type="text/css"
	href="/css/AggiungiCartaCredito.css">
</head>
<body>

	<%@include file="/WEB-INF/preload.jsp"%>
	<%@include file="/WEB-INF/header.jsp"%>
	
	
	<section id="contact-us" class="contact-us section">
		<div class="container">
			<div class="contact-head">
				<div class="row">
					<div class="col-lg-12 col-12">
						<div class="form-main">
							<div class="title">
								<h3 style="color: #f7941d">Modifica Indirizzo Di Spedizione</h3>
							</div>

							<div class="error-page">
								<div class="error-inner"></div>
							</div>

							<div class="error-page">
								<div class="error-inner"></div>
							</div>
							<s:actionerror />
							<s:form
								action="/actions/privato/indirizzospedizione/ModificaIndirizzoSpedizione"
								theme="simple" method="post" validate="true">
								<div class="row">
									<div class="col-lg-6 col-12">
										<div class="form-group">
										<s:hidden value="%{#session.indirizzo.idIndirizzoSpedizione}"
												name="id" label="" />
										<label for="Regione" class="font-weight-bold">Regione</label>
											<s:textfield id="regione" placeholder="Regione"
												name="indirizzo.regione" cssClass="form-control"
												value="%{#session.indirizzo.regione}" required="true" />
											
											<small></small>
										</div>
									</div>
									<div class="col-lg-6 col-12">
										<div class="form-group">
										<label for="provincia" class="font-weight-bold">Provincia</label>
											<s:textfield id="provincia" placeholder="Provincia"
												name="indirizzo.provincia" cssClass="form-control"
												value="%{#session.indirizzo.provincia}" required="true"
												maxlength="2" pattern=".{2,}"
												title="Provincia deve avere 2 lettere"
												 style="text-transform: uppercase" />
											<small></small>
										</div>
									</div>
									<div class="col-lg-6 col-12">
										<div class="form-group">
										<label for="citta" class="font-weight-bold">Città</label>
											<s:textfield id="citta" placeholder="Città"
												name="indirizzo.citta" cssClass="form-control"
												value="%{#session.indirizzo.citta}" required="true" />
											<small></small>
										</div>
									</div>
									<div class="col-lg-6 col-12">
										<div class="form-group">
										<label for="cia" class="font-weight-bold">via</label>
											<s:textfield id="via" placeholder="Via" name="indirizzo.via"
												cssClass="form-control" value="%{#session.indirizzo.via}"
												required="true" />
											<small></small>
										</div>
									</div>
									<div class="col-lg-6 col-12">
										<div class="form-group">
										<label for="civico" class="font-weight-bold">Civico</label>
											<s:textfield id="ncivico" placeholder="Numero Civico"
												name="indirizzo.ncivico" cssClass="form-control"
												value="%{#session.indirizzo.ncivico}" required="true"
												maxlength="3" />
											<small></small>
										</div>
									</div>
									<div class="col-lg-6 col-12">
										<div class="form-group">
										<label for="cap" class="font-weight-bold">CAP</label>
											<s:textfield id="cap" placeholder="CAP" name="indirizzo.cap"
												cssClass="form-control" value="%{#session.indirizzo.cap}"
												required="true" maxlength="5" pattern=".{5,}"
												title="CAP deve avere 5 cifre" />
											<small></small>
										</div>
									</div>
									<div class="col-lg-6 col-12">
										<div class="form-group">
										<label for="telefono" class="font-weight-bold">Telefono</label>
											<s:textfield id="Telefono" placeholder="Telefono"
												name="indirizzo.telefono" cssClass="form-control"
												value="%{#session.indirizzo.telefono}" required="true"
												maxlength="10" pattern=".{10,}"
												title="Inserire un numero di telefono di 10 cifre" />
											<small></small>
										</div>
									</div>
									<%-- <div class="col-lg-6 col-12">
										<div class="form-group">
											<label for="preferito">Preferito</label>
											<s:checkbox id="preferito" name="indirizzo.preferito" />
										</div>
									</div> --%>
									<div class="col-12">
										<div class="form-group button">
											<button class="btn" onclick="history.go(-1); return false;">Annulla</button>
											<s:submit value="Modifica" cssClass="btn" />
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

	<script type="text/javascript" charset="UTF-8"
		src="/js/IndirizzoSpedizione/funzioniIS.js"></script>


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
	<script src="/js/active.js"></script>
	<script src="/js/myscript.js"></script>


</body>
</html>