package com.tutorial;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        long waktuStart, waktuFinish;

        // membuka file
        FileInputStream fileInput = new FileInputStream("input.txt");

        // membaca file
        waktuStart = System.nanoTime();
        int data = fileInput.read();
        while(data != -1){
            System.out.print((char) data);
            data = fileInput.read();
        }

        waktuFinish = System.nanoTime();
        // menampilkan lama waktu
        System.out.println("\n\nwaktu : " + (waktuFinish - waktuStart));

        // menutup file
        fileInput.close();

    }
}
