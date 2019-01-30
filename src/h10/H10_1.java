package h10;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class H10_1 extends Applet{
    TextField txtvak;
    Button ok;
    int num;

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

    }

    class calc implements ActionListener{
        public void actionPerformed(ActionEvent e){
            int test = Integer.parseInt(txtvak.getText());
            if(test > num){
                num=test;
                repaint();
            }

        }
    }
}
