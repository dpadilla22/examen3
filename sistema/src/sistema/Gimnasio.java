package sistema;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Gimnasio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private CardLayout cardLayout;

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

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout());
		cardLayout = (CardLayout) contentPane.getLayout();

		JPanel panel = new JPanel();
		panel.setBackground(new Color(100, 91, 176));
		panel.setBounds(0, 0, 454, 518);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("GYM rat");
		lblNewLabel.setForeground(new Color(238, 193, 111));
		lblNewLabel.setBounds(109, -14, 241, 117);
		lblNewLabel.setFont(new Font("Showcard Gothic", Font.PLAIN, 45));
		panel.add(lblNewLabel);

		JButton btnNewButton = new JButton("Iniciar sesión");
		btnNewButton.setBounds(125, 438, 213, 39);
		panel.add(btnNewButton);
		btnNewButton.setFont(new Font("Unispace", Font.PLAIN, 15));
		btnNewButton.setBackground(new Color(238, 193, 111));

		JLabel img = new JLabel("");
		img.setBounds(0, 57, 349, 356);
		panel.add(img);
		img.setFont(new Font("Bodoni MT Poster Compressed", Font.PLAIN, 10));
		img.setIcon(new ImageIcon(Gimnasio.class.getResource("/imagenes/rataPrincipal.png")));
		
		JLabel img2 = new JLabel("");
		img2.setBounds(61, 57, 400, 356);
		panel.add(img2);
		img2.setFont(new Font("Bodoni MT Poster Compressed", Font.PLAIN, 10));
		img2.setIcon(new ImageIcon(Gimnasio.class.getResource("/imagenes/c1.png")));

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(238, 193, 111));
		panel_1.setBounds(0, 283, 433, 108);
		panel.add(panel_1);
		panel_1.setLayout(null);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				cardLayout.show(contentPane, "Inicio");
			}
		});

		Inicio inicioSesion = new Inicio(contentPane);
		Menu menuPanel = new Menu(contentPane);
		Clientes clientesPanel = new Clientes(contentPane);
		Cliente clientePane = new Cliente(contentPane);
		CrearUsuario crearUsuarioPane = new CrearUsuario(contentPane);
		SubirFoto subirFotoPane = new SubirFoto(contentPane);
		Tarifa tarifaPane = new Tarifa(contentPane);
		CrearTarifa crearTarifaPane = new CrearTarifa(contentPane);
		EditarTarifa editarTarifaPane = new EditarTarifa(contentPane);
		ConsultarTarifa consultarTarifaPane = new ConsultarTarifa(contentPane);

		contentPane.add(inicioSesion, "Inicio");
		contentPane.add(menuPanel, "Menu");
		contentPane.add(clientesPanel, "Clientes");
		contentPane.add(clientePane, "Cliente");
		contentPane.add(crearUsuarioPane, "CrearUsuario");
		contentPane.add(subirFotoPane, "SubirFoto");
		contentPane.add(tarifaPane, "Tarifa");
		contentPane.add(crearTarifaPane, "CrearTarifa");
		contentPane.add(editarTarifaPane, "EditarTarifa");
		contentPane.add(consultarTarifaPane, "ConsultarTarifa");

	}

	public void showInicioPanel() {
		cardLayout.show(contentPane, "Inicio");
	}

	public void showMenuPanel() {
		cardLayout.show(contentPane, "Menu");
	}

	public void showClientesPanel() {
		cardLayout.show(contentPane, "Clientes");
	}

	public void showUusarioPane() {
		cardLayout.show(contentPane, "Cliente");
	}

	public void showCrearUsuario() {
		cardLayout.show(contentPane, "CrearUsuario");
	}

	public void showSubirFoto() {
		cardLayout.show(contentPane, "SubirFoto");
	}

	public void Tarifapane() {
		cardLayout.show(contentPane, "Tarifa");
	}

	public void CrearTarifaPane() {
		cardLayout.show(contentPane, "CrearTarifa");
	}

	public void EditarTarifaPane() {
		cardLayout.show(contentPane, "EditarTarifa");
	}

	public void ConsultarTarifaPane() {
		cardLayout.show(contentPane, "ConsultarTarifa");
	}
}
