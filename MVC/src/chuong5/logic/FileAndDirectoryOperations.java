/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong5.logic;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author HUY TUAN
 */
public class FileAndDirectoryOperations {

    public FileAndDirectoryOperations() {
    }

    // thao tac 1: liet ke all thu muc va tap tin trong thu muc hien tai:
    public File[] getDirectoryContent(String folder) {
        File directory = new File(folder);
        if (directory.isFile()) {
            return null;
        }
        File[] results = directory.listFiles();
        return results;

    }

    // thao tac 2: xuat ket qua:
    public String displayContent(File[] content) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < content.length; i++) {
            sb.append(content[i].getPath()).append(File.separator).append(content[i].getName());
            sb.append("\n");
        }
        return sb.toString();
    }
    //thao tac 3: loc ra cac thu muc:

    public File[] getSubDirectories(File[] content) {
        ArrayList<File> result = new ArrayList<>();
        for (int i = 0; i < content.length; i++) {
            if (content[i].isDirectory()) {
                result.add(content[i]);
            }
        }
        File[] ketqua = new File[result.size()];
        return result.toArray(ketqua);
    }
    //Thao tac 4: Loc ra cac tap tin

    public File[] getFiles(File[] content) {
        ArrayList<File> result = new ArrayList<>();
        for (int i = 0; i < content.length; i++) {
            if (content[i].isFile()) {
                result.add(content[i]);
            }
        }
        File[] ketqua = new File[result.size()];
        return result.toArray(ketqua);
    }

    //Thao tac 5: Duyet de quy xuat tac ca cac tap tin va thu muc
    public void getContentRecursively(String folder) {
        File content = new File(folder);
        //Dieu kien dung
        if (content.isFile()) {
            System.out.println(content.getPath() + File.separator + content.getName());
            return;
        }
        //Cau hoi de quy trong stack
        System.out.println("Thu muc: " + folder);
        File[] sub = content.listFiles();
        for (int i = 0; i < sub.length; i++) {
            getContentRecursively(folder + File.separator + sub[i].getName());
        }
    }
}
