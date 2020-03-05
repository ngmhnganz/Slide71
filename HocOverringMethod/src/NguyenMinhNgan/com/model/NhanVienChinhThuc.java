package NguyenMinhNgan.com.model;

public class NhanVienChinhThuc extends NhanVien {

	public double tinhLuong() {
		return 5000;
	}

	@Override
	public double tinhLuong(int ngaycong) {
		return ngaycong*500;
	}

}
