/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mangmotchieu.donglenh;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author HUY TUAN
 */
public class Test {
    public static void main(String[] args) {
//        // TODO code application logic here
//        int[] a;
//        //Khoi tao
//        a = new int[4];
//        a[0] = 12;
//        a[1] = 9;
//        a[2] = 1;
//        a[3] = 15;
//        //Xuat du lieu
////        System.out.println(a.toString());
//        System.out.println(Arrays.toString(a));

//        int[] b = new int[]{1, 3, -7, 8, 9, 20};
//        System.out.println(Arrays.toString(b));
//        System.out.println("So luong phan tu cua mang la " + b.length);

        Scanner sc = new Scanner(System.in);
        System.out.println("So luong phan tu cua mang n = ");
        String input = sc.nextLine();
        int n = Integer.parseInt(input);
        int[] c = new int[n];
        for(int i = 0; i < n; i++){
            System.out.println("c[" + i + "] = ");
            input = sc.nextLine();
            c[i] = Integer.parseInt(input);
        }
        System.out.println("Gia tri cua mang vua nhap la ");
        System.out.println(Arrays.toString(c));
    }
}
