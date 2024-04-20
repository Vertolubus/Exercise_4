import org.example.QuadraticTrinomial;
import org.junit.Test;
import static org.junit.Assert.*;

public class QuadraticTrinomialTest
{
    @Test
    public void testToString()
    {
        assertEquals("Корни уравнения: [-4.0, -1.0]", new QuadraticTrinomial(1, 5, 4).toString());
        assertEquals("Корни уравнения: [-2.0]", new QuadraticTrinomial(1, 4, 4).toString());
        assertEquals("Корни уравнения: []", new QuadraticTrinomial(1, 2, 3).toString());

        assertEquals("Корни уравнения: [-1.0]", new QuadraticTrinomial(0, 4, 4).toString());
        assertEquals("Корни уравнения: []", new QuadraticTrinomial(0, 0, 3).toString());

        assertEquals("Корни уравнения: [Infinity]", new QuadraticTrinomial(0, 0, 0).toString());
    }
}