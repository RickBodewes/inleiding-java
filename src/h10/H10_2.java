package h10;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class H10_2 extends Applet{
    TextField txtvak;
    Button ok;
    int num;
    int nummin;

    public void init(){
        num = 0;

        txtvak = new TextField("",20);
        ok = new Button("ok");

        ok.addActionListener(new calc());

        add(txtvak);
        add(ok);

    }
    public void paint(Graphics g){
        g.drawString("hoogste nummer tot nu toe: " + num,50,60);
        g.drawString("laagste nummer tot nu toe: " + nummin,50,70);

    }

    class calc implements ActionListener{
        public void actionPerformed(ActionEvent e){
            int test = Integer.parseInt(txtvak.getText());
            if(test > num){
                num=test;
                repaint();
            }
            if(test<nummin){
                nummin=test;
                repaint();
            }
            if(nummin==0){
                nummin=test;
            }

        }
    }
}
