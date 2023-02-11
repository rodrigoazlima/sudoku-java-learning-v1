package dev.rodrigoazlima.sudoku.v1.main.ui.components.game;

import javax.swing.*;

public class SudokuDiagramPanel extends JPanel {
    public SudokuDiagramPanel() {
        initChildComponents();
    }

    private void initChildComponents() {
        add(new JTextField("0"));
        add(new JTextField("0"));
        add(new JTextField("0"));
        add(new JTextField("0"));
        add(new JTextField("0"));
        add(new JTextField("0"));
        add(new JTextField("0"));
        add(new JTextField("0"));
        add(new JTextField("0"));
    }
}
