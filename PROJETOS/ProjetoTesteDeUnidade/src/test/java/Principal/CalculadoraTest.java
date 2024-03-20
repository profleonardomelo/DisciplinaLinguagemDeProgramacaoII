package Principal;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {
    
    private Calculadora c;
    
    public CalculadoraTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        c = new Calculadora(8, 2);
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testSomar() {
        assertEquals(10.0, c.somar());
    }

    @Test
    public void testSubtrair() {
        assertEquals(6.0, c.subtrair());
    }

    @Test
    public void testMultiplicar() {
        assertEquals(16.0, c.multiplicar());
    }

    @Test
    public void testDividir() {
        assertEquals(4.0, c.dividir());
    }
    
}