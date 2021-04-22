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

WebUI.click(findTestObject('FO_001/Page_ToolsQA/div_Forms'))

WebUI.click(findTestObject('Object Repository/FO_001/Page_ToolsQA/span_Practice Form'))

WebUI.setText(findTestObject('Object Repository/FO_001/Page_ToolsQA/input_Name_firstName'), 'jezreel')

WebUI.setText(findTestObject('Object Repository/FO_001/Page_ToolsQA/input_Name_lastName'), 'sanchez')

WebUI.setText(findTestObject('Object Repository/FO_001/Page_ToolsQA/input_Email_userEmail'), 'test@qa.com')

WebUI.click(findTestObject('Object Repository/FO_001/Page_ToolsQA/label_Other'))

WebUI.setText(findTestObject('Object Repository/FO_001/Page_ToolsQA/input_(10 Digits)_userNumber'), '1234567890')

WebUI.click(findTestObject('Object Repository/FO_001/Page_ToolsQA/input_Date of Birth_dateOfBirthInput'))

WebUI.selectOptionByValue(findTestObject('Object Repository/FO_001/Page_ToolsQA/select_190019011902190319041905190619071908_246ee1'), 
    '1985', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FO_001/Page_ToolsQA/select_JanuaryFebruaryMarchAprilMayJuneJuly_566629'), 
    '7', true)

WebUI.click(findTestObject('Object Repository/FO_001/Page_ToolsQA/div_12'))

WebUI.uploadFile(findTestObject('FO_001/Page_ToolsQA/input_Select picture_uploadPicture'), file)

WebUI.setText(findTestObject('Object Repository/FO_001/Page_ToolsQA/textarea_Current Address_currentAddress'), 'UAE')

WebUI.click(findTestObject('Object Repository/FO_001/Page_ToolsQA/label_Music'))

WebUI.click(findTestObject('Object Repository/FO_001/Page_ToolsQA/div_Select State'))

WebUI.click(findTestObject('Object Repository/FO_001/Page_ToolsQA/div_NCR'))

WebUI.click(findTestObject('Object Repository/FO_001/Page_ToolsQA/div_Select City'))

WebUI.click(findTestObject('Object Repository/FO_001/Page_ToolsQA/div_Delhi'))

WebUI.click(findTestObject('Object Repository/FO_001/Page_ToolsQA/button_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/FO_001/Page_ToolsQA/td_jezreel sanchez'), 'jezreel sanchez')

WebUI.verifyElementText(findTestObject('Object Repository/FO_001/Page_ToolsQA/td_testqa.com'), 'test@qa.com')

WebUI.verifyElementText(findTestObject('Object Repository/FO_001/Page_ToolsQA/td_Other'), 'Other')

WebUI.verifyElementText(findTestObject('Object Repository/FO_001/Page_ToolsQA/td_1234567890'), '1234567890')

WebUI.verifyElementText(findTestObject('Object Repository/FO_001/Page_ToolsQA/td_12 August,1985'), '12 August,1985')

WebUI.verifyElementText(findTestObject('Object Repository/FO_001/Page_ToolsQA/td_Music'), 'Music')

WebUI.verifyElementText(findTestObject('Object Repository/FO_001/Page_ToolsQA/td_sampleFile.jpeg'), 'sampleFile.jpeg')

WebUI.verifyElementText(findTestObject('Object Repository/FO_001/Page_ToolsQA/td_UAE'), 'UAE')

WebUI.verifyElementText(findTestObject('Object Repository/FO_001/Page_ToolsQA/td_NCR Delhi'), 'NCR Delhi')

WebUI.closeBrowser()

