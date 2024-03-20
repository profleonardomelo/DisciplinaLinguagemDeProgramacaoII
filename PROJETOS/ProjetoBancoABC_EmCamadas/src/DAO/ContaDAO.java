package DAO;

import DTO.ContaDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ContaDAO {

    private GerenciadorBD bd;

    public ContaDAO() {
        bd = new GerenciadorBD();
    }

    public void cadastrar(ContaDTO contaDTO) throws Exception {
        try (Connection conexao = bd.conectar(); 
                PreparedStatement comando = conexao.prepareStatement(
                "INSERT INTO conta (numero, saldo, limite) VALUES (?, ?, ?)")) {
            comando.setInt(1, contaDTO.getNumero());
            comando.setDouble(2, contaDTO.getSaldo());
            comando.setDouble(3, contaDTO.getLimite());

            comando.execute();
        }
    }

    public List<ContaDTO> listar() throws Exception {
        List<ContaDTO> listaDeContasDTO = new ArrayList<>();

        try (Connection conexao = bd.conectar(); 
                PreparedStatement comando = conexao.prepareStatement(
                "SELECT id, numero, saldo, limite FROM conta"); 
                ResultSet tabela = comando.executeQuery()
                )
        {
            while (tabela.next()) {
                ContaDTO contaDTO = new ContaDTO();

                contaDTO.setId(tabela.getInt("id"));
                contaDTO.setNumero(tabela.getInt("numero"));
                contaDTO.setSaldo(tabela.getDouble("saldo"));
                contaDTO.setLimite(tabela.getDouble("limite"));

                listaDeContasDTO.add(contaDTO);
            }
        }

        return listaDeContasDTO;
    }

    public List<ContaDTO> pesquisar(ContaDTO contaDTO) throws Exception {
        List<ContaDTO> listaDeContasDTO = new ArrayList<>();

        try (Connection conexao = bd.conectar(); 
                PreparedStatement comando = conexao.prepareStatement(
                "SELECT id, numero, saldo, limite FROM conta "
                + "WHERE CONVERT(numero, CHAR) LIKE ?");) {

            comando.setString(1, "%" + contaDTO.getNumero() + "%");

            try (ResultSet tabela = comando.executeQuery()) {
                while (tabela.next()) {
                    ContaDTO contaDTO_ = new ContaDTO();

                    contaDTO_.setId(tabela.getInt("id"));
                    contaDTO_.setNumero(tabela.getInt("numero"));
                    contaDTO_.setSaldo(tabela.getDouble("saldo"));
                    contaDTO_.setLimite(tabela.getDouble("limite"));

                    listaDeContasDTO.add(contaDTO_);
                }
            }

            return listaDeContasDTO;
        }
    }

    public void alterar(ContaDTO contaDTO) throws Exception {
        try (Connection conexao = bd.conectar(); 
                PreparedStatement comando = conexao.prepareStatement(
                "UPDATE conta SET numero = ?, saldo = ?, limite = ? WHERE id = ?")) {
            comando.setInt(1, contaDTO.getNumero());
            comando.setDouble(2, contaDTO.getSaldo());
            comando.setDouble(3, contaDTO.getLimite());
            comando.setInt(4, contaDTO.getId());

            comando.execute();
        }
    }

    public void excluir(ContaDTO contaDTO) throws Exception {
        try (Connection conexao = bd.conectar(); 
                PreparedStatement comando = conexao.prepareStatement(
                "DELETE FROM conta WHERE id = ?")) {
            comando.setInt(1, contaDTO.getId());

            comando.execute();
        }
    }
}
