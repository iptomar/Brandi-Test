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
public class TesteEliminarCliente {
    
    public TesteEliminarCliente() {
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
    // Teste feito à eliminação de clientes
    @Test
    public void TesteEliminarCliente(){
      
      WebDriver driver  = new ChromeDriver();
      driver.get("http://localhost:8080/#/EliminarCliente");     

      WebElement entrar = driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/nav/ul/a"));
      entrar.click();
      
      WebElement utilizador = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div[1]/div[1]/div/input[1]"));
      utilizador.sendKeys("test");
      
      WebElement chave = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div[1]/div[1]/div/input[2]"));
      chave.sendKeys("test");
      
      WebElement iniciarSessao = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div[1]/div[1]/div/button"));
      iniciarSessao.click();     
      
      driver.get("http://localhost:8080/#/EliminarCliente");         
      
      WebElement eliminarCliente = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div[1]/table/tr[2]/td/button[1]"));
      eliminarCliente.click();
      
      driver.quit();
}

}