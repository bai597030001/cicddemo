package com.example.cicddemo;

import org.junit.Assert;
import org.junit.Test;

public class CicdDemoTest {

    private ObjectClient objectClient = new ObjectClient();

    private String filePath = System.getProperty("cicd.filePath");
    private String objectKey = System.getProperty("cicd.objectKey");

    @Test
    public void putTest() {
        Assert.assertTrue(objectClient.put(filePath));
    }

    @Test
    public void getTest() {
        Assert.assertTrue(objectClient.get(objectKey));
    }
}
