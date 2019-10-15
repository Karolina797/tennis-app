package com.karolinadutka;

public class Main {

    public static void main(String[] args) {
        TennisView theView = new TennisView();

        TennisModel theModel = new TennisModel();

        TennisController theController = new TennisController(theView, theModel);

        theView.setVisible(true);
    }
}
