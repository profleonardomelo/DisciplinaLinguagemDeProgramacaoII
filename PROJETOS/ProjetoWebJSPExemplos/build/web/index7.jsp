<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="AcessoADados.Cliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Página de Testes JSP</title>
    </head>
    <body>
        <h1>Exercício JSP</h1>
        
        <h2>Exemplo gerando uma tabela html dinamicamente com dados de clientes oriundos de uma lista de clientes (classe Cliente que está em outro pacote)</h2>

        <%
            List<Cliente> listaDeClientes = new ArrayList<>();

            listaDeClientes.add(new Cliente(1, "João de Souza", "123.456.789-00", "joao@email.com"));
            listaDeClientes.add(new Cliente(2, "Maria Melo", "987.654.321-00", "maria@email.com"));
            listaDeClientes.add(new Cliente(3, "José Santos", "111.222.333-44", "jose@email.com"));
        %>

        <table border="1">
            <%                
                out.println("<tr>");

                out.println("<th>ID</th>");
                out.println("<th>NOME</th>");
                out.println("<th>CPF</th>");
                out.println("<th>E-MAIL</th>");

                out.println("</tr>");

                for (Cliente cliente : listaDeClientes) {
                    out.println("<tr>");

                    out.println("<td>" + cliente.getId() + "</td>");
                    out.println("<td>" + cliente.getNome() + "</td>");
                    out.println("<td>" + cliente.getCpf()+ "</td>");
                    out.println("<td>" + cliente.getEmail() + "</td>");

                    out.println("</tr>");
                }
            %>
        </table>

        <br>
        <h3><a href="index.jsp#index7">Voltar</a></h3>
        <br>
    </body>
</html>
