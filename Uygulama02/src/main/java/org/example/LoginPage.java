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

    JPanel buttonPanel;
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
        userPanel.setBorder(BorderFactory.createLineBorder(Color.black));

        userPanel.add(userLabel);
        userPanel.add(userNameField);

        passwordField = new JTextField();

        passwordLabel = new JLabel();
        passwordField.setPreferredSize(new Dimension(200, 30));

        passwordLabel.setText("Şifre");
        passwordLabel.setFont(new Font("Monospaced", Font.PLAIN, 20));

        passwordPanel = new JPanel();
        passwordPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        passwordPanel.setBorder(BorderFactory.createLineBorder(Color.black));

        passwordPanel.add(passwordLabel);
        passwordPanel.add(passwordField);


        loginButton = new JButton("Gönder");
        loginButton.addActionListener(this);
        loginButton.setPreferredSize(new Dimension(100, 50));


        buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.setBorder(BorderFactory.createLineBorder(Color.black));


        buttonPanel.add(loginButton);


        frame = new JFrame();
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3,1));

        frame.add(userPanel);
        frame.add(passwordPanel);
        frame.add(buttonPanel);

        frame.setVisible(true);


    }

    public void checkForSpacesInUsernameAndPassword(String username, String password)
    {
        if (username.isEmpty() || password.isEmpty())
        {
            JOptionPane.showMessageDialog(
                    null,
                    "Lütfen tüm alanları doldurunuz!",
                    "Hata",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }

    public void checkSecurityOfUsername()
    {

    }
    public void checkSecurityOfPassword(String password)
    {
        if (password.length() < 5)
        {
            JOptionPane.showMessageDialog(
                    null,
                    "Şifre minimum beş karakterli olmalı!",
                    "Hata",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String username = userNameField.getText().trim();
            String password = passwordField.getText().trim();

            checkForSpacesInUsernameAndPassword(username, password);
            checkSecurityOfPassword(password);
        }
    }
}
