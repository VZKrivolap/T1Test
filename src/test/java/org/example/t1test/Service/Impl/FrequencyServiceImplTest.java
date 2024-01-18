import org.example.t1test.Model.CharModel;
import org.example.t1test.Service.FrequencyService;
import org.example.t1test.Service.Impl.FrequencyServiceImpl;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FrequencyServiceImplTest {

    private final FrequencyService frequencyService = new FrequencyServiceImpl();

    @Test
    public void testCharCalculate() {
        String input = "aaaaabcccc";
        List<CharModel> result = frequencyService.charCalculate(input);

        assertEquals(3, result.size());

        assertTrue(result.get(0).getFrequency() >= result.get(1).getFrequency());
        assertTrue(result.get(1).getFrequency() >= result.get(2).getFrequency());

        assertEquals('a', result.get(0).getCharacter());
        assertEquals(5, result.get(0).getFrequency());

        assertEquals('c', result.get(1).getCharacter());
        assertEquals(4, result.get(1).getFrequency());

        assertEquals('b', result.get(2).getCharacter());
        assertEquals(1, result.get(2).getFrequency());
    }

    @Test
    public void testCharCalculateWithEmptyString() {
        String input = "";
        List<CharModel> result = frequencyService.charCalculate(input);

        assertEquals(0, result.size());
    }

    @Test
    public void testCharCalculateWithNullString() {
        String input = null;
        List<CharModel> result = frequencyService.charCalculate(input);

        assertEquals(0, result.size());
    }
}
