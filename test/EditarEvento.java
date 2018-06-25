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
public class EditarEvento {
    
    public EditarEvento() {
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
    public void TesteEditarEvento(){
      LoginAuxiliar auxiliar = new LoginAuxiliar();
      auxiliar.login("http://localhost:8080/?#/EditarEvento");       

      WebElement descricaoEvento = auxiliar.driver.findElement(By.xpath("//*[@id=\"descrio\"]"));
      descricaoEvento.sendKeys("O Documento Y tem informação em relação à peça A");     
      
      WebElement dataDoEvento = auxiliar.driver.findElement(By.xpath("//*[@id=\"data\"]"));
      dataDoEvento.sendKeys("07072018");

      WebElement tipoEvento = auxiliar.driver.findElement(By.xpath("//*[@id=\"tipo\"]"));
      tipoEvento.sendKeys("evento privado");
      
      WebElement confirmar = auxiliar.driver.findElement(By.xpath("//*[@id=\"app\"]/main/div[1]/button"));
      confirmar.click();   
}
}
