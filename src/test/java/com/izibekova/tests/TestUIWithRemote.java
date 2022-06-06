package com.izibekova.tests;

import com.izibekova.pages.MainPage;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.izibekova.steps.Steps.print;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class TestUIWithRemote extends BaseTest {
    @Test
    @Disabled
    void firstTest() {
        print();
        assertTrue(true);
    }

    @Test
    @Tag("wildberriesTest")
    void checkOpen() {
        MainPage mainPage = new MainPage();
        open("https://www.wildberries.ru/");
        mainPage.clickOnNavigationButton();
    }

    @Test
    @Tag("wildberriesTest")
    void checkWorkInWB() {
        MainPage mainPage = new MainPage();
        open("https://www.wildberries.ru/");
        mainPage.clickOnWorkInWB();
    }

    @Test
    void checkNavigationButton() {
        MainPage mainPage = new MainPage();
        open("https://www.wildberries.ru/");
        mainPage.clickOnNavigationButton();
    }

    @Test
    void checkAddressesOpenCorrect() {
        MainPage mainPage = new MainPage();
        open("https://www.wildberries.ru/");
        mainPage.clickOnButtonAddress();
        mainPage.checkSizeServiceMenu();
    }
}
