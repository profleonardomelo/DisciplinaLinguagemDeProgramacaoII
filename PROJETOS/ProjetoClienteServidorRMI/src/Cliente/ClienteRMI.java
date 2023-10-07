package Cliente;

import Contratos.ICalculadora;
import java.rmi.Naming;

public class ClienteRMI {
    public static void main(String[] args) {
        try {
            
            String nomeDoObjeto = "rmi://localhost/calc";
            
            ICalculadora calc = (ICalculadora) Naming.lookup(nomeDoObjeto);
            
            int resultado = calc.somar(5, 3);
            
            System.out.println("Resultado: " + resultado);
            
        } catch (Exception e) {
            System.err.println("Erro no cliente: " + e.toString());
        }
    }
}
