package NguyenMinhNgan.com.model;

import NguyenMinhNgan.NhanVien;

public class NhanVienThoiVu extends NhanVien {

	@Override
	public double tinhLuong() {
		return 100;
	}

	@Override
	public double tinhLuong(int ngaycong) {
		return ngaycong*100;
	}
	
}
