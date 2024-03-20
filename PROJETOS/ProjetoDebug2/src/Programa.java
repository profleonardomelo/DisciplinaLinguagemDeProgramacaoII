public class Programa {

    public static void main(String[] args) {
       
        Calculadora c = new Calculadora(8, 4);
        
        double r_soma = c.somar();
        
        System.out.println("Resultado da soma: " + r_soma);
        
    }
    
}
