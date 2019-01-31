package h12;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class H12_5 extends Applet {

    //maakt de array
    int getallen[] = {12, 23, 67, 95, 106, 130, 158, 175, 199, 215, 236, 265, 287, 308, 332, 357, 376, 391, 400};//19 lang

    //maakt alle ui dingetjes
    Label txt = new Label("vul een getal in dat tussen de 1 en de 400 zit (zonder decimalen)");
    TextField input = new TextField("", 30);
    Button enter = new Button("enter");

    //deze zijn ter controle
    int nummer;
    boolean gwn = false;

    public void init() {

        enter.addActionListener(new calc());

        add(txt);
        add(input);
        add(enter);
    }

    public void paint(Graphics g) {
        if (gwn == true) {
            g.drawString("het getal stond in de array", 50, 70);
        } else {
            g.drawString("het getal stond niet in de array", 50, 70);
        }
    }


    class calc implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            gwn = false;
            nummer = Integer.parseInt(input.getText());
            //test of het getal in de array staat
            for (int i = 0; i < getallen.length; i++) {
                if (nummer == getallen[i]) {
                    gwn = true;
                    break;
                }
            }
            repaint();
        }
    }
}


