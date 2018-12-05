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
		frame = new JFrame();
		panel = new JPanel();
		
		panel.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		//creates the text fields
		userName = new JTextField(20);
		passWord = new JTextField(20);
		
		//creates the buttons
		btnEnter = new JButton("Enter");
		
		//creates the labels
		user = new JLabel("Username: ");
		pass = new JLabel("Password: ");
		fail = new JLabel("Incorrect Password");
		
		//positioning
		
		
		/**user.setBounds(10, 400, 50, 20);
		pass.setBounds(10, 170, 50, 30);
		
		userName.setBounds(50, 225, 75, 25);
		passWord.setBounds(50,170, 75, 25);
		
		panel.add(user);
		panel.add(pass);
		panel.add(userName);
		panel.add(passWord);
		frame.add(panel);
		**/
		
		frame.setSize(450, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	}
	
}
