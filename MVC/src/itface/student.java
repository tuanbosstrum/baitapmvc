
package itface;

import java.util.Date;

public class student extends person implements textinf {
    private String truonghoc;

    public student() {
    }

    public student(String truonghoc, String hoten, int gioitinh, Date ngaysinh) {
        super(hoten, gioitinh, ngaysinh);
        this.truonghoc = truonghoc;
    }

    public String getTruonghoc() {
        return truonghoc;
    }

    public void setTruonghoc(String truonghoc) {
        this.truonghoc = truonghoc;
    }

    @Override
    public double caclTax(double income) {
        double tax;
        tax = 0.01*income;
        return tax;
    }
    
    
    
    
}
