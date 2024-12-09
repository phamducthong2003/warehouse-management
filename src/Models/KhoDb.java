package Models;

import Databases.DbEngine;
import Models.DanhMuc.QuanlyDanhMucModel;
import Models.SanPham.QuanlySanPhamModel;
import Models.TaiKhoan.QuanlyTaiKhoanModel;

// Model để đọc các danh sách từ File Database
public class KhoDb {
	private QuanlyDanhMucModel liDanhMuc;
	private QuanlySanPhamModel liSanPham;
	private QuanlyTaiKhoanModel liTaiKhoan;
	
	public KhoDb() {
		liDanhMuc = (QuanlyDanhMucModel) DbEngine.openData("QuanlyDanhMucModel");
		liSanPham = (QuanlySanPhamModel) DbEngine.openData("QuanlySanPhamModel");
		liTaiKhoan = (QuanlyTaiKhoanModel) DbEngine.openData("QuanlyTaiKhoanModel");
	}
	public QuanlyDanhMucModel getLiDanhMuc() {
		return liDanhMuc;
	}
	public QuanlySanPhamModel getLiSanPham() {
		return liSanPham;
	}
	public QuanlyTaiKhoanModel getLiTaiKhoan() {
		return liTaiKhoan;
	}
}
