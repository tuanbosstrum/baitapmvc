/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itface;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author ASUS
 */
public class controller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        String input = "11-3-2001";
        Date ngaysinh = df.parse(input);
        person person = new person("Nguyễn Văn A", 1, ngaysinh);
        
        System.out.println("Ho ten: " + person.getHoten() + "; Gioi tinh: " + person.getGioitinh() + "; Ngay sinh: " + df.format(person.getNgaysinh()));
        
        student sinhvien = new student();
        sinhvien.setHoten("Nguyen Van B");
        sinhvien.setGioitinh(1);
        sinhvien.setNgaysinh(df.parse("12-12-2002"));
        sinhvien.setTruonghoc("PXU");
        
        System.out.println(sinhvien.getHoten() + "; Gioi tinh: " + sinhvien.getGioitinh() + "; Ngaysinh: " + df.format(sinhvien.getNgaysinh()) + "; " + sinhvien.getTruonghoc());
        
        System.out.println(sinhvien.caclTax(1200));
        
        worker congnhan = new worker();
        congnhan.setHoten("Nguyen Thi C");
        congnhan.setGioitinh(0);
        congnhan.setNgaysinh(df.parse("27-7-2003"));
        congnhan.setCongty("PXU U");
        System.out.println(congnhan.getHoten() + "; Gioi tinh: " + congnhan.getGioitinh() + "; Ngay sinh: " + df.format(congnhan.getNgaysinh()) + "; Cong ti:" + congnhan.getCongty());
        
        System.out.println(congnhan.caclTax(2000));
    }
    
}
