package Principal;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) throws Exception {
        
        Socket servidor = new Socket("127.0.0.1", 12345);
        
        System.out.println("Este cliente se conectou ao servidor!");

        Scanner leitor = new Scanner(System.in);
        
        PrintStream saidaNoServidor = new PrintStream(servidor.getOutputStream());

        while (leitor.hasNextLine()) {
            saidaNoServidor.println(leitor.nextLine());
        }

        saidaNoServidor.close();
        leitor.close();
        servidor.close();
    }
}
