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
 * @author Rafael
 */
public class TesteAdicionarPropostaCompleto {
    
    public TesteAdicionarPropostaCompleto() {
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
     @Test
     public void TesteAdicionarPropostaSimples() {
      WebDriver driver  = new ChromeDriver();
      driver.get("http://localhost:8080/#/AdicionarProposta");
      WebElement x = driver.findElement(By.xpath("/html/body/div[1]/div[3]/h1"));
      assertEquals(x.getText(),"Adicionar Proposta");
      driver.quit();
     }
}
