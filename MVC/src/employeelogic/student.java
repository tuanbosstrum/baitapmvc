
package employeelogic;

import java.util.Date;

public class student extends person implements textinf {
    private String truonghoc;
    private String hocluc;
    private String hocbong;

    public student() {
    }

    public student(String truonghoc, String hoten, int gioitinh, Date ngaysinh) {
        super(hoten, gioitinh, ngaysinh);
        this.truonghoc = truonghoc;
    }

    public student(String truonghoc, String hocluc, String hoten, int gioitinh, Date ngaysinh) {
        super(hoten, gioitinh, ngaysinh);
        this.truonghoc = truonghoc;
        this.hocluc = hocluc;
    }

    public String getHocluc() {
        return hocluc;
    }

    public void setHocluc(String hocluc) {
        this.hocluc = hocluc;
    }

    public String getHocbong() {
        return hocbong;
    }

    public void setHocbong(String hocbong) {
        this.hocbong = hocbong;
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

    @Override
    public String toString() {
        String ketqua = super.toString();
        ketqua += "student{" + "truonghoc=" + truonghoc + ", hocluc=" + hocluc + ", hocbong=" + hocbong + '}';
        return ketqua;
    }
    
    
    
    
}
