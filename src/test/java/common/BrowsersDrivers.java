package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;


public class BrowsersDrivers {

    public static WebDriver getDriver(){

        String browserName = System.getenv("browserName");

        switch (browserName) {
            case "FIREFOX":
                return getFirefoxBrowser();

            default:
                return getChromeBrowser();

        }

    }

    private static WebDriver getChromeBrowser() {

        System.setProperty("webdriver.chrome.driver", "src/drivers/Win/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--lang=pt");
        return new ChromeDriver(options);

    }

    private static WebDriver getFirefoxBrowser() {

        System.setProperty("webdriver.gecko.driver", "src/drivers/Win/geckodriver.exe");
        FirefoxProfile profile = new FirefoxProfile();
        profile.setPreference("intl.accept_languages", "pt");
        return new FirefoxDriver(profile);

    }
}