package ru.praktikum.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static ru.praktikum.pageobject.constant.LinkConst.ORDER_PAGE;

public class OrderPage extends BasePage
{
    @FindBy(className = "Order_Header__BZXOb")
    private WebElement forCheckOpenOrderPage;

    public OrderPage(WebDriver driver)
    {
        super(driver);
    }

    public OrderPage openOrderPage()
    {
        driver.get(ORDER_PAGE);
        return this;
    }

    public String checkOpenOrderPage()
    {
        driverWait.until(ExpectedConditions.visibilityOf(forCheckOpenOrderPage));
        return forCheckOpenOrderPage.getText();
    }
}
