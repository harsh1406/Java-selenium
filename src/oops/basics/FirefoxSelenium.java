package oops.basics;

/**
 * Created by Harsh on 1/14/2015.
 */
public class FirefoxSelenium {
    //Instance Variable
    String searchResult;

    //Class variable
    static String browser = "Firefox";

    public static void main(final String[] args) {
        //local variable
        int temp =0;

        FirefoxSelenium firefoxSelenium1 = new FirefoxSelenium();
        FirefoxSelenium firefoxSelenium2 = new FirefoxSelenium();

        firefoxSelenium1.searchResult = "For instance firefox selenium1";
        firefoxSelenium2.searchResult = "For instance firefox selenium2";

        System.out.println("###############################");
        System.out.println("###############################");
        System.out.println("Access instance variable");
        System.out.println("First object state"+ firefoxSelenium1.searchResult);
        System.out.println("Second object state"+ firefoxSelenium2.searchResult);

        System.out.println("###############################");
        System.out.println("###############################");
        System.out.println("Access class variable");
        System.out.println(FirefoxSelenium.browser);
    }


}
