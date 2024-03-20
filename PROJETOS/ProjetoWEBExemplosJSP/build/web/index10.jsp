<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Página de Testes JSP</title>
    </head>
    <body>
        <h1>Exercício JSP</h1>

        <h2>Exemplo escreve a frase "Olá mundo JAVA JSP" 6 vezes, cada vez usando uma tag de cabeçalho html diferente (H6 a H1) ordem crescente de tamanho para os Hs pares e ordem decrescente de tamanho  para os Hs ímpares</h2>

        <%
            String mensagem = "Olá mundo JAVA JSP";

            for (int i = 1; i <= 6; i++) {
                if (i % 2 == 0) {
                    out.println("<h" + i + ">" + mensagem + "</h" + i + ">");
                }
            }
            
            out.println("<br>");
            
            for (int i = 6; i >= 1; i--) {
                if (i % 2 != 0) {
                    out.println("<h" + i + ">" + mensagem + "</h" + i + ">");
                }
            }

        %>

        <br>
        <h3><a href="index.jsp#index2">Voltar</a></h3>
        <br>
    </body>
</html>

