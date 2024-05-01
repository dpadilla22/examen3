package sistema;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SubirFoto extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private CardLayout cardlayout;

	/**
	 * Create the panel.
	 */
	public SubirFoto(JPanel cambio) {
		setLayout(null);
		
		contentPane= cambio;
		cardlayout = (CardLayout) cambio.getLayout();
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(100, 91, 176));
		panel.setBounds(10, 10, 430, 556);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Subiendo foto...");
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.PLAIN, 21));
		lblNewLabel.setBounds(144, 312, 175, 39);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.setFont(new Font("Unispace", Font.PLAIN, 17));
		btnNewButton.setBackground(new Color(238, 193, 111));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardlayout.show(contentPane,"Cliente");
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(166, 361, 85, 21);
		panel.add(btnNewButton);
		
		JLabel img= new JLabel();
		img.setBounds(161, 191, 127, 115);
		panel.add(img);
		img.setIcon(new ImageIcon(SubirFoto.class.getResource("/imagenes/foto.jpg")));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(156, 191, 110, 115);
		panel_1.setBackground(new Color(238, 193, 111));
		panel.add(panel_1);

	}
}
