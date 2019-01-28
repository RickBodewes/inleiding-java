package h02;

import java.awt.*;
import java.applet.*;

public class H2uitleg extends Applet {
    //initialiseert de applet
    public void init(){
        setBackground(Color.magenta);
    }
    //tekent de text
    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("Welcome to Java!!", 50, 60 );
    }
}
