
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class StartDriverSession {

    @Test
    public void firstTest() throws MalformedURLException, InterruptedException {
        /*UiAutomator2Options options = new UiAutomator2Options().
                setDeviceName("Pixel Tablet API TiramisuPrivacySandbox").
                setAutomationName("UiAutomator2").
                setUdid("emulator-5554").
                setAppPackage("com.google.android.calculator").
                setAppActivity("com.android.calculator2.Calculator").
                setNoReset(true);*/

        UiAutomator2Options options = new UiAutomator2Options().
                setDeviceName("Andres Veloso telefono").
                setAutomationName("UiAutomator2").
                setUdid("20f9a248af1f").
                setAppPackage("com.matteljv.uno").
                setAppActivity("com.netease.uno.CustomOverrideActivity").
                setNoReset(true);

        URL url = new URL("http://0.0.0.0:4723");
        AndroidDriver driver = new AndroidDriver(url, options);

        /*driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"More options\"]")).click();
        Thread.sleep(500);
        driver.findElement(AppiumBy.xpath("(//android.widget.LinearLayout[@resource-id=\"com.google.android.calculator:id/content\"])[1]")).click();*/

    }

}
