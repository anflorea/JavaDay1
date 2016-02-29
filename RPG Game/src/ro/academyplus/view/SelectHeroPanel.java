package ro.academyplus.view;

import ro.academyplus.Hero;
import ro.academyplus.controller.Controller;
import ro.academyplus.model.GameMode;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by flo on 29.02.2016.
 */
public class SelectHeroPanel extends JPanel {
    JLabel availableHeroes = new JLabel("Select your hero:");
    JComboBox heroList = new JComboBox();
    JButton createNewHero = new JButton("Create Hero");
    JButton mainMenu = new JButton("Main menu");

    public SelectHeroPanel(final Controller theController) {
        add(availableHeroes);
        add(heroList);
        add(createNewHero);
        add(mainMenu);

        mainMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                theController.setMode(GameMode.START);
            }
        });

        createNewHero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                theController.setMode(GameMode.CREATE_HERO);
            }
        });
    }
}
