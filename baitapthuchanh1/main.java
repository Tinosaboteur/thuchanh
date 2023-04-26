package baitapthuchanh1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.format.DateTimeParseException;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        quanly danhsach = new quanly();
        int a;
        do {
            System.out.println("-----MENU-----");
            System.out.println("1.Nhap thong tin cac don hang");
            System.out.println("2.Xuat bang ke don hang");
            System.out.println("3.Thoat");
            a = input.nextInt();
            if (a < 1 || a > 3) {
                System.out.println("nhap lai!!!");
            } else {
                switch (a) {
                    case 1: {

                        hangthucpham hangthucpham = new hangthucpham();
                        System.out.println("Hay nhap vao ma san pham");
                        input.nextLine();
                        String mahang = input.nextLine();
                        System.out.println("Hay nhap vao ten hang");
                        String tenhang = input.nextLine();
                        System.out.println("Hay nhap vao don gia");
                        Double dongia = input.nextDouble();
                        System.out.println("Hay nhap vao ngay san xuat");
                        boolean validNgaySanXuat = false;
                        LocalDate ngaysanxuat = null;
                        while (!validNgaySanXuat) {
                            System.out.print("Nhap ngay san xuat (dd/mm/yyyy): ");
                            String ngaySanXuatStr = input.next();
                            try {
                                ngaysanxuat = LocalDate.parse(ngaySanXuatStr,
                                        DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                                validNgaySanXuat = true;
                            } catch (DateTimeParseException e) {
                                System.out.println("Ngay san xuat khong dung dinh dang, vui long nhap lai!");
                            }
                        }

                        boolean validNgayHetHan = false;
                        LocalDate ngayhethan = null;
                        while (!validNgayHetHan) {
                            System.out.print("Nhap ngay het han (dd/mm/yyyy): ");
                            String ngayHetHanStr = input.next();
                            try {
                                ngayhethan = LocalDate.parse(ngayHetHanStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                                if (ngayhethan.isBefore(ngayhethan)) {
                                    System.out.println("Ngay het han phai sau ngay san xuat, vui long nhap lai!");
                                } else {
                                    validNgayHetHan = true;
                                }
                            } catch (DateTimeParseException e) {
                                System.out.println("Ngay het han khong dung dinh dang, vui long nhap lai!");
                            }
                        }
                        hangthucpham = new hangthucpham(mahang, tenhang, dongia, ngaysanxuat, ngayhethan);
                        danhsach.add(hangthucpham);
                        break;

                    }

                    case 2: {
                        danhsach.xuatthongtin();

                        break;
                    }
                }
            }

        } while (a != 3);
    }
}
