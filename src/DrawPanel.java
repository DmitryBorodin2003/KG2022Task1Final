import elements.Clock;
import elements.Static;
import elements.Windows;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.GeneralPath;
import java.util.concurrent.atomic.AtomicInteger;

public class DrawPanel extends JPanel {
    Windows w;
    Clock c;
    boolean on = false;
    int direction = 1;
    int currTime = 0;
    AtomicInteger time = new AtomicInteger();
    AtomicInteger timeForClock = new AtomicInteger();
    private int startHeight = 600;
    private int startWidth = 800;
    public DrawPanel() {
        w = new Windows();
        w.moveTo(-10, -10);
        c = new Clock((int) (startWidth*0.3), (int) ((startHeight)*0.2), (int) ((startWidth + startHeight)*0.025),  Color.white);

        javax.swing.Timer timerForClock = new Timer(200, eee -> {
            timeForClock.getAndIncrement();
            repaint();
        });
        timerForClock.start();


        javax.swing.Timer timer = new Timer(200, ee -> {
            time.getAndIncrement();
            if (time.get() > 25){
                switch (direction) {
                    case (1) -> {
                        w.setX(w.getX() + 2);
                        w.setY(w.getY() - 1);
                        if ((w.getX() >= startWidth * 0.53 - 13) || (w.getY() <= startHeight * 0.53)) {
                            direction++;
                        }
                    }
                    case (2) -> {
                        w.setX(w.getX() + 3);
                        w.setY(w.getY() + 2);
                        if ((w.getX() >= startWidth * 0.53 - 12) || (w.getY() >= startHeight * 0.6)) {
                            direction++;
                        }
                    }
                    case (3) -> {
                        w.setX(w.getX() - 2);
                        w.setY(w.getY() + 1);
                        if ((w.getX() <= startWidth * 0.47) || (w.getY() >= startHeight * 0.6 - 11)) {
                            direction++;
                        }
                    }
                    case (4) -> {
                        w.setX(w.getX() - 3);
                        w.setY(w.getY() - 2);
                        if ((w.getX() <= startWidth * 0.47 + 1) || (w.getY() <= startHeight * 0.53)) {
                            direction = 1;
                        }
                    }
                }
            }
        });

        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if ((e.getX() > (int) (startWidth * 0.409)) && (e.getX() < (int) (startWidth * 0.4155)) && (e.getY() > (int) (startHeight * 0.62)) && (e.getY() < (int) (startHeight * 0.63))) {
                    on = !on;
                    if (on){
                        direction = 1;
                        timer.start();
                    } else {
                        w.moveTo(-10, -10);
                        timer.stop();
                        time.set(0);
                    }
                }
            }
        });
    }


    @Override
    public void paint(Graphics gr) {

        super.paint(gr);
        Graphics2D g = (Graphics2D) gr;
        GeneralPath path = new GeneralPath();

        Static.createRoom(g, path, startWidth, startHeight);

        if(on){
            g.setColor(Color.white);
            g.fillRect((int) (startWidth * 0.47), (int) (startHeight * 0.53), (int) (startWidth * 0.06), (int) (startHeight * 0.07));
        } else {
            g.setColor(Color.gray);
            g.fillRect((int) (startWidth * 0.47), (int) (startHeight * 0.53), (int) (startWidth * 0.06), (int) (startHeight * 0.07));
        }

        g.setColor(Color.black);
        if (on) {
            if (time.get() < 25) {
                w.change(g, (int) (startWidth * 0.47), (int) (startHeight * 0.53), startWidth, startHeight);
            }
            if (time.get() == 25){
                w.moveTo((int) (startWidth*0.47), (int) (startHeight*0.56));
            }
        }

        w.draw(g);
        c.draw(g);

        if (currTime != timeForClock.get()){
            c.time(g);
            currTime = timeForClock.get();
        }

        if (startHeight != getHeight() || startWidth != getWidth()){
            startWidth = getWidth();
            startHeight = getHeight();
            c.moveTo((int) (startWidth*0.35), (int) ((startHeight)*0.28), (int) ((startWidth + startHeight)*0.025));
            c.save();

            if (on){
                direction = 1;
                if (time.get() > 25){
                    w.moveTo((int) (startWidth*0.47), (int) (startHeight*0.56));
                }
            }
        }
    }
}