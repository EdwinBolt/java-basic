package drawing;

import java.awt.*;

public class Line extends Figure {
    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.drawLine(x1, x2, x2, y2);
    }
}
