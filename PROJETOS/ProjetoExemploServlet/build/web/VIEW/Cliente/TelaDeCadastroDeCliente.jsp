<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tela de Cadastro de Cliente</title>
    </head>
    <body>
        <h1>Tela de Cadastro de Cliente</h1>
        <p>
        <%
            String mensagem =(String)request.getAttribute("mensagemCadastrar");
            
            out.print(mensagem);
        %>
        </p>
    </body>
</html>
