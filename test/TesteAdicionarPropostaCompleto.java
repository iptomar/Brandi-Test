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
import org.openqa.selenium.support.ui.Select;

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
     public void TesteAdicionarPropostaCompleto() {
      WebDriver driver  = new ChromeDriver();
      driver.get("http://localhost:8080/#/AdicionarProposta");
      Select aceitacaoProposta = new Select (driver.findElement(By.xpath("//*[@id=\"aceitao-proposta\"]")));
      aceitacaoProposta.selectByValue("Recusada");
      WebElement justificacao = driver.findElement(By.xpath("//*[@id=\"app\"]"));
      justificacao.sendKeys("Orçamento elevado");
      WebElement desc = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/fieldset/div[3]/label"));
      desc.sendKeys("Orçamento elevado, considerando o restauro que é estipulado");
      WebElement dataElaboracao = driver.findElement(By.xpath("//*[@id=\"data-de-elaborao\"]"));
      dataElaboracao.sendKeys("07062018");
      WebElement dataEnvio = driver.findElement(By.xpath("//*[@id=\"data-de-envio\"]"));
      dataEnvio.sendKeys("08062018");
      WebElement idPedido = driver.findElement(By.xpath("//*[@id=\"id-do-pedido\"]"));
      idPedido.sendKeys("8");
      WebElement idCoordenador = driver.findElement(By.xpath("//*[@id=\"id-coordenador\"]"));
      idCoordenador.sendKeys("10");
      WebElement bt = driver.findElement(By.xpath("/html/body/div[1]/div[3]/button"));
      bt.click();   
      
      driver.quit();
     }
}
