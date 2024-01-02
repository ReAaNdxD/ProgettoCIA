<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registrazione</title>
</head>
<body>
<hr>
		<h4>Registrazione</h4>
		<s:actionerror/>
		<s:form action="actions/RegistraNuovoCliente" >
	    	<s:textfield name="cliente.nome" label="Nome" key="label.cliente.nome"/>
	    	<s:textfield name="cliente.cognome" label="Cognome"/>
	    	<s:textfield name="cliente.email" label="Email"/>
	    	<s:password name="cliente.password" label="Password"/>
	    	<s:password name="ripetiPassword" label="RiscriviPassword"/><s:fielderror fieldName="ripetiPassword"></s:fielderror>
	    	<s:submit />
		</s:form>
	    <hr>
</body>
</html>