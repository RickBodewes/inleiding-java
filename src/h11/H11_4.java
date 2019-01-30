package h11;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class H11_4 extends Applet {
    int a;
    int res;

    public void init() {
        a = 3; //de tafel van drie
        res = 0;
    }

    public void paint(Graphics g) {
        for (int i = 1; i <= 10; i++) {
            res = a * i;
            g.drawString("" + res, 50, i * 10 + 10);// telkens word drie keer een vorm van de i variabele gezet
        }
    }

}
