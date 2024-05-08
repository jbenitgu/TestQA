import static org.junit.Assert.*;

import com.bensg.Calculadora;
import org.junit.BeforeClass;
import org.junit.Test;

 //Modificado en la Web #1
public class CalculadoraTest {
    Calculadora cal = new Calculadora();

    @Test
    public void testSuma(){
        System.out.println("Ejecutando test Suma");
        assertEquals(8, cal.suma(3,5));
        assertEquals(103, cal.suma(3,100));
        //Modificado en la Web #2

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

    @BeforeClass
    public static void message() {
        String NTTDATA_WELCOME = "-------------------------------------------------------------------------------------|\n" +
                "-------------------------------------------------------------------------------------|\n" +
                "   ____  _____  _________  _________  ______        _     _________     _       \n" +
                "  |_   \\|_   _||  _   _  ||  _   _  ||_   _ `.     / \\   |  _   _  |   / \\      \n" +
                "    |   \\ | |  |_/ | | \\_||_/ | | \\_|  | | `. \\   / _ \\  |_/ | | \\_|  / _ \\     \n" +
                "    | |\\ \\| |      | |        | |      | |  | |  / ___ \\     | |     / ___ \\    \n" +
                "   _| | \\   |_    _| |_      _| |_    _| |_.' /_/ /   \\ \\_  _| |_  _/ /   \\ \\_  \n" +
                "  |_____\\____|  |_____|    |_____|  |______.'|____| |____||_____||____| |____|\n" +

                "-------------------------------------------------------------------------------------|\n" +
                "-------------------------------------------------------------------------------------|\n" ;
        System.out.println(NTTDATA_WELCOME);
        System.out.println("Hola Interbank!!");
    }


}
