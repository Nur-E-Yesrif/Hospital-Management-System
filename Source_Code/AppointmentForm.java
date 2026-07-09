package hospitalmanagementsystem;

import javax.swing.*;
import java.awt.*;

public class AppointmentForm extends JFrame {

    JTextField txtPatientName;
    JTextField txtDoctorName;
    JTextField txtDate;
    JTextField txtTime;

    JButton btnBook;
    JButton btnClear;

    public AppointmentForm() {

        setTitle("Appointment Management");
        setSize(450, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(5, 2, 10, 10));

        panel.add(new JLabel("Patient Name"));
        txtPatientName = new JTextField();
        panel.add(txtPatientName);

        panel.add(new JLabel("Doctor Name"));
        txtDoctorName = new JTextField();
        panel.add(txtDoctorName);

        panel.add(new JLabel("Appointment Date"));
        txtDate = new JTextField("YYYY-MM-DD");
        panel.add(txtDate);

        panel.add(new JLabel("Appointment Time"));
        txtTime = new JTextField("HH:MM");
        panel.add(txtTime);

        btnBook = new JButton("Book Appointment");
        btnClear = new JButton("Clear");

        panel.add(btnBook);
        panel.add(btnClear);

        add(panel);

        btnBook.addActionListener(e -> {

            String patient = txtPatientName.getText();
            String doctor = txtDoctorName.getText();
            String date = txtDate.getText();
            String time = txtTime.getText();

            if (patient.isEmpty() || doctor.isEmpty()
                    || date.isEmpty() || time.isEmpty()) {

                JOptionPane.showMessageDialog(this,
                        "Please fill all fields!");

            } else {

                JOptionPane.showMessageDialog(this,
                        "Appointment Booked Successfully!");

            }

        });

        btnClear.addActionListener(e -> {

            txtPatientName.setText("");
            txtDoctorName.setText("");
            txtDate.setText("");
            txtTime.setText("");

        });

        setVisible(true);
    }
}
