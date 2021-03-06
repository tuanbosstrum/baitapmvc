
package employeelogic;

import java.util.Date;

public class person {

    private String hoten;
    private int gioitinh;
    private Date ngaysinh;

    public person() {
    }

    public person(String hoten, int gioitinh, Date ngaysinh) {
        this.hoten = hoten;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(int gioitinh) {
        this.gioitinh = gioitinh;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    @Override
    public String toString() {
        return "person{" + "hoten=" + hoten + ", gioitinh=" + gioitinh + ", ngaysinh=" + ngaysinh + '}';
    }
    
    
    
}
