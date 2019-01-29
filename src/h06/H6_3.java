package h06;

import java.awt.*;
import java.applet.*;
//max waarde van een int 2147483647

public class H6_3 extends Applet{
    int a;
    int b;
    int c;
    public void init(){
        a = 1947475547;
        b = 1678494957;
        c = a+b;
    }
    public void paint(Graphics g){
        g.drawString("antwoord: "+c,10,10);
    }
}
