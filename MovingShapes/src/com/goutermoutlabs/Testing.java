package com.goutermoutlabs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.Timer;

public class Testing {
    private static final int
            ICON_WIDTH
            = 400;
    private static final int
            ICON_HEIGHT
            = 400;
    private static final int
            CAR_WIDTH
            = 200;

    public static void main(String[] args) {
        // Create a frame
        JFrame frame = new JFrame();

        // Create an object CarShape and create a ShapeIcon object from it
        final MoveableShape shape = new CarShape(10, 10,CAR_WIDTH);

        ShapeIcon icon = new ShapeIcon(shape,ICON_WIDTH,ICON_HEIGHT);

        //Create a label to hold the car icon
        final JLabel label = new JLabel(icon);

        // Add the created components to the frame
        frame.setLayout(new FlowLayout());
        frame.add(label);

        //pack the frame and show it
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.pack();
        frame.setVisible(true);

        // Create a Timer to move the car every 10 seconds
        final int DELAY = 1000;
        Timer t = new Timer(DELAY, new
                ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        shape.translate(1, 0);
                        label.repaint();
                    }
                });
        t.start();
    }
}
