package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AsosSearchResultsPageMixed {

    private WebDriver driver;
    private String searchTerm;
    private String defaultLocator = "//div[contains(@data-auto-id, 'productList')]";
    private String containsPart = " and contains(., '%s')";

    @FindBy(xpath = "//div[contains(@data-auto-id, 'productList')]")
    private List<WebElement> generalSearchResults;

    public int countGeneralNumberOfSearchResults() {
        System.out.println("Search results number of requested iterm: ");
        return generalSearchResults.size();
    }

    public AsosSearchResultsPageMixed(WebDriver driver, String searchTerm) {
        this.searchTerm = searchTerm;
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public int countResultsNumberWithSearchTerm() {
        List<WebElement> resultsNumberWithSearchTerm = driver.findElements(By.xpath(defaultLocator));
        return resultsNumberWithSearchTerm.size();
    }
}
