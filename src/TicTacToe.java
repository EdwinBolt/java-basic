import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe extends JFrame {

    public TicTacToe(){
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3,3));
        getContentPane().add(panel, BorderLayout.CENTER);
        JDialog winMessage = new JDialog();


        JButton[][] field = new JButton[3][3];

        for (int i = 0; i<3; i++) {
            for (int j = 0; j < 3; j++) {
                field[i][j] = new JButton();
                field[i][j].setText("");
                panel.add(field[i][j]);
                //scoringArray[i]="";
                int finalI = i;
                int finalJ = j;
                field[i][j].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String currentState = e.getActionCommand();
                        switch (currentState) {
                            case "x":
                            case "o":
                                break;
                            case "":
                                // do stuff
                                if (player == 1) {
                                    field[finalI][finalJ].setText("x");
                                } else if (player == -1) {
                                    field[finalI][finalJ].setText("o");
                                }
                                player *= -1;
                                moves += 1;
                                break;
                            default:
                                System.out.println("error");
                        }
                        // score system



                        for (int k = 0; k < 3; k++ ){
                            boolean win=false;
                            String winner = "";
                                if (field[k][0].getText() == field[k][1].getText() && field[k][0].getText() == field[k][2].getText() && field[k][0].getText()!=""){
                                    //rows
                                    win = true;
                                    winner = field[k][0].getText();
                                }
                                if (field[0][k].getText() == field[1][k].getText() && field[0][k].getText() == field [2][k].getText() && field[0][k].getText()!=""){
                                    //columns
                                    win = true;

                                    winner = field[0][k].getText();
                                }
                                if (field[0][0].getText() == field[1][1].getText() && field[0][0].getText() == field[2][2].getText() && field[0][0].getText()!=""){
                                    //diagonal
                                    win = true;
                                    winner = field[0][0].getText();
                                }

                                if (win) {
                                    String message = (winner + " wins");

                                    JOptionPane.showMessageDialog(winMessage, message);
                                    for (int l=0; l<3; l++){
                                        for (int m=0; m<3; m++){
                                            field[l][m].setText("");
                                        }
                                    }
                                    moves = 0;
                                }

                        }
                        if (moves ==9){

                            JOptionPane.showMessageDialog(winMessage, "draw, try again");
                            for (int l=0; l<3; l++){
                                for (int m=0; m<3; m++){
                                    field[l][m].setText("");
                                }
                            }
                        }


                    }

                });
            }
        }
        }



    int player=1;
    int moves = 0;
    String [] scoringArray = new String[9];




    public static void main(String[] args) {
        TicTacToe tictac = new TicTacToe();
        tictac.setSize(400,400);
        tictac.setVisible(true);
        tictac.setDefaultCloseOperation(EXIT_ON_CLOSE);


    }

}
