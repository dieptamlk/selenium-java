package browser;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Chrome {

    @Test
    void openWithDefaultMode() {
        new ChromeDriver();
    }
    
}
