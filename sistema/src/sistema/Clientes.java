package sistema;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;



public class Clientes extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private CardLayout cardlayout;
	
	
	/**
	 * Create the panel.
	 */
	public Clientes(JPanel cambio) {
		setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(100, 91, 176));
		panel.setBounds(0, 0, 453, 544);
		add(panel);
		panel.setLayout(null);

		JLabel img2 = new JLabel("");
		img2.setBounds(24, 131, 150, 150);
		panel.add(img2);
		img2.setFont(new Font("Bodoni MT Poster Compressed", Font.PLAIN, 10));
		img2.setIcon(new ImageIcon(Clientes.class.getResource("/imagenes/lupa.png")));
		
		JLabel img5 = new JLabel("");
		img5.setBounds(24, 368, 150, 150);
		panel.add(img5);
		img5.setFont(new Font("Bodoni MT Poster Compressed", Font.PLAIN, 10));
		img5.setIcon(new ImageIcon(Clientes.class.getResource("/imagenes/editar.png")));
		
		JLabel img7 = new JLabel("");
		img7.setBounds(24, 245, 150, 150);
		panel.add(img7);
		img7.setFont(new Font("Bodoni MT Poster Compressed", Font.PLAIN, 10));
		img7.setIcon(new ImageIcon(Clientes.class.getResource("/imagenes/mas.png")));
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(0, 0, 456, 121);
		panel.add(panel_1);

		contentPane = cambio;
		cardlayout = (CardLayout) cambio.getLayout();
		panel_1.setLayout(null);

		JLabel img = new JLabel("");
		img.setBounds(66, 10, 100, 100);
		panel_1.add(img);
		img.setIcon(new ImageIcon(Menu.class.getResource("/imagenes/rata2.png")));

		JLabel lblNewLabel = new JLabel("GYM rat");
		lblNewLabel.setBounds(213, 46, 219, 37);
		panel_1.add(lblNewLabel);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Showcard Gothic", Font.PLAIN, 34));
		
		
				JLabel img6 = new JLabel("");
				img6.setBounds(0, 142, 155, 132);
				panel.add(img6);
				img6.setFont(new Font("Bodoni MT Poster Compressed", Font.PLAIN, 10));
				img6.setIcon(new ImageIcon(Clientes.class.getResource("/imagenes/c3.png")));
				
						JButton btnNewButton = new JButton("Consultar");
						btnNewButton.setFont(new Font("Unispace", Font.PLAIN, 15));
						btnNewButton.setBackground(new Color(238, 193, 111));
						btnNewButton.addActionListener(new ActionListener() {
						    public void actionPerformed(ActionEvent e) {
						    	
						    		cardlayout.show(contentPane, "ConsultarCliente");
						    	
						    }
						});
						btnNewButton.setOpaque(false);
						btnNewButton.setBounds(81, 187, 187, 43);
						panel.add(btnNewButton);
						
						JLabel img8 = new JLabel("");
						img8.setBounds(0, 368, 150, 150);
						panel.add(img8);
						img8.setFont(new Font("Bodoni MT Poster Compressed", Font.PLAIN, 10));
						img8.setIcon(new ImageIcon(Clientes.class.getResource("/imagenes/c3.png")));
						
								JButton btnNewButton_2 = new JButton("Editar");
								btnNewButton_2.setFont(new Font("Unispace", Font.PLAIN, 15));
								btnNewButton_2.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										
									            cardlayout.show(contentPane, "CrearUsuario");
									        		
									}
								});
								btnNewButton_2.setOpaque(false);
								btnNewButton_2.setBackground(new Color(238, 193, 111));
								btnNewButton_2.setBounds(81, 426, 187, 43);
								panel.add(btnNewButton_2);
								
								JLabel img3 = new JLabel("");
								img3.setBounds(0, 245, 150, 150);
								panel.add(img3);
								img3.setFont(new Font("Bodoni MT Poster Compressed", Font.PLAIN, 10));
								img3.setIcon(new ImageIcon(Clientes.class.getResource("/imagenes/c3.png")));
								
										JButton btnNewButton_1 = new JButton("Crear");
										btnNewButton_1.setFont(new Font("Unispace", Font.PLAIN, 15));
										btnNewButton_1.setBackground(new Color(238, 193, 111));
										btnNewButton_1.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												
												cardlayout.show(contentPane, "Cliente");
												 
											
											}});
										btnNewButton_1.setOpaque(false);
										btnNewButton_1.setBounds(81, 300, 187, 48);
										panel.add(btnNewButton_1);
	}
}
