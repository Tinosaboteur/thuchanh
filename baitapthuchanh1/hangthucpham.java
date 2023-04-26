package baitapthuchanh1;

import java.time.LocalDate;


public class hangthucpham {
    public hangthucpham() {
    }
    public hangthucpham(String mahang) {
        this.mahang = mahang;
    }
	public hangthucpham(String mahang2, String tenhang2, Double dongia2, LocalDate ngaysanxuat2,
            LocalDate ngayhethan2) {
    }
    public void HangThucPham(String maHang, String tenHang, double donGia, LocalDate ngaySanXuat, LocalDate ngayHetHan) {
		if (maHang != null && !maHang.equals("")) {
			this.mahang = maHang;
		} else {
			throw new IllegalArgumentException("ma hang khong duoc de trong");
		}

		if (tenHang != null && !tenHang.equals("")) {
			this.tenhang = tenHang;
		}

		if (donGia >= 0) {
			this.dongia = donGia;
		}

		if (ngaySanXuat.isBefore(LocalDate.now())) {
			this.ngaysanxuat = ngaySanXuat;
		}

		this.ngayhethan = ngayHetHan;
	}

    public String mahang="xxx", tenhang="xxx";
    public Double dongia;
    public LocalDate ngaysanxuat =LocalDate.now(),ngayhethan;
    public String getMahang() {
        return mahang;
    }
    // public void setMahang(String mahang) {
    //     this.mahang = mahang;
    // }
    public String getTenhang() {
        return tenhang;
    }
    public void setTenHang(String tenHang) {
		if (tenHang != null && !tenHang.equals("")) {
			this.tenhang = tenHang;
		} else {
			this.tenhang = "xxx";
		}
	}
    public Double getDongia() {
        return dongia;
    }
    public void setDonGia(Double donGia) {
		if (donGia > 0) {
			this.dongia = donGia;
		} else {
			this.dongia = 0.0 ;
		}
	}
    public LocalDate getNgaysanxuat() {
        return ngaysanxuat;
    }
    public void setNgaySanXuat(LocalDate ngaySanXuat) {
		if (ngaySanXuat.isBefore(LocalDate.now())) {
			this.ngaysanxuat = ngaySanXuat;
		} else {
			this.ngaysanxuat = LocalDate.now();
		}
	}
    public LocalDate getNgayhethan() {
        return ngayhethan;
    }
    public void setNgayhethan(LocalDate ngayhethan) {
        this.ngayhethan = ngayhethan;
    }
    public void setMahang(String mahang) throws Exception{
        if (!mahang.trim().equals(""))
            this.mahang = mahang;
        else
            throw new Exception("loi: ma hang rong", null);
    }
    public boolean hethan(){
        return ngayhethan.isBefore(LocalDate.now()) ? true:false;
    }
    
}
