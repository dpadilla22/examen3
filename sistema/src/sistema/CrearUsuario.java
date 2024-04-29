package sistema;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class CrearUsuario extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private CardLayout cardLayout;
	 private JTextField nombre;
	    private JTextField apellido;
	    private JTextField fecha;
	    private JTextField telefono;
	    private boolean fotoSubida=false;


	/**
	 * Create the panel.
	 */
	public CrearUsuario(JPanel cambio) {
		setLayout(null);

		setBackground(new Color(251, 175, 106));
		setBounds(0, 0, 430, 520);
		setLayout(null);


		contentPane = cambio;
		cardLayout = (CardLayout) cambio.getLayout();

		JLabel lblNewLabel_1 = new JLabel("Nombres:");
		lblNewLabel_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 21));
		lblNewLabel_1.setBounds(20, 91, 141, 34);
		add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Apellido:");
		lblNewLabel_2.setFont(new Font("Tw Cen MT", Font.PLAIN, 21));
		lblNewLabel_2.setBounds(23, 157, 86, 25);
		add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Fecha de nacimiento:");
		lblNewLabel_3.setFont(new Font("Tw Cen MT", Font.PLAIN, 21));
		lblNewLabel_3.setBounds(20, 217, 180, 34);
		add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Telefono:");
		lblNewLabel_4.setFont(new Font("Tw Cen MT", Font.PLAIN, 21));
		lblNewLabel_4.setBounds(20, 297, 99, 25);
		add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("Total:");
		lblNewLabel_5.setFont(new Font("Tw Cen MT", Font.PLAIN, 21));
		lblNewLabel_5.setBounds(24, 355, 111, 43);
		add(lblNewLabel_5);


	     nombre = new JTextField();
	    nombre.setBounds(134, 91, 173, 34);
	    add(nombre);

	     apellido = new JTextField();
	    
	    apellido.setBounds(134, 157, 173, 31);
	    add(apellido);

	     fecha = new JTextField();
	    
	    fecha.setBounds(203, 217, 141, 34);
	    add(fecha);

	     telefono = new JTextField();
	    telefono.setBounds(126, 296, 99, 34);
	    add(telefono);

	    JLabel total = new JLabel(" $ 290");
	    total.setBounds(85, 362, 222, 34);
	    add(total);
		
	    JButton btnNewButton = new JButton("Guardar");
	    btnNewButton.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            System.out.println("Nombre: " + nombre.getText().length());

	            if (nombre.getText().isEmpty()) {
	                nombre.setBorder(new LineBorder(Color.RED, 2));
	            } else {
	                nombre.setBorder(new LineBorder(Color.GREEN, 2));
	            }

	            if (apellido.getText().isEmpty()) {
	                apellido.setBorder(new LineBorder(Color.RED, 2));
	            } else {
	                apellido.setBorder(new LineBorder(Color.GREEN, 2));
	            }

	            if (fecha.getText().isEmpty()) {
	                fecha.setBorder(new LineBorder(Color.RED, 2));
	            } else {
	                fecha.setBorder(new LineBorder(Color.GREEN, 2));
	            }

	            if (telefono.getText().isEmpty()) {
	                telefono.setBorder(new LineBorder(Color.RED, 2));
	            } else {
	                telefono.setBorder(new LineBorder(Color.GREEN, 2));
	            }

	          
	            cardLayout.show(contentPane, "Menu");
	           
	            
               
	           
	        }
	    });
	    btnNewButton.setBounds(253, 443, 85, 21);
	    add(btnNewButton);
	    
	    JLabel img = new JLabel("");
		img.setIcon(new ImageIcon(Menu.class.getResource("/imagenes/guardar.png")));
		img.setLocation(55, 432);
		img.setSize(40, 40);
		add(img);
	    
	    JButton btnNewButton_1 = new JButton("Subir foto");
	    btnNewButton_1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		fotoSubida=false;
	    		cardLayout.show(contentPane,"SubirFoto");
	    		fotoSubida=true;
	    		foto();
	    	}
	    });
	    btnNewButton_1.setBounds(53, 443, 95, 21);
	    add(btnNewButton_1);
	    
	    JPanel panel = new JPanel();
	    panel.setBackground(new Color(0, 0, 0));
	    panel.setBounds(0, 0, 430, 81);
	    add(panel);
	    panel.setLayout(null);
	    
	    
	    JLabel lblNewLabel = new JLabel("Cliente");
	    lblNewLabel.setForeground(new Color(255, 255, 255));
	    lblNewLabel.setBounds(153, 21, 131, 35);
	    panel.add(lblNewLabel);
	    lblNewLabel.setBackground(new Color(233, 155, 24));
	    lblNewLabel.setFont(new Font("Snap ITC", Font.PLAIN, 31));
	    
	    JPanel panel_1 = new JPanel();
	    panel_1.setBounds(341, 92, 63, 56);
	    add(panel_1);
	    
	   
	    JLabel img2= new JLabel();
	    panel_1.add(img2);
	    img2.setIcon(new ImageIcon(SubirFoto.class.getResource("/imagenes/foto.png")));
	    
	    JLabel lblNewLabel_7 = new JLabel("Foto");
	    lblNewLabel_7.setFont(new Font("Tw Cen MT", Font.PLAIN, 21));
	    lblNewLabel_7.setBounds(351, 163, 45, 13);
	    add(lblNewLabel_7);
	    
	    

	    }
	
	private void foto() {
		if(fotoSubida) {
	JLabel lblNewLabel_6 = new JLabel("Foto");
	lblNewLabel_6.setFont(new Font("Tw Cen MT", Font.PLAIN, 21));
	lblNewLabel_6.setBounds(351, 157, 45, 13);
	add(lblNewLabel_6);
	}
	}
	}



