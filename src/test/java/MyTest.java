import com.feature.App;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyTest {
    @Test
    public void pozitif_deger_dogru() {
        var number = 1453;
        var app = new App();
        boolean expResult = true;
        boolean result = app.isPositive(number);
        Assertions.assertEquals(expResult, result);
    }

    @Test
    public void negatif_deger_yanlis() {
        var number = -1453;
        var app = new App();
        boolean expResult = false;
        boolean result = app.isPositive(number);
        Assertions.assertEquals(expResult, result);
    }
}
