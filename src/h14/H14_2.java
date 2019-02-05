package h14;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.net.*;
import java.util.Random;



public class H14_2 extends Applet {

    String kleur[] = {"harten", "schoppen", "klaver", "ruiten"};//4 lang
    String symbool[] = {"aas", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "tien", "boer", "vrouw", "heer"};//13 lang


    String deck[];
    boolean help[];

    int setup = 0;
    double r;

    URL path;
    AudioClip bell;

    Button verdeel;

    public void init() {
        setSize(500,300);
        //setup voor de bel
        path = H14_2.class.getResource("/h14/resources/");
        bell = getAudioClip(path, "scream.wav");


        deck = new String[52];
        help = new boolean[52];

        verdeel = new Button("verdeel");
        verdeel.addActionListener(new deel());
        add(verdeel);


        for (int i = 0; i < help.length; i++) {
            help[i] = false;
            System.out.println(help[i] + " " + i);
        }

        for(int i=0; i<13;i++){
            deck[setup]= kleur[0]+" "+symbool[i];
            setup++;
        }
        for(int i=0; i<13;i++){
            deck[setup]= kleur[1]+" "+symbool[i];
            setup++;
        }
        for(int i=0; i<13;i++){
            deck[setup]= kleur[2]+" "+symbool[i];
            setup++;
        }
        for(int i=0; i<13;i++){
            deck[setup]= kleur[3]+" "+symbool[i];
            setup++;
        }

    }

    public void paint(Graphics g) {


        g.drawString("speler 1", 50, 50);
        g.drawString("speler 2", 160, 50);
        g.drawString("speler 3", 270, 50);
        g.drawString("speler 4", 380, 50);


        int b = 0;
        for (int i =0; i<4; i++) {
            for (int a =0; a<13; a++) {
                g.drawString(deck[b], 50+110*i,70+12*a);
                b++;
            }
        }
    }


    public static void Randomize(String[] arr) {
        Random rgen = new Random();

        for (int i = 0; i < arr.length; i++) {
            int randPos = rgen.nextInt(arr.length);
            String tmp = arr[i];
            arr[i] = arr[randPos];
            arr[randPos] = tmp;
        }
    }

    class deel implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            Randomize(deck);

            repaint();
            bell.play();
        }
    }


}
