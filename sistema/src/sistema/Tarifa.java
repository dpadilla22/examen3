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
		panel.setBackground(new Color(128, 128, 255));
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
		lblNewLabel.setFont(new Font("Unispace", Font.PLAIN, 30));

		JButton btnNewButton = new JButton("Consultar");
		btnNewButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
				cardlayout.show(contentPane, "ConsultarTarifa");

		    }
		});
		panel.setLayout(null);
		btnNewButton.setBounds(170, 211, 113, 40);
		panel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Crear");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardlayout.show(contentPane, "CrearTarifa");
				
				 
			
			}});
		btnNewButton_1.setBounds(170, 285, 113, 40);
		panel.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Editar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardlayout.show(contentPane, "EditarTarifa");
			           
			        		
			}
		});
		btnNewButton_2.setBounds(170, 362, 113, 40);
		panel.add(btnNewButton_2);
		
		


	}

}
