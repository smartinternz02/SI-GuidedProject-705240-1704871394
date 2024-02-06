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

/*WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.amazon.com/')

WebUI.click(findTestObject('Object Repository/Amazon_Pages/Amazon_ValidateSearchItem_OR/Amazon_Mispelledword_SuggestionCheck/Page_Amazon.com. Spend less. Smile more/span_Account  Lists'))

WebUI.setText(findTestObject('Object Repository/Amazon_Pages/Amazon_ValidateSearchItem_OR/Amazon_Mispelledword_SuggestionCheck/Page_Amazon Sign-In/input_Email or mobile phone number_email'), 
    'rmeswar003@gmail.com')

WebUI.click(findTestObject('Object Repository/Amazon_Pages/Amazon_ValidateSearchItem_OR/Amazon_Mispelledword_SuggestionCheck/Page_Amazon Sign-In/input_Enter your email or mobile phone numb_fc7402'))

WebUI.setEncryptedText(findTestObject('Object Repository/Amazon_Pages/Amazon_ValidateSearchItem_OR/Amazon_Mispelledword_SuggestionCheck/Page_Amazon Sign-In/input_Forgot your password_password'), 
    '9JFooAukEDskz1iD1pcpuw==')

WebUI.click(findTestObject('Object Repository/Amazon_Pages/Amazon_ValidateSearchItem_OR/Amazon_Mispelledword_SuggestionCheck/Page_Amazon Sign-In/input_Enter your password_signInSubmit'))
*/
WebUI.setText(findTestObject('Object Repository/Amazon_Pages/Amazon_ValidateSearchItem_OR/Amazon_Mispelledword_SuggestionCheck/Page_Amazon.com. Spend less. Smile more/input_Search Amazon_field-keywords'), 
    'mobles under')

WebUI.click(findTestObject('Object Repository/Amazon_Pages/Amazon_ValidateSearchItem_OR/Amazon_Mispelledword_SuggestionCheck/Page_Amazon.com. Spend less. Smile more/span_mobiles under 15000'))

WebUI.click(findTestObject('Object Repository/Amazon_Pages/Amazon_ValidateSearchItem_OR/Amazon_Mispelledword_SuggestionCheck/Page_Amazon.com  mobiles under 15000/span_TCL 40XL 2023 Unlocked Cell Phone 4GB _f74f69'))

//WebUI.closeBrowser()

