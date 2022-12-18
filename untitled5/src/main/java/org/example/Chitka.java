package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;

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
        int count = 0; //обнулили кол-во слов

        if(str.length() != 0){
            count++;
            for (int i = 0; i < str.length(); i++){ //проверка символа на пробел
                if (str.charAt(i) == ' '){
                    count++;
                }
            }

        }
        System.out.println(count);
    }

}

