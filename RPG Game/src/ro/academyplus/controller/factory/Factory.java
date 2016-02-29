package ro.academyplus.controller.factory;

import ro.academyplus.model.HeroType;

/**
 * Created by flo on 29.02.2016.
 */
public class Factory {
    private static Factory instance = null;
    protected Factory() {

    }

    public static Factory getInstance() {
        if (instance == null) {
            instance = new Factory();
        }
        return instance;
    }

    public void createHero(String name, HeroType type) {

    }
}
