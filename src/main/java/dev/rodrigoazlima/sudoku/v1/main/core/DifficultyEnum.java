package dev.rodrigoazlima.sudoku.v1.main.core;

import dev.rodrigoazlima.sudoku.v1.main.ui.language.Language;

public enum DifficultyEnum {
    EASY, MEDIUM, HARD;

    public String getText() {
        return Language.translate(this.toString());
    }
}
