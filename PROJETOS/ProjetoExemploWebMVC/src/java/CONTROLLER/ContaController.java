package CONTROLLER;

import MODEL.DAO.ContaDAO;
import MODEL.DTO.ContaDTO;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

    private void cadastrar(HttpServletRequest request, HttpServletResponse response) {
        try {
            
            String mensagem = "Esta mensagem foi enviada pelo controlador da entidade Conta, executando o método cadastrar.";
            
            request.setAttribute("mensagemCadastrar", mensagem);
            
            RequestDispatcher rd = request.getRequestDispatcher("../VIEW/Conta/TelaDeCadastroDeConta.jsp");
            rd.forward(request, response);
        } catch (IOException | ServletException ex) {

        }
    }

    private void listar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
        
        List<ContaDTO> listaDeContasDTO = null;
        
        try {
            
            listaDeContasDTO = new ContaDAO().listar();
            
        } catch (Exception ex) {
            String teste = "";
        }
        finally
        {
            request.setAttribute("listaDeContasDTO", listaDeContasDTO);
           
            RequestDispatcher rd = request.getRequestDispatcher("../VIEW/Conta/TelaDeListagemDeContas.jsp");
            rd.forward(request, response);
        }
    }
}
