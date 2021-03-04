/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javahdt;

import java.util.Scanner;

/**
 *
 * @author HUY TUAN
 */
public class bai1xuatnhap {
    public static void main(String[] args) {
        // TODO code application logic here
        boolean flag = true;
        int a = 15;
        byte b = 2;
        double c = 12.6;
        float d = 4.5f;
        String s = "Hello world";
        char ch = 'A';
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        String hoten = sc.nextLine();
        System.out.println("Ban da nhap ho ten la: " + hoten);
        
        System.out.print("Hay nhap mot so nguyen: ");
        String input = sc.nextLine();
        a = Integer.parseInt(input);
        System.out.println("So nguyen ma ban da nhap la: " + a);
        
        System.out.print("Hay nhap mot so thuc: ");
        input = sc.nextLine();
        c = Double.parseDouble(input);
        System.out.println("So thuc ma ban da nhap la: " + c);
    }
}
