package org.example.t1test.Model;

public class CharModel {
    private char character;
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
