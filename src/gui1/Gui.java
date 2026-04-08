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

public class Gui {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	
		// Configuración global del gestor de apariencia (UIManager)
		try {
//			//McWin LookAndFeel(confusa cierre je)
			UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		} catch (Exception e) {
			// Manejo de excepciones comprobadas para evitar supresión silenciosa
			e.printStackTrace(); 
		}
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui window = new Gui();
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
	public Gui() {
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
		
		JLabel lblNewLabel = new JLabel("¡¡¡Vamos a Jugar al Wordle!!!");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel.setBounds(132, 43, 164, 23);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(230, 92, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblSaludo = new JLabel("");
		lblSaludo.setBounds(184, 137, 200, 14); 
		frame.getContentPane().add(lblSaludo);
		
		JButton btnHacerAlgo = new JButton("Comenzar");
		btnHacerAlgo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre = textField.getText();
				lblSaludo.setText("Comencemos el juego" + nombre + "!!");
			}
		});
		btnHacerAlgo.setBounds(177, 154, 89, 23);
		frame.getContentPane().add(btnHacerAlgo);
		
		JLabel lblNewLabel_1 = new JLabel("Ingresa tu Nombre:");
		lblNewLabel_1.setBounds(88, 95, 132, 14);
		frame.getContentPane().add(lblNewLabel_1);
	}
}