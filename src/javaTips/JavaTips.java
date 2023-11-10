package javaTips;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		
		JLabel lblUp = new JLabel("Un texto en la zona superior");
		lblUp.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUp.setHorizontalAlignment(SwingConstants.CENTER);
		panel_principal.add(lblUp, BorderLayout.NORTH);
		
		JButton btnBotonCentral = new JButton("pulsame ...");
		btnBotonCentral.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ha pulsado el botón principal");
			}
		});
		btnBotonCentral.setToolTipText("Pulsa para ver el mensaje");
		btnBotonCentral.setFont(new Font("Trebuchet MS", Font.ITALIC, 18));
		panel_principal.add(btnBotonCentral, BorderLayout.CENTER);
		
		JLabel lblDown = new JLabel("Un texto inferior");
		lblDown.setHorizontalAlignment(SwingConstants.CENTER);
		lblDown.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_principal.add(lblDown, BorderLayout.SOUTH);
		
		JLabel lblLeft = new JLabel("Izquierda");
		lblLeft.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_principal.add(lblLeft, BorderLayout.WEST);
		
		JLabel lblRight = new JLabel("Derecha");
		panel_principal.add(lblRight, BorderLayout.EAST);
	}

}
