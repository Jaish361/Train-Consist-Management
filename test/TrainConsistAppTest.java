import org.junit.jupiter.api.Test;
import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class TrainConsistAppTest {

    @Test
    void testFilterBogiesByCapacity() {

        // Arrange (Input)
        List<bogie> bogies = Arrays.asList(
                new bogie("Sleeper", 72),
                new bogie("AC Chair", 60),
                new bogie("First Class", 40)
        );

        // Act (Processing)
        List<bogie> result = bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        // Assert (Expected vs Actual)
        assertEquals(1, result.size());
        assertEquals("Sleeper", result.get(0).getName());
    }
}