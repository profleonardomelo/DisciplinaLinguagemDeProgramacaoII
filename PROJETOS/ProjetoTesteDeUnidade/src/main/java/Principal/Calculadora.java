package Principal;

public class Calculadora {
    
    private double x;
    private double y;
    
    public Calculadora(double a, double b)
    {
        this.x = a; 
        this.y = b;
    }
    
    public double somar()
    {
        return this.x + this.y;
    }
    
    public double subtrair()
    {
        return this.x - this.y;
    }
    
    public double multiplicar()
    {
        return this.x * this.y;
    }
    
    public double dividir()
    {
        return this.x / this.y;
    }
}
