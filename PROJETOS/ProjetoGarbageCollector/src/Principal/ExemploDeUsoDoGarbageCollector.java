package Principal;

public class ExemploDeUsoDoGarbageCollector {

    public static void main(String[] args) {
        
        // Criamos um objeto
        Pessoa pessoa1 = new Pessoa("Maria");

        // Agora, criamos uma nova referência para o mesmo objeto
        Pessoa pessoa2 = pessoa1;

        // Atribuímos null à primeira referência
        pessoa1 = null;

        // Chamamos explicitamente o Garbage Collector (embora isso raramente seja necessário)
        System.gc();

        // Agora, a segunda referência é a única existente
        // O objeto ainda está na memória porque ainda é referenciado por pessoa2
        System.out.println(pessoa2.getNome());
        
    }
    
}
