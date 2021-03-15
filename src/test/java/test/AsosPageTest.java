package test;

import driver.DriverManagement;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import page.AsosHomePage;

public class AsosPageTest {

    protected WebDriver driver;

    @BeforeMethod
    public void browserSetup() {
        driver = DriverManagement.getDriver();
    }

    @Test(priority = 1)
    public void getAsosCompanyHomePage() {
        driver.get("https://www.asos.com/");
//        DriverManagement.closeDriver();
    }

    @Test (priority = 2)
    public void commonSearchTermsResultsAreNotEmpty() {
        int expectedSearchResultsNumber = new AsosHomePage(driver)
                .openPage()
                .searchInputResult("Wide Leg Jeans")
                .countResultsNumberWithSearchTerm();

        Assert.assertTrue(expectedSearchResultsNumber > 0, "Result is not empty.");
    }

    @AfterMethod(alwaysRun = true)
    public void browserQuit() {
        driver.quit();
        driver = null;
    }
}
