package com.example.testy;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Selectors.byText;
import static org.junit.jupiter.api.Assertions.*;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class MainPageTest {
    MainPage mainPage = new MainPage();

    @BeforeAll
    public static void setUpAll() {
        Configuration.browserSize = "1280x800";
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @BeforeEach
    public void setUp() {
        open("https://www.facebook.com/");
    }

    @Test
    public void search() {
//        mainPage.searchButton.click();

        $(byText("Akceptuj wszystkie")).click();
        $("input[placeholder='Adres e-mail lub numer telefonu']").sendKeys("test");

//        $("#email").sendKeys("andrii.kovalenkov@gmail.com");
//        $("#header-search").sendKeys("Selenium");
//        $x("//button[@type='submit' and text()='Search']").click();
//        $(".js-search-input").shouldHave(attribute("value", "Selenium"));
    }
}
