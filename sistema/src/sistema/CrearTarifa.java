package sistema;

import javax.swing.JPanel;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class CrearTarifa extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private CardLayout cardlayout;
	private JTextField txtAlexanderMirandaAguilar;

	/**
	 * Create the panel.
	 */
	public CrearTarifa(JPanel cambio) {
		setLayout(null);

		contentPane = cambio;
		cardlayout = (CardLayout) cambio.getLayout();

		JPanel panel = new JPanel();
		panel.setBackground(new Color(100, 91, 176));
		panel.setBounds(10, 10, 410, 504);
		add(panel);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(238, 193, 111));
		panel_1.setBounds(0, 0, 410, 80);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel = new JLabel("Tarifas");
		lblNewLabel.setFont(new Font("Showcard Gothic", Font.PLAIN, 34));
		lblNewLabel.setBounds(141, 27, 193, 43);
		panel_1.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Cliente: ");
		lblNewLabel_1.setFont(new Font("Unispace", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(10, 121, 88, 21);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Cuota mensual: ");
		lblNewLabel_2.setFont(new Font("Unispace", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(10, 169, 197, 33);
		panel.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Fecha valida inicial: ");
		lblNewLabel_3.setFont(new Font("Unispace", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(10, 246, 216, 13);
		panel.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Fecha valida final:");
		lblNewLabel_4.setFont(new Font("Unispace", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(6, 321, 186, 13);
		panel.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("Entrenador:");
		lblNewLabel_5.setFont(new Font("Unispace", Font.PLAIN, 16));
		lblNewLabel_5.setBounds(10, 383, 138, 13);
		panel.add(lblNewLabel_5);

		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.setFont(new Font("Unispace", Font.PLAIN, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtAlexanderMirandaAguilar.getText().isEmpty()) {
					txtAlexanderMirandaAguilar.setBorder(new LineBorder(Color.RED, 2));
					JOptionPane.showMessageDialog(null, "No se aceptan campos vacios ", null,
							JOptionPane.INFORMATION_MESSAGE);
				} else {
					txtAlexanderMirandaAguilar.setBorder(new LineBorder(Color.white, 2));
					cardlayout.show(contentPane, "Menu");
				}
			}
		});
		btnNewButton.setOpaque(false);
		btnNewButton.setBounds(261, 445, 104, 21);
		panel.add(btnNewButton);

		String opciones[] = { "Gabriel", "Juan", "Diego", "Emanuel", "Laura" };

		JComboBox entrenador = new JComboBox(opciones);
		entrenador.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
		entrenador.setOpaque(false);
		entrenador.setBackground(new Color(238, 193, 111));
		entrenador.setBounds(127, 381, 121, 21);
		panel.add(entrenador);

		String paquetes[] = { "General $200", "Plus $300", "Golden $450" };
		JComboBox comboBox = new JComboBox(paquetes);
		comboBox.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		comboBox.setBackground(new Color(238, 193, 111));
		comboBox.setOpaque(false);
		comboBox.setBounds(164, 177, 159, 21);
		panel.add(comboBox);

		JLabel lblNewLabel_7 = new JLabel("Martes 30 de abril");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_7.setBounds(212, 247, 145, 13);
		panel.add(lblNewLabel_7);

		txtAlexanderMirandaAguilar = new JTextField();
		txtAlexanderMirandaAguilar.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		txtAlexanderMirandaAguilar.setOpaque(false);

		txtAlexanderMirandaAguilar.setText("Alexander Miranda Aguilar");
		txtAlexanderMirandaAguilar.setBounds(92, 124, 173, 19);
		panel.add(txtAlexanderMirandaAguilar);
		txtAlexanderMirandaAguilar.setColumns(10);

		JButton btnNewButton_1 = new JButton("Eliminar");
		btnNewButton_1.setFont(new Font("Unispace", Font.PLAIN, 15));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtAlexanderMirandaAguilar.setText("");
			}
		});
		btnNewButton_1.setOpaque(false);
		btnNewButton_1.setBounds(111, 445, 115, 21);
		panel.add(btnNewButton_1);

		JLabel lblNewLabel_6 = new JLabel("Jueves 30 de Mayo");
		lblNewLabel_6.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(189, 321, 168, 14);
		panel.add(lblNewLabel_6);

	}
}
