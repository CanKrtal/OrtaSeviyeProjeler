public class Login {
    private String sysTcKimlikNo;
    private String sysParola;
    private int sysBakiye;

    public Login(String sysTcKimlikNo, String sysParola, int sysBakiye) {
        this.sysTcKimlikNo = sysTcKimlikNo;
        this.sysParola = sysParola;
        this.sysBakiye = sysBakiye;
    }

    public String getTcKimlikNo() {
        return sysTcKimlikNo;
    }

    public void setTcKimlikNo(String tcKimlikNo) {
        this.sysTcKimlikNo = tcKimlikNo;
    }

    public String getSysParola() {
        return sysParola;
    }

    public void setSysParola(String sysParola) {
        this.sysParola = sysParola;
    }

    public int getBakiye() {
        return sysBakiye;
    }

    public void setBakiye(int bakiye) {
        this.sysBakiye = bakiye;
    }

    public void paraYatir(int total) {
        sysBakiye = sysBakiye + total;
        System.out.println("Mevcut bakiyeniz: " + sysBakiye);
    }

    public void paraCek(int total) {
        if ((sysBakiye - total) < 0) {
            System.out.println("Bakiyeniz yetersiz: " + sysBakiye);
        } else {
            sysBakiye -= total;
            System.out.println("Yeni bakiyeniz: " + sysBakiye);
        }
    }
}