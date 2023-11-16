<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Página de Testes JSP</title>
    </head>
    <body>
        <h1>Exercício JSP</h1>
        
        <h2>Exemplo gerando uma tabela html dinamicamente com dados de clientes oriundos de uma matriz</h2>

        <%
            String[][] clientes = {
                {"1", "João da Silva", "123.456.789-00", "joao@email.com"},
                {"2", "Maria Oliveira", "987.654.321-00", "maria@email.com"},
                {"3", "José Pereira", "111.222.333-44", "jose@email.com"}
            };
        %>

        <table border="1">
            <%
                out.println("<tr>");

                out.println("<th>ID</th>");
                out.println("<th>NOME</th>");
                out.println("<th>CPF</th>");
                out.println("<th>E-MAIL</th>");

                out.println("</tr>");

                for (String[] cliente : clientes) {
                    out.println("<tr>");

                    out.println("<td>" + cliente[0] + "</td>");
                    out.println("<td>" + cliente[1] + "</td>");
                    out.println("<td>" + cliente[2] + "</td>");
                    out.println("<td>" + cliente[3] + "</td>");

                    out.println("</tr>");
                }
            %>
        </table>

        <br>
        <h3><a href="index.jsp#index6">Voltar</a></h3>
        <br>
    </body>
</html>
