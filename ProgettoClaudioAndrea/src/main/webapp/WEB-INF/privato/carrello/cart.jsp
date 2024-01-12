<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="zxx">
<head>
    <%@include file="/WEB-INF/head.jsp" %>
</head>
<body class="js">
    <div class="shopping-cart section">
        <div class="container">
            <div class="row">
                <div class="col-12">
                    <table class="table shopping-summery">
                        <thead>
                            <tr class="main-hading">
                                <th class="text-center">Prezzo</th>
                                <th class="text-center">Quantità</th>
                                <th class="text-center"></th>
                            </tr>
                        </thead>
                        <tbody>
                            <s:iterator value="#session.listaArticoli" var="articolo">
                                <tr>
                                    <td style="text-align: center;"><s:property value="#articolo.prezzo" />€</td>
                                    <td style="text-align: center;"><s:property value="#articolo.quantita" /></td>
                                    <td>
                                        <div class="button">
                                            <a href="/actions/privato/carrello/ModificaQuantita?id=<s:property value="#articolo.idArticolo" />">
                                                <button type="button" class="btn btn-primary">Modifica Quantità</button>
                                            </a>
                                            <a href="/actions/privato/carrello/RimuoviArticolo?id=<s:property value="#articolo.idArticolo" />">
                                                <button type="button" class="btn btn-danger">Rimuovi</button>
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
            <a href="/privato/cliente/ordine/RichiediCheckOut" class="btn btn-primary">Procedi all'Ordine</a>
        </div>
    </div>

	<!--/ End Shopping Cart -->

	<%@include file="/WEB-INF/footer.jsp" %>																																				
	
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
	<script src="/js/active.js"></script>
	<script src="/js/myscript.js"></script>
	<script src="/js/js.js"></script>
</body>
</html>
