package h04;

import java.awt.*;
import java.applet.*;

public class H4_5 extends Applet{
    public void init(){
        setBackground(Color.blue);
    }
    public void paint(Graphics g){
        g.setColor(Color.yellow);
        g.fillArc(30,50,200,100,0,360);
    }
}
