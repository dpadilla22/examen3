package sistema;

import javax.swing.JPanel;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu extends JPanel {
	private JPanel contentPane;
	private CardLayout cardLayout;
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Menu(JPanel cambio) {
		setLayout(null);

		contentPane = cambio;
		cardLayout = (CardLayout) cambio.getLayout();

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 128, 0));
		panel.setBounds(0, 0, 456, 583);
		add(panel);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(0, 0, 456, 121);
		panel.add(panel_1);

		JLabel img = new JLabel("");
		panel_1.add(img);
		img.setIcon(new ImageIcon(Menu.class.getResource("/imagenes/rata2.png")));

		JLabel lblNewLabel = new JLabel("Rata GYM");
		panel_1.add(lblNewLabel);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Unispace", Font.PLAIN, 30));

		JButton btnNewButton = new JButton("Clientes");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, "Clientes");
			}
		});
		btnNewButton.setBackground(new Color(0, 64, 128));
		btnNewButton.setBounds(233, 206, 126, 34);
		panel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Tarifas");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, "Tarifa");
			}
		});
		btnNewButton_1.setBackground(new Color(0, 64, 128));
		btnNewButton_1.setBounds(231, 295, 128, 34);
		panel.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Checador");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(236, 385, 123, 34);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Cerrar sesion");
		btnNewButton_3.setBackground(new Color(128, 128, 255));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, "Inicio");
			}
		});
		btnNewButton_3.setBounds(287, 463, 113, 21);
		panel.add(btnNewButton_3);

	}
}
