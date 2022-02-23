package mundo.interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JTextField;

@SuppressWarnings({ "serial", "unused" })
public class InterfazSalon extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazSalon frame = new InterfazSalon();
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
	public InterfazSalon() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 601, 408);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCliente = new JButton("CLIENTE");
		btnCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				     Interfaz_Cliente abrir = new Interfaz_Cliente ();
				     abrir.setVisible(true);
				     dispose();
				}

		});
		//METODO PARA NO MAXIMIZAR EL TAMAÑO DE LANINTERFAZ
		setResizable(false);
		//
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(279, -33, 417, 449);
		ImageIcon ico =new ImageIcon(getClass().getResource("/imagenes/logo.png"));
		ImageIcon img =new ImageIcon(ico.getImage().getScaledInstance(lblNewLabel_1.getWidth(), lblNewLabel_1.getHeight(), Image.SCALE_SMOOTH));
		
		JLabel lbLema = new JLabel("");
		lbLema.setBounds(14, 152, 218, 206);
		ImageIcon icon =new ImageIcon(getClass().getResource("/imagenes/LEMA.png"));
		ImageIcon imga =new ImageIcon(icon.getImage().getScaledInstance(lbLema.getWidth(), lbLema.getHeight(), Image.SCALE_SMOOTH));
		
		JButton btnEstlista = new JButton("ESTILISTA");
		btnEstlista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Interfaz_Estilista abrir = new Interfaz_Estilista();
				abrir.setVisible(true);
				dispose();
			}
		});
		btnEstlista.setForeground(Color.BLACK);
		btnEstlista.setBackground(new Color(255, 102, 255));
		btnEstlista.setBounds(130, 61, 102, 23);
		contentPane.add(btnEstlista);
		lbLema.setIcon(imga);
		contentPane.add(lbLema);
		
		
		JLabel lbBienvenida = new JLabel("Bienvenidos");
		lbBienvenida.setHorizontalAlignment(SwingConstants.CENTER);
		lbBienvenida.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 28));
		lbBienvenida.setBounds(385, 290, 177, 52);
		
		contentPane.add(lbBienvenida);
		
		lblNewLabel_1.setIcon(img);
		contentPane.add(lblNewLabel_1);
		setResizable(false);
		JLabel lblNewLabel_2 = new JLabel("CITAS");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(0, 0, 46, 14);
		contentPane.add(lblNewLabel_2);
		btnCliente.setBackground(new Color(255, 102, 255));
		btnCliente.setForeground(Color.BLACK);
		btnCliente.setBounds(20, 61, 89, 23);
		contentPane.add(btnCliente);
				
		JLabel lblNewLabel = new JLabel("SALON DE BELLEZA \"M.D.N\"");
		lblNewLabel.setForeground(Color.MAGENTA);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 32));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(56, 11, 477, 39);
		contentPane.add(lblNewLabel);
		
		JButton btnServicio = new JButton("SERVICIO");
		btnServicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Interfaz_Servicios abrir = new Interfaz_Servicios ();
			     abrir.setVisible(true);
			     dispose();
			}

		});
		btnServicio.setForeground(Color.BLACK);
		btnServicio.setBackground(new Color(255, 102, 255));
		btnServicio.setBounds(20, 93, 89, 23);
		contentPane.add(btnServicio);
		
		JButton btnCita = new JButton("CITA");
		btnCita.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Interfaz_Cita abrir = new Interfaz_Cita ();
			     abrir.setVisible(true);
			    dispose();
			}

		});
	
		btnCita.setForeground(Color.BLACK);
		btnCita.setBackground(new Color(255, 102, 255));
		btnCita.setBounds(130, 93, 100, 23);
		contentPane.add(btnCita);
		
		JLabel lbFondo = new JLabel("New label");
		lbFondo.setIcon(new ImageIcon("C:\\Users\\DAYANA\\OneDrive\\Documentos\\FONDO3.jpg"));
		lbFondo.setBounds(-22, 0, 607, 369);
		contentPane.add(lbFondo);
		ImageIcon ico1 =new ImageIcon(getClass().getResource("/imagenes/logo.png"));
	}
}
