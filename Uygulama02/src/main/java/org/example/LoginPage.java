package org.example;

import javax.swing.*;
import java.awt.*;

public class LoginPage {

    JFrame frame;
    JPanel userPanel;
    JLabel userLabel;
    JTextField userNameField;

    public LoginPage()
    {

        userPanel = new JPanel();
        userPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        userLabel = new JLabel();
        userLabel.setText("Kullanıcı İsmi");
        userPanel.add(userLabel);

        userNameField = new JTextField();
        userNameField.setPreferredSize(new Dimension(300, 25));
        userPanel.add(userNameField);



        frame = new JFrame();
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3,1));

        frame.add(userPanel);

        frame.setVisible(true);


    }
}
