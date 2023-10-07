package _BancoDeDados;

import DAO.GerenciadorBD;
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

            String criarBancoSQL = "CREATE DATABASE IF NOT EXISTS `bancoabc_camadas_rel_entidades`;";

            try (PreparedStatement comandoCriarBanco = conexao.prepareStatement(criarBancoSQL)) {
                comandoCriarBanco.execute();
            }

            String usarBancoSQL = "USE `bancoabc_camadas_rel_entidades`;";

            try (PreparedStatement comandoUsarBanco = conexao.prepareStatement(usarBancoSQL)) {
                comandoUsarBanco.execute();
            }

            String criarTabelaSQL1 = "CREATE TABLE IF NOT EXISTS `cliente` ("
                    + "`id` int NOT NULL AUTO_INCREMENT,"
                    + "`nome` VARCHAR(65) NOT NULL,"
                    + "`cpf` bigint NOT NULL,"
                    + "`email` VARCHAR(30) NOT NULL,"
                    + "PRIMARY KEY (`id`)"
                    + ");";

            try (PreparedStatement comandoCriarTabela = conexao.prepareStatement(criarTabelaSQL1)) {
                comandoCriarTabela.execute();
            }

            String criarTabelaSQL2 = "INSERT INTO `cliente` (`nome`, `cpf`, `email`)"
                    + "SELECT 'ana', 12345677890, 'ana@zmail.com' "
                    + "WHERE NOT EXISTS ("
                    + "SELECT 1 FROM `cliente` WHERE `id` = 1"
                    + ");";

            try (PreparedStatement comandoCriarTabela = conexao.prepareStatement(criarTabelaSQL2)) {
                comandoCriarTabela.execute();
            }

            String criarTabelaSQL3 = "INSERT INTO `cliente` (`nome`, `cpf`, `email`)"
                    + "SELECT 'maria', 9876543210, 'maria@zmail.com' "
                    + "WHERE NOT EXISTS ("
                    + "SELECT 1 FROM `cliente` WHERE `id` = 2"
                    + ");";

            try (PreparedStatement comandoCriarTabela = conexao.prepareStatement(criarTabelaSQL3)) {
                comandoCriarTabela.execute();
            }

            String criarTabelaSQL4 = "INSERT INTO `cliente` (`nome`, `cpf`, `email`)"
                    + "SELECT 'joão', 9182736450, 'joao@zmail.com' "
                    + "WHERE NOT EXISTS ("
                    + "SELECT 1 FROM `cliente` WHERE `id` = 3"
                    + ");";

            try (PreparedStatement comandoCriarTabela = conexao.prepareStatement(criarTabelaSQL4)) {
                comandoCriarTabela.execute();
            }

            String criarTabelaSQL5 = "CREATE TABLE IF NOT EXISTS `conta` ("
                    + "`id` INT NOT NULL AUTO_INCREMENT,"
                    + "`numero` INT NOT NULL,"
                    + "`saldo` DOUBLE NOT NULL,"
                    + "`limite` DOUBLE NOT NULL,"
                    + "`cliente_id` INT NOT NULL,"
                    + "PRIMARY KEY (`id`),"
                    + "CONSTRAINT `fk_conta_cliente` FOREIGN KEY (`cliente_id`) REFERENCES `cliente` (`id`)"
                    + ");";

            try (PreparedStatement comandoCriarTabela = conexao.prepareStatement(criarTabelaSQL5)) {
                comandoCriarTabela.execute();
            }

            String criarTabelaSQL6 = "CREATE TABLE IF NOT EXISTS `acesso` ("
                    + "`id` INT NOT NULL AUTO_INCREMENT,"
                    + "`usuario` VARCHAR(45) NOT NULL,"
                    + "`senha` VARCHAR(70) NOT NULL,"
                    + "PRIMARY KEY (`id`)"
                    + ");";

            try (PreparedStatement comandoCriarTabela = conexao.prepareStatement(criarTabelaSQL6)) {
                comandoCriarTabela.execute();
            }

            String criarTabelaSQL7 = "INSERT INTO `acesso` (`usuario`, `senha`)"
                    + "SELECT 'admin', '1234'"
                    + "WHERE NOT EXISTS ("
                    + "SELECT 1 FROM `acesso` WHERE `id` = 1"
                    + ");";

            try (PreparedStatement comandoCriarTabela = conexao.prepareStatement(criarTabelaSQL7)) {
                comandoCriarTabela.execute();
            }

            System.out.println("Banco de Dados e Tabelas criados com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro ao tentar criar ou recriar um banco de dados! " + e.getSQLState());
        }
    }
}
