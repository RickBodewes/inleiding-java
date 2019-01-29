package h04;

import java.applet.*;
import java.awt.*;

public class H4praktijk extends Applet{
    public void init(){
    }
    public void paint(Graphics g){
        //lijn
        g.drawLine(20,20,120,20);
        g.drawString("Lijn",60,33);

        //rechthoek
        g.drawRect(20,40,100,50);
        g.drawString("rechthoek",40,103);

        //afgeronde recht hoek
        g.drawRoundRect(20,110,100,50,30,30);
        g.drawString(" afgeronde rechthoek",15,173);

        //gevulde rechthoek en ovaal
        g.setColor(Color.MAGENTA);
        g.fillRect(140,40,100,50);
        g.setColor(Color.black);
        g.drawOval(140,40,100,50);
        g.drawString("gevulde rechthoek",140,103);
        g.drawString("met ovaal",140,113);

        //gevulde ovaal
        g.setColor(Color.MAGENTA);
        g.fillOval(140,120,100,50);
        g.setColor(Color.black);
        g.drawString("gevulde ovaal",140,183);

        //taartpunt met ovaal er om heen
        g.setColor(Color.MAGENTA);
        g.fillArc(260,40,100,50,0,45);
        g.setColor(Color.black);
        g.drawOval(260,40,100,50);
        g.drawString("taartpunt",260,103);
        g.drawString("met ovaal",260,113);

        //cirkel
        g.drawOval(285,120,50,50);
        g.drawString("taartpunt",290,183);

    }
}
