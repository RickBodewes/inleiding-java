package experimenting;

import java.applet.*;
import java.awt.*;

public class radiant extends Applet{
    public void init(){

    }
    public void paint(Graphics g){
        for(int i=0; i<=255; i++){
            g.setColor(new Color(0,0,0));
            g.drawLine(0,i,400,0);
        }
    }
}
