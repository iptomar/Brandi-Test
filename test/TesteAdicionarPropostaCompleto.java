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
      LoginAux aux = new LoginAux();
      aux.login("http://localhost:8080/#/AdicionarProposta");
      
      Select aceitacaoProposta = new Select (aux.driver.findElement(By.xpath("//*[@id=\"aceitaorejeio-proposta\"]")));
      aceitacaoProposta.selectByValue("Recusada");
      
      WebElement justificacao = aux.driver.findElement(By.xpath("//*[@id=\"justificao-se-recusada\"]"));
      justificacao.sendKeys("Orçamento elevado");
      
      WebElement desc = aux.driver.findElement(By.xpath("//*[@id=\"descrio-da-proposta\"]"));
      desc.sendKeys("Orçamento elevado, considerando o restauro que é estipulado");
      
      WebElement dataElaboracao = aux.driver.findElement(By.xpath("//*[@id=\"data-de-elaborao-da-proposta\"]"));
      dataElaboracao.sendKeys("07062018");
      
      WebElement dataEnvio = aux.driver.findElement(By.xpath("//*[@id=\"data-de-envio-da-proposta\"]"));
      dataEnvio.sendKeys("08062018");
      
      WebElement idPedido = aux.driver.findElement(By.xpath("//*[@id=\"id-do-pedido\"]"));
      idPedido.sendKeys("8");
      
      WebElement idCoordenador = aux.driver.findElement(By.xpath("//*[@id=\"id-do-coordenador\"]"));
      idCoordenador.sendKeys("10");
      
      WebElement bt = aux.driver.findElement(By.xpath("/html/body/div[1]/main/div[1]/button"));
      bt.click();   
      
      aux.driver.quit();
     }
}
