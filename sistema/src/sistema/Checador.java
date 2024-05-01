package sistema;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;

public class Checador extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private CardLayout cardlayout;

	/**
	 * Create the panel.
	 */
	public Checador(JPanel cambio) {
		setLayout(null);
		
		contentPane= cambio;
		cardlayout = (CardLayout) cambio.getLayout();
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 424, 517);
		panel.setBackground(new Color(100, 91, 176));
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ingrese su PIN");
        lblNewLabel.setBackground(new Color(255, 255, 128));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Showcard Gothic", Font.PLAIN, 25));
        lblNewLabel.setBounds(107, 179, 237, 29);
        panel.add(lblNewLabel);
        
        JPasswordField  passwordField = new JPasswordField();
        passwordField.setFont(new Font("Tahoma", Font.PLAIN, 20));
        passwordField.setBounds(139, 219, 168, 37);
        panel.add(passwordField);
        
        JPanel panel_2 = new JPanel();
        panel_2.setBackground(new Color(255, 255, 128));
        panel_2.setBounds(222, 15, 1, 1);
        panel.add(panel_2);
        panel_2.setLayout(null);
        
        JButton btnNewButton = new JButton("Acceder");
        btnNewButton.setFont(new Font("Unispace", Font.PLAIN, 16));
        btnNewButton.setBounds(166, 278, 114, 29);
        btnNewButton.setBackground(new Color(238, 193, 111));
        panel.add(btnNewButton);
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String enteredPIN = new String(passwordField.getPassword());
                
                if (enteredPIN.equals("1234")) {
                    JOptionPane.showMessageDialog(null, "PIN correcto");
                    cardlayout.show(contentPane,"Menu");
                } else {
                    JOptionPane.showMessageDialog(null, "PIN No Valido");
                }
                passwordField.setText("");
            }
        });
    }
		
		
		

	
}
