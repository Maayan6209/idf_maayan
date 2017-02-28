package com.company;

import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * Created by hackeru on 2/28/2017.
 */
public class Menu {
    /*private boolean validPath(String path){
        final char []  arrTemp={'*','/',':','?','"','>','<','|'};
        boolean isBackSlash=false;
        for (int i = 0; i <path.length() ; i++) {
            if(path.charAt(i)==92) {
                if (isBackSlash)
                    return false;
                isBackSlash=true;
            }
            else
                isBackSlash=false;

            for (int j = 0; j <arrTemp.length ; j++) {
                if(path.charAt(i)==arrTemp[j])
                    return false;
            }
        }
        return true;
    }*/
    public static void menu(){

        System.out.println("enter 1 for decryption\nenter 2 for encryption");
        Scanner scanner = new Scanner(System.in);
        String choice= scanner.next();
        switch (choice) {
            case "1":
                getPath();
                Decryption decryption=new Decryption();
                decryption.operation();
                break;
            case "2":
                getPath();
                Encryption encryption=new Encryption();
                encryption.operation();
                break;
            default:
                System.out.println("error input");
                menu();
                break;
        }
    }
    //get path and check if exist and path is correct
    private static void getPath() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the absolute path(File / Directory)");
        String filePath = scanner.next();
        File file = new File(filePath);
        if(file==null)
            getPath();

    }
}
