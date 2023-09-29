package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class GerenciadorBD {

    private final String servidor = "127.0.0.1:3306";
    private final String banco = "livraria";
    private final String login = "root";
    private final String senha = "1234";

    public Connection conectar() throws Exception {
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        String textoDeConexao = "jdbc:mysql://" + servidor + "/" + banco;
        
        return DriverManager.getConnection(textoDeConexao, login, senha);
    }

}

