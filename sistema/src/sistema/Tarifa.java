package sistema;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Tarifa extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private CardLayout cardlayout;

	/**
	 * Create the panel.
	 */
	public Tarifa(JPanel cambio) {
		setLayout(null);
		contentPane= cambio;
		cardlayout = (CardLayout) cambio.getLayout();
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(100, 91, 176));
		panel.setBounds(10, 10, 430, 536);
		add(panel);

		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(0, 0, 430, 113);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel img = new JLabel("");
		img.setBounds(27, 0, 100, 114);
		panel_1.add(img);
		img.setIcon(new ImageIcon(Tarifa.class.getResource("/imagenes/rata2.png")));
		
		JLabel lblNewLabel = new JLabel("GYM rat");
		lblNewLabel.setBounds(177, 32, 220, 46);
		panel_1.add(lblNewLabel);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Showcard Gothic", Font.PLAIN, 34));
		panel.setLayout(null);
		
		JLabel img2 = new JLabel("");
		img2.setBounds(24, 130, 85, 150);
		panel.add(img2);
		img2.setFont(new Font("Bodoni MT Poster Compressed", Font.PLAIN, 10));
		img2.setIcon(new ImageIcon(Tarifa.class.getResource("/imagenes/lupa.png")));
		
		JLabel img5 = new JLabel("");
		img5.setBounds(24, 357, 97, 150);
		panel.add(img5);
		img5.setFont(new Font("Bodoni MT Poster Compressed", Font.PLAIN, 10));
		img5.setIcon(new ImageIcon(Tarifa.class.getResource("/imagenes/editar.png")));
		
		JLabel img7 = new JLabel("");
		img7.setBounds(24, 249, 150, 150);
		panel.add(img7);
		img7.setFont(new Font("Bodoni MT Poster Compressed", Font.PLAIN, 10));
		img7.setIcon(new ImageIcon(Tarifa.class.getResource("/imagenes/mas.png")));
		
		JLabel img6 = new JLabel("");
		img6.setBounds(0, 261, 155, 132);
		panel.add(img6);
		img6.setFont(new Font("Bodoni MT Poster Compressed", Font.PLAIN, 10));
		img6.setIcon(new ImageIcon(Tarifa.class.getResource("/imagenes/c3.png")));
		
		JLabel img1 = new JLabel("");
		img1.setBounds(0, 374, 113, 132);
		panel.add(img1);
		img1.setFont(new Font("Bodoni MT Poster Compressed", Font.PLAIN, 10));
		img1.setIcon(new ImageIcon(Tarifa.class.getResource("/imagenes/c3.png")));
		
		JLabel img4 = new JLabel("");
		img4.setBounds(0, 142, 155, 132);
		panel.add(img4);
		img4.setFont(new Font("Bodoni MT Poster Compressed", Font.PLAIN, 10));
		img4.setIcon(new ImageIcon(Clientes.class.getResource("/imagenes/c3.png")));
		
				JButton btnNewButton = new JButton("Consultar");
				btnNewButton.setBackground(new Color(238, 193, 111));
				btnNewButton.setFont(new Font("Unispace", Font.PLAIN, 14));
				btnNewButton.addActionListener(new ActionListener() {
				    public void actionPerformed(ActionEvent e) {
						cardlayout.show(contentPane, "ConsultarTarifa");
					

				    }
				});
				btnNewButton.setOpaque(false);
				btnNewButton.setBounds(89, 191, 113, 40);
				panel.add(btnNewButton);
				
						JButton btnNewButton_1 = new JButton("Crear");
						btnNewButton_1.setFont(new Font("Unispace", Font.PLAIN, 14));
						btnNewButton_1.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								cardlayout.show(contentPane, "CrearTarifa");
								
								 
							
							}});
						btnNewButton_1.setOpaque(false);
						btnNewButton_1.setBounds(77, 307, 125, 40);
						btnNewButton_1.setBackground(new Color(238, 193, 111));
						
								panel.add(btnNewButton_1);
								
										JButton btnNewButton_2 = new JButton("Editar");
										btnNewButton_2.setFont(new Font("Unispace", Font.PLAIN, 14));
										btnNewButton_2.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												cardlayout.show(contentPane, "CrearTarifa");
											           
											        		
											}
										});
										btnNewButton_2.setOpaque(false);
										btnNewButton_2.setBackground(new Color(238, 193, 111));
										btnNewButton_2.setBounds(89, 427, 113, 40);
										panel.add(btnNewButton_2);


	}

}
