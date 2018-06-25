
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafael
 */
public class TesteAdicionarObjecto {
    
    public TesteAdicionarObjecto() {
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
    public void TesteAdicionarObjecto(){
      LoginAux aux = new LoginAux();
      aux.login("http://localhost:8080/#/adicionarobjeto");
      
      WebElement designaObjeto = aux.driver.findElement(By.xpath("//*[@id=\"designao-do-objeto\"]"));
      designaObjeto.sendKeys("Cadeira de madeira do século XIX");
      
      WebElement tipologia = aux.driver.findElement(By.xpath("//*[@id=\"tipologia\"]"));
      tipologia.sendKeys("Cadeira");  
      
      WebElement localizao = aux.driver.findElement(By.xpath("//*[@id=\"localizao\"]"));
      localizao.sendKeys("Torres Novas");          

      WebElement bt = aux.driver.findElement(By.xpath("/html/body/div[1]/main/div[1]/button"));
      bt.click();   
      
      aux.driver.quit();
    }  
}
