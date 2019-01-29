package h04;

import java.applet.*;
import java.awt.*;

public class h4uitleg extends Applet{
    //de applet maken
    public void init(){

    }
    //tekenen!!
    public void paint(Graphics g){
        g.setColor(Color.red);
        g.fillRect(20,20,100,100);
        g.setColor(Color.black);
        g.drawRect(120,20, 90, 69);
        g.setColor(Color.yellow);
        g.drawRoundRect(6, 12, 45, 68,16,14);
        g.setColor(Color.MAGENTA);
        g.fillRoundRect(20,118,567,453,50,50);
        g.setColor(Color.green);
        g.drawLine(10,10,666,666);
        g.drawString("THIS IS RICK", 100,250);
        g.setColor(Color.red);
        g.fillOval(300,400,100,100);
        g.fillArc(300,500, 100,100,180,300);
    }

}
