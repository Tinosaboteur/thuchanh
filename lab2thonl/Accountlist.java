package lab2thonl;

public class Accountlist {
    private Account[] acclist;
    private int count;

    public Accountlist() {
        this.acclist = new Account[10];
        this.count = 0;
    }

    public Accountlist(int n) {
        if (n > 0) {
            this.acclist = new Account[n];
        } else {
            this.acclist = new Account[10];
        }
        this.count = 0;
    }

    public void themacc(Account account) {
        if (count < acclist.length) {
            acclist[count] = account;
            count++;
            System.out.println("Them tai khoan thanh cong.");
        } else {
            System.out.println("Khong the them vi da du");
        }
    }

    public void timtk(int sotk) {
        for (int i = 0; i < count; i++) {
            if (acclist[i].getSotk() == sotk) {
                System.out.println(acclist[i].toString());
            }else{
                System.out.println("Khong ton tai tai khoan nay.");;
            }
        }
    }

    public void xoatk(int sotk) {
        for (int i = 0; i < count; i++) {
            if (acclist[i].getSotk() == sotk) {
                for (int j = i; j < count - 1; j++) {
                    acclist[j] = acclist[j + 1];
                }
                acclist[count - 1] = null;
                count--;
                System.out.println("Da xoa thanh cong");
            }
            
        }
        System.out.println("Khong tim thay tai khoan: " + sotk);
    }

    public int getAccountCount() {
        return count;
    }

    public void xuatthongtin() {
        if (count == 0) {
            System.out.println("Da rong");
        } else {
            System.out.println("Tai khoan trong he thong");
            for (int i = 0; i < count; i++) {
                System.out.println(acclist[i].toString());
            }
        }
    }
}
