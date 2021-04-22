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

WebUI.click(findTestObject('Object Repository/TA_004/Page_ToolsQA/div_Elements'))

WebUI.click(findTestObject('Object Repository/TA_004/Page_ToolsQA/li_Web Tables'))

WebUI.click(findTestObject('Object Repository/TA_004/Page_ToolsQA/svg'))

WebUI.click(findTestObject('Object Repository/TA_004/Page_ToolsQA/input_Last Name_lastName'))

WebUI.click(findTestObject('Object Repository/TA_004/Page_ToolsQA/div_Last Name_col-md-6 col-sm-6'))

WebUI.setText(findTestObject('Object Repository/TA_004/Page_ToolsQA/input_Last Name_lastName'), 'Smith')

WebUI.click(findTestObject('Object Repository/TA_004/Page_ToolsQA/div_Age_col-md-2 col-sm-12'))

WebUI.setText(findTestObject('Object Repository/TA_004/Page_ToolsQA/input_Age_age'), '30')

WebUI.setText(findTestObject('Object Repository/TA_004/Page_ToolsQA/input_Salary_salary'), '10000')

WebUI.click(findTestObject('Object Repository/TA_004/Page_ToolsQA/button_Submit'))

WebUI.verifyElementVisible(findTestObject('Object Repository/TA_004/Page_ToolsQA/div_Smith'))

WebUI.verifyElementVisible(findTestObject('Object Repository/TA_004/Page_ToolsQA/div_30'))

WebUI.verifyElementVisible(findTestObject('Object Repository/TA_004/Page_ToolsQA/div_10000'))

WebUI.closeBrowser()

