package ru.practikum;


import org.junit.Test;
import ru.praktikum.pageobject.MainPage;
import ru.praktikum.pageobject.OrderPage;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

import static ru.praktikum.pageobject.constant.ConstForCheckingPages.TEXT_IN_FIRST_ORDER_PAGE;
import static ru.praktikum.pageobject.constant.LinkConst.ORDER_PAGE;

public class OpenOrderPageTest extends BaseTest
{
    @Test
    public void openOrderPageByButtonInHeader()
    {
        MainPage objEnterOrderPageByButtonInHeader = new MainPage(driver);
        objEnterOrderPageByButtonInHeader
                .openMainPage()
                .clickOrderButtonInHeader();

        OrderPage objCheckOpenOrderPage = new OrderPage(driver);
        assertEquals("\nОшибка!!!\nСтраница заказа самоката не открылась!",
                objCheckOpenOrderPage.checkOpenOrderPage(), TEXT_IN_FIRST_ORDER_PAGE);
        assertThat("\nОшибка!\nUrl стр заказа самоката не совпадает",
                driver.getCurrentUrl(), containsString(ORDER_PAGE));
    }
}
