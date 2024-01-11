<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Registrazione</title>

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
<hr>
<section id="registration" class="registration section">
    <div class="container" style="max-width: 600px">
        <div class="registration-head">
            <div class="row">
                <div class="col-lg-12 col-12">
                    <div class="form-main">
                        <div class="title text-center">
                            <h4>Registrazione</h4>
                        </div>
                        <s:actionerror/>
                        <s:form action="actions/RegistraNuovoCliente" id="form" method="post" class="form form-registration" theme="simple">

                            <div class="row">
                                <div class="col-12">
                                    <div class="form-group">
                                        <label for="nome" class="font-weight-bold">Nome</label>
                                        <s:textfield name="cliente.nome" placeholder="Nome" />
                                    </div>
                                </div>
                                <div class="col-12">
                                    <div class="form-group">
                                        <label for="cognome" class="font-weight-bold">Cognome</label>
                                        <s:textfield name="cliente.cognome" placeholder="Cognome" />
                                    </div>
                                </div>
                                <div class="col-12">
                                    <div class="form-group">
                                        <label for="email" class="font-weight-bold">Email</label>
                                        <s:textfield name="cliente.email" placeholder="Email" />
                                    </div>
                                </div>
                                <div class="col-12">
                                    <div class="form-group">
                                        <label for="password" class="font-weight-bold">Password</label>
                                        <s:password name="cliente.password" placeholder="Password" />
                                    </div>
                                </div>
                                <div class="col-12">
                                    <div class="form-group">
                                        <label for="ripetiPassword" class="font-weight-bold">Riscrivi Password</label>
                                        <s:password name="ripetiPassword" placeholder="Riscrivi Password" />
                                        <s:fielderror fieldName="ripetiPassword"></s:fielderror>
                                    </div>
                                </div>
                                <div class="col-12">
                                    <div class="form-group button" style="text-align: center">
                                        <button class="btn" type="submit" style="width: 100%;">Registra</button>
                                    </div>
                                </div>
                            </div>
                        </s:form>
                        <hr>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
</body>
</html>
