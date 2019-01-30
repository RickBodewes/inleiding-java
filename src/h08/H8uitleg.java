package h08;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class H8uitleg extends Applet {
    Button knop;
    TextField txtvak;
    String stext;

    public void init() {

        knop = new Button("CLICK ME!");
        txtvak = new TextField("write something here i guess", 40);
        H8uitlegListener kl = new H8uitlegListener();
        knop.addActionListener(kl);
        add(txtvak);
        add(knop);
        stext = "aint this button gotta do something?";
    }

    public void paint(Graphics g) {
        g.drawString(stext, 50, 60);
    }

    class H8uitlegListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            stext = txtvak.getText();
            repaint();
        }
    }
}
