package dao;

public class MenuController {
    private StudentController st_contrl;
    private MenuView mnview;

    public MenuController() {
    }

    public MenuController(StudentController st_contrl) {
        this.st_contrl = st_contrl;
    }

    public MenuController(StudentController st_contrl, MenuView mnview) {
        this.st_contrl = st_contrl;
        this.mnview = mnview;
    }
    
    
    
    public void lua_chon_menu(){
        boolean flag = true;
        while (flag){
            int kq = mnview.hien_thi_menu();
            switch(kq){
                case 1: 
                    st_contrl.nhap_danh_sach_sinh_vien();
                    break;
                case 2:
                    st_contrl.tim_kiem_sv_theo_sdt();
                    break;
                case 3: 
                    flag = false;
                    break;
            }
        }
        
    }
    
    
}