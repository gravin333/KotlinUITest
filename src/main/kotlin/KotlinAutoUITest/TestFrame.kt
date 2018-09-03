package KotlinAutoUITest

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.testng.*
import org.testng.annotations.AfterClass
import org.testng.annotations.BeforeClass
import org.testng.annotations.Test
import java.io.File

open abstract class TestFrame {

    lateinit var driver: WebDriver

    @BeforeClass
    fun init(){
        System.setProperty("webdriver.chrome.driver", "src/main/kotlin/resources/drivers/chromedriver.exe");
        driver = ChromeDriver()
        driver.manage().window().fullscreen()
    }

    @AfterClass
    fun cleanup(){
        driver.quit()
    }

}