package aSSBLASTER50000;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.LayoutManager;
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
	JPanel panel, panel2, container;
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
		
		
		panel2= new JPanel();
		container = new JPanel();
		table = new JTable();
		
		Dimension dime=new Dimension(200, 480);
		panel.setSize(dime);
		panel.setBackground(Color.BLUE);
		
		
		Dimension dime2=new Dimension(500, 480);
		panel2.setSize(dime2);
		panel2.setBackground(Color.RED);
		
		mainFrame.setLayout(new GridBagLayout());

		//create table
		Object[] columns = {"name","phone"};
		model = new DefaultTableModel();
		model.setColumnIdentifiers(columns);
		
		table.setModel(model);
		table.setRowHeight(30);
		
		//layout
		panel.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		panel2.setLayout(new GridBagLayout());
		GridBagConstraints c2 = new GridBagConstraints();
		
		ImageIcon imageIcon = new ImageIcon("D:/giphy.gif");
		
		//creates the buttons and positions///
		JLabel pepe = new JLabel(imageIcon);//
		c2.gridx = 0;						//
		c2.gridy = 0;
		c2.gridheight = 4;
		Dimension dii=new Dimension(500, 480);
		pepe.setSize(dii);
		panel2.add(pepe, c2);				//
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
				c2.gridx = 0;
				c2.gridy = 0;
				c2.gridheight = 0;
				
				
				
				row = new Object[2];
				model.setRowCount(0);
				ArrayList<ComboObject> patient=new ArrayList<ComboObject>();

				patient=pat.toCombo(DOCTOR);
				for(int k=0; k<patient.size(); k++) {
					row[0]=patient.get(k).rtnN();
					row[1]=patient.get(k).rtnP();
					model.addRow(row);
					System.out.println(patient.get(k).rtnAll());
				}
				
				panel2.add(pane, c2);
				panel2.setVisible(true);
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
		
		container.add(panel, c);
		container.add(panel2, c);
		
		mainFrame.add(container);
		
		//making the frame
		mainFrame.setSize(700,480);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setVisible(true);
	}
	
	
	
}
