package h04;

import java.awt.*;
import java.applet.*;

public class H4_7 extends Applet{
    public void init(){

    }
    public void paint(Graphics g){
        //dobbelsteen
        g.drawRoundRect(20,20,200,200,35,35);
        //punten
        g.fillOval(50,50,40,40);
        g.fillOval(150,50,40,40);
        g.fillOval(50,150,40,40);
        g.fillOval(150,150,40,40);

    }
}
