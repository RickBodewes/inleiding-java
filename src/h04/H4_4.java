package h04;

import java.awt.*;
import java.applet.*;

public class H4_4 extends Applet{
    public void init(){

    }
    public void paint(Graphics g){
        //het diagram maken
        g.drawLine(20,50,20,290);
        g.drawLine(20,290,220,290);
        g.drawLine(15, 50, 20, 50);
        g.drawLine(15, 90, 20, 90);
        g.drawLine(15, 130, 20, 130);
        g.drawLine(15, 170, 20, 170);
        g.drawLine(15, 210, 20, 210);
        g.drawLine(15, 250, 20, 250);//grijze lijnen
        g.setColor(Color.LIGHT_GRAY);

        g.drawLine(20,50,220,50);
        g.drawLine(20,90,220,90);
        g.drawLine(20,130,220,130);
        g.drawLine(20,170,220,170);
        g.drawLine(20,210,220,210);
        g.drawLine(20,250,220,250);
        //valerie
        g.setColor(Color.red);
        g.fillRect(40,210,40,80);
        g.drawString("Valerie", 40, 305);
        //jeroen
        g.setColor(Color.green);
        g.fillRect(90,90,40,200);
        g.drawString("Jeroen", 90, 305);
        //hans
        g.setColor(Color.blue);
        g.fillRect(140,130,40,160);
        g.drawString("Hans", 140, 305);

    }
}
