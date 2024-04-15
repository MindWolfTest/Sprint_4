package ru.practikum;

import jdk.jfr.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Assert;
import org.junit.Test;
import ru.praktikum.pageobject.MainPage;
import ru.praktikum.pageobject.WrongOrderNumberPage;

public class SearchNotFoundOrderTest extends BaseTest
{
    private final String wrongOrderID = "1234";

    @Test
    @DisplayName("Проверка поиска на ошибочный ID заказа")
    @Description("Проверка поиска на ошибочный ID заказа")
    public void checkWrongSearchAtHomePageTest()
    {
        MainPage objEnterWrongID = new MainPage(driver);
        objEnterWrongID
                .openMainPage()
                .clickOrderStatusButton()
                .enterOrderNumber(wrongOrderID)
                .clickGoButton();

        WrongOrderNumberPage objCheckOpenWrongOrderPage = new WrongOrderNumberPage(driver);
        Assert.assertTrue("\n   Ошибка!!!\nНе открылась страница: Такого заказа нет!",
                                                        objCheckOpenWrongOrderPage.checkWrongOrderPage());

    }

}
