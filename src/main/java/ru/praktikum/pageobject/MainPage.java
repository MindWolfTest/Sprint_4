package ru.praktikum.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static ru.praktikum.pageobject.constant.LinkConst.MAIN_PAGE;

public class MainPage extends BasePage
{
    @FindBy(xpath = ".//button[text() = 'Статус заказа']")
    private WebElement orderStatusButton;

    @FindBy(xpath = ".//input[@placeholder = 'Введите номер заказа']")
    private WebElement searchOrderField;

    @FindBy(xpath = ".//button[text() = 'Go!']")
    private WebElement goButton;

    @FindBy(xpath = ".//div[1]/div[2]/button[text() = 'Заказать']")
    private WebElement buttonOrderInHeader;


    public MainPage(WebDriver driver)
    {
        super(driver);
    }

    public MainPage openMainPage()
    {
        driver.get(MAIN_PAGE);
        return this;
    }

    public MainPage clickOrderStatusButton()
    {
        driverWait.until(ExpectedConditions.elementToBeClickable(orderStatusButton));
        orderStatusButton.click();
        return this;
    }

    public MainPage enterOrderNumber(String orderID)
    {
        driverWait.until(ExpectedConditions.elementToBeClickable(searchOrderField));
        searchOrderField.sendKeys(orderID);
        return this;
    }

    public MainPage clickGoButton()
    {
        driverWait.until(ExpectedConditions.elementToBeClickable(goButton));
        goButton.click();
        return this;
    }

    public MainPage clickOrderButtonInHeader()
    {
        driverWait.until(ExpectedConditions.elementToBeClickable(buttonOrderInHeader)).click();
        return this;
    }



}


