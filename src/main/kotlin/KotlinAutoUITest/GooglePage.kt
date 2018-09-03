package KotlinAutoUITest

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.testng.Assert

class GooglePage(private val driver: WebDriver) : TestPage(driver) {

    @FindBy(name = "q")
    private val searchFiled: WebElement? = null

    @FindBy(name = "btnK")
    private val searchInGoogleBtn :WebElement? = null

    @FindBy(name = "btnI")
    private val iLucky :WebElement? = null

    fun clickOnField(){
        if (searchFiled != null) {
            searchFiled.click()
        }else{
            println("filed is not exist")
        }
    }

    fun setTextInField(test:String){
        if (searchFiled != null) {
            searchFiled.sendKeys(test)
        }else{
            println("filed is not exist")
        }
    }

    fun clickOnSearchInGoogleBtn(){
        if (searchInGoogleBtn != null) {
            searchInGoogleBtn.click()
        }else{
            println("Button not exist")
        }
    }

    fun clickOnILucky(): DoodlePage {
        if (iLucky != null) {
            iLucky.click()
        }else{
            println("button not exist")
            Assert.fail()
        }
        return DoodlePage(driver)
    }



}