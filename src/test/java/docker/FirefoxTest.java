package docker;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class FirefoxTest {

    @Test
    public void test2() throws MalformedURLException {
        System.out.println(System.currentTimeMillis());
        System.out.println("Inside Firefox Browser.....");
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setBrowserName("firefox");
        URL url = new URL("http://localhost:4444/wd/hub");
        RemoteWebDriver rwd = new RemoteWebDriver(url, dc);
        rwd.get("https://www.gov.uk/check-uk-visa/y");
        String title = rwd.getTitle();
        System.out.println("Page Title: "+title);
        rwd.quit();
    }
}
