package h06;

import java.awt.*;
import java.applet.*;

public class H6praktijk extends Applet{
    double c1, c2, c3, gem;
    int gem_;
    public void init(){
        c1 = 5.9;
        c2 = 6.3;
        c3 = 6.9;
        gem = (c1+c2+c3)/3;
        gem_=0;
    }
     public void paint(Graphics g){
        g.drawString("gemiddeld met alle decimalen: "+gem ,10 ,10);
        gem = gem*10;
        gem_ = (int)gem;
        gem = gem_;
        gem = gem/10;
         g.drawString("gemiddeld met 1 decimaal: "+gem ,10 ,20);
    }
}
