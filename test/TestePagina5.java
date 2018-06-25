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
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author José
 */
public class TestePagina5 {
    
    public TestePagina5() {
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

    @Test
    public void testepag5() {
      WebDriver driver  = new ChromeDriver();
      driver.get("http://localhost:8080/#/form#pg1");  
      
      WebElement DFQMMestrutura = driver.findElement(By.id("deteriorao-fsica-qumica-e-mecnica-dos-materiais"));
      DFQMMestrutura.sendKeys("TESTE");  
      
      WebElement DFQMMsuperficie = driver.findElement(By.id("superficiefisica"));
      DFQMMsuperficie.sendKeys("TESTE");
      
      WebElement DFQMMelementos = driver.findElement(By.id("elementosfisica"));
      DFQMMelementos.sendKeys("TESTE");
      
      
      WebElement DBMestrutura = driver.findElement(By.id("deteriorao-biolgica-dos-materiais"));
      DBMestrutura.sendKeys("TESTE");  
      
      WebElement DBMsuperficie = driver.findElement(By.id("superficiebiologica"));
      DBMsuperficie.sendKeys("TESTE");
      
      WebElement DBMelementos = driver.findElement(By.id("elementosbiologica"));
      DBMelementos.sendKeys("TESTE");
      
      WebElement P5Conclusoes = driver.findElement(By.xpath("//*[@id=\"observaes--concluses\"]"));
      P5Conclusoes.sendKeys("TESTE");
      
      
           
      driver.quit();  
      
    }
}
