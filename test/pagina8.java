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
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Utilizador
 */
public class pagina8 {
    
    public pagina8() {
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
    public void Testepagina8(){
      WebDriver driver  = new ChromeDriver();
      driver.get("http://localhost:8080/#/form#pg1");

      WebElement entrar = driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/nav/ul/a"));
      entrar.click(); 
      //*[@id="app"]/main/div[1]/div[1]/div/input[1]
      WebElement utilizador = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div[1]/div[1]/div/input[1]"));
      utilizador.sendKeys("test"); 
      WebElement pass = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div[1]/div[1]/div/input[2]"));
      pass.sendKeys("test"); 
      WebElement log = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div[1]/div[1]/div/button"));
      log.click();
      
      driver.get("http://localhost:8080/#/form#pg1");
      WebElement estrutura = driver.findElement(By.xpath("//*[@id=\"estrutura\"]"));
      estrutura.sendKeys("ppppppppppppppppppppp ppppppppppppppppppp ppppppppp"); 
      WebElement Recursos = driver.findElement(By.xpath("//*[@id=\"recursos-necessrios-para-a-estrutura\"]"));
      Recursos.sendKeys("pp ppppppppp pppp"); 
      WebElement superficie = driver.findElement(By.id("superfcie"));
      superficie.sendKeys("plano"); 
      WebElement recsuper = driver.findElement(By.xpath("//*[@id=\"recursos-necessrios-para-a-superfcie\"]"));
      recsuper.sendKeys("pppp ppppp pp p p p p p p pp ppppp"); 
      WebElement acessorios = driver.findElement(By.id("elementos-acessrios"));
      acessorios.sendKeys("rererererere"); 
      
      WebElement necessarios = driver.findElement(By.xpath("//*[@id=\"recursos-necessrios-para-os-elementos-acessrios\"]"));
      necessarios.sendKeys("rererererere");
      WebElement conclusao = driver.findElement(By.xpath("//*[@id=\"conclusao\"]"));
      conclusao.sendKeys("rererererere");
    }
}
