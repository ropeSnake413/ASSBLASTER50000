package aSSBLASTER50000;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

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
		
		//gets patientstuff
		ASSpatientStuff pat=new ASSpatientStuff();
		
		
		//creats frame and panel
		mainFrame = new JFrame(" " + DOCTOR);
		panel = new JPanel();
		table = new JTable();
		
		mainFrame.setLayout(null);
		
		//create table
		Object[] columns = {"name","phone"};
		model = new DefaultTableModel();
		model.setColumnIdentifiers(columns);
		
		table.setModel(model);
		table.setRowHeight(30);
		
		//layout
		panel.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		ImageIcon imageIcon = new ImageIcon("D:/giphy.gif");
		
		//creates the buttons and positions///
		JLabel pepe = new JLabel(imageIcon);//
		//c.gridx = 1;						//
		//c.gridy = 0;
		//c.gridheight = 4;
		//panel.add(pepe, c);				//
		//////////////////////////////////////
		
		
		btnPatients = new JButton("  Doctor's Patients   ");
		c.gridx = 0;
		c.gridy = 0;
		c.gridheight = 1;
		
		//shows list of patients for the doctor
		btnPatients.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				JScrollPane pane = new JScrollPane(table);
				Dimension d=new Dimension(200, 200);
				pane.setMinimumSize(d);
				c.gridx = 1;
				c.gridy = 0;
				c.gridheight = 3;
				
				
				
				row = new Object[2];
				model.setRowCount(0);
				ArrayList<ComboObject> patient=new ArrayList<ComboObject>();

				patient=pat.toCombo(DOCTOR);
				for(int k=0; k<patient.size(); k++) {
					row[0]=patient.get(k).rtnN();
					row[1]=patient.get(k).rtnP();
					model.addRow(row);
				}
				
				mainFrame.add(pane, c);
				mainFrame.setVisible(true);
			}
			
		});
		
		panel.add(btnPatients, c);
		
		
		btnNewPatient = new JButton("       New Patient      ");
		c.gridx = 0;
		c.gridy = 1;
		c.gridheight = 1;
		panel.add(btnNewPatient, c);
		
		btnPatientVisits = new JButton("Patient Visit Record");
		c.gridx = 0;
		c.gridy = 2;
		c.gridheight = 1;
		panel.add(btnPatientVisits, c);
		
		btnNewVisit = new JButton("         New Visit          ");
		c.gridx = 0;
		c.gridy = 3;
		c.gridheight = 1;
		panel.add(btnNewVisit, c);
		
		mainFrame.setContentPane(panel);
		
		//making the frame
		mainFrame.setSize(852,480);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setVisible(true);
	}
	
	
	
}
