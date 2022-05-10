/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.accessibility.Accessible;
import javax.swing.AbstractButton;
import javax.swing.JButton;

/**
 *
 * @author rafae
 */
public class MBotao extends JButton implements Accessible{
     private static final long serialVersionUID = 1L;

    private Color circleColor = Color.BLACK;

    public MBotao(String label) {
        super(label);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Dimension originalSize = super.getPreferredSize();
        int gap = (int) (originalSize.height * 0.2);
        int x = originalSize.width + gap;
        int y = gap;
        int diameter = originalSize.height - (gap * 2);

        g.setColor(circleColor);
        g.fillOval(x, y, diameter, diameter);
    }

    @Override
    public Dimension getPreferredSize() {
        Dimension size = super.getPreferredSize();
        size.width += size.height;
        return size;
    }
}
