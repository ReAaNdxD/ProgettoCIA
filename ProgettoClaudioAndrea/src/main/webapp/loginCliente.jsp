<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>

<head>
    <title>Login</title>
    <%@include file="/WEB-INF/head.jsp" %>
    <style>
        .form-inline .form-group {
            display: flex;
            align-items: center;
        }

        .form-inline .form-group label {
            margin-right: 10px;
        }
    </style>
</head>

<body>
    <section id="contact-us" class="contact-us section">
        <div class="container" style="max-width: 600px">
            <div class="contact-head">
                <div class="row center">
                    <div class="col-lg-12 col-12">
                        <div class="form-main">
                            <div>
                                <h3 style="color: #f7941d; font-size: 30px;">Accedi</h3>
                            </div>

                            <s:form action="actions/LoginCliente" cssClass="form-inline">
                                <div class="form-group mb-3">
                                    <s:label for="email" class="font-weight-bold" style="font-size: 20px;">Email</s:label>
                                    <s:textfield name="cliente.email" placeholder="Email" cssClass="form-control" />
                                </div>
                                <div class="form-group mb-3">
                                    <s:label for="password" class="font-weight-bold" style="font-size: 20px;">Password</s:label>
                                    <s:password name="cliente.password" placeholder="Password" cssClass="form-control" />
                                </div>
                                <div class="form-group mb-3">
                                    <s:submit value="Login" cssClass="btn" />
                                </div>
                            </s:form>

                            <div class="container">
                                <div class="text-center" style="margin-top: 20px">
                                    <a href="<s:url action='NuovoCliente'/>">Sei un nuovo Cliente? Registrati</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>

    	<script type="text/javascript" charset="UTF-8"
		src="/js/registration.js"></script>
			<%@include file="/WEB-INF/footer.jsp" %>
	
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
	<script src="js/flex-slider.js"></script>
	<!-- ScrollUp JS -->
	<script src="/js/scrollup.js"></script>
	<!-- Onepage Nav JS -->
	<script src="/js/onepage-nav.min.js"></script>
	<!-- Easing JS -->
	<script src="/js/easing.js"></script>
	<!-- Active JS -->
	<script src="/js/active.js"></script>
</body>
</html>