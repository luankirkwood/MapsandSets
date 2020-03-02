package com.company;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

class MyBloomFilter {

    private MessageDigest digest = MessageDigest.getInstance("MD5");

    private boolean[] bitmap = new boolean[165536];
    private byte[] hashResult;
    private Random random = new Random();
    //    int min = -32767;
//    int max = 32768;
    int min = -1000;
    int max = 1000;
    private int randomNumber = random.nextInt(max - min) + min;
    private int randomNumber2 = random.nextInt(max - min) + min;
    private int randomNumber3 = random.nextInt(max - min) + min;

    MyBloomFilter() throws NoSuchAlgorithmException {
    }

    void add(String value) {

        hashResult = digest.digest(value.getBytes());

        for (int i = 0; i < 3; i++) {

            Random newRandom = new Random();
            int randomHash = newRandom.nextInt(15);

            bitmap[hashResult[randomHash] + randomNumber] = true;
            bitmap[hashResult[randomHash] + randomNumber2] = true;
            bitmap[hashResult[randomHash] + randomNumber3] = true;

//            randomNumber = random.nextInt(max - min) + min;

//            bitmap[hashResult[3] + 32768] = true;
//            bitmap[hashResult[5] + 32768] = true;
//            bitmap[hashResult[7] + 32768] = true;
//            bitmap[hashResult[9] + 32768] = true;

        }

    }

    boolean contains(String value) {

        hashResult = digest.digest(value.getBytes());
        if (bitmap[hashResult[0] + randomNumber] && bitmap[hashResult[1] + randomNumber2] && bitmap[hashResult[2] + randomNumber3]) {
            return true;
        }
        return false;
    }
}
