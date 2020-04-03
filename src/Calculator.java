
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {
    JLabel display = new JLabel("");
    //JTextPane

    public Calculator(){
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4,4));
        getContentPane().add(panel, BorderLayout.CENTER);
        getContentPane().add(display, BorderLayout.NORTH);
 
        String[] labels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "+",
                ".", "0", "=", "-"
        };

        for (int i = 0 ; i < 16; i++) {
            JButton button = new JButton(labels[i]);
            panel.add(button);
            button.addActionListener(this);
        }
    }


    String operator;
    double number1, number2, result, prefix=0.0;
    boolean number1Given, number1Decimal, number2Given, number2Decimal, answerGiven;

    @Override
    public void actionPerformed(ActionEvent e) {
        String currentButton = e.getActionCommand();
        switch (currentButton){
            case "0":  case "1":  case "2":  case "3":  case "4": case "5":  case "6":  case "7":  case "8": case "9":
                if (prefix ==0.0)
                    display.setText(currentButton);
                else
                    display.setText(display.getText()+currentButton);
                break;
            case "/": case "*": case "+": case "-":
                if (prefix==0.0) {
                    number1 = Double.parseDouble(display.getText());
                } else {
                    double postfix = Double.parseDouble(display.getText());
                    while (postfix>1) {
                        postfix /= 10;
                    }
                    number1 = prefix + postfix;
                    prefix = 0.0;
                }
                display.setText(" ");
                operator = currentButton;


                break;
            case "=":
                if (prefix==0.0) {
                    number2 = Double.parseDouble(display.getText());
                } else {
                    double postfix = Double.parseDouble(display.getText());
                    while (postfix>1) {
                        postfix /= 10;
                    }
                    number2 = prefix + postfix;
                    prefix = 0.0;
                }

                switch (operator){
                    case "+":
                        System.out.println("+");
                        result =number1+number2;
                        break;
                    case"-":
                        result = number1-number2;
                        break;
                    case "*":
                        result = number1*number2;
                        break;
                    case"/":result = number1/number2;
                        break;
                    default:
                        System.out.println("error");
                }
                display.setText(result+"");
                break;
            case ".":
                prefix = Double.parseDouble(display.getText());
                number1 = 0;
                display.setText(display.getText() + ".");
                break;
            default:
                System.out.println("error");

        }

//        System.out.println(currentButton);
        //      display.setText(currentButton);
    }




    public static void main(String[] args){
        //Calculator.Calculator calculator = new Calculator.Calculator();
        Calculator  calculator = new Calculator();
        calculator.setSize(400,400);
        calculator.setVisible(true);
        calculator.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
