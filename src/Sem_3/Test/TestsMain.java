import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import Sem_3.*;

public class TestsMain {

    //тесты для метода evenOddNumber
    @Test
    void checkEvenNumber() {
        assertTrue(Main.evenOddNumber(100));
    }
    @Test
    void checkOddNumber() {
        assertFalse(Main.evenOddNumber(77));
    }

    //тесты для метода numberInInterval
    @Test
    void checkInInterval() {
        assertTrue(Main.numberInInterval(26));
        assertTrue(Main.numberInInterval(99));
    }
    @Test
    void checkNotInInterval() {
        assertFalse(Main.numberInInterval(25));
        assertFalse(Main.numberInInterval(100));
        assertFalse(Main.numberInInterval(0));
    }
}
