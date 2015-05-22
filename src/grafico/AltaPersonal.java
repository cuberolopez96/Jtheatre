package grafico;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AltaPersonal extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AltaPersonal dialog = new AltaPersonal();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AltaPersonal() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JButton actor = new JButton("Actor");
			actor.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					new AltaActor().setVisible(true);
				}
			});
			actor.setBounds(10, 10, 414, 23);
			contentPanel.add(actor);
		}
		{
			JButton guionista = new JButton("guionista");
			guionista.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			guionista.setBounds(10, 56, 414, 23);
			contentPanel.add(guionista);
		}
		{
			JButton director = new JButton("director");
			director.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					new AltaDirector().setVisible(true);
				}
			});
			director.setBounds(10, 98, 414, 28);
			contentPanel.add(director);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
