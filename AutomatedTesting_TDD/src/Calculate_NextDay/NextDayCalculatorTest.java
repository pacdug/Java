package Calculate_NextDay;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

public class NextDayCalculatorTest {

    @Test
    void testNextDay01012018() {
        LocalDate date = LocalDate.of(2018, 1, 1);
        LocalDate expected = LocalDate.of(2018, 1, 2);

        LocalDate result = NextDayCalculator.getNextDay(date);
        assertEquals(expected, result);
    }

    @Test
    void testNextDay31012018() {
        LocalDate date = LocalDate.of(2018, 1, 31);
        LocalDate expected = LocalDate.of(2018, 2, 1);

        LocalDate result = NextDayCalculator.getNextDay(date);
        assertEquals(expected, result);
    }

    @Test
    void testNextDay30042018() {
        LocalDate date = LocalDate.of(2018, 4, 30);
        LocalDate expected = LocalDate.of(2018, 5, 1);

        LocalDate result = NextDayCalculator.getNextDay(date);
        assertEquals(expected, result);
    }

    @Test
    void testNextDay28022018() {
        LocalDate date = LocalDate.of(2018, 2, 28);
        LocalDate expected = LocalDate.of(2018, 3, 1);

        LocalDate result = NextDayCalculator.getNextDay(date);
        assertEquals(expected, result);
    }

    @Test
    void testNextDay29022020() {
        LocalDate date = LocalDate.of(2020, 2, 29);
        LocalDate expected = LocalDate.of(2020, 3, 1);

        LocalDate result = NextDayCalculator.getNextDay(date);
        assertEquals(expected, result);
    }

    @Test
    void testNextDay31122018() {
        LocalDate date = LocalDate.of(2018, 12, 31);
        LocalDate expected = LocalDate.of(2019, 1, 1);

        LocalDate result = NextDayCalculator.getNextDay(date);
        assertEquals(expected, result);
    }
}
