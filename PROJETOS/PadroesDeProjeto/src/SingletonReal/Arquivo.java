package SingletonReal;

public class Arquivo {
    private static Arquivo arquivo;

    private Arquivo() {}

    public static Arquivo obterArquivo() {
        if (arquivo == null) {
            arquivo = new Arquivo();
        }
        return arquivo;
    }
    
    //Outros...
    //...
}
