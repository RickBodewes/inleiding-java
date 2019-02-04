package h10;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class H10_3en4 extends Applet {
    TextField month;
    TextField year;
    Button ok;
    String maand;
    String dagen;
    int jaar;

    public void init() {
        maand = "";
        dagen = "";
        month = new TextField("maand", 20);
        year = new TextField("jaar", 20);

        ok = new Button("ok");
        ok.addActionListener(new calc());
        add(month);
        add(year);
        add(ok);
    }

    public void paint(Graphics g) {
        g.drawString("de maand is: " + maand, 50, 50);
        g.drawString("aantal dagen van de maand is: " + dagen, 50, 60);
    }

    class calc implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            jaar = Integer.parseInt(year.getText());
            String m = month.getText();
            switch (m) {
                case "1":
                    maand = "januari";
                    dagen = "31";
                    break;
                case "2":
                    maand = "februari";
                    if (jaar % 4 == 0) {
                        dagen = "29";
                    } else {
                        dagen = "28";
                    }
                    break;
                case "3":
                    maand = "maart";
                    dagen = "31";
                    break;
                case "4":
                    maand = "april";
                    dagen = "30";
                    break;
                case "5":
                    maand = "mei";
                    dagen = "31";
                    break;
                case "6":
                    maand = "juni";
                    dagen = "30";
                    break;
                case "7":
                    maand = "juli";
                    dagen = "31";
                    break;
                case "8":
                    maand = "augustus";
                    dagen = "31";
                    break;
                case "9":
                    maand = "september";
                    dagen = "30";
                    break;
                case "10":
                    maand = "oktober";
                    dagen = "31";
                    break;
                case "11":
                    maand = "november";
                    dagen = "30";
                    break;
                case "12":
                    maand = "december";
                    dagen = "31";
                    break;
                default:
                    maand = "error verkeerd nummer";
                    break;
            }
            repaint();
        }
    }
}
