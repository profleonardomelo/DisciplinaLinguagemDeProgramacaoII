package DAO;

import DTO.ClienteDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {
    private GerenciadorBD bd;

    public ClienteDAO() {
        bd = new GerenciadorBD();
    }
    
    public List<ClienteDTO> listar() throws Exception {
        List<ClienteDTO> listaDeClientesDTO = new ArrayList<>();

        try (Connection conexao = bd.conectar(); 
                PreparedStatement comando = conexao.prepareStatement(
                "SELECT id, nome, cpf, email FROM cliente"); 
                ResultSet tabela = comando.executeQuery()
                )
        {
            while (tabela.next()) {
                ClienteDTO clienteDTO = new ClienteDTO();

                clienteDTO.setId(tabela.getInt("id"));
                clienteDTO.setNome(tabela.getString("nome"));
                clienteDTO.setCpf(tabela.getLong("cpf"));
                clienteDTO.setEmail(tabela.getString("email"));

                listaDeClientesDTO.add(clienteDTO);
            }
        }

        return listaDeClientesDTO;
    }
    
    public ClienteDTO pesquisarPorId(ClienteDTO clienteDTO) throws Exception {

        try (Connection conexao = bd.conectar();
                PreparedStatement comando = conexao.prepareStatement(
                        "SELECT id, nome, cpf, email FROM cliente WHERE id = ?")) {
            comando.setInt(1, clienteDTO.getId());

            try (ResultSet tabela = comando.executeQuery()) {
                if (tabela.next()) {
                    clienteDTO.setNome(tabela.getString("nome"));
                    clienteDTO.setCpf(tabela.getLong("cpf"));
                    clienteDTO.setEmail(tabela.getString("email"));
                }
                else
                {
                    clienteDTO.setId(0);
                }
            }
        }

        return clienteDTO;
    }
}
