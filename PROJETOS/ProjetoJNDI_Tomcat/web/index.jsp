<%@ page import="java.sql.Connection, java.sql.PreparedStatement, java.sql.ResultSet, javax.naming.Context, javax.naming.InitialContext, javax.sql.DataSource" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP JNDI Exemplo</title>
</head>
<body>
    <h1>Exemplo de Uso de JNDI em JSP</h1>
    <%
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            // Obtendo a conexão
            connection = ((DataSource) new InitialContext().lookup("java:comp/env/jdbc/BancoProjetoABC")).getConnection();

            // Preparando a consulta
            preparedStatement = connection.prepareStatement("SELECT id, numero, saldo, limite FROM conta");

            // Executando a consulta
            resultSet = preparedStatement.executeQuery();

            // Processando os resultados
            while (resultSet.next()) {
                out.println("ID: " + resultSet.getString("id") + " --- ");
                out.println("Número: " + resultSet.getString("numero") + " --- ");
                out.println("Saldo: " + resultSet.getString("saldo") + " --- ");
                out.println("Limite: " + resultSet.getString("limite") + "<br>");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
                // Fechando os recursos
                if (resultSet != null) resultSet.close();
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
        }
    %>
</body>
</html>
