
package ifelse.logiclayer;

public class ptb1 implements ptinterface {
    private double a;
    private double b;
    private double nghiem_x;
    private String ketqua;

    public ptb1() {
    }

    public ptb1(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void giaipt() {
        if(a != 0) {
            nghiem_x = -b/a;
            ketqua = "PTB1 có nghiem la: " + nghiem_x;
        }else{
            if(b != 0) {
                ketqua = "PTVN";
            }else{
                ketqua = "PTVSN";
            }
        }
    }

    @Override
    public String toString() {
        if(ketqua == null || ketqua.isEmpty()) {
            giaipt();
        }
        return ketqua;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getNghiem_x() {
        return nghiem_x;
    }

    public void setNghiem_x(double nghiem_x) {
        this.nghiem_x = nghiem_x;
    }

    public String getKetqua() {
        return ketqua;
    }

    public void setKetqua(String ketqua) {
        this.ketqua = ketqua;
    }
    
    
}
