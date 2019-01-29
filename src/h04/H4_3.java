package h04;

import java.awt.*;
import java.applet.*;

public class H4_3 extends Applet{
    public void init(){

    }

    public void paint(Graphics g){
        //vlaggenstok
        g.setColor(new Color(147, 74, 10));
        g.fillRect(20,25,7,165);
        //vlag zelf
        g.setColor(Color.red);
        g.fillRect(20,30,80,20);
        g.setColor(Color.white);
        g.fillRect(20,50,80,20);
        g.setColor(Color.blue);
        g.fillRect(20,70,80,20);
    }
}
