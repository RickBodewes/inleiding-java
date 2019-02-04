package h05;

import java.applet.*;
import java.awt.*;

public class H5_2 extends Applet {
    int v;
    int j;
    int h;

    public void init(){
        //hier bepalen we het gewicht van de slachtoffers
        v=89;//kg
        j=69;//kg
        h=45;//kg
    }
    public void paint(Graphics g){
        //het diagram maken
        g.drawLine(20,50,20,450);
        g.drawLine(20,450,220,450);

        //maat lijnen
        g.drawLine(15, 50, 20, 50);
        g.drawLine(15, 90, 20, 90);
        g.drawLine(15, 130, 20, 130);
        g.drawLine(15, 170, 20, 170);
        g.drawLine(15, 210, 20, 210);
        g.drawLine(15, 250, 20, 250);
        g.drawLine(15, 290, 20, 290);
        g.drawLine(15, 330, 20, 330);
        g.drawLine(15, 370, 20, 370);
        g.drawLine(15, 410, 20, 410);

        //grijze lijnen
        g.setColor(Color.LIGHT_GRAY);
        g.drawLine(20,50,220,50);
        g.drawLine(20,90,220,90);
        g.drawLine(20,130,220,130);
        g.drawLine(20,170,220,170);
        g.drawLine(20,210,220,210);
        g.drawLine(20,250,220,250);
        g.drawLine(20,290,220,290);
        g.drawLine(20,330,220,330);
        g.drawLine(20,370,220,370);
        g.drawLine(20,410,220,410);

        //valerie
        g.setColor(Color.red);
        g.fillRect(40,450-v*2,40,v*2);
        g.drawString("Valerie", 40, 465);
        if(v>=150){
            g.setColor(Color.black);
            g.drawString("DIKZAK!!",40,475);
        }
        //Jeroen
        g.setColor(Color.green);
        g.fillRect(90,450-j*2,40,j*2);
        g.drawString("Jeroen", 90, 465);
        if(j>=150){
            g.setColor(Color.black);
            g.drawString("DIKZAK!!",90,475);
        }
        //hans
        g.setColor(Color.blue);
        g.fillRect(140,450-h*2,40,h*2);
        g.drawString("Hans", 140, 465);
        if(h>=150){
            g.setColor(Color.black);
            g.drawString("DIKZAK!!",140,475);
        }

    }
}
