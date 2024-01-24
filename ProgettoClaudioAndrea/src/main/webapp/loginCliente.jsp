<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>


<!-- a -->
<!-- Bootstrap -->
<!-- Magnific Popup -->
<link rel="stylesheet" href="/css/magnific-popup.min.css">
<!-- Font Awesome -->
<link rel="stylesheet" href="/css/font-awesome.css">
<!-- Fancybox -->
<link rel="stylesheet" href="/css/jquery.fancybox.min.css">
<!-- Themify Icons -->
<link rel="stylesheet" href="/css/themify-icons.css">
<!-- Nice Select CSS -->
<link rel="stylesheet" href="/css/niceselect.css">
<!-- Animate CSS -->
<link rel="stylesheet" href="/css/animate.css">
<!-- Flex Slider CSS -->
<link rel="stylesheet" href="/css/flex-slider.min.css">
<!-- Owl Carousel -->
<link rel="stylesheet" href="/css/owl-carousel.css">
<!-- Slicknav -->
<link rel="stylesheet" href="/css/slicknav.min.css">

<!-- Eshop StyleSheet -->
<link rel="stylesheet" href="/css/reset.css">
<link rel="stylesheet" href="/css/style.css">
<link rel="stylesheet" href="/css/responsive.css">
<link rel="stylesheet" href="/css/AggiungiCartaCredito.css">
<link rel="stylesheet" href="/css/bootstrap.css">

</head>
<body>
	<!-- 	<form class="form-signin" action="/Login" method="post">
		<h1 class="h3 mb-3 font-weight-normal">Login</h1>
		<label for="inputUsername" class="sr-only">Username</label> <input
			name="username" type="text" id="inputUsername" class="form-control"
			placeholder="username" required> <label for="inputPassword"
			class="sr-only">Password</label> <input name="password"
			type="password" id="inputPassword" class="form-control"
			placeholder="password" required>
		<div class="checkbox mb-3">
			<label> <input type="checkbox" value="remember-me">
				Remember me
			</label>
		</div>
		<button class="btn btn-lg btn-primary btn-block" type="submit">Accedi</button>
	</form> -->




	<section id="contact-us" class="contact-us section">
		<div class="container" style="max-width: 600px">
			<div class="contact-head">
				<div class="row">
					<div class="col-lg-12 col-12">
						<div class="form-main">
							<div class="title text-center">
								<h3 style="color: #f7941d; font-size: 30px;">Accedi</h3>
							</div>

							<small><s:actionerror /></small>
							<s:form action="/LoginCliente" id="form " method="post"
								class="form form-signin" theme="simple">

								<div class="row">
									<div class=" col-12">
										<div class="form-group">
											<label for="email" class="font-weight-bold"
												style="font-size: 20px;">Email</label>
											<!-- <input id="email"
												placeholder="Email" type="text" name="email"
												> -->
											 <s:textfield name="cliente.email" placeholder="Email" /> 
											 <small><s:fielderror fieldName="cliente.email"></s:fielderror></small> 
										</div>
									</div>
									<div class="col-12">
										<div class="form-group">
											<label for="password" class="font-weight-bold"
												style="font-size: 20px;">Password</label>
											 <s:password name="cliente.password" placeholder="Password" /> 
											<small><s:fielderror fieldName="cliente.password"></s:fielderror></small>
										</div>
									</div>

									<div class="col-12">
										<div class="form-group button" style="text-align: center">
											<button class="btn" type="submit" style="width: 100%;">Login</button>
										</div>
									</div>
								</div>
							</s:form>
							<div class="container">
								<div class="text-center" style="margin-top: 20px">
									<a href="/NuovoCliente">Sei nuovo su DAG? Registrati</a>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>




</body>
</html>