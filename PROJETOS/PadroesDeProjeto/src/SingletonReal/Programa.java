package SingletonReal;

public class Programa {

    public static void main(String[] args) {
       
        Arquivo a1 = Arquivo.obterArquivo();
        Arquivo a2 = Arquivo.obterArquivo();

        if (a1 == a2) {
            System.out.println("Mesmo arquivo.");
        } else {
            System.out.println("Arquivos diferentes.");
        }

    }
}
