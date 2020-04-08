import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class NumberGuessing extends JFrame implements ActionListener {
    JLabel display = new JLabel("Start guessing between 0 and 1000");
    JTextField textField = new JTextField();

    public NumberGuessing (){
        getContentPane().add(display, BorderLayout.NORTH);
        getContentPane().add(textField, BorderLayout.SOUTH);
        textField.addActionListener(this);


    }

    int correctAnswer = new Random().nextInt(1000);

    @Override
    public void actionPerformed(ActionEvent e) {
        String guessedString = e.getActionCommand();
        int guessedNumber = Integer.parseInt(guessedString);
       // System.out.println(guessedString);
        textField.setText("");

        if (correctAnswer == guessedNumber){
            display.setText("Nice, that's it. Wanna try again?");
            correctAnswer = new Random().nextInt(1000);
        }
        else if (guessedNumber < correctAnswer) {
            display.setText("try a little higher");
        }
        else if (guessedNumber > correctAnswer) {
            display.setText("try a little lower");
        }


    }



    public static void main(String[] args){

        NumberGuessing numberGuessing = new NumberGuessing();

        numberGuessing.setSize(400,100);
        numberGuessing.setVisible(true);
        numberGuessing.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}