package waits;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomWaiter {

    private WebDriver driver;

    public static WebElement waitForElementLocatedBy(WebDriver driver, By by){
        return new WebDriverWait(driver, 10).until(ExpectedConditions
                .presenceOfElementLocated(by));
    }

//    public static ExpectedCondition<Boolean> jQueryAJAXCompleted() {
//        return new ExpectedCondition<Boolean>() {
//            @NullableDecl
//            @Override
//            public Boolean apply(@NullableDecl WebDriver driver) {
//                return (Boolean) ((JavascriptExecutor).driver.executeScript("return (window.jQuery != null) && (jQuery.active == = 0);");
//            }
//        };
//    }
}
