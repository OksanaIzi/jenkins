package com.izibekova.tests;

import com.izibekova.config.CredentialsConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class TestsWithSystemProperties extends BaseTest{
    CredentialsConfig config = ConfigFactory.create(CredentialsConfig.class);
    @Test
    @Tag("systemProperties")
    void checkProperty(){
        open("https://github.com/");
        System.out.println(System.getProperty("browser", "safari"));
    }

    @Test
    @Tag("owner")
    void checkOwnerProperty(){
        open("https://github.com/");
        System.out.println("login: " + config.login());
        System.out.println("password: " + config.password());
    }
}
