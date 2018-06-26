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
 * @author Rafael
 */
public class LoginAux {
    public WebDriver driver  = new ChromeDriver();
    
    public LoginAux() {
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
     public void login(String url) {
         
      driver.get("http://localhost:8080/#/Login");
      
      WebElement user = driver.findElement(By.name("uname"));
      user.sendKeys("test");
      
      WebElement pass = driver.findElement(By.name("psw"));
      pass.sendKeys("test");
      
      WebElement bt = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div[1]/div[1]/div/button"));
      bt.click();
      
      driver.get(url);
     }
}
