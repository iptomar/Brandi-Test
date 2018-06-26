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
 * @author José
 */
public class TesteAdicionarAnalise {
    
    public TesteAdicionarAnalise() {
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
      public void testeadicionaranalise() {
      WebDriver driver  = new ChromeDriver();
      driver.get("http://localhost:8080/#/adicionaranalise");  
      
      WebElement descAnalise = driver.findElement(By.id("descrio-da-anlise"));
      descAnalise.sendKeys("Analise teste");  
      
      WebElement dataRealizaoAnlise = driver.findElement(By.id("data-de-realizao-da-anlise"));
      dataRealizaoAnlise.sendKeys("25062018");
      
      WebElement localAnlise = driver.findElement(By.id("local-da-anlise"));
      localAnlise.sendKeys("Tomar");
      
      
      WebElement horaInicioAnalise = driver.findElement(By.id("hora-de-incio-da-anlise"));
      horaInicioAnalise.sendKeys("1400");  
      
      WebElement horaFimAnlise = driver.findElement(By.id("hora-de-fim-da-anlise"));
      horaFimAnlise.sendKeys("1730");
      
      WebElement distnciaDeslocao = driver.findElement(By.id("distncia-da-deslocao"));
      distnciaDeslocao.sendKeys("2.4");
      
      WebElement outrasDespesas = driver.findElement(By.id("outras-despesas"));
      outrasDespesas.sendKeys("Casa");
      
      
           
      driver.quit();  
}
      
}
