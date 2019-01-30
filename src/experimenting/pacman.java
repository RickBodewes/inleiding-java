package experimenting;

import java.applet.*;
import java.awt.*;

public class pacman extends Applet{
    public void init(){
        setSize(500,500);
        setBackground(new Color(0,0,75));
    }
    public void paint(Graphics g){
        //zwarte balken
        g.setColor(Color.black);
        g.fillRect(0,0,500,175);
        g.fillRect(0,325,500,175);
        //pacman zelf
        g.setColor(Color.yellow);
        g.fillArc(50,200,100,100,30,300);
        //bolletjes
        g.setColor(new Color(250,220,150));
        for(int i=0; i<=4; i++){
            g.fillOval(175+i*75,240,20,20);
        }
        //spookje oranje lichaam
        g.setColor(new Color(235,137,0));
        g.fillArc(50,10,90,90,0,180);
        g.fillRect(50,55,90,50);
        g.fillArc(50,90,30,30,180,180);
        g.fillArc(80,90,30,30,180,180);
        g.fillArc(110,90,30,30,180,180);
        //spookje oranje ogen
        g.setColor(Color.white);
        g.fillOval(70,40,15,15);
        g.fillOval(110,40,15,15);
        g.setColor(Color.black);
        g.fillOval(78,44,8,8);
        g.fillOval(118,44,8,8);


        //spookje blauw lichaam
        g.setColor(Color.blue);
        g.fillArc(360,10,90,90,0,180);
        g.fillRect(360,55,90,50);
        g.fillArc(360,90,30,30,180,180);
        g.fillArc(390,90,30,30,180,180);
        g.fillArc(420,90,30,30,180,180);
        //spookje blauw ogen
        g.setColor(Color.white);
        g.fillOval(380,40,15,15);
        g.fillOval(420,40,15,15);
        g.setColor(Color.black);
        g.fillOval(388,44,8,8);
        g.fillOval(428,44,8,8);


        //spookje roze lichaam
        g.setColor(Color.pink);
        g.fillArc(50,375,90,90,0,180);
        g.fillRect(50,420,90,50);
        g.fillArc(50,455,30,30,180,180);
        g.fillArc(80,455,30,30,180,180);
        g.fillArc(110,455,30,30,180,180);
        //spookje roze ogen
        g.setColor(Color.white);
        g.fillOval(70,405,15,15);
        g.fillOval(110,405,15,15);
        g.setColor(Color.black);
        g.fillOval(78,409,8,8);
        g.fillOval(118,409,8,8);


        //spookje rood lichaam
        g.setColor(Color.red);
        g.fillArc(360,375,90,90,0,180);
        g.fillRect(360,420,90,50);
        g.fillArc(360,455,30,30,180,180);
        g.fillArc(390,455,30,30,180,180);
        g.fillArc(420,455,30,30,180,180);
        //spookje rood ogen
        g.setColor(Color.white);
        g.fillOval(380,405,15,15);
        g.fillOval(420,405,15,15);
        g.setColor(Color.black);
        g.fillOval(388,409,8,8);
        g.fillOval(428,409,8,8);

    }
}
