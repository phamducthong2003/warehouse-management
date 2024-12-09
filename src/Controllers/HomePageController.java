package Controllers;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Views.HomePageView;
import Views.QuanlyDanhMucView;
import Views.QuanlySanPhamView;

public class HomePageController implements ActionListener{
	private HomePageView hpView;
	
	public HomePageController(HomePageView hpView) {
		this.hpView = hpView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String url = e.getActionCommand();
		System.out.println(url);
		if (url.equals("Quản lý danh mục") || url.equals("Danh mục")) {
			this.hpView.addViewDanhMuc();
		}
		if (url.equals("Quản lý sản phẩm") || url.equals("Sản phẩm")) {
			this.hpView.addViewSanPham();
		}
		if (url.equals("Trang chủ")) {
			this.hpView.addViewTrangChu();
		}
		if (url.equals("Quản lý tài khoản") || url.equals("Tài khoản")) {
			this.hpView.addViewTaiKhoan();
		}
	}

}
