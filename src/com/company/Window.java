package com.company;

import javax.swing.*;

public class Window extends JFrame {

    public Window(){
        this.setBounds(100,100,1200,800);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        JPanel panel = new JPanel();
        panel.setBounds();
        this.add(panel);
    }
}
