package ui.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class CheckoutPage {

    private SelenideElement titleCheckout = $("[data-test='title']");

    private SelenideElement firstNameInput = $("[data-test='firstName']");

    private SelenideElement lastNameInput = $("[data-test='lastName']");

    private SelenideElement postalCodeInput = $("[data-test='postalCode']");

    private SelenideElement continueButton = $("[data-test='continue']");

    private SelenideElement finishButton = $("[data-test='finish']");

    private SelenideElement completeOrderMessage = $("[data-test='complete-header']");

    public CheckoutPage openCheckoutPage() {
        Selenide.open("https://www.saucedemo.com/checkout-step-one.html");
        titleCheckout.shouldBe(Condition.visible, Duration.ofSeconds(10));
        titleCheckout.shouldHave(Condition.text("Checkout: Your Information"));
        return this;
    }

    public void fillCheckoutInfo(String firstName, String lastName, String postalCode) {
        firstNameInput.sendKeys(firstName);
        lastNameInput.sendKeys(lastName);
        postalCodeInput.sendKeys(postalCode);
        continueButton.shouldBe(Condition.clickable, Duration.ofSeconds(10));
        continueButton.click();
    }

    public void tapOnFinishCheckout() {
        finishButton.shouldBe(Condition.clickable, Duration.ofSeconds(10));
        finishButton.click();
    }

    public void checkCompleteOrder() {
        completeOrderMessage.shouldBe(Condition.visible, Duration.ofSeconds(10));
        completeOrderMessage.shouldHave(Condition.text("Thank you for your order!"));
    }
}

