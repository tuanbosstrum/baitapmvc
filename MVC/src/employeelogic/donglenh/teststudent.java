
package employeelogic.donglenh;

import employeelogic.student;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class teststudent {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        String input = "12-12-1999";
        Date ngaysinh = df.parse(input);
        student obj = new student("PXU University", "Xuat sac", "Ng Van A", 1, ngaysinh);
        switch(obj.getHocluc()){
                case "Xuat sac":
                    obj.setHocbong("1000");
                    break;
                case "Gioi":
                    obj.setHocbong("855.5");
                    break;
                default:
                    obj.setHocbong("0");
                    break;
        }
        System.out.println(obj);
    }
    
}
