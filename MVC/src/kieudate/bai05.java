/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kieudate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author HUY TUAN
 */
public class bai05 {

    public static void main(String[] agrs) throws ParseException {

        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss", Locale.ENGLISH);
        Date currentDate = new Date();
        String output = df.format(currentDate);
        System.out.println(output);
        
        String input = "15-05-1995";
        Date ngay = df.parse(input);
        System.out.println(ngay);
        System.out.println(df.format(ngay));
        
        
    }
}
