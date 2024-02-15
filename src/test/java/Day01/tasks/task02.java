package Day01.tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task02 {
    public static void main(String[] args) throws InterruptedException {

        /*

- Invoke Chrome Browser
- Navigate to URL: https://clarusway.com/
- Navigate to URL: https://amazon.com/
- Come back to the Clarusway using the back command.
- Verify the current URL is https://clarusway.com/
- Again go back to the amazon website using forward command
- Verify the current URL is https://amazon.com/
- Refresh the Browser using refresh command.
- Close the Browser.

         */

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://clarusway.com");
        driver.get("https://amazon.com");


        driver.navigate().back();
        if (driver.getCurrentUrl().equals("https://clarusway.com/")) {

            System.out.println(driver.getCurrentUrl() + " Url PASSED");
        } else {

            System.out.println(driver.getCurrentUrl() + " Url FAILED");
        }


        driver.navigate().forward();
        if (driver.getCurrentUrl().equals("https://www.amazon.com/")) {

            System.out.println(driver.getCurrentUrl() + " Url PASSED");
        } else {

            System.out.println(driver.getCurrentUrl() + " Url FAILED");
        }
      //  Thread.sleep(3000);       //isteğe bağlı
        driver.navigate().refresh();
      //  Thread.sleep(3000);       //isteğe bağlı
        driver.quit();
    }
}
