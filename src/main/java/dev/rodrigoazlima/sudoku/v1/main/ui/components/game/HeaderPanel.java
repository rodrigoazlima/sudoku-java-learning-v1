package dev.rodrigoazlima.sudoku.v1.main.ui.components.game;

import dev.rodrigoazlima.sudoku.v1.main.ui.language.Language;

import javax.swing.*;
import java.awt.*;

public class HeaderPanel extends JPanel {

    private static final Dimension TITLE_SIZE = new Dimension(400, 36);
    private static final Dimension SUBTITLE_SIZE = new Dimension(200, 21);

    public HeaderPanel() {
        init();
    }

    private void init() {
        setLayout(new BorderLayout());
        {
            JLabel titleLabel = new JLabel(Language.SUDOKU);
            titleLabel.setHorizontalAlignment(JLabel.CENTER);
            titleLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 32));
            titleLabel.setSize(TITLE_SIZE);
            titleLabel.setPreferredSize(TITLE_SIZE);
            titleLabel.setMinimumSize(TITLE_SIZE);
            add(titleLabel, BorderLayout.CENTER);
        }
        {
            JPanel blankPanel = new JPanel();
            blankPanel.setSize(SUBTITLE_SIZE);
            blankPanel.setPreferredSize(SUBTITLE_SIZE);
            blankPanel.setMinimumSize(SUBTITLE_SIZE);
            blankPanel.setMaximumSize(SUBTITLE_SIZE);
            add(blankPanel, BorderLayout.LINE_START);
        }
        {
            JLabel subTitleLabel = new JLabel(Language.AUTHOR_DOMAIN);
            subTitleLabel.setHorizontalAlignment(JLabel.LEFT);
            subTitleLabel.setVerticalAlignment(JLabel.BOTTOM);
            subTitleLabel.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 18));
            subTitleLabel.setSize(SUBTITLE_SIZE);
            subTitleLabel.setPreferredSize(SUBTITLE_SIZE);
            subTitleLabel.setMinimumSize(SUBTITLE_SIZE);
            subTitleLabel.setMaximumSize(SUBTITLE_SIZE);
            add(subTitleLabel, BorderLayout.LINE_END);
        }
    }
}
