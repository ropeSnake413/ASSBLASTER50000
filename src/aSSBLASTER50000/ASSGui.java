package aSSBLASTER50000;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ASSGui {
	
	JLabel user, pass, fail;
	JPanel panel;
	JFrame frame;
	JButton btnEnter;
	JTextField userName, passWord;
	
	public ASSGui() {
		
		//creates frame and panel
		frame = new JFrame("Login");
		panel = new JPanel();
		
		panel.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		//creates the text fields
		userName = new JTextField(20);
		c.gridx = 1;
		c.gridy = 0;
		panel.add(userName, c);
		
		passWord = new JTextField(20);
		c.gridx = 1;
		c.gridy = 1;
		panel.add(passWord, c);
		
		//creates the buttons
		btnEnter = new JButton("Enter");
		c.gridx = 0;
		c.gridy = 2;
		panel.add(btnEnter, c);
		
		//creates the labels
		user = new JLabel("Username: ");
		c.gridy = 0;
		c.gridx = 0;
		panel.add(user, c);
		
		pass = new JLabel("Password: ");
		c.gridx = 0;
		c.gridy = 1;
		panel.add(pass, c);
		
		fail = new JLabel("Incorrect Password");
		
		//positioning
		
		
		
		frame.setContentPane(panel);
		
		frame.setSize(350, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	}
	
}
