package elements;

import java.awt.*;
import java.awt.geom.GeneralPath;

public class Static {
    private static void colorize(Graphics2D g, GeneralPath path, int a, int b, int c) {
        g.setColor(new Color(a, b, c));
        g.fill(path);
        path.reset();
        g.setColor(Color.black);
    }

    public static void createRoom(Graphics2D g, GeneralPath path, int startWidth, int startHeight){
        //walls
        path.moveTo(0, startHeight);
        path.lineTo(startWidth * 0.25, (startHeight * 0.75));
        path.lineTo(startWidth * 0.75, startHeight * 0.75);
        path.lineTo(startWidth, startHeight);

        colorize(g, path, 154, 68, 28);

        path.moveTo(0, 0);
        path.lineTo(startWidth * 0.25, (startHeight * 0.166));
        path.lineTo(startWidth * 0.75, startHeight * 0.166);
        path.lineTo(startWidth, 0);

        colorize(g, path, 220, 219, 219);

        path.moveTo(0, 0);
        path.lineTo(startWidth * 0.25, (startHeight * 0.166));
        path.lineTo(startWidth * 0.75, startHeight * 0.166);
        path.lineTo(startWidth, 0);
        path.lineTo(startWidth, startHeight);
        path.lineTo(startWidth * 0.75, startHeight * 0.75);
        path.lineTo(startWidth * 0.25, startHeight * 0.75);
        path.lineTo(0, startHeight);

        colorize(g, path, 163, 187, 246);

        g.drawLine(0, startHeight, startWidth / 4, (int) (startHeight * 0.75));
        g.drawLine((int) (startWidth * 0.75), (int) (startHeight * 0.75), startWidth, startHeight);
        g.drawLine(0, 0, startWidth / 4, (startHeight / 6));
        g.drawLine((int) (startWidth * 0.75), (startHeight / 6), startWidth, 0);
        g.drawRect(startWidth / 4, (startHeight / 6), (int) (startWidth * 0.5), (int) (startHeight * 0.583));


        //door
        path.moveTo(startWidth * 0.0834, startHeight * 0.917);
        path.lineTo(startWidth * 0.166, startHeight * 0.835);
        path.lineTo(startWidth * 0.166, startHeight * 0.3);
        path.lineTo(startWidth * 0.0834, startHeight * 0.25);

        colorize(g, path, 66, 30, 1);

        g.drawLine(startWidth / 12, (int) (startHeight * 0.915), startWidth / 12, (int) (startHeight * 0.25));
        g.drawLine(startWidth / 6, (int) (startHeight * 0.832), startWidth / 6, (int) (startHeight * 0.3));
        g.drawLine(startWidth / 12, (int) (startHeight * 0.25), startWidth / 6, (int) (startHeight * 0.3));
        g.fillOval((int) (startWidth / 12 + 0.2 * (startWidth / 6 - startWidth / 12)), (int) ((startHeight * 0.25) + 0.66 * ((startHeight * 0.832) - (startHeight * 0.25))), 8, 8);

        //window

        path.moveTo(startWidth * 0.92, startHeight * 0.25);
        path.lineTo(startWidth * 0.83, startHeight * 0.30);
        path.lineTo(startWidth * 0.83, startHeight * 0.46);
        path.lineTo(startWidth * 0.92, startHeight * 0.515);
        path.lineTo(startWidth * 0.92, startHeight * 0.498);
        path.lineTo(startWidth * 0.85, startHeight * 0.46);
        path.lineTo(startWidth * 0.85, startHeight * 0.3);
        path.lineTo(startWidth * 0.92, startHeight * 0.267);
        colorize(g, path, 255, 255, 255);

        path.moveTo(startWidth * 0.92, startHeight * 0.267);
        path.lineTo(startWidth * 0.92, startHeight * 0.498);
        path.lineTo(startWidth * 0.85, startHeight * 0.46);
        path.lineTo(startWidth * 0.85, startHeight * 0.3);
        colorize(g, path, 123, 241, 133);

        g.drawLine((int) (startWidth * 0.92), (int) (startHeight * 0.515), (int) (startWidth * 0.92), (int) (startHeight * 0.25));
        g.drawLine((int) (startWidth * 0.83), (int) (startHeight * 0.46), (int) (startWidth * 0.92), (int) (startHeight * 0.515));
        g.drawLine((int) (startWidth * 0.92), (int) (startHeight * 0.25), (int) (startWidth * 0.83), (int) (startHeight * 0.30));
        g.drawLine((int) (startWidth * 0.85), (int) (startHeight * 0.46), (int) (startWidth * 0.92), (int) (startHeight * 0.498));
        g.drawLine((int) (startWidth * 0.85), (int) (startHeight * 0.3), (int) (startWidth * 0.92), (int) (startHeight * 0.267));
        g.drawRect((int) (startWidth * 0.83), (int) (startHeight * 0.30), (int) (startWidth * 0.02), (int) (startHeight * 0.16));

        //table
        path.moveTo(startWidth * 0.35, startHeight * 0.69);
        path.lineTo(startWidth * 0.39, startHeight * 0.58);
        path.lineTo(startWidth * 0.61, startHeight * 0.58);
        path.lineTo(startWidth * 0.65, startHeight * 0.69);
        path.lineTo(startWidth * 0.65, startHeight * 0.78);
        path.lineTo(startWidth * 0.58, startHeight * 0.78);
        path.lineTo(startWidth * 0.565, startHeight * 0.75);
        path.lineTo(startWidth * 0.565, startHeight * 0.69);
        path.lineTo(startWidth * 0.435, startHeight * 0.69);
        path.lineTo(startWidth * 0.435, startHeight * 0.75);
        path.lineTo(startWidth * 0.42, startHeight * 0.78);
        path.lineTo(startWidth * 0.35, startHeight * 0.78);

        colorize(g, path, 238, 164, 108);

        g.drawRect((int) (startWidth * 0.35), (int) (startHeight * 0.69), (int) (startWidth * 0.07), (int) (startHeight * 0.09));
        g.drawRect((int) (startWidth * 0.581), (int) (startHeight * 0.69), (int) (startWidth * 0.07), (int) (startHeight * 0.09));

        g.setColor(new Color(112, 1, 1));
        g.fillRect((int) (startWidth * 0.355), (int) (startHeight * 0.70), (int) (startWidth * 0.06), (int) (startHeight * 0.02));
        g.fillRect((int) (startWidth * 0.355), (int) (startHeight * 0.725), (int) (startWidth * 0.06), (int) (startHeight * 0.02));
        g.fillRect((int) (startWidth * 0.355), (int) (startHeight * 0.75), (int) (startWidth * 0.06), (int) (startHeight * 0.02));
        g.fillRect((int) (startWidth * 0.586), (int) (startHeight * 0.7), (int) (startWidth * 0.06), (int) (startHeight * 0.072));
        g.setColor(Color.black);

        g.fillOval((int) (startWidth * 0.382), (int) (startHeight * 0.705), (int) (startWidth * 0.006), (int) (startHeight * 0.008));
        g.fillOval((int) (startWidth * 0.382), (int) (startHeight * 0.73), (int) (startWidth * 0.006), (int) (startHeight * 0.008));
        g.fillOval((int) (startWidth * 0.382), (int) (startHeight * 0.755), (int) (startWidth * 0.006), (int) (startHeight * 0.008));
        g.fillOval((int) (startWidth * 0.593), (int) (startHeight * 0.734), (int) (startWidth * 0.007), (int) (startHeight * 0.010));

        g.drawLine((int) (startWidth * 0.35), (int) (startHeight * 0.69), (int) (startWidth * 0.39), (int) (startHeight * 0.58));
        g.drawLine((int) (startWidth * 0.39), (int) (startHeight * 0.58), (int) (startWidth * 0.61), (int) (startHeight * 0.58));
        g.drawLine((int) (startWidth * 0.61), (int) (startHeight * 0.58), (int) (startWidth * 0.65), (int) (startHeight * 0.69));
        g.drawLine((int) (startWidth * 0.65), (int) (startHeight * 0.69), (int) (startWidth * 0.35), (int) (startHeight * 0.69));
        g.drawLine((int) (startWidth * 0.42), (int) (startHeight * 0.78), (int) (startWidth * 0.435), (int) (startHeight * 0.75));
        g.drawLine((int) (startWidth * 0.435), (int) (startHeight * 0.75), (int) (startWidth * 0.435), (int) (startHeight * 0.69));
        g.drawLine((int) (startWidth * 0.581), (int) (startHeight * 0.78), (int) (startWidth * 0.566), (int) (startHeight * 0.75));
        g.drawLine((int) (startWidth * 0.566), (int) (startHeight * 0.75), (int) (startWidth * 0.566), (int) (startHeight * 0.69));

        //computer
        path.moveTo((int) (startWidth * 0.45), (int) (startHeight * 0.66));
        path.lineTo((int) (startWidth * 0.46), (int) (startHeight * 0.63));
        path.lineTo((int) (startWidth * 0.54), (int) (startHeight * 0.63));
        path.lineTo((int) (startWidth * 0.55), (int) (startHeight * 0.66));
        path.lineTo((int) (startWidth * 0.45), (int) (startHeight * 0.66));
        colorize(g, path, 195, 196, 190);
        //g.setColor(new Color(195, 196, 190));

        g.fillRoundRect((int) (startWidth * 0.46), (int) (startHeight * 0.52), (int) (startWidth * 0.08), (int) (startHeight * 0.09), 18, 18);
        g.setColor(Color.black);
        g.fillRect((int) (startWidth * 0.49), (int) (startHeight * 0.6), (int) (startWidth * 0.02), (int) (startHeight * 0.03));
        g.drawLine((int) (startWidth * 0.45), (int) (startHeight * 0.66), (int) (startWidth * 0.46), (int) (startHeight * 0.63));
        g.drawLine((int) (startWidth * 0.46), (int) (startHeight * 0.63), (int) (startWidth * 0.54), (int) (startHeight * 0.63));
        g.drawLine((int) (startWidth * 0.54), (int) (startHeight * 0.63), (int) (startWidth * 0.55), (int) (startHeight * 0.66));
        g.drawLine((int) (startWidth * 0.55), (int) (startHeight * 0.66), (int) (startWidth * 0.45), (int) (startHeight * 0.66));

        path.moveTo((int) (startWidth * 0.543), (int) (startHeight * 0.64));
        path.curveTo((int) (startWidth * 0.543), (int) (startHeight * 0.64), (int) (startWidth * 0.545), (int) (startHeight * 0.6), (int) (startWidth * 0.57), (int) (startHeight * 0.64));
        g.draw(path);
        path.reset();

        g.setColor(new Color(195, 196, 190));
        g.fillOval((int) (startWidth * 0.565), (int) (startHeight * 0.639), (int) (startWidth * 0.01), (int) (startHeight * 0.03));

        g.setColor(Color.black);
        g.drawOval((int) (startWidth * 0.565), (int) (startHeight * 0.639), (int) (startWidth * 0.01), (int) (startHeight * 0.03));

        g.drawLine((int) (startWidth * 0.565), (int) (startHeight * 0.649), (int) (startWidth * 0.5735), (int) (startHeight * 0.649));
        g.drawLine((int) (startWidth * 0.5695), (int) (startHeight * 0.639), (int) (startWidth * 0.5695), (int) (startHeight * 0.649));


        //sistemnik
        path.moveTo((int) (startWidth * 0.40), (int) (startHeight * 0.55));
        path.lineTo((int) (startWidth * 0.415), (int) (startHeight * 0.53));
        path.lineTo((int) (startWidth * 0.44), (int) (startHeight * 0.53));
        path.lineTo((int) (startWidth * 0.44), (int) (startHeight * 0.63));
        path.lineTo((int) (startWidth * 0.425), (int) (startHeight * 0.65));
        colorize(g, path, 162, 163, 157);


        g.setColor(new Color(195, 196, 190));
        g.fillRect((int) (startWidth * 0.40), (int) (startHeight * 0.55), (int) (startWidth * 0.025), (int) (startHeight * 0.1));
        g.setColor(Color.BLACK);
        g.drawRect((int) (startWidth * 0.40), (int) (startHeight * 0.55), (int) (startWidth * 0.025), (int) (startHeight * 0.1));
        g.drawLine((int) (startWidth * 0.40), (int) (startHeight * 0.55), (int) (startWidth * 0.415), (int) (startHeight * 0.53));
        g.drawLine((int) (startWidth * 0.425), (int) (startHeight * 0.55), (int) (startWidth * 0.44), (int) (startHeight * 0.53));
        g.drawLine((int) (startWidth * 0.415), (int) (startHeight * 0.53), (int) (startWidth * 0.44), (int) (startHeight * 0.53));
        g.drawLine((int) (startWidth * 0.425), (int) (startHeight * 0.65), (int) (startWidth * 0.44), (int) (startHeight * 0.63));
        g.drawLine((int) (startWidth * 0.44), (int) (startHeight * 0.63), (int) (startWidth * 0.44), (int) (startHeight * 0.53));

        //PC BUTTON
        g.setColor(Color.black);
        g.fillOval((int) (startWidth * 0.409), (int) (startHeight * 0.62), (int) (startWidth * 0.0065), (int) (startHeight * 0.01));


    }
}
