package Principal;

import java.sql.Connection;
import java.sql.DriverManager;

public class GerenciadorBD {

    private String servidor = "127.0.0.1:3309";
    public String banco = "bancoabc";
    private String login = "root";
    private String senha = "root";

    public Connection conectar() throws Exception 
    {    
        String textoDeConexao = "jdbc:mysql://" + servidor + "/" + banco;
        
        return DriverManager.getConnection(textoDeConexao, login, senha);
    }
}
