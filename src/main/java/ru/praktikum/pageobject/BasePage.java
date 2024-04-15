package ru.praktikum.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static ru.praktikum.pageobject.constant.Const.WAIT_TIME;

public abstract class BasePage
{
    protected final WebDriver driver;
    protected final WebDriverWait driverWait;

    protected BasePage(WebDriver driver)
    {
        this.driver = driver;
        this.driverWait = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME));
        PageFactory.initElements(driver, this);
    }
}
