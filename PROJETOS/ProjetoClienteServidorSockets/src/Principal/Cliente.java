package Principal;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) throws Exception {
        
        Socket cliente = new Socket("127.0.0.1", 12345);
        
        System.out.println("Este cliente se conectou ao servidor!");

        Scanner teclado = new Scanner(System.in);
        
        PrintStream saida = new PrintStream(cliente.getOutputStream());

        while (teclado.hasNextLine()) {
            saida.println(teclado.nextLine());
        }

        saida.close();
        teclado.close();
    }
}
