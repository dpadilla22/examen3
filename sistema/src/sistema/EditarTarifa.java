package sistema;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EditarTarifa extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private CardLayout cardlayout;
	/**
	 * Create the panel.
	 */
	public EditarTarifa(JPanel cambio ) {
		setLayout(null);
		
		contentPane= cambio;
		cardlayout = (CardLayout) cambio.getLayout();
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(233, 166, 105));
		panel.setBounds(10, 10, 417, 490);
		add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(10, 10, 390, 69);
		add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Tarifas");
		lblNewLabel.setFont(new Font("Unispace", Font.PLAIN, 30));
		lblNewLabel.setBounds(141, 10, 193, 43);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Cliente: ");
		lblNewLabel_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 21));
		lblNewLabel_1.setBounds(10, 121, 88, 21);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Cuota mensual: ");
		lblNewLabel_2.setFont(new Font("Tw Cen MT", Font.PLAIN, 21));
		lblNewLabel_2.setBounds(10, 169, 197, 33);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Fecha valida inicial: ");
		lblNewLabel_3.setFont(new Font("Tw Cen MT", Font.PLAIN, 21));
		lblNewLabel_3.setBounds(10, 246, 182, 13);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Fecha valida final:");
		lblNewLabel_4.setFont(new Font("Tw Cen MT", Font.PLAIN, 21));
		lblNewLabel_4.setBounds(6, 321, 186, 13);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Entrenador:");
		lblNewLabel_5.setFont(new Font("Tw Cen MT", Font.PLAIN, 21));
		lblNewLabel_5.setBounds(10, 383, 138, 13);
		panel.add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardlayout.show(contentPane,"Menu");
			}
		});
		btnNewButton.setBounds(261, 445, 85, 21);
		panel.add(btnNewButton);
		
		
		String opciones[]= {"Gabriel","Juan","Diego","Emanuel","Laura"};
		
		JComboBox entrenador = new JComboBox(opciones);
		entrenador.setBounds(125, 372, 121, 33);
		panel.add(entrenador);

	}

}
