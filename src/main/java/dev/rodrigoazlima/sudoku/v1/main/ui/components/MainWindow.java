package dev.rodrigoazlima.sudoku.v1.main.ui.components;

import dev.rodrigoazlima.sudoku.v1.main.core.GameController;
import dev.rodrigoazlima.sudoku.v1.main.ui.components.game.BottonPanel;
import dev.rodrigoazlima.sudoku.v1.main.ui.components.game.HeaderPanel;
import dev.rodrigoazlima.sudoku.v1.main.ui.components.game.ResizablePanel;
import dev.rodrigoazlima.sudoku.v1.main.ui.components.game.SudokuDiagramPanel;
import dev.rodrigoazlima.sudoku.v1.main.ui.tools.ThemeManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainWindow extends JFrame {
    private static final Dimension MINIMUM_SIZE = new Dimension(800, 600);

    private final GameController controller;
    private final ThemeManager themeManager;

    public MainWindow() throws HeadlessException {
        this.controller = new GameController();
        this.themeManager = new ThemeManager(this);
        init();
        initChildComponents();
    }

    private void init() {
        themeManager.updateGlobalLookAndFeel();
        setTitle("Sudoku v1 - rodrigoazlima.dev");
        setSize(MINIMUM_SIZE);
        setMinimumSize(MINIMUM_SIZE);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent ev) {
                controller.close();
            }
        });
    }

    private void initChildComponents() {
        setJMenuBar(new MenuBar(controller, themeManager));
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(new HeaderPanel(), BorderLayout.PAGE_START);
        contentPane.add(new SudokuDiagramPanel(), BorderLayout.CENTER);
        contentPane.add(new ResizablePanel(), BorderLayout.LINE_START);
        contentPane.add(new ResizablePanel(), BorderLayout.LINE_END);
        contentPane.add(new BottonPanel(), BorderLayout.PAGE_END);
    }
}
