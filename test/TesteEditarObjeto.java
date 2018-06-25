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
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author Utilizador
 */
public class TesteEditarObjeto {
    
    public TesteEditarObjeto() {
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
    public void TesteEditarObjeto(){
      WebDriver driver  = new ChromeDriver();
      driver.get("http://localhost:8080/#/EditarObjeto");

      WebElement entrar = driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/nav/ul/a"));
      entrar.click(); 
      //*[@id="app"]/main/div[1]/div[1]/div/input[1]
      WebElement utilizador = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div[1]/div[1]/div/input[1]"));
      utilizador.sendKeys("test"); 
      WebElement pass = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div[1]/div[1]/div/input[2]"));
      pass.sendKeys("test"); 
      WebElement log = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div[1]/div[1]/div/button"));
      log.click();
      
      driver.get("http://localhost:8080/#/EditarObjeto");
      WebElement nome = driver.findElement(By.xpath("//*[@id=\"nome\"]"));
      nome.sendKeys("ttttt yyyyy uuuuu iiii oooo pppp"); 
      //*[@id="categoria"]
      Select categoria = new Select (driver.findElement(By.xpath("//*[@id=\"categoria\"]")));
      categoria.selectByIndex(1);
      Select subcategoria = new Select (driver.findElement(By.xpath("//*[@id=\"subcategoria\"]")));
      subcategoria.selectByIndex(1);
      WebElement dimensao = driver.findElement(By.xpath("//*[@id=\"dimensao\"]"));
      dimensao.sendKeys("12122010"); 
      WebElement tipologia = driver.findElement(By.xpath("//*[@id=\"tipologia\"]"));
      tipologia.sendKeys("lpppppppp"); 

}
}
