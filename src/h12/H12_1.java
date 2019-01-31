package h12;

import java.awt.*;
import java.applet.*;

public class H12_1 extends Applet {

    int cijfers[];
    double r;
    int cijfer;
    double gem;

    public void init() {
        cijfers = new int[10];
        for (int i = 10; i != 0; i--) {
            r = Math.random();
            cijfer = (int) (r * 10 + 1);
            cijfers[i - 1] = cijfer;
            System.out.println(cijfer + " " + cijfers[i - 1]);
        }
        for (int i = 10; i != 0; i--) {
            gem = gem + cijfers[i - 1];
        }
        System.out.println(gem);
        gem = gem / 10;
    }

    public void paint(Graphics g) {
        for (int i = 10; i != 0; i--) {
            g.drawString("cijfer " + i + " is: " + cijfers[i - 1], 50, 60 + 15 * i);
        }
g.drawString("gemiddelde is: "+gem,50,225);
    }
}
