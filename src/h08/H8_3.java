package h08;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class H8_3 extends Applet{
    //var, knop en tekstvak maken
    double bedrag;
    TextField txtvak;
    Button knopje;
    Label label;

    public void init() {
        //waarde aan var geven
        bedrag = 0;

        //label, knop en tekstvak
        label = new Label("€");
        knopje = new Button("geef prijs");
        txtvak = new TextField("", 20);

        //class oproepen als knopje word ingedrukt
        knopje.addActionListener(new btw());

        //label, textvak en knop in beel zetten
        add(label);
        add(txtvak);
        add(knopje);
    }
    public void paint(Graphics g){
        g.drawString("bedrag met 21% btw: " + bedrag, 50,60);
    }

    class btw implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String x = txtvak.getText();
            bedrag = Double.parseDouble(x);
            bedrag = bedrag * 1.21;
            repaint();

        }
    }
}
