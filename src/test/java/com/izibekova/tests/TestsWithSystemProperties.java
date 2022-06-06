package com.izibekova.tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class TestsWithSystemProperties extends BaseTest{
    @Test
    @Tag("systemProperties")
    void checkProperty(){
        open("https://github.com/");
        System.out.println(System.getProperty("browser", "safari"));
    }

}
