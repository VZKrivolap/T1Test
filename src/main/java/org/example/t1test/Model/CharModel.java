package org.example.t1test.Model;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Модель символа")
public class CharModel {
    @Schema(description = "Символьное отображение")
    private char character;
    @Schema(description = "Частота использования")
    private int frequency;

    public CharModel(char character, int frequency) {
        this.character = character;
        this.frequency = frequency;
    }

    public CharModel() {
    }

    public char getCharacter() {
        return character;
    }

    public void setCharacter(char character) {
        this.character = character;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }
}
