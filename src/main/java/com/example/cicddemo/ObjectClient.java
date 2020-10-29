package com.example.cicddemo;

public class ObjectClient {

    public boolean put(String filePath) {
        System.out.println(filePath);
        return true;
    }

    public boolean get(String objectKey) {
        System.out.println(objectKey);
        return true;
    }
}
