package baitapthuchanh;

public class vehicle {
    public vehicle() {
    }

    private String tenchuxe, loaixe;
    private int dungtich;
    private float trigia, thuephainop;
    public vehicle(String tenchuxe, String loaixe, int dungtich, float trigia) {
        this.tenchuxe = tenchuxe;
        this.loaixe = loaixe;
        this.dungtich = dungtich;
        this.trigia = trigia;
    }
    public String getTenchuxe() {
        return tenchuxe;
    }
    public void setTenchuxe(String tenchuxe) {
        this.tenchuxe = tenchuxe;
    }
    public String getLoaixe() {
        return loaixe;
    }
    public void setLoaixe(String loaixe) {
        this.loaixe = loaixe;
    }
    public int getDungtich() {
        return dungtich;
    }
    public void setDungtich(int dungtich) {
        this.dungtich = dungtich;
    }
    public float getTrigia() {
        return trigia;
    }
    public void setTrigia(float trigia) {
        this.trigia = trigia;
    }
    
    public void tinhthue(){
        if(this.getDungtich()<100 && this.getDungtich()>0){
            this.thuephainop = this.getTrigia()*0.01f ;
        }else if(this.getDungtich()>=100 && this.getDungtich()<=200){
            this.thuephainop = this.getTrigia()*0.03f ;
        }else if(this.getDungtich()>200){
            this.thuephainop = this.getTrigia()*0.05f ;
        }
    }
    public float getThuephainop() {
        return thuephainop;
    }
    
}
