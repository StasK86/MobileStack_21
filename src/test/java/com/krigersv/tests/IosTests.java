package com.krigersv.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;

public class IosTests extends TestBase {

    @Test
    @Tag("ios")
    @DisplayName("Проверка введенного текста в поле поиска")
    void iosMobileTest() {

        step("Нажать на поле поиска", () -> {
            $(id("Text Button")).click();
        });

        step("Нажать на Enter", () -> {
            $(id("Text Input")).click();
        });

        step("Ввод текста и нажатие Enter", () -> {
            $(id("Text Input")).sendKeys("Britney");
            $(id("Text Input")).pressEnter();
        });

        step("Проверка", () -> {
            assertThat($(id("Text Output")).getText())
                    .isEqualTo("Britney");
        });
    }
}
