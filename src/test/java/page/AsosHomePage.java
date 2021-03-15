package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import waits.CustomWaiter;

public class AsosHomePage {
    private static final String HOMEPAGE_URL = "https://www.asos.com/";
    private WebDriver driver;
//    private static final String TERM = "Wide Leg Jeans";

    @FindBy(name = "q")
    private WebElement searchInput;

    //    @FindBy(xpath = "//*[@class = 'kH5PAAC']")
    @FindBy(xpath = "//*[@class = 'kH5PAAC _1KRfEms']")
    private WebElement searchButton;

    public AsosHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public AsosHomePage openPage() {
        driver.get(HOMEPAGE_URL);
        CustomWaiter.waitForElementLocatedBy(driver, By.name("q"));
//        new WebDriverWait(driver, 10)
//                .until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.name("q")));

//        new WebDriverWait()
        return this;
    }

    public AsosSearchResultsPageMixed searchInputResult(String term) {
        searchInput.sendKeys(term);
        searchButton.click();
        return new AsosSearchResultsPageMixed(driver, term);
    }
}
