package com.filesIO;

import java.io.File;
import java.io.IOException;
public class DemonstratingFileOperations {
    public void createFile() throws IOException {
        File f = new File("C:\\Users\\gopal\\Rohith.csv");
        f.createNewFile();
        System.out.println(f.exists());
    }
    public void createDirectory() throws IOException {
        File f = new File("C:\\Users\\gopal\\Rohith.csv");
        f.mkdir();
        System.out.println(f.exists());
    }
    public void createFiles() throws IOException {
        for (int startNo = 12; startNo < 51; startNo++) {
            File f = new File("C:\\Users\\gopal\\Rohith" +
                    startNo + ".csv");
            f.createNewFile();
        }
    }
    public void checkFiles() {
        File f = new File("C:\\Users\\gopal\\Rohith");
        String[] listFiles = f.list();
        for (String str : listFiles) {
            System.out.println(str);
        }
    }


    public static void main(String[] args) throws IOException {
        DemonstratingFileOperations file = new DemonstratingFileOperations();
        file.createFile();
        file.createFiles();
        file.checkFiles();
        file.createDirectory();
    }
}

