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
 * @author joaon
 */
public class TestePagina2 {
    
    public TestePagina2() {
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
      WebElement tipoConjunto = driver.findElement(By.xpath("//*[@id=\"tipo-conjunto\"]"));
      tipoConjunto.sendKeys("Retábulos e outras alfaias religiosas;");  
      WebElement elementosConstituintes = driver.findElement(By.xpath("//*[@id=\"elementos-constituintes\"]"));
      elementosConstituintes.sendKeys("Mesa, colunas, paineis laterais, nicho, remate, trono (possivelmente forro de um arco);");        
      Select integEmConjunto = new Select(driver.findElement(By.id("integrado-em-conjunto")));
      integEmConjunto.selectByIndex(2);     
      WebElement elementosAcessorios = driver.findElement(By.xpath("//*[@id=\"elementos-acessrios\"]"));
      elementosAcessorios.sendKeys("Cápsulas metálicas (chumbo) para encaixe de contas de vidro;");    
      WebElement assinaturaAutoria = driver.findElement(By.xpath("//*[@id=\"assinatura-autoria\"]"));
      assinaturaAutoria.sendKeys("Não foram identificadas quaisquer marcas deste género;"); 
      WebElement inscricoesMontagem = driver.findElement(By.xpath("//*[@id=\"inscries-de-montagem\"]"));
      inscricoesMontagem.sendKeys("Riscador"); 
      WebElement inscricoesConstrucao = driver.findElement(By.xpath("//*[@id=\"inscries-de-construcao\"]"));
      inscricoesConstrucao.sendKeys("Traços de serra, compasso, riscador; Marcas geométricas;");
      WebElement classificacaoPatrimonial = driver.findElement(By.xpath("//*[@id=\"data-de-entrada-do-cearc\"]"));
      classificacaoPatrimonial.sendKeys("Não tem");

      WebElement estilo = driver.findElement(By.xpath("//*[@id=\"estilo\"]"));
      estilo.sendKeys("Tardo-maneirista / Proto-Barroco");
      
      Select epoca = new Select(driver.findElement(By.id("epoca")));
      epoca.selectByIndex(2); 
      
      Select qualidade = new Select(driver.findElement(By.id("qualidade")));
      qualidade.selectByIndex(4); 
      
      WebElement descricao = driver.findElement(By.xpath("//*[@id=\"descrio\"]"));
      descricao.sendKeys("Entablamento, com frisos, de decorações vegetalistas e geométricas, com apliques de contas de vidro azul e vermelho;");
      
      WebElement analogia = driver.findElement(By.xpath("//*[@id=\"analogia\"]"));
      analogia.sendKeys("Desconhecidas");
      
      WebElement conclusoes = driver.findElement(By.xpath("//*[@id=\"concluses\"]"));
      conclusoes.sendKeys("n/a");
      
      WebElement autoria = driver.findElement(By.xpath("//*[@id=\"autoria\"]"));
      autoria.sendKeys("Desconhecida");
      
      WebElement datacao = driver.findElement(By.xpath("//*[@id=\"datao\"]"));
      datacao.sendKeys("Fins do séc. XVII, Inícios séc. XVIII (?)");
      
      WebElement localOrigem = driver.findElement(By.xpath("//*[@id=\"local-origem\"]"));
      localOrigem.sendKeys("Provavelmente Lisboa");
      
      WebElement estruturaTecnica = driver.findElement(By.xpath("//*[@id=\"estrutura-tcnica\"]"));
      estruturaTecnica.sendKeys("Ensamblagem; Entalhamento; Ligações simples, coladas, cavilhadas e pregadas.");
      
      WebElement superficieTecnica = driver.findElement(By.xpath("//*[@id=\"superficie-tcnica\"]"));
      superficieTecnica.sendKeys("Douramento a água, brunido");
      
      WebElement estruturaMaterial = driver.findElement(By.xpath("//*[@id=\"estrutura-material\"]"));
      estruturaMaterial.sendKeys("Madeira de carvalho. Intervenções diferenciadas em madeiras de pinho e castanho");
      
      WebElement superficieMaterial = driver.findElement(By.xpath("//*[@id=\"superficie-material\"]"));
      superficieMaterial.sendKeys("Cré, cola de coelho, bollus, folha de ouro de lei, vidro, cápsulas de chumbo");
           
      driver.quit();  
      
    }
}
