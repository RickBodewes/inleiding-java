package h04;

import java.awt.*;
import java.applet.*;

public class H4_2 extends Applet{
    public void init(){

    }

    public void paint(Graphics g){
        //gebouw
        g.drawRect(50,150,300,200);
        g.drawLine(50,150, 200,50);
        g.drawLine(350, 150, 200,50);
        //raampje
        g.drawOval(165,65,70,70);
        g.drawLine(200,65,200,135);
        g.drawLine(165,100, 235,100);
        //deur
        g.drawArc(170, 240,60,60,0 ,180);
        g.drawLine(170, 270, 170 ,350);
        g.drawLine(230,270, 230, 350);
    }
}
