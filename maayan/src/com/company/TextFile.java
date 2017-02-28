package com.company;

import java.io.File;

/**
 * Created by hackeru on 2/28/2017.
 */
public class TextFile extends File implements FileImp  {
   /* public TextFile(String parent, String child) {
        super(parent, child);
    }*/

    public TextFile(String pathname) {
       super(pathname);
       if(exists()&&isFile())
           System.out.println("exists");
       else
           System.out.println("not exists");
    }

    @Override
    public void read() {

    }

    @Override
    public void write() {

    }
}
