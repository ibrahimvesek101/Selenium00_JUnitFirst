package Day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxVerifyTitle {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "resources/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.youtube.com/");

       // driver.getTitle();
        System.out.println("driver.getTitle().equals(\"video\") = " + driver.getTitle().equals("video"));
        driver.quit();
    }
}
