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
public class TesteEditarAnalise {
    
    public TesteEditarAnalise() {
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
      public void testeeditaranalise() {
          
          WebDriver driver  = new ChromeDriver();
      driver.get("http://localhost:8080/#/Login");
          
       WebElement user = driver.findElement(By.name("uname"));
      user.sendKeys("test");
      
      WebElement pass = driver.findElement(By.name("psw"));
      pass.sendKeys("test");
      
      WebElement bt = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div[1]/div[1]/div/button"));
      bt.click();
      
      driver.get("http://localhost:8080/#/EditarAnalise");
      
      WebElement Ediatardescrio = driver.findElement(By.id("descrio"));
      Ediatardescrio.sendKeys("Registo de uma analise");  
      
      WebElement localAnlise = driver.findElement(By.id("local-de-realizao"));
      localAnlise.sendKeys("Lisboa");
      
      WebElement dataRealizaoAnlise = driver.findElement(By.id("data-de-realizao"));
      dataRealizaoAnlise.sendKeys("25062018");
      
      
      WebElement horaInicioAnalise = driver.findElement(By.id("hora-de-incio"));
      horaInicioAnalise.sendKeys("1625");  
      
      WebElement horaFimAnlise = driver.findElement(By.id("hora-de-fim"));
      horaFimAnlise.sendKeys("2038");
      
      WebElement distnciaDeslocao = driver.findElement(By.id("distncia-da-deslocao-km"));
      distnciaDeslocao.sendKeys("7.8");
      
      WebElement outrasDespesas = driver.findElement(By.id("outras-despesas"));
      outrasDespesas.sendKeys("Casa");
      
      WebElement ConjuntoObjetos = driver.findElement(By.id("objeto-ou-conjunto-de-objetos"));
      ConjuntoObjetos.sendKeys("2");
          
      
      driver.quit();  
}
}
