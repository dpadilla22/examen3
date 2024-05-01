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
		panel.setBounds(10, 10, 436, 559);
		add(panel);
		panel.setLayout(null);

		JButton btnNewButton = new JButton("Clientes");
		btnNewButton.setFont(new Font("Unispace", Font.PLAIN, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, "Clientes");
			}
		});
		
		btnNewButton.setBackground(new Color(238, 193, 111));
		btnNewButton.setBounds(249, 192, 161, 34);
		panel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Tarifas");
		btnNewButton_1.setFont(new Font("Unispace", Font.PLAIN, 18));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, "Tarifa");
			}
		});
		
		btnNewButton_1.setBackground(new Color(238, 193, 111));
		btnNewButton_1.setBounds(53, 192, 161, 34);
		panel.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Checador");
		btnNewButton_2.setFont(new Font("Unispace", Font.PLAIN, 18));
		btnNewButton_2.setBackground(new Color(238, 193, 111));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane,"Checador");
			}
		});
		
		btnNewButton_2.setBounds(53, 385, 161, 34);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Cerrar sesion");
		btnNewButton_3.setFont(new Font("Unispace", Font.PLAIN, 13));
		btnNewButton_3.setBackground(new Color(238, 193, 111));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, "Inicio");
			}
		});
		
		btnNewButton_3.setBounds(249, 387, 157, 34);
		panel.add(btnNewButton_3);
		
		JLabel img2 = new JLabel("");
		img2.setBounds(53, 92, 139, 126);
		panel.add(img2);
		img2.setFont(new Font("Bodoni MT Poster Compressed", Font.PLAIN, 10));
		img2.setIcon(new ImageIcon(Menu.class.getResource("/imagenes/dinero.png")));
		
		JLabel img4 = new JLabel("");
		img4.setBounds(280, 95, 140, 126);
		panel.add(img4);
		img4.setFont(new Font("Bodoni MT Poster Compressed", Font.PLAIN, 10));
		img4.setIcon(new ImageIcon(Menu.class.getResource("/imagenes/gymR.png")));
		
		JLabel img5= new JLabel("");
		img5.setBounds(93, 292, 139, 121);
		panel.add(img5);
		img5.setFont(new Font("Bodoni MT Poster Compressed", Font.PLAIN, 10));
		img5.setIcon(new ImageIcon(Menu.class.getResource("/imagenes/checadorr.png")));
		
		JLabel img6 = new JLabel("");
		img6.setBounds(53, 65, 150, 161);
		panel.add(img6);
		img6.setFont(new Font("Bodoni MT Poster Compressed", Font.PLAIN, 10));
		img6.setIcon(new ImageIcon(Menu.class.getResource("/imagenes/c2.png")));
		
		JLabel img8 = new JLabel("");
		img8.setBounds(256, 76, 150, 150);
		panel.add(img8);
		img8.setFont(new Font("Bodoni MT Poster Compressed", Font.PLAIN, 10));
		img8.setIcon(new ImageIcon(Menu.class.getResource("/imagenes/c2.png")));
		
		JLabel img9 = new JLabel("");
		img9.setBounds(308, 281, 55, 150);
		panel.add(img9);
		img9.setFont(new Font("Bodoni MT Poster Compressed", Font.PLAIN, 10));
		img9.setIcon(new ImageIcon(Menu.class.getResource("/imagenes/cierre.png")));
		
		JLabel img10 = new JLabel("");
		img10.setBounds(53, 269, 150, 150);
		panel.add(img10);
		img10.setFont(new Font("Bodoni MT Poster Compressed", Font.PLAIN, 10));
		img10.setIcon(new ImageIcon(Menu.class.getResource("/imagenes/c2.png")));
		
		JLabel img7= new JLabel("");
		img7.setBounds(249, 279, 161, 134);
		panel.add(img7);
		img7.setFont(new Font("Bodoni MT Poster Compressed", Font.PLAIN, 10));
		img7.setIcon(new ImageIcon(Menu.class.getResource("/imagenes/c2.png")));

	}
}
