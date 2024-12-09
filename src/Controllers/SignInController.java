package Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Models.KhoDb;
import Views.HomePageView;
import Views.DangNhap.SignInView;

public class SignInController implements ActionListener{
	private SignInView siView;
	public SignInController(SignInView temp) {
		this.siView = temp;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String url = e.getActionCommand();
		if (url.equals("Sign In")) {
			String username = this.siView.getTfUsername().getText();
			char[] ps = this.siView.getPfPassword().getPassword();
			String password = new String(ps);
			KhoDb db = new KhoDb();
			boolean check = db.getLiTaiKhoan().checkSignIn(username, password);
			if (check == true) {
				new HomePageView();
				this.siView.dispose();
			}
			else {
				JOptionPane.showConfirmDialog(siView, "Tên đăng nhập hoặc mật khẩu không đúng!",
						"Cảnh báo",
						JOptionPane.CLOSED_OPTION,
						JOptionPane.WARNING_MESSAGE);
			}
		}
	}

}
