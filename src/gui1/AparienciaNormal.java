package gui1;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class AparienciaNormal {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		// Al omitir el UIManager, Java cargará su diseño básico por defecto (Metal)
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AparienciaNormal window = new AparienciaNormal();
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
	public AparienciaNormal() {
		// Constructor limpio, sin código de apariencia duplicado
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
		
		JLabel lblNewLabel = new JLabel("AparienciaNormal");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel.setBounds(51, 35, 132, 23);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(205, 36, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblSaludo = new JLabel("");
		// Nota: Amplié el ancho de 77 a 200 para que el texto no se corte si escribes un nombre largo
		lblSaludo.setBounds(184, 137, 200, 14);
		frame.getContentPane().add(lblSaludo);
		
		JButton btnHacerAlgo = new JButton("Hacer algo");
		btnHacerAlgo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Codigo para que se ejecute cuando el usuario hace clic en el boton
				String nombre = textField.getText();
				lblSaludo.setText("Hola, "+ nombre + "!");
			}
		});
		btnHacerAlgo.setBounds(184, 85, 89, 23);
		frame.getContentPane().add(btnHacerAlgo);
	}
}