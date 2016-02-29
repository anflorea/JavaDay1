package ro.academyplus;

import ro.academyplus.controller.Controller;
import ro.academyplus.model.Model;
import ro.academyplus.view.MainView;

/**
 * Created by Flo on 24-Feb-16.
 */
public class Main {
    public static void main(String[] args) {
        Model theModel = new Model();
        Controller theController = new Controller(theModel);
        MainView theView = new MainView(theController);
    }
}
