package AcessoADados;

public class Cliente {
    private int id;
    private String nome;
    private String cpf;
    private String email;

    public Cliente(int id, String nome, String cpf, String email) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    @Override
    public String toString() {
        return "ID: " + getId() + ", Nome: " + getNome() + ", CPF: " + getCpf() + ", E-mail: " + getEmail();
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }
}