package h14;

import java.awt.*;
import java.applet.*;
import java.net.*;

public class H14uitleg extends Applet {


    private Image afbeelding;
    private URL pad;

    public void init() {
        pad = H14uitleg.class.getResource("/resources/");
        afbeelding = getImage(pad, "IMG_6940.JPG");
    }

    public void paint(Graphics g) {
        g.drawString(pad.toString(), 20, 10);
        g.drawImage(afbeelding, 20, 20, 400, 300, this);
    }


    /*
     Image img;
     Image img2;
     URL path2;
     String path = "/Users/rick/Documents/ok/inleiding-java/out/production/inleiding-java/h14/resources/";

     public void init() {
     setSize(1000,580);
     path2 = H14uitleg.class.getResource("/resources/");
     img = getImage(getDocumentBase(), path + "IMG_6940.JPG");
     img2 = getImage(path2, "IMG_6940.JPG");
     }


     public void paint(Graphics g) {
     g.drawString(path2.toString(),10,20);
     g.drawImage(img, 20, 20, 480, 270, this);
     g.drawImage(img2, 20, 20, 500, 270, this);

     }

     */
}
///Users/rick/Documents/ok/inleiding-java/out/production/inleiding-java/h14/resources/IMG_6940.JPG