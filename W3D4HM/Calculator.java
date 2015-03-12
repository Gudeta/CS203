package W3d3hm;

//import com.sun.deploy.uitoolkit.impl.fx.FXPreloader;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Gude
 */
public class Calculator {

    JButton clearButton;
    JButton zeroButton;
    JButton firstButton;
    JButton secondButton;
    JButton thirdButton;
    JButton fourthButton;
    JButton fifthButton;
    JButton sixButton;
    JButton sevenButton;
    JButton eightButton;
    JButton nineButton;
    JButton addButton;
    JButton subButton;
    JButton mulButton;
    JButton divButton;
    JButton equalButton;
    JButton decButton;

    JTextField textBox;

    JPanel mainPanel;
    JPanel upperPanel;
    JPanel firstRowPanel;
    JPanel secondRowPanel;
    JPanel thirdRowPanel;
    JPanel fourthRowPanel;

    private String output = "";

    private JFrame mainFrame;

    public static void main(String[] args) {
        Calculator g = new Calculator();
        g.go();
    }

    public void go() {
        mainFrame = new JFrame("Awesome Calculator");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(286, 320);

        mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        upperPanel = new JPanel();
        upperPanel.setLayout(new FlowLayout());

        textBox = new JTextField(16);
        textBox.setPreferredSize(new Dimension(380, 35));
        clearButton = new JButton("Clear");
        clearButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                output = "";
                textBox.setText(output);
            }
        });

        upperPanel.add(textBox);
        upperPanel.add(clearButton);

        mainPanel.add(upperPanel);

        firstRowPanel = new JPanel();
        firstRowPanel.setLayout(new FlowLayout());

        sevenButton = new JButton("7");
        sevenButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                output += "7";
                textBox.setText(output);
            }
        });
        sevenButton.setPreferredSize(new Dimension(60, 40));
        eightButton = new JButton("8");
        eightButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                output += "8";
                textBox.setText(output);
            }
        });
        eightButton.setPreferredSize(new Dimension(60, 40));
        nineButton = new JButton("9");
        nineButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                output += "9";
                textBox.setText(output);
            }
        });
        nineButton.setPreferredSize(new Dimension(60, 40));
        addButton = new JButton("+");
        addButton.setPreferredSize(new Dimension(60, 40));
        addButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                output += "+";
                textBox.setText(output);
            }
        });

        firstRowPanel.add(sevenButton);
        firstRowPanel.add(eightButton);
        firstRowPanel.add(nineButton);
        firstRowPanel.add(addButton);

        secondRowPanel = new JPanel();
        secondRowPanel.setLayout(new FlowLayout());

        fourthButton = new JButton("4");
        fourthButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                output += "4";
                textBox.setText(output);
            }
        });

        fourthButton.setPreferredSize(new Dimension(60, 40));
        fifthButton = new JButton("5");
        fifthButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                output += "5";
                textBox.setText(output);
            }
        });
        fifthButton.setPreferredSize(new Dimension(60, 40));
        sixButton = new JButton("6");
        sixButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                output += "6";
                textBox.setText(output);
            }
        });
        sixButton.setPreferredSize(new Dimension(60, 40));
        subButton = new JButton("-");
        subButton.setPreferredSize(new Dimension(60, 40));
        subButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                output += "-";
                textBox.setText(output);
            }
        });

        secondRowPanel.add(fourthButton);
        secondRowPanel.add(fifthButton);
        secondRowPanel.add(sixButton);
        secondRowPanel.add(subButton);

        thirdRowPanel = new JPanel();
        thirdRowPanel.setLayout(new FlowLayout());

        firstButton = new JButton("1");
        firstButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                output += "1";
                textBox.setText(output);
            }
        });
        firstButton.setPreferredSize(new Dimension(60, 40));
        secondButton = new JButton("2");
        secondButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                output += "2";
                textBox.setText(output);
            }
        });
        secondButton.setPreferredSize(new Dimension(60, 40));
        thirdButton = new JButton("3");
        thirdButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                output += "3";
                textBox.setText(output);
            }
        });
        thirdButton.setPreferredSize(new Dimension(60, 40));
        mulButton = new JButton("*");
        mulButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                output += "*";
                textBox.setText(output);
            }
        });

        mulButton.setPreferredSize(new Dimension(60, 40));

        thirdRowPanel.add(firstButton);
        thirdRowPanel.add(secondButton);
        thirdRowPanel.add(thirdButton);
        thirdRowPanel.add(mulButton);

        fourthRowPanel = new JPanel();
        fourthRowPanel.setLayout(new FlowLayout());

        decButton = new JButton(".");
        decButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                output += ".";
                textBox.setText(output);
            }
        });

        decButton.setPreferredSize(new Dimension(60, 40));
        zeroButton = new JButton("0");
        zeroButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                output += "0";
                textBox.setText(output);
            }
        });

        zeroButton.setPreferredSize(new Dimension(60, 40));
        equalButton = new JButton("=");

        equalButton.setPreferredSize(new Dimension(60, 40));
        equalButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                String result = textBox.getText();
                String[] splitArray = result.split("");
                for (String item : splitArray) {
                    System.out.println(item);
                }
                String operator = splitArray[1];
                switch (operator) {
                    case "+":
                        add(Integer.parseInt(splitArray[0]), Integer.parseInt(splitArray[2]));
                        break;
                    case "-":
                        substract(Integer.parseInt(splitArray[0]), Integer.parseInt(splitArray[2]));
                        break;
                    case "/":
                        division(Integer.parseInt(splitArray[0]), Integer.parseInt(splitArray[2]));
                        break;
                    case "*":
                        multiply(Integer.parseInt(splitArray[0]), Integer.parseInt(splitArray[2]));
                        break;
                    default:
                        System.out.println("I hate you JAVA !!!");
                        break;
                }
            }
        });

        divButton = new JButton("/");
        divButton.setPreferredSize(new Dimension(60, 40));
        divButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                output += "/";
                textBox.setText(output);
            }
        });

        fourthRowPanel.add(decButton);
        fourthRowPanel.add(zeroButton);
        fourthRowPanel.add(equalButton);
        fourthRowPanel.add(divButton);

        mainPanel.add(firstRowPanel);
        mainPanel.add(secondRowPanel);
        mainPanel.add(thirdRowPanel);
        mainPanel.add(fourthRowPanel);

        mainFrame.getContentPane().add(mainPanel);
        mainFrame.setVisible(true);
    }

    public void add(int a, int b) {
        int sum = a + b;
        this.output = "" + sum;
        textBox.setText(output);
    }

    public void substract(int a, int b) {
        int result = a - b;
        this.output = "" + result;
        textBox.setText(output);
    }

    public void multiply(int a, int b) {
        int result = a * b;
        this.output = "" + result;
        textBox.setText(output);
    }

    public void division(int a, int b) {
        int result = a / b;
        this.output = "" + result;
        textBox.setText(output);
    }
}
