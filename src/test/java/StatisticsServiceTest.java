import org.junit.jupiter.api.Test;
import ru.netology.statistic.StatisticsService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatisticsServiceTest {

    @Test
    void findMaxWithSeveralMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxWithOneMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 20, 11, 11, 3};
        long expected = 20;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}
