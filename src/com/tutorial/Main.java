package com.tutorial;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        // membuka file
        FileInputStream fileInput = new FileInputStream("input.txt");

        // membaca file
        int data = fileInput.read();
        while(data != -1){
            System.out.print((char) data);
            data = fileInput.read();
        }

        // menutup file
        fileInput.close();

    }
}
