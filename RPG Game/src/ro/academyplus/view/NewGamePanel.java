package ro.academyplus.view;

import ro.academyplus.controller.Controller;
import ro.academyplus.model.GameMode;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by flo on 29.02.2016.
 */
public class NewGamePanel extends JPanel {
    JButton backButton = new JButton("Back");
    JTextField playerName = new JTextField(12);
    JLabel playerNameLabel = new JLabel("Enter your name:");
    JButton createPlayer = new JButton("Create Player");

    public NewGamePanel(final Controller theController) {
        add(playerNameLabel);
        add(playerName);
        add(createPlayer);
        add(backButton);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                theController.setMode(GameMode.START);
            }
        });

        createPlayer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                theController.createNewPlayer(playerName.getText());
                theController.setMode(GameMode.SELECT_HERO);
            }
        });
    }
}
