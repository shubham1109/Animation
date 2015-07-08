package com.company;

import javax.swing.*;

/**
 * Created by Shubham on 08/07/2015.
 */
public class Demo {
    public static void main(String[] args){
        new Demo();
    }
    public Demo(){
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(300, 300);
        JPanel mainPanel = new JPanel();
        window.setContentPane(mainPanel);

        Animation a = new Animation();
        mainPanel.add(a);

        window.setVisible(true);

        for(int i = 0;) {



    }
}}

