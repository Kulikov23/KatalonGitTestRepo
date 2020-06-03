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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('https://opensource-demo.orangehrmlive.com/')

WebUI.maximizeWindow()

//Set login
WebUI.setText(findTestObject('Page_OrangeHRM/LoginInput'), 'Admin')

//Set pass
WebUI.setText(findTestObject('Page_OrangeHRM/PasswordInput'), 'admin123')

//Click button
WebUI.click(findTestObject('Page_OrangeHRM/LoginBtn'))

WebUI.waitForPageLoad(0)

//Check that employee icon presented
WebUI.click(findTestObject('Page_OrangeHRM/LeaveListIcon'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Page_OrangeHRM/LeaveListH1'), 0)

//If we need to skip step
//not_run:WebUI.verifyElementPresent(findTestObject('null'), 0)
//Close browser
WebUI.closeBrowser()

