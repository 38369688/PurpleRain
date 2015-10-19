/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package purplerain;

import environment.Environment;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

/**
 *
 * @author user
 */
class RainEnviroment extends Environment {

    ArrayList<RainDrop> drops;

    public RainEnviroment() {
        this.setBackground(Color.black);
        drops = new ArrayList<>();
        for (int i = 0; i < 25; i++) {
            drops.add(new RainDrop(random(800), random(600)));
        }
    }

    public static int random(int maxValue) {
        return (int) (Math.random() * maxValue);
    }

    @Override
    public void initializeEnvironment() {
    }

    @Override
    public void timerTaskHandler() {
        for (int i = 0; i < drops.size(); i++) {
           drops.get(i).step();
        }
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {
    }

    @Override
    public void paintEnvironment(Graphics graphics) {
        for (int i = 0; i < drops.size(); i++) {
            drops.get(i).draw(graphics);
        }
    }

}
