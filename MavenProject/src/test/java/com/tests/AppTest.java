package com.tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



/**
 * Unit test for simple App.
 */
public class AppTest 
{
   @Test
    public void testWebdriver()
    {
       WebDriver driver = new FirefoxDriver();
       driver.get("http://www.google.com");
    }

   
}
