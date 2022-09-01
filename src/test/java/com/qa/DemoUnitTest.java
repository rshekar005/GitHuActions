package com.qa;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoUnitTest {

    @Test
    public void test1(){
        int actual =1;
        Assert.assertEquals(actual,1);
    }
}
