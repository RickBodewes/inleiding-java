package h11;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class H11_6 extends Applet {
    int a;
    int b;
    public void init(){
        a = 5;
        b = 50+5*10;
    }
    public void paint(Graphics g){
        for(a=5; a!=0; a--){
            g.drawOval(b-a*10,b-a*10,20*a,20*a);
            System.out.println(a);
        }
    }

}
