package MODEL.DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class GerenciadorBD {

    private String servidor = "127.0.0.1:3309";
    public String banco = "bancoabc_web_mvc";
    private String login = "root";
    private String senha = "root";

    public Connection conectar() throws Exception 
    {   
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        String textoDeConexao = "jdbc:mysql://" + servidor + "/" + banco;
        
        Connection conexao = DriverManager.getConnection(textoDeConexao, login, senha);
        
        return conexao;
    }
}
