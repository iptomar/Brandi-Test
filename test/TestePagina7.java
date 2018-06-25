
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafael
 */
public class TestePagina7 {
   
    public TestePagina7() {
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
    public void TestePagina7(){
      WebDriver driver  = new ChromeDriver();
      driver.get("http://localhost:8080/#/form#pg7");
      
      // Erro, existem elementos com o mesmo id
      WebElement tipoDeIntervencao = driver.findElement(By.xpath("/html/body/div[1]/main/div[1]/div[11]/div[1]/div/div[2]/div/fieldset/div/div/div/label[1]"));
      assertEquals(tipoDeIntervencao.getText(),"Preservação");
      tipoDeIntervencao.click();   

      // Erro, escreve na seção Estrutura da página 6
      WebElement estrutura = driver.findElement(By.id("estrutura"));
      estrutura.sendKeys("Banco da cadeira");

      // Erro, escreve na seção Superfície da página 6
      WebElement superficie = driver.findElement(By.xpath("//*[@id=\"superfcie\"]"));
      superficie.sendKeys("Madeira");
      
      // Erro, escreve seção Elementos Acessórios da página 2
      WebElement elementosAss = driver.findElement(By.xpath("//*[@id=\"elementos-acessrios\"]"));
      elementosAss.sendKeys("Pregos");
      
      WebElement recursosTecnicos = driver.findElement(By.xpath("//*[@id=\"recursos-2\"]"));
      recursosTecnicos.sendKeys("Conhecimento de limpezas de superfícies de madeira");
      
      WebElement recursosTecnologicos = driver.findElement(By.xpath("//*[@id=\"recursos-3\"]"));
      recursosTecnologicos.sendKeys("Ligação à Internet");
      
      WebElement recursosMater = driver.findElement(By.xpath("//*[@id=\"recursos-1\"]"));
      recursosMater.sendKeys("Álcool");
      
      WebElement observacoes = driver.findElement(By.xpath("//*[@id=\"observaes-conclusoes\"]"));
      observacoes.sendKeys("Depois da limpeza, a madeira ficou com um tom mais claro");
      
      WebElement dataInfoProposta = driver.findElement(By.xpath("//*[@id=\"data-da-informao-da-proposta\"]"));
      dataInfoProposta.sendKeys("22062018");
      
      WebElement dataAceitProposta = driver.findElement(By.xpath("//*[@id=\"data-da-aceitao-da-proposta\"]"));
      dataAceitProposta.sendKeys("24062018");
      
      WebElement interlocutores = driver.findElement(By.xpath("//*[@id=\"interlocutores-do-processo\"]"));
      interlocutores.sendKeys("João Pereira");  
      
      //driver.quit();
    }  
}
