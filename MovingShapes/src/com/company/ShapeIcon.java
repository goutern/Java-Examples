package com.company;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.*;
public class ShapeIcon implements Icon{
    private int width, height;
    private MoveableShape shape;
    public
    ShapeIcon
            (MoveableShape s, int w, int h) {
        shape = s;
        width = w;
        height = h;
    }
    public int
    getIconWidth
            () {
        return width;
    }
    public int
    getIconHeight
            () {
        return height;
    }
    public void
    paintIcon
            (Component c, Graphics g, int x, int y) {
        Graphics2D g2 = (Graphics2D) g;
        shape.draw(g2);
    }
}
