import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;

import java.util.concurrent.TimeUnit;

public class Homework1 {
    WebDriver driver;

    @Before
    public void verifySetUpAndComputerLink() {
        String baseUrl = "https://www.google.com/";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");//learn by heart
        //Testing Computer link
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);//it will wait to load browser
        driver.get(baseUrl);
    }
    @Test

        public void clickOnComputerTab(){
            driver.findElement(By.xpath("//div[text()= 'I agree']")).click();
            driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("nopCommerce demo store");
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(Keys.ENTER);
           // driver.findElement(By.xpath("//input[@value='Google Search']")).click();
            driver.findElement(By.xpath("//h3[text()='nopCommerce demo store']")).click();
            driver.findElement(By.xpath("//a[text()='Computers ']")).click();

        }
//Testing Electronics link
@Test
//
        public void clickOnElectronicsTab(){
            driver.findElement(By.xpath("//div[text()= 'I agree']")).click();
            driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("nopCommerce demo store");
            driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(Keys.ENTER);
            //driver.findElement(By.xpath("//input[@value='Google Search']")).click();
            driver.findElement(By.xpath("//h3[text()='nopCommerce demo store']")).click();
            driver.findElement(By.xpath("//a[text()='Electronics ']")).click();
            //  driver.close();
        }
        @Test
        //Testing Apparel link
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//it will wait to load browser
//        driver.get(baseUrl);
        public void clickOnApparealLink() {
            driver.findElement(By.xpath("//div[text()= 'I agree']")).click();
            driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("nopCommerce demo store");
            driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(Keys.ENTER);
           // driver.findElement(By.xpath("//input[@value='Google Search']")).click();
            driver.findElement(By.xpath("//h3[text()='nopCommerce demo store']")).click();
            driver.findElement(By.xpath("//a[text()='Apparel ']")).click();
            //driver.close();
            //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//it will wait to load browser
        }
        @Test
        //Testing Digital downloads link
//
        public void clickOnDigitalDownloads() {
            driver.findElement(By.xpath("//div[text()= 'I agree']")).click();
            driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("nopCommerce demo store");
            driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(Keys.ENTER);
           // driver.findElement(By.xpath("//input[@value='Google Search']")).click();
            driver.findElement(By.xpath("//h3[text()='nopCommerce demo store']")).click();
            driver.findElement(By.xpath("//a[text()='Digital downloads ']")).click();
            //driver.close();
            //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//it will wait to load browser
        }
        @Test
        //Testing Books link
//
        public void clickOnBooksLink() {
            driver.findElement(By.xpath("//div[text()= 'I agree']")).click();
            driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("nopCommerce demo store");
            driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(Keys.ENTER);
           // driver.findElement(By.xpath("//input[@value='Google Search']")).click();
            driver.findElement(By.xpath("//h3[text()='nopCommerce demo store']")).click();
            driver.findElement(By.xpath("//a[text()='Books ']")).click();
            //driver.close();
            //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//it will wait to load browser
        }
@Test
        //Testing Jewelery link
        public void clickOnJeweleryLink() {
            driver.findElement(By.xpath("//div[text()= 'I agree']")).click();
            driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("nopCommerce demo store");
            driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(Keys.ENTER);
           // driver.findElement(By.xpath("//input[@value='Google Search']")).click();
            driver.findElement(By.xpath("//h3[text()='nopCommerce demo store']")).click();
            driver.findElement(By.xpath("//a[text()='Jewelry ']")).click();
            // driver.close();
            // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//it will wait to load browser
        }
        @Test

        //Testing Gift Cards link
        public void clickOnGiftCardsLink() {

            driver.findElement(By.xpath("//div[text()= 'I agree']")).click();
            driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("nopCommerce demo store");
            driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(Keys.ENTER);
           // driver.findElement(By.xpath("//input[@value='Google Search']")).click();
            driver.findElement(By.xpath("//h3[text()='nopCommerce demo store']")).click();
            driver.findElement(By.xpath("//a[text()='Gift Cards ']")).click();
            //   driver.close();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//it will wait to load browser
        }
     @After
 public void tearDown(){

               driver.quit();
       }
    }




