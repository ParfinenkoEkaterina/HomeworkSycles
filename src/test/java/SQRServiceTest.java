import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.SQRService;

import java.util.concurrent.atomic.AtomicInteger;

public class SQRServiceTest {

    @Test
    public void shouldCalcCounter() {
        SQRService service = new SQRService();

        int expected = 4;
        int actual = service.calcSQR(350, 500);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcNewCounter() {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.calcSQR(200, 300);

        Assertions.assertEquals(expected, actual);
    }
}
