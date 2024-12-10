package ui;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signupdcard extends JPanel {

    public Signupdcard(CardLayout layout, JPanel parentPanel) {
        setLayout(new GridLayout(7, 2, 20, 50));
        JLabel jl1 = new JLabel("nom : ");
        JLabel jl2 = new JLabel("prenom : ");
        JLabel jl3 = new JLabel("email : ");
        JLabel jl4 = new JLabel("mot de passe : ");
        JLabel jl5 = new JLabel("role : ");
        JTextArea jt1 = new JTextArea(1, 15);
        JTextArea jt2 = new JTextArea(1, 15);
        JTextArea jt3 = new JTextArea(1, 15);
        JPasswordField jp1 = new JPasswordField(15);
        // jt1.setMaximumSize(new Dimension(Integer.MAX_VALUE, 2));
        // jp1.setMaximumSize(new Dimension(Integer.MAX_VALUE, 2));
        String s1[] = {"admin","gestionnaire de agence"};
        JComboBox jc1 = new JComboBox(s1);

        JButton jb1 = new JButton("Signup");
        JButton jb2 = new JButton("Login");
        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                layout.show(parentPanel, "login");
            }

        });
        add(new JLabel("Signup :"));
        add(new JLabel());
        add(jl1);
        add(jt1);
        add(jl2);
        add(jt2);
        add(jl3);
        add(jt3);
        add(jl4);
        add(jp1);
        add(jl5);
        add(jc1);
        add(jb1);
        add(jb2);
    }
}
