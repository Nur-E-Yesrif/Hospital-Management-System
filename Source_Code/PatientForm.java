package hospitalmanagementsystem;

import javax.swing.*;
import java.awt.*;

public class PatientForm extends JFrame {

    JTextField txtName, txtAge, txtPhone;
    JButton btnSave, btnClear;

    public PatientForm() {

        setTitle("Patient Management");
        setSize(450,350);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(4,2,10,10));

        panel.add(new JLabel("Patient Name"));
        txtName = new JTextField();
        panel.add(txtName);

        panel.add(new JLabel("Age"));
        txtAge = new JTextField();
        panel.add(txtAge);

        panel.add(new JLabel("Phone"));
        txtPhone = new JTextField();
        panel.add(txtPhone);

        btnSave = new JButton("Save");
        btnClear = new JButton("Clear");

        panel.add(btnSave);
        panel.add(btnClear);

        add(panel);

        btnSave.addActionListener(e -> {

            JOptionPane.showMessageDialog(this,
                    "Patient Saved Successfully!");

        });

        btnClear.addActionListener(e -> {

            txtName.setText("");
            txtAge.setText("");
            txtPhone.setText("");

        });

        setVisible(true);
    }
}
