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

WebUI.navigateToUrl('https://demoqa.com/select-menu')

WebUI.click(findTestObject('Object Repository/WG_003/Page_ToolsQA/div_Select Option'))

WebUI.click(findTestObject('Object Repository/WG_003/Page_ToolsQA/div_Another root option'))

WebUI.click(findTestObject('Object Repository/WG_003/Page_ToolsQA/div_Select Title'))

WebUI.click(findTestObject('Object Repository/WG_003/Page_ToolsQA/div_Other'))

WebUI.selectOptionByValue(findTestObject('Object Repository/WG_003/Page_ToolsQA/select_RedBlueGreenYellowPurpleBlackWhiteVo_537a50'), 
    '7', true)

WebUI.click(findTestObject('Object Repository/WG_003/Page_ToolsQA/div_Select'))

WebUI.click(findTestObject('Object Repository/WG_003/Page_ToolsQA/div_Black'))

WebUI.click(findTestObject('Object Repository/WG_003/Page_ToolsQA/div_Blue'))

WebUI.verifyElementText(findTestObject('Object Repository/WG_003/Page_ToolsQA/div_Another root option_1'), 'Another root option')

WebUI.verifyElementText(findTestObject('Object Repository/WG_003/Page_ToolsQA/div_Other_1'), 'Other')

WebUI.verifyElementText(findTestObject('Object Repository/WG_003/Page_ToolsQA/div_Black_1'), 'Black')

WebUI.verifyElementText(findTestObject('Object Repository/WG_003/Page_ToolsQA/div_Blue_1'), 'Blue')

WebUI.closeBrowser()

