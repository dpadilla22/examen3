package sistema;

import javax.swing.JPanel;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;

public class Menu extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Menu() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 128, 0));
		panel.setBounds(0, 0, 456, 583);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Clientes");
		lblNewLabel_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 31));
		lblNewLabel_1.setBounds(246, 174, 149, 73);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Tarifas");
		lblNewLabel_2.setFont(new Font("Tw Cen MT", Font.PLAIN, 31));
		lblNewLabel_2.setBounds(246, 296, 149, 34);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Checador");
		lblNewLabel_3.setFont(new Font("Tw Cen MT", Font.PLAIN, 32));
		lblNewLabel_3.setBounds(231, 386, 164, 55);
		panel.add(lblNewLabel_3);
		
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

	}
}
