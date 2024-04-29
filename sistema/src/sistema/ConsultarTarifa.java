package sistema;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConsultarTarifa extends JPanel {

	private static final long serialVersionUID = 1L;
	protected static final CardLayout Cardlayout = null;
	private JPanel contentPane;
	private CardLayout cardlayout;
	

	/**
	 * Create the panel.
	 */
	public ConsultarTarifa(JPanel cambio) {
		setBounds(100, 100, 457, 565);
		setLayout(null);
		contentPane= cambio;
		cardlayout = (CardLayout) cambio.getLayout();
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(232, 205, 125));
		panel.setBounds(10, 10, 437, 545);
		add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(0, 0, 437, 81);
		panel.add(panel_1);
		
	
		
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
		btnNewButton.setBounds(290, 453, 85, 21);
		panel.add(btnNewButton);
		
		String precios[]= {"Paquete basico: $250","Paquete mini rata: $350","Paquete power: $400"};
		String opciones[]= {"Gabriel","Juan","Diego","Emanuel","Laura"};
		
		JComboBox entrenador = new JComboBox(opciones);
		entrenador.setBounds(125, 372, 121, 33);
		panel.add(entrenador);
		
		JComboBox comboBox = new JComboBox(precios);
		comboBox.setBounds(165, 178, 147, 21);
		panel.add(comboBox);

	}

}
