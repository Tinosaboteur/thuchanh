package baitapthuchanh2;

import java.util.ArrayList;
import java.util.Arrays;

public class hocphan extends sinhvien {
    private String maLHP;
    private String tenLHP;
    private String tenGV;
    private String thongTinLopHoc;
    private sinhvien[] dsSinhVien = new sinhvien[0];

    public hocphan(String maLHP, String tenLHP, String tenGV, String thongTinLopHoc, sinhvien[] dsSinhVien) {
        this.maLHP = maLHP;
        this.tenLHP = tenLHP;
        this.tenGV = tenGV;
        this.thongTinLopHoc = thongTinLopHoc;
        this.dsSinhVien = dsSinhVien;
    }

    public hocphan() {
        this.maLHP = "";
        this.tenLHP = "";
        this.tenGV = "";
        this.thongTinLopHoc = "";
        this.dsSinhVien = new sinhvien[0];
    }

	public hocphan(String MaSv, String Hoten, String maLHP, String tenLHP, String tenGV,
			String thongTinLopHoc, sinhvien[] dsSV) {
		
	}

	public String getMaLHP() {
        return maLHP;
    }

    public void setMaLHP(String maLHP) {
        this.maLHP = maLHP;
    }

    public String getTenLHP() {
        return tenLHP;
    }

    public void setTenLHP(String tenLHP) {
        this.tenLHP = tenLHP;
    }

    public String getTenGV() {
        return tenGV;
    }

    public void setTenGV(String tenGV) {
        this.tenGV = tenGV;
    }

    public String getThongTinLopHoc() {
        return thongTinLopHoc;
    }

    public void setThongTinLopHoc(String thongTinLopHoc) {
        this.thongTinLopHoc = thongTinLopHoc;
    }
    public sinhvien[] getDsSinhVien() {
		return dsSinhVien;
	}

	public void setDsSinhVien(sinhvien[] dsSinhVien) {
		this.dsSinhVien = dsSinhVien;
	}
    @Override
    public String toString() {
        String result = "MaLHP: " + this.maLHP + "\n";
        result += "TenLHP: " + this.tenLHP + "\n";
        result += "GvGiangDay: " + this.tenGV + "\n";
        result += "Thongtinbuoihoc: " + this.thongTinLopHoc + "\n";
        result += "Danh sach sinh vien:\n";
        for (sinhvien sv : this.dsSinhVien) {
            result += sv.getMaSv() + "|" + sv.getHoten() + "\n";
        }
        result += "Tong so sinh vien: " + this.dsSinhVien.length + "\n";
        return result;
    }

}