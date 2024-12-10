package ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.MouseListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import org.w3c.dom.events.MouseEvent;

public class GestionDesReservations extends JPanel {
    public GestionDesReservations() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        JPanel reservePanel = new JPanel();
        String[] tabeColumns = { "modèle", "modele", "année", "type", "carburant", "prix_location_jour", "etat" };
        String[][] initData = { { "modèle", "modele", "année", "type", "carburant", "prix_location_jour", "etat" },
                { "modèle", "modele", "année", "type", "carburant", "prix_location_jour", "etat" } };
        JTable jt1 = new JTable(initData, tabeColumns);
        JScrollPane sp = new JScrollPane(jt1);
        jt1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                int ta = jt1.getSelectedRow();
                // DefaultTableModel model = (DefaultTableModel) jt1.
                // getModel();
                for (int i = 0; i < jt1.getColumnCount(); i++) {
                    System.out.println(jt1.getValueAt(ta, i).toString());
                }
            }

            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
            }

            @Override
            public void mousePressed(java.awt.event.MouseEvent e) {
            }

            @Override
            public void mouseReleased(java.awt.event.MouseEvent e) {
            }
        });
        reservePanel.add(sp);

        JPanel crudPanel = new JPanel(new BorderLayout());
        JPanel buttonPanel = new JPanel(new FlowLayout());
        JButton jb1 = new JButton("modifier vehicule");
        JButton jb2 = new JButton("supprimer vehicule");
        buttonPanel.add(jb1);
        buttonPanel.add(jb2);

        String[] tabeColumns2 = { "modèle", "modele", "année", "type", "carburant", "prix_location_jour", "etat" };
        String[][] initData2 = { { "modèle", "modele", "année", "type", "carburant", "prix_location_jour", "etat" },
                { "modèle", "modele", "année", "type", "carburant", "prix_location_jour", "etat" } };
        JTable jt2 = new JTable(initData2, tabeColumns2);
        JScrollPane sp2 = new JScrollPane(jt2);

        jt2.addMouseListener(new MouseListener() {

            @Override 
            public void mouseClicked(java.awt.event.MouseEvent e){
                int ta = jt2.getSelectedRow();
                // DefaultTableModel model = (DefaultTableModel) jt1.
                // getModel();
                for (int i = 0; i < jt2.getColumnCount(); i++) {
                    System.out.println(jt2.getValueAt(ta, i).toString());
                }
            }

            @Override
            public void mouseEntered(java.awt.event.MouseEvent e){}

            @Override
            public void mouseExited(java.awt.event.MouseEvent e){}

            @Override
            public void mousePressed(java.awt.event.MouseEvent e){}

            @Override
            public void mouseReleased(java.awt.event.MouseEvent e){} 

        });
        crudPanel.add(buttonPanel,BorderLayout.NORTH);
        crudPanel.add(sp2,BorderLayout.CENTER);
        add(reservePanel);
        add(crudPanel);
    }
}
