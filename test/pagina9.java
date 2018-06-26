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
 * @author Utilizador
 */
public class pagina9 {
    
    public pagina9() {
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
    public void Testepagina9(){
      WebDriver driver  = new ChromeDriver();
      driver.get("http://localhost:8080/#/form#pg1");

      WebElement entrar = driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/nav/ul/a"));
      entrar.click(); 

      
      WebElement utilizador = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div[1]/div[1]/div/input[1]"));
      utilizador.sendKeys("test"); 
      WebElement pass = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div[1]/div[1]/div/input[2]"));
      pass.sendKeys("test"); 
      WebElement log = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div[1]/div[1]/div/button"));
      log.click();
      
      driver.get("http://localhost:8080/#/form#pg1");
      
      WebElement Refarc = driver.findElement(By.xpath("//*[@id=\"relatrio-tcnico-da-interveno-do-lcrm\"]"));
      Refarc.sendKeys("ppppppppppppppppppppp ppppppppppppppppppp ppppppppp"); 
      
      WebElement tipo = driver.findElement(By.xpath("//*[@id=\"originais-fotogrficos\"]"));
      tipo.sendKeys("pp ppppppppp pppp"); 
      
      WebElement referencias = driver.findElement(By.xpath("//*[@id=\"originaisref\"]"));
      referencias.sendKeys("plano"); 
      
      WebElement autor = driver.findElement(By.xpath("//*[@id=\"originaisautor\"]"));
      autor.sendKeys("pppp ppppp pp p p p p p p pp ppppp"); 
      
      WebElement tipodoc = driver.findElement(By.xpath("//*[@id=\"documentao-grfica\"]"));
      tipodoc.sendKeys("rererererere"); 
      
      WebElement refdoc = driver.findElement(By.xpath("//*[@id=\"docref\"]"));
      refdoc.sendKeys("rererererere"); 
      
      WebElement autordoc = driver.findElement(By.xpath("//*[@id=\"docautor\"]"));
      autordoc.sendKeys("rererererere"); 
      
      WebElement tipoex = driver.findElement(By.xpath("//*[@id=\"exames-e-anlises\"]"));
      tipoex.sendKeys("rererererere"); 
      
      WebElement refex = driver.findElement(By.xpath("//*[@id=\"exameref\"]"));
      refex.sendKeys("rererererere"); 
      
      WebElement autorex = driver.findElement(By.xpath("//*[@id=\"exameautor\"]"));
      autorex.sendKeys("rererererere"); 
   
    }
}
