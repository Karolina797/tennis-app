package com.karolinadutka;

import javax.swing.*;

public class TennisModel {

    private int pointsPlayer1;
    private int pointsPlayer2;
    private int gamesPlayer1;
    private int gamesPlayer2;
    private int setsPlayer1;
    private int setsPlayer2;

/*
   To show advance - 'A' - instead of 65
   char myChar = '\u0041';
*/

    public void setPointsPlayer1(int pointsPlayer1) {
        this.pointsPlayer1 = pointsPlayer1;
    }

    public void setPointsPlayer2(int pointsPlayer2) {
        this.pointsPlayer2 = pointsPlayer2;
    }

    public int getPointsPlayer1() {
        return pointsPlayer1;
    }

    public int getPointsPlayer2() {
        return pointsPlayer2;
    }

    public int getGamesPlayer1() {
        return gamesPlayer1;
    }

    public int getGamesPlayer2() {
        return gamesPlayer2;
    }

    public int getSetsPlayer1() {
        return setsPlayer1;
    }

    public int getSetsPlayer2() {
        return setsPlayer2;
    }

    public void setGamesPlayer1(int gamesPlayer1) {
        this.gamesPlayer1 = gamesPlayer1;
    }

    public void setGamesPlayer2(int gamesPlayer2) {
        this.gamesPlayer2 = gamesPlayer2;
    }

    public void setSetsPlayer1(int setsPlayer1) {
        this.setsPlayer1 = setsPlayer1;
    }

    public void setSetsPlayer2(int setsPlayer2) {
        this.setsPlayer2 = setsPlayer2;
    }


// 3 sets game --- player 1 method

