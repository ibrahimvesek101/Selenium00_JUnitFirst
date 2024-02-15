package Day02.Tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Title_URL_Homework {
    public static void main(String[] args) {

        /*
        Invoke Chrome Driver
 Navigate to Facebook homepage URL: https://www.facebook.com/
 Verify expected equals actual URL.
 Verify expected contains Facebook Word.

 (Testleri gerceklestirmeyi unutmayin)
         */

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");

        if (driver.getCurrentUrl().equals("https://www.facebook.com/")) {
            System.out.println("URL TEST PASSED");
        }else {
            System.out.println("URL TEST FAILED");
        }

       // System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        if (driver.getCurrentUrl().contains("Facebook")) {
            System.out.println("WORD TEST PASSED");
        }else {
            System.out.println("WORD TEST FAILED");
        }
    }
}
