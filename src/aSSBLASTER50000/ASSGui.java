package aSSBLASTER50000;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.print.DocFlavor.URL;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;

import javax.swing.border.*;

public class ASSGui {
	
	JLabel user, pass, fail;
	JPanel panel;
	JFrame frame;
	JButton btnEnter;
	JTextField userName, passWord;
	String username, password;
	Font myFont = new Font("Comic Sans MS", Font.BOLD, 12);
	Border raisedbevel = BorderFactory.createRaisedBevelBorder();

	public ASSGui() {
		/////////////////////////////////////////////
		
		//////////////////////////////////////////////////
		
		
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
		
		passWord = new JPasswordField(20);
		c.gridx = 1;
		c.gridy = 1;
		panel.add(passWord, c);
		
		
		///////////////////////////////////////
		
		//////////////////////////////////////////
		
		
		
		//creates the buttons and positions
		btnEnter = new JButton("Enter");
		btnEnter.setFont(myFont);
		c.gridx = 0;
		c.gridy = 2;
		panel.add(btnEnter, c);
		
		//creates the labels and positions
		user = new JLabel("Username: ");
		user.setFont(myFont);
		user.setBorder(raisedbevel);
		c.gridy = 0;
		c.gridx = 0;
		panel.add(user, c);
		
		pass = new JLabel("Password: ");
		pass.setFont(myFont);
		pass.setBorder(raisedbevel);


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
				////////////////////////
				if(rtn>=0) {
					frame.dispose();
					//CHANGE BACK TO NOT A THING
					//rtn=1;
					GUIAGAIN gui=new GUIAGAIN(rtn);
					//ASSMainGui assblast = new ASSMainGui(rtn);
				}else if(rtn<0){
					fail = new JLabel("Incorrect Password");
					c.gridx = 1;
					c.gridy = 2;
					fail.setFont(myFont);
					panel.add(fail, c);
		
				}
				/////////////////////////
			}
			
		});
		
		
		frame.setContentPane(panel);
		
		frame.setSize(350, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	}
	
}
