<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<!DOCTYPE html>
<html>
<head>
<title>Visualizza Indirizzi di Spedizione</title>
<%@ include file="/WEB-INF/head.jsp"%>
</head>
<body>

	<div class="shopping-cart section">
		<div class="container">
			<div class="row">
				<div class="col-12">
					<table class="table shopping-summery">
						<thead>
							<tr class="main-hading">
								<th class="text-center">Regione</th>
								<th class="text-center">Provincia</th>
								<th class="text-center">Città</th>
								<th class="text-center">Via</th>
								<th class="text-center">Numero Civico</th>
								<th class="text-center">CAP</th>
								<th class="text-center">Telefono</th>
								<th class="text-center"></th>
								<th class="text-center"></th>
							</tr>
						</thead>
						<tbody>
						
							<s:iterator value="#session.indirizziSpedizione" var="indirizzo">
							<s:hidden value="#indirizzo.idIndirizzoSpedizione" name="id"
										label="" />
								<tr>
									<td style="text-align: center;"><s:property
											value="#indirizzo.regione" /></td>
									<td style="text-align: center;"><s:property
											value="#indirizzo.provincia" /></td>
									<td style="text-align: center;"><s:property
											value="#indirizzo.citta" /></td>
									<td style="text-align: center;"><s:property
											value="#indirizzo.via" /></td>
									<td style="text-align: center;"><s:property
											value="#indirizzo.ncivico" /></td>
									<td style="text-align: center;"><s:property
											value="#indirizzo.cap" /></td>
									<td style="text-align: center;"><s:property
											value="#indirizzo.telefono" /></td>
									<td>
										<div class="button"></div>
									</td>
									<td>
										<div class="button">
										
											<a
												href="/actions/privato/indirizzospedizione/RichiediModificaIndirizzoSpedizione?id=<s:property value="#indirizzo.idIndirizzoSpedizione" />">
												<button type="button" class="btn btn-primary">Modifica</button>
											</a>
										</div>
									</td>
								</tr>
							</s:iterator>
						</tbody>
					</table>
				</div>
			</div>
		</div>
		<br>
		<div align="center">
			<a type="button"
				href="/actions/privato/indirizzospedizione/RichiediAggiungiIndirizzoSpedizione"
				class="btn btn-primary"> Crea un nuovo indirizzo spedizione </a>
		</div>
	</div>

	<script type="text/javascript"
		src="/js/IndirizzoSpedizione/funzioniIS.js"></script>

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
	<script src="/js/active.js"></script>
	<script src="/js/myscript.js"></script>

</body>
</html>