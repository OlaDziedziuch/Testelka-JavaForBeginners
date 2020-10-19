package TestelkaJavaForBeginners.AccessModifiers1;

public class BasePage {
    String title;
    String url;
    String userName;

    void goTo(String pageUrl){
        System.out.println("Go to page: ");
    }

    void searchProduct(String product){
        System.out.println("Searching the product"+product);
    }
}
