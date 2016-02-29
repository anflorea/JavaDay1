package ro.academyplus.view;

import ro.academyplus.controller.Controller;
import ro.academyplus.model.GameMode;

import javax.swing.*;
import java.util.*;

/**
 * Created by flo on 29.02.2016.
 */
public class MainView extends JFrame implements Observer {

    private Controller theController;
    private PanelContainer thePanel;

    @Override
    public void update(Observable observable, Object o) {
        if (o instanceof GameMode) {
            thePanel.setMode((GameMode) o);
        }
    }

    public MainView(Controller theController) {
        theController.addObserver(this);
        this.theController = theController;
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(600, 400);
        setTitle("Awesome Game");
        thePanel = new PanelContainer(theController);
        add(thePanel);
        setVisible(true);
    }


}
