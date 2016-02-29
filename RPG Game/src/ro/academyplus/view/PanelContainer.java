package ro.academyplus.view;

import ro.academyplus.controller.Controller;
import ro.academyplus.model.GameMode;

import javax.swing.*;
import java.awt.*;

/**
 * Created by flo on 29.02.2016.
 */
public class PanelContainer extends JPanel {
    private CardLayout cardLayout = new CardLayout();

    private StartGamePanel startGamePanel;
    private NewGamePanel newGamePanel;
    private SelectHeroPanel selectHeroPanel;
    private CreateHeroPanel createHeroPanel;

    public PanelContainer(Controller theController) {
        startGamePanel = new StartGamePanel(theController);
        newGamePanel = new NewGamePanel(theController);
        selectHeroPanel = new SelectHeroPanel(theController);
        createHeroPanel = new CreateHeroPanel(theController);
        setLayout(cardLayout);
        add(startGamePanel, GameMode.START.toString());
        add(newGamePanel, GameMode.NEW_GAME.toString());
        add(selectHeroPanel, GameMode.SELECT_HERO.toString());
        add(createHeroPanel, GameMode.CREATE_HERO.toString());
        cardLayout.show(this, GameMode.START.toString());
    }

    public void setMode(GameMode mode) {
        cardLayout.show(this, mode.toString());
    }
}
