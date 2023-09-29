package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import DTO.Cliente;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {

    private GerenciadorBD bd;

    public ClienteDAO() {
        bd = new GerenciadorBD();
    }

    public void cadastrar(Cliente cliente) throws Exception {
        try (Connection conexao = bd.conectar(); 
             PreparedStatement comando = conexao.prepareStatement(
             "INSERT INTO cliente (nome, email, telefone) VALUES (?, ?, ?)")
            ) 
        {
            comando.setString(1, cliente.getNome());
            comando.setString(2, cliente.getEmail());
            comando.setLong(3, cliente.getTelefone());

            comando.executeUpdate();
        }
    }

    public List<Cliente> listar() throws Exception  {

        List<Cliente> listaDeClientes = new ArrayList<>();

        try (Connection conexao = bd.conectar(); 
             PreparedStatement comando = conexao.prepareStatement(
             "SELECT ID, nome, email, telefone FROM cliente");
             ResultSet tabela = comando.executeQuery()
            ) 
        {
            while (tabela.next()) {
                Cliente cliente = new Cliente();

                cliente.setId(tabela.getInt("id"));
                cliente.setNome(tabela.getString("nome"));
                cliente.setEmail(tabela.getString("email"));
                cliente.setTelefone(tabela.getLong("telefone"));

                listaDeClientes.add(cliente);
            }
        }

        return listaDeClientes;
    }

    public Cliente pesquisar(Cliente cliente) throws Exception {

        try (Connection conexao = bd.conectar(); 
             PreparedStatement comando = conexao.prepareStatement(
             "SELECT nome, email, telefone FROM cliente WHERE id = ?")
            ) 
        {
            comando.setInt(1, cliente.getId());
            ResultSet tabela = comando.executeQuery();

            boolean existeCliente = false;
            
            if (tabela.next()) {
            
                cliente.setNome(tabela.getString("nome"));
                cliente.setEmail(tabela.getString("email"));
                cliente.setTelefone(tabela.getLong("telefone"));
                
                existeCliente = true;
            }
            
            if(!existeCliente)
            {
                cliente.setId(0);
            }
        }
       
        return cliente;
    }

    public void alterar(Cliente cliente) throws Exception {
        try (Connection conexao = bd.conectar(); 
             PreparedStatement comando = conexao.prepareStatement(
             "UPDATE cliente SET nome = ?, email = ?, telefone = ? WHERE id = ?")
            ) 
        {
            comando.setString(1, cliente.getNome());
            comando.setString(2, cliente.getEmail());
            comando.setLong(3, cliente.getTelefone());
            comando.setInt(4, cliente.getId());

            comando.executeUpdate();
        }
    }

    public void excluir(Cliente cliente) throws Exception {
        try (Connection conexao = bd.conectar(); 
             PreparedStatement comando = conexao.prepareStatement(
             "DELETE FROM cliente WHERE id = ?")
            ) 
        {
            comando.setInt(1, cliente.getId());

            comando.executeUpdate();
        }
    }

}
