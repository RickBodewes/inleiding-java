package h11;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class H11praktijk extends Applet {
    int a;
    int res;

    Button ok;
    TextField input;

    public void init() {
        setSize(200, 150);

        a = 0;
        res = 0;

        ok = new Button("ok");
        input = new TextField("", 20);

        ok.addActionListener(new calc());

        add(input);
        add(ok);
    }

    public void paint(Graphics g) {
        for (int i = 1; i <= 10; i++) {
            res = a * i;
            g.drawString("" + res, 50, i * 10 + 30);
        }
    }

    // hier word de waarde van het tekstvak gepakt en word die in a gezet, dan repainr.
    class calc implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            a = Integer.parseInt(input.getText());
            repaint();
        }
    }


}
