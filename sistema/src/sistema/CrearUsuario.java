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
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JComboBox;

//editar
public class CrearUsuario extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private CardLayout cardLayout;
	private JTextField nombre;
	private JTextField apellido;
	private JTextField fecha;
	private JTextField telefono;
	private boolean fotoSubida = false;

	/**
	 * Create the panel.
	 */
	public CrearUsuario(JPanel cambio) {
		setLayout(null);

		setBackground(new Color(100, 91, 176));
		setBounds(0, 0, 430, 520);
		setLayout(null);

		contentPane = cambio;
		cardLayout = (CardLayout) cambio.getLayout();

		JLabel img2 = new JLabel();
		img2.setBounds(317, 91, 100, 100);
		img2.setIcon(new ImageIcon(CrearUsuario.class.getResource("/imagenes/foto.jpg")));
		add(img2);

		JLabel txt = new JLabel("Foto");
		txt.setFont(new Font("Unispace", Font.PLAIN, 15));
		txt.setBounds(357, 197, 47, 20);
		add(txt);

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

		nombre = new JTextField("Alexander");
		nombre.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		nombre.setOpaque(false);
		nombre.setBounds(116, 102, 173, 20);
		add(nombre);

		apellido = new JTextField("Miranda Aguilar");
		apellido.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		apellido.setOpaque(false);
		apellido.setBounds(134, 157, 173, 20);
		add(apellido);

		fecha = new JTextField("24/12/02");
		fecha.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		fecha.setOpaque(false);
		fecha.setBounds(210, 225, 141, 25);
		add(fecha);

		telefono = new JTextField("6151139646");
		telefono.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		telefono.setOpaque(false);
		telefono.setBounds(116, 296, 99, 20);
		add(telefono);

		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.setFont(new Font("Unispace", Font.PLAIN, 15));
		btnNewButton.setBackground(new Color(238, 193, 111));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (telefono.getText().matches(".*[a-zA-Z].*")) {
					telefono.setBorder(new LineBorder(Color.RED, 2));
					JOptionPane.showMessageDialog(null, "No se aceptan letras ", null, JOptionPane.INFORMATION_MESSAGE);
					
				} else if (nombre.getText().isEmpty() || apellido.getText().isEmpty() || fecha.getText().isEmpty()
						|| telefono.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "No puede tener campos vacíos", null,JOptionPane.INFORMATION_MESSAGE);
					
				} else {
					cardLayout.show(contentPane, "Menu");
				}

			}

		});
		btnNewButton.setOpaque(false);
		btnNewButton.setBounds(235, 443, 103, 21);
		add(btnNewButton);

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

		JLabel lblNewLabel_7 = new JLabel("Foto");
		lblNewLabel_7.setFont(new Font("Tw Cen MT", Font.PLAIN, 21));
		lblNewLabel_7.setBounds(351, 163, 45, 13);
		add(lblNewLabel_7);

		JButton btnNewButton_2 = new JButton("Eliminar");
		btnNewButton_2.setFont(new Font("Unispace", Font.PLAIN, 15));
		btnNewButton_2.setBackground(new Color(238, 193, 111));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nombre.setText("");
				apellido.setText("");
				fecha.setText("");
				telefono.setText("");
			}
		});
		btnNewButton_2.setOpaque(false);
		btnNewButton_2.setBounds(90, 443, 111, 21);
		add(btnNewButton_2);

		String paquetes[] = { "General $200", "Plus $300", "Golden $450" };
		JComboBox comboBox = new JComboBox(paquetes);
		comboBox.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		comboBox.setBackground(new Color(238, 193, 111));
		comboBox.setOpaque(false);
		comboBox.setBounds(116, 369, 121, 21);
		add(comboBox);

	}
}
