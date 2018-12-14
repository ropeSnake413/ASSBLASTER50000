package aSSBLASTER50000;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ASSMainGui {

	JFrame mainFrame;
	JPanel panel;
	JButton btnPatients, btnNewPatient, btnPatientVisits, btnNewVisit;
	JLabel label;
	JScrollPane scroll;
	JTable table;
	
	Object[] row;
	DefaultTableModel model;
	
	public ASSMainGui(int DOCTOR) {
		
		//creats frame and panel
		mainFrame = new JFrame(" " + DOCTOR);
		panel = new JPanel();
		table = new JTable();
		
		//create table
		Object[] columns = {"id, name, phone, docid"};
		model = new DefaultTableModel();
		model.setColumnIdentifiers(columns);
		
		table.setModel(model);
		table.setRowHeight(30);
		
		//layout
		//panel.setLayout(new GridBagLayout());
		//GridBagConstraints c = new GridBagConstraints();
		
		ImageIcon imageIcon = new ImageIcon("D:/giphy.gif");
		
		//creates the buttons and positions///
		JLabel pepe = new JLabel(imageIcon);//
		//c.gridx = 1;						//
		//c.gridy = 0;
		//c.gridheight = 4;
		//panel.add(pepe, c);				//
		//////////////////////////////////////
		
		
		btnPatients = new JButton("  Doctor's Patients   ");
		//c.gridx = 0;
		//c.gridy = 0;
		//c.gridheight = 1;
		
		//shows list of patients for the doctor
		btnPatients.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				JScrollPane pane = new JScrollPane(table);
			//	c.gridx = 1;
			//	c.gridy = 0;
			//mainFrame.add(pane, c);
				
			}
			
		});
		
	//	panel.add(btnPatients, c);
	//	
		
		btnNewPatient = new JButton("       New Patient      ");
		//c.gridx = 0;
		//c.gridy = 1;
		//c.gridheight = 1;
		//panel.add(btnNewPatient, c);
		//
		btnPatientVisits = new JButton("Patient Visit Record");
		//c.gridx = 0;
	//	c.gridy = 2;
		//c.gridheight = 1;
	//	panel.add(btnPatientVisits, c);
		
		btnNewVisit = new JButton("         New Visit          ");
		//c.gridx = 0;
		//c.gridy = 3;
		//c.gridheight = 1;
		//panel.add(btnNewVisit, c);
		
		btnPatients.setLocation(100, 100);
		btnPatients.setSize(30, 10);
		//btnNewPatient.setBounds(150, 265, 100, 25);
		
		//mainFrame.setLayout(null);
		
		panel.add(btnPatients);
		//panel.add(btnNewPatient);
		mainFrame.setContentPane(panel);
		
		//making the frame
		mainFrame.setSize(852,480);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setVisible(true);
	}
	
	
	
}
