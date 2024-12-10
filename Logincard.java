package ui;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Logincard extends JPanel {

    public Logincard(CardLayout layout, JPanel parentPanel) {
        setLayout(new GridLayout(4, 2, 20, 50));
        setMinimumSize(new Dimension(300, 200)); // Minimum size
        setMaximumSize(new Dimension(500, 300)); // Maximum size
        setPreferredSize(new Dimension(400, 250)); // Preferred size

        JLabel jl1 = new JLabel("email");
        JLabel jl2 = new JLabel("mot passe");
        JTextArea jt1 = new JTextArea(1, 7);
        // jt1.setMaximumSize(new Dimension(Integer.MAX_VALUE, 2));
        JPasswordField jp1 = new JPasswordField(1);
        // jp1.setMaximumSize(new Dimension(Integer.MAX_VALUE, 2));
        JButton jb1 = new JButton("Login");
        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                layout.show(parentPanel, "containerpanel");
            }
        });
        JButton jb2 = new JButton("Signup");
        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                layout.show(parentPanel, "signup");
            }
        });
        add(new JLabel("Login :"));
        add(new JLabel());
        add(jl1);
        add(jt1);
        add(jl2);
        add(jp1);
        add(jb1);
        add(jb2);

        
    }
}
