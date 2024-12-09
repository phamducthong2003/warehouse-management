package Tests;

import javax.swing.JPanel;

import Controllers.HomePageController;
import Databases.DbEngine;
import Models.KhoDb;
import Models.DanhMuc.DanhMuc;
import Models.DanhMuc.QuanlyDanhMucModel;
import Models.SanPham.QuanlySanPhamModel;
import Models.SanPham.SanPham;
import Models.TaiKhoan.QuanlyTaiKhoanModel;
import Models.TaiKhoan.TaiKhoan;
import Views.HomePageView;
import Views.QuanlyDanhMucView;
import Views.QuanlySanPhamView;
import Views.DangNhap.FirstView;
import Views.DangNhap.SignInView;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		new QuanlyDanhMucView();
//		new QuanlySanPhamView();
//		new SignInView();
		new FirstView();
//		QuanlyTaiKhoanModel temp = new QuanlyTaiKhoanModel();
//		
//		TaiKhoan sp1 = new TaiKhoan("user1", "user1", "Thông", "BG" , "DM1"); temp.getLi().add(sp1);
//		TaiKhoan sp2 = new TaiKhoan("user2", "user2", "Mạnh", "BG", "DM2"); temp.getLi().add(sp2);
//		TaiKhoan sp3 = new TaiKhoan("user3", "user3", "Hùng", "BG" , "DM1"); temp.getLi().add(sp3);
//		TaiKhoan sp4 = new TaiKhoan("user4", "user4", "Quang", "HY" , "DM3"); temp.getLi().add(sp4);
//		TaiKhoan sp5 = new TaiKhoan("user5", "user5", "Hiếu", "HN", "DM2"); temp.getLi().add(sp5);
//		
//		DbEngine.saveChange(temp);
//		
//		KhoDb temp2 = new KhoDb();
//		
//		for(TaiKhoan item : temp2.getLiTaiKhoan().getLi()) {
//			System.out.println(item);
//		}
//		
//		System.out.println("Suscess");
//		HomePageView temp = new HomePageView();
//		//QuanlyDanhMucView temp2 = new QuanlyDanhMucView();
//		Test temp2 = new Test();
//		temp.addView(temp2);

	}

}
