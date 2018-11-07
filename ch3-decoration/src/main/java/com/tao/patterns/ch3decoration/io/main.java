package com.tao.patterns.ch3decoration.io;

import java.io.*;

public class main {

    public static void main(String[] args) {
        int c;
        InputStream inputStream = null;
        try {
            inputStream = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("D:test.txt")));
            while ((c = inputStream.read()) >= 0 ){
                System.out.print((char)c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (inputStream != null){
                    inputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
