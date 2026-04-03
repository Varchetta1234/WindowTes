package gui1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AparienciaSistema {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
	//apariencia de sistema	(Debe estar en un try/catch)
	try
	{
	UIManager.setLookAndFeel(
	UIManager.getSystemLookAndFeelClassName());
	}
	catch(Exception e) 
	// Si algo falla, esto imprimirá las letras rojas 
	//en la consola de Eclipse:
	{e.printStackTrace();} //  
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AparienciaSistema window = new AparienciaSistema();
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
	public AparienciaSistema() 
	{
		try 
		{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
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
		
		JLabel lblNewLabel = new JLabel("AparienciaSistema");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel.setBounds(51, 35, 132, 23);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(205, 36, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblSaludo = new JLabel("");
		lblSaludo.setBounds(184, 137, 77, 14);
		frame.getContentPane().add(lblSaludo);
		
		JButton btnHacerAlgo = new JButton("Hacer algo");
		btnHacerAlgo.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				//Codigo para que se ejecute cuando el usuari hace clic en el boton
				String nombre = textField.getText();
				lblSaludo.setText("Hola, "+ nombre + "!");
			}
		});
		btnHacerAlgo.setBounds(184, 85, 89, 23);
		frame.getContentPane().add(btnHacerAlgo);
		
		
	}
}
