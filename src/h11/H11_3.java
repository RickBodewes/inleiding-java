package h11;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class H11_3 extends Applet {
    int a;
    long f1;
    long f2;
    long fr;

    public void init() {
        setSize(400,1080);
        a = 1;
        f1 = 0;
        f2 = 1;
        fr = f1;
    }

    public void paint(Graphics g) {
        while (a <= 222) {
            System.out.println(a);
            g.drawString("" + fr, 50, a * 10);
            //reken werk
            fr = f1 + f2;
            f1 = f2;
            f2 = fr;
            //de a variabele word met 1 verhoogd zpdat de loop niet oneindig doorgaat
            a++;
        }
    }

}
