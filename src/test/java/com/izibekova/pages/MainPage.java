package com.izibekova.pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MainPage {
    private final SelenideElement workInWB = $("a[href='/services/prodavayte-na-wildberries']");
    private final SelenideElement navigationButton = $("button[aria-label='Навигация по сайту']");
    private final SelenideElement addressButton = $("a[data-wba-header-name='Pick_up_points']");
    private final ElementsCollection serviceMenu = $$(".service-menu ul li");

    @Step
    public void clickOnWorkInWB(){
        workInWB.click();
    }

    @Step
    public void clickOnNavigationButton(){
        navigationButton.click();
    }
    @Step
    public void clickOnButtonAddress(){
        addressButton.click();
    }
    @Step
    public void checkSizeServiceMenu(){
        serviceMenu.shouldHave(CollectionCondition.size(8));
    }
}
