package TestelkaJavaForBeginners.AccessModifiers1;

import org.junit.jupiter.api.Test;

public class Tests {
    @Test
    public void productPriceTest(){
        ProductPage productPage = new ProductPage();
        productPage.goTo("Some URL...");
        String price = productPage.productPrice;
        HomePage homePage = new HomePage();
    }

    @Test
    public void addToCartTest(){
        ProductPage productPage = new ProductPage();
        productPage.setAmount(3).addToCart().goToCart();
    }
}
