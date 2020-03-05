package NguyenMinhNgan.com.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import NguyenMinhNgan.com.model.GiamDoc;
import NguyenMinhNgan.com.model.NhanVien;
import NguyenMinhNgan.com.model.NhanVienChinhThuc;
import NguyenMinhNgan.com.model.NhanVienThoiVu;

public class testNhanVien {

	public static void main(String[] args) 
	{
		ArrayList<NhanVien>dsNV=new ArrayList<>();
		NhanVien teo = new NhanVienChinhThuc();
		teo.setMa(1);
		teo.setTen("NguyeenMinh Teo");
		dsNV.add(teo);
		NhanVien ty = new NhanVienThoiVu();
		ty.setMa(3);
		ty.setTen("Tý");
		dsNV.add(ty);
		NhanVien bo = new GiamDoc();
		bo.setMa(2);
		bo.setTen("VIP");
		dsNV.add(bo);
		for (NhanVien nv: dsNV) 
		{
			String s= nv.toString();
			if (nv instanceof GiamDoc)
				s+="=> vì là giám đốc";
			else if (nv instanceof NhanVienChinhThuc)
				s+="=> vì là nhân viên chính thức";
			if (nv instanceof NhanVienThoiVu)
				s+="=> vì là nhân viên thời vụ";
			System.out.println(s);
		}
		Collections.sort(dsNV);
		System.out.println("Danh sách sau khi sắp xếp.");
		for (NhanVien nv: dsNV) 
		{
			String s= nv.toString();
			if (nv instanceof GiamDoc)
				s+="=> vì là giám đốc";
			else if (nv instanceof NhanVienChinhThuc)
				s+="=> vì là nhân viên chính thức";
			if (nv instanceof NhanVienThoiVu)
				s+="=> vì là nhân viên thời vụ";
			System.out.println(s);
		}
	}
}
