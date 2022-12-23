package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

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
        int wordcount = 0;

        while (newstr.hasNextLine()) {
            String[] array = newstr.nextLine().split(" ");
            wordcount = wordcount + array.length;
        }

        System.out.println(wordcount);

        HashMap<String, Integer> popular = new HashMap<>();
        String ve = str;
        String array2[] = ve.split(" ");

        for (String n : array2) {
            if (popular.containsKey(n)) {
                popular.put(n, popular.get(n) + 1);
            }
            else{
                popular.put(n, 1);
            }
        }

        Set<String> keys = popular.keySet();

        for (String key : keys) {
            System.out.println(key);
            System.out.println(popular.get(key));
        }

    }


}

