package Servidor;

import Contratos.ICalculadora;
import java.rmi.registry.LocateRegistry;
import java.rmi.Naming;

public class ServidorRMI {
    public static void main(String[] args) {
        try {
            ICalculadora calc = new Calculadora();
            
            String nomeObjeto = "rmi://localhost/calc";
            
            LocateRegistry.createRegistry(1099);
            
            Naming.rebind(nomeObjeto, calc);
            
            System.out.println("Servidor pronto...");
            
        } catch (Exception e) {
            System.err.println("Erro no servidor: " + e.toString());
        }
    }
}