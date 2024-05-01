package sistema;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

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
	        panel.setBackground(new Color(0, 0, 0));
	        panel.setBounds(10, 10, 437, 545);
	        add(panel);
	        panel.setLayout(null);

	        JPanel headerPanel = new JPanel();
	        headerPanel.setBounds(0, 0, 437, 81);
	        headerPanel.setBackground(new Color(0, 0, 0));
	        panel.add(headerPanel);
	        headerPanel.setLayout(null);

	        JLabel lblNewLabel_1 = new JLabel("Tarifas");
	        lblNewLabel_1.setBounds(149, 17, 166, 54);
	        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
	        lblNewLabel_1.setForeground(new Color(255, 255, 255));
	        lblNewLabel_1.setFont(new Font("Showcard Gothic", Font.PLAIN, 34));
	        headerPanel.add(lblNewLabel_1);

	        JLabel lblNewLabel = new JLabel("");
	        lblNewLabel.setIcon(new ImageIcon(ConsultarTarifa.class.getResource("/imagenes/rata2.png")));
	        
	        lblNewLabel.setFont(new Font("Yu Gothic Light", Font.BOLD, 34));
	        lblNewLabel.setBounds(27, 0, 100, 100);
	        headerPanel.add(lblNewLabel);

	        JLabel lblNewLabel_3 = new JLabel("Increibles Tarifas a Precios Completamente Accesibles.");
	        lblNewLabel_3.setForeground(new Color(255, 255, 255));
	        lblNewLabel_3.setBounds(30, 91, 407, 40);
	        lblNewLabel_3.setFont(new Font("Unispace", Font.ITALIC, 12));
	        panel.add(lblNewLabel_3);

	        JPanel generalPanel = new JPanel();
	        generalPanel.setForeground(new Color(0, 0, 0));
	        generalPanel.setBounds(0, 165, 437, 128);
	        generalPanel.setBackground(new Color(100, 91, 176));
	        panel.add(generalPanel);
	        generalPanel.setLayout(null);

	        JLabel lblNewLabel_1_1 = new JLabel("GENERAL");
	        lblNewLabel_1_1.setBackground(new Color(255, 255, 255));
	        lblNewLabel_1_1.setOpaque(true);
	        lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
	        lblNewLabel_1_1.setForeground(Color.BLACK);
	        lblNewLabel_1_1.setFont(new Font("Unispace", Font.BOLD, 16));
	        lblNewLabel_1_1.setBounds(0, 0, 130, 40);
	        generalPanel.add(lblNewLabel_1_1);
	        
	        JLabel lblNewLabel_2 = new JLabel("Lunes - Viernes      de 6 am-- 5 pm");
	        lblNewLabel_2.setFont(new Font("Unispace", Font.PLAIN, 10));
	        lblNewLabel_2.setBounds(140, 16, 269, 13);
	        generalPanel.add(lblNewLabel_2);
	        
	        JLabel lblNewLabel_4 = new JLabel("Sabados - 8 am -- 4 pm");
	        lblNewLabel_4.setFont(new Font("Unispace", Font.PLAIN, 10));
	        lblNewLabel_4.setBounds(140, 39, 150, 13);
	        generalPanel.add(lblNewLabel_4);
	        
	        JLabel lblNewLabel_5 = new JLabel("1 Mes por $200.");
	        lblNewLabel_5.setFont(new Font("Unispace", Font.PLAIN, 10));
	        lblNewLabel_5.setBounds(140, 62, 146, 13);
	        generalPanel.add(lblNewLabel_5);

	      
	        JPanel plusPanel = new JPanel();
	        plusPanel.setBounds(0, 285, 437, 88);
	        plusPanel.setLayout(null);
	        plusPanel.setBackground(new Color(238, 193, 111));
	        panel.add(plusPanel);

	        JLabel lblNewLabel_1_1_1 = new JLabel("Plus+");
	        lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
	        lblNewLabel_1_1_1.setForeground(Color.BLACK);
	        lblNewLabel_1_1_1.setBackground(new Color(255, 255, 255));
	        lblNewLabel_1_1_1.setOpaque(true);
	        lblNewLabel_1_1_1.setFont(new Font("Unispace", Font.BOLD, 16));
	        lblNewLabel_1_1_1.setBounds(0, 0, 130, 40);
	        plusPanel.add(lblNewLabel_1_1_1);
	        
	        JLabel lblNewLabel_6 = new JLabel("Sabados - 7 am -- 7 pm");
	        lblNewLabel_6.setFont(new Font("Unispace", Font.PLAIN, 10));
	        lblNewLabel_6.setBounds(140, 39, 147, 13);
	        plusPanel.add(lblNewLabel_6);
	        
	        JLabel lblNewLabel_7 = new JLabel("Lunes - Viernes        de 6 am-- 7 pm");
	        lblNewLabel_7.setFont(new Font("Unispace", Font.PLAIN, 10));
	        lblNewLabel_7.setBounds(140, 16, 267, 13);
	        plusPanel.add(lblNewLabel_7);
	        
	        JLabel lblNewLabel_8 = new JLabel("1 Mes por $300");
	        lblNewLabel_8.setFont(new Font("Unispace", Font.PLAIN, 10));
	        lblNewLabel_8.setBounds(140, 62, 137, 13);
	        plusPanel.add(lblNewLabel_8);

	      

	        JPanel goldenPanel = new JPanel();
	        goldenPanel.setBounds(0, 371, 437, 145);
	        goldenPanel.setLayout(null);
	        goldenPanel.setBackground(new Color(0, 0, 0));
	        panel.add(goldenPanel);

	        JLabel lblNewLabel_1_1_1_1 = new JLabel("GOLDEN");
	        lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
	        lblNewLabel_1_1_1_1.setForeground(Color.BLACK);
	        lblNewLabel_1_1_1_1.setBackground(new Color(255, 255, 255));
	        lblNewLabel_1_1_1_1.setOpaque(true);
	        lblNewLabel_1_1_1_1.setFont(new Font("Unispace", Font.BOLD, 16));
	        lblNewLabel_1_1_1_1.setBounds(0, -11, 130, 40);
	        goldenPanel.add(lblNewLabel_1_1_1_1);
	        
	        JLabel lblNewLabel_9 = new JLabel("Lunes - Viernes       de 6 am-- 9 pm");
	        lblNewLabel_9.setForeground(new Color(255, 255, 255));
	        lblNewLabel_9.setFont(new Font("Unispace", Font.PLAIN, 10));
	        lblNewLabel_9.setBounds(140, 16, 233, 13);
	        goldenPanel.add(lblNewLabel_9);
	        
	        JLabel lblNewLabel_10 = new JLabel("Sabados - 7 am -- 9 pm");
	        lblNewLabel_10.setForeground(new Color(255, 255, 255));
	        lblNewLabel_10.setFont(new Font("Unispace", Font.PLAIN, 10));
	        lblNewLabel_10.setBounds(140, 38, 149, 13);
	        goldenPanel.add(lblNewLabel_10);
	        
	        JLabel lblNewLabel_11 = new JLabel("1 Mes por $450. + 1 Semana Gratuita ");
	        lblNewLabel_11.setForeground(new Color(255, 255, 255));
	        lblNewLabel_11.setFont(new Font("Unispace", Font.PLAIN, 10));
	        lblNewLabel_11.setBounds(140, 62, 233, 13);
	        goldenPanel.add(lblNewLabel_11);
	        
	        JButton btnNewButton = new JButton("OK");
	        btnNewButton.setForeground(new Color(255, 255, 255));
	        btnNewButton.setBackground(new Color(255, 255, 255));
	        btnNewButton.setFont(new Font("Unispace", Font.PLAIN, 15));
	        btnNewButton.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		cardlayout.show(contentPane, "Menu");
	        	}
	        });
	        btnNewButton.setOpaque(false);
	        btnNewButton.setBounds(327, 85, 85, 21);
	        goldenPanel.add(btnNewButton);

	        
	    }
	}


/*String precios[]= {"Paquete basico: $250","Paquete mini rata: $350","Paquete power: $400"};
String opciones[]= {"Gabriel","Juan","Diego","Emanuel","Laura"};*/