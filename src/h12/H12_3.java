package h12;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class H12_3 extends Applet {
    TextField input[] = new TextField[5];
    Button ok;

    int cijfers[] = new int[5];

    public void init() {
        setSize(600,100);
        for(int i=0; i!=5; i++){
            input[i] = new TextField("",10);
            add(input[i]);
        }
        ok = new Button("ok");
        ok.addActionListener(new calc());
        add(ok);

    }


    public void paint(Graphics g) {

    }

    class calc implements ActionListener{
        public void actionPerformed(ActionEvent e){
            for(int i=0; i!=5; i++){
                cijfers[i] = Integer.parseInt(input[i].getText());
            }
            Arrays.sort(cijfers);
            for(int i=0; i!=5; i++){
                input[i].setText(String.valueOf(cijfers[i]));
            }
        }
    }
}
