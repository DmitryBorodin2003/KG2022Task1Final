package elements;

import java.awt.*;

public class Clock {
    private int x, y, r;
    private final Color c;
    private int temp = 270;
    private double temp2 = 270;
    double da = 2 * Math.PI / 360;

    public Clock(int x, int y, int r, Color c) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.c = c;
    }

    public void draw(Graphics2D g){
        Color oldColor = g.getColor();
        g.setColor(Color.black);

        g.fillOval(x-r-3, y-r-3, r+r+6, r+r+6);
        g.setColor(c);
        g.fillOval(x-r, y-r, r+r, r+r);
        time(g);
        g.setColor(Color.black);
        g.setFont(new Font("Arial", Font.PLAIN, (int)(r*0.3)));
        g.drawString("12", x- ((int) (r*0.2)), y - ((int) (r*0.7)));
        g.drawString("3", x + ((int) (r*0.7)), y + ((int) (r*0.1)));
        g.drawString("6", x - ((int) (r*0.07)), y + ((int) (r*0.9)));
        g.drawString("9", x - ((int) (r*0.9)), y + ((int) (r*0.1)));
        g.setColor(oldColor);
    }

    public void moveTo(int x, int y, int r){
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public void save(){
        temp--;
        temp2-=0.2;
    }
    public void time(Graphics2D g){
        double a = da * temp;
        double b = da * temp2;
        temp++;
        temp2+=0.2;
        double x1 = x;
        double y1 = y;
        double x2 = x + r * 0.7 * Math.cos(a);
        double y2 = y + r * 0.7 * Math.sin(a);
        double x3 = x + r * 0.4 * Math.cos(b);
        double y3 = y + r * 0.4 * Math.sin(b);
        g.drawLine((int) x1, (int) y1, (int) x2, (int) y2);
        g.drawLine((int) x1, (int) y1, (int) x3, (int) y3);
    }
}

