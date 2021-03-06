
package employeelogic;

import java.util.Date;

public class worker extends person implements textinf {
    private String congty;

    public worker() {
    }

    public worker(String congty, String hoten, int gioitinh, Date ngaysinh) {
        super(hoten, gioitinh, ngaysinh);
        this.congty = congty;
    }

    public String getCongty() {
        return congty;
    }

    public void setCongty(String congty) {
        this.congty = congty;
    }

    @Override
    public double caclTax(double income) {
        return (0.04*income);
    }
    
    
    
    
}
