package JavaTraining16;

import java.awt.FlowLayout;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("はじめてのGUI");
        JLabel label = new JLabel("Hello World!");
        JButton button = new JButton("教えてね!");
        frame.getContentPane().setLayout(new FlowLayout());
        frame.getContentPane().add(label);
        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 70);
        frame.setVisible(true);
    }
}
