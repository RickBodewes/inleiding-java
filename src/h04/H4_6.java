package h04;

import java.awt.*;
import java.applet.*;

public class H4_6 extends Applet{
    public void init(){

    }
    public void paint(Graphics g){
        //basis
        g.fillRoundRect(25,25,80,180,30,30);
        //lampen
        g.setColor(Color.red);
        g.fillOval(45,45,40,40);
        g.setColor(Color.yellow);
        g.fillOval(45,95,40,40);
        g.setColor(Color.green);
        g.fillOval(45,145,40,40);
        //de paal
        g.setColor(Color.darkGray);
        g.fillRect(60,205, 10, 200);
    }
}
