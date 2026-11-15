import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ConversorTest {
    @Test
    void fahrenheitParaCelsius_100F() {
        assertEquals(37.7778, Conversor.fahrenheitParaCelsius(100), 0.001);
    }

    @Test
    void fahrenheitParaCelsius_32F() {
        assertEquals(0.0, Conversor.fahrenheitParaCelsius(32), 0.001);
    }

    @Test
    void celsiusParaFahrenheit_100C() {
        assertEquals(212.0, Conversor.celsiusParaFahrenheit(100), 0.001);
    }

    @Test
    void celsiusParaFahrenheit_0C() {
        assertEquals(32.0, Conversor.celsiusParaFahrenheit(0), 0.001);
    }
}