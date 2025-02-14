package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage implements ActionListener {

    JFrame frame;
    JPanel userPanel;
    JLabel userLabel;
    JTextField userNameField;

    JPanel passwordPanel;
    JLabel passwordLabel;
    JTextField passwordField;

    JButton loginButton;


    public LoginPage()
    {
        userNameField = new JTextField();
        userNameField.setPreferredSize(new Dimension(200, 30));

        userLabel = new JLabel();
        userLabel.setText("Kullanıcı Adı");
        userLabel.setFont(new Font("Monospaced", Font.PLAIN, 20));

        userPanel = new JPanel();
        userPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));

        userPanel.add(userLabel);
        userPanel.add(userNameField);

        passwordField = new JTextField();

        passwordLabel = new JLabel();
        passwordField.setPreferredSize(new Dimension(200, 30));

        passwordLabel.setText("Şifre");
        passwordLabel.setFont(new Font("Monospaced", Font.PLAIN, 20));

        passwordPanel = new JPanel();
        passwordPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));

        passwordPanel.add(passwordLabel);
        passwordPanel.add(passwordField);


        loginButton = new JButton();



        frame = new JFrame();
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3,1));

        frame.add(userPanel);
        frame.add(passwordPanel);

        frame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
