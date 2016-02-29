package ro.academyplus.controller;

import ro.academyplus.Hero;
import ro.academyplus.controller.factory.Factory;
import ro.academyplus.model.GameMode;
import ro.academyplus.model.Model;

import java.util.ArrayList;
import java.util.Observer;

/**
 * Created by flo on 29.02.2016.
 */
public class Controller {
    Model theModel;
    Factory theFactory;

    public Controller(Model theModel) {
        this.theModel = theModel;
        this.theFactory = Factory.getInstance();
    }

    public void addObserver(Observer o) {
        theModel.addObserver(o);
    }

    public void setMode(GameMode mode) {
        theModel.setMode(mode);
    }

    public void createNewPlayer(String playerName) {
        theModel.createNewPlayer(playerName);
    }
}
