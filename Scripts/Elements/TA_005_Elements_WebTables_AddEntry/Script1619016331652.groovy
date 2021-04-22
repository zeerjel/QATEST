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

WebUI.click(findTestObject('Object Repository/TA_005/Page_ToolsQA/svg'))

WebUI.click(findTestObject('Object Repository/TA_005/Page_ToolsQA/li_Web Tables'))

WebUI.click(findTestObject('Object Repository/TA_005/Page_ToolsQA/button_Add'))

WebUI.setText(findTestObject('Object Repository/TA_005/Page_ToolsQA/input_First Name_firstName'), 'person')

WebUI.setText(findTestObject('Object Repository/TA_005/Page_ToolsQA/input_Last Name_lastName'), 'one')

WebUI.setText(findTestObject('Object Repository/TA_005/Page_ToolsQA/input_Email_userEmail'), 'one@qa.com')

WebUI.setText(findTestObject('Object Repository/TA_005/Page_ToolsQA/input_Age_age'), '10')

WebUI.setText(findTestObject('Object Repository/TA_005/Page_ToolsQA/input_Salary_salary'), '1000')

WebUI.setText(findTestObject('Object Repository/TA_005/Page_ToolsQA/input_Department_department'), 'qa')

WebUI.click(findTestObject('Object Repository/TA_005/Page_ToolsQA/button_Submit'))

WebUI.click(findTestObject('Object Repository/TA_005/Page_ToolsQA/button_Add'))

WebUI.setText(findTestObject('Object Repository/TA_005/Page_ToolsQA/input_First Name_firstName'), 'person')

WebUI.setText(findTestObject('Object Repository/TA_005/Page_ToolsQA/input_Last Name_lastName'), 'two')

WebUI.setText(findTestObject('Object Repository/TA_005/Page_ToolsQA/input_Email_userEmail'), 'one@qa.com')

WebUI.doubleClick(findTestObject('Object Repository/TA_005/Page_ToolsQA/input_Email_userEmail'))

WebUI.setText(findTestObject('Object Repository/TA_005/Page_ToolsQA/input_Email_userEmail'), 'two@qa.com')

WebUI.setText(findTestObject('Object Repository/TA_005/Page_ToolsQA/input_Age_age'), '20')

WebUI.setText(findTestObject('Object Repository/TA_005/Page_ToolsQA/input_Salary_salary'), '2000')

WebUI.setText(findTestObject('Object Repository/TA_005/Page_ToolsQA/input_Department_department'), 'qa')

WebUI.click(findTestObject('Object Repository/TA_005/Page_ToolsQA/button_Submit'))

WebUI.click(findTestObject('Object Repository/TA_005/Page_ToolsQA/button_Add'))

WebUI.setText(findTestObject('Object Repository/TA_005/Page_ToolsQA/input_First Name_firstName'), 'person')

WebUI.setText(findTestObject('Object Repository/TA_005/Page_ToolsQA/input_Last Name_lastName'), 'three')

WebUI.setText(findTestObject('Object Repository/TA_005/Page_ToolsQA/input_Email_userEmail'), 'three@qa.com')

WebUI.setText(findTestObject('Object Repository/TA_005/Page_ToolsQA/input_Age_age'), '30')

WebUI.setText(findTestObject('Object Repository/TA_005/Page_ToolsQA/input_Salary_salary'), '3000')

WebUI.setText(findTestObject('Object Repository/TA_005/Page_ToolsQA/input_Department_department'), 'qa')

WebUI.click(findTestObject('Object Repository/TA_005/Page_ToolsQA/button_Submit'))

WebUI.click(findTestObject('Object Repository/TA_005/Page_ToolsQA/button_Add'))

WebUI.setText(findTestObject('Object Repository/TA_005/Page_ToolsQA/input_First Name_firstName'), 'person')

WebUI.setText(findTestObject('Object Repository/TA_005/Page_ToolsQA/input_Last Name_lastName'), 'four')

WebUI.setText(findTestObject('Object Repository/TA_005/Page_ToolsQA/input_Email_userEmail'), 'one@qa.com')

WebUI.doubleClick(findTestObject('Object Repository/TA_005/Page_ToolsQA/input_Email_userEmail'))

WebUI.setText(findTestObject('Object Repository/TA_005/Page_ToolsQA/input_Email_userEmail'), 'four@qa.com')

WebUI.setText(findTestObject('Object Repository/TA_005/Page_ToolsQA/input_Age_age'), '40')

WebUI.setText(findTestObject('Object Repository/TA_005/Page_ToolsQA/input_Salary_salary'), '4000')

WebUI.setText(findTestObject('Object Repository/TA_005/Page_ToolsQA/input_Department_department'), 'qa')

WebUI.click(findTestObject('Object Repository/TA_005/Page_ToolsQA/button_Submit'))

WebUI.closeBrowser()

