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

WebUI.click(findTestObject('Object Repository/TA_006/Page_ToolsQA/path'))

WebUI.click(findTestObject('Object Repository/TA_006/Page_ToolsQA/li_Links'))

WebUI.click(findTestObject('Object Repository/TA_006/Page_ToolsQA/a_Created'))

WebUI.verifyElementText(findTestObject('Object Repository/TA_006/Page_ToolsQA/b_201'), '201')

WebUI.click(findTestObject('Object Repository/TA_006/Page_ToolsQA/a_No Content'))

WebUI.verifyElementText(findTestObject('Object Repository/TA_006/Page_ToolsQA/b_204'), '204')

WebUI.click(findTestObject('Object Repository/TA_006/Page_ToolsQA/a_Moved'))

WebUI.verifyElementText(findTestObject('Object Repository/TA_006/Page_ToolsQA/b_301'), '301')

WebUI.click(findTestObject('Object Repository/TA_006/Page_ToolsQA/a_Bad Request'))

WebUI.verifyElementText(findTestObject('Object Repository/TA_006/Page_ToolsQA/b_400'), '400')

WebUI.click(findTestObject('Object Repository/TA_006/Page_ToolsQA/a_Unauthorized'))

WebUI.verifyElementText(findTestObject('Object Repository/TA_006/Page_ToolsQA/b_401'), '401')

WebUI.click(findTestObject('Object Repository/TA_006/Page_ToolsQA/a_Forbidden'))

WebUI.verifyElementText(findTestObject('Object Repository/TA_006/Page_ToolsQA/b_403'), '403')

WebUI.click(findTestObject('Object Repository/TA_006/Page_ToolsQA/a_Not Found'))

WebUI.verifyElementText(findTestObject('TA_006/Page_ToolsQA/b_404'), '404')

WebUI.closeBrowser()

