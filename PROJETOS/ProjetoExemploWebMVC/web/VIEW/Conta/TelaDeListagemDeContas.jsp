<%@page import="java.util.List"%>
<%@page import="MODEL.DTO.ContaDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tela de Listagem de Contas</title>
    </head>
    <body>
        <h1>Tela de Listagem de Contas</h1>
        <p>
            <%
                List<ContaDTO> listaDeContasDTO = (List<ContaDTO>) request.getAttribute("listaDeContasDTO");

                if (listaDeContasDTO != null && listaDeContasDTO.size() > 0) {

                    String html = "";

                    html += "<table border='1' cellspacing='0' cellpadding='4'>";

                    html += "<tr>";

                    html += "<th>ID</th>";
                    html += "<th>NÚMERO</th>";
                    html += "<th>SALDO</th>";
                    html += "<th>LIMITE</th>";

                    html += "</tr>";

                    for (ContaDTO contaDTO : listaDeContasDTO) {

                        html += "<tr>";

                        html += "<td>" + contaDTO.getId() + "</td>";
                        html += "<td>" + contaDTO.getNumero() + "</td>";
                        html += "<td>" + contaDTO.getSaldo() + "</td>";
                        html += "<td>" + contaDTO.getLimite() + "</td>";

                        html += "</tr>";

                    }

                    html += "</table>";
                    
                    out.println(html);
                }
            %>
        </p>
    </body>
</html>
