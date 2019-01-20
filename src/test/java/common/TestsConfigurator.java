package common;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.fail;

public class TestsConfigurator {
    public static WebDriver driver;
    protected static  final StringBuffer verificationErrors = new StringBuffer();
    private static String baseURL;


    @Before
    public void setUp() {
        baseURL = "http://gerir.teste.ti.lemaf.ufla.br/#/inicio/";
        driver = BrowsersDrivers.getDriver();
        driver.get( baseURL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @After
    public void tearDown(){
        if (driver != null) {
            driver.quit();
        }

        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }
}