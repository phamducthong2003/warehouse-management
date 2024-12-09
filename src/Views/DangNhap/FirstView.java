package Views.DangNhap;

import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;

public class FirstView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstView frame = new FirstView();
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
	public FirstView() {
		setTitle("Phần mềm quản lý bán hàng");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 392);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		ImageIcon backgroundImage = new ImageIcon("D:\\8_Java\\Java_Core\\BTL3\\ImagesResource\\ImagesResource\\mainbackground.jpg");

		JButton btnDangNhap = new JButton("Đăng nhập");
		btnDangNhap.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnDangNhap.setBounds(490, 310, 110, 23);
		btnDangNhap.addActionListener(e -> {
            SignInView signInView = new SignInView();
            signInView.setVisible(true);
            dispose();
        });
		contentPane.add(btnDangNhap);

		JLabel lblNewLabel = new JLabel("Chào mừng bạn đến với phần mềm quản lý kho hàng");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(78, 0, 535, 23);
		contentPane.add(lblNewLabel);

		JLabel backgroundLabel = new JLabel(backgroundImage);
		backgroundLabel.setBounds(-11, 0, 661, 360);

		contentPane.add(backgroundLabel);
		
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
