package grafico;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import jteatre.Actor;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class HabilidadesActor extends JDialog {
	public static  Actor  actor;
	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			HabilidadesActor dialog = new HabilidadesActor(actor);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public HabilidadesActor(final Actor actor) {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent arg0) {
				setEnabled(false);
				setVisible(false);
			}
		});
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		this.actor = actor;
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JCheckBox cantar = new JCheckBox("cantar");
			cantar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				actor.sabeCantar(true);
				}
			});
			cantar.setBounds(24, 23, 57, 23);
			contentPanel.add(cantar);
		}
		{
			JCheckBox bailar = new JCheckBox("bailar");
			bailar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					actor.sabeBailar(true);
				}
			});
			bailar.setBounds(24, 49, 97, 23);
			contentPanel.add(bailar);
		}
		{
			JCheckBox accion = new JCheckBox("accion");
			accion.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					actor.sabeAccion(true);
				}
			});
			accion.setBounds(24, 75, 97, 23);
			contentPanel.add(accion);
		}
		{
			JCheckBox thriller = new JCheckBox("thriller");
			thriller.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					actor.sabeThriller(true);
				}
			});
			thriller.setBounds(24, 101, 97, 23);
			contentPanel.add(thriller);
		}
		{
			JCheckBox comedia = new JCheckBox("comedia");
			comedia.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					actor.sabeComedia(true);
				}
			});
			comedia.setBounds(24, 127, 97, 23);
			contentPanel.add(comedia);
		}
		{
			JCheckBox drama = new JCheckBox("drama");
			drama.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					actor.sabeComedia(true);
				}
			});
			drama.setBounds(24, 153, 97, 23);
			contentPanel.add(drama);
		}
		{
			JCheckBox tragedia = new JCheckBox("tragedia");
			tragedia.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					actor.sabeTragedia(true);
				}
			});
			tragedia.setBounds(24, 179, 97, 23);
			contentPanel.add(tragedia);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton salir = new JButton("salir");
				salir.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						setEnabled(false);
						setVisible(false);
					}
				});
				salir.setActionCommand("Cancel");
				buttonPane.add(salir);
			}
		}
	}

}
