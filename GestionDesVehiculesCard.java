package ui;

import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GestionDesVehiculesCard extends JPanel {
    public final String ADMIN = "admin";
    public final String GESTIONNAIRE_AGENCE = "gestionnaire agence";
    public String[] tablerowdata;
    public final String CLIENT = "client";

    public GestionDesVehiculesCard() {
        setSize(700, 300);
        String role = "admin";
        setLayout(new GridLayout(3, 2, 5, 5));
        JPanel buttonPanel = new JPanel(new FlowLayout());
        JButton jb1 = new JButton("ajout vehicule");
        JButton jb2 = new JButton("modifier vehicule");
        JButton jb3 = new JButton("supprimer vehicule");
        buttonPanel.add(jb1);
        buttonPanel.add(jb2);
        buttonPanel.add(jb3);

        String[] tabeColumns = { "modèle", "modele", "année", "type", "carburant", "prix_location_jour", "etat" };
        String[][] initData = { { "modèle", "modele", "année", "type", "carburant", "prix_location_jour", "etat" },
                { "modèle", "modele", "année", "type", "carburant", "prix_location_jour", "etat" } };
        JTable jtable1 = new JTable(initData, tabeColumns);
        JScrollPane sp = new JScrollPane(jtable1);
        JPanel tabelPanel = new JPanel();
        tabelPanel.add(sp);
        jtable1.setPreferredScrollableViewportSize(jtable1.getPreferredSize());
        jtable1.setFillsViewportHeight(true);
        jtable1.setMaximumSize(new Dimension(20, 20));

        jtable1.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                int ta = jtable1.getSelectedRow();
                // DefaultTableModel model = (DefaultTableModel) jtable1.
                // getModel();
                for (int i = 0; i < jtable1.getColumnCount(); i++) {
                    tablerowdata[i] = jtable1.getValueAt(ta, i).toString();
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent arg0) {
                // TODO Auto-generated method stub
                // throw new UnsupportedOperationException("Unimplemented method
                // 'mouseReleased'");
            }

        });

        JPanel formPanel = new JPanel(new GridLayout(7, 2));
        formPanel.setLayout(new GridLayout(8, 2, 5, 5));
        JLabel jl1 = new JLabel("modèle");
        JLabel jl2 = new JLabel("modele");
        JLabel jl3 = new JLabel("année");
        JLabel jl4 = new JLabel("type");
        JLabel jl5 = new JLabel("carburant");
        JLabel jl6 = new JLabel("prix_location_jour");
        JLabel jl7 = new JLabel("etat");

        JTextArea jt1 = new JTextArea(1, 15);
        JTextArea jt2 = new JTextArea(1, 15);
        JTextArea jt3 = new JTextArea(1, 15);
        JTextArea jt4 = new JTextArea(1, 15);
        JTextArea jt5 = new JTextArea(1, 15);
        JTextArea jt6 = new JTextArea(1, 15);
        JTextArea jt7 = new JTextArea(1, 15);
        JButton jfb1 = new JButton("Ajouter une vehicule");

        formPanel.add(jl1);
        formPanel.add(jt1);
        formPanel.add(jl2);
        formPanel.add(jt2);
        formPanel.add(jl3);
        formPanel.add(jt3);
        formPanel.add(jl4);
        formPanel.add(jt4);
        formPanel.add(jl5);
        formPanel.add(jt5);
        formPanel.add(jl6);
        formPanel.add(jt6);
        formPanel.add(jl7);
        formPanel.add(jt7);
        formPanel.add(new JLabel());
        formPanel.add(jfb1);

        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tablerowdata.length > 0) {
                    jt1.setText(tablerowdata[0]);
                    jt2.setText(tablerowdata[1]);
                    jt3.setText(tablerowdata[2]);
                    jt4.setText(tablerowdata[3]);
                    jt5.setText(tablerowdata[4]);
                    jt6.setText(tablerowdata[5]);
                    jt7.setText(tablerowdata[6]);
                }else{
                    JOptionPane.showMessageDialog(jfb1,"selection un ligne de tableau pour modifier");
                }
            }
        });

        add(buttonPanel);
        add(new JPanel());
        add(sp);
        add(formPanel);
        /*
         * if (role == ADMIN) {
         * 
         * } else if (role == GESTIONNAIRE_AGENCE) {
         * JPanel buttonPanel = new JPanel(new FlowLayout());
         * JButton jb1 = new JButton("modifier vehicule");
         * buttonPanel.add(jb1);
         * 
         * String[] tabeColumns = { "modèle", "modele", "année", "type", "carburant",
         * "prix_location_jour", "etat" };
         * String[][] initData = { { "modèle", "modele", "année", "type", "carburant",
         * "prix_location_jour", "etat" },
         * { "modèle", "modele", "année", "type", "carburant", "prix_location_jour",
         * "etat" } };
         * JTable jt1 = new JTable(initData, tabeColumns);
         * jt1.addMouseListener(new MouseListener() {
         * 
         * @Override
         * public void mouseClicked(MouseEvent e) {
         * int ta = jt1.getSelectedRow();
         * DefaultTableModel model = (DefaultTableModel) jt1.getModel();
         * for (int i = 0; i < jt1.getColumnCount(); i++) {
         * System.out.println(model.getValueAt(ta, i).toString());
         * }
         * }
         * 
         * @Override
         * public void mouseEntered(MouseEvent e) {
         * // TODO Auto-generated method stub
         * }
         * 
         * @Override
         * public void mouseExited(MouseEvent e) {
         * // TODO Auto-generated method stub
         * }
         * 
         * @Override
         * public void mousePressed(MouseEvent e) {
         * // TODO Auto-generated method stub
         * }
         * 
         * @Override
         * public void mouseReleased(MouseEvent e) {
         * // TODO Auto-generated method stub
         * }
         * 
         * });
         * 
         * JScrollPane sp = new JScrollPane(jt1);
         * 
         * add(buttonPanel);
         * add(new JPanel());
         * add(sp);
         * // add(formPanel);
         * } else {
         * String[] tabeColumns = { "modèle", "modele", "année", "type", "carburant",
         * "prix_location_jour", "etat" };
         * String[][] initData = { { "modèle", "modele", "année", "type", "carburant",
         * "prix_location_jour", "etat" },
         * { "modèle", "modele", "année", "type", "carburant", "prix_location_jour",
         * "etat" } };
         * JTable jt1 = new JTable(initData, tabeColumns);
         * JScrollPane sp = new JScrollPane(jt1);
         * 
         * add(sp, BorderLayout.CENTER);
         * }
         */

    }
}
