package com.company;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.NoSuchAlgorithmException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws NoSuchAlgorithmException, IOException {

        List<String> lines = Files.readAllLines(Paths.get("/Users/lkirkwoo/Documents/Training/MapsandSets/wordlist.txt"), Charset.defaultCharset());

        MySet mySet = new MySet();

//        for (String item : lines) {
//            mySet.add(item);
//        }

        mySet.add("lukay");

        System.out.println(mySet.contains("luankay"));

//        System.out.println(hashResult[0]);
//        for (boolean b : bitmap) {
//            System.out.println(b ? 1 : 0);
//        }
    }
}
