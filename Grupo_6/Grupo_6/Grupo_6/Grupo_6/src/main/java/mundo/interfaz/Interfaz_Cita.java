package mundo.interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Window.Type;

@SuppressWarnings({ "serial", "unused" })
public class Interfaz_Cita extends JFrame {

	protected static final Component ActionEvent = null;
	private JPanel contentPane;
	private JTextField textTurno;
	private JTextField textFecha;
	private JTextField textAreaC;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz_Cita frame = new Interfaz_Cita();
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
	public Interfaz_Cita() {
		setResizable(false);
		setTitle("SALON DE BELLEZA \"MDN\"");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 602, 419);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbCita = new JLabel("");
		lbCita.setBounds(0, 0, 586, 380);
		ImageIcon icon =new ImageIcon(getClass().getResource("/imagenes/citas.jpeg"));
		ImageIcon imga =new ImageIcon(icon.getImage().getScaledInstance(lbCita.getWidth(), lbCita.getHeight(), Image.SCALE_SMOOTH));
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.setEnabled(false);
		btnSiguiente.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				//MENSAJE EN CITA
			            String turno = textTurno.getText();
			            String fecha = textFecha.getText();
			            String area = textAreaC.getText();
			            if (!turno.isEmpty() && !fecha.isEmpty() && !area.isEmpty()) { 

			            	JOptionPane.showMessageDialog( ActionEvent,"Su turno es el "+turno + ", " +"para la fecha " + fecha + " en el area " + area +" gracias **LE ESPERAMOS**");

			                dispose();

			            } else {
			                JOptionPane.showMessageDialog(ActionEvent, "ERROR");
			            }
			   }//GEN-LAS			}

			private void CancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarButtonActionPerformed
			   dispose();
			}
		});
		
		JLabel lblAdv = new JLabel("New label");
		lblAdv.setBounds(400, 78, 311, 296);
		ImageIcon icono =new ImageIcon(getClass().getResource("/imagenes/adv.png"));
		ImageIcon imag =new ImageIcon(icono.getImage().getScaledInstance(lblAdv.getWidth(), lblAdv.getHeight(), Image.SCALE_SMOOTH));
		
		JButton btnEstilista = new JButton("PRINCIPAL");
		btnEstilista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 InterfazSalon abrir = new InterfazSalon ();
			     abrir.setVisible(true);
			     dispose();
			}
		});
		btnEstilista.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		btnEstilista.setBackground(new Color(204, 255, 255));
		btnEstilista.setBounds(299, 324, 111, 23);
		contentPane.add(btnEstilista);
		lblAdv.setIcon(imag);
		contentPane.add(lblAdv);
		//
		JLabel lblArea = new JLabel("AREA: ");
		lblArea.setHorizontalAlignment(SwingConstants.CENTER);
		lblArea.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblArea.setBounds(82, 209, 163, 31);
		contentPane.add(lblArea);
		
		JLabel lblFechaCita = new JLabel("FECHA CITA:");
		lblFechaCita.setHorizontalAlignment(SwingConstants.CENTER);
		lblFechaCita.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblFechaCita.setBounds(82, 147, 163, 31);
		contentPane.add(lblFechaCita);
		
		JLabel lblTurno = new JLabel("TURNO CITA:");
		lblTurno.setHorizontalAlignment(SwingConstants.CENTER);
		lblTurno.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblTurno.setBounds(75, 91, 170, 31);
		contentPane.add(lblTurno);
		
		textFecha = new JTextField();
		textFecha.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				habilitarBoton(btnSiguiente);
			}
		});
		textFecha.setColumns(10);
		textFecha.setBounds(255, 150, 150, 29);
		contentPane.add(textFecha);
		
		textAreaC = new JTextField();
		textAreaC.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				habilitarBoton(btnSiguiente);
			}
		});
		textAreaC.setColumns(10);
		textAreaC.setBounds(255, 208, 150, 29);
		contentPane.add(textAreaC);
		
		textTurno = new JTextField();
		textTurno.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				habilitarBoton(btnSiguiente);
			}
		});
		textTurno.setBounds(255, 94, 150, 29);
		contentPane.add(textTurno);
		textTurno.setColumns(10);
		btnSiguiente.setBackground(Color.WHITE);
		btnSiguiente.setFont(new Font("Century Schoolbook", Font.ITALIC, 16));
		btnSiguiente.setBounds(302, 269, 108, 23);
		contentPane.add(btnSiguiente);
		lbCita.setIcon(imga);
		contentPane.add(lbCita);
	}
	
	public void habilitarBoton(Component btnSiguiente) {
		if (!textTurno.getText().isEmpty() && !textFecha.getText().isEmpty() && !textAreaC.getText().isEmpty()) {	
			btnSiguiente.setEnabled(true);
			//JOptionPane.showConfirmDialog(btnSiguiente, "Su cita se registro con Exito.");

		}else {
			btnSiguiente.setEnabled(false);
}
	}
}



