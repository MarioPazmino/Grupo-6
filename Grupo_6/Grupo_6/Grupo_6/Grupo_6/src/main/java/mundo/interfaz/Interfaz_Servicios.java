package mundo.interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextArea;

@SuppressWarnings({ "serial", "unused" })
public class Interfaz_Servicios extends JFrame {

	private JPanel contentPane;
	private JTextField textPedicure;
	private JTextField textManicure;
	private JTextField textLavado;
	private JTextField textCorte;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz_Servicios frame = new Interfaz_Servicios();
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
	public Interfaz_Servicios() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 601, 416);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbServicio = new JLabel("New label");
		lbServicio.setBounds(0, 0, 585, 374);
		ImageIcon icon =new ImageIcon(getClass().getResource("/imagenes/servicio.jpeg"));
		ImageIcon imga =new ImageIcon(icon.getImage().getScaledInstance(lbServicio.getWidth(), lbServicio.getHeight(), Image.SCALE_SMOOTH));
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.setEnabled(false);
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Interfaz_Cita abrir = new Interfaz_Cita ();
			     abrir.setVisible(true);
			     dispose();
			}
		});
		//METODO PARA NO MAXIMIZAR EL TAMAÑO DE LANINTERFAZ
		setResizable(false);
		
		JLabel lblAdv = new JLabel("New label");
		lblAdv.setBounds(371, 104, 409, 310);
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
		btnEstilista.setBounds(456, 28, 107, 23);
		contentPane.add(btnEstilista);
		lblAdv.setIcon(imag);
		contentPane.add(lblAdv);
		//
		btnSiguiente.setFont(new Font("Century Schoolbook", Font.ITALIC, 16));
		btnSiguiente.setBounds(441, 329, 122, 23);
		contentPane.add(btnSiguiente);
		
		textManicure = new JTextField();
		textManicure.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				habilitarBoton(btnSiguiente);
			}
		});
		textManicure.setColumns(10);
		textManicure.setBounds(185, 171, 187, 31);
		contentPane.add(textManicure);
		
		textLavado = new JTextField();
		textLavado.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				habilitarBoton(btnSiguiente);
			}
		});
		textLavado.setColumns(10);
		textLavado.setBounds(185, 225, 187, 31);
		contentPane.add(textLavado);
		
		textCorte = new JTextField();
		textCorte.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				habilitarBoton(btnSiguiente);
			}
		});
		textCorte.setColumns(10);
		textCorte.setBounds(185, 284, 187, 31);
		contentPane.add(textCorte);
		
		textPedicure = new JTextField();
		textPedicure.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				habilitarBoton(btnSiguiente);
			}
		});
		textPedicure.setBounds(185, 119, 187, 31);
		contentPane.add(textPedicure);
		textPedicure.setColumns(10);
		
		JLabel lblCorteCabe = new JLabel("CORTE CABE:");
		lblCorteCabe.setHorizontalAlignment(SwingConstants.CENTER);
		lblCorteCabe.setForeground(Color.WHITE);
		lblCorteCabe.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblCorteCabe.setBounds(44, 284, 119, 37);
		contentPane.add(lblCorteCabe);
		
		JLabel lbLavado = new JLabel("LAVADO:");
		lbLavado.setHorizontalAlignment(SwingConstants.CENTER);
		lbLavado.setForeground(Color.WHITE);
		lbLavado.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lbLavado.setBounds(45, 232, 118, 31);
		contentPane.add(lbLavado);
		
		JLabel lblNewLabel = new JLabel("MANICURE:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel.setBounds(44, 184, 119, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lbPedicure = new JLabel("PEDICURE:");
		lbPedicure.setHorizontalAlignment(SwingConstants.CENTER);
		lbPedicure.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lbPedicure.setForeground(Color.WHITE);
		lbPedicure.setBounds(44, 131, 119, 19);
		contentPane.add(lbPedicure);
		lbServicio.setIcon(imga);
		contentPane.add(lbServicio);
	}
	public void habilitarBoton(Component btnSiguiente) {
		if (!textPedicure.getText().isEmpty() && !textManicure.getText().isEmpty() && !textLavado.getText().isEmpty()&& !textCorte.getText().isEmpty()) {	
			btnSiguiente.setEnabled(true);
		}else {
			btnSiguiente.setEnabled(false);
		}
	}
}
