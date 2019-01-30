package h10;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class H10_5 extends Applet {
    int AantalCijfers;
    double gem;
    boolean voldoende;

    TextField input;
    Button ok;


    public void init() {
        AantalCijfers = 0;
        gem = 0.0;

        input = new TextField("", 20);
        ok = new Button("ok");

        ok.addActionListener(new calc());

        add(input);
        add(ok);
    }

    public void paint(Graphics g) {
        g.drawString("je gemiddelde: " + gem, 50, 50);
        g.drawString("is het cijfer voldoende? " + voldoende, 50, 60);
        g.drawString("aantal cijfers: " + AantalCijfers, 50, 70);

    }

    class calc implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //kijkt of het cijfer voldoende is
            System.out.println("het werkt");
            Double cijfer = Double.parseDouble(input.getText());
            if (cijfer >= 5.5) {
                voldoende = true;
            } else {
                voldoende = false;
            }
            //berekent het gemmidelde en zorgt voor 1 decimaal achter de komma
            gem = ((gem * AantalCijfers) + cijfer) / (AantalCijfers + 1);
            System.out.println(gem);
            gem = gem * 10;
            int gem_ = (int) gem;
            gem = gem_;
            gem = gem / 10;
            AantalCijfers++;
            repaint();
        }
    }


}
