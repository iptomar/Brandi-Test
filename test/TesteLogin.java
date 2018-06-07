/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Rafael
 */
public class TesteLogin {
    
    public TesteLogin() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void login() {
      WebDriver driver  = new ChromeDriver();
      driver.get("http://localhost:8080/#/Login");
      WebElement user = driver.findElement(By.name("uname"));
      user.sendKeys("test");
      WebElement pass = driver.findElement(By.name("psw"));
      pass.sendKeys("test");
      WebElement bt = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/button"));
      bt.click();
      WebElement x = driver.findElement(By.xpath("/html/body/div[1]/div[2]/button"));
      assertEquals(x.getText(),"Logout");
      driver.quit();
     }
}
