import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;


public class MainAdmin {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://localhost:8080");
        WebElement loginNavBtn = driver.findElementById("loginNavBtn");
        loginNavBtn.click();
        WebElement messageInput = driver.findElement(By.id("usernameInput"));
        messageInput.sendKeys("Admin");
        WebElement passwordInput = driver.findElement(By.id("passwordInput"));
        passwordInput.sendKeys("1r22ng22oewfnf32r9nf");
        WebElement signInBtn = driver.findElement(By.id("signInBtn"));
        signInBtn.click();
        List<String> visitedLinks = new ArrayList<>();
        while(true) {
            driver.get("http://localhost:8080/intern/storage/container_forum");
            Thread.sleep(2500);
            List<WebElement> requestLinkList = driver.findElementsById("requestLink");
            List<WebElement> responseInputList = driver.findElementsById("responseInput");
            List<WebElement> addResponseBtnList = driver.findElementsById("addResponseBtn");
            for(WebElement requestLink : requestLinkList){
                String url = requestLink.getAttribute("href");
                if(!visitedLinks.contains(url)){
                    String[] splitUrl = url.split("\\?");
                    if(splitUrl[0].equals("http://localhost:8080/intern/storage/container")){
                        int indexOfClickedLink = requestLinkList.indexOf(requestLink);
                        requestLink.click();
                        WebElement boxPasswordInput = driver.findElement(By.id("passwordInput"));
                        WebElement boxName = driver.findElement(By.id("containerId"));
                        String containerId = boxName.getAttribute("value");
                        WebElement accessContainerBtn = driver.findElement(By.id("accessContainerBtn"));
                        switch (containerId){
                            case "4aaf1d37-4c77-433e-8262-49f7729c966d":
                                new Actions(driver).sendKeys(boxPasswordInput,"IAmHuman").perform();
                                Thread.sleep(2500);
                                accessContainerBtn.click();
                                driver.get("http://localhost:8080/intern/storage/container_forum");
                                responseInputList = driver.findElementsById("responseInput");
                                addResponseBtnList = driver.findElementsById("addResponseBtn");
                                WebElement neededResponseInput = responseInputList.get(indexOfClickedLink);
                                WebElement neededResponseBtn = addResponseBtnList.get(indexOfClickedLink);
                                neededResponseInput.sendKeys("This container contains no confidential information." +
                                        "Therefore I can even share its password with you. The password is: IAmHuman");
                                Thread.sleep(1000);
                                neededResponseBtn.click();
                                break;
                            case "5dedebfd-1fda-458c-b2d2-2f29de490d31":
                                new Actions(driver).sendKeys(boxPasswordInput,"iHateMurica").perform();
                                Thread.sleep(2500);
                                accessContainerBtn.click();
                                break;
                            case "fdd3de39-e35b-40a1-9f89-ae2e3f1ad78b":
                                new Actions(driver).sendKeys(boxPasswordInput,"iWannaPlay").perform();
                                Thread.sleep(2500);
                                accessContainerBtn.click();
                                break;
                            case "2acced10-481e-4b50-9177-90311ae4693c":
                                new Actions(driver).sendKeys(boxPasswordInput,"ILoveApples").perform();
                                Thread.sleep(2500);
                                accessContainerBtn.click();
                                break;
                            case "0c598989-c4ef-4aeb-98b9-7673639cfa58":
                                new Actions(driver).sendKeys(boxPasswordInput,"VeRyS3CuReP4s5w0rD!").perform();
                                Thread.sleep(2500);
                                accessContainerBtn.click();
                                driver.get("http://localhost:8080/intern/storage/container_forum");
                                responseInputList = driver.findElementsById("responseInput");
                                addResponseBtnList = driver.findElementsById("addResponseBtn");
                                WebElement neededResponseInput2 = responseInputList.get(indexOfClickedLink);
                                WebElement neededResponseBtn2 = addResponseBtnList.get(indexOfClickedLink);
                                neededResponseInput2.sendKeys("Sadly, the content of this container is confidential. " +
                                        "Therefore I can not share anything of its contents with you.");
                                Thread.sleep(1000);
                                neededResponseBtn2.click();
                                break;
                        }
                    }else{
                        int index = requestLinkList.indexOf(requestLink);
                        WebElement responseInput = responseInputList.get(index);
                        responseInput.sendKeys("This is not a link to a container");
                        WebElement addResponseBtn = addResponseBtnList.get(index);
                        addResponseBtn.click();
                    }
                    visitedLinks.add(url);
                    break;
                }
            }
        }
        //driver.quit();
    }
}
