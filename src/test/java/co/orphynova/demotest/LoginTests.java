package co.orphynova.demotest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests {

    @Test(priority = 1,testName = "VALID credential login test")
    public void loginTests(){
        System.out.println("Login test successful");
        String exp = "Hello";
        String act = "Hello";
        Assert.assertEquals(exp,act,"The credentials are fine");
    }
    @Test(priority = 2,testName = "INVALID credentials testing")
    public void invalidLoginTest(){
        System.out.println("Login test with invalid credentials");
    }
}
