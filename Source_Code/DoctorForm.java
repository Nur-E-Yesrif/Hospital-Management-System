package hospitalmanagementsystem;

import javax.swing.*;
import java.awt.*;

public class DoctorForm extends JFrame {

    JTextField txtName, txtSpecialist;
    JButton btnSave;

    public DoctorForm() {

        setTitle("Doctor Management");
        setSize(450,250);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(3,2,10,10));

        panel.add(new JLabel("Doctor Name"));
        txtName = new JTextField();
        panel.add(txtName);

        panel.add(new JLabel("Specialization"));
        txtSpecialist = new JTextField();
        panel.add(txtSpecialist);

        btnSave = new JButton("Save");

        panel.add(new JLabel());
        panel.add(btnSave);

        add(panel);

        btnSave.addActionListener(e -> {

            JOptionPane.showMessageDialog(this,
                    "Doctor Saved Successfully!");

        });

        setVisible(true);
    }
}
