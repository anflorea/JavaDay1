package ro.academyplus.view;

import ro.academyplus.controller.Controller;
import ro.academyplus.model.GameMode;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by flo on 29.02.2016.
 */
public class StartGamePanel extends JPanel {
    JButton newGame = new JButton("New Game");
    JButton loadGame = new JButton("Load Game");
    JButton exitGame = new JButton("Exit");

    public StartGamePanel(final Controller theController) {
        add(newGame);
        add(loadGame);
        add(exitGame);

        newGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                theController.setMode(GameMode.NEW_GAME);
            }
        });

        exitGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
    }
}
