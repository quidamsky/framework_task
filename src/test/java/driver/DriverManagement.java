package driver;

//import io.github.bonigarcia.wdm.WebDriverManager;
//import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManagement {

    private static WebDriver driver;

    private DriverManagement() {
    }

    ;

    public static WebDriver getDriver() {
//        WebDriverManager.chromiumdriver().driverVersion("88.0.4324.96").setup();
//        WebDriverManager.getInstance(DriverManagerType.CHROMIUM).setup();
//        WebDriverManager.chromiumdriver().setup();
//        "/home/bagheera/Documents/java/scripts/framework_task/src/main/resources"
        System.setProperty("webdriver.chrome.driver",
                "/home/bagheera/Documents/java/scripts/framework_task/src/main/resources/chromedriver");
        driver = new ChromeDriver();
//        driver.manage().window().maximize();
        return driver;
    }

    public static void closeDriver() {
        driver.quit();
        driver = null;
    }
}
