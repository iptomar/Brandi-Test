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
 * @author joaon
 */
public class TesteAdicionarPedido {
    
    public TesteAdicionarPedido() {
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
    // Teste feito à adição de pedidos
    @Test
    public void TesteAdicionarPedido(){
      
      WebDriver driver  = new ChromeDriver();
      driver.get("http://localhost:8080/#/AdicionarPedido");     

      WebElement entrar = driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/nav/ul/a"));
      entrar.click();
      
      WebElement utilizador = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div[1]/div[1]/div/input[1]"));
      utilizador.sendKeys("test");
      
      WebElement chave = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div[1]/div[1]/div/input[2]"));
      chave.sendKeys("test");
      
      WebElement iniciarSessao = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div[1]/div[1]/div/button"));
      iniciarSessao.click();     
      
      driver.get("http://localhost:8080/#/AdicionarPedido");
           
      WebElement tituloPedido = driver.findElement(By.xpath("//*[@id=\"titulo-do-pedido\"]"));
      tituloPedido.sendKeys("Restauro da Mesa do Século X");     
      
      WebElement descricaoPedido = driver.findElement(By.xpath("//*[@id=\"descrio-do-pedido\"]"));
      descricaoPedido.sendKeys("Neste resaturo pretende-se dar uma pintura à mesa e um ajuste nos pés da mesa");
      
      WebElement guardarPedido = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div[1]/button"));
      guardarPedido.click();
      
      driver.quit();
}
}
