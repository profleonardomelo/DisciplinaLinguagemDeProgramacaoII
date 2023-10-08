package Principal;

/**
 *Classe que possui o método Main. Esta é a classe principal deste programa.
 * 
 * @author IFBA
 */
public class Programa {

    /**
     * Método principal do programa. Ponto de entrada desta aplicação java. 
     * 
     * @param args Vetor de argumentos de linha de comando.
     */
    public static void main(String[] args) {
        
        Conta c1 = new Conta();
        c1.Depositar(100);
    }
    
}
