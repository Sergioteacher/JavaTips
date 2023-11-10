package javaTips;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public class JavaTips {

	private JFrame frmEjemploDelUso;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JavaTips window = new JavaTips();
					window.frmEjemploDelUso.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JavaTips() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEjemploDelUso = new JFrame();
		frmEjemploDelUso.setTitle("Ejemplo del uso de Tips");
		frmEjemploDelUso.setBounds(100, 100, 450, 300);
		frmEjemploDelUso.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel_principal = new JPanel();
		frmEjemploDelUso.getContentPane().add(panel_principal, BorderLayout.CENTER);
		panel_principal.setLayout(new BorderLayout(0, 0));
	}

}
