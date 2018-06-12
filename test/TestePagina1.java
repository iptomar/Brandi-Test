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
 * @author joaon
 */
public class TestePagina1 {
    
    public TestePagina1() {
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
    public void testepag1() {
      WebDriver driver  = new ChromeDriver();
      driver.get("http://localhost:8080/#/form#pg1");     
      WebElement designObj = driver.findElement(By.xpath("//*[@id=\"deseginao-do-objeto\"]"));
      designObj.sendKeys("Quadro de pintura");  
      WebElement processoLearc = driver.findElement(By.xpath("//*[@id=\"processo-lcrm-n\"]"));
      processoLearc.sendKeys("210");        
      WebElement processoCearc = driver.findElement(By.xpath("//*[@id=\"processo-cearc-n\"]"));
      processoCearc.sendKeys("12062018");    
      WebElement dirTecInterv = driver.findElement(By.xpath("//*[@id=\"coordenaodireo-tcnica-da-interveno\"]"));
      dirTecInterv.sendKeys("Fernando"); 
      WebElement dataAbertProcesso = driver.findElement(By.xpath("//*[@id=\"data-de-abertura-processo\"]"));
      dataAbertProcesso.sendKeys("11062018"); 
      WebElement dataEntrLcrm = driver.findElement(By.xpath("//*[@id=\"data-de-entrada-no-lcrm\"]"));
      dataEntrLcrm.sendKeys("12062018");
      WebElement dataEntrCearc = driver.findElement(By.xpath("//*[@id=\"data-de-entrada-do-cearc\"]"));
      dataEntrCearc.sendKeys("12062018");
      Select formato = new Select(driver.findElement(By.id("formato")));
      formato.selectByIndex(1);
      WebElement superCategoria = driver.findElement(By.xpath("//*[@id=\"super-categoria\"]"));
      superCategoria.sendKeys("Bens Culturais");
      WebElement categoria = driver.findElement(By.xpath("//*[@id=\"categoria\"]"));
      categoria.sendKeys("Bens Culturais Móveis");
      WebElement subcategoria = driver.findElement(By.xpath("//*[@id=\"subcategoria\"]"));
      subcategoria.sendKeys("Retabulística / Escultura / Talha");
      WebElement localizacao = driver.findElement(By.xpath("//*[@id=\"localizao\"]"));
      localizacao.sendKeys("Tomar");
      WebElement proprietario = driver.findElement(By.xpath("//*[@id=\"proprietrio\"]"));
      proprietario.sendKeys("Particular");
      WebElement enderecoPostalProp = driver.findElement(By.xpath("//*[@id=\"endereo-postal-do-proprietrio\"]"));
      enderecoPostalProp.sendKeys("2200-121");
      WebElement enderecoEletroProp = driver.findElement(By.xpath("//*[@id=\"endereo-electronico-proprietrio\"]"));
      enderecoEletroProp.sendKeys("fernanado2@ipt.pt");
      WebElement contactoTelProp = driver.findElement(By.xpath("//*[@id=\"contactos-telefnico-proprietrios\"]"));
      contactoTelProp.sendKeys("917654321");
      WebElement dimensoes = driver.findElement(By.xpath("//*[@id=\"dimeno\"]"));
      dimensoes.sendKeys("47,7cm x 36,5cm x 90,5cm");
      WebElement outrasDims = driver.findElement(By.xpath("//*[@id=\"outras-dimenses\"]"));
      outrasDims.sendKeys("N/D");
      WebElement donoObra = driver.findElement(By.xpath("//*[@id=\"dono-da-obra\"]"));
      donoObra.sendKeys("António Martins");
      WebElement enderPostalDonoObra = driver.findElement(By.xpath("//*[@id=\"endereco-postal-do-dono-da-obra\"]"));
      enderPostalDonoObra.sendKeys("2100-599");
      WebElement contactoTelDonoObra = driver.findElement(By.xpath("//*[@id=\"contactos-telefnicos-do-dono-da-obra\"]"));
      contactoTelDonoObra.sendKeys("918725529");
      WebElement enderecoPostalDonoObra = driver.findElement(By.xpath("//*[@id=\"endereco-postal-do-dono-da-obra\"]"));
      enderecoPostalDonoObra.sendKeys("2100-599");
      WebElement mecenas = driver.findElement(By.xpath("//*[@id=\"mecenas\"]"));
      mecenas.sendKeys("António Martins");
      WebElement enderecoPostalMecenas = driver.findElement(By.xpath("//*[@id=\"endereo-postal-mecenas\"]"));
      enderecoPostalMecenas.sendKeys("2100-599");
      WebElement contactoTelMecenas = driver.findElement(By.xpath("//*[@id=\"contactos-telefnicos-mecenas\"]"));
      contactoTelMecenas.sendKeys("931125521");
      
      driver.quit();        
    
    }
}
