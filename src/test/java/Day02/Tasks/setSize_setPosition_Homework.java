package Day02.Tasks;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setSize_setPosition_Homework {
    public static void main(String[] args) throws InterruptedException {

        /*
        Go to the Amazon URL : https://www.amazon.com/
 Print the position and size of the page.
 Adjust the position and size of the page as desired.
 Test that the page is in the position and size you want.
 Close the page.

         */

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");
        System.out.println("driver.manage().window().getPosition() = " + driver.manage().window().getPosition());
        System.out.println("driver.manage().window().getSize() = " + driver.manage().window().getSize());


        driver.manage().window().setPosition(new Point(500, 120));
        Thread.sleep(1000);
        driver.manage().window().setSize(new Dimension(500, 500));

        System.out.println("driver.manage().window().getPosition() = " + driver.manage().window().getPosition());
        System.out.println("driver.manage().window().getSize() = " + driver.manage().window().getSize());

        driver.close();
    }
}
