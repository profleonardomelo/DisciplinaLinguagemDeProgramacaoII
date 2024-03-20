<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Página de Testes JSP</title>
    </head>
    <body>
        <h1>Exercício JSP</h1>
        
        <h2>Exemplo escreve na página os números de 0 a 10 verticalmente (com lista não ordenada)</h2>

        <ul>
            <%
                for (int i = 0; i <= 10; i++) {
                    out.println("<li>" + i + "</li>");
                }
            %>
        </ul>

        <br>
        <h3><a href="index.jsp#index4">Voltar</a></h3>
        <br>
    </body>
</html>
