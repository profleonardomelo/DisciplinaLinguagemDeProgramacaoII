package DAO;

import DTO.AcessoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AcessoDAO {
   
    private GerenciadorBD bd;

    public AcessoDAO() {
        bd = new GerenciadorBD();
    }
    
    public boolean verificar(AcessoDTO acessoDTO) throws Exception {
        List<AcessoDTO> listaDeAcessosDTO = new ArrayList<>();

        try (Connection conexao = bd.conectar(); PreparedStatement comando = conexao.prepareStatement(
                "SELECT id, usuario, senha FROM acesso "
                + "WHERE usuario = ? AND senha = ?");) {

            comando.setString(1, acessoDTO.getUsuario());
            comando.setString(2, acessoDTO.getSenha());

            try (ResultSet tabela = comando.executeQuery()) {
                while (tabela.next()) {
                    AcessoDTO acessoDTO_ = new AcessoDTO();

                    acessoDTO_.setId(tabela.getInt("id"));
                    acessoDTO_.setUsuario(tabela.getString("usuario"));
                    acessoDTO_.setSenha(tabela.getString("senha"));

                    listaDeAcessosDTO.add(acessoDTO_);
                }
            }

            return !listaDeAcessosDTO.isEmpty();
        }
    }
}
