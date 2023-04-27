package baitapthuchanh2;


public class sinhvien {
	String MaSv;
	String Hoten;
	public sinhvien(String MaSv, String Hoten) {
		this.MaSv=MaSv;
		this.Hoten=Hoten;
	}
	public sinhvien() {
		
	}
	public String getMaSv() {
		return MaSv;
	}
	public void setMaSv(String maSv) {
		MaSv = maSv;
	}
	public String getHoten() {
		return Hoten;
	}
	public void setHoten(String hoten) {
		Hoten = hoten;
	}
	@Override
	public String toString() {
		return "SinhVien [MaSv=" + MaSv + ", Hoten=" + Hoten + "]";
	}
	

}
