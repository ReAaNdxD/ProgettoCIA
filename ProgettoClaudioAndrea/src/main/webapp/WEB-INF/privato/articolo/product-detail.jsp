<%@page import="java.text.DecimalFormat"%>
<%@page import="java.text.NumberFormat"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@page import="it.unirc.pwm.ht.Sottocategoria"%>
<%-- <%@page import="it.unirc.pwm.ht.dao.SottocategoriaDAO"%> --%>
<%@page import="java.util.Enumeration"%>
<%@page import="java.util.HashMap"%>
<%@page import="it.unirc.pwm.ht.Cliente"%>
<%@page import="it.unirc.pwm.ht.dao.ClienteDAO"%>
<%@page import="it.unirc.pwm.ht.dao.ClienteDAOFactory"%>
<%@page import="it.unirc.db.ecommerce.views.ViewProduct"%>
<%@page import="it.unirc.pwm.ht.dao.CategoriaDAO"%>
<%@page import="it.unirc.pwm.ht.dao.CategoriaDAOFactory"%>
<%@page import="java.util.List"%>
<%@page import="it.unirc.pwm.ht.Categoria"%>
<%@page import="it.unirc.pwm.ht.Carrello"%>
<%@page import="it.unirc.pwm.ht.dao.CarrelloDAO"%>
<%@page import="it.unirc.pwm.ht.dao.ArticoloDAO"%>
<%@page import="it.unirc.pwm.ht.dao.ArticoloDAOFactory"%>
<%@page import="it.unirc.pwm.ht.Prodotto"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
 <%@include file="/WEB-INF/head.jsp"%>
<link rel="stylesheet" href="/css/product.css">
</head>
<body class="js"><%-- 

	<%@include file="/WEB-INF/preload.jsp"%> --%>

	<%-- <%@include file="/WEB-INF/header-scriptlet.jsp"%> --%>



	<%-- <%@include file="/WEB-INF/header.jsp"%> --%>



	<section class="product-area shop-sidebar shop section shopping-cart">
		<div class="container">
			<div id="message"></div>
			<div class="row">
				<!-- Images -->
				<div class="col-lg-6">
					<div class="product-pic-zoom">
						<img class="product-big-img"
							src="https://via.placeholder.com/1000x1358" alt="">
					</div>
					<!-- <div class="product-thumbs" tabindex="1"
						style="overflow: hidden; outline: none;">
						<div class="product-thumbs-track">
							<div class="pt active"
								data-imgbigurl="https://via.placeholder.com/1000x1358">
								<img src="https://via.placeholder.com/116x116" alt="">
							</div>
							<div class="pt"
								data-imgbigurl="https://via.placeholder.com/1000x1358">
								<img src="https://via.placeholder.com/116x116" alt="">
							</div>
							<div class="pt"
								data-imgbigurl="https://via.placeholder.com/1000x1358">
								<img src="https://via.placeholder.com/116x116" alt="">
							</div>
							<div class="pt"
								data-imgbigurl="https://via.placeholder.com/1000x1358">
								<img src="https://via.placeholder.com/116x116" alt="">
							</div>
						</div>
					</div> -->
				</div>

				<!-- Description -->
				<div class="col-lg-6 order-3">
					<div class="product_description">
						<div class="product_name">
							<s:property value="articolo.prodotto.nome" />
						</div>
						<%-- Nome Prodotto --%>

						
						
						
						
						

						<hr>

						<div class="product_text d-flex">
							<p>Prezzo: ${articolo.prezzo }</p>
							<div class="product_price">
								€
							</div>
						</div>

						<div class="product_text">
							<p>

								<s:if test="articolo.disponibilita > 0">
									<span class="p-available"> Disponibilità immediata</span>
								</s:if>
								<s:else>
									<span class="p-not-available"> Non Disponibile</span>
								</s:else>

								<%-- <%
									if (articolo.getDisponibilita() > 0)
										out.write("<span class=\"p-available\"> Disponibilità immediata</span>");
									else
										out.write("<span class=\"p-not-available\"> Non Disponibile</span>");
								%> --%>
							</p>
						</div>
						


						<%-- <%
							if (articolo.getDisponibilita() > 0) {
						%> --%>

						<s:if test="#articolo.disponibilita>0">
							<div class="order_info d-flex flex-row">
								<s:form action="AddToCart" class="d-flex">
									<%-- <input id="idArticle" type="hidden" name="id"
									value="<%=articolo.getIdArticolo()%>"> --%>
									<%-- <s:param value="#articolo"></s:param> --%>
									<!-- Product Quantity -->
									<div class="qty">
										<div class="input-group input-group-w">
											<div class="button minus">
												<button type="button" class="btn btn-primary btn-number"
													disabled="disabled" data-type="minus" data-field="qty">
													<i class="ti-minus"></i>
												</button>
											</div>
											<input type="text" name="qty" class="input-number"
												data-min="1" data-max="100" value="1">
											<div class="button plus">
												<button type="button" class="btn btn-primary btn-number"
													data-type="plus" data-field="qty">
													<i class="ti-plus"></i>
												</button>
											</div>
										</div>
									</div>
									<div class="button_container">
										<button type="submit" class="button cart_button btn-color">Add
											to Cart</button>
									</div>
								</s:form>
							</div>
							<%-- <%
							}
						%> --%>

						</s:if>

						<div  class="accordion-area">
							<div class="panel">
								<div class="panel-header" >
									<button class="panel-link" 
										>Descrizione</button>
								</div>
								
									<div class="panel-body">
										<p>
											<s:property value="articolo.prodotto.descrizioneBreve" />
										</p>
									</div>
								
							</div>
							<%-- <div class="panel">
								<div class="panel-header" id="headingTwo">
									<button class="panel-link" data-toggle="collapse"
										data-target="#collapse2" aria-expanded="false"
										aria-controls="collapse2">Descrizione Dettagliata</button>
								</div>
								<div id="collapse2" class="collapse"
									aria-labelledby="headingTwo" data-parent="#accordion">
									<div class="panel-body">
										<p>
											<s:property value="#articolo.prodotto.descrizioneDettagliata" />
										</p>
									</div>
								</div>
							</div> --%>
							
							<div class="panel">
								<div class="panel-header" >
									<button class="panel-link" 
										>Descrizione Dettagliata</button>
								</div>
								
									<div class="panel-body">
										<p>
											<s:property value="articolo.prodotto.descrizioneDettagliata" />
										</p>
									</div>
								
							</div>
							
						</div>

					</div>
				</div>
			</div>
		</div>
	</section>


	<%@include file="/WEB-INF/footer.jsp"%>

	<%-- <%@include file="/WEB-INF/js.jsp"%> --%>

	<script src="/js/jquery.zoom.min.js"></script>
	<script src="/js/main.js"></script>
	<script src="js/myscript.js"></script>
	<script src="/js/js.js"></script>

</body>
</html>