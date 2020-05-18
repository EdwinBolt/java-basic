package innerClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyApp extends JFrame{
    JButton button = new JButton("OK");
    JLabel label = new JLabel("label");

    MyApp(){
        getContentPane().add(button, BorderLayout.SOUTH);
        getContentPane().add(label,BorderLayout.NORTH);
        final ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("hallo");
            }
        };
        button.addActionListener(listener);

        //ClickListener cl = new ClickListener();
        //button.addActionListener(cl);

    }




    public static void main(String[] args) {
        MyApp app = new MyApp();
//        MyApp.ClickListener cl = app.new ClickListener();
//        app.button.addActionListener(cl);
        app.setSize(300,300);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

//    private class ClickListener implements ActionListener{
//
//        public void actionPerformed(ActionEvent e) {
//            label.setText("hallo");
//        }
//
//    }

//    @Override
//    public void actionPerformed(ActionEvent e) {
//        label.setText("hallo");
//    }
}
