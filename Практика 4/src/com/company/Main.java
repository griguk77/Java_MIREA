package com.company;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    private static final String AC_MILAN = "AC Milan";
    private static final String REAL_MADRID = "Real Madrid";

    JButton butACMilan = new JButton(AC_MILAN);
    JButton butRealMadrid = new JButton(REAL_MADRID);
    JLabel jlResult = new JLabel("Result: 0 X 0");
    JLabel jlLastScorer = new JLabel("Last Scorer: N/A");
    Label lWinner = new Label("Winner: DRAW");
    int acMilanScore = 0;
    int realMadridScore = 0;

    public Main() {
        super("Лига Чемпионов УЕФА");
        setSize(350, 150);
        setLayout(new FlowLayout());
        add(butACMilan);
        add(butRealMadrid);
        add(jlResult);
        add(jlLastScorer);
        add(lWinner);
        setVisible(true);
        butACMilan.addActionListener(ae -> {
            acMilanScore++;
            jlLastScorer.setText("Last Scorer: " + AC_MILAN);
            scoreGoal();
        });
        butRealMadrid.addActionListener(ae -> {
            realMadridScore++;
            jlLastScorer.setText("Last Scorer: " + REAL_MADRID);
            scoreGoal();
        });
    }

    private void scoreGoal() {
        jlResult.setText("Result: " + acMilanScore + " X " + realMadridScore);
        if (acMilanScore > realMadridScore) {
            lWinner.setText("Winner: " + AC_MILAN);
        } else if (realMadridScore > acMilanScore) {
            lWinner.setText("Winner: " + REAL_MADRID);
        } else {
            lWinner.setText("Winner: DRAW");
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}