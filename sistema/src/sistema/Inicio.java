package sistema;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Inicio extends JPanel {

	private JPanel contentPane;
	private CardLayout cardLayout;

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */

	public Inicio(JPanel cambio) {
		setBackground(new Color(100, 91, 176));
		setBounds(0, 0, 430, 520);
		setLayout(null);

		contentPane = cambio;
		cardLayout = (CardLayout) cambio.getLayout();

		JLabel lblNewLabel = new JLabel("Iniciar sesión");
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setForeground(new Color(238, 193, 111));
		lblNewLabel.setFont(new Font("Showcard Gothic", Font.PLAIN, 35));
		lblNewLabel.setBounds(79, 99, 265, 44);
		add(lblNewLabel);
		
		
		JLabel img = new JLabel("");
		img.setBounds(69, 213, 30, 30);
		add(img);
		img.setFont(new Font("Bodoni MT Poster Compressed", Font.PLAIN, 10));
		img.setIcon(new ImageIcon(Inicio.class.getResource("/imagenes/pesas.png")));
		
		JLabel img2 = new JLabel("");
		img2.setBounds(69, 321, 30, 30);
		add(img2);
		img2.setFont(new Font("Bodoni MT Poster Compressed", Font.PLAIN, 10));
		img2.setIcon(new ImageIcon(Inicio.class.getResource("/imagenes/candado.png")));
		
	
		
		JLabel lblNewLabel_1 = new JLabel("Nombre de usuario");
		lblNewLabel_1.setForeground(new Color(238, 193, 111));
		lblNewLabel_1.setFont(new Font("Unispace", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(118, 175, 194, 13);
		add(lblNewLabel_1);

		JTextField textField = new JTextField();
		textField.setBounds(118, 212, 185, 31);
		add(textField);
		textField.setColumns(2);

		JLabel lblNewLabel_2 = new JLabel("Contraseña");
		lblNewLabel_2.setForeground(new Color(238, 193, 111));
		lblNewLabel_2.setFont(new Font("Unispace", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(116, 289, 159, 13);
		add(lblNewLabel_2);

		JPasswordField passwordField = new JPasswordField();
		passwordField.setColumns(2);
		passwordField.setBounds(118, 321, 181, 31);
		add(passwordField);

		JButton btnNewButton = new JButton("Ingresar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 String username = textField.getText();
	              String password = new String(passwordField.getPassword());
	              
	              if(username.isEmpty()|| password.isEmpty()) {
	            	  JOptionPane.showMessageDialog(null, "Debe llenar todos los espacios", "Error", JOptionPane.INFORMATION_MESSAGE);
	              }else {
				JOptionPane.showMessageDialog(null, "registro exitoso", "Success", JOptionPane.INFORMATION_MESSAGE);
				cardLayout.show(contentPane, "Menu");
				 textField.setText("");
                 passwordField.setText(null);
			
				}
	             

			}
		});
		btnNewButton.setBackground(new Color(238, 193, 111));
		btnNewButton.setFont(new Font("Tw Cen MT", Font.PLAIN, 10));
		btnNewButton.setBounds(149, 391, 126, 31);
		add(btnNewButton);
	}

}
