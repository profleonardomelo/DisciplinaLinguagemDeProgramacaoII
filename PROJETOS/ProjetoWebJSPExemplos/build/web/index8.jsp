<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Página de Testes JSP</title>
    </head>
    <body>
        <h1>Exercício JSP</h1>

        <h2>Exemplo escreve na página os números de 0 a 10, com os ímpares na vertical e os pares na horizontal</h2>
        <p>
            <%
                for (int i = 0; i <= 10; i++) {
                    if (i % 2 != 0) {
                        out.println(i + "<br>");
                    }
                }
                
                out.println("<br>");

                for (int i = 0; i <= 10; i++) {
                    if (i % 2 == 0) {
                        out.println(i + " ");
                    }
                }
            %>
        </p>
        <br>
        <h3><a href="index.jsp#index1">Voltar</a></h3>
        <br>
    </body>
</html>
