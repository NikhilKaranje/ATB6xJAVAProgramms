package May.exe_20240528.abstraction;

public class TC2_FirefoxBrowser extends BaseClass{

    @Override
    String openBrowser() {
        System.out.println("Starting Firefox Browser...");
        return null;
    }

    @Override
    String closeBrowser() {
        System.out.println("Closing Firefox Browser!!!");
        return "";
    }
}
