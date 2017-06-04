package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.Font;

public class Login {

	protected JFrame frmLogIn;
	private JButton jbviajero;
	private JButton jbcaja;

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogIn = new JFrame();
		frmLogIn.setTitle("Login");
		frmLogIn.setBounds(100, 100, 499, 366);
		frmLogIn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogIn.getContentPane().setLayout(null);
		
		jbviajero = new JButton("Subida del viajero");
		jbviajero.setFont(new Font("Times New Roman", Font.BOLD, 13));
		jbviajero.setBounds(88, 162, 135, 43);
		frmLogIn.getContentPane().add(jbviajero);
		
		jbcaja = new JButton("Caja del dia");
		jbcaja.setFont(new Font("Times New Roman", Font.BOLD, 13));
		jbcaja.setBounds(253, 162, 135, 43);
		frmLogIn.getContentPane().add(jbcaja);
	}
}
