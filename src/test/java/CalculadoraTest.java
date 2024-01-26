import static org.junit.Assert.*;

import org.example.Calculadora;
import org.junit.Test;


public class CalculadoraTest {
    Calculadora cal = new Calculadora();

    @Test
    public void testSuma(){
        System.out.println("Ejecutando test Suma");
        assertEquals(8, cal.suma(3,5));
        assertEquals(103, cal.suma(3,100));
    }

    @Test
    public void testResta(){
        System.out.println("Ejecutando test Resta");
        assertEquals(2, cal.resta(5,3));
    }

    @Test
    public void testMultiplicacion(){
        System.out.println("Ejecutando test Multiplicacion");
        assertEquals(15, cal.multiplicacion(5,3));
        assertEquals(36, cal.multiplicacion(12,3));
    }
}
