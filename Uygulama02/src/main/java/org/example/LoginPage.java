package org.example;

import javax.swing.*;
import java.awt.*;

public class LoginPage {

    JFrame frame;

    public LoginPage()
    {
        frame = new JFrame();
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3,1));
        frame.setVisible(true);


    }
}
