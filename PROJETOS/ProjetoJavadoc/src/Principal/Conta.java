package Principal;

/**
 * Classe que modela uma Conta em um domínio bancário.
 * 
 * @author IFBA
 * @version 1.0
 */
public class Conta {
    
    public int numero;
    public double saldo;
    
    /**
    * Este método é responsável por realizar uma operação de saque em uma conta.
    * 
    * @param valor Este parâmetro corresponde ao valor a ser sacado em uma conta. 
    * @return Retorna se a operação de saque foi realizada com sucesso ou não. 
    */
    public boolean Sacar(double valor)
    {
        if(valor <= this.saldo)
        {
            this.saldo -= valor;
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /**
    * Este método é responsável por realizar uma operação de depósito em uma conta.
    * 
    * @param valor Este parâmetro corresponde ao valor a ser depositado em uma conta. 
    * @return Retorna se a operação de depósito foi realizada com sucesso ou não. 
    */
    public boolean Depositar(double valor)
    {
        if(valor > 0){
            this.saldo += valor;
            return true;
        }
        else
        {
            return false;
        }
    }
}
