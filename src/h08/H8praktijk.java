package h08;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class H8praktijk extends Applet {
    TextField txt1;
    TextField txt2;
    Button add;
    Button minus;
    Button mult;
    Button divide;
    Double t1;
    Double t2;
    Double uitkomst;
    String uitkomsts;

    public void init() {
        setSize(750, 100);

        t1 = 0.0;
        t2 = 0.0;
        uitkomst = 0.0;
        uitkomsts = "";

        txt1 = new TextField("", 30);
        txt2 = new TextField("", 30);
        add = new Button("+");
        minus = new Button("-");
        mult = new Button("*");
        divide = new Button("/");

        add.addActionListener(new addL());
        minus.addActionListener(new minusL());
        mult.addActionListener(new multL());
        divide.addActionListener(new divideL());

        add(txt1);
        add(txt2);
        add(add);
        add(minus);
        add(mult);
        add(divide);


    }

    public void paint(Graphics g) {

    }

    //plus
    class addL implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            t1 = Double.parseDouble(txt1.getText());
            t2 = Double.parseDouble(txt2.getText());
            uitkomst = t1 + t2;
            uitkomsts = String.valueOf(uitkomst);
            txt1.setText(uitkomsts);
            txt2.setText("");
            uitkomsts = String.valueOf(uitkomst);
        }
    }

    //min
    class minusL implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            t1 = Double.parseDouble(txt1.getText());
            t2 = Double.parseDouble(txt2.getText());
            uitkomst = t1 - t2;
            uitkomsts = String.valueOf(uitkomst);
            txt1.setText(uitkomsts);
            txt2.setText("");
            uitkomsts = String.valueOf(uitkomst);
        }
    }

    //keer
    class multL implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            t1 = Double.parseDouble(txt1.getText());
            t2 = Double.parseDouble(txt2.getText());
            uitkomst = t1 * t2;
            uitkomsts = String.valueOf(uitkomst);
            txt1.setText(uitkomsts);
            txt2.setText("");
            uitkomsts = String.valueOf(uitkomst);
        }
    }

    //delen
    class divideL implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            t1 = Double.parseDouble(txt1.getText());
            t2 = Double.parseDouble(txt2.getText());
            uitkomst = t1 / t2;
            uitkomsts = String.valueOf(uitkomst);
            txt1.setText(uitkomsts);
            txt2.setText("");
            uitkomsts = String.valueOf(uitkomst);
        }
    }

}
