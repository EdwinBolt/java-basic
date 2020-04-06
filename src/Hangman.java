import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;


public class Hangman extends JFrame implements ActionListener {
    //Scanner scanner = new Scanner(System.in);
    //JPanel panel = new JPanel();
    JLabel display = new JLabel();
    JLabel progress = new JLabel();

    JTextField textField = new JTextField();


    // **********************************************************************************************
    // ***********   replace this by a module to randomly choose from a dictionairy *****************
    String answer = "geheugen";
    // **********************************************************************************************

    int attempts = 10;

    public Hangman() {

        display.setText("Make a guess, " + attempts + " tries remaining");
        for (int i=0; i < answer.length(); i++){
            progress.setText(progress.getText() + "_ ");
        }

        getContentPane().add(display, BorderLayout.NORTH);
        getContentPane().add(progress, BorderLayout.CENTER);
        getContentPane().add(textField, BorderLayout.SOUTH);

        textField.addActionListener(this);

    }


    public static void main(String[] args) {
        {
            Hangman hangman = new Hangman();
            hangman.setSize(400, 100);
            hangman.setVisible(true);
            hangman.setDefaultCloseOperation(EXIT_ON_CLOSE);
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String guessedLetter = e.getActionCommand();

        textField.setText("");

        if (guessedLetter.length() > 1){
            System.out.println("rrr");
            display.setText("only 1 letter at a time, " + attempts + " remaining" );
        }

        guessedLetter = guessedLetter.toLowerCase();
        ArrayList<Integer> hits = new ArrayList<>();
        ArrayList<String> hitResults = new ArrayList<>();

        int startIndex = 0;
        while (answer.substring(startIndex, answer.length()).contains(guessedLetter)){
            String tempstring = answer.substring(startIndex,answer.length());
            int foundIndex = tempstring.indexOf(guessedLetter)+startIndex;

            hits.add(foundIndex);
            hitResults.add(guessedLetter);
            startIndex = foundIndex + 1;// (answer.substring(startIndex, answer.length()).indexOf(guessedLetter)) +1 ;
            //System.out.println(startIndex);
        }

        String temp = progress.getText();
        for (int i = 0; i< hits.size(); i++){

            temp = temp.substring(0,(hits.get(i)*2)) + hitResults.get(i) + " " + temp.substring(hits.get(i)*2 + 2,temp.length());

        }

        progress.setText(temp);
        attempts -= 1;
        display.setText("Make a guess, " + attempts + " tries remaining");


        String tempString = progress.getText();
        if (!tempString.contains("_")){
            display.setText("Nice, you made it! Wanna go again?");
            attempts = 10;
            progress.setText("");
            for (int i=0; i < answer.length(); i++){
                progress.setText(progress.getText() + "_ ");
            }
        }

        if (attempts == 0){
            // lose message
            display.setText("You failed. Try again");
            attempts = 10;
            progress.setText("");
            for (int i=0; i < answer.length(); i++){
                progress.setText(progress.getText() + "_ ");
            }
        }

    }
}
