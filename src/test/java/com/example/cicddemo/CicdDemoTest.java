package com.example.cicddemo;

import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CicdDemoTest {

    private ObjectClient objectClient = new ObjectClient();

    private String filePath = System.getProperty("cicd.filePath");
    private String objectKey = System.getProperty("cicd.objectKey");

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    public void putTest() {
        logger.debug(filePath);
        Assert.assertTrue(objectClient.put(filePath));
    }

    @Test
    public void getTest() {
        logger.debug(objectKey);
        Assert.assertTrue(objectClient.get(objectKey));
    }
}
