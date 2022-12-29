package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.Scanner;

public class Chitka {
    public static void main(String[] args) {
        Path path = Paths.get("test.txt");
        String str = null;
        try {
            byte[] en = Files.readAllBytes(path);
            str = new String(en);
        } catch (IOException e){
            e.printStackTrace();
           }
        Scanner newstr = new Scanner(str);
        int wordcount = 0; //обнулили кол-во слов
        
        //while (str.hasNextLine()){
            String[] array = newstr.nextLine().split(" "); // добавление каждого слова в массив
            wordcount = wordcount + array.length;
        }
        //System.out.println(wordcount);
    }

}

