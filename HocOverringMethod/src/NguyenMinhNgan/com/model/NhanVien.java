package NguyenMinhNgan.com.model;

public abstract class NhanVien implements Comparable<NhanVien>
{
	protected int ma;
	protected String ten;
	
	public int getMa() {
		return ma;
	}
	public void setMa(int ma) {
		this.ma = ma;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public abstract double tinhLuong();
	public abstract double tinhLuong(int ngaycong);
	@Override
	public String toString() {
		return ma +"\t"+ten+"\t"+tinhLuong();
	}
	@Override
	public int compareTo(NhanVien o) {
		if (this.ma<o.ma) return -1;
		if (this.ma>o.ma) return 1;
		return 0;
	}
	
	
}
