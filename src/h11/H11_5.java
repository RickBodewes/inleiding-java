package h11;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class H11_5 extends Applet {
    public void init(){
    }
    public void paint(Graphics g){
        for(int i=5; i!=0; i--){
            //de hoogte een de breedte blijven hetzelfde de plek word door i bepaald
            g.drawRect(20+i*30,20+i*30,30,30);
            System.out.println(i);
        }
    }

}
