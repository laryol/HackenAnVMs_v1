import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class MainUser {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://localhost:8080");
        WebElement loginNavBtn = driver.findElementById("loginNavBtn");
        loginNavBtn.click();
        WebElement messageInput = driver.findElement(By.id("usernameInput"));
        messageInput.sendKeys("User");
        WebElement passwordInput = driver.findElement(By.id("passwordInput"));
        passwordInput.sendKeys("c2cn29du23fv2f9mc2rr");
        WebElement signInBtn = driver.findElement(By.id("signInBtn"));
        signInBtn.click();
        while(true) {
            driver.get("http://localhost:8080/intern/commentReview");
            Thread.sleep(2500);
            List<WebElement> publicizeCommentBtnList = driver.findElementsById("publicizeCommentBtn");
            if(publicizeCommentBtnList.size() > 0){
                publicizeCommentBtnList.get(0).click();
            }
        }
        //driver.quit();
    }
}
