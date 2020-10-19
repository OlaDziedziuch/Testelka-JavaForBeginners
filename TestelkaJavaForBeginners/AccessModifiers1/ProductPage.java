package TestelkaJavaForBeginners.AccessModifiers1;

public class ProductPage extends BasePage {
    String productName;
    String productPrice;

    protected ProductPage addToCart(){
        System.out.println("Product is added to cart.");
        return this;
    }

    protected ProductPage setAmount(int amount){
        System.out.println("Chosen" + amount);
        return this;
    }

    protected void goToCart(){
        System.out.println("Go back to cart");
    }
}
