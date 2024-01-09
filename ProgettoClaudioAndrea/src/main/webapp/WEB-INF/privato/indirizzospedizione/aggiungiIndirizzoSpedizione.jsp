
<%@page import="java.util.Enumeration"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="java.text.NumberFormat"%>
<%@page import="it.unirc.db.ecommerce.views.ViewProduct"%>

<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
    <title>Aggiungi Indirizzo Di Spedizione</title>
    <%@ include file="/WEB-INF/head.jsp" %>
    <link rel="stylesheet" type="text/css" href="/css/AggiungiCartaCredito.css">
</head>
<body>
    <section id="contact-us" class="contact-us section">
        <div class="container">
            <div class="contact-head">
                <div class="row">
                    <div class="col-lg-12 col-12">
                        <div class="form-main">
                            <div class="title">
                                <h3 style="color: #f7941d">Aggiungi Indirizzo Di Spedizione</h3>
                            </div>
                            <s:form action="/privato/cliente/indirizzospedizione/AggiungiIndirizzoSpedizione" theme="simple" method="post" validate="true">
                                <div class="row">
                                    <div class="col-lg-6 col-12">
                                        <div class="form-group">
                                            <label for="regione" class="font-weight-bold">Regione</label>
                                            <s:textfield id="regione" placeholder="Regione" type="text" onkeypress="return alphaOnly(event)" name="regione" required="true" />
                                            <small></small>
                                        </div>
                                    </div>
                                    <div class="col-lg-6 col-12">
                                        <div class="form-group">
                                            <label for="provincia" class="font-weight-bold">Provincia</label>
                                            <s:textfield id="provincia" onkeypress="return /[a-z]/i.test(event.key)" placeholder="Provincia" type="text" maxlength="2" pattern=".{2,}" required="true" title="Provincia deve avere 2 lettere" name="provincia" style="text-transform: uppercase" />
                                            <small></small>
                                        </div>
                                    </div>
                                    <div class="col-lg-6 col-12">
                                        <div class="form-group">
                                            <label for="citta" class="font-weight-bold">Città</label>
                                            <s:textfield id="citta" placeholder="Città" type="text" name="citta" onkeypress="return alphaOnly(event)" required="true" />
                                            <small></small>
                                        </div>
                                    </div>
                                    <div class="col-lg-6 col-12">
                                        <div class="form-group">
                                            <label for="via" class="font-weight-bold">Via</label>
                                            <s:textfield id="via" placeholder="Via" type="text" onkeypress="return alphaOnly(event)" name="via" required="true" />
                                            <small></small>
                                        </div>
                                    </div>
                                    <div class="col-lg-6 col-12">
                                        <div class="form-group">
                                            <label for="numeroCivico" class="font-weight-bold">Numero Civico</label>
                                            <s:textfield id="numeroCivico" required="true" placeholder="Numero Civico" type="text" maxlength="3" name="numeroCivico" />
                                            <small></small>
                                        </div>
                                    </div>
                                    <div class="col-lg-6 col-12">
                                        <div class="form-group">
                                            <label for="cap" class="font-weight-bold">CAP</label>
                                            <s:textfield id="cap" placeholder="CAP" type="text" onkeypress="return onlyNumbers(event)" name="cap" maxlength="5" pattern=".{5,}" required="true" title="CAP deve avere 5 cifre" />
                                            <small></small>
                                        </div>
                                    </div>
                                    <div class="col-lg-6 col-12">
                                        <div class="form-group">
                                            <label for="numeroTelefonico" class="font-weight-bold">Telefono</label>
                                            <s:textfield id="numeroTelefonico" placeholder="Telefono" type="text" onkeypress="return onlyNumbers(event)" name="numeroTelefonico" maxlength="10" pattern=".{10,}" required="true" title="Inserire un numero di telefono di 10 cifre" />
                                            <small></small>
                                        </div>
                                    </div>
                                    <div class="col-12">
                                        <div class="form-group button">
                                            <button class="btn" onclick="history.go(-1); return false;">Annulla</button>
                                            <s:submit value="Aggiungi" cssClass="btn" />
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
    <script type="text/javascript" charset="UTF-8" src="/js/IndirizzoSpedizione/funzioniIS.js"></script>
</body>
</html>
