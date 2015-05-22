package grafico;

import java.awt.BorderLayout;

import jteatre.ApellidosNulosException;
import jteatre.Director;
import jteatre.DniDuplicadoException;
import jteatre.DniInvalidoException;
import jteatre.Genero;
import jteatre.GeneroNoValidoException;
import jteatre.Gestion;
import jteatre.NombreNuloException;
import jteatre.PersonalDuplicadoException;
import jteatre.Personalidad;
import jteatre.PersonalidadNoValidaException;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.Font;
import java.awt.Color;

import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

public class AltaDirector extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField nombre;
	private JTextField apellidos;
	private JTextField dia;
	private JTextField mes;
	private JTextField anno;
	private JTextField dni;
	private Genero genero1;
	private Personalidad personalidad1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AltaDirector dialog = new AltaDirector();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AltaDirector() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			nombre = new JTextField();
			nombre.setBounds(99, 11, 86, 20);
			contentPanel.add(nombre);
			nombre.setColumns(10);
		}
		{
			apellidos = new JTextField();
			apellidos.setBounds(280, 11, 86, 20);
			contentPanel.add(apellidos);
			apellidos.setColumns(10);
		}
		{
			JLabel lblNombre = new JLabel("Nombre");
			lblNombre.setBounds(10, 39, 79, -11);
			contentPanel.add(lblNombre);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Nombre");
			lblNewLabel_1.setForeground(Color.WHITE);
			lblNewLabel_1.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 12));
			lblNewLabel_1.setBounds(10, 14, 79, 14);
			contentPanel.add(lblNewLabel_1);
		}
		{
			JLabel lblApellidos = new JLabel("Apellidos");
			lblApellidos.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 12));
			lblApellidos.setForeground(Color.WHITE);
			lblApellidos.setBounds(195, 14, 68, 14);
			contentPanel.add(lblApellidos);
		}
		{
			dia = new JTextField();
			dia.setText("dd");
			dia.setFont(new Font("Tahoma", Font.PLAIN, 11));
			dia.setForeground(Color.BLACK);
			dia.setBounds(171, 42, 24, 20);
			contentPanel.add(dia);
			dia.setColumns(10);
		}
		{
			mes = new JTextField();
			mes.setText("mm");
			mes.setBounds(256, 42, 24, 20);
			contentPanel.add(mes);
			mes.setColumns(10);
		}
		{
			anno = new JTextField();
			anno.setText("yyyy");
			anno.setBounds(333, 42, 33, 20);
			contentPanel.add(anno);
			anno.setColumns(10);
		}
		{
			JLabel label = new JLabel("/");
			label.setForeground(Color.WHITE);
			label.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 12));
			label.setBounds(205, 45, 24, 14);
			contentPanel.add(label);
		}
		{
			JLabel label = new JLabel("/");
			label.setForeground(Color.WHITE);
			label.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 12));
			label.setBounds(290, 45, 46, 14);
			contentPanel.add(label);
		}
		{
			JLabel lblFechaDeNacimiento = new JLabel("fecha de Nacimiento");
			lblFechaDeNacimiento.setForeground(Color.WHITE);
			lblFechaDeNacimiento.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 12));
			lblFechaDeNacimiento.setBounds(10, 45, 164, 20);
			contentPanel.add(lblFechaDeNacimiento);
		}
		{
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(20, 76, 120, 109);
			contentPanel.add(scrollPane);
			{
				final JList genero = new JList();
				genero.addListSelectionListener(new ListSelectionListener() {
					public void valueChanged(ListSelectionEvent arg0) {
						if(genero.getSelectedIndex() == 0)
							genero1 = Genero.COMEDIA;
						if(genero.getSelectedIndex() == 1)
							genero1 = Genero.TRAGEDIA;
						if(genero.getSelectedIndex() == 2)
							genero1 = Genero.DRAMA;
						if(genero.getSelectedIndex() == 3)
							genero1 = Genero.THRILLER;
						if(genero.getSelectedIndex() == 4)
							genero1 = Genero.ROMANCE;
						if(genero.getSelectedIndex() == 5)
							genero1 = Genero.COMEDIAROMANTICA;
						if(genero.getSelectedIndex() == 6)
							genero1 = Genero.ACCION;
						
							
							
					}
				});
				genero.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
				
				genero.setListData(Genero.values());
				scrollPane.setViewportView(genero);
			}
		}
		{
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(266, 73, 114, 112);
			contentPanel.add(scrollPane);
			{
				final JList personalidad = new JList();
				personalidad.addListSelectionListener(new ListSelectionListener() {
					public void valueChanged(ListSelectionEvent e) {
						if(personalidad.getSelectedIndex() == 0)
							personalidad1 = Personalidad.DICTADOR;
						if(personalidad.getSelectedIndex() == 1)
							personalidad1 = Personalidad.NEGOCIADOR;
						if(personalidad.getSelectedIndex() == 2)
							personalidad1 = Personalidad.ARTISTACREATIVO;
						if(personalidad.getSelectedIndex() == 3)
							personalidad1 = Personalidad.CONFRONTADOR;
							
					}
				});
				personalidad.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
				personalidad.setListData(Personalidad.values());
				scrollPane.setViewportView(personalidad);
			}
		}
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 12));
		lblDni.setForeground(Color.WHITE);
		lblDni.setBounds(66, 200, 46, 14);
		contentPanel.add(lblDni);
		
		dni = new JTextField();
		dni.setBounds(158, 197, 140, 20);
		contentPanel.add(dni);
		dni.setColumns(10);
		{
			JLabel lblNewLabel = new JLabel("");
			lblNewLabel.setForeground(Color.WHITE);
			lblNewLabel.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 12));
			lblNewLabel.setIcon(new ImageIcon(AltaDirector.class.getResource("/imagenesjTheatre/AltaDirector1.jpg")));
			lblNewLabel.setBounds(0, 0, 434, 228);
			contentPanel.add(lblNewLabel);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton annadir = new JButton("annadir");
				annadir.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						try {
							Gestion.annadirDirector(new Director(nombre.getText(),apellidos.getText(),genero1,personalidad1,Integer.parseInt(dia.getText()),Integer.parseInt(mes.getText()),Integer.parseInt(anno.getText()),dni.getText()));
						} catch (NumberFormatException | DniInvalidoException
								| DniDuplicadoException
								| PersonalDuplicadoException e) {
							// TODO Auto-generated catch block
							JOptionPane.showMessageDialog(null, e.getMessage(), "error en la introduccion", JOptionPane.ERROR_MESSAGE);;
						} catch (ApellidosNulosException e) {
							// TODO Auto-generated catch block
							JOptionPane.showMessageDialog(null, e.getMessage(),"error al introducir ", JOptionPane.ERROR_MESSAGE);
						} catch (NombreNuloException e) {
							// TODO Auto-generated catch block
							JOptionPane.showMessageDialog(null, e.getMessage(),"error al introducir ", JOptionPane.ERROR_MESSAGE);
						} catch (GeneroNoValidoException e) {
							// TODO Auto-generated catch block
							JOptionPane.showMessageDialog(null, e.getMessage(),"error al introducir ", JOptionPane.ERROR_MESSAGE);
						} catch (PersonalidadNoValidaException e) {
							// TODO Auto-generated catch block
							JOptionPane.showMessageDialog(null, e.getMessage(),"error al introducir ", JOptionPane.ERROR_MESSAGE);
						}
					}
				});
				annadir.setActionCommand("OK");
				buttonPane.add(annadir);
				getRootPane().setDefaultButton(annadir);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
