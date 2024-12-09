package Views.DangNhap;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import javax.swing.border.EmptyBorder;
import java.awt.Color;

public class SignUpView extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField tfUsername;
    private JPasswordField pwdPassword;
    private JPasswordField pwdConfirm;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    SignUpView frame = new SignUpView();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public SignUpView() {
        setTitle("Sign up");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 393, 243);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Add other components
        JLabel lbUsername = new JLabel("Username:");
        lbUsername.setForeground(new Color(255, 255, 255));
        lbUsername.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lbUsername.setBounds(32, 20, 80, 20);
        contentPane.add(lbUsername);

        JLabel lbPassword = new JLabel("Password:");
        lbPassword.setForeground(new Color(255, 255, 255));
        lbPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lbPassword.setBounds(32, 65, 80, 20);
        contentPane.add(lbPassword);

        JLabel lbConfirm = new JLabel("Confirm:");
        lbConfirm.setForeground(new Color(255, 255, 255));
        lbConfirm.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lbConfirm.setBounds(32, 110, 80, 20);
        contentPane.add(lbConfirm);

        tfUsername = new JTextField();
        tfUsername.setBounds(167, 20, 200, 25);
        contentPane.add(tfUsername);
        tfUsername.setColumns(10);

        pwdPassword = new JPasswordField();
        pwdPassword.setBounds(167, 65, 200, 25);
        contentPane.add(pwdPassword);

        pwdConfirm = new JPasswordField();
        pwdConfirm.setBounds(167, 110, 200, 25);
        contentPane.add(pwdConfirm);

        JButton btnSignUp = new JButton("Sign up");
        btnSignUp.setFont(new Font("Tahoma", Font.PLAIN, 11));
        btnSignUp.setBounds(167, 156, 80, 23);
        contentPane.add(btnSignUp);

        JButton btnCancel = new JButton("Cancel");
        btnCancel.addActionListener(e -> {
            FirstView firstView = new FirstView();
            firstView.setVisible(true);
            dispose();
        });
        btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 11));
        btnCancel.setBounds(290, 156, 77, 23);
        contentPane.add(btnCancel);
        
        ImageIcon backgroundImage = new ImageIcon("D:\\8_Java\\Java_Core\\BTL3\\ImagesResource\\ImagesResource\\signup.jpg");
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setBounds(0, 0, 377, 204);
        contentPane.add(backgroundLabel);

    }
}
