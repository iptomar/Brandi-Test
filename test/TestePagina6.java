/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pedro
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
 * @author joaon
 */
public class TestePagina6 {
    
    public TestePagina6() {
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
    public void testepag6() {
      WebDriver driver  = new ChromeDriver();
      driver.get("http://localhost:8080/?#/form");     
      WebElement estrutura = driver.findElement(By.xpath("//*[@id=\"estrutura\"]"));
      estrutura.sendKeys("estrutura abababbaabababab");  
      WebElement superficie = driver.findElement(By.xpath("//*[@id=\"superfcie\"]"));
      superficie.sendKeys("superficie sfdgfhgjhkjl");             
      WebElement elementos = driver.findElement(By.xpath("//*[@id=\"elementos-acessrios\"]"));
      elementos.sendKeys("elementos dgghj"); 
      //não é possivel escrever nestes devido a já haver o mesmo id noutro campo de outra página
      WebElement observacoes = driver.findElement(By.xpath("//*[@id=\"observaes--concluses\"]"));
      observacoes.sendKeys("observacoes dfghjkhhgfhghjgdfhgjh"); 
      //não é possivel escrever nestes devido a já haver o mesmo id noutro campo de outra página
      WebElement checklist0 = driver.findElement(By.xpath("//*[@id=\"preservao\"]"));
      checklist0.click();   
       WebElement checklist1 = driver.findElement(By.xpath("//*[@id=\"conservao\"]"));
      checklist1.click();
       WebElement checklist2 = driver.findElement(By.xpath("//*[@id=\"restauro\"]"));
      checklist2.click();
      WebElement aspectosEspecificos = driver.findElement(By.xpath("//*[@id=\"aspectos-especficos\"]"));
     aspectosEspecificos.sendKeys("elementos dgghj"); 
           
        
      
    }
}