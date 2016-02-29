package ro.academyplus.model;

import ro.academyplus.Hero;
import ro.academyplus.*;

import java.util.*;

/**
 * Created by flo on 29.02.2016.
 */
public class Model extends Observable {
    private String playerName;
    private ArrayList<Hero> heroArray;

    public void setMode(GameMode mode) {
        setChanged();
        notifyObservers(mode);
    }

    public void createNewPlayer(String playerName) {
        this.playerName = playerName;
        this.heroArray = new ArrayList<Hero>();
    }
}
