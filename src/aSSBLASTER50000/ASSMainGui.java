package aSSBLASTER50000;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ASSMainGui {

	JFrame mainFrame;
	JPanel mainPanel, menuPanel, infoPanel;
	JButton btnPatients, btnNewPatient, btnPatientVisits, btnNewVisit;
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
		btnPatients = new JButton("Doctor's Patients");
		c.gridx = 0;
		c.gridy = 0;
		menuPanel.add(btnPatients, c);
		
		btnNewPatient = new JButton("New Patient");
		c.gridx = 0;
		c.gridy = 1;
		menuPanel.add(btnNewPatient, c);
		
		btnPatientVisits = new JButton("Patient Visit Record");
		c.gridx = 0;
		c.gridy = 2;
		menuPanel.add(btnPatientVisits, c);
		
		btnNewVisit = new JButton("New Visit");
		c.gridx = 0;
		c.gridy = 3;
		menuPanel.add(btnNewVisit, c);
		
		
		mainPanel.add(menuPanel);
		mainPanel.add(infoPanel);
		mainFrame.setContentPane(mainPanel);
		
		//making the frame
		mainFrame.setSize(852, 480);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setVisible(true);
	}
	
}
