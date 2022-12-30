package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Set;

public class Chitka {
    public static void main(String[] args) {
        //..............Читаем текст...............
        Path path = Paths.get("test.txt");
        String str = null;
        try {
            byte[] en = Files.readAllBytes(path);
            str = new String(en);
        } catch (IOException e){
            e.printStackTrace();
        }
        //..........Подсчет слов...........
        Scanner newstr = new Scanner(str);
        int wordcount = 0; //обнулили кол-во слов
        
        while (newstr.hasNextLine()){ //
            String[] array = newstr.nextLine().split(" "); // добавление каждого слова в массив
            wordcount = wordcount + array.length;
        }
        System.out.println(wordcount);

        //.........Поиск повторений слов.........
        HashMap<String, Integer> map = new HashMap<>();
        String array2[] = str.split(" ");
        for (String s : array2){
            if (map.containsKey(s)){
                map.put(s, map.get(s) + 1);
            }
            else{
                map.put(s,1);
            }

        }
        //.......Вывод данных.......
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " " + "-" + " " + map.get(key));
        }
    }

}

