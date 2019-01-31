package h12;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class H12praktijk extends Applet {

    //arrays maken
    String namen[] = new String[10];
    int t_nummers[] = new int[10];

    //maakt alle ui dingetjes
    Label txt = new Label("vul een naam en een telefoon nummer in");
    TextField input_naam = new TextField("", 30);
    Label naam = new Label("naam:");
    Label teln = new Label("telefoon nummer: 06");
    TextField input_tel = new TextField("", 8);
    Button enter = new Button("enter");

    //extra variabelen
    int togo = 0;
    int togo_onscreen = 10;

    public void init() {

        setSize(850, 400);
//zorgt dat de functie van de knop word uitgevoerd als i word ingedrukt
        enter.addActionListener(new calc());
// roept alle ui dingen aan
        add(txt);
        add(naam);
        add(input_naam);
        add(teln);
        add(input_tel);
        add(enter);
    }


    public void paint(Graphics g) {
        //kijkt of er al 10 namen en nummers zijn ingevoerd
        if (togo == 10) {
            for (int i = 0; i < 10; i++) {
                String nummer = String.valueOf(i + 1) + " ";
                g.drawString(nummer + "naam: " + namen[i] + "   telefoon nummer: " + t_nummers[i], 100, 70 + (i + 1) * 15);
                System.out.println(i);
            }
        } else {
            g.drawString("nog " + togo_onscreen + " nummers en namen te gaan", 100, 70);
        }
    }


    class calc implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            namen[togo] = input_naam.getText();
            t_nummers[togo] = Integer.parseInt(input_tel.getText());
            togo++;
            togo_onscreen--;
            repaint();
            //maakt de vakken leeg
            input_naam.setText("");
            input_tel.setText("");
        }
    }
}
