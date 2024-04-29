package sistema;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
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
		setBackground(new Color(251, 175, 106));
		setBounds(0, 0, 430, 520);
		setLayout(null);

		contentPane = cambio;
		cardLayout = (CardLayout) cambio.getLayout();

		JLabel lblNewLabel = new JLabel("Iniciar sesión");
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Snap ITC", Font.PLAIN, 35));
		lblNewLabel.setBounds(86, 91, 275, 31);
		add(lblNewLabel);
		
		

		JLabel lblNewLabel_1 = new JLabel("Nombre de usuario");
		lblNewLabel_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(118, 154, 194, 13);
		add(lblNewLabel_1);

		JTextField textField = new JTextField();
		textField.setBounds(118, 188, 185, 31);
		add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Contraseña");
		lblNewLabel_2.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(122, 242, 159, 13);
		add(lblNewLabel_2);

		JPasswordField passwordField = new JPasswordField();
		passwordField.setBounds(119, 279, 184, 31);
		add(passwordField);

		JButton btnNewButton = new JButton("Ingresar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, "Menu");

			}
		});
		btnNewButton.setBackground(new Color(243, 148, 232));
		btnNewButton.setFont(new Font("Tw Cen MT", Font.PLAIN, 10));
		btnNewButton.setBounds(142, 348, 126, 31);
		add(btnNewButton);
	}

}
