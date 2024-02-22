package Gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class GUI01 {
	JTextField tfUser;
	JPasswordField pfPass;
	public GUI01() {
		JFrame frm = new JFrame("Login");
		frm.setLayout(null);
		
		JLabel lblUser = new JLabel("Username: ", JLabel.RIGHT);
		lblUser.setBounds(25,100,200,30);
		frm.add(lblUser);
		tfUser = new JTextField();
		tfUser.setBounds(230,100,200,30);
		frm.add(tfUser);
		
		JLabel lblPass = new JLabel("Password: ", JLabel.RIGHT);
		lblPass.setBounds(25,135,200,30);
		frm.add(lblPass);
		
		pfPass = new JPasswordField();
		pfPass.setBounds(230, 135, 200, 30);
		frm.add(pfPass);

		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String user = tfUser.getText();
				String pass = pfPass.getText();
				System.out.println(user+" / "+pass);
			}
		});
		btnSubmit.setBounds(150,250,100,30);
		frm.add(btnSubmit);

		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new MyClass());
		btnExit.setBounds(260,250,100,30);
		frm.add(btnExit);
	
		frm.setBounds(200, 180, 600, 450);
		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new GUI01();
	}
}

class MyClass implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent ae) {
		System.out.println("Thank you!");
		System.exit(0);
	}
	
}