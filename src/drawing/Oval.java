package drawing;

import java.awt.*;

public class Oval extends Figure{
    @Override
    public void draw (Graphics g){
        checkCoordinates();
        /*
        if (x1 > x2){
            int temp = x1;
            x1 = x2;
            x2 = temp;
        }
        if (y1 > y2){
            int temp = y1;
            y1 = y2;
            y2 = temp;
        }*/
        g.setColor(color);
        g.drawOval(x1, y1, x2-x1, y2-y1);

    }

}
