package aSSBLASTER50000;
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
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
public class GUIAGAIN {
	
	JFrame frame;
	JPanel CONTAIN, buttons, dispp, addp, dispv, addv;
	JButton pd,pa,vd,va, enter, enter2, enter3;
	DefaultTableModel model;
	JTable table;
	Object row[];
	JScrollPane pane;
	JTextField name, phone;
	JLabel namee, phonee, error;


	
	public GUIAGAIN(int DOCTOR) {
		//gets methods
		ASSpatientStuff pat=new ASSpatientStuff();
		ASSvisits vis=new ASSvisits();
		
		//does frame
		frame=new JFrame("Doctor ID: "+DOCTOR);
		frame.setBackground(Color.YELLOW);
		
		//makes table
		table=new JTable();
		Object[] columns = {"Name","Phone"};
		model = new DefaultTableModel();
		model.setColumnIdentifiers(columns);
		
		
		//panels
		CONTAIN=new JPanel();
		buttons=new JPanel();
		dispp=new JPanel();
		addp=new JPanel();
		dispv=new JPanel();
		addv=new JPanel();
		
		//yahahaha you found me
		
		//makes constraints
		GridBagConstraints c = new GridBagConstraints();
		
		//dimension things
		Dimension d=new Dimension(200, 480);
		
		//sets sizes of panels
		buttons.setSize(d);
		buttons.setBackground(Color.CYAN);		
		d=new Dimension(500, 480);
		dispp.setSize(d);
		dispp.setBackground(Color.green);	
		addp.setSize(d);
		addp.setBackground(Color.PINK);
		dispv.setSize(d);
		dispv.setBackground(Color.red);
		addv.setSize(d);
		addv.setBackground(Color.orange);
		d=new Dimension(700,480);
		CONTAIN.setSize(d);
		CONTAIN.setBackground(Color.DARK_GRAY);
		
		CONTAIN.setLayout(new GridBagLayout());
		buttons.setLayout(new GridBagLayout());
		dispp.setLayout(new GridBagLayout());
		addp.setLayout(new GridBagLayout());
		dispv.setLayout(new GridBagLayout());
		addv.setLayout(new GridBagLayout());
		
		//sets layout for frame
		frame.setLayout(new GridBagLayout());
		
		
		//makes buttons
		d=new Dimension(180, 100);
		
		pd=new JButton("View Patients");
		pd.setMinimumSize(d);
		JScrollPane pane=new JScrollPane(table);
		//adds action to pd
		pd.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {

				row=new Object[2];
				model.setRowCount(0);
				ArrayList<ComboObject> patient=new ArrayList<ComboObject>();

				patient=pat.toCombo(DOCTOR);
				
				for(int k=0; k<patient.size(); k++) {
					row[0]=patient.get(k).rtnN();
					row[1]=patient.get(k).rtnP();
					model.addRow(row);
					System.out.println(patient.get(k).rtnAll());
					table.setModel(model);
				}
				dispp.setVisible(true);
				addp.setVisible(false);
				dispv.setVisible(false);
				addv.setVisible(false);

			}
			
		});
		c.gridx=0;
		c.gridy=0;
		c.ipadx=1;
		c.ipady=1;
		dispp.add(pane,c);
		c.gridx=0;
		c.gridy=0;
		c.ipadx=90;
		c.ipady=50;
		buttons.add(pd,c);
		
		
		pa=new JButton("Add Patients");
		namee=new JLabel("Name: ");
		phonee=new JLabel("Phone: ");
		name=new JTextField();
		phone=new JTextField();
		enter=new JButton("Enter");
		error=new JLabel(":>");
		pa.setMinimumSize(d);
		c.gridx=0;
		c.gridy=1;
		c.ipadx=90;
		c.ipady=50;
		//adds action to pa
		pa.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				name.setText("");
				phone.setText("");
				error.setText(":>");
				dispp.setVisible(false);
				addp.setVisible(true);
				dispv.setVisible(false);
				addv.setVisible(false);

			}
			
		});
		enter.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				String n=name.getText();
				String p=phone.getText();
				if((name.getText().equals("") && phone.getText().equals(""))||(name.getText().equals("")||phone.getText().equals(""))) {
					error.setText("Error");
				}else {
					pat.addPaitent(name.getText(), phone.getText(), DOCTOR);
					error.setText("Success");
				}
			}
			
		});
		c.gridx=0;
		c.gridy=0;
		addp.add(namee,c);
		c.gridx=1;
		c.gridy=0;
		addp.add(name,c);
		c.gridx=0;
		c.gridy=1;
		addp.add(phonee,c);
		c.gridx=1;
		c.gridy=1;
		addp.add(phone,c);
		c.gridx=0;
		c.gridy=2;
		addp.add(enter,c);
		c.gridx=1;
		c.gridy=2;
		addp.add(error,c);
		c.gridx=0;
		c.gridy=1;
		c.ipadx=90;
		c.ipady=50;
		buttons.add(pa,c);
		
		
		
		
		vd=new JButton("View Visits");
		vd.setMinimumSize(d);
		c.gridx=0;
		c.gridy=2;
		c.ipadx=90;
		c.ipady=50;
		//adds action to vd
		vd.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispp.setVisible(false);
				addp.setVisible(false);
				dispv.setVisible(true);
				addv.setVisible(false);

			}
			
		});
		buttons.add(vd,c);
		
		va=new JButton("Add Visits");
		va.setMinimumSize(d);
		c.gridx=0;
		c.gridy=3;
		c.ipadx=90;
		c.ipady=50;
		//adds action to va
		va.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispp.setVisible(false);
				addp.setVisible(false);
				dispv.setVisible(false);
				addv.setVisible(true);

			}
			
		});
		buttons.add(va,c);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//adds buttons to the container panel
		c.gridx=0;
		c.gridy=0;
		c.ipadx=100;
		c.ipady=-90;
		CONTAIN.add(buttons, c);
		
		//adds starting panel to the container panel
		c.gridx=1;
		c.gridy=0;
		c.ipadx=600;
		c.ipady=480;
		CONTAIN.add(dispp, c);
		
		//more adding
		c.gridx=1;
		c.gridy=0;
		c.ipadx=600;
		c.ipady=480;
		CONTAIN.add(addp, c);
		
		//still adding
		c.gridx=1;
		c.gridy=0;
		c.ipadx=600;
		c.ipady=480;
		CONTAIN.add(dispv, c);
		
		//still adding
		c.gridx=1;
		c.gridy=0;
		c.ipadx=600;
		c.ipady=480;
		CONTAIN.add(addv, c);
		
		//sets contain to the frame
		frame.setContentPane(CONTAIN);
		
		//frame stuff
		frame.setSize(900,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
