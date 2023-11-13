package MODEL.DAO;

import MODEL.DTO.ContaDTO;
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

}
