/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuake;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author HUY TUAN
 */
public class bai06 {
    public static void main(String [] agrs) throws ParseException{
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        String input = "11-03-2001";
        Date ngaysinh = df.parse(input);
        Person person = new Person("Nguyen Van A", 1 , ngaysinh);
        
        System.out.println( "Ho ten:" + person.getHoten() + "; gioi tinh:" + person.getGioitinh() +
        "; ngay sinh:" +df.format(person.getNgaysinh()));
        
        Student sinhvien = new Student();
        sinhvien.setHoten("Nguyen Van B");
        sinhvien.setGioitinh(1);
        sinhvien.setNgaysinh(df.parse("12-02-2002"));
        sinhvien.setTruonghoc("Dai hoc Hue");
        System.out.println(
         "Ho ten:" + sinhvien.getHoten() +
         "; gioi tinh:" + sinhvien.getGioitinh() +
         "; ngay sinh:" +df.format(sinhvien.getNgaysinh())+
         "; truong hoc:" + sinhvien.getTruonghoc());
    }
}
