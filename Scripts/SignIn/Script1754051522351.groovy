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

WebUI.verifyElementVisible(findTestObject('Object Repository/SUT_SignIn/Page_Practice Software Testing - Toolshop -_8413b3/a_Sign in'))

WebUI.click(findTestObject('Object Repository/SUT_SignIn/Page_Practice Software Testing - Toolshop -_8413b3/a_Sign in'))

WebUI.setText(findTestObject('Object Repository/SUT_SignIn/Page_Practice Software Testing - Toolshop -_8413b3/input_Login_email'), 
    email)

WebUI.setText(findTestObject('Object Repository/SUT_SignIn/Page_Practice Software Testing - Toolshop -_8413b3/input_Login_password'), 
    password)

WebUI.verifyElementVisible(findTestObject('Object Repository/SUT_SignIn/Page_Practice Software Testing - Toolshop -_8413b3/input_Login_btnSubmit'))

WebUI.click(findTestObject('Object Repository/SUT_SignIn/Page_Practice Software Testing - Toolshop -_8413b3/input_Login_btnSubmit'))

WebUI.verifyElementNotPresent(findTestObject('SUT_SignIn/Page_Practice Software Testing - Toolshop -_8413b3/div_Invalid email or password_1'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/SUT_SignIn/Page_Practice Software Testing - Toolshop -_8413b3/h1_My account'))

WebUI.verifyElementText(findTestObject('Object Repository/SUT_SignIn/Page_Practice Software Testing - Toolshop -_8413b3/a_User Data not found'), 
    (firstName + ' ') + lastName)

WebUI.click(findTestObject('SUT_SignIn/Page_Practice Software Testing - Toolshop -_8413b3/a_User Data not found'))

WebUI.click(findTestObject('SUT_SignIn/Page_Practice Software Testing - Toolshop -_8413b3/a_Sign out'))

WebUI.verifyElementVisible(findTestObject('SUT_SignIn/Page_Practice Software Testing - Toolshop -_8413b3/a_Sign in'))

