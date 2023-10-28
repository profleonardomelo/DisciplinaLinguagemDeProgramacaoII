<%@page import="java.time.LocalDate" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Página de Testes JSP</title>
    </head>
    <body>
        <h1>Exercícios JSP</h1>

        <h2>Exemplo escreve na página os números de 0 a 10 verticalmente</h2>
        <p>
            <%
                for (int i = 0; i <= 10; i++) {
                    out.println(i + "<br>");
                }
            %>
        </p>
        <br>

        <h2>Exemplo escreve a frase "Olá mundo JAVA JSP" 6 vezes, cada vez usando uma tag de cabeçalho html diferente (H1 a H6)</h2>

        <%
            String mensagem = "Olá mundo JAVA JSP";
            for (int i = 6; i >= 1; i--) {
                out.println("<h" + i + ">" + mensagem + "</h" + i + ">");
            }
        %>

        <br>

        <h2>Exemplo onde são consultados e armazanados o dia, o mes e o ano (data do servidor) e, posteriormente, os valores dessas variáveis são exibidas dentro da estrutura do html</h2>

        <%
            LocalDate dataHoje = LocalDate.now();

            int dia = dataHoje.getDayOfMonth();
            int mes = dataHoje.getMonthValue();
            int ano = dataHoje.getYear();
        %>

        <h4>Data obtida no Computador Servidor</h4>
        Dia: <b> <%= dia%> </b><br>
        Mês: <b> <%= mes%> </b><br>
        Ano: <b> <%= ano%> </b><br>

        <br>

        <h2>Exemplo escreve na página os números de 0 a 10 verticalmente (com lista não ordenada)</h2>

        <ul>
            <%
                for (int i = 0; i <= 10; i++) {
                    out.println("<li>" + i + "</li>");
                }
            %>
        </ul>

        <br>

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

    </body>
</html>
