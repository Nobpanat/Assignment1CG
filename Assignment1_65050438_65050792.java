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
        // branch nite ----------------------------------------------------------------
        // หัวนอก
        g2.setColor(Color.BLACK);

        bezierCurve(g2, 231, 81, 169, 133, 217, 193);
        bezierCurve(g2, 217, 193, 212, 211, 214, 212);
        bezierCurve(g2, 214, 212, 194, 211, 195, 213);
        bezierCurve(g2, 195, 213, 189, 217, 190, 219);
        bezierCurve(g2, 190, 219, 196, 239, 203, 246);
        bezierCurve(g2, 203, 246, 188, 252, 190, 258);
        bezierCurve(g2, 190, 258, 194, 275, 215, 281);
        bezierCurve(g2, 215, 281, 246, 312, 259, 313);
        bezierCurve(g2, 259, 313, 295, 324, 305, 323);
        bezierCurve(g2, 305, 323, 357, 318, 364, 310);
        bezierCurve(g2, 364, 310, 394, 290, 397, 282);
        bezierCurve(g2, 397, 282, 430, 266, 425, 256);
        bezierCurve(g2, 425, 256, 420, 246, 411, 247);
        bezierCurve(g2, 411, 247, 428, 220, 423, 216);
        bezierCurve(g2, 423, 216, 421, 210, 402, 214);
        bezierCurve(g2, 402, 214, 400, 194, 396, 193);
        bezierCurve(g2, 396, 193, 421, 162, 415, 142);
        bezierCurve(g2, 415, 142, 409, 90, 383, 81);
        bezierCurve(g2, 383, 81, 362, 128, 355, 122);
        bezierCurve(g2, 355, 122, 346, 110, 343, 110);
        bezierCurve(g2, 343, 110, 335, 136, 330, 133);
        bezierCurve(g2, 330, 133, 301, 128, 282, 133);
        bezierCurve(g2, 282, 133, 275, 125, 271, 110);
        bezierCurve(g2, 271, 110, 261, 117, 259, 122);
        bezierCurve(g2, 259, 122, 242, 111, 231, 81);
        bezierCurve(g2, 355, 122, 360, 142, 356, 142);
        bezierCurve(g2, 260, 122, 255, 139, 257, 142);

        // หัวด้านใน 3 วงที่หน้า
        bezierCurve(g2, 307, 131, 297, 138, 298, 146);
        bezierCurve(g2, 298, 146, 298, 154, 306, 158);
        bezierCurve(g2, 306, 158, 316, 155, 317, 146);
        bezierCurve(g2, 317, 146, 317, 137, 307, 131);

        bezierCurve(g2, 307, 167, 296, 172, 296, 184);
        bezierCurve(g2, 296, 184, 296, 192, 306, 197);
        bezierCurve(g2, 306, 197, 316, 195, 318, 184);
        bezierCurve(g2, 318, 184, 320, 173, 307, 167);

        bezierCurve(g2, 307, 210, 299, 214, 300, 220);
        bezierCurve(g2, 300, 220, 301, 229, 307, 229);
        bezierCurve(g2, 307, 229, 316, 225, 314, 220);
        bezierCurve(g2, 314, 220, 313, 212, 307, 210);

        // ตา ซ้าย
        bezierCurve(g2, 220, 239, 218, 200, 253, 211);
        bezierCurve(g2, 253, 211, 281, 214, 281, 261);
        bezierCurve(g2, 281, 261, 278, 284, 243, 264);
        bezierCurve(g2, 243, 264, 226, 255, 220, 239);
        // ตาด้านใน ซ้าย
        bezierCurve(g2, 264, 229, 255, 229, 256, 241);
        bezierCurve(g2, 256, 241, 256, 251, 264, 253);
        bezierCurve(g2, 264, 253, 273, 252, 273, 240);
        bezierCurve(g2, 273, 240, 273, 228, 264, 229);

        bezierCurve(g2, 220, 236, 221, 221, 232, 213);
        bezierCurve(g2, 232, 213, 253, 211, 250, 216);
        bezierCurve(g2, 250, 216, 237, 217, 235, 240);
        bezierCurve(g2, 235, 240, 257, 246, 241, 258);
        bezierCurve(g2, 241, 258, 242, 264, 244, 265);

        bezierCurve(g2, 277, 263, 273, 249, 248, 256);
        bezierCurve(g2, 248, 256, 239, 261, 250, 265);
        bezierCurve(g2, 250, 265, 258, 269, 267, 268);
        bezierCurve(g2, 267, 268, 275, 267, 277, 263);
        // ตาขวา
        bezierCurve(g2, 391, 239, 396, 193, 352, 213);
        bezierCurve(g2, 352, 213, 326, 227, 332, 263);
        bezierCurve(g2, 332, 263, 334, 278, 356, 271);
        bezierCurve(g2, 356, 271, 389, 256, 391, 239);

        // ตาด้านในขวา
        bezierCurve(g2, 347, 228, 337, 230, 339, 243);
        bezierCurve(g2, 339, 243, 340, 252, 347, 253);
        bezierCurve(g2, 347, 253, 356, 251, 356, 241);
        bezierCurve(g2, 356, 241, 356, 229, 347, 228);

        bezierCurve(g2, 391, 236, 392, 233, 387, 221);
        bezierCurve(g2, 387, 221, 376, 206, 359, 215);
        bezierCurve(g2, 359, 215, 377, 218, 377, 240);
        bezierCurve(g2, 377, 240, 365, 241, 365, 251);
        bezierCurve(g2, 365, 251, 368, 259, 371, 259);
        bezierCurve(g2, 371, 259, 373, 256, 369, 264);

        bezierCurve(g2, 351, 254, 337, 254, 334, 264);
        bezierCurve(g2, 334, 264, 340, 271, 350, 268);
        bezierCurve(g2, 350, 268, 364, 267, 367, 259);
        bezierCurve(g2, 367, 259, 366, 254, 351, 254);

        // จมูก
        bezierCurve(g2, 284, 275, 296, 266, 306, 267);
        bezierCurve(g2, 306, 267, 322, 268, 327, 274);
        bezierCurve(g2, 327, 274, 308, 270, 306, 271);
        bezierCurve(g2, 306, 271, 285, 273, 284, 275);

        // จมูกซ้าย
        bezierCurve(g2, 292, 279, 298, 281, 297, 284);
        bezierCurve(g2, 297, 284, 298, 285, 300, 284);
        bezierCurve(g2, 300, 284, 300, 276, 292, 279);

        // จมูกขวา
        bezierCurve(g2, 313, 284, 312, 277, 320, 278);
        bezierCurve(g2, 320, 278, 314, 282, 316, 284);
        bezierCurve(g2, 316, 284, 315, 284, 313, 284);

        // ปาก
        bezierCurve(g2, 290, 292, 311, 296, 323, 292);
        bezierCurve(g2, 323, 292, 332, 297, 321, 310);
        bezierCurve(g2, 321, 310, 305, 322, 291, 310);
        bezierCurve(g2, 291, 310, 280, 297, 290, 292);

        // ปาก ด้านใน
        bezierCurve(g2, 298, 309, 302, 303, 306, 304);
        bezierCurve(g2, 306, 304, 312, 303, 313, 309);
        bezierCurve(g2, 313, 309, 307, 312, 306, 311);
        bezierCurve(g2, 306, 311, 303, 311, 298, 309);

        // ขอบหน้า แดงเข้ม
        bezierCurve(g2, 200, 212, 202, 234, 215, 248);
        bezierCurve(g2, 215, 248, 203, 245, 203, 247);

        bezierCurve(g2, 191, 252, 211, 268, 218, 268);
        bezierCurve(g2, 218, 268, 242, 304, 289, 307);

        bezierCurve(g2, 323, 307, 371, 305, 396, 268);
        bezierCurve(g2, 396, 268, 420, 262, 420, 250);

        bezierCurve(g2, 411, 246, 400, 248, 400, 246);
        bezierCurve(g2, 400, 246, 414, 233, 413, 211);

        bezierCurve(g2, 398, 193, 385, 174, 386, 170);
        bezierCurve(g2, 386, 170, 415, 148, 393, 89);

        bezierCurve(g2, 216, 193, 229, 173, 229, 170);
        bezierCurve(g2, 229, 170, 199, 152, 221, 88);

        // หน้าด้านใน สีขาว ซ้าย
        bezierCurve(g2, 232, 80, 226, 115, 257, 131);

        bezierCurve(g2, 257, 142, 248, 150, 249, 151);
        bezierCurve(g2, 249, 151, 289, 135, 299, 139);
        bezierCurve(g2, 302, 134, 265, 138, 251, 148);

        // หู สีแหลือง ซ้าย
        bezierCurve(g2, 269, 118, 261, 128, 262, 134);
        bresenhamLine(g2, 262, 134, 274, 131);
        bezierCurve(g2, 274, 131, 269, 124, 269, 118);

        // หู สีเหลือง ขวา
        bezierCurve(g2, 339, 131, 345, 122, 344, 118);
        bezierCurve(g2, 344, 118, 354, 130, 352, 134);
        bresenhamLine(g2, 352, 134, 339, 131);

        // หน้าด้านในสีขาว ขวา
        bezierCurve(g2, 312, 134, 349, 136, 367, 151);
        bezierCurve(g2, 367, 151, 330, 137, 315, 139);

        bezierCurve(g2, 356,130,385, 120 , 382 , 80);

        // M branch-----------------------

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

        bezierCurve(g2, 455, 327, 442, 327, 440, 341);
        bezierCurve(g2, 440, 341, 426, 326, 416, 344);
        bezierCurve(g2, 416, 344, 412, 332, 386, 333);
        bezierCurve(g2, 386, 333, 366, 329, 363, 326);

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

        bezierCurve(g2, 355, 463, 347, 461, 348, 439);
        bezierCurve(g2, 348, 439, 337, 444, 337, 445);
        bezierCurve(g2, 337, 445, 316, 458, 274, 444);
        bezierCurve(g2, 274, 444, 264, 439, 264, 438);
        bezierCurve(g2, 264, 438, 267, 463, 259, 461);

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
        // bresenhamLine(g2, 138, 346, 141, 343);
        // bezierCurve(g2, 255, 314, 306, 336, 361, 312);

        bezierCurve(g2, 252, 324, 241, 332, 221, 333);
        bezierCurve(g2, 221, 333, 206, 330, 198, 345);
        bezierCurve(g2, 198, 345, 185, 320, 173, 347);
        bezierCurve(g2, 173, 347, 175, 325, 158, 328);

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

        bezierCurve(g2, 394, 387, 384, 414, 343, 392);
        bezierCurve(g2, 343, 392, 331, 394, 330, 392);
        bezierCurve(g2, 374, 411, 324, 424, 332, 387);
        bezierCurve(g2, 332, 387, 340, 346, 364, 362);
        bezierCurve(g2, 395, 402, 383, 411, 372, 411);

        // Left Hand
        bezierCurve(g2, 231, 380, 260, 336, 276, 371);
        bezierCurve(g2, 276, 371, 293, 407, 267, 414);
        bezierCurve(g2, 267, 414, 243, 415, 239, 411);
        bezierCurve(g2, 219, 386, 226, 415, 274, 392);

        bezierCurve(g2, 274, 392, 281, 395, 283, 393);
        bezierCurve(g2, 217, 401, 232, 413, 248, 414);

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

            int xt = (int) (Math.pow(1 - t, 2) * x1 +
                    2 * t * Math.pow(1 - t, 1) * x2 +
                    t * t * x3);

            int yt = (int) (Math.pow(1 - t, 2) * y1 +
                    2 * t * Math.pow(1 - t, 1) * y2 +
                    t * t * y3);

            plot(g, xt, yt, 1);
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