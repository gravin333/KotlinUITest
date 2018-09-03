package KotlinAutoUITest

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.testng.Assert

class DoodlePage(driver:WebDriver) :TestPage(driver) {
    @FindBy(id = "homepage")
    val doodleBody:WebElement? = null

    init {
        pageIsExist()
    }

    private fun pageIsExist(){
        if (doodleBody != null) {
            doodleBody.isDisplayed
        }else{
            println("page is ont correct")
            Assert.fail()
        }
    }
}