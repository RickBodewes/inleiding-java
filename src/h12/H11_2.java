package h12;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class H11_2 extends Applet {
    Button knopjes[] = new Button[25];

    public void init() {
        for (int i = 0; i != 25; i++) {
            knopjes[i] = new Button("knop " + String.valueOf(i + 1));
            add(knopjes[i]);
        }

    }

    public void paint(Graphics g) {

    }
}
