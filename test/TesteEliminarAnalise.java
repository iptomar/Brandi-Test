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
 * @author joaon
 */
public class TesteEliminarAnalise {
    
    public TesteEliminarAnalise() {
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
        // Teste feito à eliminação de análises
    @Test
    public void TesteEliminarAnalise(){
      
      WebDriver driver  = new ChromeDriver();
      driver.get("http://localhost:8080/#/EliminarAnalise");     

      WebElement entrar = driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/nav/ul/a"));
      entrar.click();
      
      WebElement utilizador = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div[1]/div[1]/div/input[1]"));
      utilizador.sendKeys("test");
      
      WebElement chave = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div[1]/div[1]/div/input[2]"));
      chave.sendKeys("test");
      
      WebElement iniciarSessao = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div[1]/div[1]/div/button"));
      iniciarSessao.click();     
      
      driver.get("http://localhost:8080/#/EliminarAnalise");         
      
      WebElement eliminarAnalise = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div[1]/table/tr[2]/td/button[1]"));
      eliminarAnalise.click();
      
      driver.quit();
}
}