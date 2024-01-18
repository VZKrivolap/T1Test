package org.example.t1test.Service.Impl;

import org.example.t1test.Model.CharModel;
import org.example.t1test.Service.FrequencyService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class FrequencyServiceImpl implements FrequencyService {

    @Override
    public List<CharModel> charCalculate(String input) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (char character : input.toCharArray()) {
            frequencyMap.put(character, frequencyMap.getOrDefault(character, 0) + 1);
        }

        List<CharModel> result = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            result.add(new CharModel(entry.getKey(), entry.getValue()));
        }

        result.sort((a, b) -> b.getFrequency() - a.getFrequency());

        return result;
    }
}
