package lab2thonl;

import java.util.Scanner;

public class Accounttest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Accountlist Accountlist = new Accountlist();
        Account a[] = null;
        int c;
        int n = 0, d, s;
        do {
            System.out.println("MEMU");
            System.out.println("Chon cac chuc nang tuong ung.");
            System.out.println("1:Them vao 1 tai khoan.");
            System.out.println("2:So tai khoan hien co.");
            System.out.println("3.In thong tin tat ca tai khoan hien co.");
            System.out.println("4:Tim kiem theo so tai khoan.");
            System.out.println("5:Xoa thong tin tai khoan");
            System.out.println("6:Nap tien vao tai khoan.");
            System.out.println("7:Rut tien.");
            System.out.println("8:Chuyen tien.");
            System.out.println("9:Ket thuc.");
            System.out.println("Chon:");
            c = input.nextInt();
            switch (c) {
                case 1: {
                    System.out.println("Nhap so vao so luong khach hang");
                    n = input.nextInt();
                    a = new Account[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("Khach hang thu: " + (i + 1));
                        a[i] = new Account();
                        System.out.println("nhap vao ten tai khoan");
                        input.nextLine();
                        a[i].setTentk(input.nextLine());
                        System.out.println("nhap vao so tai khoan");
                        a[i].setSotk(input.nextInt());
                        System.out.println("nhap vao so tien");
                        a[i].setSotien(input.nextDouble());
                        Accountlist.themacc(a[i]);
                    }
                    break;
                }
                case 2: {
                    System.out.println(Accountlist.getAccountCount());
                    break;
                }
                case 3: {
                    Accountlist.xuatthongtin();
                    break;
                }
                case 4: {
                    System.out.println("Nhap vao tai khoan can tim:");
                    Accountlist.timtk(input.nextInt());
                    break;
                }
                case 5: {
                    System.out.println("Nhap vao so tai khoan muon xoa:");
                    Accountlist.xoatk(input.nextInt());
                    break;
                }
                case 6: {
                    System.out.println("Chon tai khoan muon nap:");
                    s = input.nextInt();
                    for (int i = 0; i < n; i++) {
                        d = a[i].getSotk();
                        if (s == d) {
                            System.out.println("Nap vao tai khoan:" + d+" so tien");
                            a[i].naptienvaotaikhoan(input.nextDouble());
                        } else {
                            System.out.println("");
                        }
                    }
                    break;
                }
                case 7: {
                    System.out.println("Chon tai khoan muon rut: ");
                    s = input.nextInt();
                    for (int i = 0; i < n; i++) {
                        d = a[i].getSotk();
                        if (s == d) {
                            System.out.println("Ban chon tai khoan: " + d);
                            System.out.println("Nhap so tien muon rut:");
                            a[i].ruttien(input.nextDouble());
                        }
                    }
                    break;
                }
                case 8: {
                    double chuyen,nhan,tienchuyen;
                    System.out.print("Nhap so tai khoan nguoi chuyen: ");
                    s = input.nextInt();
                    System.out.print("Nhap so tai khoan nguoi nhan: ");
                    c = input.nextInt();
                    for (int i = 0; i < n; i++) {
                        d = a[i].getSotk();
                        if (s == d) {
                            chuyen = a[i].getSotien();
                            for (int j = 0; j < n; j++) {
                                int f = a[j].getSotk();
                                if (c == f) {
                                    nhan = a[j].getSotien();
                                    System.out.println("Nhap so tien muon chuyen");
                                    tienchuyen = input.nextDouble();
                                    if (tienchuyen <= chuyen) {
                                        chuyen = chuyen - tienchuyen;
                                        nhan = nhan + tienchuyen;
                                        a[i].setSotien(chuyen);
                                        a[j].setSotien(nhan);
                                        System.out.println("Tai khoan " + d + " chuyen: $" + tienchuyen);
                                        System.out.println("Tai khoan " + f + " nhan: $" + tienchuyen);
                                    } else {
                                        System.out.println("So tien hien khong du");
                                    }
                                } else {
                                    System.out.println("");
                                }
                            }
                        } else {
                            System.out.println("");
                        }
                    }
                    break;
                }
            }
        } while (c != 9);
    }
}
