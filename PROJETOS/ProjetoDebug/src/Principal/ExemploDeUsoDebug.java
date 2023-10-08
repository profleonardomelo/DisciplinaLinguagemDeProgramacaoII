package Principal;

public class ExemploDeUsoDebug {

    public static void main(String[] args) {
        
        int soma = calcularSoma();

        System.out.println("A soma e: " + soma);
    }
    
    public static int calcularSoma() {
        int soma = 0;

        for (int i = 1; i <= 5; i++) {
            soma += i;
        }

        return soma;
    }
    
}
