package aSSBLASTER50000;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
	String username, password;
	
	public ASSGui() {
		
		//creates frame and panel
		frame = new JFrame("Login");
		panel = new JPanel();
		
		panel.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		//creates the text fields and positions
		userName = new JTextField(20);
		c.gridx = 1;
		c.gridy = 0;
		panel.add(userName, c);
		
		passWord = new JTextField(20);
		c.gridx = 1;
		c.gridy = 1;
		panel.add(passWord, c);
		
		//creates the buttons and positions
		btnEnter = new JButton("Enter");
		c.gridx = 0;
		c.gridy = 2;
		panel.add(btnEnter, c);
		
		//creates the labels and positions
		user = new JLabel("Username: ");
		c.gridy = 0;
		c.gridx = 0;
		panel.add(user, c);
		
		pass = new JLabel("Password: ");
		c.gridx = 0;
		c.gridy = 1;
		panel.add(pass, c);
		
		
		
		//making the button work
		btnEnter.addActionListener(new ActionListener(){

			
			public void actionPerformed(ActionEvent arg0) {
				ASSwordCheck assword = new ASSwordCheck();
				username = userName.getText();
				password = passWord.getText();
				int rtn=assword.idCheck(username, password);
				
				//if(rtn!=0) {
					frame.dispose();
					ASSMainGui assblast = new ASSMainGui();
				//}else if(rtn==0){
					fail = new JLabel("Incorrect Password");
					c.gridx = 1;
					c.gridy = 2;
					panel.add(fail, c);
				//}
				
			}
			
		});
		
		
		frame.setContentPane(panel);
		
		frame.setSize(350, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	}
	
}
