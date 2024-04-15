package ru.praktikum.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WrongOrderNumberPage extends BasePage
{
    @FindBy(xpath = ".//img[@alt = 'Not found']")
    private WebElement notFoundImage;

    public WrongOrderNumberPage(WebDriver driver)
    {
        super(driver);
    }

    public boolean checkWrongOrderPage()
    {
        driverWait.until(ExpectedConditions.visibilityOf(notFoundImage));

        return notFoundImage.isDisplayed();
    }
}
