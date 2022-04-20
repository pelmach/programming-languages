package selenium;

import org.openqa.selenium.chrome.ChromeDriver;


public class Driver {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\trush\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://testng.org/");
        driver.wait(1000);
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
    }
}
