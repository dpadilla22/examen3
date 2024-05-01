package sistema;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cliente extends JPanel {
//crear
    private static final long serialVersionUID = 1L;

    private JPanel contentPane;
    private CardLayout cardlayout;
    private JTextField nombreField;
    private JTextField apellidoField;
    private JTextField fechaField;
    private JTextField telefonoField;
    private boolean fotoSubida=false;
    /**
     * Create the panel.
     */
    public Cliente(JPanel cambio) {

        setLayout(null);

        setBackground(new Color(100, 91, 176));
        setBounds(0, 0, 430, 520);
        setLayout(null);

        contentPane = cambio;
        cardlayout = (CardLayout) cambio.getLayout();

        JLabel lblNewLabel_1 = new JLabel("Nombres:");
        lblNewLabel_1.setFont(new Font("Unispace", Font.PLAIN, 17));
        lblNewLabel_1.setBounds(102, 91, 141, 34);
        add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("Apellido:");
        lblNewLabel_2.setFont(new Font("Unispace", Font.PLAIN, 17));
        lblNewLabel_2.setBounds(102, 157, 112, 25);
        add(lblNewLabel_2);

        JLabel lblNewLabel_3 = new JLabel("Fecha de nacimiento:");
        lblNewLabel_3.setFont(new Font("Unispace", Font.PLAIN, 17));
        lblNewLabel_3.setBounds(103, 227, 208, 34);
        add(lblNewLabel_3);

        JLabel lblNewLabel_4 = new JLabel("Telefono:");
        lblNewLabel_4.setFont(new Font("Unispace", Font.PLAIN, 17));
        lblNewLabel_4.setBounds(102, 293, 99, 25);
        add(lblNewLabel_4);

        JLabel lblNewLabel_5 = new JLabel("Total:");
        lblNewLabel_5.setFont(new Font("Unispace", Font.PLAIN, 17));
        lblNewLabel_5.setBounds(102, 379, 85, 43);
        add(lblNewLabel_5);

         nombreField = new JTextField();
         nombreField.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
         nombreField.setOpaque(false);
        nombreField.setBounds(100, 122, 211, 25);
        add(nombreField);

        apellidoField = new JTextField();
        apellidoField.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
        apellidoField.setOpaque(false);
        apellidoField.setBounds(102, 192, 211, 25);
        add(apellidoField);

        fechaField = new JTextField();
        fechaField.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
        fechaField.setOpaque(false);
        fechaField.setBounds(99, 258, 214, 25);
        add(fechaField);

        telefonoField = new JTextField();
        telefonoField.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
        telefonoField.setOpaque(false);
        telefonoField.setBounds(102, 328, 219, 21);
        add(telefonoField);

        JLabel total = new JLabel("Membresia general ");
        total.setFont(new Font("Unispace", Font.PLAIN, 15));
        total.setBounds(102, 359, 222, 34);
        add(total);

        JButton btnNewButton = new JButton("Guardar");
        btnNewButton.setFont(new Font("Unispace", Font.PLAIN, 11));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(telefonoField.getText().matches(".*[a-zA-Z].*")) {
            		telefonoField.setBorder(new LineBorder(Color.RED, 2));
            		JOptionPane.showMessageDialog(null, "No se aceptan letras ", null, JOptionPane.INFORMATION_MESSAGE);
            		telefonoField.setText("");
            	}
            	else if (nombreField.getText().isEmpty() || apellidoField.getText().isEmpty() || fechaField.getText().isEmpty() || telefonoField.getText().isEmpty()) {
            	    JOptionPane.showMessageDialog(null, "No puede tener campos vacíos", null, JOptionPane.INFORMATION_MESSAGE);
            	}
            	else {
                cardlayout.show(contentPane, "Menu");
                nombreField.setText("");
                fechaField.setText("");
                telefonoField.setText("");
	            apellidoField.setText("");
            	}
            }
        });
        btnNewButton.setOpaque(false);
        btnNewButton.setBackground(new Color(238, 193, 111));
        btnNewButton.setBounds(277, 432, 85, 21);
        add(btnNewButton);

        JLabel img = new JLabel("");
        img.setFont(new Font("Unispace", Font.PLAIN, 10));
        img.setIcon(new ImageIcon(Menu.class.getResource("/imagenes/guardar.png")));
        img.setLocation(48, 421);
        img.setSize(47, 40);
        add(img);

        JButton btnNewButton_1 = new JButton("Subir foto");
        btnNewButton_1.setFont(new Font("Unispace", Font.PLAIN, 11));
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardlayout.show(contentPane, "SubirFoto");
                fotoSubida=true;
	    		foto();
            }
        });
        btnNewButton_1.setOpaque(false);
        btnNewButton_1.setBackground(new Color(238, 193, 111));
        btnNewButton_1.setBounds(48, 432, 112, 21);
        add(btnNewButton_1);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(238, 193, 111));
        panel.setBounds(0, 0, 430, 81);
        add(panel);
        panel.setLayout(null);

        JLabel lblNewLabel = new JLabel("Cliente");
        lblNewLabel.setForeground(new Color(0, 0, 0));
        lblNewLabel.setBounds(153, 21, 131, 35);
        panel.add(lblNewLabel);
        lblNewLabel.setBackground(new Color(233, 155, 24));
        lblNewLabel.setFont(new Font("Showcard Gothic", Font.PLAIN, 31));

        JButton btnNewButton_2 = new JButton("Eliminar");
        btnNewButton_2.setFont(new Font("Unispace", Font.PLAIN, 11));
        btnNewButton_2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		nombreField.setText("");
        		apellidoField.setText("");
        		fechaField.setText("");
        		telefonoField.setText("");
        	}
        });
        btnNewButton_2.setOpaque(false);
        btnNewButton_2.setBackground(new Color(238, 193, 111));
        btnNewButton_2.setBounds(170, 432, 97, 21);
        add(btnNewButton_2);
        
        JLabel txt = new JLabel("Foto");
        txt.setFont(new Font("Unispace", Font.PLAIN, 15));
        txt.setBounds(357, 197, 47, 20);
       add(txt);
       
       JLabel lblNewLabel_6 = new JLabel("$200");
       lblNewLabel_6.setFont(new Font("Unispace", Font.PLAIN, 15));
       lblNewLabel_6.setBounds(170, 388, 73, 21);
       add(lblNewLabel_6);
    }
    private void foto() {
        if(fotoSubida) {
            JLabel img2 = new JLabel();
            img2.setBounds(320, 100, 100, 100); 
            add(img2);
            img2.setIcon(new ImageIcon(Cliente.class.getResource("/imagenes/foto.jpg")));
            
           
            revalidate();
            repaint();
        }
    }
}

