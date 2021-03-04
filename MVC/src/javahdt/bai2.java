/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javahdt;

/**
 *
 * @author HUY TUAN
 */
public class bai2 {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("**Phep toan so nguyen**");
        int a = 10, b = 5, c;
        c = a + b;
        System.out.println("Phep cong: " + a + " + " + b + " = " + c);
        c = b - a;
        System.out.println("Phep tru: " + a + " - " + b + " = " + c);
        c = b * a;
        System.out.println("Phep nhan: " + a + " * " + b + " = " + c);
        c = b / a;
        System.out.println("Phep chia: " + a + " / " + b + " = " + c);
        c = b % a;
        System.out.println("Phep chia lay du: " + a + " % " + b + " = " + c);
        
        System.out.println("**Phep toan so thuc**");
        double x = 10.56, y = 5.8, z;
        z = x + y;
        System.out.println("Phep cong: " + x + " + " + y + " = " + z);
        z = x - y;
        System.out.println("Phep tru: " + x + " - " + y + " = " + z);
        z = x * y;
        System.out.println("Phep nhan: " + x + " * " + y + " = " + z);
        z = x / y;
        System.out.println("Phep chia: " + x + " / " + y + " = " + z);
        
        System.out.println("**Phep toan logic**");
        boolean flag1 = true, flag2 = false, flag3 = true;
        System.out.println("Phep AND: " + (flag1 && flag2));
        System.out.println("Phep OR: " + (flag1 || flag2));
        System.out.println("Phep NOT: " + (!flag1));
        System.out.println("Phep XOR: " + (flag1 ^ flag3));
        
        System.out.println("**Phep toan chuoi**");
        String s1 = "PXU University";
        String s2 = " University";
        
        System.out.println(s1.toLowerCase());
        System.out.println(s2.toUpperCase());
        System.out.println(s1.contains(s2));
    }
}
