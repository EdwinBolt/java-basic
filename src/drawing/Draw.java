package drawing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.invoke.SwitchPoint;
import java.util.ArrayList;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;



public class Draw extends JFrame implements MouseListener, ActionListener {

    JFrame frame = new JFrame();
    Color chosenColor = Color.black;


    Figure figure = new Rect();
    ArrayList<Figure> figures = new ArrayList<>();

 public Draw(){


     //JFrame frame = new JFrame();
     addMouseListener(this);

     //Where the GUI is created:
     JMenuBar menuBar;
     JMenu menu, submenu;
     JMenuItem menuItem;
     JRadioButtonMenuItem rbMenuItem;
     JCheckBoxMenuItem cbMenuItem;
     menuBar = getjMenuBar();

     add(menuBar, BorderLayout.PAGE_START);
 }

    private JMenuBar getjMenuBar() {
        JMenuBar menuBar;
        JMenu menu;
        JMenuItem menuItem;
        JRadioButtonMenuItem rbMenuItem;
        JCheckBoxMenuItem cbMenuItem;
        JMenu submenu;//Create the menu bar.
        menuBar = new JMenuBar();

//Build the first menu.
        menu = new JMenu("Shape");
        menu.setMnemonic(KeyEvent.VK_A);
        menu.getAccessibleContext().setAccessibleDescription(
                "The only menu in this program that has menu items");
        menuBar.add(menu);


        String[] shapes = {"Oval", "Rectangle", "Triangle", "Line"};

        for (String shape : shapes){
            menuItem = new JMenuItem(shape);
            menu.add(menuItem);
            menuItem.addActionListener( this);
        }

        menuBar.add(menu);

        //String[] buttons = {"Color", "Undo"};

        menuItem = new JMenuItem("Color");
        menuItem.addActionListener( this);
        menuBar.add(menuItem);

        return menuBar;
    }


    public static void main(String[] args) {
/*
     Draw toolBar = new Draw();

        toolBar.setSize(50,400);
        toolBar.setVisible(true);


 */
        Draw draw = new Draw();
        draw.setSize(400,400);
        draw.setVisible(true);
        draw.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }



    @Override
    public void actionPerformed(ActionEvent e){
        System.out.println(e.getActionCommand());
        switch (e.getActionCommand()){
            case "Oval":
                figure = new Oval();
                break;
            case "Rectangle":
                figure = new Rect();
                break;
            case "Line":
                figure = new Line();
                break;
            case"Triangle":
                figure = new Triangle();
                break;
            case "Color":
                Color initialColor=Color.RED;
                chosenColor=JColorChooser.showDialog(this,"Select a color",initialColor);

                break;


        }

    }


    @Override
    public void paint(Graphics g) {

        //g.setColor(chosenColor);
        super.paint(g);

        for (int i= 0 ; i< figures.size(); i++){
            //g.setColor(colors.get(i));
            figures.get(i).draw(g);
        }

    }



    @Override
    public void mousePressed(MouseEvent e) {

        figure.x1 = e.getX();
        figure.y1= e.getY();

        figure.color = chosenColor;

    }

    @Override
    public void mouseReleased(MouseEvent e) {


        figures.add(figure);

        figure.x2 = e.getX();
        figure.y2 = e.getY();
       // figure.checkCoordinates();

        repaint();

        if (figure.getClass().toString().equals("class drawing.Rect"))
            figure = new Rect();
        else if (figure.getClass().toString().equals("class drawing.Oval"))
        figure = new Oval();
        else if (figure.getClass().toString().equals("class drawing.Triangle"))
            figure = new Triangle();
        else if (figure.getClass().toString().equals("class drawing.Line"))
            figure = new Line();

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
