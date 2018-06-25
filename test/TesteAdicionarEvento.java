
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafael
 */
public class TesteAdicionarEvento {
   
    public TesteAdicionarEvento() {
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
    public void TesteAdicionarEvento(){
      LoginAux aux = new LoginAux();
      aux.login("http://localhost:8080/#/AdicionarEvento");
      
      WebElement tipoEvento = aux.driver.findElement(By.xpath("//*[@id=\"tipo-de-evento\"]"));
      tipoEvento.sendKeys("Entrega no documento X do cliente Y");
      
      WebElement descEvento = aux.driver.findElement(By.xpath("//*[@id=\"descrio-do-evento\"]"));
      descEvento.sendKeys("O Documento X tem informação acerca da peça Z");     
      
      WebElement dataEvento = aux.driver.findElement(By.xpath("//*[@id=\"data-do-evento\"]"));
      dataEvento.sendKeys("025062018");

      WebElement bt = aux.driver.findElement(By.xpath("/html/body/div[1]/main/div[1]/button"));
      bt.click();   
      
      aux.driver.quit();
    }  
}
