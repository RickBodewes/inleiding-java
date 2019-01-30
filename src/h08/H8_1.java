package h08;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class H8_1 extends Applet {
    Button ok;
    Button reset;
    TextField txtvak;
    String stxt;

    public void init() {
        ok = new Button("oke");
        reset = new Button("reset");
        txtvak = new TextField("", 20);
        stxt = "";

        ok.addActionListener(new okListener());
        reset.addActionListener(new resetListener());

        add(txtvak);
        add(ok);
        add(reset);
    }

    public void paint(Graphics g) {
        g.drawString(stxt, 10, 50);
    }

    class okListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            stxt = txtvak.getText();
            repaint();
        }
    }

    class resetListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            txtvak.setText("");
        }
    }

}
