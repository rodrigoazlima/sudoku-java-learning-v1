package dev.rodrigoazlima.sudoku.v1.main.core;

public class GameController {

    public void close() {
        if (checkBeforeExit()) {
            System.exit(0);
        }
    }

    private boolean checkBeforeExit() {
        // TODO CHECK GAME FINISHED OR CHANGES
        return true;
    }

    public void newGame() {
    }

    public void setDifficulty(DifficultyEnum difficulty) {
    }
}
