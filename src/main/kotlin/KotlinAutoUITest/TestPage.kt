package KotlinAutoUITest

import org.openqa.selenium.WebDriver
import org.openqa.selenium.support.PageFactory

abstract class TestPage(driver: WebDriver) {

    init {
        PageFactory.initElements(driver,this)
    }
}