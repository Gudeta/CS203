
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.io.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gude
 */
public class MyNotePad {
    
    private JTextField textBox;
    private JButton saveBtn;
    private JButton loadBtn;
    private JFrame mainFrame;
    private JPanel mainPanel;
    
    MyNotePad() {
        textBox = new JTextField();
        textBox.setPreferredSize(new Dimension(240, 30));
        saveBtn = new JButton("Save");
        loadBtn = new JButton("Load");
        mainFrame = new JFrame();
        mainPanel = new JPanel();
        
    }
    
    public void go() {
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(300, 200);
        mainFrame.setVisible(true);
        mainPanel.setLayout(new FlowLayout());
        mainPanel.add(textBox);
        mainPanel.add(saveBtn);
        mainPanel.add(loadBtn);
        mainFrame.getContentPane().add(mainPanel);
        saveBtn.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent ae) {
                String message = textBox.getText();
                try {
                    FileWriter writer = new FileWriter("out.txt");
                    writer.write(message);
                    writer.close();
                    textBox.setText("");
                } catch (Exception ex) {
                    
                }
            }
        });
        
        loadBtn.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent ae) {
                textBox.setText("");
                try {
                    File file = new File("C:\\Users\\Gude\\Documents\\NetBeansProjects\\CS203\\out.txt");
                    System.out.println(file.getCanonicalFile());
                    FileReader fr = new FileReader(file);
                    BufferedReader br = new BufferedReader(fr);
                    StringBuilder sb = new StringBuilder();
                    String line = null;
                    while ((line = br.readLine()) != null) {
                        sb.append(line);
                        textBox.setText(line);
                    }
                    System.out.println(line);
                    
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
    }
    
    public static void main(String[] args) {
        MyNotePad note = new MyNotePad();
        note.go();
    }
}
