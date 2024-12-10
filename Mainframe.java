package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import ui.Logincard;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class Mainframe extends JFrame {

    private CardLayout cardLayout, dashCardLayout;
    private JPanel mainPanel, menuPanel, dashpanel, containerPanel;
    private JButton vehicule, client, reservation;
    public final String ADMIN = "admin";
    public final String GESTIONNAIRE_AGENCE = "gestionnaire agence";
    public final String CLIENT = "client";

    public static Connection getConnection(String dbUrl, String user, String password) throws SQLException {
        Connection connection = DriverManager.getConnection(dbUrl, user, password);
        return connection;
    }

    public void navigatTo(String screenName) {
        cardLayout.show(mainPanel, screenName);
    }

    public Mainframe() {
        setLayout(new BorderLayout());
        setSize(1080, 720);
        // setExtendedState(JFrame.MAXIMIZED_BOTH);
        setTitle("Gestion de Reservation");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // setBounds(200, 500, 600, 400);
        setLocationRelativeTo(null);
        JButton vehicule = new JButton();
        JButton client = new JButton();
        JButton reservation = new JButton();
        String role = "admin";
        cardLayout = new CardLayout();
        dashCardLayout = new CardLayout();
        dashpanel = new JPanel(dashCardLayout);
        dashpanel.setSize(1080, 720);

        containerPanel = new JPanel(new BorderLayout());
        mainPanel = new JPanel(cardLayout);
        /*
         * Connection connection = null;
         * try {
         * try {
         * Class.forName("com.mysql.jdbc.Driver");
         * } catch (ClassNotFoundException e) {
         * // TODO Auto-generated catch block
         * e.printStackTrace();
         * }
         * connection =
         * DriverManager.getConnection("jdbc:mysql://localhost:3306/ihmproject", "root",
         * "password");
         * System.out.println("worked");
         * } catch (SQLException e) {
         * System.err.println(e);
         * }
         */
        // mainPanel.setBounds(980, 500, 980, 500);
        dashpanel.add(new Logincard(dashCardLayout, dashpanel), "login");
        dashpanel.add(new Signupdcard(dashCardLayout, dashpanel), "signup");
        mainPanel.add(new GestionDesVehiculesCard(), "gestiondesvehicules");
        mainPanel.add(new GestionDesClients(), "gestiondesclients");
        mainPanel.add(new GestionDesReservations(), "gestiondesreservations");

        // cardLayout.show(mainPanel, "gestiondesvehicules");:

        menuPanel = new JPanel();
        menuPanel.setPreferredSize(new Dimension(250, JFrame.MAXIMIZED_VERT));

        vehicule = new JButton();
        vehicule.setBackground(new java.awt.Color(255, 255, 255));
        vehicule.setText("gestion des vehicules");
        vehicule.setBorderPainted(false);
        vehicule.setPreferredSize(new Dimension(250, 60));
        vehicule.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel, "gestiondesvehicules");
            }
        });
        if (role != CLIENT) {
            menuPanel.add(vehicule);
        }
        client = new JButton();
        client.setBackground(new java.awt.Color(255, 255, 255));
        client.setText("gestion des clients");
        client.setBorderPainted(false);
        client.setPreferredSize(new Dimension(250, 60));
        client.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel, "gestiondesclients");
            }
        });
        if (role != CLIENT) {
            menuPanel.add(client);
        }

        reservation = new JButton();
        reservation.setBackground(new java.awt.Color(255, 255, 255));
        reservation.setText("gestion des reservations");
        reservation.setBorderPainted(false);
        reservation.setPreferredSize(new Dimension(250, 60));
        reservation.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel, "gestiondesreservations");
            }
        });
        menuPanel.add(reservation);

        containerPanel.add(menuPanel, BorderLayout.WEST);
        containerPanel.add(mainPanel, BorderLayout.CENTER);

        dashpanel.add(containerPanel, "containerpanel");
        dashCardLayout.show(dashpanel, "containerpanel");
        add(dashpanel);
        setVisible(true);

    }

    public static void main(String[] args) {
        Mainframe frame = new Mainframe();

    }
}

// javac -d out src/ui/*.java && java -cp out ui.Mainframe
