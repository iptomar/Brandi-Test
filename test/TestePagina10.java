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
public class TestePagina10 {
    
    public TestePagina10() {
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

    //Este teste consiste em verficar se os campos da página 10 são válidos e corrrtos
    //Foram realizados testes a todos os campos da parte das Fontes da Ficha Técnica
    @Test
    public void testepagina10(){
    WebDriver driver  = new ChromeDriver();
      driver.get("http://localhost:8080/#/form#pg10");     
      WebElement infosDocumentais = driver.findElement(By.xpath("//*[@id=\"arquivsticas--documentais\"]"));
      infosDocumentais.sendKeys("Mário Santos/Banco de madeira/Tomar/12-05-2017/11");  
      
      WebElement tipo = driver.findElement(By.xpath("//*[@id=\"arquivtipo\"]"));
      tipo.sendKeys("Madeira");        
      
      WebElement localizacao = driver.findElement(By.xpath("//*[@id=\"arquivlocal\"]"));
      localizacao.sendKeys("Tomar"); 
      
      WebElement cota = driver.findElement(By.xpath("//*[@id=\"arquivcota\"]"));
      cota.sendKeys("Cota Média");    
      
      WebElement infosIconograficas = driver.findElement(By.xpath("//*[@id=\"iconogrficas\"]"));
      infosIconograficas.sendKeys("Ivo Costa//Mesa de madeira/Tomar/14-05-2017/12"); 
      
      WebElement iconTipo = driver.findElement(By.xpath("//*[@id=\"icontipo\"]"));
      iconTipo.sendKeys("Madeira"); 
      
      WebElement localIcon = driver.findElement(By.xpath("//*[@id=\"iconlocal\"]"));
      localIcon.sendKeys("Tomar");
      
      WebElement cotaIcon = driver.findElement(By.xpath("//*[@id=\"iconcota\"]"));
      cotaIcon.sendKeys("Não tem");
      
      WebElement infosBibliograficas = driver.findElement(By.xpath("//*[@id=\"bibliogrficas\"]"));
      infosBibliograficas.sendKeys("Vera Sines/A Obra de Madeira/Tomar/10/02/2017/3");     
      
      WebElement tipoBibliograficas = driver.findElement(By.xpath("//*[@id=\"bibliotipo\"]"));
      tipoBibliograficas.sendKeys("Não tem");      
      
  
      WebElement localBibliograficas = driver.findElement(By.xpath("//*[@id=\"bibliolocal\"]"));
      localBibliograficas.sendKeys("Algaz");     
      
      WebElement cotaBibliograficas = driver.findElement(By.xpath("//*[@id=\"bibliocota\"]"));
      cotaBibliograficas.sendKeys("Desconhecida");     
      
      
      WebElement infosEletronicos = driver.findElement(By.xpath("//*[@id=\"eletrnicas\"]"));
      infosEletronicos.sendKeys("Amilcar Pontes/A materia prima/Vendas Novas/6/1/2017/3/nao tem");     
      
      WebElement tipoEletronicos = driver.findElement(By.xpath("//*[@id=\"electrotipo\"]"));
      tipoEletronicos.sendKeys("Desconhecido");    
      
      
      WebElement dataConsulta = driver.findElement(By.xpath("//*[@id=\"electrodata\"]"));
      dataConsulta.sendKeys("29/05/2017");    
      
      WebElement infosOutrasFontes = driver.findElement(By.xpath("//*[@id=\"outras-fontes\"]"));
      infosOutrasFontes.sendKeys("Não tem");      
      
      WebElement tipoOutrasFontes = driver.findElement(By.xpath("//*[@id=\"outratipo\"]"));
      tipoOutrasFontes.sendKeys("Não tem");     
      
      WebElement localizacaoOutrasFontes = driver.findElement(By.xpath("//*[@id=\"outradata\"]"));
      localizacaoOutrasFontes.sendKeys("Não tem");        
            
      WebElement nomeTecnicoEquipa = driver.findElement(By.xpath("//*[@id=\"nometecnino\"]"));
      nomeTecnicoEquipa.sendKeys("Fernando dos Santos Antunes");

      WebElement funcaoDesempenhada = driver.findElement(By.xpath("//*[@id=\"funcao\"]"));
      funcaoDesempenhada.sendKeys("Coordenador / Director Técnico CR");
      
      WebElement habilitacoes = driver.findElement(By.xpath("//*[@id=\"nivel\"]"));
      habilitacoes.sendKeys("Mestrado | Nível 7");
      
    } 
}
