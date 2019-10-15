package com.karolinadutka;

import java.awt.event.ActionListener;
import javax.swing.*;

public class TennisView extends JFrame {

    private JButton newGameButton = new JButton("New Game");
    private JLabel player1NameLabel = new JLabel("Player 1 name: ");
    private JTextField player1Name = new JTextField(15);
    private JLabel vsLabel = new JLabel("      vs      ");
    private JLabel player2NameLabel = new JLabel("Player 2 name: ");
    private JTextField player2Name = new JTextField(15);
    private JButton player1Button = new JButton("Point for Player 1");
    private JButton player2Button = new JButton("Point for Player 2");

    private JLabel scoreLabel = new JLabel("Score");
    private JTextField scorePlayer1 = new JTextField(10);
    private JLabel toLabel1 = new JLabel("      :      ");
    private JTextField scorePlayer2 = new JTextField(10);

    private JLabel gamesScoreLabel = new JLabel("Game score");
    private JTextField gamesPlayer1 = new JTextField(10);
    private JLabel toLabel2 = new JLabel("      :      ");
    private JTextField gamesPlayer2 = new JTextField(10);

    private JLabel setsScoreLabel = new JLabel("Set score");
    private JTextField setsPlayer1 = new JTextField(10);
    private JLabel toLabel3 = new JLabel("      :      ");
    private JTextField setsPlayer2 = new JTextField(10);


    TennisView() {

        JPanel calcPanel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 300);
        this.setTitle("Tennis Point Counter");


        GroupLayout layout = new GroupLayout(calcPanel);
        calcPanel.setLayout(layout);

        layout.setAutoCreateContainerGaps(true);
        layout.setAutoCreateGaps(true);

        layout.setHorizontalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(newGameButton)
                        .addComponent(scoreLabel)
                        .addComponent(gamesScoreLabel)
                        .addComponent(setsScoreLabel))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(player1NameLabel)
                        .addComponent(player1Name)
                        .addComponent(player1Button)
                        .addComponent(scorePlayer1)
                        .addComponent(gamesPlayer1)
                        .addComponent(setsPlayer1))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(vsLabel)
                        .addComponent(toLabel1)
                        .addComponent(toLabel2)
                        .addComponent(toLabel3))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(player2NameLabel)
                        .addComponent(player2Name)
                        .addComponent(player2Button)
                        .addComponent(scorePlayer2)
                        .addComponent(gamesPlayer2)
                        .addComponent(setsPlayer2))
        );

        layout.setVerticalGroup(
                layout.createSequentialGroup()
                        .addComponent(newGameButton)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(player1NameLabel)
                                .addComponent(player2NameLabel))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(player1Name)
                                .addComponent(vsLabel)
                                .addComponent(player2Name))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(player1Button)
                                .addComponent(player2Button))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(scoreLabel)
                                .addComponent(scorePlayer1)
                                .addComponent(toLabel1)
                                .addComponent(scorePlayer2))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(gamesScoreLabel)
                                .addComponent(gamesPlayer1)
                                .addComponent(toLabel2)
                                .addComponent(gamesPlayer2))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(setsScoreLabel)
                                .addComponent(setsPlayer1)
                                .addComponent(toLabel3)
                                .addComponent(setsPlayer2))

        );


        calcPanel.add(newGameButton);
        calcPanel.add(player1NameLabel);
        calcPanel.add(player1Name);
        calcPanel.add(vsLabel);
        calcPanel.add(player2NameLabel);
        calcPanel.add(player2Name);
        calcPanel.add(player1Button);
        calcPanel.add(player2Button);

        calcPanel.add(scoreLabel);
        calcPanel.add(scorePlayer1);
        calcPanel.add(toLabel1);
        calcPanel.add(scorePlayer2);

        calcPanel.add(gamesScoreLabel);
        calcPanel.add(gamesPlayer1);
        calcPanel.add(toLabel2);
        calcPanel.add(gamesPlayer2);

        calcPanel.add(setsScoreLabel);
        calcPanel.add(setsPlayer1);
        calcPanel.add(toLabel3);
        calcPanel.add(setsPlayer2);


        this.add(calcPanel);
    }


    public int getScorePlayer1() {

        return Integer.parseInt(scorePlayer1.getText());
    }

    public void setScorePlayer1(int solution) {
        scorePlayer1.setText(Integer.toString(solution));
    }

    public int getScorePlayer2() {
        return Integer.parseInt(scorePlayer2.getText());
    }

    public void setScorePlayer2(int solution) {
        scorePlayer2.setText(Integer.toString(solution));
    }

    public int getGamesPlayer1() {
        return Integer.parseInt(gamesPlayer1.getText());
    }

    public int getGamesPlayer2() {
        return Integer.parseInt(gamesPlayer2.getText());
    }

    public int getSetsPlayer1() {
        return Integer.parseInt(setsPlayer1.getText());
    }

    public int getSetsPlayer2() {
        return Integer.parseInt(setsPlayer2.getText());
    }


    public void setGamesPlayer1(int solution) {
        gamesPlayer1.setText(Integer.toString(solution));
    }

    public void setGamesPlayer2(int solution) {
        gamesPlayer2.setText(Integer.toString(solution));
    }

    public void setSetsPlayer1(int solution) {
        setsPlayer1.setText(Integer.toString(solution));
    }

    public void setSetsPlayer2(int solution) {
        setsPlayer2.setText(Integer.toString(solution));
    }

    public String getPlayer1Name() {
        return player1Name.getText();
    }

    public String getPlayer2Name() {
        return player2Name.getText();
    }

    void addCalculationListenerPlayer1(ActionListener listenerForPlayer1Button) {

        player1Button.addActionListener(listenerForPlayer1Button);
    }

    void addCalculationListenerPlayer2(ActionListener listenerForPlayer2Button) {

        player2Button.addActionListener(listenerForPlayer2Button);
    }

    void addNewGameListener(ActionListener listenerForNewGameButton) {

        newGameButton.addActionListener(listenerForNewGameButton);
    }

    void displayErrorMessage(String errorMessage) {

        JOptionPane.showMessageDialog(this, errorMessage);
    }

}
