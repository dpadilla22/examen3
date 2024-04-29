package sistema;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cliente extends JPanel {

    private static final long serialVersionUID = 1L;

    private JPanel contentPane;
    private CardLayout cardlayout;
    private JTextField nombreField;
    private JTextField apellidoField;
    private JTextField fechaField;
    private JTextField telefonoField;

    /**
     * Create the panel.
     */
    public Cliente(JPanel cambio) {

        setLayout(null);

        setBackground(new Color(251, 175, 106));
        setBounds(0, 0, 430, 520);
        setLayout(null);

        contentPane = cambio;
        cardlayout = (CardLayout) cambio.getLayout();

        JLabel lblNewLabel_1 = new JLabel("Nombres:");
        lblNewLabel_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 21));
        lblNewLabel_1.setBounds(20, 91, 141, 34);
        add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("Apellido:");
        lblNewLabel_2.setFont(new Font("Tw Cen MT", Font.PLAIN, 21));
        lblNewLabel_2.setBounds(23, 157, 86, 25);
        add(lblNewLabel_2);

        JLabel lblNewLabel_3 = new JLabel("Fecha de nacimiento:");
        lblNewLabel_3.setFont(new Font("Tw Cen MT", Font.PLAIN, 21));
        lblNewLabel_3.setBounds(20, 217, 180, 34);
        add(lblNewLabel_3);

        JLabel lblNewLabel_4 = new JLabel("Telefono:");
        lblNewLabel_4.setFont(new Font("Tw Cen MT", Font.PLAIN, 21));
        lblNewLabel_4.setBounds(20, 297, 99, 25);
        add(lblNewLabel_4);

        JLabel lblNewLabel_5 = new JLabel("Total:");
        lblNewLabel_5.setFont(new Font("Tw Cen MT", Font.PLAIN, 21));
        lblNewLabel_5.setBounds(24, 355, 111, 43);
        add(lblNewLabel_5);

         nombreField = new JTextField();
        nombreField.setBounds(134, 91, 211, 34);
        add(nombreField);

        apellidoField = new JTextField();
        apellidoField.setBounds(134, 157, 211, 31);
        add(apellidoField);

        fechaField = new JTextField();
        fechaField.setBounds(203, 217, 141, 34);
        add(fechaField);

        telefonoField = new JTextField();
        telefonoField.setBounds(126, 296, 219, 34);
        add(telefonoField);

        JLabel total = new JLabel("$ 290");
        total.setBounds(123, 363, 222, 34);
        add(total);

        JButton btnNewButton = new JButton("Guardar");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                cardlayout.show(contentPane, "Menu");
                nombreField.setText("");
                fechaField.setText("");
                telefonoField.setText("");
	            apellidoField.setText("");
            }
        });
        btnNewButton.setBounds(253, 443, 85, 21);
        add(btnNewButton);

        JLabel img = new JLabel("");
        img.setIcon(new ImageIcon(Menu.class.getResource("/imagenes/guardar.png")));
        img.setLocation(60, 432);
        img.setSize(40, 40);
        add(img);

        JButton btnNewButton_1 = new JButton("Subir foto");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardlayout.show(contentPane, "crearUusario");
            }
        });
        btnNewButton_1.setBounds(53, 443, 95, 21);
        add(btnNewButton_1);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(0, 0, 0));
        panel.setBounds(0, 0, 430, 81);
        add(panel);
        panel.setLayout(null);

        JLabel lblNewLabel = new JLabel("Cliente");
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setBounds(153, 21, 131, 35);
        panel.add(lblNewLabel);
        lblNewLabel.setBackground(new Color(233, 155, 24));
        lblNewLabel.setFont(new Font("Snap ITC", Font.PLAIN, 31));

        JButton btnNewButton_2 = new JButton("Eliminar");
        btnNewButton_2.setBounds(158, 443, 85, 21);
        add(btnNewButton_2);
    }


}
