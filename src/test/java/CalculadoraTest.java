import org.example.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    public void somaDoisNumeros(){
        Calculadora calculadora = new Calculadora();
        int soma = calculadora.soma(4,8);
        Assertions.assertEquals(12, soma);
    }
}
