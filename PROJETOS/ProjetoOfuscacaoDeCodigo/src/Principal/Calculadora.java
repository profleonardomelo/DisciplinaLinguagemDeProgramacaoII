package Principal;

public class Calculadora {

    public static void main(String[] args) {
        
        int numero1 = 10;
        int numero2 = 5;
        
        int resultado = soma(numero1, numero2);
        
        System.out.println("O resultado da soma e: " + resultado);
    }

    public static int soma(int a, int b) {
        return a + b;
    }

}
