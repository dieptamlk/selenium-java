package herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tc01 {
    /*
    1. Open browser
    2. Navigate to https://the-internet.herokuapp.com/login
    3. Fill in username with tomsmith
    4. Fill in the password with SuperSecretPassword!
    5. Click on Login button
    6. And the home page is appear
 */
    @Test
    void tc01(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");

        driver.findElement(By.id("username")).sendKeys("tomsmith");
/*        driver.findElement(By.cssSelector("#username")).sendKeys("tomsmith");
        driver.findElement(By.cssSelector("input#username")).sendKeys("tomsmith");
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");
        driver.findElement(By.xpath("//*[@id='username']")).sendKeys("tomsmith");

        driver.findElement(By.tagName("input")).sendKeys("tomsmith");
        driver.findElement(By.cssSelector("[type=text]")).sendKeys("tomsmith");
        driver.findElement(By.xpath("//*[@type='text']")).sendKeys("tomsmith");
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("tomsmith");

        driver.findElement(By.name("username")).sendKeys("tomsmith");
        driver.findElement(By.cssSelector("[name=username]")).sendKeys("tomsmith");
        driver.findElement(By.cssSelector("input[name=username]")).sendKeys("tomsmith");
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("tomsmith");
        driver.findElement(By.xpath("//*[@name='username']")).sendKeys("tomsmith");
*/

        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
/*      driver.findElement(By.cssSelector("#password")).sendKeys("SuperSecretPassword");
        driver.findElement(By.cssSelector("input#password")).sendKeys("SuperSecretPassword");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SuperSecretPassword");
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("SuperSecretPassword");

        driver.findElement(By.tagName("input")).sendKeys("SuperSecretPassword");
        driver.findElement(By.cssSelector("[type=password]")).sendKeys("SuperSecretPassword");
        driver.findElement(By.xpath("//*[@type='password']")).sendKeys("SuperSecretPassword");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("SuperSecretPassword");

        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword");
        driver.findElement(By.cssSelector("[name=password]")).sendKeys("SuperSecretPassword");
        driver.findElement(By.cssSelector("input[name=password]")).sendKeys("SuperSecretPassword");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("SuperSecretPassword");
        driver.findElement(By.xpath("//*[@name='password']")).sendKeys("SuperSecretPassword");
*/

        /*
         * Login button:
         * Tag Name: button
         * Attribute: class="radius" type="submit"
         * text:
         * Bo cac Attributes chung chung, khai quat (button bo type text) ==> Liet ke doi tuong de tim kiem
         */

/*        driver.findElement(By.tagName("button")).click();
        driver.findElement(By.className("radius")).click();
        driver.findElement(By.cssSelector(".radius")).click();*/
        driver.findElement(By.cssSelector("[type=submit]")).click();

        /*
         * Check login success
         */

        //Assert.assertEquals(driver.getCurrentUrl(),"https://the-internet.herokuapp.com/secure");
        //Assert.assertTrue(driver.findElement(By.id("flash-messages")).isDisplayed());

        driver.quit();

    }
}

