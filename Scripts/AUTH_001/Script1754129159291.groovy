import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:4200/#/')

WebUI.click(findTestObject('Object Repository/Page_Practice Software Testing - Toolshop -_8413b3/a_Sign in'))

WebUI.click(findTestObject('Object Repository/Page_Practice Software Testing - Toolshop -_8413b3/div_LoginForm'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Practice Software Testing - Toolshop -_8413b3/h3_Login'), 
    'Login')

WebUI.setText(findTestObject('Object Repository/Page_Practice Software Testing - Toolshop -_8413b3/input_Login_email'), 
    email)

WebUI.setText(findTestObject('Object Repository/Page_Practice Software Testing - Toolshop -_8413b3/input_Login_password'), 
    password)

WebUI.click(findTestObject('Object Repository/Page_Practice Software Testing - Toolshop -_8413b3/input_Login_btnSubmit'))

if (role == 'admin') {
    WebUI.verifyElementPresent(findTestObject('Page_Practice Software Testing - Toolshop -_8413b3/a_John Doe'), 0)

    WebUI.verifyElementText(findTestObject('Page_Practice Software Testing - Toolshop -_8413b3/a_John Doe'), (firstName + 
        ' ') + lastName, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Page_Practice Software Testing - Toolshop -_8413b3/a_John Doe'))

    WebUI.click(findTestObject('Page_Practice Software Testing - Toolshop - v5.0 with bugs/a_Sign out'))
} else {
    WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Practice Software Testing - Toolshop -_8413b3/a_User Data not found'), 
        0)

    WebUI.verifyElementText(findTestObject('Page_Practice Software Testing - Toolshop -_8413b3/a_User Data not found'), 
        (firstName + ' ') + lastName, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Object Repository/Page_Practice Software Testing - Toolshop -_8413b3/a_User Data not found'))

    WebUI.click(findTestObject('Object Repository/Page_Practice Software Testing - Toolshop -_8413b3/a_Sign out'))
}

WebUI.verifyElementText(findTestObject('Object Repository/Page_Practice Software Testing - Toolshop -_8413b3/h3_Login'), 
    'Login')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Practice Software Testing - Toolshop -_8413b3/a_Sign in'), 
    'Sign in')

WebUI.closeBrowser()

