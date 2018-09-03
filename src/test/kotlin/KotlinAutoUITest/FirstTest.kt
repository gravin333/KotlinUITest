package KotlinAutoUITest

import org.testng.annotations.Test

class FirstTest : TestFrame() {

    val url:String = "https://google.com"

    @Test
    fun test(){
        driver.get(url)
        val googlePage = GooglePage(driver)
        val doodlePage = googlePage.clickOnILucky()
        doodlePage.doodleBody?.getAttribute("id")
    }

}