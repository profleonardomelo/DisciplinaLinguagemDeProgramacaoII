<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Página de Testes JSP</title>
    </head>
    <body>
        <h1>Exercício JSP</h1>
        
        <h2>Exemplo escreve na página a tabuada de 6 (multiplicando de 0 a 10) verticalmente (com lista ordenada)</h2>

        <ol>
            <%
                int numero = 6;
                for (int i = 0; i <= 10; i++) {
                    out.println("<li>" + numero + " x " + i + " = " + numero * i + "</li>");
                }
            %>
        </ol>

        <br>
        <h3><a href="index.jsp#index5">Voltar</a></h3>
        <br>
    </body>
</html>
