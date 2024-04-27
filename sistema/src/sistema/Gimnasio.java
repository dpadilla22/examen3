package sistema;

import sistema.Menu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;



import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Gimnasio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gimnasio frame = new Gimnasio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Gimnasio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 457, 565);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Checador");
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("Clientes");
		menuBar.add(mnNewMenu_1);
		
		JMenu mnNewMenu_2 = new JMenu("Tarifas");
		menuBar.add(mnNewMenu_2);
		
		JMenu mnNewMenu_3 = new JMenu("Logout");
		menuBar.add(mnNewMenu_3);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(251, 175, 106));
		panel.setBounds(0, 0, 454, 518);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("rata GYM");
		lblNewLabel.setFont(new Font("Snap ITC", Font.PLAIN, 25));
		lblNewLabel.setBounds(200, -13, 175, 117);
		panel.add(lblNewLabel);
		
		JLabel img = new JLabel("");
		img.setIcon(new ImageIcon(Gimnasio.class.getResource("/imagenes/rata.png")));
		img.setLocation(39, 68);
		img.setSize(415, 440);
		panel.add(img);
		
		//btnNewButton_2.setIcon(new ImageIcon(Memoria.class.getResource("/cartas/zorito.jpg")));
		JButton btnNewButton = new JButton("Iniciar sesion");
		btnNewButton.setFont(new Font("Unispace", Font.PLAIN, 9));
		btnNewButton.setBackground(new Color(255, 128, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				getContentPane().removeAll();
				Inicio();
				revalidate();
				repaint();
			}
		});
		btnNewButton.setBounds(166, 445, 118, 39);
		panel.add(btnNewButton);
	}
	
	public void Inicio() {
		 contentPane.setBackground(new Color(251, 175, 106));
		
		setBounds(100, 100, 457, 565);
		getContentPane().setLayout(null);
		
		
		
		JLabel lblNewLabel = new JLabel("Iniciar sesión");
		lblNewLabel.setForeground(Color.black);
		lblNewLabel.setFont(new Font("Snap ITC", Font.PLAIN, 25));
		lblNewLabel.setBounds(118, 70, 300, 31);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre de usuario");
		lblNewLabel_1.setFont(new Font("Unispace", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(118, 154, 194, 13);
		getContentPane().add(lblNewLabel_1);
		
		JTextField textField = new JTextField();
		textField.setBounds(118, 188, 185, 31);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Contraseña");
		lblNewLabel_2.setFont(new Font("unispace", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(122, 242, 159, 13);
		getContentPane().add(lblNewLabel_2);
		
		JPasswordField passwordField = new JPasswordField();
		passwordField.setBounds(119, 279, 184, 31);
		getContentPane().add(passwordField);
		
		JLabel lblNewLabel_3 = new JLabel("¿Olvidaste la Contraseña?");
		lblNewLabel_3.setFont(new Font("unispace", Font.PLAIN, 10));
		lblNewLabel_3.setBounds(130, 320, 170, 13);
		getContentPane().add(lblNewLabel_3);
		
		
		JButton btnNewButton = new JButton("Ingresar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 String username = textField.getText();
	              String password = new String(passwordField.getPassword());
	              
	              if(username.isEmpty()|| password.isEmpty()) {
	            	  JOptionPane.showMessageDialog(null, "debe llenar todos los espacios", "Error", JOptionPane.INFORMATION_MESSAGE);
	              }else {
				JOptionPane.showMessageDialog(null, "registro exitoso", "Success", JOptionPane.INFORMATION_MESSAGE);
				getContentPane().removeAll();
				Menu();
				revalidate();
				repaint();
			
				}
			}});
		btnNewButton.setBounds(150, 350, 118, 39);
		getContentPane().add(btnNewButton);
	}
	public void Menu() {
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
