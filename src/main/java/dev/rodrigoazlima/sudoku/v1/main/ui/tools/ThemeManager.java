package dev.rodrigoazlima.sudoku.v1.main.ui.tools;

import dev.rodrigoazlima.sudoku.v1.main.ui.language.Language;

import javax.swing.*;

public class ThemeManager {

    public enum ThemesEnum {
        LIGHT("com.formdev.flatlaf.FlatLightLaf"),
        DARK("com.formdev.flatlaf.FlatDarkLaf"),
        DRACULA("com.formdev.flatlaf.FlatDarculaLaf"),
        INTELLIJ("com.formdev.flatlaf.FlatIntelliJLaf"),
        MAC_LIGHT("com.formdev.flatlaf.themes.FlatMacLightLaf"),
        MAC_DARK("com.formdev.flatlaf.themes.FlatMacDarkLaf");

        private final String lafClass;

        ThemesEnum(String lafClass) {
            this.lafClass = lafClass;
        }

        public String getText() {
            return Language.translate(this.toString());
        }
    }

    private final JFrame window;

    public ThemeManager(JFrame window) {
        this.window = window;
    }

    public void updateGlobalLookAndFeel() {
        JFrame.setDefaultLookAndFeelDecorated(true);

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            UIManager.setLookAndFeel(ThemesEnum.LIGHT.lafClass);

        } catch (Throwable ignored) {
            try {
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
            } catch (Exception ignored2) {
            }
        }
        if (window != null) {
            SwingUtilities.updateComponentTreeUI(window);
        }
    }

    public void updateGlobalLookAndFeel(ThemesEnum theme) {
        try {
            if (window != null) {
                window.dispose();
            }
            UIManager.setLookAndFeel(theme.lafClass);
        } catch (Throwable ignored) {
            JOptionPane.showMessageDialog(window, "Failed to set look and feel");
            try {
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
            } catch (Exception ignored2) {
            }
        } finally {
            if (window != null) {
                SwingUtilities.updateComponentTreeUI(window);
                window.setVisible(true);
            }
        }
    }
}
