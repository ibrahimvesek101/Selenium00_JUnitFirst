package Day01.tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task01 {
    static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {

        /*
    Open google home page: https://www.google.com
    Verify Title on page
    Verify Current URL on page
    Close/Quit the browser
    Open stackoverflow home page: https://stackoverflow.com
    Verify Title on page
    Verify Current URL on page
    Close/Quit the browser
    Open linkedin home page: https://www.linkedin.com
    Verify Title on page
    Verify Current URL on page
    Close/Quit the browser
         */

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");


        // Aşağıdaki Methotlardan sadece bir tanesini açıp çalıştırınız...  ( titleControl, urlControl)


        titleControl("Google", "https://www.google.com");
        //  urlControl("https://www.google.com/", "https://www.google.com");


        //  titleControl("Stack Overflow - Where Developers Learn, Share, & Build Careers", "https://stackoverflow.com");
        //  urlControl("https://stackoverflow.com/", "https://stackoverflow.com");


        //   titleControl("LinkedIn: Oturum Açın veya Üye Olun", "https://www.linkedin.com");
        //   urlControl("https://www.linkedin.com/", "https://www.linkedin.com");


    }

    private static void urlControl(String olmasıGerekenUrl, String testEdilecekUrl) {

        driver.get(testEdilecekUrl);
        System.out.println("Test edilen url = " + driver.getCurrentUrl());
        System.out.println("Olması gereken url = " + olmasıGerekenUrl);

        if (driver.getCurrentUrl().equals(olmasıGerekenUrl)) {

            System.out.println(driver.getCurrentUrl() + " Url PASSED");
        } else {

            System.out.println(driver.getCurrentUrl() + " Url FAILED");
        }
        driver.close();
        driver.quit();
    }


    private static void titleControl(String title, String url) {
        driver.get(url);
        System.out.println("Test Edilen Title = " + driver.getTitle());
        System.out.println("Olması Gereken Title = " + title);
        if (driver.getTitle().equals(title)) {
            System.out.println(driver.getTitle() + " Title PASSED");
        } else {
            System.out.println(driver.getTitle() + " Title FAILED");
        }
        driver.close();
        driver.quit();
    }
}


