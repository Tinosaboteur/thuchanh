package baitapthuchanh1;
import java.util.ArrayList;

public class quanly {
    private ArrayList<hangthucpham> listthucpham;

    public quanly() {
        this.listthucpham = new ArrayList<hangthucpham>();

    }

    public quanly(ArrayList<hangthucpham> listthucpham) {
        this.listthucpham = listthucpham;
    }


    //*danhsachxecontay
    public void add(hangthucpham htp) {
        this.listthucpham.add(htp);
    }
    public void xuatthongtin() {
        System.out.println(String.format("%-20s%-20s%-10s%-20s%-15s%n","ma hang","ten hang","don gia","ngay san xuat","ngay het han","ghi chu"));
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
        // for (hangthucpham htp : listthucpham){
        //     System.out.println(String.format("%-20s%-20s%-10s%-20s%-15s%n",htp.getMahang(),htp.getTenhang(),htp.getDongia(),htp.getNgaysanxuat(),htp.getNgayhethan()));
        // }
        for (hangthucpham htp : listthucpham) {
            System.out.println(htp);
        }
    }
}
