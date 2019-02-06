package h14;

import java.net.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class H14praktijkRework extends Applet {

    Image appel;
    URL path;

    Button speel;
    Button reset;
    TextField input;

    int appels = 23;//aantal appels dat over zijn, aan het begin is dat 23
    boolean userturn = true;//geeft aan of de speler aan de beurt is of niet, om te zien wie wint.
    boolean game_over = false;// wanneer het spel voor bij is word deze op true gezet
    boolean user_lost = false;//aan het eind geeft dit aan of de gebruik gewonnen of verloren heeft

    String stext = "";
    String stext_1 = "voer een 1, 2 of 3 in en klik op speel.";


    public void init() {
        setSize(400, 500);

        //zet de beginwaarde van de text op het scherm
        stext = stext_1;

        //zet de variabelen voor de afbeelding
        path = H14praktijk.class.getResource("/h14/resources/");
        appel = getImage(path, "apple.png");

        //zet de knoppen en textfield
        speel = new Button("speel");
        reset = new Button("reset");
        input = new TextField("", 10);
        speel.addActionListener(new play());
        reset.addActionListener(new reset());
        add(input);
        add(speel);
        add(reset);


    }

    public void paint(Graphics g) {

        g.drawString(stext, 70, 50);
        //zet de appels op het scherm
        for (int i = 0; i < appels; i++) {
            g.drawImage(appel, 100 + 50 * (i % 4), 100 + 50 * (i / 4), 50, 50, this);
        }


    }

    /*
    het berekenen van het aantal dat de bot weghaalt word apart in een methode gedaan zodat dit altijd aangepast kan worden
    en er zeker van te zijn dat je de rest van de code itact laat
    */
    int botPlays(int apples) {
        int botplays = 0;
        double random = Math.random() * 3 + 1;
        int r = (int) random;
        if ((appels - 1) % 4 == 0) {
            botplays = r;
        } else {
                botplays = (appels - 1) % 4;
        }
        System.out.println(" bot " + botplays);
        if(botplays < 0){
            botplays =0;
        }
        return botplays;
    }


    class play implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int userplay = 0;
            int bot = 0;
            if (Integer.parseInt(input.getText()) == 1 || Integer.parseInt(input.getText()) == 2 || Integer.parseInt(input.getText()) == 3) {
                userplay = Integer.parseInt(input.getText());
                userturn = true;
                appels -= userplay;
                System.out.println(appels);
                repaint();
                if (appels <= 0 && game_over == false) {
                    if (userturn == true) {
                        user_lost = true;
                        game_over = true;
                    }
                }
                bot = botPlays(appels);
                userturn = false;
                appels -= bot;
                repaint();
                System.out.println(appels);
                if (appels <= 0 && game_over == false) {
                    if (userturn == false) {
                        user_lost = false;
                        game_over = true;
                    }
                }
                //deze if statements kijken wie er verloren heeft als de teller op 0 komt
                stext = "de bot koos " + bot + " appels om weg te halen.";
            } else {
                stext = "error: voer een geldig getal in!";
                repaint();
            }
            System.out.println(appels);
            if (game_over == true) {
                if (user_lost == true) {
                    stext = "je hebt verloren!";
                } else {
                    stext = "je hebt gewonnen!";
                }
            }
            input.setText("");
            repaint();
            System.out.println(appels);
            System.out.println("---");
        }
    }

    class reset implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            input.setText("");
            stext = stext_1;
            appels = 23;
            user_lost = false;
            game_over = false;
            userturn = true;
            repaint();
        }
    }
}
