package com.izibekova.tests;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.izibekova.steps.Steps.print;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class FirstTest extends BaseTest{
    @Test
    @Disabled
    void firstTest(){
        print();
        assertTrue(true);
    }

    @Test
    void checkOpen(){
        open("https://www.google.com/");
    }

}
