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

WebUI.navigateToUrl('https://www.amazon.com/')

WebUI.click(findTestObject('Object Repository/Page_Amazon.com. Spend less. Smile more/span_Account  Lists'))

WebUI.setText(findTestObject('Object Repository/Page_Amazon Sign-In/input_Email or mobile phone number_email'), 'rmeswar003@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Amazon Sign-In/input_Enter your email or mobile phone numb_fc7402'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Amazon Sign-In/input_Forgot your password_password'), '9JFooAukEDvTa89YHkAC3w==')

WebUI.click(findTestObject('Object Repository/Page_Amazon Sign-In/input_Enter your password_signInSubmit'))

WebUI.click(findTestObject('Object Repository/Page_Amazon.com. Spend less. Smile more/span_Cart'))

WebUI.click(findTestObject('Object Repository/Amazon_Pages/Amazon_OrderProcess/Amazon_cart_ProceedtoCheckout/Page_Amazon.com Shopping Cart/input_This order contains a gift_proceedToR_057b5e'))

WebUI.click(findTestObject('Object Repository/Page_Select a delivery address/a_Edit address'))

WebUI.setText(findTestObject('Object Repository/Page_Select a delivery address/input_Full name (First and Last name)_addre_efd85e'), 
    GlobalVariable.Fullname)

WebUI.setText(findTestObject('Object Repository/Page_Select a delivery address/input_City_address-ui-widgets-enterAddressCity'), 
    GlobalVariable.City)

WebUI.setText(findTestObject('Object Repository/Page_Select a delivery address/input_Phone number_address-ui-widgets-enter_5bad04'), 
    GlobalVariable.Mobilenumber)

WebUI.click(findTestObject('Object Repository/Page_Select a delivery address/input_Use as my default address_a-button-input'))

//WebUI.click(findTestObject('Object Repository/Page_Select a delivery address/input_Maries, 94, karivalam, SANKARANKOIL, _9b4776'))

WebUI.closeBrowser()

