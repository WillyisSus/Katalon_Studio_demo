import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner
import com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner
import com.kms.katalon.core.testng.keyword.internal.TestNGDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.testng.keyword.internal.TestNGDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\WB63F~1.LON\\AppData\\Local\\Temp\\Katalon\\Test Cases\\SignIn\\20250801_193735\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCaseRawScript(
'''import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
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

not_run: WebUI.openBrowser('')

not_run: WebUI.navigateToUrl('http://localhost:4200/#/')

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/SUT_SignIn/Page_Practice Software Testing - Toolshop -_8413b3/a_Sign in'))

not_run: WebUI.click(findTestObject('Object Repository/SUT_SignIn/Page_Practice Software Testing - Toolshop -_8413b3/a_Sign in'))

not_run: WebUI.setText(findTestObject('Object Repository/SUT_SignIn/Page_Practice Software Testing - Toolshop -_8413b3/input_Login_email'), 
    'customer@practicesoftwaretesting.com')

not_run: WebUI.setEncryptedText(findTestObject('Object Repository/SUT_SignIn/Page_Practice Software Testing - Toolshop -_8413b3/input_Login_password'), 
    'kocJCgtAsSuQQZB9ZQ2FIA==')

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/SUT_SignIn/Page_Practice Software Testing - Toolshop -_8413b3/input_Login_btnSubmit'))

not_run: WebUI.click(findTestObject('Object Repository/SUT_SignIn/Page_Practice Software Testing - Toolshop -_8413b3/input_Login_btnSubmit'))

not_run: WebUI.click(findTestObject('Object Repository/SUT_SignIn/Page_Practice Software Testing - Toolshop -_8413b3/i_Login_fa fa-eye'))

not_run: WebUI.click(findTestObject('Object Repository/SUT_SignIn/Page_Practice Software Testing - Toolshop -_8413b3/input_Login_password'))

not_run: WebUI.setEncryptedText(findTestObject('Object Repository/SUT_SignIn/Page_Practice Software Testing - Toolshop -_8413b3/input_Login_password'), 
    'WeXgXi4njyFD3RjAKOT0dQ==')

not_run: WebUI.click(findTestObject('Object Repository/SUT_SignIn/Page_Practice Software Testing - Toolshop -_8413b3/input_Login_btnSubmit'))

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/SUT_SignIn/Page_Practice Software Testing - Toolshop -_8413b3/h1_My account'))

WebUI.verifyElementText(findTestObject('Object Repository/SUT_SignIn/Page_Practice Software Testing - Toolshop -_8413b3/a_User Data not found'), 
    'Jane Doe')

WebUI.click(findTestObject('Object Repository/SUT_SignIn/Page_Practice Software Testing - Toolshop -_8413b3/a_User Data not found'))

WebUI.click(findTestObject('Object Repository/SUT_SignIn/Page_Practice Software Testing - Toolshop -_8413b3/a_Sign out'))

''', 'Test Cases/SignIn', new TestCaseBinding('Test Cases/SignIn',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
