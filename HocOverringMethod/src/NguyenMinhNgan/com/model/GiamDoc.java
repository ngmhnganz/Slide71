package NguyenMinhNgan.com.model;

public class GiamDoc extends NhanVienChinhThuc {

	@Override
	public double tinhLuong() {
		return 1.1*super.tinhLuong();
	}

}
