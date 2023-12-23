package Assignment1CG;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.*;

public class Assignment1_65050438_65050792 extends JPanel {
    public static void main(String[] args) {
        Assignment1_65050438_65050792 assignment1 = new Assignment1_65050438_65050792();
        JFrame f = new JFrame();
        f.add(assignment1);
        f.setTitle("Assignment1");
        f.setSize(600,600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    
    public void paintComponent(Graphics g) {
    }

    private void plot(Graphics g, int x, int y , int size) {
        g.fillRect(x, y, size, size);
    }

    // method เส้นตรง
    private void bresenhamLine(Graphics g,int x1, int y1, int x2, int y2) {
        int dx = Math.abs(x2 - x1);
        int dy = Math.abs(y2 - y1);

        int sx = (x1 < x2) ? 1 : -1;
        int sy = (y1 < y2) ? 1 : -1;

        boolean isSwap = false;

        if(dy > dx){
            int temp = dx;
            dx = dy;
            dy = temp;
            isSwap = true;
        }
        
        int D = 2 * dy - dx;
        int x = x1;
        int y = y1;

        for(int i=1; i<=dx; i++){
            plot(g, x, y, 3);
            if(D > 0){
                if(isSwap)
                    x += sx;
                else 
                    y += sy;

                D -= 2 * dx;
            }

            if(isSwap)
                y += sy;
            else 
                x += sx;
            
            D += 2 * dy;
        }
    }

    // method เส้นโค้ง
    public void bezierCurve (Graphics g, int x1, int y1, int x2, int y2, int x3, int y3,int x4, int y4){
        for(int i=0; i <= 1000; i++)
        {
            double t = i / 1000.0;

            int x = (int)(Math.pow(1-t,3)*x1 + 
                    3*t*Math.pow(1-t,2)*x2 +
                    3*t*t*(1-t)*x3 + 
                    Math.pow(t,3)*x4);
            
            int y = (int)(Math.pow(1-t,3)*y1 +
                    3*t*Math.pow(1-t,2)*y2 +
                    3*t*t*(1-t)*y3 +
                    Math.pow(t,3)*y4);
            
            plot(g, x, y, 1);
        }
    }

    // ลงสี
    public BufferedImage floodFill(BufferedImage m, int x, int y, Color target_colour, Color replacement_colour) {
        Graphics2D g2 = m.createGraphics();
        Queue<Point> q = new LinkedList<>();

        if (m.getRGB(x, y) == target_colour.getRGB()) {
            g2.setColor(replacement_colour);
            plot(g2, x, y, 1);
            q.add(new Point(x, y));
        }

        while (!q.isEmpty()) {
            Point p = q.poll();

            // south
            if (p.y < 600 && m.getRGB(p.x, p.y + 1) == target_colour.getRGB()) {
                g2.setColor(replacement_colour);
                plot(g2, p.x, p.y + 1, 1);
                q.add(new Point(p.x, p.y + 1));
            }

            // north
            if (p.y > 0 && m.getRGB(p.x, p.y - 1) == target_colour.getRGB()) {
                g2.setColor(replacement_colour);
                plot(g2, p.x, p.y - 1, 1);
                q.add(new Point(p.x, p.y - 1));
            }

            // east
            if (p.x < 600 && m.getRGB(p.x + 1, p.y) == target_colour.getRGB()) {
                g2.setColor(replacement_colour);
                plot(g2, p.x + 1, p.y, 1);
                q.add(new Point(p.x + 1, p.y));
            }

            // west
            if (p.x > 0 && m.getRGB(p.x - 1, p.y) == target_colour.getRGB()) {
                g2.setColor(replacement_colour);
                plot(g2, p.x - 1, p.y, 1);
                q.add(new Point(p.x - 1, p.y));
            }
        }
        return m;
    }
       

    
}