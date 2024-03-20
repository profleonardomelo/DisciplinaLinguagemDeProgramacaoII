package Principal;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Servidor {
    public static void main(String[] args) throws Exception {
        
        ServerSocket servidor = new ServerSocket(12345);
        
        System.out.println("Servidor executando - Porta 12345 aberta!");

        Socket cliente = servidor.accept();
        
        System.out.println("Nova conexao com o cliente: " +  
            cliente.getInetAddress().getHostAddress()
        );

        Scanner s = new Scanner(cliente.getInputStream());
        
        while (s.hasNextLine()) {
            System.out.println(s.nextLine());
        }

        s.close();
        servidor.close();
        cliente.close();
    }
}
