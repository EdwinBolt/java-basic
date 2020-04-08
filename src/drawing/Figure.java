package drawing;

import java.awt.*;

public abstract class Figure {
    int x1;
    int x2;
    int y1;
    int y2;

    public Color color;


    public void checkCoordinates(){
        if (x1 > x2){
            int temp = x1;
            x1 = x2;
            x2 = temp;
        }
        if (y1 > y2){
            int temp = y1;
            y1 = y2;
            y2 = temp;
        }
    }




    public abstract void draw (Graphics g);
}
