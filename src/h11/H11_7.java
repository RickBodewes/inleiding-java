package h11;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class H11_7 extends Applet {
    int b;

    public void init() {
        setSize(600,600);
        b = 50 + 50 * 5;
    }

    public void paint(Graphics g) {
        for (int a = 50; a != 0; a--) {
            g.drawOval(b - a * 5, b - a * 5, 10 * a, 10 * a);
            System.out.println(a);
        }
    }

}
