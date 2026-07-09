package hospitalmanagementsystem;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Hospital Management System");

        JLabel label = new JLabel(
                "Welcome to Hospital Management System",
                SwingConstants.CENTER);

        frame.add(label);

        frame.setSize(700, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
