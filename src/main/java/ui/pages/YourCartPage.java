package ui.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class YourCartPage {

    private SelenideElement cartTitle = $("[data-test='title']");
    private SelenideElement itemName = $("[data-test='inventory-item-name']");
    private SelenideElement checkoutButton = $("[data-test='checkout']");

    public YourCartPage openCartPage() {
        Selenide.open("https://www.saucedemo.com/cart.html");
        cartTitle.shouldBe(Condition.visible, Duration.ofSeconds(10));
        cartTitle.shouldHave(Condition.text("Your Cart"));
        return this;
    }

    public void checkAddedProductsInCart() {
        itemName.shouldHave(Condition.text("Sauce Labs Backpack"));
    }

    public void goToCheckout() {
        checkoutButton.shouldBe(Condition.clickable, Duration.ofSeconds(10));
        checkoutButton.click();
    }
}
