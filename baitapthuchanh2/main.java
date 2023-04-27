package baitapthuchanh2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<hocphan> dsLopHocPhan = new ArrayList<>();


        // Hiển thị menu
        while (true) {
            System.out.println("Chon chu nang:");
            System.out.println("1. Nhap thong tin");
            System.out.println("2. Xuat thông tin tin");
            System.out.println("0. Thoát");

            // Nhập lựa chọn
            int choice = sc.nextInt();

           
            switch (choice) {
            case 1:          
                System.out.println("Nhap thong tin lop hoc phan:");
                System.out.print("Tong so sinh vien: ");
                int tongSoSV = sc.nextInt();
                sc.nextLine();
                System.out.print("Ma LHP: ");
                String maLHP = sc.nextLine();
                System.out.print("Ten LHP: ");
                String tenLHP = sc.nextLine();
                System.out.print("Ten giang vien: ");
                String tenGV = sc.nextLine();
                System.out.print("Thong tin buoi hoc: ");
                String thongTinLopHoc = sc.nextLine();            
                // Nhập danh sách sinh viên
             // Nhập danh sách sinh viên
                sinhvien[] dsSV = new sinhvien[tongSoSV];
                for (int i = 0; i < tongSoSV; i++) {
                    System.out.println("Nhap tong tin sinh vien thu " + (i+1) + ":");
                    System.out.print("Ma sinh vien: ");
                    String maSV = sc.nextLine();
                    System.out.print("Ho ten sinh vien: ");
                    String hoTenSV = sc.nextLine();
                    dsSV[i] = new sinhvien(maSV, hoTenSV);
                }

                // Tạo đối tượng lớp học phần và thêm vào danh sách lớp học phần
                hocphan lopHocPhan = new hocphan();
                lopHocPhan.setDsSinhVien(dsSV);
                lopHocPhan.setMaLHP(maLHP);
                lopHocPhan.setTenLHP(tenLHP);
                lopHocPhan.setTenGV(tenGV);
                lopHocPhan.setThongTinLopHoc(thongTinLopHoc);
                dsLopHocPhan.add(lopHocPhan);

                System.out.println("Da them thong tin lop hoc phan vao danh sach.");

                break;

            case 2:
                	System.out.println("Danh sach lop hoc phan:");
                	for (hocphan lhp : dsLopHocPhan) {
                	    System.out.print(lhp);
                	    System.out.println();
                	}
                    break;
                case 0:
                    System.out.println("Thoát");
                    return;
                default:
                    System.out.println("ko hợp lệ");
                    break;
            }
        }
    }
}