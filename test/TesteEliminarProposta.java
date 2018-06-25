
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
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
public class TesteEliminarProposta {
    
    public TesteEliminarProposta() {
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
    public void TesteEliminarProposta(){
      LoginAux aux = new LoginAux();
      aux.login("http://localhost:8080/#/eliminarproposta");
      
      WebElement h1 = aux.driver.findElement(By.xpath("/html/body/div[1]/main/div[1]/h1"));
      assertEquals(h1.getText(),"Quer Mesmo Apagar a Proposta?");
      
      WebElement bt = aux.driver.findElement(By.xpath("/html/body/div[1]/main/div[1]/button[1]"));
      bt.click();   
      
      aux.driver.quit();
    }  
}
