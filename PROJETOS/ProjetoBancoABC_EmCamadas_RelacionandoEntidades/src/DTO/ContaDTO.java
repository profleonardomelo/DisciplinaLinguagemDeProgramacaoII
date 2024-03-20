package DTO;

public class ContaDTO {
    private int id;
    private int numero;
    private double saldo;
    private double limite;
    private int cliente_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    public int getClienteId() {
        return cliente_id;
    }

    public void setClienteId(int cliente_id) {
        this.cliente_id = cliente_id;
    }
    
    @Override
    public String toString() {
        return String.valueOf(this.numero); 
    }
}
