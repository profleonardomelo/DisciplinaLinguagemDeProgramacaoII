<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tela de Listagem de Clientes</title>
    </head>
    <body>
        <h1>Tela de Listagem de Clientes</h1>
        <p>
        <%
            String mensagem =(String)request.getAttribute("mensagemListar");
            
            out.print(mensagem);
        %>
        </p>
    </body>
</html>
