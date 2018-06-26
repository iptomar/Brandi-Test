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

/**
 *
 * @author Utilizador
 */
public class testeEditarCliente {
    
    public testeEditarCliente() {
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
    public void TesteEditarCliente(){
      WebDriver driver  = new ChromeDriver();
      driver.get("http://localhost:8080/#/EditarCliente");

      WebElement entrar = driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/nav/ul/a"));
      entrar.click(); 
      //*[@id="app"]/main/div[1]/div[1]/div/input[1]
      WebElement utilizador = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div[1]/div[1]/div/input[1]"));
      utilizador.sendKeys("test"); 
      WebElement pass = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div[1]/div[1]/div/input[2]"));
      pass.sendKeys("test"); 
      WebElement log = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div[1]/div[1]/div/button"));
      log.click();
      
      driver.get("http://localhost:8080/#/EditarCliente");
      WebElement nome = driver.findElement(By.id("nome"));
      nome.sendKeys("João ALves"); 
      WebElement nif = driver.findElement(By.id("nif"));
      nif.sendKeys("123456789"); 
      WebElement morada = driver.findElement(By.id("morada"));
      morada.sendKeys("Rua da taberna"); 
      WebElement mail = driver.findElement(By.id("e-mail"));
      mail.sendKeys("joao@ipt.pt"); 
      WebElement contacto = driver.findElement(By.id("contato"));
      contacto.sendKeys("911111111"); 
      //*[@id="app"]/main/div[1]/button
      WebElement guardar = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div[1]/button"));
      guardar.click();
     
}}
