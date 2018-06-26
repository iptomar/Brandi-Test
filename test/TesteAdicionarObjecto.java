
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
      
      WebElement lcrm = aux.driver.findElement(By.xpath("//*[@id=\"processo-lcrm\"]"));
      lcrm.sendKeys("123123"); 
      
      WebElement cearc = aux.driver.findElement(By.xpath("//*[@id=\"processo-cearc\"]"));
      cearc.sendKeys("213412"); 
      
      WebElement coordenador = aux.driver.findElement(By.xpath("//*[@id=\"coordenao\"]"));
      coordenador.sendKeys("Ricardo Lopes"); 
      
      WebElement dataAbertProce = aux.driver.findElement(By.xpath("//*[@id=\"data-de-abertura-do-processo\"]"));
      dataAbertProce.sendKeys("23062018"); 
      
      WebElement dataEntrLcrm = aux.driver.findElement(By.xpath("//*[@id=\"data-de-entrada-lcrm\"]"));
      dataEntrLcrm.sendKeys("29062018"); 
      
      WebElement dataEntrCearc = aux.driver.findElement(By.xpath("//*[@id=\"data-de-entrada-cearc\"]"));
      dataEntrCearc.sendKeys("30072018"); 
      
      WebElement idSubCateg = aux.driver.findElement(By.xpath("//*[@id=\"id-da-sub-categoria\"]"));
      idSubCateg.sendKeys("7"); 
      
      WebElement tipologia = aux.driver.findElement(By.xpath("//*[@id=\"tipologia\"]"));
      tipologia.sendKeys("Cadeira");  
      
      WebElement localizao = aux.driver.findElement(By.xpath("//*[@id=\"localizao\"]"));
      localizao.sendKeys("Torres Novas");     
      
      WebElement dimensao = aux.driver.findElement(By.xpath("//*[@id=\"dimenso\"]"));
      dimensao.sendKeys("1.5x2x4");  
      
      WebElement idDono = aux.driver.findElement(By.xpath("//*[@id=\"id-do-dono-da-obra\"]"));
      idDono.sendKeys("4");  
      
      WebElement idProprietario = aux.driver.findElement(By.xpath("//*[@id=\"id-do-proprietrio\"]"));
      idProprietario.sendKeys("3");
      
      WebElement idMecenas = aux.driver.findElement(By.xpath("//*[@id=\"id-do-mecenas\"]"));
      idMecenas.sendKeys("5"); 
      
      WebElement idProduto = aux.driver.findElement(By.xpath("//*[@id=\"id-do-pedido\"]"));
      idProduto.sendKeys("1"); 
      
      aux.driver.quit();
    }  
}
