package aSSBLASTER50000;

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
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
		//creates the text fields
		JTextField userName = new JTextField(20);
		JTextField passWord = new JTextField(20);
		
		//creates the buttons
		JButton btnEnter = new JButton();
		
		//creates the labels
		JLabel user = new JLabel("Username: ");
		JLabel pass = new JLabel("Password: ");
		JLabel fail = new JLabel("Incorrect Password");
		
		//positioning
		user.setBounds(10, 200, 50, 20);
		pass.setBounds(10, 170, 50, 20);
		
		panel.add(user);
		panel.add(pass);
		frame.add(panel);
		
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	}
	
}
