package h05;

import java.awt.*;
import java.applet.*;

public class H5_1 extends Applet{
    Color line;
    Color fill;
    int w;
    int h;

    public void init(){
        line = Color.pink;
        fill = Color.black;
        w = 100;
        h = 200;
    }
    public void paint(Graphics g){
        g.setColor(line);
        //lijn
        g.drawLine(20,20,20+w,20);
        g.drawString("Lijn",20,33);

        //rechthoek
        g.drawRect(20,40,w,h);
        g.drawString("rechthoek",40,53+h);

        //afgeronde recht hoek
        g.drawRoundRect(20,h+60,w,h,30,30);
        g.drawString(" afgeronde rechthoek",15,h*2+73);

        //gevulde rechthoek en ovaal
        g.setColor(fill);
        g.fillRect(w+40,40,w,h);
        g.setColor(line);
        g.drawOval(w+40,40,w,h);
        g.drawString("gevulde rechthoek",w+40,h+53);
        g.drawString("met ovaal",w+40,h+63);

        //gevulde ovaal
        g.setColor(fill);
        g.fillOval(w+40,h+70,w,h);
        g.setColor(line);
        g.drawString("gevulde ovaal",w+40,h*2+83);

        //taartpunt met ovaal er om heen
        g.setColor(fill);
        g.fillArc(w*2+60,40,w,h,0,45);
        g.setColor(line);
        g.drawOval(w*2+60,40,w,h);
        g.drawString("taartpunt",w*2+60,h+53);
        g.drawString("met ovaal",w*2+60,h+63);

        //cirkel
        g.drawOval(w*2+85,h+70,w/2,h);
        g.drawString("cirkel",w*2+90,h*2+83);

    }
}

