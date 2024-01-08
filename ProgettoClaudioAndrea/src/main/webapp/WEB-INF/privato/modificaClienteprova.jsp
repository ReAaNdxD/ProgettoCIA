<%@ taglib prefix="s" uri="/struts-tags"%>
 
<!DOCTYPE html>
<html>
<head>
<title>Modifica Cliente</title>
<%@include file="/WEB-INF/head.jsp"%>
<link rel="stylesheet" href="/css/AggiungiCartaCredito.css">
</head>
<body class="js">
 
	<section id="contact-us" class="contact-us section">
<div class="container">
<div class="contact-head">
<div class="row">
<div class="col-lg-12 col-12">
<div class="form-main">
<div class="title">
<h3 style="color: #f7941d">Modifica il tuo account</h3>
</div>
 
							<s:form id="form" class="form" theme="simple" method="post"
								action="/actions/privato/ModificaCliente"
								onsubmit="return valida()">
<div class="row">
<div class="col-lg-6 col-12">
<div class="form-group">
<s:label for="nome" class="font-weight-bold">Nome</s:label>
<s:textfield id="nome" placeholder="Nome"
												onkeypress="return alphaOnly(event)" name="nome"
												value="%{session.cliente.nome}" />
<s:fielderror fieldName="nome" />
</div>
</div>
<div class="col-lg-6 col-12">
<div class="form-group">
<s:label for="cognome" class="font-weight-bold">Cognome</s:label>
<s:textfield onkeypress="return alphaOnly(event)"
												id="cognome" placeholder="Cognome" name="cognome"
												value="%{session.cliente.cognome}" />
<s:fielderror fieldName="cognome" />
</div>
</div>
<div class="col-lg-6 col-12">
<div class="form-group">
<s:label for="email" class="font-weight-bold">Email</s:label>
<s:textfield id="email" placeholder="Email" name="email"
												value="%{session.cliente.email}" />
<s:fielderror fieldName="email" />
</div>
</div>
<div class="col-lg-6 col-12">
<div class="form-group">
<s:label for="password" class="font-weight-bold">Password</s:label>
<s:password id="password"
												title="La password deve essere tra 8 e 15 caratteri e deve contenere almeno una lettera maiuscola, una minuscola e un carattere speciale"
												placeholder="Password" name="password" value="%{session.cliente.password}" />
<s:fielderror fieldName="password" />
<small>La password deve essere tra 8 e 15 caratteri e
												deve contenere almeno <br>una lettera maiuscola una
												minuscola e un carattere speciale
</small>
</div>
</div>
<div class="col-lg-6 col-12">
<div class="form-group">
<s:label for="ripetiPassword" class="font-weight-bold">Ripeti Password</s:label>
<s:password id="ripetiPassword"
												placeholder="Riscrivi Password" name="ripetiPassword" />
<s:fielderror fieldName="ripetiPassword" />
</div>
</div>
<div class="col-12">
<div class="form-group button">
<s:a class="btn" onclick="history.go(-1); return false;">Annulla</s:a>
<s:submit class="btn" value="Modifica" />
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
 
 
	<script type="text/javascript" src="/js/registration.js"></script>
</body>
</html>