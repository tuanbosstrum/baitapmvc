
package ifelse.logiclayer;

public class ptb2 implements ptinterface {
    private double a;
    private double b;
    private double c;
    private double x1;
    private double x2;
    private String ketqua;

    public ptb2() {
    }

    public ptb2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void giaipt() {
        if(a == 0) {
            ptb1 ptb1 = new ptb1(b, c);
            ptb1.giaipt();
            ketqua = ptb1.getKetqua();
        }else{
            double delta = b*b - 4*a*c;
            if(delta < 0){
                ketqua = " PTB2 vo nghiem";
            }else{
                if(delta == 0) {
                    x1 = -b/(2*a);
                    ketqua = "PTB2 co nghiem kep la: " + x1;
                }else{
                    x1 = (-b + Math.sqrt(delta))/(2*a);
                    x1 = (-b - Math.sqrt(delta))/(2*a);
                    ketqua = "PT có 2 nghhiem phan biet: x1 = " + x1 + "; va x2 = " + x2;
                }
            }
        }
    }

    @Override
    public String toString() {
        if(ketqua == null || ketqua.isEmpty()){
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

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public String getKetqua() {
        return ketqua;
    }

    public void setKetqua(String ketqua) {
        this.ketqua = ketqua;
    }
    
}
    
