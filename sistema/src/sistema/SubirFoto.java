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
		panel.setBackground(new Color(92, 167, 211));
		panel.setBounds(10, 10, 430, 556);
		add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(153, 188, 140, 114);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel img= new JLabel();
		img.setBounds(48, 35, 40, 40);
		panel_1.add(img);
		img.setIcon(new ImageIcon(SubirFoto.class.getResource("/imagenes/ratita.png")));
		
		JLabel lblNewLabel = new JLabel("Subiendo foto...");
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.PLAIN, 21));
		lblNewLabel.setBounds(153, 333, 175, 39);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardlayout.show(contentPane,"CrearUsuario");
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(185, 382, 85, 21);
		panel.add(btnNewButton);

	}
}
