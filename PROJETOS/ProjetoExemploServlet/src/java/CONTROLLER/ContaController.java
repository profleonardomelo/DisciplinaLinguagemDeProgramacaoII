package CONTROLLER;

import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(name = "ContaController", urlPatterns = {"/Conta/Cadastrar", "/Conta/Listar"})
public class ContaController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processarRequisicao(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processarRequisicao(request, response);
    }

    protected void processarRequisicao(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String rota = request.getServletPath();

        switch (rota) {
            case "/Conta/Cadastrar" -> cadastrar(request, response);
            case "/Conta/Listar" -> listar(request, response);
        }
    }

    protected void cadastrar(HttpServletRequest request, HttpServletResponse response) {
        try {
            
            String mensagem = "Esta mensagem foi enviada pelo controlador da entidade Conta, executando o método cadastrar.";
            
            request.setAttribute("mensagemCadastrar", mensagem);
            
            RequestDispatcher rd = request.getRequestDispatcher("../VIEW/Conta/TelaDeCadastroDeConta.jsp");
            rd.forward(request, response);
        } catch (IOException | ServletException ex) {

        }
    }

    protected void listar(HttpServletRequest request, HttpServletResponse response) {
        try {
            
            String mensagem = "Esta mensagem foi enviada pelo controlador da entidade Conta, executando o método listar.";
            
            request.setAttribute("mensagemListar", mensagem);
           
            RequestDispatcher rd = request.getRequestDispatcher("../VIEW/Conta/TelaDeListagemDeContas.jsp");
            rd.forward(request, response);
        } catch (IOException | ServletException ex) {

        }
    }

}
