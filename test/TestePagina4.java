import java.util.concurrent.TimeUnit;
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



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafael
 */
public class TestePagina4 {
    
    public TestePagina4() {
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
     public void TestePagina4() {
      WebDriver driver  = new ChromeDriver();
      driver.get("http://localhost:8080/#/form#pg4");
      
      WebElement objectivoGera1 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div[1]/div[8]/div/div[2]/div[1]/fieldset/div/div/div/div/div[1]/label"));
      objectivoGera1.click();  
      
      /* Erro, "data - element not visible"
      WebElement dataClk = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div[1]/div[8]/div/div[2]/div[2]/div[1]/div[2]/div/table/tbody/tr[1]/td[1]/div")); 
      dataClk.click();    
      WebElement data = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div[1]/div[8]/div/div[2]/div[2]/div[1]/div[2]/div/table/tbody/tr[1]/td[1]/div/span")); 
      data.sendKeys("21/06/2018");
      */
      
      WebElement InterpretResul = driver.findElement(By.xpath("//*[@id=\"interpretao-dos-resultados\"]")); 
      InterpretResul.sendKeys("Resultados esperados");
      
      WebElement ObservConcl = driver.findElement(By.xpath("//*[@id=\"observaes--concluses\"]")); 
      ObservConcl.sendKeys("Correu tudo na normalidade");
      
      driver.quit();
    }
}