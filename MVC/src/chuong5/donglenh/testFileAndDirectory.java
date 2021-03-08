/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong5.donglenh;

import chuong5.logic.FileAndDirectoryOperations;
import java.io.File;

/**
 *
 * @author HUY TUAN
 */
public class testFileAndDirectory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FileAndDirectoryOperations fo = new FileAndDirectoryOperations();
        File[] content = fo.getDirectoryContent("E:\\baitapMVC\\baitapmvc\\MVC\\src");
//        System.out.println(fo.displayContent(content));
        File[] thumuc = fo.getSubDirectories(content);
        System.out.println("danh sach cac thu muc con la:");
        System.out.println(fo.displayContent(thumuc));
        File[] taptin = fo.getFiles(content);
        System.out.println("danh sach cac tap tin la:");
        System.out.println(fo.displayContent(taptin));
    }
    
}
