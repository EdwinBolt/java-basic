import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class TicTacToe extends JFrame {

    public static int find(int[] a, int target)
    {
        for (int i = 0; i < a.length; i++)
            if (a[i] == target) {
                //System.out.println("find = " + i);
                return i;
            }

        return -1;
    }

    public TicTacToe(){
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3,3));
        getContentPane().add(panel, BorderLayout.CENTER);
        JDialog winMessage = new JDialog();

        String[] options = {"Single player", "Multiplayer"};
        int playMode = JOptionPane.showOptionDialog(null, "Do you wanna play single player or multiplayer?",
                "Click a button",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);



        JButton[][] field = new JButton[3][3];

        for (int i = 0; i<3; i++) {
            for (int j = 0; j < 3; j++) {
                field[i][j] = new JButton();
                field[i][j].setText("");
                panel.add(field[i][j]);
                //scoringArray[i]="";

                field[i][j].addActionListener(actionProcessor(winMessage, field, i,j, playMode));
            }
        }
        }

    private ActionListener actionProcessor(JDialog winMessage, JButton[][] field, int finalI, int finalJ, int playMode) {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String currentState = e.getActionCommand();
                switch (currentState) {
                    case "x":
                    case "o":
                        break;
                    case "":
                        // do stuff
                        if (playMode == 0) {
                            // multiplayer
                            //   if (moves %2 == 0) {
                            field[finalI][finalJ].setText("x");
                            //} else {//if (player == -1) {
                            // computer turn
                            ArrayList<Integer> possibleIList = new ArrayList<>();
                            ArrayList<Integer> possibleJList = new ArrayList<>();
                            boolean movePossible = false;
                            for (int i = 0; i < 3; i++) {
                                for (int j = 0; j < 3; j++) {
                                    if (field[i][j].getText() == "") {
                                        movePossible = true;
                                        possibleIList.add(i);
                                        possibleJList.add(j);
                                    }
                                }
                            }

                            int[] moveScore = new int[possibleIList.size()];


                            if (movePossible == true) {
                                // random computer move
                                /*
                                int choice = new Random().nextInt(possibleIList.size());
                                int chosenI = possibleIList.get(choice);
                                int chosenJ = possibleJList.get(choice);


                                field[chosenI][chosenJ].setText("o");

                                 */

                                // min-max computer move
                                for (int i = 0; i< possibleIList.size(); i++){
                                    boolean continueChecking = true;
                                    boolean continue70 = true;

                                    int horizontalArray1 = (possibleIList.get(i) + 1) % 3;
                                    int horizontalArray2 = (possibleIList.get(i) + 2) % 3;
                                    int verticalArray1 = (possibleJList.get(i) + 1) % 3;
                                    int verticalArray2 = (possibleJList.get(i) + 2) % 3;
                                    if (field[possibleIList.get(i)][verticalArray1].getText() == field[possibleIList.get(i)][verticalArray2].getText()){
                                  //
                                        //      System.out.println(1);
                                        if (field[possibleIList.get(i)][verticalArray1].getText() == "o"){
                                            moveScore[i]=100;
                                            continueChecking = false;
                                        }
                                        else if (field[possibleIList.get(i)][verticalArray1].getText() == "x"){
                                            moveScore[i] = 70;
                                        }
                                        else{
                                            moveScore[i] = 0;
                                        }
                                    }
                                    if(continueChecking && field[horizontalArray1][possibleJList.get(i)].getText() == field[horizontalArray2][possibleJList.get(i)].getText()){
                                        //System.out.println(2);
                                        if (field[horizontalArray1][possibleJList.get(i)].getText() == "o"){
                                     //       System.out.println(2.1);
                                            moveScore[i] = 100;
                                            continueChecking = false;
                                        }
                                        else if (field[horizontalArray1][possibleJList.get(i)].getText() == "x"){

                                            moveScore[i] = 70;
                                            continue70 = false;
                                        }
                                        else{

                                            moveScore[i] = 0;
                                        }
                                    }
                                  //  System.out.println(3);
                                    if (continueChecking && possibleIList.get(i) == 1 && possibleJList.get(i) == 1){
                                        if (field[0][0].getText() == field[2][2].getText()){
                                            if (field[0][0].getText() == "o") {
                                                moveScore[i] = 100;
                                            }
                                            }else if(field[0][0].getText() == field[2][2].getText()){
                                            if (field[0][0].getText() == "o") {
                                                moveScore[i] = 70;
                                            }
                                            }

                                        }
                                    System.out.println("possible i = " + possibleIList.get(i) + "; possible j = " + possibleJList.get(i) + "; movescore = " +moveScore[i]);
                                    }

                                //System.out.println("movescore = " + moveScore);
                                int choice = find(moveScore, 100);

                                if (choice != -1){
                                    field[possibleIList.get(choice)][possibleJList.get(choice)].setText("o");
                                }
                                else {
                                    choice = find(moveScore, 70);
                                    if (choice != -1){
               //                         System.out.println("choice = " + choice);
                                        System.out.println("chosen i = " + possibleIList.get(choice));
                                        System.out.println("chosen j = " + possibleJList.get(choice));
                                        field[possibleIList.get(choice)][possibleJList.get(choice)].setText("o");
                                    }
                                    else{
                                        field[possibleIList.get(0)][possibleJList.get(0)].setText("o");
                                    }
                                }


                                }
                            System.out.println("");


                            //}
                            //player *= -1;
                            moves += 2;
                        }
                        else {//single player

                            if (player == 1) {
                                field[finalI][finalJ].setText("x");
                            } else if (player == -1) {
                                field[finalI][finalJ].setText("o");
                            }
                            player *= -1;
                            moves += 1;
                        }
                        break;
                    default:
                        System.out.println("error");
                }
                // score system

                boolean win=false;

                String winner = "";
                for (int k = 0; k < 3; k++ ){

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

                }

                if (field[0][0].getText() == field[1][1].getText() && field[0][0].getText() == field[2][2].getText() && field[0][0].getText()!=""){
                    //diagonal
                    win = true;
                    winner = field[0][0].getText();
                }
                if (field[0][2].getText() == field[1][1].getText() && field[0][2].getText() == field[2][0].getText() && field[0][2].getText()!=""){
                    //diagonal
                    win = true;
                    winner = field[0][2].getText();
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
                if (moves >8){

                    JOptionPane.showMessageDialog(winMessage, "draw, try again");
                    for (int l=0; l<3; l++){
                        for (int m=0; m<3; m++){
                            field[l][m].setText("");
                        }
                    }

                    moves = 0;
                }


            }

        };
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
