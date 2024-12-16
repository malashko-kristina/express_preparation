package ui.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class ProductsPage {

    private SelenideElement productsTitle = $("[data-test='title']");
    private SelenideElement backPack = $("[data-test='add-to-cart-sauce-labs-backpack']");
    private SelenideElement shoppingCart = $("[data-test='shopping-cart-link']");

    public ProductsPage openProductsPage() {
        Selenide.open("https://www.saucedemo.com/inventory.html");
        productsTitle.shouldBe(Condition.visible, Duration.ofSeconds(10));
        productsTitle.shouldHave(Condition.text("Products"));
        return this;
    }

    public void addProductToCart() {
        backPack.shouldBe(Condition.clickable, Duration.ofSeconds(10));
        backPack.click();
    }

    public void tapOnCart() {
        shoppingCart.shouldBe(Condition.clickable, Duration.ofSeconds(10));
        shoppingCart.click();
    }

}
