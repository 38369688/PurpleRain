/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package purplerain;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author user
 */
public class RainDrop {

    {
        radius = 5;
        minRadius = 5;
        maxRadius = 100;

        opacity = 240;
        opacity = 40;
        opacity = 240;

        red = 248;
        green = 248;
        blue = 255;
    }

    public RainDrop(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics graphics) {
        graphics.setColor(new Color(red, green, blue, opacity));
        graphics.fillOval(x, y, 2 * radius, 2 * radius);
    }

    int x;
    int y;

    int radius;
    int minRadius;
    int maxRadius;

    int opacity;
    int minOpacity;
    int maxOpacity;

    int red;
    int green;
    int blue;

    public void step() {
        grow();
        fade();
    }

    private void grow() {

        if (radius < maxRadius) {
            radius++;
        }

    }

    private void fade() {

        if (opacity > minOpacity) {
            opacity--;
        }
    }

}
