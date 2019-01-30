package h10;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class H10praktijk extends Applet {
    TextField input;
    Button ok;

    int cijfer;
    int color;

    String oordeel = "";

    public void init() {
        cijfer = 0;
        color = 0;

        input = new TextField("", 20);
        ok = new Button("ok");

        ok.addActionListener(new calc());

        add(input);
        add(ok);
    }

    public void paint(Graphics g) {
        //achtergrond kleur
        switch (color) {
            case 0:
                g.setColor(new Color(255, 0, 0));
                break;
            case 1:
                g.setColor(new Color(255, 150, 0));
                break;
            case 2:
                g.setColor(new Color(255, 255, 0));
                break;
            case 3:
                g.setColor(new Color(150, 255, 0));
                break;
            case 4:
                g.setColor(new Color(0, 255, 0));
                break;
            default:
                g.setColor(new Color(255, 0, 0));
                break;
        }
        g.fillRect(0,0,400,300);
        g.setColor(Color.black);
        g.drawString("jouw cijfer is: " + oordeel, 50, 50);
    }


    class calc implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //zet het cijfer in een int
            cijfer = Integer.parseInt(input.getText());
            //kijkt welke beoordeling bij het cijfer hoort
            switch (cijfer) {
                case 1:
                case 2:
                case 3:
                    oordeel = "slecht";
                    color = 0;
                    break;
                case 4:
                    oordeel = "onvoldoende";
                    color = 1;
                    break;
                case 5:
                    oordeel = "matig";
                    color = 2;
                    break;
                case 6:
                case 7:
                    oordeel = "voldoende";
                    color = 3;
                    break;
                case 8:
                case 9:
                case 10:
                    oordeel = "goed";
                    color = 4;
                    break;
                default:
                    oordeel = "error";
                    color = 0;
                    break;
            }
            repaint();
        }
    }


}
