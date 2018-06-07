
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author José
 */
public class TesteEditarProposta {
    public TesteEditarProposta() {
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
     public void editarProposta() {
          WebDriver driver  = new ChromeDriver();
      driver.get("http://localhost:8080/#/EditarProposta");
      
      Select aceitaoProposta = new Select(driver.findElement(By.id("aceitao-proposta")));
      aceitaoProposta.selectByIndex(1);
      
      WebElement descrio = driver.findElement(By.id("descrio"));
      descrio.sendKeys("This is just a Test");
      
      WebElement dataElaborao = driver.findElement(By.id("data-de-elaborao"));
      dataElaborao.sendKeys("07062018");
      
      WebElement dataEnvio = driver.findElement(By.id("data-de-envio"));
      dataEnvio.sendKeys("07062018");
      
      WebElement idPedido = driver.findElement(By.id("id-do-pedido"));
      idPedido.sendKeys("1");
      
      WebElement idCoordenador = driver.findElement(By.id("id-coordenador"));
      idCoordenador.sendKeys("1");
      
      WebElement btnGuardar = driver.findElement(By.xpath("/html/body/div[1]/div[3]/button"));
      btnGuardar.click();
      
     
      driver.quit();
    }
     
    
}
