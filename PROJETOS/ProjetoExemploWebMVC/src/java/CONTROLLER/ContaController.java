package CONTROLLER;

import MODEL.DAO.ContaDAO;
import MODEL.DTO.ContaDTO;
import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author leomi
 */
@WebServlet(name = "ContaController", urlPatterns = {"/Conta/Cadastrar", "/Conta/Cadastrar_", "/Conta/Listar"})
public class ContaController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String rota = request.getServletPath();

        switch (rota) {
            case "/Conta/Cadastrar" ->
                cadastrar(request, response);
            case "/Conta/Cadastrar_" ->
                cadastrar_(request, response);
            case "/Conta/Listar" ->
                listar(request, response);
        }

    }

    private void cadastrar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("../VIEW/Conta/TelaDeCadastroDeConta.jsp");
        rd.forward(request, response);
    }

    private void cadastrar_(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ContaDTO contaDTO = new ContaDTO();

        contaDTO.setNumero(Integer.parseInt(request.getParameter("numero")));
        contaDTO.setSaldo(Double.parseDouble(request.getParameter("saldo")));
        contaDTO.setLimite(Double.parseDouble(request.getParameter("limite")));

        new ContaDAO().cadastrar(contaDTO);

        String mensagem = "Cadastro realizado com sucesso!";
        request.setAttribute("mensagemCadastrar", mensagem);

        RequestDispatcher rd = request.getRequestDispatcher("../VIEW/Conta/TelaDeCadastroDeConta_.jsp");
        rd.forward(request, response);
    }

    private void listar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<ContaDTO> listaDeContasDTO;

        listaDeContasDTO = new ContaDAO().listar();

        request.setAttribute("listaDeContasDTO", listaDeContasDTO);

        RequestDispatcher rd = request.getRequestDispatcher("../VIEW/Conta/TelaDeListagemDeContas.jsp");
        rd.forward(request, response);
    }
}
