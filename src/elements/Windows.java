package elements;

import java.awt.*;

public class Windows {
    private int x;
    private int y;

    public Windows(){
    }

    public void draw(Graphics2D g){
        Color oldColor = g.getColor();
        g.setColor(Color.red);
        g.fillRect(x, y, 5, 5);
        g.setColor(Color.green);
        g.fillRect( x+5, y, 5, 5);
        g.setColor(Color.yellow);
        g.fillRect( x+5, y + 5, 5, 5);
        g.setColor(Color.blue);
        g.fillRect(x, y+5, 5, 5);
        g.setColor(oldColor);
    }

    public void moveTo(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void change(Graphics2D g, int upperLeftCornerX, int upperLeftCornerY, int width, int height){
        Color oldColor = g.getColor();
        g.setColor(Color.black);
        g.setFont(new Font("Arial", Font.PLAIN, (int) (width*0.014)));
        g.drawString("Loading...", upperLeftCornerX, upperLeftCornerY+(int) (height*0.04));
        g.setColor(oldColor);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
