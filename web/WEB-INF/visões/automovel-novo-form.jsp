<%-- 
    Document   : automovel-novo-form.jsp
    Created on : 23/10/2015, 18:57:19
    Author     : alexandre.chaves
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1> Cadastro Automóvel </h1>
        
        <form action="inserir" method="POST">
            <label for="placa"> Placa </label>
            <input type="text" nome="placa" id="placa"/>
            
            <label for="anoFabricacao"> Ano Fabricação </label>
            <input type="text" name="anoFabricacao" id="anoFabricacao" />
            
            <input type="submit" name="salvar" value="salvar"/>
        </form>
        
    </body>
</html>
