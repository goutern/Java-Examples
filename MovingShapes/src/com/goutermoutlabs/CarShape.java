package com.goutermoutlabs;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

import static java.lang.Math.cos;
import static java.lang.StrictMath.sin;

public class CarShape implements MoveableShape {
    private int x, y, width;
    private boolean rotate = true;
    public CarShape (int x, int y, int width) {
        this.x = x;
        this.y = y;
        this.width = width;
    }
    public void translate (int dx, int dy) {
        x += dx;
        y += dy;
        rotate = !rotate;
    }
    public void draw (Graphics2D g2) {
        Rectangle2D.Double body = new Rectangle2D.Double(x, y+width/6,width-1,width/6);
        Ellipse2D.Double frontTire = new Ellipse2D.Double(x+width/6, y+width/3, width/6,width/6);

        Point2D.Double c1 = new Point2D.Double(frontTire.getCenterX(),frontTire.getCenterY());
        Point2D.Double sf1 = new Point2D.Double(frontTire.getCenterX(),frontTire.getCenterY() + frontTire.getHeight()/2);
        Point2D.Double sf2 = new Point2D.Double(frontTire.getCenterX() + frontTire.getWidth()/2,frontTire.getCenterY());
        Point2D.Double sf3 = new Point2D.Double(frontTire.getCenterX(),frontTire.getCenterY() - frontTire.getHeight()/2);
        Point2D.Double sf4 = new Point2D.Double(frontTire.getCenterX() - frontTire.getWidth()/2,frontTire.getCenterY());
        Ellipse2D.Double rearTire = new Ellipse2D.Double(x + width*2/3,y+width/3,width/6,width/6);
        Point2D.Double sr1 = new Point2D.Double(rearTire.getCenterX(),rearTire.getCenterY() + rearTire.getHeight()/2);
        Point2D.Double sr2 = new Point2D.Double(rearTire.getCenterX() + rearTire.getWidth()/2,rearTire.getCenterY());
        Point2D.Double sr3 = new Point2D.Double(rearTire.getCenterX(),rearTire.getCenterY() - rearTire.getHeight()/2);
        Point2D.Double sr4 = new Point2D.Double(rearTire.getCenterX() - rearTire.getWidth()/2,rearTire.getCenterY());

        Line2D.Double sfd1 = new Line2D.Double(frontTire.getCenterX() + frontTire.getWidth()/2 * cos(45), frontTire.getCenterY() + frontTire.getHeight()/2 * sin(45),
                frontTire.getCenterX() - frontTire.getWidth()/2 * cos(45), frontTire.getCenterY() - frontTire.getHeight()/2 * sin(45));


        Point2D.Double r1 = new Point2D.Double(x+width/6,y+width/6);
        Point2D.Double r2 = new Point2D.Double(x+width/3,y);
        Point2D.Double r3 = new Point2D.Double(x+width*2/3,y);
        Point2D.Double r4 = new Point2D.Double(x+width*5/6,y+width/6);
        Line2D.Double frontWindShield = new Line2D.Double(r1,  r2);
        Line2D.Double roofTop = new Line2D.Double(r2,  r3);
        Line2D.Double rearWindShield = new Line2D.Double(r3,  r4);
        Line2D.Double spokef1 = new Line2D.Double(sf1, sf3);
        Line2D.Double spokef2 = new Line2D.Double(sf2, sf4);
        Line2D.Double spoker1 = new Line2D.Double(sr1, sr3);
        Line2D.Double spoker2 = new Line2D.Double(sr2, sr4);
        g2.draw(body);
        g2.draw(frontTire);
        if (rotate){
            g2.draw(spokef1);
            g2.draw(spoker2);
        }else{
            g2.draw(spokef2);
            g2.draw(spoker1);
        }
        g2.draw(sfd1);
        g2.draw(rearTire);
        g2.draw(frontWindShield);
        g2.draw(roofTop);
        g2.draw(rearWindShield);
    }
}