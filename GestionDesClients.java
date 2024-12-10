package ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GestionDesClients extends JPanel {
    public GestionDesClients() {
        setSize(700, 300);
        setLayout(new BorderLayout());
        JPanel adduserPanel = new JPanel(new GridLayout(6, 2, 20, 50));
        JPanel searchPanel = new JPanel(new BorderLayout());
        JLabel jl1 = new JLabel("nom : ");
        JLabel jl2 = new JLabel("prenom : ");
        JLabel jl3 = new JLabel("email : ");
        JLabel jl4 = new JLabel("mot de passe : ");
        JTextArea jt1 = new JTextArea(1, 15);
        JTextArea jt2 = new JTextArea(1, 15);
        JTextArea jt3 = new JTextArea(1, 15);
        JPasswordField jp1 = new JPasswordField(15);

        JButton jb1 = new JButton("Ajout");
        // jb2.addActionListener(new ActionListener() {
        // @Override
        // public void actionPerformed(ActionEvent e) {
        // layout.show(parentPanel, "login");
        // }

        // });
        adduserPanel.add(new JLabel("Ajout un client :"));
        adduserPanel.add(new JLabel());
        adduserPanel.add(jl1);
        adduserPanel.add(jt1);
        adduserPanel.add(jl2);
        adduserPanel.add(jt2);
        adduserPanel.add(jl3);
        adduserPanel.add(jt3);
        adduserPanel.add(jl4);
        adduserPanel.add(jp1);
        adduserPanel.add(jb1);
        adduserPanel.add(new JLabel());

        JTextArea jt4 = new JTextArea(1,15);
        jt4.setText("recherche un client");

        JButton jb2 = new JButton("rechercher");

        searchPanel.add(jt4,BorderLayout.CENTER);
        searchPanel.add(jb2,BorderLayout.EAST);
        add(searchPanel,BorderLayout.NORTH);
        add(adduserPanel,BorderLayout.CENTER);

    }
}