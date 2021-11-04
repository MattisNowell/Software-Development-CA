import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;


public class PebbleGameTest {
    @Test
    public void higherTest() {
        PebbleGame p = new PebbleGame();
        assertEquals(5, p.higher(5, 3));
    }
}
