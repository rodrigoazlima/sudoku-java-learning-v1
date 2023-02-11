package dev.rodrigoazlima.sudoku.v1.main.ui.components;

import dev.rodrigoazlima.sudoku.v1.main.core.GameController;
import dev.rodrigoazlima.sudoku.v1.main.core.DifficultyEnum;
import dev.rodrigoazlima.sudoku.v1.main.ui.tools.ThemeManager;

import javax.swing.*;

public class MenuBar extends JMenuBar {

    private final GameController controller;
    private final ThemeManager themeManager;

    public MenuBar(GameController controller, ThemeManager themeManager) {
        this.controller = controller;
        this.themeManager = themeManager;
        initChildComponents();
    }

    private void initChildComponents() {
        {
            JMenu mainMenu = new JMenu();
            mainMenu.setText("Main");
            {
                JMenuItem newGameItem = new JMenuItem();
                newGameItem.setText("New Game");
                newGameItem.addActionListener((evt) -> {
                    controller.newGame();
                });
                mainMenu.add(newGameItem);
            }
            {
                JMenu difficultyMenu = new JMenu();
                difficultyMenu.setText("Difficulty");
                for (DifficultyEnum difficulty : DifficultyEnum.values()) {
                    JMenuItem difficultyItem = new JMenuItem();
                    difficultyItem.setText(difficulty.getText());
                    difficultyItem.addActionListener((evt) -> {
                        controller.setDifficulty(difficulty);
                    });
                    difficultyMenu.add(difficultyItem);
                }
                mainMenu.add(difficultyMenu);
            }
            mainMenu.add(new JSeparator());
            {
                JMenuItem closeItem = new JMenuItem();
                closeItem.setText("Close");
                closeItem.addActionListener((evt) -> {
                    controller.close();
                });
                mainMenu.add(closeItem);
            }
            add(mainMenu);
        }
        {
            JMenu windowMenu = new JMenu();
            windowMenu.setText("Window");
            {
                JMenu themeMenu = new JMenu();
                themeMenu.setText("Themes");
                for (ThemeManager.ThemesEnum themeEnum : ThemeManager.ThemesEnum.values()) {
                    JMenuItem lafItem = new JMenuItem();
                    lafItem.setText(themeEnum.getText());
                    lafItem.addActionListener((evt) -> {
                        themeManager.updateGlobalLookAndFeel(themeEnum);
                    });
                    themeMenu.add(lafItem);
                }
                windowMenu.add(themeMenu);
            }
            add(windowMenu);
        }
    }
}
