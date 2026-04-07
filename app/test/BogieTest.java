import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class BogieTest {

    @Test
    void testFilter_CapacityGreaterThanThreshold() {
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 80),
                new Bogie("AC", 60)
        );

        List<Bogie> result = UC8FilterBogieByCapacityApp.filterBogies(bogies, 70);

        assertEquals(1, result.size());
        assertTrue(result.get(0).getCapacity() > 70);
    }

    @Test
    void testFilter_NoBogiesMatching() {
        List<Bogie> bogies = Arrays.asList(
                new Bogie("AC", 50),
                new Bogie("First", 40)
        );

        List<Bogie> result = UC8FilterBogieByCapacityApp.filterBogies(bogies, 70);

        assertTrue(result.isEmpty());
    }

    @Test
    void testFilter_EmptyBogieList() {
        List<Bogie> bogies = new ArrayList<>();

        List<Bogie> result = UC8FilterBogieByCapacityApp.filterBogies(bogies, 60);

        assertTrue(result.isEmpty());
    }
}