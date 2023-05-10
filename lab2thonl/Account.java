package lab2thonl;
import java.util.Locale;
import java.text.NumberFormat;

public class Account {
    public Account() {
    }
    public Account(int sotk, String tentk) {
        this.sotk = sotk;
        this.tentk = tentk;
        this.sotien=50;
    }
    Locale locale = new Locale("vi", "VN");
    NumberFormat formatter = NumberFormat.getCurrencyInstance(locale);
    String currency = formatter.format(this.sotien);

    private double sotien=50,hangsolaixuat=0.035;
    private int sotk=999999;
    private String tentk="chua xac dinh", trangthai;
    public Account(double sotien, int sotk, String tentk) {
        this.sotien = sotien;
        this.sotk = sotk;
        this.tentk = tentk;
    }
    public double getSotien() {
        return sotien;
    }
    public void setSotien(double sotien) {
        if(sotien<=50){
            this.sotien=50;
        }else{
            this.sotien = sotien;
        }
    }
    public int getSotk() {
        return sotk;
    }
    public void setSotk(int sotk) {
        if(sotk>0||sotk!=999999){
            this.sotk = sotk;
        }else{
            this.sotk=999999;
        }
    }
    public String getTentk() {
        return tentk;
    }
    public void setTentk(String tentk) {
        if(tentk==null){
            this.tentk="chua xac dinh";
        }else{
            this.tentk = tentk;
        }
    }
    public String getTrangthai() {
        if(this.tentk=="chua xac dinh"||this.sotk==999999||this.sotien==50){

            return trangthai="khong hop le";
        }else{
            return trangthai="OK";
        }
    }
    public void naptienvaotaikhoan(double tiennapvao){
        this.sotien+=tiennapvao;
        System.out.println("Nap thanh cong");
    }
    public void ruttien(double tienrut){
        if((this.sotien-=tienrut)<0){
            System.out.println("tai khoan khong du");
        }else{
            this.sotien-=tienrut;
            System.out.println("rut thanh cong");
        }
    }
    
    public void daohang(){
        this.sotien=this.sotien+(this.sotien*this.hangsolaixuat);
    }
    @Override
    public String toString() {
        return String.format("%-20s%-20s%-20s%-20s","ten tai khoan","so tai khoan","so tien","trang thai")+"\n"+
        String.format("%-20s%-20d%-20f%-20s",this.getTentk(),this.getSotk(),this.getSotien(),this.getTrangthai());
        
    }
}
