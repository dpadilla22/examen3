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
		panel.setBackground(new Color(251, 175, 106));
		panel.setBounds(0, 0, 453, 544);
		add(panel);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(0, 0, 456, 121);
		panel.add(panel_1);

		contentPane = cambio;
		cardlayout = (CardLayout) cambio.getLayout();

		JLabel img = new JLabel("");
		panel_1.add(img);
		img.setIcon(new ImageIcon(Menu.class.getResource("/imagenes/rata2.png")));

		JLabel lblNewLabel = new JLabel("GYM rat");
		panel_1.add(lblNewLabel);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Unispace", Font.PLAIN, 30));

		JButton btnNewButton = new JButton("Consultar");
		btnNewButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    }
		});
		btnNewButton.setBounds(160, 207, 133, 43);
		panel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Crear");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				cardlayout.show(contentPane, "Cliente");
				 
			
			}});
		btnNewButton_1.setBounds(160, 293, 133, 48);
		panel.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Editar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			            cardlayout.show(contentPane, "CrearUsuario");
			        		
			}
		});
		btnNewButton_2.setBounds(160, 387, 133, 43);
		panel.add(btnNewButton_2);

		 
	}
}
