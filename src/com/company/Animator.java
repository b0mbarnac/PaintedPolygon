package com.company;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Animator {

    private Graphics graphics;
    private Graphics screenGraphics;
    private BufferedImage img;

    public Animator(Graphics g){
        screenGraphics = g;
        img = new BufferedImage(BufferedImage.TYPE_3BYTE_BGR,750,1200);
    }

}
