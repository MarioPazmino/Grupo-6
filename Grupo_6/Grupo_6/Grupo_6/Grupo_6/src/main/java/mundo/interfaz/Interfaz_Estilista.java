package mundo.interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.ConexionMongoDBs;
import modelo.Estilista;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

@SuppressWarnings({ "serial", "unused" })
public class Interfaz_Estilista extends JFrame {

	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textApellido;
	private JTextField textEdad;
	private JTextField textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz_Estilista frame = new Interfaz_Estilista();
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
	public Interfaz_Estilista() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 602, 410);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbEstilista = new JLabel("");
		lbEstilista.setBounds(0, 0, 585, 371);
		ImageIcon icon =new ImageIcon(getClass().getResource("/imagenes/estilista.jpeg"));
		ImageIcon imga =new ImageIcon(icon.getImage().getScaledInstance(lbEstilista.getWidth(), lbEstilista.getHeight(), Image.SCALE_SMOOTH));
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.setEnabled(false);
		btnSiguiente.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				 Interfaz_Servicios abrir = new Interfaz_Servicios ();
			     abrir.setVisible(true);
			     dispose();
			}
		});
		
		textArea = new JTextField();
		textArea.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				habilitarBoton(btnSiguiente);
			}
		});
		
		JLabel lblAdv = new JLabel("New label");
		lblAdv.setBounds(368, 125, 408, 266);
		ImageIcon icono =new ImageIcon(getClass().getResource("/imagenes/adv.png"));
		ImageIcon imag =new ImageIcon(icono.getImage().getScaledInstance(lblAdv.getWidth(), lblAdv.getHeight(), Image.SCALE_SMOOTH));
		 InterfazSalon abrir = new InterfazSalon ();
	     abrir.setVisible(true);
	     dispose();
		
		JButton btnEstilista = new JButton("PRINCIPAL");
		btnEstilista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 InterfazSalon abrir = new InterfazSalon ();
			     abrir.setVisible(true);
			     dispose();
			}
		});
		
		btnEstilista.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		btnSiguiente.setEnabled(false);	
		btnEstilista.setBackground(new Color(204, 255, 255));
		btnEstilista.setBounds(10, 331, 107, 23);
		contentPane.add(btnEstilista);
		lblAdv.setIcon(imag);
		contentPane.add(lblAdv);
		textArea.setColumns(10);
		textArea.setBounds(205, 279, 195, 25);
		contentPane.add(textArea);
		
		textEdad = new JTextField();
		textEdad.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				habilitarBoton(btnSiguiente);
			}
		});
		textEdad.setColumns(10);
		textEdad.setBounds(205, 219, 195, 25);
		contentPane.add(textEdad);
		
		textApellido = new JTextField();
		textApellido.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				habilitarBoton(btnSiguiente);
			}
		});
		textApellido.setColumns(10);
		textApellido.setBounds(205, 163, 195, 25);
		contentPane.add(textApellido);
		
		textNombre = new JTextField();
		textNombre.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				habilitarBoton(btnSiguiente);
			}
		});
		textNombre.setBounds(205, 113, 195, 25);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		btnSiguiente.setBackground(Color.LIGHT_GRAY);
		btnSiguiente.setForeground(new Color(0, 0, 0));
		btnSiguiente.setFont(new Font("Century Schoolbook", Font.ITALIC, 16));
		btnSiguiente.setBounds(253, 331, 118, 23);
		contentPane.add(btnSiguiente);
		
		//METODO PARA NO MAXIMIZAR EL TAMAÑO DE LANINTERFAZ
		setResizable(false);
		//
		JLabel lbAreaS = new JLabel("AREA DE SERVICIO:");
		lbAreaS.setBackground(new Color(0, 0, 153));
		lbAreaS.setForeground(new Color(0, 0, 153));
		lbAreaS.setHorizontalAlignment(SwingConstants.CENTER);
		lbAreaS.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lbAreaS.setBounds(25, 279, 162, 22);
		contentPane.add(lbAreaS);
		
		JLabel lbEdadE = new JLabel("EDAD ESTILISTA:");
		lbEdadE.setForeground(new Color(0, 0, 153));
		lbEdadE.setBackground(new Color(0, 0, 153));
		lbEdadE.setHorizontalAlignment(SwingConstants.CENTER);
		lbEdadE.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lbEdadE.setBounds(25, 216, 162, 22);
		contentPane.add(lbEdadE);
		
		JLabel lbApellidoE = new JLabel("APELLIDO ESTILISTA:");
		lbApellidoE.setForeground(new Color(0, 0, 153));
		lbApellidoE.setBackground(new Color(0, 0, 153));
		lbApellidoE.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lbApellidoE.setBounds(25, 160, 184, 22);
		contentPane.add(lbApellidoE);
		
		JLabel lbNombreE = new JLabel("NOMBRE ESTILISTA:");
		lbNombreE.setForeground(new Color(0, 0, 153));
		lbNombreE.setBackground(new Color(0, 0, 153));
		lbNombreE.setHorizontalAlignment(SwingConstants.CENTER);
		lbNombreE.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lbNombreE.setBounds(25, 113, 162, 22);
		contentPane.add(lbNombreE);
		lbEstilista.setIcon(imga);
		contentPane.add(lbEstilista);
	}

	public void habilitarBoton(Component btnSiguiente) {
		if (!textNombre.getText().isEmpty() && !textApellido.getText().isEmpty() && !textEdad.getText().isEmpty()&& !textArea.getText().isEmpty()) {	
			btnSiguiente.setEnabled(true);
		}else {
			btnSiguiente.setEnabled(false);
		}
	}
}
