package dev.rodrigoazlima.sudoku.v1.main;

import dev.rodrigoazlima.sudoku.v1.main.ui.components.MainWindow;
import dev.rodrigoazlima.sudoku.v1.main.ui.tools.ThemeManager;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::createAndShowGUI);
    }

    private static void createAndShowGUI() {
        JFrame mainWindow = new MainWindow();
        mainWindow.setVisible(true);
    }

}
