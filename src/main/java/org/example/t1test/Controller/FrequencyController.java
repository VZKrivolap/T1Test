package org.example.t1test.Controller;

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
    private FrequencyService FrequencyService;

    @Autowired
    public FrequencyController(org.example.t1test.Service.FrequencyService frequencyService) {
        FrequencyService = frequencyService;
    }

    @GetMapping("/frequency")
    public List<CharModel> getCharacterFrequency(@RequestParam (required = false) String input) {
        if (input == null) {
            return Collections.emptyList();
        } else return FrequencyService.charCalculate(input);
    }
}