    public void calculationPlayer1(int setsPlayer1, int gamesPlayer1, int pointsPlayer1, int setsPlayer2,
                                   int gamesPlayer2, int pointsPlayer2, String player1Name) {


        if (setsPlayer1 <= 2 && setsPlayer2 <= 2) {
            if (gamesPlayer1 < 5) {

                if (pointsPlayer1 == 0) {
                    this.pointsPlayer1 = 15;
                } else if (pointsPlayer1 == 15) {
                    this.pointsPlayer1 = 30;
                } else if (pointsPlayer1 == 30) {
                    this.pointsPlayer1 = 40;
                } else if (pointsPlayer1 == 40) {
                    if (pointsPlayer2 <= 30) {
                        this.pointsPlayer1 = 0;
                        this.pointsPlayer2 = 0;
                        this.gamesPlayer1 = gamesPlayer1 + 1;
                    } else if (pointsPlayer2 == 40) {
                        this.pointsPlayer1 = 65;
                    } else if (pointsPlayer2 == 65) {
                        this.pointsPlayer1 = 40;
                        this.pointsPlayer2 = 40;
                    }
                } else if (pointsPlayer1 == 65 && pointsPlayer2 == 40) {
                    this.pointsPlayer1 = 0;
                    this.pointsPlayer2 = 0;
                    this.gamesPlayer1 = gamesPlayer1 + 1;
                }

            } else if (gamesPlayer1 == 5 && gamesPlayer2 < 5) {

                if (pointsPlayer1 == 0) {
                    this.pointsPlayer1 = 15;
                } else if (pointsPlayer1 == 15) {
                    this.pointsPlayer1 = 30;
                } else if (pointsPlayer1 == 30) {
                    this.pointsPlayer1 = 40;
                } else if (pointsPlayer1 == 40) {
                    if (pointsPlayer2 <= 30) {
                        this.pointsPlayer1 = 0;
                        this.pointsPlayer2 = 0;
                        this.gamesPlayer1 = 0;
                        this.gamesPlayer2 = 0;
                        this.setsPlayer1 = setsPlayer1 + 1;
                        if (this.setsPlayer1 == 3) {
                            JOptionPane.showMessageDialog(null, "The winner is " + player1Name);
                        }
                    } else if (pointsPlayer2 == 40) {
                        this.pointsPlayer1 = 65;
                    } else if (pointsPlayer2 == 65) {
                        this.pointsPlayer1 = 40;
                        this.pointsPlayer2 = 40;
                    }
                } else if (pointsPlayer1 == 65 && pointsPlayer2 == 40) {
                    this.pointsPlayer1 = 0;
                    this.pointsPlayer2 = 0;
                    this.gamesPlayer1 = 0;
                    this.gamesPlayer2 = 0;
                    this.setsPlayer1 = setsPlayer1 + 1;
                    if (this.setsPlayer1 == 3) {
                        JOptionPane.showMessageDialog(null, "The winner is " + player1Name);
                    }
                }
            } else if (gamesPlayer1 == 5 && gamesPlayer2 == 5) {

                if (pointsPlayer1 == 0) {
                    this.pointsPlayer1 = 15;
                } else if (pointsPlayer1 == 15) {
                    this.pointsPlayer1 = 30;
                } else if (pointsPlayer1 == 30) {
                    this.pointsPlayer1 = 40;
                } else if (pointsPlayer1 == 40) {
                    if (pointsPlayer2 <= 30) {
                        this.pointsPlayer1 = 0;
                        this.pointsPlayer2 = 0;
                        this.gamesPlayer1 = gamesPlayer1 + 1;
                    } else if (pointsPlayer2 == 40) {
                        this.pointsPlayer1 = 65;
                    } else if (pointsPlayer2 == 65) {
                        this.pointsPlayer1 = 40;
                        this.pointsPlayer2 = 40;
                    }
                } else if (pointsPlayer1 == 65 && pointsPlayer2 == 40) {
                    this.pointsPlayer1 = 0;
                    this.pointsPlayer2 = 0;
                    this.gamesPlayer1 = gamesPlayer1 + 1;
                }

            } else if (gamesPlayer1 == 5 && gamesPlayer2 == 6) {

                if (pointsPlayer1 == 0) {
                    this.pointsPlayer1 = 15;
                } else if (pointsPlayer1 == 15) {
                    this.pointsPlayer1 = 30;
                } else if (pointsPlayer1 == 30) {
                    this.pointsPlayer1 = 40;
                } else if (pointsPlayer1 == 40) {
                    if (pointsPlayer2 <= 30) {
                        this.pointsPlayer1 = 0;
                        this.pointsPlayer2 = 0;
                        this.gamesPlayer1 = gamesPlayer1 + 1;
                    } else if (pointsPlayer2 == 40) {
                        this.pointsPlayer1 = 65;
                    } else if (pointsPlayer2 == 65) {
                        this.pointsPlayer1 = 40;
                        this.pointsPlayer2 = 40;
                    }
                } else if (pointsPlayer1 == 65 && pointsPlayer2 == 40) {
                    this.pointsPlayer1 = 0;
                    this.pointsPlayer2 = 0;
                    this.gamesPlayer1 = gamesPlayer1 + 1;
                }

            } else if (gamesPlayer1 == 6 && gamesPlayer2 == 5) {
                if (pointsPlayer1 == 0) {
                    this.pointsPlayer1 = 15;
                } else if (pointsPlayer1 == 15) {
                    this.pointsPlayer1 = 30;
                } else if (pointsPlayer1 == 30) {
                    this.pointsPlayer1 = 40;
                } else if (pointsPlayer1 == 40) {
                    if (pointsPlayer2 <= 30) {
                        this.pointsPlayer1 = 0;
                        this.pointsPlayer2 = 0;
                        this.gamesPlayer1 = 0;
                        this.gamesPlayer2 = 0;
                        this.setsPlayer1 = setsPlayer1 + 1;
                        if (this.setsPlayer1 == 3) {
                            JOptionPane.showMessageDialog(null, "The winner is " + player1Name);
                        }
                    } else if (pointsPlayer2 == 40) {
                        this.pointsPlayer1 = 65;
                    } else if (pointsPlayer2 == 65) {
                        this.pointsPlayer1 = 40;
                        this.pointsPlayer2 = 40;

                    }

                } else if (pointsPlayer1 == 65 && pointsPlayer2 == 40) {
                    this.pointsPlayer1 = 0;
                    this.pointsPlayer2 = 0;
                    this.gamesPlayer1 = 0;
                    this.gamesPlayer2 = 0;
                    this.setsPlayer1 = setsPlayer1 + 1;
                    if (this.setsPlayer1 == 3) {
                        JOptionPane.showMessageDialog(null, "The winner is " + player1Name);
                    }
                }

            } else if (gamesPlayer1 == 6 && gamesPlayer2 == 6) {

                if (pointsPlayer1 < 6) {
                    this.pointsPlayer1 = pointsPlayer1 + 1;
                } else if (pointsPlayer1 == 6 && pointsPlayer2 < 6) {
                    this.pointsPlayer1 = 0;
                    this.pointsPlayer2 = 0;
                    this.gamesPlayer1 = 0;
                    this.gamesPlayer2 = 0;
                    this.setsPlayer1 = setsPlayer1 + 1;
                    if (this.setsPlayer1 == 3) {
                        JOptionPane.showMessageDialog(null, "The winner is " + player1Name);
                    }
                } else if (pointsPlayer1 >= 6 && (pointsPlayer1 - pointsPlayer2) < 1) {
                    this.pointsPlayer1 = pointsPlayer1 + 1;
                } else if (pointsPlayer1 >= 6 && (pointsPlayer1 - pointsPlayer2) == 1) {
                    this.pointsPlayer1 = 0;
                    this.pointsPlayer2 = 0;
                    this.gamesPlayer1 = 0;
                    this.gamesPlayer2 = 0;
                    this.setsPlayer1 = setsPlayer1 + 1;
                    if (this.setsPlayer1 == 3) {
                        JOptionPane.showMessageDialog(null, "The winner is " + player1Name);
                    }
                }
            }

        }


    }


// 3 sets game --- player 2 method


