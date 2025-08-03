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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword as WebUIAbstractKeyword

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:4200/#/')

WebUI.click(findTestObject('Object Repository/Page_Practice Software Testing - Toolshop -_8413b3/a_Sign in'))

WebUI.click(findTestObject('Object Repository/Page_Practice Software Testing - Toolshop -_8413b3/input_Login_email'))

WebUI.click(findTestObject('Object Repository/Page_Practice Software Testing - Toolshop -_8413b3/a_Register your account'))

WebUI.setText(findTestObject('Object Repository/Page_Practice Software Testing - Toolshop -_8413b3/input_First name_first_name'), 
    firstName)

WebUI.click(findTestObject('Page_Practice Software Testing - Toolshop -_8413b3/input_Last name_last_name'))

WebUI.setText(findTestObject('Object Repository/Page_Practice Software Testing - Toolshop -_8413b3/input_Last name_last_name'), 
    lastName)

WebUI.click(findTestObject('Page_Practice Software Testing - Toolshop -_8413b3/input_First name_first_name'))

WebUI.setText(findTestObject('Page_Practice Software Testing - Toolshop -_8413b3/input_Date of birth_dob'), dateOfBirth)

WebUI.setText(findTestObject('Object Repository/Page_Practice Software Testing - Toolshop -_8413b3/input_Address_address'), 
    address)

WebUI.setText(findTestObject('Object Repository/Page_Practice Software Testing - Toolshop -_8413b3/input_Postcode_postcode'), 
    postcode)

WebUI.setText(findTestObject('Object Repository/Page_Practice Software Testing - Toolshop -_8413b3/input_City_city'), city)

WebUI.setText(findTestObject('Object Repository/Page_Practice Software Testing - Toolshop -_8413b3/input_Country_state'), 
    state)

WebUI.selectOptionByValue(findTestObject('Page_Practice Software Testing - Toolshop -_8413b3/select_Select your country'), 
    country, true)

WebUI.setText(findTestObject('Page_Practice Software Testing - Toolshop -_8413b3/input_Login_email'), emailAddress)

WebUI.setText(findTestObject('Page_Practice Software Testing - Toolshop -_8413b3/input_Password_password'), password)

WebUI.click(findTestObject('Page_Practice Software Testing - Toolshop -_8413b3/button_Register'))

WebUI.click(findTestObject('Page_Practice Software Testing - Toolshop -_8413b3/button_Register'))

WebUI.setText(findTestObject('Page_Practice Software Testing - Toolshop -_8413b3/input_Phone_phone'), phone)

WebUI.click(findTestObject('Page_Practice Software Testing - Toolshop -_8413b3/button_Register'))

try {
	WebUI.verifyElementPresent(findTestObject('Page_Practice Software Testing - Toolshop -_8413b3/input_Login_btnSubmit'),
		10)
	
	WebUI.setText(findTestObject('Object Repository/Page_Practice Software Testing - Toolshop -_8413b3/input_Login_email'),
		emailAddress)

	WebUI.setText(findTestObject('Object Repository/Page_Practice Software Testing - Toolshop -_8413b3/input_Password_password'),
		password)

	WebUI.click(findTestObject('Object Repository/Page_Practice Software Testing - Toolshop -_8413b3/input_Login_btnSubmit'))

	WebUI.verifyElementPresent(findTestObject('Page_Practice Software Testing - Toolshop -_8413b3/a_User Data not found'),
		0, FailureHandling.CONTINUE_ON_FAILURE)

	WebUI.click(findTestObject('Page_Practice Software Testing - Toolshop -_8413b3/a_User Data not found'))

	WebUI.click(findTestObject('Page_Practice Software Testing - Toolshop -_8413b3/a_Sign out'))

	WebUI.setText(findTestObject('Page_Practice Software Testing - Toolshop -_8413b3/input_Login_email'), 'admin@practicesoftwaretesting.com')

	WebUI.setEncryptedText(findTestObject('Page_Practice Software Testing - Toolshop -_8413b3/input_Password_password'),
		'WeXgXi4njyFD3RjAKOT0dQ==')

	WebUI.click(findTestObject('Page_Practice Software Testing - Toolshop -_8413b3/input_Login_btnSubmit'))

	WebUI.click(findTestObject('Page_Practice Software Testing - Toolshop -_8413b3/a_John Doe'))

	WebUI.click(findTestObject('Object Repository/Page_Practice Software Testing - Toolshop -_8413b3/a_Users'))

	WebUI.verifyElementText(findTestObject('Page_Practice Software Testing - Toolshop -_8413b3/td_jpetersongmail.com'),
		emailAddress)

	WebUI.click(findTestObject('Page_Practice Software Testing - Toolshop -_8413b3/button_Delete'))

	WebUI.verifyElementPresent(findTestObject('Page_Practice Software Testing - Toolshop -_8413b3/div_User deleted'), 0)

	WebUI.click(findTestObject('Page_Practice Software Testing - Toolshop -_8413b3/a_John Doe'))

	WebUI.click(findTestObject('Page_Practice Software Testing - Toolshop -_8413b3/a_Sign out'))
}
finally { 
	WebUI.closeBrowser()
}



