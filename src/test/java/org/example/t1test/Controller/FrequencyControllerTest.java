import org.example.t1test.Controller.FrequencyController;
import org.example.t1test.Service.Impl.FrequencyServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

public class FrequencyControllerTest {

    private final FrequencyServiceImpl frequencyService = new FrequencyServiceImpl();
    private final FrequencyController frequencyController = new FrequencyController(frequencyService);
    private final MockMvc mockMvc = MockMvcBuilders.standaloneSetup(frequencyController).build();

    @Test
    public void testGetCharacterFrequency() throws Exception {
        String input = "aaaaabcccc";
        mockMvc.perform(get("/frequency").param("input", input))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.length()").value(3))
                .andExpect(jsonPath("$[0].character").value(equalTo("a")))
//                .andExpect(jsonPath("$[0].character").value('a'))
                .andExpect(jsonPath("$[0].frequency").value(5))
                .andExpect(jsonPath("$[1].character").value(equalTo("c")))
//                .andExpect(jsonPath("$[1].character").value('c'))
                .andExpect(jsonPath("$[1].frequency").value(4))
                .andExpect(jsonPath("$[2].character").value(equalTo("b")))
//                .andExpect(jsonPath("$[2].character").value('b'))
                .andExpect(jsonPath("$[2].frequency").value(1));




    }

    @Test
    public void testGetCharacterFrequencyWithEmptyInput() throws Exception {
        mockMvc.perform(get("/frequency").param("input", ""))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.length()").value(0));
    }

    @Test
    public void testGetCharacterFrequencyWithNullInput() throws Exception {
        mockMvc.perform(get("/frequency").param("input", (String) null))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.length()").value(0));
    }
}
