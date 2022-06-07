import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        for(int i=0; i<10; i++) {
            driver.get("http://localhost:8080");
            Thread.sleep(2500);
            WebElement loginNavBtn = driver.findElementById("loginNavBtn");
            loginNavBtn.click();
            Thread.sleep(2500);
            WebElement messageInput = driver.findElement(By.id("usernameInput"));
            messageInput.sendKeys("Message by Selenium");
            Thread.sleep(2500);
            WebElement passwordInput = driver.findElement(By.id("passwordInput"));
            passwordInput.sendKeys("Password by Selenium");
            Thread.sleep(2500);
        }
        driver.quit();
    }
}
