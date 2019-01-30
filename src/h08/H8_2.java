package h08;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class H8_2 extends Applet {
    //variabelen maken
    int m;
    int v;
    int potm;
    int potv;

    //knoppen maken
    Button bm;
    Button bv;
    Button bpotm;
    Button bpotv;

    public void init() {
        //applet stylen
        setBackground(Color.red);
        setSize(800, 200);
        //waardes geven
        m = 0;
        v = 0;
        potm = 0;
        potv = 0;
        //knoppen maken
        bm = new Button("mannelijke studenten");
        bv = new Button("vrouwelijke studenten");
        bpotm = new Button("potentiele mannelijke studenten");
        bpotv = new Button("potentiele vrouwelijke studenten");
        //knoppen functie geven
        bm.addActionListener(new bmL());
        bv.addActionListener(new bvL());
        bpotm.addActionListener(new bpotmL());
        bpotv.addActionListener(new bpotvL());
        //knoppen zichtbaar maken
        add(bm);
        add(bv);
        add(bpotm);
        add(bpotv);

    }

    public void paint(Graphics g) {
        //variabelen zichtbaar maken.
        g.drawString("mannelijke studenten: " + m,50,50);
        g.drawString("vrouwelijke studenten: " + v,50,60);
        g.drawString("potentiele mannelijke studenten: " + potm,50,70);
        g.drawString("potentiele vrouwelijke studenten: " + potv,50,80);

    }

    //knoppen functie geven
    class bmL implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            m ++;
            repaint();
        }
    }

    class bvL implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            v ++;
            repaint();
        }
    }

    class bpotmL implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            potm ++;
            repaint();
        }
    }

    class bpotvL implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            potv ++;
            repaint();
        }
    }


}
