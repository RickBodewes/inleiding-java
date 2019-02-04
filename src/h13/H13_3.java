package h13;

import java.awt.event.*;
import java.awt.*;
import java.applet.*;

public class H13_3 extends Applet {
    Button baksteen;
    Button beton;
    Button clear;
    int wall = 0;

    public void init() {
        setSize(1200, 700);
        baksteen = new Button("bakstenen muur");
        beton = new Button("betonblokken muur");
        clear = new Button("maak scherm leeg");

        baksteen.addActionListener(new baksteen());
        beton.addActionListener(new beton());
        clear.addActionListener(new clears());

        add(clear);
        add(baksteen);
        add(beton);
    }

    public void paint(Graphics g) {

        switch (wall) {
            case 0:
                break;
            case 1:
                drawWall(g, 20, 20, 1160, 660);
                break;
            case 2:
                betonMuur(g, 20, 20, 1160, 660);
                break;
            default:
                break;

        }


        //drawWall(g, 20, 20, 1100, 600);
        //betonMuur(g,20,20,1160,660);
    }

    void drawWall(Graphics g, int x, int y, int ww, int hw) {//ww = width wall, hw = height wall
        //het cement (grijze achtergrond
        g.setColor(new Color(100, 100, 100));
        g.fillRect(x, y, ww, hw);
        //de stenen
        g.setColor(new Color(150, 50, 50));
        //hoeveel rijen aan stenen
        for (int a = 0; a <= ((hw - 3) / 18) - 1; a++) {
            //hoeveel stenen per rij, de if else is voor her effect dat ze niet allemaal op dezelfde plek staan(qua x as)
            if (a % 2 == 0) {
                for (int i = 0; i <= ((ww - 3) / 33) - 1; i++) {
                    g.fillRect((x + 3) + 33 * i, (y + 3) + 18 * a, 30, 15);
                }
            } else {
                for (int b = 0; b <= ((ww - 3) / 33) - 2; b++) {
                    g.fillRect((x + 21) + 33 * b, (y + 3) + 18 * a, 30, 15);
                    g.fillRect((x + 3), (y + 3) + 18 * a, 15, 15);//begin steentjes
                    g.fillRect(x + (((ww - 3) / 33) * 33 - 12), (y + 3) + 18 * a, 15, 15);//eind steentjes
                }
            }
        }
    }


    void betonMuur(Graphics g, int x, int y, int ww, int wh) {//ww wallwidth wh wall height
        //cement
        g.setColor(new Color(50, 50, 50));
        g.fillRect(x, y, ww, wh);
        //stenen
        g.setColor(new Color(130, 125, 120));
        //rijen aan stenen (stenen van 90 bij 45 pixel)
        for (int i = 0; i <= ((wh - 5) / 50) - 1; i++) {
            if (i % 2 == 0) {
                for (int a = 0; a <= ((ww - 5) / 95) - 1; a++) {
                    g.fillRect((x + 5) + 95 * a, (y + 5) + 50 * i, 90, 45);
                }
            } else {
                for (int b = 0; b <= ((ww - 5) / 95) - 2; b++) {
                    g.fillRect((x + 55) + 95 * b, (y + 5) + 50 * i, 90, 45);
                    g.fillRect((x + 5), (y + 5) + 50 * i, 45, 45);//begin steentjes
                    g.fillRect(x + (((ww - 5) / 95) * 95 - 40), (y + 5) + 50 * i, 45, 45);//eind steentjes
                }
            }
        }
    }

    //bakstenen muur word op geroepen
    class baksteen implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            wall = 1;
            repaint();
        }
    }

    //betonblokken muur
    class beton implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            wall = 2;
            repaint();
        }
    }

    // scherm word leeg gemaakt
    class clears implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            wall = 0;
            repaint();
        }
    }


}
