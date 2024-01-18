package org.example.t1test.Controller;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.example.t1test.Model.CharModel;
import org.example.t1test.Service.FrequencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class FrequencyController {
    private final FrequencyService FrequencyService;

    public FrequencyController(org.example.t1test.Service.FrequencyService frequencyService) {
        FrequencyService = frequencyService;
    }

    @Tag(name="getCharacterFrequency", description="Контроллер получает на вход String в качестве параметра и " +
            "возвращает частоту встречи символов")
    @GetMapping("/frequency")
    public List<CharModel> getCharacterFrequency(@RequestParam (required = false) @Parameter(description = "Строка") String input ) {
        if (input == null) {
            return Collections.emptyList();
        } else return FrequencyService.charCalculate(input);
    }
}