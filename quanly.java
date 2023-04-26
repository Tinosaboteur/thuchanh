package baitapthuchanh;

import java.util.ArrayList;

public class quanly {
    public quanly() {
        this.listxe = new ArrayList<vehicle>();

    }

    public quanly(ArrayList<vehicle> listxe) {
        this.listxe = listxe;
    }

    public ArrayList<vehicle> listxe;

    //*danhsachxecontay
    public void add(vehicle xe) {
        this.listxe.add(xe);
    }

    // xuat thong tin
    public void xuatthongtin() {
        System.out.println(String.format("%-20s%-20s%-10s%-20s%-15s","ten chu xe","loai xe","dung tich","tri gia","thue truoc ba"));
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
        for (vehicle xe : listxe){
            System.out.println(String.format("%-20s%-20s%-10s%-20s%-15s",xe.getTenchuxe(),xe.getLoaixe(),xe.getDungtich(),xe.getTrigia(),xe.getThuephainop()));
        }
    }

}
