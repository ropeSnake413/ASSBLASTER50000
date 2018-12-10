package aSSBLASTER50000;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ASSMainGui {

	JFrame mainFrame;
	JPanel mainPanel, menuPanel, infoPanel;
	JButton btnPatients, btnNewPatient, btnPatientVisits, btnNewVisit;
	JLabel label;
	//JLabel
	//JTextField
	
	public ASSMainGui() {
		
		//creats frame and panel
		mainFrame = new JFrame("Main");
		mainPanel = new JPanel();
		menuPanel = new JPanel();
		infoPanel = new JPanel();
		
		mainPanel.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		//creates the buttons and positions
		
		label = new JLabel("WELCOME");
		c.gridx = 1;
		c.gridy = 0;
		c.gridwidth = 7;
		c.gridheight = 8;
		infoPanel.add(label, c);
		
		btnPatients = new JButton("Doctor's Patients");
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 3;
		c.gridheight = 2;
		
		btnPatients.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				
			}
			
		});
		
		menuPanel.add(btnPatients, c);
		
		
		btnNewPatient = new JButton("New Patient");
		c.gridx = 0;
		c.gridy = 1;
		c.gridwidth = 3;
		c.gridheight = 2;
		menuPanel.add(btnNewPatient, c);
		
		btnPatientVisits = new JButton("Patient Visit Record");
		c.gridx = 0;
		c.gridy = 2;
		c.gridwidth = 3;
		c.gridheight = 2;
		menuPanel.add(btnPatientVisits, c);
		
		btnNewVisit = new JButton("New Visit");
		c.gridx = 0;
		c.gridy = 3;
		c.gridwidth = 3;
		c.gridheight = 2;
		menuPanel.add(btnNewVisit, c);
		
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 3;
		c.gridheight = 8;
		mainPanel.add(menuPanel, c);
		
		c.gridx = 1;
		c.gridy = 0;
		c.gridwidth = 7;
		c.gridheight = 8;
		mainPanel.add(infoPanel, c);
		mainFrame.setContentPane(mainPanel);
		
		//making the frame
		mainFrame.setSize(852, 480);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setVisible(true);
	}
	
}
