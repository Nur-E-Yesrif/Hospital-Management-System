package hospitalmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard extends JFrame {

    public Dashboard() {

        setTitle("Hospital Management System - Dashboard");
        setSize(800, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2,2,20,20));

        JButton patientBtn = new JButton("Patient Management");
        JButton doctorBtn = new JButton("Doctor Management");
        JButton appointmentBtn = new JButton("Appointments");
        JButton exitBtn = new JButton("Exit");

        panel.add(patientBtn);
        panel.add(doctorBtn);
        panel.add(appointmentBtn);
        panel.add(exitBtn);

        add(panel);

        patientBtn.addActionListener(e -> new PatientForm());

        doctorBtn.addActionListener(e -> new DoctorForm());

        exitBtn.addActionListener(e -> System.exit(0));

        setVisible(true);
    }
}
