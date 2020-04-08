package drawing;

import java.awt.*;

public class Triangle extends Figure{
    @Override
    public void draw (Graphics g){
        g.drawLine(x1, y1, x2, y1);
        g.drawLine(x1, y1, (x1+x2)/2, y2);
        g.drawLine((x1+x2)/2, y2, x2, y1);
    }

}
