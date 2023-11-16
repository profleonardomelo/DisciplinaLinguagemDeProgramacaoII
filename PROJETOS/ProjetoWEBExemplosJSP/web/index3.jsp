<%@page import="java.time.LocalDate"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Página de Testes JSP</title>
    </head>
    <body>
        <h1>Exercício JSP</h1>
        
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
        <h3><a href="index.jsp#index3">Voltar</a></h3>
        <br>
    </body>
</html>
