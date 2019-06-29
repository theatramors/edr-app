package com.amors.edrapp;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(value = SpringRunner.class)
@SpringBootTest(classes = EdrApplication.class)
public class EdrApplicationTest {

    @Test
    public void contextLoadSuccess() {
        Assert.assertTrue(true);
    }
}
