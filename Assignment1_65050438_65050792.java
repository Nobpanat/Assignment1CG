package Assignment1CG;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.*;
import java.util.Queue;

public class Assignment1_65050438_65050792 extends JPanel {
    public static void main(String[] args) {
        Assignment1_65050438_65050792 assignment1 = new Assignment1_65050438_65050792();
        JFrame f = new JFrame();
        f.add(assignment1);
        f.setTitle("Assignment1");
        f.setSize(600, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public void paintComponent(Graphics g) {
        BufferedImage buffer = new BufferedImage(601, 601, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = buffer.createGraphics();

        g2.setColor(Color.WHITE);
        g2.fillRect(0, 0, 600, 600);

        g2.setColor(Color.BLACK);
        // Right Wing
        bezierCurve(g2, 359, 313, 397, 315, 411, 298);
        bezierCurve(g2, 411, 298, 390, 275, 438, 294);
        bezierCurve(g2, 438, 294, 473, 326, 472, 344);
        bezierCurve(g2, 472, 344, 439, 307, 425, 312);
        bezierCurve(g2, 425, 312, 397, 334, 364, 323);
        bresenhamLine(g2, 364, 323, 359, 313);
        bezierCurve(g2, 425, 312, 397, 334, 364, 323);
        bezierCurve(g2, 364, 323, 361, 327, 384, 357);
        bezierCurve(g2, 384, 357, 394, 352, 403, 367);
        bresenhamLine(g2, 403, 367, 428, 311);
        bezierCurve(g2, 428, 311, 446, 349, 445, 371);
        bezierCurve(g2, 445, 371, 436, 361, 401, 366);
        bezierCurve(g2, 445, 371, 448, 349, 473, 343);

        // Tail
        bezierCurve(g2, 384, 357, 400, 391, 394, 407);
        bresenhamLine(g2, 394, 407, 410, 416);
        bezierCurve(g2, 410, 416, 436, 408, 425, 436);
        bezierCurve(g2, 425, 436, 408, 437, 405, 419);
        bresenhamLine(g2, 405, 419, 407, 414);
        bezierCurve(g2, 425, 436, 434, 430, 442, 452);
        bezierCurve(g2, 442, 452, 422, 449, 444, 470);
        bezierCurve(g2, 444, 470, 460, 455, 444, 451);
        bresenhamLine(g2, 444, 451, 440, 450);
        bresenhamLine(g2, 444, 470, 449, 468);
        bezierCurve(g2, 449, 468, 461, 504, 434, 506);
        bezierCurve(g2, 434, 506, 449, 479, 394, 465);
        bezierCurve(g2, 394, 465, 414, 450, 381, 445);
        bresenhamLine(g2, 381, 445, 393, 447);
        bezierCurve(g2, 393, 447, 393, 422, 388, 420);
        bezierCurve(g2, 388, 420, 398, 408, 397, 406);

        bezierCurve(g2, 437, 506, 462, 478, 394, 443);
        bresenhamLine(g2, 394, 443, 391, 442);

        // Leg
        bezierCurve(g2, 394, 465, 361, 479, 335, 461);
        bezierCurve(g2, 335, 461, 342, 443, 340, 441);
        bezierCurve(g2, 335, 461, 276, 464, 274, 452);
        bezierCurve(g2, 274, 452, 273, 439, 272, 441);
        bezierCurve(g2, 274, 452, 294, 466, 242, 470);
        bezierCurve(g2, 242, 470, 210, 470, 214, 451);
        bezierCurve(g2, 214, 451, 219, 443, 231, 445);
        bezierCurve(g2, 274, 452, 294, 466, 242, 470);
        bezierCurve(g2, 242, 470, 210, 470, 214, 451);
        bezierCurve(g2, 214, 451, 223, 450, 222, 427);
        bresenhamLine(g2, 222, 427, 226, 421);
        bezierCurve(g2, 226, 421, 211, 415, 222, 375);
        bezierCurve(g2, 222, 375, 226, 357, 244, 337);
        bezierCurve(g2, 244, 337, 256, 316, 255, 314);

        // Left wing
        bezierCurve(g2, 255, 314, 210, 315, 200, 296);
        bezierCurve(g2, 200, 296, 220, 281, 187, 290);
        bezierCurve(g2, 187, 290, 157, 294, 140, 344);
        bezierCurve(g2, 140, 344, 168, 313, 187, 311);
        bezierCurve(g2, 187, 311, 228, 340, 256, 315);
        bezierCurve(g2, 187, 311, 198, 355, 209, 367);
        bezierCurve(g2, 209, 367, 218, 354, 231, 355);
        bezierCurve(g2, 209, 367, 186, 359, 168, 370);
        bezierCurve(g2, 168, 370, 174, 317, 186, 311);
        bezierCurve(g2, 168, 370, 157, 341, 138, 346);
        bresenhamLine(g2, 138, 346, 141, 343);
        bezierCurve(g2, 255, 314, 306, 336, 361, 312);

        // Fire
        bezierCurve(g2, 305, 318, 303, 363, 293, 358);
        bezierCurve(g2, 293, 358, 288, 358, 287, 349);
        bezierCurve(g2, 287, 349, 277, 362, 287, 385);
        bezierCurve(g2, 287, 385, 304, 406, 323, 388);
        bezierCurve(g2, 323, 388, 333, 373, 326, 350);
        bezierCurve(g2, 326, 350, 319, 368, 311, 348);
        bezierCurve(g2, 311, 348, 308, 346, 306, 317);
        bresenhamLine(g2, 306, 317, 305, 320);

        // Fat
        bezierCurve(g2, 353, 356, 341, 320, 340, 320);
        bezierCurve(g2, 340, 320, 300, 328, 273, 320);
        bezierCurve(g2, 273, 320, 260, 355, 261, 357);
        bezierCurve(g2, 260, 415, 266, 440, 301, 442);
        bezierCurve(g2, 301, 442, 341, 447, 355, 415);

        // Right Hand
        bezierCurve(g2, 374, 411, 324, 424, 332, 387);
        bezierCurve(g2, 332, 387, 340, 346, 364, 362);
        bezierCurve(g2, 364, 362, 379, 372, 382, 380);

        // Left Hand
        bezierCurve(g2, 231, 380, 260, 336, 276, 371);
        bezierCurve(g2, 276, 371, 293, 407, 267, 414);
        bezierCurve(g2, 267, 414, 243, 415, 239, 411);

        

        // Right Nail H
        bezierCurve(g2, 352, 358, 366, 374, 346, 369);
        bresenhamLine(g2, 346, 369, 341, 365);
        bezierCurve(g2, 341, 365, 358, 382, 344, 381);
        bezierCurve(g2, 344, 381, 334, 379, 334, 378);
        bezierCurve(g2, 334, 378, 354, 392, 339, 393);
        bresenhamLine(g2, 339, 393, 331, 392);

        // Left Nail H
        bezierCurve(g2, 262, 358, 251, 370, 259, 370);
        bezierCurve(g2, 259, 370, 270, 370, 272, 365);
        bezierCurve(g2, 272, 365, 254, 382, 272, 381);
        bezierCurve(g2, 272, 381, 277, 381, 279, 378);
        bezierCurve(g2, 279, 378, 266, 390, 269, 391);
        bezierCurve(g2, 269, 391, 276, 394, 281, 393);

        // Right Nail L
        bezierCurve(g2, 398, 461, 392, 449, 387, 454);
        bezierCurve(g2, 387, 454, 383, 455, 385, 468);
        bezierCurve(g2, 385, 468, 379, 444, 371, 458);
        bresenhamLine(g2, 371, 458, 368, 470);
        bezierCurve(g2, 368, 470, 365, 447, 355, 460);
        bezierCurve(g2, 355, 460, 352, 468, 354, 470);

        // Left Nail L
        bezierCurve(g2, 259, 468, 256, 447, 249, 458);
        bezierCurve(g2, 249, 458, 244, 463, 246, 470);
        bezierCurve(g2, 246, 470, 241, 442, 230, 460);
        bezierCurve(g2, 230, 460, 228, 466, 229, 469);
        bezierCurve(g2, 229, 469, 231, 446, 218, 456);
        bresenhamLine(g2, 218, 456, 215, 459);

        g.drawImage(buffer, 0, 0, null);
        // test
    }

    private void plot(Graphics g, int x, int y, int size) {
        g.fillRect(x, y, size, size);
    }

    // method เส้นตรง
    private void bresenhamLine(Graphics g, int x1, int y1, int x2, int y2) {
        int dx = Math.abs(x2 - x1);
        int dy = Math.abs(y2 - y1);

        int sx = (x1 < x2) ? 1 : -1;
        int sy = (y1 < y2) ? 1 : -1;

        boolean isSwap = false;

        if (dy > dx) {
            int temp = dx;
            dx = dy;
            dy = temp;
            isSwap = true;
        }

        int D = 2 * dy - dx;
        int x = x1;
        int y = y1;

        for (int i = 1; i <= dx; i++) {
            plot(g, x, y, 1);
            if (D > 0) {
                if (isSwap)
                    x += sx;
                else
                    y += sy;

                D -= 2 * dx;
            }

            if (isSwap)
                y += sy;
            else
                x += sx;

            D += 2 * dy;
        }
    }

    // method เส้นโค้ง
    public void bezierCurve(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        for (int i = 0; i <= 1000; i++) {
            double t = i / 1000.0;

            int x = (int) (Math.pow(1 - t, 3) * x1 +
                    3 * t * Math.pow(1 - t, 2) * x2 +
                    3 * t * t * (1 - t) * x3 +
                    Math.pow(t, 3) * x4);

            int y = (int) (Math.pow(1 - t, 3) * y1 +
                    3 * t * Math.pow(1 - t, 2) * y2 +
                    3 * t * t * (1 - t) * y3 +
                    Math.pow(t, 3) * y4);

            plot(g, x, y, 1);
        }
    }

    public void bezierCurve(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3) {
        for (int i = 0; i <= 1000; i++) {
            double t = i / 1000.0;
            int x = (int) (Math.pow(1 - t, 2) * x1 +
                    2 * t * Math.pow(1 - t, 1) * x2 +
                    t * t * x3);

            int y = (int) (Math.pow(1 - t, 2) * y1 +
                    2 * t * Math.pow(1 - t, 1) * y2 +
                    t * t * y3);

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