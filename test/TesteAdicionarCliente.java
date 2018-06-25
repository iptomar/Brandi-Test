
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
public class TesteAdicionarCliente {
    
    public TesteAdicionarCliente() {
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
    public void TesteAdicionarCliente(){
        
      LoginAux aux = new LoginAux();
      aux.login("http://localhost:8080/#/AdicionarCliente");
      
      WebElement nomeCompleto = aux.driver.findElement(By.xpath("//*[@id=\"nome-completo\"]"));
      nomeCompleto.sendKeys("Nuno Santos");
      
      WebElement nif = aux.driver.findElement(By.xpath("//*[@id=\"nif\"]"));
      nif.sendKeys("111222333");  
      
      WebElement morada = aux.driver.findElement(By.xpath("//*[@id=\"morada\"]"));
      morada.sendKeys("Rua Principal, nº8, Cem Soldos"); 
      
      WebElement telefone = aux.driver.findElement(By.xpath("//*[@id=\"contacto-telefnico\"]"));
      telefone.sendKeys("911222333");  
      
      WebElement email = aux.driver.findElement(By.xpath("//*[@id=\"e-mail\"]"));
      email.sendKeys("cliente@gmail.com");  

      WebElement bt = aux.driver.findElement(By.xpath("/html/body/div[1]/main/div[1]/button"));
      bt.click();   
      
      aux.driver.quit();
    }  
}
