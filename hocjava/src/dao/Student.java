package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MyPC
 */
public class Student {
    private int idstudent;
    private String fullname;
    private String sdt;
    private String email;
    
    //Xây dựng các hàm khởi tạo

    public Student() {
    }

    public Student(String fullname, String sdt, String email) {
        this.fullname = fullname;
        this.sdt = sdt;
        this.email = email;
    }

    public Student(int idstudent, String fullname, String sdt, String email) {
        this.idstudent = idstudent;
        this.fullname = fullname;
        this.sdt = sdt;
        this.email = email;
    }
    
    //Xây dựng hàm kết nối đến cơ sở dữ liệu
    public Connection lay_ket_noi_csdl(){
        Connection conn = null;
        try {
            //Code của bạn ở đây
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3307/lthdt",
                    "root", "123456");
            return conn;
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
    
    //Xây dựng hàm thêm 1 student vào database
    public void save_student_to_db(){
        try {
            //Code của bạn ở đây
            //Buoc 1: Lay ket noi toi csdl
            Connection ketnoicsdl = lay_ket_noi_csdl();
            
            // the mysql insert statement
            String query = " insert into student (fullname, sdt, email)"
                    + " values (?, ?, ?)";
            
            // create the mysql insert preparedstatement
            PreparedStatement preparedStmt = ketnoicsdl.prepareStatement(query);
            preparedStmt.setString(1, this.fullname);
            preparedStmt.setString(2, this.sdt);
            preparedStmt.setString(3, this.email);
            
            // execute the preparedstatement
            preparedStmt.execute();
            
            ketnoicsdl.close();
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    //Hàm lấy ra danh sách các sinh viên trong bang student
    public ArrayList<Student> lay_danh_sach_sinh_vien(){
        ArrayList<Student> result = new ArrayList<>();
        try {
            //code của bạn ở đây
            //Buoc 1: Tao ket noi toi csdl
            Connection ketnoicsdl = lay_ket_noi_csdl();
            Statement stmt=ketnoicsdl.createStatement();
            ResultSet rs=stmt.executeQuery("select * from student");
            while(rs.next()){
                Student sv = new Student(rs.getInt("idstudent"), 
                                        rs.getString("fullname"), 
                                        rs.getString("sdt"), 
                                        rs.getString("email"));
                result.add(sv);
            }
            ketnoicsdl.close();
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
    
    //Hàm cập nhật sinh viên hiện tại vào csdl
    public void update_current_student(){
        try {
            //code của bạn ở đây
            //Buoc 1: Tao ket noi toi csdl
            Connection ketnoicsdl = lay_ket_noi_csdl();
            // create the java mysql update preparedstatement
            String query = "update student set fullname = ?,"
                    + " sdt = ?,"
                    + "email = ? where idstudent = ?";
            PreparedStatement preparedStmt = ketnoicsdl.prepareStatement(query);
            preparedStmt.setString(1, this.fullname);
            preparedStmt.setString(2, this.sdt);
            preparedStmt.setString(3, this.email);
            preparedStmt.setInt(4, this.idstudent);
            
            // execute the java preparedstatement
            preparedStmt.executeUpdate();
            
            ketnoicsdl.close();
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Hàm xóa sinh viên hiện tại ra khỏi csdl
    public void delete_current_student(){
        //code của bạn ở đây
        try {
            //code của bạn ở đây
            //Buoc 1: Tao ket noi toi csdl
            Connection ketnoicsdl = lay_ket_noi_csdl();
            // create the java mysql update preparedstatement
            String query = "delete from student where idstudent = ?";
            PreparedStatement preparedStmt = ketnoicsdl.prepareStatement(query);
            preparedStmt.setInt(1, this.idstudent);
            
            // execute the java preparedstatement
            preparedStmt.executeUpdate();
            
            ketnoicsdl.close();
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Các getter và setter 

    public int getIdstudent() {
        return idstudent;
    }

    public void setIdstudent(int idstudent) {
        this.idstudent = idstudent;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" + "idstudent=" + idstudent + ", fullname=" + fullname + ", sdt=" + sdt + ", email=" + email + '}';
    }
    
    
}