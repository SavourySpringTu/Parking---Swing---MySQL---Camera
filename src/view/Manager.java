package view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class Manager extends JFrame {
    private JPanel panel;
    private JButton btnRole;
    private JButton btnTicket;
    private JButton btnPosition;
    private JButton btnWareHouse;
    private JButton btnRevenue;
    private JButton btnExit;
    private String user1;
    private ImageIcon i;
    private Image m;
    public Manager(String user){
        user1 = user;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(170,60,1600, 1000);
        panel = new JPanel();
        panel.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(panel);
        panel.setLayout(null);

        btnExit = new JButton("EXIT");
        btnTicket = new JButton("TICKET");
        btnRole = new JButton("ROLE & USER");
        btnPosition = new JButton("POSITIONS");
        btnRevenue = new JButton("REVENUE");
        btnWareHouse = new JButton("WAREHOUSE");

        // ==================== BUTTON EXIT ====================
        panel.add(btnExit);
        btnExit.setBounds(10,10,100,50);
        btnExit.setForeground(Color.WHITE);
        i = new ImageIcon("src\\icon\\logout.png");
        m = i.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        btnExit.setIcon(new ImageIcon(m));
        btnExit.setBackground(new Color(42, 115, 196));
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Login login = new Login();
                    login.setVisible(true);
                    dispose();
                    System.out.println("Role");
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                } catch (ClassNotFoundException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        // ==================== BUTTON TICKET =====================
        panel.add(btnTicket);
        btnTicket.setBounds(600,100,400,70);
        btnTicket.setFont(new Font("Verdana", Font.PLAIN, 18));
        btnTicket.setForeground(Color.WHITE);
        btnTicket.setBackground(new Color(42, 115, 196));
        btnTicket.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    TicketManager ticketManager = new TicketManager(user1);
                    ticketManager.setVisible(true);
                    dispose();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                } catch (ClassNotFoundException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        // ===================== BUTTON ROLE =====================
        panel.add(btnRole);
        btnRole.setBounds(600,220,400,70);
        btnRole.setFont(new Font("Verdana", Font.PLAIN, 18));
        btnRole.setForeground(Color.WHITE);
        btnRole.setBackground(new Color(42, 115, 196));
        btnRole.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    RoleUserManager roleManager = new RoleUserManager(user1);
                    roleManager.setVisible(true);
                    dispose();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                } catch (ClassNotFoundException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        panel.add(btnPosition);
        btnPosition.setBounds(600,340,400,70);
        btnPosition.setFont(new Font("Verdana", Font.PLAIN, 18));
        btnPosition.setForeground(Color.WHITE);
        btnPosition.setBackground(new Color(42, 115, 196));
        btnPosition.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    PositionManager frame = new PositionManager(user1);
                    frame.setVisible(true);
                    dispose();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                } catch (ClassNotFoundException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        panel.add(btnRevenue);
        btnRevenue.setBounds(600,460,400,70);
        btnRevenue.setFont(new Font("Verdana", Font.PLAIN, 18));
        btnRevenue.setForeground(Color.WHITE);
        btnRevenue.setBackground(new Color(42, 115, 196));

        panel.add(btnWareHouse);
        btnWareHouse.setBounds(600,580,400,70);
        btnWareHouse.setFont(new Font("Verdana", Font.PLAIN, 18));
        btnWareHouse.setForeground(Color.WHITE);
        btnWareHouse.setBackground(new Color(42, 115, 196));
    }
}
