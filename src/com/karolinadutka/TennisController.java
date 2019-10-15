package com.karolinadutka;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TennisController {

    private TennisView theView;
    private TennisModel theModel;

    public TennisController(TennisView theView, TennisModel theModel) {
        this.theView = theView;
        this.theModel = theModel;

        this.theView.addCalculationListenerPlayer1(new CalculateListener());
        this.theView.addCalculationListenerPlayer2(new CalculateListener2());
        this.theView.addNewGameListener(new NewGameListener());

    }

    class CalculateListener implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {

            int points;
            int games;
            int sets;
            int points2;
            int games2;
            int sets2;
            String player1Name;

            try {
                points = theView.getScorePlayer1();
                games = theView.getGamesPlayer1();
                sets = theView.getSetsPlayer1();

                points2 = theView.getScorePlayer2();
                games2 = theView.getGamesPlayer2();
                sets2 = theView.getSetsPlayer2();
                player1Name = theView.getPlayer1Name();

                theModel.calculationPlayer1(sets, games, points, sets2, games2, points2,player1Name);

                theView.setScorePlayer1(theModel.getPointsPlayer1());
                theView.setGamesPlayer1(theModel.getGamesPlayer1());
                theView.setSetsPlayer1(theModel.getSetsPlayer1());

                theView.setScorePlayer2(theModel.getPointsPlayer2());
                theView.setGamesPlayer2(theModel.getGamesPlayer2());
                theView.setSetsPlayer2(theModel.getSetsPlayer2());

            } catch (NumberFormatException ex) {
                theView.displayErrorMessage("You need to click new game button");
            }
        }


    }

    class CalculateListener2 implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {

            int points;
            int games;
            int sets;
            int points2;
            int games2;
            int sets2;
            String player2Name;
            try {
                points = theView.getScorePlayer1();
                games = theView.getGamesPlayer1();
                sets = theView.getSetsPlayer1();

                points2 = theView.getScorePlayer2();
                games2 = theView.getGamesPlayer2();
                sets2 = theView.getSetsPlayer2();
                player2Name = theView.getPlayer2Name();

                theModel.calculationPlayer2(sets, games, points, sets2, games2, points2, player2Name);

                theView.setScorePlayer1(theModel.getPointsPlayer1());
                theView.setGamesPlayer1(theModel.getGamesPlayer1());
                theView.setSetsPlayer1(theModel.getSetsPlayer1());

                theView.setScorePlayer2(theModel.getPointsPlayer2());
                theView.setGamesPlayer2(theModel.getGamesPlayer2());
                theView.setSetsPlayer2(theModel.getSetsPlayer2());

            } catch (NumberFormatException ex) {
                theView.displayErrorMessage("You need to click new game button");
            }
        }


    }


    class NewGameListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            try {
                theModel.setPointsPlayer1(0);
                theView.setScorePlayer1(theModel.getPointsPlayer1());
                theModel.setPointsPlayer2(0);
                theView.setScorePlayer2(theModel.getPointsPlayer2());
                theModel.setGamesPlayer1(0);
                theView.setGamesPlayer1(theModel.getGamesPlayer1());
                theModel.setGamesPlayer2(0);
                theView.setGamesPlayer2(theModel.getGamesPlayer2());
                theModel.setSetsPlayer1(0);
                theView.setSetsPlayer1(theModel.getGamesPlayer1());
                theModel.setSetsPlayer2(0);
                theView.setSetsPlayer2(theModel.getGamesPlayer2());

            } catch (NumberFormatException ex) {
                theView.displayErrorMessage("You need to click New Game button");
            }

        }
    }
}


