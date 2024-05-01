package sistema;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class ConsultarCliente extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private CardLayout cardlayout;

	/**
	 * Create the panel.
	 */
	public ConsultarCliente(JPanel cambio) {
		setLayout(null);
		contentPane = cambio;
		cardlayout = (CardLayout) cambio.getLayout();
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 410, 499);
		panel.setBackground(new Color(100, 91, 176));
		add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Aqui va una foto");
		add(lblNewLabel);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(238, 193, 111));
		panel_2.setBounds(313, 4, 111, 38);
		panel.add(panel_2);
		panel_2.setLayout(null);

		JLabel lblNCliente = new JLabel("N CLiente");
		lblNCliente.setFont(new Font("Showcard Gothic", Font.PLAIN, 15));
		lblNCliente.setBackground(new Color(238, 193, 111));
		lblNCliente.setForeground(new Color(0, 0, 0));
		lblNCliente.setHorizontalAlignment(SwingConstants.CENTER);
		lblNCliente.setBounds(7, 5, 96, 15);
		lblNCliente.setOpaque(true);
		panel_2.add(lblNCliente);

		JLabel lblNewLabel_1 = new JLabel("323");
		lblNewLabel_1.setFont(new Font("Unispace", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(44, 25, 45, 13);
		panel_2.add(lblNewLabel_1);

		JButton btnNewButton_1_1 = new JButton("OK");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardlayout.show(contentPane, "Menu");
			}
		});
		btnNewButton_1_1.setOpaque(false);
		btnNewButton_1_1.setFont(new Font("Unispace", Font.PLAIN, 16));
		btnNewButton_1_1.setBounds(298, 424, 89, 23);
		btnNewButton_1_1.setBackground(new Color(238, 193, 111));
		panel.add(btnNewButton_1_1);

		JLabel lblNCliente_1_3 = new JLabel("Membresia");
		lblNCliente_1_3.setOpaque(true);
		lblNCliente_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNCliente_1_3.setForeground(Color.BLACK);
		lblNCliente_1_3.setFont(new Font("Unispace", Font.PLAIN, 17));
		lblNCliente_1_3.setBackground(new Color(238, 193, 111));
		lblNCliente_1_3.setBounds(10, 325, 390, 20);
		panel.add(lblNCliente_1_3);

		JLabel lblNCliente_1_3_1 = new JLabel("Telefono");
		lblNCliente_1_3_1.setOpaque(true);
		lblNCliente_1_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNCliente_1_3_1.setForeground(Color.BLACK);
		lblNCliente_1_3_1.setFont(new Font("Unispace", Font.PLAIN, 13));
		lblNCliente_1_3_1.setBackground(new Color(238, 193, 111));
		lblNCliente_1_3_1.setBounds(10, 115, 302, 20);
		panel.add(lblNCliente_1_3_1);

		JLabel lblNCliente_1_3_2 = new JLabel("Nombre");
		lblNCliente_1_3_2.setOpaque(true);
		lblNCliente_1_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNCliente_1_3_2.setForeground(Color.BLACK);
		lblNCliente_1_3_2.setFont(new Font("Unispace", Font.PLAIN, 13));
		lblNCliente_1_3_2.setBackground(new Color(238, 193, 111));
		lblNCliente_1_3_2.setBounds(10, 35, 302, 38);
		panel.add(lblNCliente_1_3_2);

		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("NORMAL");
		chckbxNewCheckBox_2.setSelected(true);
		chckbxNewCheckBox_2.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxNewCheckBox_2.setBackground(new Color(224, 218, 101));
		chckbxNewCheckBox_2.setFont(new Font("Unispace", Font.BOLD, 13));
		chckbxNewCheckBox_2.setBounds(10, 368, 111, 20);
		panel.add(chckbxNewCheckBox_2);

		JCheckBox chckbxNewCheckBox_2_1 = new JCheckBox("PLUS +");
		chckbxNewCheckBox_2_1.setEnabled(false);
		chckbxNewCheckBox_2_1.setFont(new Font("Unispace", Font.BOLD, 13));
		chckbxNewCheckBox_2_1.setBackground(new Color(224, 218, 101));
		chckbxNewCheckBox_2_1.setBounds(136, 368, 121, 20);
		panel.add(chckbxNewCheckBox_2_1);

		JCheckBox chckbxNewCheckBox_2_2 = new JCheckBox("GOL.DEN");
		chckbxNewCheckBox_2_2.setEnabled(false);
		chckbxNewCheckBox_2_2.setFont(new Font("Unispace", Font.BOLD, 13));
		chckbxNewCheckBox_2_2.setBackground(new Color(224, 218, 101));
		chckbxNewCheckBox_2_2.setBounds(276, 368, 117, 20);
		panel.add(chckbxNewCheckBox_2_2);

		JLabel lblNCliente_1_3_1_1 = new JLabel("Tabla de Asistencia");
		lblNCliente_1_3_1_1.setOpaque(true);
		lblNCliente_1_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNCliente_1_3_1_1.setForeground(Color.BLACK);
		lblNCliente_1_3_1_1.setFont(new Font("Unispace", Font.PLAIN, 13));
		lblNCliente_1_3_1_1.setBackground(new Color(238, 193, 111));
		lblNCliente_1_3_1_1.setBounds(10, 247, 302, 43);
		panel.add(lblNCliente_1_3_1_1);

		JButton btnEliminar_1 = new JButton("Lunes - Viernes - Sabado");
		btnEliminar_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		btnEliminar_1.setBounds(10, 288, 302, 23);
		panel.add(btnEliminar_1);

		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBackground(new Color(238, 193, 111));
		panel_2_1.setBounds(10, 4, 302, 38);
		panel.add(panel_2_1);

		JLabel img = new JLabel("");
		img.setBounds(98, 2, 30, 30);
		panel_2_1.add(img);
		img.setFont(new Font("Bodoni MT Poster Compressed", Font.PLAIN, 10));
		img.setIcon(new ImageIcon(ConsultarCliente.class.getResource("/imagenes/pesas.png")));

		JLabel lblGymrat = new JLabel("GYMrat");
		lblGymrat.setOpaque(true);
		lblGymrat.setHorizontalAlignment(SwingConstants.CENTER);
		lblGymrat.setForeground(Color.BLACK);
		lblGymrat.setFont(new Font("Showcard Gothic", Font.PLAIN, 17));
		lblGymrat.setBackground(new Color(238, 193, 111));
		lblGymrat.setBounds(79, 10, 182, 22);
		panel_2_1.add(lblGymrat);

		JLabel txt = new JLabel("Foto");
		txt.setFont(new Font("Unispace", Font.PLAIN, 17));
		txt.setBounds(340, 145, 47, 20);
		panel.add(txt);

		JLabel img2 = new JLabel();
		img2.setBounds(313, 35, 100, 100);
		panel.add(img2);
		img2.setIcon(new ImageIcon(ConsultarCliente.class.getResource("/imagenes/foto.jpg")));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 173, 302, 23);
		panel_1.setBackground(new Color(238, 193, 111));
		panel.add(panel_1);
		
		JLabel lblNewLabel_4 = new JLabel("Fecha de nacimiento");
		lblNewLabel_4.setFont(new Font("Unispace", Font.PLAIN, 13));
		lblNewLabel_4.setForeground(new Color(0, 0, 0));
		panel_1.add(lblNewLabel_4);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 70, 302, 248);
		panel_3.setBackground(new Color(100, 91, 176));
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("24/12/02");
		lblNewLabel_5.setBounds(0, 141, 97, 13);
		panel_3.add(lblNewLabel_5);
		lblNewLabel_5.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
		
				JLabel lblNewLabel_3 = new JLabel("6151139646");
				lblNewLabel_3.setBounds(0, 81, 155, 13);
				panel_3.add(lblNewLabel_3);
				lblNewLabel_3.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
				
						JLabel lblNewLabel_2 = new JLabel("Alexander Miranda Aguilar");
						lblNewLabel_2.setBounds(0, 20, 302, 13);
						panel_3.add(lblNewLabel_2);
						lblNewLabel_2.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
	}
}
