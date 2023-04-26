package baitapthuchanh;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        vehicle vehicle = new vehicle();
        quanly danhsach = new quanly();
        int a;
        do {
            System.out.println("-----MENU-----");
            System.out.println("1.Nhap thong tin cac loai xe");
            System.out.println("2.Xuat bang ke khai tien thue truoc ba");
            System.out.println("3.Thoat");
            a = input.nextInt();
            if (a < 1 || a > 3) {
                System.out.println("nhap lai!!!");
            } else {
                switch (a) {
                    case 1: {
                        System.out.println("Nhap vao loai xe muon them vao.");
                        System.out.println("1.xe1");
                        System.out.println("2.xe2");
                        System.out.println("3.xe3");

                        int b = input.nextInt();
                        switch (b) {
                            case 1: {
                                vehicle xe1 = new vehicle();
                                System.out.println("Hay nhap vao ten chu xe");
                                input.nextLine();
                                xe1.setTenchuxe(input.nextLine());
                                System.out.println("Hay nhap vao loai xe");
                                xe1.setLoaixe(input.nextLine());
                                System.out.println("Hay nhap vao dung tich");
                                xe1.setDungtich(input.nextInt());
                                System.out.println("Hay nhap vao tri gia xe");
                                xe1.setTrigia(input.nextFloat());
                                xe1.tinhthue();
                                danhsach.add(xe1);
                                break;
                            }
                            case 2: {
                                vehicle xe2 = new vehicle();
                                System.out.println("Hay nhap vao ten chu xe");
                                input.nextLine();
                                String tenchuxe = input.nextLine();
                                System.out.println("Hay nhap vao loai xe");
                                String loaixe = input.nextLine();
                                System.out.println("Hay nhap vao dung tich");
                                int dungtich = input.nextInt();
                                System.out.println("Hay nhap vao tri gia xe");
                                float trigia = input.nextFloat();

                                xe2 = new vehicle(tenchuxe, loaixe, dungtich, trigia);
                                xe2.tinhthue();
                                danhsach.add(xe2);
                                break;
                            }
                            case 3: {
                                vehicle xe3 = new vehicle();
                                System.out.println("Hay nhap vao ten chu xe");
                                input.nextLine();
                                xe3.setTenchuxe(input.nextLine());
                                System.out.println("Hay nhap vao loai xe");
                                xe3.setLoaixe(input.nextLine());
                                System.out.println("Hay nhap vao dung tich");
                                xe3.setDungtich(input.nextInt());
                                System.out.println("Hay nhap vao tri gia xe");
                                xe3.setTrigia(input.nextFloat());
                                xe3.tinhthue();
                                danhsach.add(xe3);
                                break;
                            }
                        }
                        break;
                    }
                    case 2: {
                        // vehicle.chude();
                        danhsach.xuatthongtin();

                        break;
                    }
                }
            }

        } while (a != 3);
    }
}
