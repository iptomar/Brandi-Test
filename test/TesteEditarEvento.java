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
 * @author Utilizador
 */
public class TesteEditarEvento {
    
    public TesteEditarEvento() {
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
    public void TesteEditarEvento(){
      WebDriver driver  = new ChromeDriver();
      driver.get("http://localhost:8080/#/EditarEvento");

      WebElement entrar = driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/nav/ul/a"));
      entrar.click(); 
      //*[@id="app"]/main/div[1]/div[1]/div/input[1]
      WebElement utilizador = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div[1]/div[1]/div/input[1]"));
      utilizador.sendKeys("test"); 
      WebElement pass = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div[1]/div[1]/div/input[2]"));
      pass.sendKeys("test"); 
      WebElement log = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div[1]/div[1]/div/button"));
      log.click();
      
      driver.get("http://localhost:8080/#/EditarEvento");
      WebElement descricao = driver.findElement(By.id("descrio"));
      descricao.sendKeys("ttttt yyyyy uuuuu iiii oooo pppp"); 
      WebElement data = driver.findElement(By.id("data"));
      data.sendKeys("12122010"); 
      WebElement tipo = driver.findElement(By.id("tipo"));
      tipo.sendKeys("festa"); 
      WebElement guardar = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div[1]/button"));
      guardar.click();
      

}}
