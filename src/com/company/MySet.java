package com.company;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

public class MySet {

    private List<String> contents = new ArrayList<>();
    private MyBloomFilter bloomFilter = new MyBloomFilter();

    public MySet() throws NoSuchAlgorithmException {
    }

    public void add(String value){
        contents.add(value);
        bloomFilter.add(value);
    }

    public boolean contains(String value) {
        return bloomFilter.contains(value);
    }
}
