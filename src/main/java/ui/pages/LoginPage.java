package ui.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private SelenideElement userNameInput = $("#user-name");
    private SelenideElement passwordNameInput = $("#password");
    private SelenideElement loginButton = $("#login-button");

    public LoginPage openLoginPage() {
        Selenide.open("https://www.saucedemo.com/");
        userNameInput.shouldBe(Condition.visible, Duration.ofSeconds(10));
        return this;
    }

    public void login(String userName, String password) {
        userNameInput.sendKeys(userName);
        passwordNameInput.sendKeys(password);
        loginButton.shouldBe(Condition.clickable);
        loginButton.click();
    }
}
