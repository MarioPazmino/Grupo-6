package mundo.interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

@SuppressWarnings({ "serial", "unused" })
public class Interfaz_Cliente extends JFrame  {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtGenero;
	private JTextField txtEdad;
	private JTextField txtCedula;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz_Cliente frame = new Interfaz_Cliente();
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
	public Interfaz_Cliente() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 601, 399);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		JLabel lbCli = new JLabel("");
		lbCli.setBounds(0, 0, 585, 360);
		ImageIcon icon =new ImageIcon(getClass().getResource("/imagenes/cliente.jpeg"));
		ImageIcon imga =new ImageIcon(icon.getImage().getScaledInstance(lbCli.getWidth(), lbCli.getHeight(), Image.SCALE_SMOOTH));
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.setEnabled(false);
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Interfaz_Estilista abrir = new Interfaz_Estilista ();
		     abrir.setVisible(true);
		     dispose();
			}
			
		});
		
		//METODO PARA NO MAXIMIZAR EL TAMAÑO DE LANINTERFAZ
		setResizable(false);
		
		JLabel lblAdv= new JLabel("New label");
		lblAdv.setBounds(382, 94, 329, 308);
		ImageIcon icono =new ImageIcon(getClass().getResource("/imagenes/adv1.png"));
		ImageIcon imag =new ImageIcon(icono.getImage().getScaledInstance(lblAdv.getWidth(), lblAdv.getHeight(), Image.SCALE_SMOOTH));
		
		JButton btnCliente = new JButton("PRINCIPAL");
		btnCliente.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		btnCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 InterfazSalon abrir = new InterfazSalon ();
			     abrir.setVisible(true);
			     dispose();
			}
		});
		btnCliente.setForeground(Color.BLACK);
		btnCliente.setBackground(new Color(204, 255, 255));
		btnCliente.setBounds(453, 37, 101, 23);
		contentPane.add(btnCliente);
		lblAdv.setIcon(imag);
		contentPane.add(lblAdv);
		//
		btnSiguiente.setForeground(Color.BLACK);
		btnSiguiente.setBackground(Color.LIGHT_GRAY);
		btnSiguiente.setFont(new Font("Century Schoolbook", Font.ITALIC, 16));
		btnSiguiente.setBounds(441, 310, 113, 24);
		contentPane.add(btnSiguiente);
		
		txtCedula = new JTextField();
		txtCedula.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				habilitarBoton(btnSiguiente);
			}
		});
		txtCedula.setColumns(10);
		txtCedula.setBounds(187, 296, 193, 29);
		contentPane.add(txtCedula);
		
		txtEdad = new JTextField();
		txtEdad.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				habilitarBoton(btnSiguiente);
			}
		});
		txtEdad.setColumns(10);
		txtEdad.setBounds(187, 247, 193, 29);
		contentPane.add(txtEdad);
		
		txtGenero = new JTextField();
		txtGenero.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				habilitarBoton(btnSiguiente);
			}
		});
		txtGenero.setColumns(10);
		txtGenero.setBounds(187, 200, 193, 29);
		contentPane.add(txtGenero);
		
		txtApellido = new JTextField();
		txtApellido.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				habilitarBoton(btnSiguiente);
			}
		});
		txtApellido.setColumns(10);
		txtApellido.setBounds(187, 153, 193, 29);
		contentPane.add(txtApellido);
		
		txtNombre = new JTextField();
		txtNombre.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				habilitarBoton(btnSiguiente);
			}
		});
		txtNombre.setBounds(187, 115, 193, 29);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("CEDULA:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel.setBounds(43, 308, 113, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lbEdad = new JLabel("EDAD:");
		lbEdad.setHorizontalAlignment(SwingConstants.CENTER);
		lbEdad.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lbEdad.setBounds(43, 261, 113, 36);
		contentPane.add(lbEdad);
		
		JLabel lbGenero = new JLabel("GENERO (F/M):");
		lbGenero.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lbGenero.setHorizontalAlignment(SwingConstants.CENTER);
		lbGenero.setBounds(43, 211, 113, 36);
		contentPane.add(lbGenero);
		
		JLabel lbApellido = new JLabel("APELLIDO:");
		lbApellido.setHorizontalAlignment(SwingConstants.CENTER);
		lbApellido.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lbApellido.setBounds(43, 164, 113, 36);
		contentPane.add(lbApellido);
		
		JLabel lbNombre = new JLabel("NOMBRE:");
		lbNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lbNombre.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lbNombre.setBounds(43, 115, 113, 29);
		contentPane.add(lbNombre);
		lbCli.setIcon(imga);
		contentPane.add(lbCli);
		
	}
	public void habilitarBoton(Component btnSiguiente) {
		if (!txtNombre.getText().isEmpty() && !txtApellido.getText().isEmpty() && !txtGenero.getText().isEmpty() && !txtEdad.getText().isEmpty()&& !txtCedula.getText().isEmpty()) {
			
			btnSiguiente.setEnabled(true);
		}else {
			btnSiguiente.setEnabled(false);
		}
	}
}