    public void calculationPlayer2(int setsPlayer1,int gamesPlayer1, int pointsPlayer1,int setsPlayer2, int gamesPlayer2, int pointsPlayer2,  String player2Name) {


        if (setsPlayer2 <= 2 && setsPlayer1 <= 2) {
            if (gamesPlayer2 < 5) {

                if (pointsPlayer2 == 0) {
                    this.pointsPlayer2 = 15;
                } else if (pointsPlayer2 == 15) {
                    this.pointsPlayer2 = 30;
                } else if (pointsPlayer2 == 30) {
                    this.pointsPlayer2 = 40;
                } else if (pointsPlayer2 == 40) {
                    if (pointsPlayer1 <= 30) {
                        this.pointsPlayer2 = 0;
                        this.pointsPlayer1 = 0;
                        this.gamesPlayer2 = gamesPlayer2 + 1;
                    } else if (pointsPlayer1 == 40) {
                        this.pointsPlayer2 = 65;
                    } else if (pointsPlayer1 == 65) {
                        this.pointsPlayer2 = 40;
                        this.pointsPlayer1 = 40;
                    }
                } else if (pointsPlayer2 == 65 && pointsPlayer1 == 40) {
                    this.pointsPlayer2 = 0;
                    this.pointsPlayer1 = 0;
                    this.gamesPlayer2 = gamesPlayer2 + 1;
                }

            } else if (gamesPlayer2 == 5 && gamesPlayer1 < 5) {

                if (pointsPlayer2 == 0) {
                    this.pointsPlayer2 = 15;
                } else if (pointsPlayer2 == 15) {
                    this.pointsPlayer2 = 30;
                } else if (pointsPlayer2 == 30) {
                    this.pointsPlayer2 = 40;
                } else if (pointsPlayer2 == 40) {
                    if (pointsPlayer1 <= 30) {
                        this.pointsPlayer2 = 0;
                        this.pointsPlayer1 = 0;
                        this.gamesPlayer2 = 0;
                        this.gamesPlayer1 = 0;
                        this.setsPlayer2 = setsPlayer2 + 1;
                        if (this.setsPlayer2 == 3) {
                            JOptionPane.showMessageDialog(null, "The winner is " + player2Name);
                        }
                    } else if (pointsPlayer1 == 40) {
                        this.pointsPlayer2 = 65;
                    } else if (pointsPlayer1 == 65) {
                        this.pointsPlayer2 = 40;
                        this.pointsPlayer1 = 40;
                    }
                } else if (pointsPlayer2 == 65 && pointsPlayer1 == 40) {
                    this.pointsPlayer2 = 0;
                    this.pointsPlayer1 = 0;
                    this.gamesPlayer2 = 0;
                    this.gamesPlayer1 = 0;
                    this.setsPlayer2 = setsPlayer2 + 1;
                    if (this.setsPlayer2 == 3) {
                        JOptionPane.showMessageDialog(null, "The winner is " + player2Name);
                    }
                }
            } else if (gamesPlayer2 == 5 && gamesPlayer1 == 5) {

                if (pointsPlayer2 == 0) {
                    this.pointsPlayer2 = 15;
                } else if (pointsPlayer2 == 15) {
                    this.pointsPlayer2 = 30;
                } else if (pointsPlayer2 == 30) {
                    this.pointsPlayer2 = 40;
                } else if (pointsPlayer2 == 40) {
                    if (pointsPlayer1 <= 30) {
                        this.pointsPlayer2 = 0;
                        this.pointsPlayer1 = 0;
                        this.gamesPlayer2 = gamesPlayer2 + 1;
                    } else if (pointsPlayer1 == 40) {
                        this.pointsPlayer2 = 65;
                    } else if (pointsPlayer1 == 65) {
                        this.pointsPlayer2 = 40;
                        this.pointsPlayer1 = 40;
                    }
                } else if (pointsPlayer2 == 65 && pointsPlayer1 == 40) {
                    this.pointsPlayer2 = 0;
                    this.pointsPlayer1 = 0;
                    this.gamesPlayer2 = gamesPlayer2 + 1;
                }

            } else if (gamesPlayer2 == 5 && gamesPlayer1 == 6) {

                if (pointsPlayer2 == 0) {
                    this.pointsPlayer2 = 15;
                } else if (pointsPlayer2 == 15) {
                    this.pointsPlayer2 = 30;
                } else if (pointsPlayer2 == 30) {
                    this.pointsPlayer2 = 40;
                } else if (pointsPlayer2 == 40) {
                    if (pointsPlayer1 <= 30) {
                        this.pointsPlayer2 = 0;
                        this.pointsPlayer1 = 0;
                        this.gamesPlayer2 = gamesPlayer2 + 1;
                    } else if (pointsPlayer1 == 40) {
                        this.pointsPlayer2 = 65;
                    } else if (pointsPlayer1 == 65) {
                        this.pointsPlayer2 = 40;
                        this.pointsPlayer1 = 40;
                    }
                } else if (pointsPlayer2 == 65 && pointsPlayer1 == 40) {
                    this.pointsPlayer2 = 0;
                    this.pointsPlayer1 = 0;
                    this.gamesPlayer2 = gamesPlayer2 + 1;
                }

            } else if (gamesPlayer2 == 6 && gamesPlayer1 == 5) {
                if (pointsPlayer2 == 0) {
                    this.pointsPlayer2 = 15;
                } else if (pointsPlayer2 == 15) {
                    this.pointsPlayer2 = 30;
                } else if (pointsPlayer2 == 30) {
                    this.pointsPlayer2 = 40;
                } else if (pointsPlayer2 == 40) {
                    if (pointsPlayer1 <= 30) {
                        this.pointsPlayer2 = 0;
                        this.pointsPlayer1 = 0;
                        this.gamesPlayer2 = 0;
                        this.gamesPlayer1 = 0;
                        this.setsPlayer2 = setsPlayer2 + 1;
                        if (this.setsPlayer2 == 3) {
                            JOptionPane.showMessageDialog(null, "The winner is " + player2Name);
                        }
                    } else if (pointsPlayer1 == 40) {
                        this.pointsPlayer2 = 65;
                    } else if (pointsPlayer1 == 65) {
                        this.pointsPlayer2 = 40;
                        this.pointsPlayer1 = 40;

                    }

                } else if (pointsPlayer2 == 65 && pointsPlayer1 == 40) {
                    this.pointsPlayer2 = 0;
                    this.pointsPlayer1 = 0;
                    this.gamesPlayer2 = 0;
                    this.gamesPlayer1 = 0;
                    this.setsPlayer2 = setsPlayer2 + 1;
                    if (this.setsPlayer2 == 3) {
                        JOptionPane.showMessageDialog(null, "The winner is " + player2Name);
                    }
                }

            } else if (gamesPlayer2 == 6 && gamesPlayer1 == 6) {

                if (pointsPlayer2 < 6) {
                    this.pointsPlayer2 = pointsPlayer2 + 1;
                } else if (pointsPlayer2 == 6 && pointsPlayer1 < 6) {
                    this.pointsPlayer2 = 0;
                    this.pointsPlayer1 = 0;
                    this.gamesPlayer2 = 0;
                    this.gamesPlayer1 = 0;
                    this.setsPlayer2 = setsPlayer2 + 1;
                    if (this.setsPlayer2 == 3) {
                        JOptionPane.showMessageDialog(null, "The winner is " + player2Name);
                    }
                } else if (pointsPlayer2 >= 6 && (pointsPlayer2 - pointsPlayer1) < 1) {
                    this.pointsPlayer2 = pointsPlayer2 + 1;
                } else if (pointsPlayer2 >= 6 && (pointsPlayer2 - pointsPlayer1) == 1) {
                    this.pointsPlayer2 = 0;
                    this.pointsPlayer1 = 0;
                    this.gamesPlayer2 = 0;
                    this.gamesPlayer1 = 0;
                    this.setsPlayer2 = setsPlayer2 + 1;
                    if (this.setsPlayer2 == 3) {
                        JOptionPane.showMessageDialog(null, "The winner is " + player2Name);
                    }
                }
            }

        }


    }

}
