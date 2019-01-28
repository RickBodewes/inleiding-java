package h02;

//import van packages
import java.awt.*;
import java.applet.*;

public class H2_1 extends Applet {

    //applet maken
    public void init(){
        setBackground(Color.blue);
    }

    //de naam schrijven
    public void paint(Graphics g){
        g.setColor(Color.yellow);
        g.drawString("Rick", 200, 200);
    }
}
