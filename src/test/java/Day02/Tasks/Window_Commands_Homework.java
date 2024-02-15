package Day02.Tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Commands_Homework {
    public static void main(String[] args) throws InterruptedException {
        /*
        Invoke Chrome Browser
Open URL: https://www.google.com/
Maximize the window.
Print the position and size of the page.
Minimize the page.
Wait 5 seconds in the icon state and maximize the page.
Print the position and dimensions of the page in maximized state.
Make the page fullscreen.
Close the Browser.
         */

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        driver.manage().window().maximize();
        System.out.println("driver.manage().window().getPosition() = " + driver.manage().window().getPosition());
        System.out.println("driver.manage().window().getSize() = " + driver.manage().window().getSize());
        driver.manage().window().minimize();
        Thread.sleep(5000);
        driver.manage().window().maximize();
        System.out.println("driver.manage().window().getPosition() = " + driver.manage().window().getPosition());
        System.out.println("driver.manage().window().getSize() = " + driver.manage().window().getSize());
        driver.manage().window().fullscreen();
   //   Thread.sleep(2000);     // fullscreen daha iyi görmek için..
        driver.quit();
    }
}
