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

WebUI.navigateToUrl('https://demoqa.com/')

WebUI.click(findTestObject('Object Repository/TA_001/Page_ToolsQA/path'))

WebUI.click(findTestObject('Object Repository/TA_001/Page_ToolsQA/li_Text Box'))

WebUI.setText(findTestObject('Object Repository/TA_001/Page_ToolsQA/input_Full Name_userName'), 'jezreel sanchez')

WebUI.setText(findTestObject('Object Repository/TA_001/Page_ToolsQA/input_Email_userEmail'), 'test@qa.com')

WebUI.setText(findTestObject('Object Repository/TA_001/Page_ToolsQA/textarea_Current Address_currentAddress'), 'Place1')

WebUI.setText(findTestObject('Object Repository/TA_001/Page_ToolsQA/textarea_Permanent Address_permanentAddress'), 'Place1')

WebUI.click(findTestObject('Object Repository/TA_001/Page_ToolsQA/button_Submit'))

WebUI.verifyElementVisible(findTestObject('TA_001/Page_ToolsQA/p_Namejezreel sanchez'))

WebUI.verifyElementVisible(findTestObject('TA_001/Page_ToolsQA/p_Emailtestqa.com'))

WebUI.verifyElementVisible(findTestObject('TA_001/Page_ToolsQA/p_Current Address Place1'))

WebUI.verifyElementVisible(findTestObject('TA_001/Page_ToolsQA/p_Permananet Address Place1'))

WebUI.closeBrowser()

