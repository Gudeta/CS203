/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Gude
 */
public class GuiApp1 {

    private JButton helloButton;
    private JButton goodByeButton;
    private JFrame frame;
    private JLabel textLabel;

    public static void main(String[] args) {
        GuiApp1 g = new GuiApp1();
        g.go();

    }

    public void go() {
        frame = new JFrame("First GUI application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        this.helloButton = new JButton("Hello");
        frame.getContentPane().add(BorderLayout.NORTH, helloButton);
        helloButton.addActionListener(new HelloListener());

        textLabel = new JLabel("Nothing Yet");
        frame.getContentPane().add(BorderLayout.WEST, textLabel);
       
        
        this.goodByeButton = new JButton("Good Bye");
        frame.getContentPane().add(BorderLayout.SOUTH, goodByeButton);
        goodByeButton.addActionListener(new GoodByeListener());

        frame.setVisible(true);
    }
    
    
    private class HelloListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            textLabel.setText("Hello");
        }
    }
    
    private class GoodByeListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            textLabel.setText("Good Bye !!!");
        }
    }
}
