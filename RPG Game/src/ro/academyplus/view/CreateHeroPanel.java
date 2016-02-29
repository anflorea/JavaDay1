package ro.academyplus.view;

import ro.academyplus.controller.Controller;
import ro.academyplus.model.GameMode;
import ro.academyplus.model.HeroType;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by flo on 29.02.2016.
 */
public class CreateHeroPanel extends JPanel {
    JButton backButton = new JButton("Back");
    JLabel heroNameLabel = new JLabel("Hero name:");
    JTextField heroName = new JTextField(10);
    JLabel heroTypeLabel = new JLabel("Hero type:");
    JComboBox heroType = new JComboBox();
    JButton createHero = new JButton("Create");

    public CreateHeroPanel(final Controller theController) {
        for(HeroType i: HeroType.values()) {
            heroType.addItem(i);
        }

        add(heroNameLabel);
        add(heroName);
        add(heroTypeLabel);
        add(heroType);
        add(createHero);
        add(backButton);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                theController.setMode(GameMode.SELECT_HERO);
            }
        });
    }
}
