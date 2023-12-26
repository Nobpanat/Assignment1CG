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

        // Design System Color
        Color darkBlueEage = new Color(58, 1, 118);
        Color darkBlueInEye = new Color(58, 1, 118);
        Color lightBlueInEye = new Color(88, 40, 139);
        Color regInDragon = new Color(255, 62, 96);
        Color redShadowInDragon = new Color(195, 43, 102);
        Color yellowInheadDragon = new Color(255, 209, 165);
        Color lightShadowInDragon = new Color(255, 198, 207);
        Color wingShadow = new Color(195, 146, 149);
        Color wingandfat = new Color(254, 209, 165);
        Color fireout = new Color(243, 56, 47);
        Color firein = new Color(255, 209, 95);
        Color redShade1 = new Color(230, 34, 103);
        Color redShade2 = new Color(236, 56, 150);
        Color redShade3 = new Color(235, 64, 150);
        Color redShade4 = new Color(232, 131, 182);
        Color redShade5 = new Color(237, 78, 113);
        Color orangeShade1 = new Color(241, 113, 95);
        Color orangeShade2 = new Color(245, 132, 82);
        Color orangeShade3 = new Color(238, 76, 37);
        Color orangeShade4 = new Color(236, 54, 39);
        Color orangeShade5 = new Color(239, 85, 40);
        Color orangeShade6 = new Color(246, 146, 74);
        Color orangeShade7 = new Color(241, 115, 41);
        Color orangeShade8 = new Color(244, 130, 117);
        Color skyblueShade1 = new Color(62, 88, 165);
        Color pinkShade1 = new Color(145, 90, 163);
        Color pinkShade2 = new Color(205, 124, 178);
        Color skyblueShade2 = new Color(167, 184, 219);
        Color orangeShade9 = new Color(241, 197, 194);
        Color eageLight = new Color(234, 245, 249);
        Color blue1 = new Color(85, 200, 238);
        Color blue2 = new Color(67, 142, 200);
        Color blue3 = new Color(47, 81, 161);
        Color purple1 = new Color(200, 127, 179);
        Color blue4 = new Color(67, 118, 185);
        Color blue5 = new Color(173, 223, 238);
        Color blue6 = new Color(57, 90, 167);
        Color purple2 = new Color(109, 129, 174);

        // branch nite ----------------------------------------------------------------
        g2.setColor(orangeShade9);
        // 2024 เส้นตรง
        // เลข 2
        bresenhamLine(g2, 239, 24, 261, 24);
        bresenhamLine(g2, 261, 24, 257, 29);
        bresenhamLine(g2, 257, 29, 243, 29);
        bresenhamLine(g2, 243, 29, 239, 24);

        bresenhamLine(g2, 259, 30, 262, 26);
        bresenhamLine(g2, 262, 26, 262, 47);
        bresenhamLine(g2, 262, 47, 259, 44);
        bresenhamLine(g2, 259, 44, 259, 30);

        bresenhamLine(g2, 257, 47, 259, 49);
        bresenhamLine(g2, 259, 49, 257, 51);
        bresenhamLine(g2, 257, 51, 243, 51);
        bresenhamLine(g2, 243, 51, 239, 49);
        bresenhamLine(g2, 239, 49, 243, 47);
        bresenhamLine(g2, 243, 47, 257, 47);

        bresenhamLine(g2, 238, 51, 242, 53);
        bresenhamLine(g2, 242, 53, 242, 66);
        bresenhamLine(g2, 242, 66, 238, 71);
        bresenhamLine(g2, 238, 71, 238, 51);

        bresenhamLine(g2, 243, 69, 239, 73);
        bresenhamLine(g2, 239, 73, 261, 73);
        bresenhamLine(g2, 261, 73, 257, 69);
        bresenhamLine(g2, 257, 69, 243, 69);

        // เลข 0
        bresenhamLine(g2, 272, 24, 275, 29);
        bresenhamLine(g2, 275, 29, 288, 29);
        bresenhamLine(g2, 288, 29, 292, 24);
        bresenhamLine(g2, 292, 24, 272, 24);

        bresenhamLine(g2, 289, 31, 294, 26);
        bresenhamLine(g2, 294, 26, 294, 47);
        bresenhamLine(g2, 294, 47, 289, 43);
        bresenhamLine(g2, 289, 43, 289, 31);

        bresenhamLine(g2, 289, 52, 294, 49);
        bresenhamLine(g2, 294, 49, 294, 71);
        bresenhamLine(g2, 294, 71, 289, 67);
        bresenhamLine(g2, 289, 67, 289, 52);

        bresenhamLine(g2, 288, 69, 292, 73);
        bresenhamLine(g2, 292, 73, 271, 73);
        bresenhamLine(g2, 271, 73, 275, 69);
        bresenhamLine(g2, 275, 69, 288, 69);

        bresenhamLine(g2, 270, 49, 274, 53);
        bresenhamLine(g2, 274, 53, 274, 66);
        bresenhamLine(g2, 274, 66, 270, 71);
        bresenhamLine(g2, 270, 71, 270, 49);

        bresenhamLine(g2, 270, 25, 274, 31);
        bresenhamLine(g2, 274, 31, 274, 45);
        bresenhamLine(g2, 274, 45, 270, 47);
        bresenhamLine(g2, 270, 47, 270, 25);

        // เลข2 ตัวที่ 2
        bresenhamLine(g2, 303, 24, 323, 24);
        bresenhamLine(g2, 323, 24, 319, 29);
        bresenhamLine(g2, 319, 29, 306, 29);
        bresenhamLine(g2, 306, 29, 303, 24);

        bresenhamLine(g2, 321, 30, 325, 25);
        bresenhamLine(g2, 325, 25, 325, 47);
        bresenhamLine(g2, 325, 47, 321, 43);
        bresenhamLine(g2, 321, 43, 321, 30);

        bresenhamLine(g2, 320, 47, 323, 49);
        bresenhamLine(g2, 323, 49, 320, 51);
        bresenhamLine(g2, 320, 51, 306, 51);
        bresenhamLine(g2, 306, 51, 303, 49);
        bresenhamLine(g2, 303, 49, 306, 47);
        bresenhamLine(g2, 306, 47, 320, 47);

        bresenhamLine(g2, 301, 51, 305, 53);
        bresenhamLine(g2, 305, 53, 305, 67);
        bresenhamLine(g2, 305, 67, 301, 71);
        bresenhamLine(g2, 301, 71, 301, 51);

        bresenhamLine(g2, 307, 67, 303, 73);
        bresenhamLine(g2, 303, 73, 323, 73);
        bresenhamLine(g2, 323, 73, 321, 67);
        bresenhamLine(g2, 321, 67, 307, 67);

        // เลข 4
        bresenhamLine(g2, 333, 25, 337, 30);
        bresenhamLine(g2, 337, 30, 337, 44);
        bresenhamLine(g2, 337, 44, 333, 47);
        bresenhamLine(g2, 333, 47, 333, 25);

        bresenhamLine(g2, 353, 30, 357, 24);
        bresenhamLine(g2, 357, 24, 357, 47);
        bresenhamLine(g2, 357, 47, 353, 43);
        bresenhamLine(g2, 353, 43, 353, 30);

        bresenhamLine(g2, 337, 47, 335, 49);
        bresenhamLine(g2, 335, 49, 337, 51);
        bresenhamLine(g2, 337, 51, 353, 51);
        bresenhamLine(g2, 353, 51, 355, 49);
        bresenhamLine(g2, 355, 49, 353, 47);
        bresenhamLine(g2, 353, 47, 337, 47);

        bresenhamLine(g2, 353, 53, 357, 50);
        bresenhamLine(g2, 357, 50, 357, 71);
        bresenhamLine(g2, 357, 71, 353, 66);
        bresenhamLine(g2, 353, 66, 353, 53);

        // หัวนอก

        g2.setColor(darkBlueEage);
        setPlotSize(3);

        bezierCurve(g2, 232, 81, 222, 80, 173, 143, 217, 193);
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

        setPlotSize(2);
        // ตาซ้าย
        // ตาซ้ายขอบนอก
        bezierCurve(g2, 220, 239, 218, 200, 253, 211);
        bezierCurve(g2, 253, 211, 281, 214, 281, 261);
        setPlotSize(1);
        bezierCurve(g2, 281, 261, 278, 284, 243, 264);
        bezierCurve(g2, 243, 264, 226, 255, 220, 239);

        setPlotSize(1);
        // ตาซ้ายด้านใน
        // ตาซ้ายกลม
        g2.setColor(darkBlueInEye);
        bezierCurve(g2, 264, 229, 255, 229, 256, 241);
        bezierCurve(g2, 256, 241, 256, 251, 264, 253);
        bezierCurve(g2, 264, 253, 273, 252, 273, 240);
        bezierCurve(g2, 273, 240, 273, 228, 264, 229);

        // ตาซ้ายด้านในโค้ง
        bezierCurve(g2, 220, 236, 221, 221, 232, 210);
        bezierCurve(g2, 232, 213, 253, 211, 250, 219);
        bezierCurve(g2, 250, 216, 237, 217, 235, 240);
        bezierCurve(g2, 235, 240, 257, 246, 241, 258);
        bezierCurve(g2, 241, 258, 242, 264, 244, 265);

        // ตาซ้ายด้านในวงรี
        g2.setColor(lightBlueInEye);
        bezierCurve(g2, 275, 264, 270, 256, 260, 257);
        bezierCurve(g2, 260, 257, 250, 256, 247, 260);
        bezierCurve(g2, 247, 260, 255, 268, 261, 267);
        bezierCurve(g2, 261, 267, 268, 269, 275, 264);

        // ตาขวา
        // ตาขวาขอบนอก
        g2.setColor(darkBlueEage);
        setPlotSize(2);
        bezierCurve(g2, 391, 239, 396, 193, 352, 213);
        bezierCurve(g2, 352, 213, 326, 227, 332, 263);
        setPlotSize(1);
        bezierCurve(g2, 332, 263, 334, 278, 356, 271);
        bezierCurve(g2, 356, 271, 389, 256, 391, 239);

        // ตาขวาด้านใน
        // ตาขวากลม
        g2.setColor(darkBlueEage);
        bezierCurve(g2, 347, 228, 337, 230, 339, 243);
        bezierCurve(g2, 339, 243, 340, 252, 347, 253);
        bezierCurve(g2, 347, 253, 356, 251, 356, 241);
        bezierCurve(g2, 356, 241, 356, 229, 347, 228);

        // ตาขวาโค้งด้านใน
        bezierCurve(g2, 391, 236, 392, 233, 387, 221);
        bezierCurve(g2, 387, 221, 376, 206, 359, 215);
        bezierCurve(g2, 359, 215, 377, 218, 377, 240);
        bezierCurve(g2, 377, 240, 365, 241, 365, 251);
        bezierCurve(g2, 365, 251, 368, 259, 371, 259);
        bezierCurve(g2, 371, 259, 373, 256, 369, 264);

        // ตาขวาด้านในวงรี
        setPlotSize(1);
        g2.setColor(lightBlueInEye);
        bezierCurve(g2, 336, 263, 340, 256, 348, 256);
        bezierCurve(g2, 348, 256, 360, 255, 366, 260);
        bezierCurve(g2, 366, 260, 357, 269, 350, 267);
        bezierCurve(g2, 350, 267, 340, 268, 336, 263);
        setPlotSize(1);

        // จมูก
        // bezierCurve(g2, 284, 275, 296, 266, 306, 267);
        // bezierCurve(g2, 306, 267, 322, 268, 327, 274);
        // bezierCurve(g2, 327, 274, 308, 270, 306, 271);
        // bezierCurve(g2, 306, 271, 285, 273, 284, 275);
        bezierCurve(g2, 328, 277, 309, 267, 283, 277);
        bezierCurve(g2, 283, 277, 281, 270, 306, 264);
        bezierCurve(g2, 306, 264, 327, 268, 329, 277);
        bresenhamLine(g2, 329, 277, 328, 277);

        // จมูกซ้าย
        bezierCurve(g2, 292, 279, 298, 281, 297, 284);
        bezierCurve(g2, 297, 284, 298, 285, 300, 284);
        bezierCurve(g2, 300, 284, 300, 276, 292, 279);

        // จมูกขวา
        bezierCurve(g2, 313, 284, 311, 279, 320, 278);
        bezierCurve(g2, 320, 278, 316, 280, 317, 284);
        bezierCurve(g2, 317, 284, 317, 286, 314, 285);
        bresenhamLine(g2, 314, 285, 313, 284);

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
        g2.setColor(regInDragon);

        bezierCurve(g2, 200, 213, 202, 234, 215, 248);
        bezierCurve(g2, 215, 248, 203, 245, 205, 247);

        bezierCurve(g2, 194, 252, 211, 268, 218, 268);
        bezierCurve(g2, 218, 268, 242, 304, 289, 307);

        bezierCurve(g2, 323, 307, 371, 305, 396, 268);
        bezierCurve(g2, 396, 268, 420, 262, 420, 253);

        bezierCurve(g2, 411, 246, 400, 248, 400, 246);
        bezierCurve(g2, 400, 246, 414, 233, 413, 215);

        bezierCurve(g2, 395, 191, 385, 174, 386, 170);
        bezierCurve(g2, 386, 170, 415, 148, 393, 89);

        bezierCurve(g2, 223, 90, 197, 146, 231, 170);
        bresenhamLine(g2, 231, 170, 217, 193);

        // หน้าด้านใน สีขาว ซ้าย
        g2.setColor(lightShadowInDragon);
        bezierCurve(g2, 232, 85, 226, 115, 257, 131);

        bezierCurve(g2, 303, 133, 262, 137, 248, 151);
        bezierCurve(g2, 248, 151, 291, 136, 299, 138);
        bresenhamLine(g2, 299, 138, 303, 133);

        // เขามังกรสีแหลือง ซ้าย
        g2.setColor(yellowInheadDragon);
        bezierCurve(g2, 269, 118, 261, 129, 263, 134);
        bresenhamLine(g2, 263, 134, 273, 131);
        bezierCurve(g2, 273, 131, 267, 117, 269, 118);

        // เขามังกรสีเหลือง ขวา
        bezierCurve(g2, 345, 117, 354, 131, 352, 135);
        bresenhamLine(g2, 352, 135, 342, 130);
        bezierCurve(g2, 342, 130, 345, 122, 345, 117);

        // หน้าด้านในสีขาว ขวา
        g2.setColor(lightShadowInDragon);
        bezierCurve(g2, 313, 133, 351, 136, 368, 152);

        bezierCurve(g2, 368, 152, 321, 134, 316, 139);
        bresenhamLine(g2, 316, 139, 313, 133);

        bezierCurve(g2, 359, 130, 385, 120, 383, 85);

        // M branch-----------------------

        g2.setColor(darkBlueEage);
        setPlotSize(3);

        // Right Wing
        bezierCurve(g2, 359, 313, 397, 315, 411, 298);
        bezierCurve(g2, 411, 298, 390, 275, 438, 294);
        bezierCurve(g2, 438, 294, 473, 326, 472, 344);
        bezierCurve(g2, 472, 344, 439, 307, 425, 312);
        // bezierCurve(g2, 425, 312, 397, 334, 364, 323);
        bresenhamLine(g2, 364, 323, 359, 313);
        bezierCurve(g2, 425, 312, 397, 334, 364, 323);
        bezierCurve(g2, 364, 323, 361, 327, 384, 357);
        bezierCurve(g2, 384, 357, 394, 352, 403, 367);
        bresenhamLine(g2, 403, 367, 428, 311);
        bezierCurve(g2, 428, 311, 446, 349, 445, 371);
        bezierCurve(g2, 445, 371, 436, 361, 401, 366);
        bezierCurve(g2, 445, 371, 448, 349, 473, 343);

        g2.setColor(wingShadow);
        setPlotSize(1);

        // bezierCurve(g2, 455, 327, 442, 327, 440, 341);
        // bezierCurve(g2, 440, 341, 426, 326, 416, 344);
        // bezierCurve(g2, 416, 344, 412, 332, 386, 333);
        // bezierCurve(g2, 386, 333, 366, 329, 363, 326);

        bezierCurve(g2, 370, 332, 416, 331, 410, 347);
        bezierCurve(g2, 440, 345, 424, 326, 418, 343);
        bezierCurve(g2, 442, 343, 447, 329, 457, 332);

        g2.setColor(darkBlueEage);
        setPlotSize(3);
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

        g2.setColor(wingandfat);
        setPlotSize(1);
        bezierCurve(g2, 437, 506, 462, 478, 394, 443);

        g2.setColor(darkBlueEage);
        setPlotSize(3);

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

        g2.setColor(redShadowInDragon);
        setPlotSize(1);

        bezierCurve(g2, 354, 461, 346, 462, 349, 438);
        bresenhamLine(g2, 349, 438, 342, 442);
        bezierCurve(g2, 338, 444, 309, 458, 275, 444);
        bezierCurve(g2, 259, 461, 265, 462, 264, 438);
        bresenhamLine(g2, 264, 438, 274, 441);

        g2.setColor(darkBlueEage);
        setPlotSize(3);

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
        g2.setColor(wingShadow);
        setPlotSize(1);

        bezierCurve(g2, 245, 331, 195, 334, 201, 346);
        bezierCurve(g2, 195, 344, 193, 323, 174, 344);
        bezierCurve(g2, 171, 340, 172, 325, 158, 331);

        g2.setColor(darkBlueEage);
        setPlotSize(3);
        // Fire
        bezierCurve(g2, 305, 318, 303, 363, 293, 358);
        bezierCurve(g2, 293, 358, 288, 358, 287, 349);
        bezierCurve(g2, 287, 349, 277, 362, 287, 385);
        bezierCurve(g2, 287, 385, 304, 406, 323, 388);
        bezierCurve(g2, 323, 388, 333, 373, 326, 350);
        bezierCurve(g2, 326, 350, 319, 368, 311, 348);
        bezierCurve(g2, 311, 348, 308, 346, 306, 317);
        bresenhamLine(g2, 306, 317, 305, 320);

        g2.setColor(firein);
        setPlotSize(1);
        bezierCurve(g2, 305, 356, 303, 376, 295, 368);
        bezierCurve(g2, 295, 368, 292, 392, 309, 387);
        bezierCurve(g2, 309, 387, 320, 383, 316, 368);
        bezierCurve(g2, 316, 368, 310, 375, 306, 358);
        bresenhamLine(g2, 306, 358, 305, 356);

        g2.setColor(darkBlueEage);
        setPlotSize(3);

        // Fat
        g2.setColor(wingandfat);
        setPlotSize(1);
        bezierCurve(g2, 353, 356, 341, 320, 340, 320);
        bezierCurve(g2, 273, 320, 260, 355, 261, 357);
        bezierCurve(g2, 260, 415, 266, 440, 301, 442);
        bezierCurve(g2, 301, 442, 341, 447, 355, 415);

        g2.setColor(darkBlueEage);
        setPlotSize(3);

        // Right Hand
        bezierCurve(g2, 374, 411, 324, 424, 332, 387);
        bezierCurve(g2, 332, 387, 340, 346, 364, 362);
        bezierCurve(g2, 364, 362, 379, 372, 382, 380);

        g2.setColor(redShadowInDragon);
        setPlotSize(1);

        bezierCurve(g2, 394, 387, 384, 414, 343, 392);

        g2.setColor(darkBlueEage);
        setPlotSize(3);

        bezierCurve(g2, 343, 392, 331, 394, 330, 392);
        bezierCurve(g2, 374, 411, 324, 424, 332, 387);
        bezierCurve(g2, 332, 387, 340, 346, 364, 362);
        bezierCurve(g2, 395, 402, 383, 411, 372, 411);

        // Left Hand
        g2.setColor(redShadowInDragon);
        setPlotSize(1);
        bezierCurve(g2, 222, 386, 226, 415, 274, 392);

        g2.setColor(darkBlueEage);
        setPlotSize(3);

        bezierCurve(g2, 231, 380, 260, 336, 276, 371);
        bezierCurve(g2, 276, 371, 293, 407, 267, 414);
        bezierCurve(g2, 267, 414, 243, 415, 239, 411);
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
        bezierCurve(g2, 229, 469, 231, 446, 214, 456);
        bresenhamLine(g2, 218, 456, 215, 459);

        // background --------------------------------------
        setPlotSize(1);
        // หลายเหลี่ยมชิดตัวซ้ายบนมังกร
        g2.setColor(redShade2);
        bresenhamLine(g2, 43, 186, 150, 0);
        bresenhamLine(g2, 150, 0, 176, 0);
        g2.setColor(pinkShade1);
        bresenhamLine(g2, 176, 0, 216, 99);
        // g2.setColor(redShade2);
        bresenhamLine(g2, 43, 186, 196, 252);

        // หลายเหลี่ยมชิดตัวบนหัวมังกร
        g2.setColor(skyblueShade1);
        bresenhamLine(g2, 177, 0, 398, 0);
        bresenhamLine(g2, 398, 0, 357, 122);

        // หลายเหลี่ยมชิดตัวขวาบนมังกร
        bresenhamLine(g2, 399, 0, 427, 0);
        bresenhamLine(g2, 427, 0, 542, 182);
        bresenhamLine(g2, 542, 182, 417, 235);

        // หลายเหลี่นมชิดตัวปีกขวามังกร
        bresenhamLine(g2, 541, 183, 464, 323);
        bresenhamLine(g2, 438, 368, 417, 402);
        bresenhamLine(g2, 417, 402, 391, 379);

        // หลายเหลี่ยมชิดตัวด้านหลังมังกร
        g2.setColor(skyblueShade2);
        bresenhamLine(g2, 418, 402, 397, 402);
        bresenhamLine(g2, 218, 403, 164, 403);
        bresenhamLine(g2, 164, 403, 205, 366);

        // หลายเหลี่ยมชิดตัวขามังกร
        g2.setColor(orangeShade9);
        bresenhamLine(g2, 164, 405, 220, 446);
        bresenhamLine(g2, 253, 470, 292, 498);
        bresenhamLine(g2, 292, 498, 338, 462);
        bresenhamLine(g2, 405, 413, 416, 402);

        // หลายเหลี่ยมชิดตัวเท้าขวากับหางมังกร
        g2.setColor(purple1);
        bresenhamLine(g2, 290, 498, 507, 600);
        g2.setColor(orangeShade9);
        //bresenhamLine(g2, 507, 600, 536, 600);
        g2.setColor(blue5);
        //bresenhamLine(g2, 536, 600, 417, 402);

        // หลายเหลี่ยมชิดตัวเท้าซ้ายมังกร
        g2.setColor(orangeShade5);
        bresenhamLine(g2, 165, 405, 51, 600);
        bresenhamLine(g2, 51, 600, 78, 600);
        bresenhamLine(g2, 78, 600, 292, 498);

        // หลายเหลี่ยมชิดตัวปีกซ้ายมังกร
        bresenhamLine(g2, 165, 405, 42, 187);

        // หลายเหลี่ยมชิดตัวปีกขวามังกร
        g2.setColor(blue4);
       bresenhamLine(g2, 417, 402, 600, 474);

        // polygon สามเหลี่ยม

        // สามเหลี่ยม1
        setPlotSize(1);
        g2.setColor(redShade1);
        createTrianglePolygon(g2, 0, 0, 103, 0, 0, 47);

        // สามเหลี่ยม2
        // g2.setColor
        // createTrianglePolygon(g2, 103, 0, 0, 48, 150, 0);

        // สามเหลี่ยม3
        // createTrianglePolygon(g2, 0, 47, 151, 0, 43, 185);

        // สามเหลี่ยม4
        // createTrianglePolygon(g2, 0, 47, 42, 186, 0, 148);

        // สามเหลี่ยม5
        g2.setColor(redShade3);
        createTrianglePolygon(g2, 0, 148, 42, 186, 0, 186);

        // สามเหลี่ยม6
        g2.setColor(orangeShade1);
        createTrianglePolygon(g2, 43, 187, 0, 187, 0, 227);

        // สามเหลี่ยม7
        g2.setColor(orangeShade2);
        createTrianglePolygon(g2, 43, 187, 0, 226, 0, 330);

        // สามเหลี่ยม8
        g2.setColor(orangeShade4);
        createTrianglePolygon(g2, 42, 187, 0, 332, 164, 405);

        // สามเหลี่ยม9
        // createTrianglePolygon(g2, 0, 331, 165, 405, 0, 506);

        // สามเหลี่ยม10
        g2.setColor(orangeShade5);
        createTrianglePolygon(g2, 167, 403, 0, 506, 50, 600);

        // สามเหลี่ยม11
        g2.setColor(orangeShade8);
        createTrianglePolygon(g2, 78, 600, 236, 600, 292, 498);
        
        // สามเหลี่ยม12
        g2.setColor(blue1);
        setPlotSize(1);
       
        createTrianglePolygon(g2, 541, 181, 428, 0, 600, 0);
        

        // สามเหลี่ยม13
        g2.setColor(blue2);
        setPlotSize(1);
        createTrianglePolygon(g2, 541, 181, 600, 320, 600, 181);


        //Right triangle
        buffer = floodFill(buffer, 484, 10, Color.WHITE, blue1);
        buffer = floodFill(buffer, 579, 210, Color.WHITE, blue2);
        buffer = floodFill(buffer, 578, 146, Color.WHITE, blue3);
        buffer = floodFill(buffer, 532, 348, Color.WHITE, blue1);
        buffer = floodFill(buffer, 388, 583, Color.WHITE, purple1);
        buffer = floodFill(buffer, 462, 535, Color.WHITE, blue4);
        buffer = floodFill(buffer, 530, 535, Color.WHITE, blue5);
        buffer = floodFill(buffer, 455, 250, Color.WHITE, blue6);
        buffer = floodFill(buffer, 415, 382, Color.WHITE, purple2);
        buffer = floodFill(buffer, 423, 70, Color.WHITE, orangeShade1);

        // ลงสี
        // ลงสีหน้ามังกร
        buffer = floodFill(buffer, 259, 181, Color.WHITE, regInDragon);

        // ลงสีตาซ้ายด้านในโค้งสีน้ำเงินเข้ม
        buffer = floodFill(buffer, 250, 226, Color.WHITE, darkBlueInEye);

        // ลงสีตาซ้ายด้านในวงรี
        buffer = floodFill(buffer, 257, 260, Color.WHITE, lightBlueInEye);

        // ลงสีตาขวาด้านในโค้งสีน้ำเงินเข้ม
        buffer = floodFill(buffer, 360, 228, Color.WHITE, darkBlueInEye);

        // ลงสีตาซ้ายด้านในวงรี
        buffer = floodFill(buffer, 349, 260, Color.WHITE, lightBlueInEye);

        // ลงสีเหลืองบนหน้ามังกร
        // ลงสีเขามังกร
        buffer = floodFill(buffer, 266, 126, Color.WHITE, yellowInheadDragon);
        buffer = floodFill(buffer, 346, 127, Color.WHITE, yellowInheadDragon);

        // ลงสีหน้าผากมังกร
        buffer = floodFill(buffer, 305, 145, Color.WHITE, yellowInheadDragon);
        buffer = floodFill(buffer, 307, 182, Color.WHITE, yellowInheadDragon);
        buffer = floodFill(buffer, 307, 218, Color.WHITE, yellowInheadDragon);

        // ลงสีขอบเขามังกร
        buffer = floodFill(buffer, 267, 136, Color.WHITE, darkBlueEage);
        buffer = floodFill(buffer, 344, 134, Color.WHITE, darkBlueEage);

        // ลงสีเงาขอบหน้ามังกร
        buffer = floodFill(buffer, 207, 148, Color.WHITE, redShadowInDragon);
        buffer = floodFill(buffer, 197, 224, Color.WHITE, redShadowInDragon);
        buffer = floodFill(buffer, 236, 292, Color.WHITE, redShadowInDragon);
        buffer = floodFill(buffer, 334, 312, Color.WHITE, redShadowInDragon);
        buffer = floodFill(buffer, 416, 224, Color.WHITE, redShadowInDragon);
        buffer = floodFill(buffer, 405, 153, Color.WHITE, redShadowInDragon);

        // ลงสีเงาสว่างที่หัวมังกร
        buffer = floodFill(buffer, 242, 115, Color.WHITE, lightShadowInDragon);
        buffer = floodFill(buffer, 286, 137, Color.WHITE, lightShadowInDragon);
        buffer = floodFill(buffer, 328, 137, Color.WHITE, lightShadowInDragon);
        buffer = floodFill(buffer, 369, 116, Color.WHITE, lightShadowInDragon);

        // ลงสีจมูกและปาก
        buffer = floodFill(buffer, 306, 269, Color.WHITE, darkBlueEage);
        buffer = floodFill(buffer, 298, 281, Color.WHITE, darkBlueEage);
        buffer = floodFill(buffer, 314, 281, Color.WHITE, darkBlueEage);
        buffer = floodFill(buffer, 310, 299, Color.WHITE, darkBlueEage);
        buffer = floodFill(buffer, 305, 307, Color.WHITE, regInDragon);

        // Wing Right
        buffer = floodFill(buffer, 411, 330, Color.WHITE, wingShadow);
        buffer = floodFill(buffer, 428, 330, Color.WHITE, wingShadow);
        buffer = floodFill(buffer, 441, 326, Color.WHITE, wingShadow);
        buffer = floodFill(buffer, 425, 345, Color.WHITE, wingandfat);
        buffer = floodFill(buffer, 401, 345, Color.WHITE, wingandfat);
        buffer = floodFill(buffer, 451, 345, Color.WHITE, wingandfat);
        buffer = floodFill(buffer, 417, 300, Color.WHITE, regInDragon);

        // Wing Left
        buffer = floodFill(buffer, 172, 325, Color.WHITE, wingShadow);
        buffer = floodFill(buffer, 186, 325, Color.WHITE, wingShadow);
        buffer = floodFill(buffer, 207, 325, Color.WHITE, wingShadow);
        buffer = floodFill(buffer, 158, 345, Color.WHITE, wingandfat);
        buffer = floodFill(buffer, 186, 345, Color.WHITE, wingandfat);
        buffer = floodFill(buffer, 207, 345, Color.WHITE, wingandfat);
        buffer = floodFill(buffer, 183, 300, Color.WHITE, regInDragon);

        // body
        buffer = floodFill(buffer, 248, 382, Color.WHITE, regInDragon);
        buffer = floodFill(buffer, 245, 425, Color.WHITE, regInDragon);
        buffer = floodFill(buffer, 355, 335, Color.WHITE, regInDragon);

        // Shadow in body
        buffer = floodFill(buffer, 250, 404, Color.WHITE, redShadowInDragon);
        buffer = floodFill(buffer, 350, 404, Color.WHITE, redShadowInDragon);
        buffer = floodFill(buffer, 267, 452, Color.WHITE, redShadowInDragon);
        buffer = floodFill(buffer, 282, 452, Color.WHITE, redShadowInDragon);
        buffer = floodFill(buffer, 344, 452, Color.WHITE, redShadowInDragon);

        // fat
        buffer = floodFill(buffer, 300, 410, Color.WHITE, wingandfat);

        // nail Left
        buffer = floodFill(buffer, 263, 364, Color.WHITE, wingandfat);
        buffer = floodFill(buffer, 270, 374, Color.WHITE, wingandfat);
        buffer = floodFill(buffer, 275, 387, Color.WHITE, wingandfat);
        buffer = floodFill(buffer, 235, 459, Color.WHITE, wingandfat);
        buffer = floodFill(buffer, 223, 458, Color.WHITE, wingandfat);
        buffer = floodFill(buffer, 252, 460, Color.WHITE, wingandfat);

        // nail Right
        buffer = floodFill(buffer, 351, 364, Color.WHITE, wingandfat);
        buffer = floodFill(buffer, 341, 374, Color.WHITE, wingandfat);
        buffer = floodFill(buffer, 336, 385, Color.WHITE, wingandfat);
        buffer = floodFill(buffer, 360, 460, Color.WHITE, wingandfat);
        buffer = floodFill(buffer, 375, 460, Color.WHITE, wingandfat);
        buffer = floodFill(buffer, 388, 460, Color.WHITE, wingandfat);

        // tail
        buffer = floodFill(buffer, 410, 440, Color.WHITE, regInDragon);
        buffer = floodFill(buffer, 410, 460, Color.WHITE, wingandfat);
        buffer = floodFill(buffer, 418, 420, Color.WHITE, wingandfat);
        buffer = floodFill(buffer, 443, 456, Color.WHITE, wingandfat);

        // Fire
        buffer = floodFill(buffer, 320, 365, Color.WHITE, fireout);
        buffer = floodFill(buffer, 305, 372, Color.WHITE, firein);
        buffer = floodFill(buffer, 298, 281, Color.WHITE, darkBlueEage);
        buffer = floodFill(buffer, 314, 281, Color.WHITE, darkBlueEage);
        buffer = floodFill(buffer, 310, 299, Color.WHITE, darkBlueEage);
        buffer = floodFill(buffer, 305, 307, Color.WHITE, regInDragon);

        // ลงสี polygon
        // ลงสีbackground บนซ้าย
        buffer = floodFill(buffer, 20, 11, Color.WHITE, redShade1);
        buffer = floodFill(buffer, 98, 8, Color.WHITE, redShade2);
        buffer = floodFill(buffer, 7, 104, Color.WHITE, redShade3);
        buffer = floodFill(buffer, 83, 85, Color.WHITE, redShade4);
        buffer = floodFill(buffer, 14, 173, Color.WHITE, redShade5);

        // orange
        buffer = floodFill(buffer, 15, 200, Color.WHITE, orangeShade1);
        buffer = floodFill(buffer, 9, 256, Color.WHITE, orangeShade2);
        buffer = floodFill(buffer, 67, 292, Color.WHITE, orangeShade3);
        buffer = floodFill(buffer, 27, 442, Color.WHITE, orangeShade4);
        buffer = floodFill(buffer, 72, 507, Color.WHITE, orangeShade5);
        buffer = floodFill(buffer, 12, 576, Color.WHITE, orangeShade6);
        buffer = floodFill(buffer, 110, 548, Color.WHITE, orangeShade7);
        buffer = floodFill(buffer, 189, 580, Color.WHITE, orangeShade8);

        // backgroundหัวและข้างลำตัว
        buffer = floodFill(buffer, 218, 18, Color.WHITE, skyblueShade1);
        buffer = floodFill(buffer, 157, 103, Color.WHITE, pinkShade1);
        buffer = floodFill(buffer, 139, 282, Color.WHITE, pinkShade2);
        buffer = floodFill(buffer, 204, 382, Color.WHITE, skyblueShade2);
        buffer = floodFill(buffer, 400, 395, Color.WHITE, skyblueShade2);
        buffer = floodFill(buffer, 204, 417, Color.WHITE, orangeShade9);
        buffer = floodFill(buffer, 291, 471, Color.WHITE, orangeShade9);
        buffer = floodFill(buffer, 405, 404, Color.WHITE, orangeShade9);

        // ลงสี2024
        // ลงสี2
        buffer = floodFill(buffer, 250, 26, Color.WHITE, orangeShade9);
        buffer = floodFill(buffer, 260, 36, Color.WHITE, orangeShade9);
        buffer = floodFill(buffer, 249, 48, Color.WHITE, orangeShade9);
        buffer = floodFill(buffer, 240, 59, Color.WHITE, orangeShade9);
        buffer = floodFill(buffer, 249, 70, Color.WHITE, orangeShade9);

        // ลงสี0
        buffer = floodFill(buffer, 281, 26, Color.WHITE, orangeShade9);
        buffer = floodFill(buffer, 291, 37, Color.WHITE, orangeShade9);
        buffer = floodFill(buffer, 291, 59, Color.WHITE, orangeShade9);
        buffer = floodFill(buffer, 281, 70, Color.WHITE, orangeShade9);
        buffer = floodFill(buffer, 271, 59, Color.WHITE, orangeShade9);
        buffer = floodFill(buffer, 271, 37, Color.WHITE, orangeShade9);

        // ลงสี2
        buffer = floodFill(buffer, 313, 26, Color.WHITE, orangeShade9);
        buffer = floodFill(buffer, 322, 36, Color.WHITE, orangeShade9);
        buffer = floodFill(buffer, 313, 48, Color.WHITE, orangeShade9);
        buffer = floodFill(buffer, 302, 60, Color.WHITE, orangeShade9);
        buffer = floodFill(buffer, 312, 70, Color.WHITE, orangeShade9);

        // ลงสี4
        buffer = floodFill(buffer, 334, 36, Color.WHITE, orangeShade9);
        buffer = floodFill(buffer, 344, 48, Color.WHITE, orangeShade9);
        buffer = floodFill(buffer, 354, 35, Color.WHITE, orangeShade9);
        buffer = floodFill(buffer, 354, 59, Color.WHITE, orangeShade9);

        g.drawImage(buffer, 0, 0, null);

    }

    private int plotSize = 1;

    private void setPlotSize(int size) {
        plotSize = size;
    }

    private int getPlotSize() {
        return plotSize;
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
            plot(g, x, y, getPlotSize());
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

            plot(g, x, y, getPlotSize());
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

            plot(g, xt, yt, getPlotSize());
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

    private void createTrianglePolygon(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3) {
        Polygon poly = new Polygon();
        poly.addPoint(x1, y1);
        poly.addPoint(x2, y2);
        poly.addPoint(x3, y3);

        g.drawPolygon(poly);

    }

}