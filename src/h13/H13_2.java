package h13;

import java.applet.*;
import java.awt.*;

public class H13_2 extends Applet {


    public void init() {
        setSize(1200, 700);
    }

    public void paint(Graphics g) {
        drawWall(g, 20, 20, 1100, 600);
    }

    void drawWall(Graphics g, int x, int y, int ww, int hw) {//ww = width wall, hw = height wall
        //het cement (grijze achtergrond
        g.setColor(new Color(100, 100, 100));
        g.fillRect(x, y, ww, hw);
        //de stenen
        g.setColor(new Color(150, 50, 50));
        //hoeveel rijen aan stenen
        for (int a = 0; a <= ((hw - 3) / 18) - 1; a++) {
            //hoeveel stenen per rij, de if else is voor her effect dat ze niet allemaal op dezelfde plek staan(qua x as)
            if (a % 2 == 0) {
                for (int i = 0; i <= ((ww - 3) / 33) - 1; i++) {
                    g.fillRect((x + 3) + 33 * i, (y + 3) + 18 * a, 30, 15);
                }
            } else {
                for (int b = 0; b <= ((ww - 3) / 33) - 2; b++) {
                    g.fillRect((x + 21) + 33 * b, (y + 3) + 18 * a, 30, 15);
                    g.fillRect((x + 3), (y + 3) + 18 * a, 15, 15);//begin steentjes
                    g.fillRect(x + (((ww - 3) / 33) * 33 - 12), (y + 3) + 18 * a, 15, 15);//eind steentjes
                }
            }
        }
    }
}



