package h11;

import java.applet.*;
import java.awt.*;

public class H11_8 extends Applet{
    public void init(){
        setSize(540,540);
    }
    public void paint(Graphics g){
        for(int i=100; i!=0; i--){
            g.drawOval( 20,20,5*i,5*i);//de plek van beginnen blijft gelijk ik hoef alleen maar de grote steeds aan te passen
        }
    }

}
