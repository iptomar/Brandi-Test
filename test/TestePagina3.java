/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pedro
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
 * @author joaon
 */
public class TestePagina3 {
    
    public TestePagina3() {
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
    // Testes à Página 2 da ficha técnica
       @Test
    public void testepag3() {
      WebDriver driver  = new ChromeDriver();
      driver.get("http://localhost:8080/?#/form");     
      WebElement descrio = driver.findElement(By.xpath("//*[@id=\"descrio\"]"));
      descrio.sendKeys("Ambiente normal");  
      WebElement temperatura = driver.findElement(By.xpath("//*[@id=\"temperatura\"]"));
      temperatura.sendKeys("30ºC");             
      WebElement humidade = driver.findElement(By.xpath("//*[@id=\"humidade-relativa\"]"));
      humidade.sendKeys("30%");    
      WebElement periodoAno = driver.findElement(By.xpath("//*[@id=\"perodo-do-ano\"]"));
      periodoAno.sendKeys("1/5"); 
      WebElement radiacaoLuz = driver.findElement(By.xpath("//*[@id=\"tipo\"]"));
      radiacaoLuz.sendKeys("Luz natural"); 
      WebElement valorLuz = driver.findElement(By.xpath("//*[@id=\"valor-de-iluminncia-lux\"]"));
      valorLuz.sendKeys("80");
      WebElement valorUv = driver.findElement(By.xpath("//*[@id=\"valor-de-uv-medidos\"]"));
      valorUv.sendKeys("5");
      WebElement valorReal = driver.findElement(By.xpath("//*[@id=\"valor-real-de-uv\"]"));
      valorReal.sendKeys("2");           
      WebElement formula = driver.findElement(By.xpath("//*[@id=\"uv03medida-uv-x-1000050-lux--60uwlmen\"]"));
      formula.sendKeys("12");     
      WebElement agentes = driver.findElement(By.xpath("//*[@id=\"agentes-poluidores\"]"));
      agentes.sendKeys("pó");     
      WebElement fontes = driver.findElement(By.xpath("//*[@id=\"fontes--origem\"]"));
      fontes.sendKeys("fontes");     
      WebElement resultados = driver.findElement(By.xpath("//*[@id=\"resultados\"]"));
      resultados.sendKeys("A peça ficou restaurada");    
      WebElement conclusoes = driver.findElement(By.xpath("/html/body/div[1]/main/div[1]/div[7]/div[2]/fieldset/div/div[1]/textarea"));
      conclusoes.sendKeys("conclusões");    
           
      //driver.quit();  
      
    }
}

