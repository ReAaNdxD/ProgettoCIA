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
	<%--     <%
    if (session.getAttribute("indirizzo") == null) {
        out.write("Errore :-(");
        return;
    }
    VisualizzaIndirizzoSpedizione i = (VisualizzaIndirizzoSpedizione) session.getAttribute("indirizzo");
    %> --%>
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
								<div class="error-inner">
								</div>
							</div>
						
							<div class="error-page">
								<div class="error-inner">
								</div>
							</div>
                            <s:actionerror/>
							<s:form action="actions/privato/ModificaIndirizzoSpedizione" theme="simple"
								method="post" validate="true">
								<div class="row">
									<div class="col-lg-6 col-12">
										<div class="form-group">
											<s:textfield id="regione" placeholder="Regione"
												name="i.regione" cssClass="form-control"
												value="%{#i.regione}" required="true" />
											<small></small>
										</div>
									</div>
									<div class="col-lg-6 col-12">
										<div class="form-group">
											<s:textfield id="provincia" placeholder="Provincia"
												name="i.provincia" cssClass="form-control"
												value="%{#i.provincia}" required="true" />
											<small></small>
										</div>
									</div>
									<div class="col-lg-6 col-12">
										<div class="form-group">
											<s:textfield id="citta" placeholder="Città" name="i.citta"
												cssClass="form-control" value="%{#i.citta}" required="true" />
											<small></small>
										</div>
									</div>
									<div class="col-lg-6 col-12">
										<div class="form-group">
											<s:textfield id="via" placeholder="Via" name="i.via"
												cssClass="form-control" value="%{#i.via}" required="true" />
											<small></small>
										</div>
									</div>
									<div class="col-lg-6 col-12">
										<div class="form-group">
											<s:textfield id="numeroCivico" placeholder="Numero Civico"
												name="i.numeroCivico" cssClass="form-control"
												value="%{#i.numeroCivico}" required="true" />
											<small></small>
										</div>
									</div>
									<div class="col-lg-6 col-12">
										<div class="form-group">
											<s:textfield id="cap" placeholder="CAP" name="i.cap"
												cssClass="form-control" value="%{#i.cap}" required="true" />
											<small></small>
										</div>
									</div>
									<div class="col-lg-6 col-12">
										<div class="form-group">
											<s:textfield id="numeroTelefonico" placeholder="Telefono"
												name="i.numeroTelefonico" cssClass="form-control"
												value="%{#i.numeroTelefonico}" required="true" />
											<small></small>
										</div>
									</div>
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