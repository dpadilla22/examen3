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
		panel.setBackground(new Color(100, 91, 176));
		panel.setBounds(0, 0, 456, 593);
		add(panel);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(238, 193, 111));
		panel_1.setBounds(0, 0, 125, 593);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JButton btnNewButton = new JButton("Clientes");
		btnNewButton.setFont(new Font("Unispace", Font.PLAIN, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, "Clientes");
			}
		});
		btnNewButton.setBackground(new Color(238, 193, 111));
		btnNewButton.setBounds(219, 113, 161, 34);
		panel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Tarifas");
		btnNewButton_1.setFont(new Font("Unispace", Font.PLAIN, 18));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, "Tarifa");
			}
		});
		btnNewButton_1.setBackground(new Color(238, 193, 111));
		btnNewButton_1.setBounds(219, 230, 161, 34);
		panel.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Checador");
		btnNewButton_2.setFont(new Font("Unispace", Font.PLAIN, 18));
		btnNewButton_2.setBackground(new Color(238, 193, 111));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(219, 348, 161, 34);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Cerrar sesion");
		btnNewButton_3.setFont(new Font("Unispace", Font.PLAIN, 14));
		btnNewButton_3.setBackground(new Color(238, 193, 111));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, "Inicio");
			}
		});
		btnNewButton_3.setBounds(219, 454, 161, 34);
		panel.add(btnNewButton_3);
		
		JLabel img3 = new JLabel("");
		img3.setBounds(219, 0, 139, 126);
		panel.add(img3);
		img3.setFont(new Font("Bodoni MT Poster Compressed", Font.PLAIN, 10));
		img3.setIcon(new ImageIcon(Menu.class.getResource("/imagenes/gym.png")));
		
		JLabel img2 = new JLabel("");
		img2.setBounds(229, 136, 139, 126);
		panel.add(img2);
		img2.setFont(new Font("Bodoni MT Poster Compressed", Font.PLAIN, 10));
		img2.setIcon(new ImageIcon(Menu.class.getResource("/imagenes/dinero.png")));

	}
}
