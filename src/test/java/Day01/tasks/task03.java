package Day01.tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task03 {
    public static void main(String[] args) {

        /*
Invoke Chrome Browser
Open URL: https://www.google.com/
Maximize the window.
Minimize the page.
Make the page fullscreen.
         */


        WebDriver driver = new ChromeDriver();

        driver.get("http://www.google.com");
        driver.manage().window().maximize();
        driver.manage().window().minimize();
        driver.manage().window().fullscreen();
    }
}
