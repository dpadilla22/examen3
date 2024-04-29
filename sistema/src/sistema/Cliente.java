package sistema;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cliente extends JPanel {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private CardLayout cardlayout;

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

		JLabel lblNewLabel_5 = new JLabel("telefono:");
		lblNewLabel_5.setFont(new Font("Tw Cen MT", Font.PLAIN, 21));
		lblNewLabel_5.setBounds(24, 355, 111, 43);
		add(lblNewLabel_5);


	    JTextField nombre = new JTextField("Alexander");
	    nombre.setBounds(134, 91, 211, 34);
	    add(nombre);

	    JTextField apellido = new JTextField("Mirandwa Aguilar");
	    
	    apellido.setBounds(134, 157, 211, 31);
	    add(apellido);

	    JTextField fecha = new JTextField("24/12/02");
	    
	    fecha.setBounds(203, 217, 141, 34);
	    add(fecha);

	    JTextField telefono = new JTextField("6151139646");
	    telefono.setBounds(126, 296, 219, 34);
	    add(telefono);

	    JTextField total = new JTextField("$ 350");
	    total.setBounds(123, 363, 222, 34);
	    add(total);
		
	    JButton btnNewButton = new JButton("Guardar");
	    btnNewButton.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            System.out.println("Nombre: " + nombre.getText().length());

	            if (nombre.getText().length()<=0) {
	                nombre.setBorder(new LineBorder(Color.RED, 2));
	            } else {
	                nombre.setBorder(new LineBorder(Color.GREEN, 2));
	            }

	            if (apellido.getText().isEmpty()) {
	                apellido.setBorder(new LineBorder(Color.RED, 2));
	            } else {
	                apellido.setBorder(new LineBorder(Color.GREEN, 2));
	            }

	            if (fecha.getText().isEmpty()) {
	                fecha.setBorder(new LineBorder(Color.RED, 2));
	            } else {
	                fecha.setBorder(new LineBorder(Color.GREEN, 2));
	            }

	            if (telefono.getText().isEmpty()) {
	                telefono.setBorder(new LineBorder(Color.RED, 2));
	            } else {
	                telefono.setBorder(new LineBorder(Color.GREEN, 2));
	            }

	            if (total.getText().isEmpty()) {
	                total.setBorder(new LineBorder(Color.RED, 2));
	            } else {
	                total.setBorder(new LineBorder(Color.GREEN, 2));
	            }

	            cardlayout.show(contentPane, "Menu");
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

