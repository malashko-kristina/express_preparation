package ui;

import org.junit.Test;
import ui.data.UserData;
import ui.pages.CheckoutPage;
import ui.pages.LoginPage;
import ui.pages.ProductsPage;
import ui.pages.YourCartPage;

public class PurchaseProductTest {
    @Test
    public void userShouldBeAbleToPurchaseAProduct() {
        LoginPage loginPage = new LoginPage();
        loginPage.openLoginPage().login(UserData.USERNAME, UserData.PASSWORD);

        ProductsPage productsPage = new ProductsPage();
        productsPage.openProductsPage();
        productsPage.addProductToCart();
        productsPage.tapOnCart();

        YourCartPage yourCartPage = new YourCartPage();
        yourCartPage.openCartPage().checkAddedProductsInCart();
        yourCartPage.goToCheckout();

        CheckoutPage checkoutPage = new CheckoutPage();
        checkoutPage.fillCheckoutInfo("Agata", "Kristi", "1013ZX");
        checkoutPage.tapOnFinishCheckout();
        checkoutPage.checkCompleteOrder();
    }
}
