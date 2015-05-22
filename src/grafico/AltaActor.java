package grafico;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import jteatre.Actor;
import jteatre.AlturaNoValida;
import jteatre.ApellidosNulosException;
import jteatre.DniDuplicadoException;
import jteatre.DniInvalidoException;
import jteatre.Gestion;
import jteatre.NombreNuloException;
import jteatre.PersonalDuplicadoException;
import jteatre.PesoNoValido;

import javax.swing.ImageIcon;

import java.awt.Color;

import javax.swing.UIManager;

import java.awt.Font;

import javax.swing.JComboBox;

public class AltaActor extends JDialog {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField nombre;
	private JTextField apellidos;
	private JTextField peso;
	private JTextField altura;
	private JTextField dni;
	private Actor actor;
	private int dia1;
	private int mes1;
	private int anno1;
	private JTextField dia;
	private JTextField mes;
	private JTextField anno;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AltaActor dialog = new AltaActor();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AltaActor() {
		
		super();
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		nombre = new JTextField();
		nombre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		nombre.setBounds(73, 11, 86, 20);
		contentPanel.add(nombre);
		nombre.setColumns(10);
		
		JLabel lblNombre = new JLabel("nombre");
		lblNombre.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 12));
		lblNombre.setForeground(Color.GREEN);
		lblNombre.setBackground(UIManager.getColor("Button.disabledShadow"));
		lblNombre.setBounds(10, 17, 53, 14);
		contentPanel.add(lblNombre);
		
		apellidos = new JTextField();
		apellidos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		apellidos.setBounds(294, 11, 86, 20);
		contentPanel.add(apellidos);
		apellidos.setColumns(10);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 12));
		lblApellidos.setForeground(Color.GREEN);
		lblApellidos.setBounds(222, 14, 62, 14);
		contentPanel.add(lblApellidos);
		
		peso = new JTextField();
		peso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		peso.setBounds(73, 53, 86, 20);
		contentPanel.add(peso);
		peso.setColumns(10);
		
		altura = new JTextField();
		altura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		altura.setBounds(294, 53, 86, 20);
		contentPanel.add(altura);
		altura.setColumns(10);
		
		JLabel lblPeso = new JLabel("Peso");
		lblPeso.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 12));
		lblPeso.setForeground(Color.GREEN);
		lblPeso.setBounds(10, 56, 46, 14);
		contentPanel.add(lblPeso);
		
		JLabel lblAltura = new JLabel("Altura");
		lblAltura.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 12));
		lblAltura.setForeground(Color.GREEN);
		lblAltura.setBounds(238, 56, 46, 14);
		contentPanel.add(lblAltura);
		
		dni = new JTextField();
		dni.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		dni.setBounds(122, 138, 121, 20);
		contentPanel.add(dni);
		dni.setColumns(10);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 12));
		lblDni.setForeground(Color.GREEN);
		lblDni.setBounds(42, 141, 46, 14);
		contentPanel.add(lblDni);
		
		dia = new JTextField();
		dia.setText("dd");
		dia.setBounds(145, 184, 26, 20);
		contentPanel.add(dia);
		dia.setColumns(10);
		
		mes = new JTextField();
		mes.setText("mm");
		mes.setBounds(198, 184, 26, 20);
		contentPanel.add(mes);
		mes.setColumns(10);
		
		anno = new JTextField();
		anno.setText("yyyy");
		anno.setBounds(248, 184, 26, 20);
		contentPanel.add(anno);
		anno.setColumns(10);
		
		JLabel lblFechaDeNacimiento = new JLabel("Fecha de nacimiento");
		lblFechaDeNacimiento.setForeground(Color.GREEN);
		lblFechaDeNacimiento.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 11));
		lblFechaDeNacimiento.setBounds(0, 187, 135, 14);
		contentPanel.add(lblFechaDeNacimiento);
		
		JLabel label = new JLabel("/");
		label.setForeground(Color.GREEN);
		label.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 11));
		label.setBounds(181, 187, 14, 14);
		contentPanel.add(label);
		
		JLabel lblNewLabel_1 = new JLabel("/");
		lblNewLabel_1.setForeground(Color.GREEN);
		lblNewLabel_1.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 11));
		lblNewLabel_1.setBounds(222, 187, 46, 14);
		contentPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(AltaActor.class.getResource("/imagenesjTheatre/imagen ventana PrincipAL.jpg")));
		lblNewLabel.setBounds(0, 0, 434, 259);
		contentPanel.add(lblNewLabel);
		
		
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(Color.WHITE);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton annadir = new JButton("añadir");
				annadir.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					
						try {
							actor = new Actor(nombre.getText(),apellidos.getText(), dni.getText(),Integer.parseInt(altura.getText()),Integer.parseInt(peso.getText()),Integer.parseInt(dia.getText()),Integer.parseInt(mes.getText()),Integer.parseInt(anno.getText()));
							Gestion.annadirActor(actor);
							new HabilidadesActor(actor).setVisible(true);
							
							
						} catch (DniInvalidoException  e1) {
							// TODO Auto-generated catch block
							JOptionPane.showMessageDialog(null, e1.getMessage(),"error al introducir ", JOptionPane.ERROR_MESSAGE);
						} catch(IllegalArgumentException e1){
							JOptionPane.showMessageDialog(null, e1.getMessage(),"error al introducir ", JOptionPane.ERROR_MESSAGE);
						}catch(DniDuplicadoException e1){
							JOptionPane.showMessageDialog(null, e1.getMessage(),"error al introducir ", JOptionPane.ERROR_MESSAGE);
						}catch(PersonalDuplicadoException e1){
							JOptionPane.showMessageDialog(null, e1.getMessage(),"error al introducir ", JOptionPane.ERROR_MESSAGE);
						} catch (AlturaNoValida e1) {
							// TODO Auto-generated catch block
							JOptionPane.showMessageDialog(null, e1.getMessage(),"error al introducir ", JOptionPane.ERROR_MESSAGE);
						} catch (PesoNoValido e1) {
							// TODO Auto-generated catch block
							JOptionPane.showMessageDialog(null, e1.getMessage(),"error al introducir ", JOptionPane.ERROR_MESSAGE);
						} catch (ApellidosNulosException e1) {
							// TODO Auto-generated catch block
							JOptionPane.showMessageDialog(null, e1.getMessage(),"error al introducir ", JOptionPane.ERROR_MESSAGE);
						} catch (NombreNuloException e1) {
							// TODO Auto-generated catch block
							JOptionPane.showMessageDialog(null, e1.getMessage(),"error al introducir ", JOptionPane.ERROR_MESSAGE);
						}
					}
				});
				annadir.setActionCommand("OK");
				buttonPane.add(annadir);
				getRootPane().setDefaultButton(annadir);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						new Principal().setEnabled(true);
						new Principal().setVisible(true);
						
						
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
}

