package h06;

import java.applet.*;
import java.awt.*;

public class H6_2 extends Applet{
    int sec;
    public void init(){
        sec = 1;
        sec = sec*60*60;
    }
    public void paint(Graphics g){
        g.drawString("seconden in een uur: " + sec, 10,10);
        sec = sec*24;
        g.drawString("seconden in een dag: " + sec, 10,20);
        sec = sec*365;
        g.drawString("seconden in een jaar: " + sec, 10,30);
    }
}
