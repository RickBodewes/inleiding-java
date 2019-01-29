package h06;

import java.applet.*;
import java.awt.*;

public class H6_1 extends Applet{
    double Geld;
    double Bedrag;
    public void init(){
        Geld = 113;
        Bedrag = Geld/4;
    }
    public void paint(Graphics g){
        g.drawString("Jan: "+Bedrag,10,10);
        g.drawString("Ali: "+Bedrag,10,20);
        g.drawString("Jeanette: "+Bedrag,10,30);
        g.drawString("Ik: "+Bedrag,10,40);

    }
}
