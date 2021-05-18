import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Time;
import java.util.concurrent.TimeUnit;


public class HomeworkQ_2 {


        WebDriver driver;


        @Before
        public void setUp() {
            String baseURl = "https://demo.nopcommerce.com/";
            //selenium .jar file            //driver file path
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            //webdriver declaration
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            //method to open browser
            driver.get(baseURl);
        }

        @Test
        public void userShouldBeAbleToRegisterSuccesfully() {
            WebElement RegisterBtnClick = driver.findElement(By.xpath("//a[@class = 'ico-register']"));
            RegisterBtnClick.click();
            WebElement RadioBtn = driver.findElement(By.xpath("//input[@id = 'gender-male']"));
            RadioBtn.click();
            WebElement FirstName = driver.findElement(By.xpath("//input[@name = 'FirstName']"));
            FirstName.sendKeys("Prime");
            WebElement LastName = driver.findElement(By.xpath("//input[@id = 'LastName']"));
            LastName.sendKeys("Testing");
            WebElement DoB = driver.findElement(By.xpath("//select[@name = 'DateOfBirthDay']"));
            DoB.sendKeys("1");
            WebElement DoM = driver.findElement(By.xpath("//select[@name = 'DateOfBirthMonth']"));
            DoM.sendKeys("Jan");
            WebElement DoY = driver.findElement(By.xpath("//select[@name = 'DateOfBirthYear']"));
            DoY.sendKeys("1990");
            WebElement eMail = driver.findElement(By.xpath("//input[@id = 'Email']"));
            eMail.sendKeys("test@gmail.com");
            WebElement CompanyName = driver.findElement(By.xpath("//input[@id = 'Company']"));
            CompanyName.sendKeys("Prime Testing Watford");
            WebElement Pass = driver.findElement(By.xpath("//input[@id = 'Password']"));
            Pass.sendKeys("Pass123");
            WebElement Cpass = driver.findElement(By.xpath("//input[@id = 'ConfirmPassword']"));
            Cpass.sendKeys("Pass123");
            WebElement RegisterBtn = driver.findElement(By.xpath("//button[@id = 'register-button']"));
            RegisterBtn.click();
            String expectedMessage = "Your registration completed";


        }

        @After
        public void tearDown() {
            driver.quit();
        }
    }

