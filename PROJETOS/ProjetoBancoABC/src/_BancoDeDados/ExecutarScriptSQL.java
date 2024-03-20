package _BancoDeDados;

import Principal.GerenciadorBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ExecutarScriptSQL {

    public static void main(String[] args) throws Exception {

        ExecutarScriptSQL.executarScript();
    }

    public static void executarScript() throws Exception {
        GerenciadorBD bd = new GerenciadorBD();
        bd.banco = "";

        try (Connection conexao = bd.conectar()) {

            String criarBancoSQL = "CREATE DATABASE IF NOT EXISTS `bancoabc`;";

            try (PreparedStatement comandoCriarBanco = conexao.prepareStatement(criarBancoSQL)) {
                comandoCriarBanco.execute();
            }

            String usarBancoSQL = "USE `bancoabc`;";

            try (PreparedStatement comandoUsarBanco = conexao.prepareStatement(usarBancoSQL)) {
                comandoUsarBanco.execute();
            }

            String criarTabelaSQL1 = "CREATE TABLE IF NOT EXISTS `conta` ("
                    + "`id` int NOT NULL AUTO_INCREMENT,"
                    + "`numero` int NOT NULL,"
                    + "`saldo` double NOT NULL,"
                    + "`limite` double NOT NULL,"
                    + "PRIMARY KEY (`id`)"
                    + ");";

            try (PreparedStatement comandoCriarTabela = conexao.prepareStatement(criarTabelaSQL1)) {
                comandoCriarTabela.execute();
            }

            String criarTabelaSQL2 = "CREATE TABLE IF NOT EXISTS `acesso` ("
                    + "`id` INT NOT NULL AUTO_INCREMENT,"
                    + "`usuario` VARCHAR(45) NOT NULL,"
                    + "`senha` VARCHAR(70) NOT NULL,"
                    + "PRIMARY KEY (`id`)"
                    + ");";

            try (PreparedStatement comandoCriarTabela = conexao.prepareStatement(criarTabelaSQL2)) {
                comandoCriarTabela.execute();
            }

            String criarTabelaSQL3 = "INSERT INTO `acesso` (`usuario`, `senha`)"
                    + "SELECT 'admin', '1234'"
                    + "WHERE NOT EXISTS ("
                    + "SELECT 1 FROM `acesso` WHERE `id` = 1"
                    + ");";

            try (PreparedStatement comandoCriarTabela = conexao.prepareStatement(criarTabelaSQL3)) {
                comandoCriarTabela.execute();
            }

            System.out.println("Banco de Dados e Tabelas criados com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro ao tentar criar ou recriar um banco de dados! " + e.getSQLState());
        }
    }
}
