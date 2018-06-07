/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psitestes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Rafael
 */
public class PSITestes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         WebDriver driver  = new ChromeDriver();
      driver.get("http://www.google.pt");
      WebElement pesquisa = driver.findElement(By.name("q"));
      pesquisa.sendKeys("Ola Mundo\n");
      //WebElement find = driver.findElement(By.name("btnK"));
      //find.click();  
    //driver.quit();
    }
    
}
