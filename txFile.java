/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan_4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author ADMIN
 */
public class txFile {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        //EAD TXT FILE
        String fileName = "C://input.txt";
        String line = null;
        FileReader fileReader 
                = new FileReader(fileName);
        BufferedReader bufferedReader
                = new BufferedReader(fileReader);
        int hitungBaris = 0 ;
        while ((line = bufferedReader.readLine()) !=null){
            System.out.println(line);
            System.out.println(hitungBaris);
            if (hitungBaris==0){
            //maka apa
            }
            hitungBaris++;
    }   
        bufferedReader.close();
               
    }
}
