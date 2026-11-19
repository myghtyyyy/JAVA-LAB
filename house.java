import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/* <applet code="house" width="400" height="400"></applet> */

public class house extends Applet {
    public void paint(Graphics g) {
        // outer border
        g.drawRect(20, 20, 360, 360);

        // roof (triangle)
        int[] x = {100, 200, 300};
        int[] y = {150, 60, 150};
        g.setColor(Color.red);
        g.fillPolygon(x, y, 3);

        // house body
        g.setColor(Color.black);
        g.drawRect(100, 150, 200, 150);

        // door
        g.setColor(Color.blue);
        g.fillRect(170, 220, 50, 80);

        // window
        g.setColor(Color.green);
        g.fillRect(240, 180, 40, 40);
    }

    public static void main(String[] args) {
        Frame f = new Frame("House");
        house h = new house();
        f.add(h);
        f.setSize(420, 440);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) { System.exit(0); }
        });
        h.init();
        h.start();
        f.setVisible(true);
    }
}