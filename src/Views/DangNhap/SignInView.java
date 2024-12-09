package Views.DangNhap;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Controllers.SignInController;

public class SignInView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfUsername;
	private JPasswordField pfPassword;
	private JButton btnSignIn;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					SignInView frame = new SignInView();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
//
//	/**
//	 * Create the frame.
//	 */
	public SignInView() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Sign In");
		this.setSize(500, 300);
		
		SignInController ac = new SignInController(this);
		
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setForeground(new Color(0, 0, 0));
		lblUsername.setFont(new Font("Arial", Font.BOLD, 14));
		lblUsername.setBounds(50, 50, 100, 25);
		contentPane.add(lblUsername);

		tfUsername = new JTextField();
		tfUsername.setFont(new Font("Arial", Font.PLAIN, 14));
		tfUsername.setBounds(204, 50, 235, 25);
		contentPane.add(tfUsername);
		tfUsername.setColumns(10);

		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setForeground(new Color(0, 0, 0));
		lblPassword.setFont(new Font("Arial", Font.BOLD, 14));
		lblPassword.setBounds(50, 100, 100, 25);
		contentPane.add(lblPassword);

		btnSignIn = new JButton("Sign In");
		btnSignIn.setFont(new Font("Arial", Font.PLAIN, 14));
		btnSignIn.setBounds(204, 150, 88, 25);
		btnSignIn.addActionListener(ac);
		contentPane.add(btnSignIn);

		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(e -> {
            FirstView firstView = new FirstView();
            firstView.setVisible(true);
            dispose();
        });
		btnCancel.setFont(new Font("Arial", Font.PLAIN, 14));
		btnCancel.setBounds(351, 150, 88, 25);
		contentPane.add(btnCancel);

		pfPassword = new JPasswordField();
		pfPassword.setFont(new Font("Arial", Font.PLAIN, 14));
		pfPassword.setBounds(204, 100, 235, 25);
		contentPane.add(pfPassword);

		ImageIcon backgroundImageIcon = new ImageIcon("D:\\8_Java\\Java_Core\\BTL3\\ImagesResource\\ImagesResource\\signin.jpg");
		JLabel backgroundLabel = new JLabel(backgroundImageIcon);
		backgroundLabel.setBounds(0, 0, 484, 261);
		contentPane.add(backgroundLabel);
		
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}

	public JTextField getTfUsername() {
		return tfUsername;
	}

	public JPasswordField getPfPassword() {
		return pfPassword;
	}

	public JButton getBtnSignIn() {
		return btnSignIn;
	}
}
