package gui1;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JButton;

public class AparienciaJtattooYOTRAS {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	
		// Configuración global del gestor de apariencia (UIManager)
		try {
			//JTattoo
//			UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
//			//utilizado en los sistemas UNIX de los años 90
//			UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
//			//utilizado en los sistemas Windows 95/98/2000
//			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
//			//NimbusLookAndFeel, Introducido en Java 6 (safa...)
//			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
//			//Acryl LookAndFeel: (safa.. borde negro)
//			UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
//			//Aero LookAndFeel (safa borde celestito)
//			UIManager.setLookAndFeel("com.jtattoo.plaf.aero.AeroLookAndFeel");
//			//HiFi LookAndFeel(Toda negra)
//			UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
//			//McWin LookAndFeel(confusa cierre je)
			UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
			
		
		} catch (Exception e) {
			// Manejo de excepciones comprobadas para evitar supresión silenciosa
			e.printStackTrace(); 
		}
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AparienciaJtattooYOTRAS window = new AparienciaJtattooYOTRAS();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AparienciaJtattooYOTRAS() {
		// Se ha eliminado la instrucción UIManager.getSystemLookAndFeelClassName()
		// para prevenir la invalidación de la configuración de JTattoo.
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("AparienciaJtattoo");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel.setBounds(51, 35, 132, 23);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(205, 36, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblSaludo = new JLabel("");
		lblSaludo.setBounds(184, 137, 200, 14); 
		frame.getContentPane().add(lblSaludo);
		
		JButton btnHacerAlgo = new JButton("Hacer algo");
		btnHacerAlgo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre = textField.getText();
				lblSaludo.setText("Hola, " + nombre + "!");
			}
		});
		btnHacerAlgo.setBounds(184, 85, 89, 23);
		frame.getContentPane().add(btnHacerAlgo);
	}
}