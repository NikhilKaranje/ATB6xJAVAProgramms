package May.exe_20240528.abstraction;

public class TC1_ChromeBrowser extends BaseClass{


    @Override
    void openBrowser() {
        System.out.println("Starting Chrome Browser...");
    }

    @Override
    String closeBrowser() {
        System.out.println("Closing Chrome Browser!!! ");
        return "";
    }
}
