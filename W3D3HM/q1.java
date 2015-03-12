/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W3d3hm;

import W3.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author Gude
 */
public class q1 {

    JButton Button1;
    JButton Button2;
    JButton Button3;
    JButton Button4;
    JPanel p;
    JPanel p1;

    private JFrame frame;

    public static void main(String[] args) {
        q1 g = new q1();
        g.go();

    }

    public void go() {
        JFrame f = new JFrame();

        p = new JPanel();
        p1 = new JPanel();
        //Font font = Font.font(SERIF, 20 );
        //  Button1.setFont("Arial" 20);
        Button1 = new JButton("A");
        Font bigFont = new Font("Roman Times", Font.BOLD, 24);
        Button1.setFont(bigFont);
        Button1.setPreferredSize(new Dimension(74, 74));
        Button2 = new JButton("B");
        Button2.setFont(bigFont);
        Button2.setPreferredSize(new Dimension(74, 74));
        p.add(Button1);
        p.add(Button2);
        Button3 = new JButton("C");
        Button3.setFont(bigFont);
        Button3.setPreferredSize(new Dimension(74, 74));
        Button4 = new JButton("D");
        Button4.setFont(bigFont);
        Button4.setPreferredSize(new Dimension(74, 74));
        p1.add(Button3);
        p1.add(Button4);

        f.setVisible(true);

        p.setPreferredSize(new Dimension(180, 80));
        p1.setPreferredSize(new Dimension(180, 80));

        f.getContentPane().add(BorderLayout.NORTH, p);
        f.setSize(200, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().add(BorderLayout.SOUTH, p1);

        Button1.addActionListener(new Button1());
        Button2.addActionListener(new Button2());
        Button3.addActionListener(new Button3());
        Button4.addActionListener(new Button4());

    }

    private class Button1 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // textLabel.setText("Hello");
            System.out.println("Button A Pressed");
        }
    }
}

class Button2 implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button B Pressed");
    }
}

class Button3 implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button C Pressed");
    }
}

class Button4 implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button D Pressed");
    }
}
