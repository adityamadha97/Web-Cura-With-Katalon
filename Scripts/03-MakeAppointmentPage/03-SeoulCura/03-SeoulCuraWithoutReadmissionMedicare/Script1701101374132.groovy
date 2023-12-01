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

WebUI.callTestCase(findTestCase('02-LoginPage/02-FormLogin/02-LoginSuccess'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('01-HomePage/01-MakeAppointment'))

WebUI.selectOptionByValue(findTestObject('03-MakeAppointmentPage/03-SelectFacility'), 'Seoul CURA Healthcare Center', false)

WebUI.click(findTestObject('03-MakeAppointmentPage/03-ProgramMedicare'))

WebUI.click(findTestObject('03-MakeAppointmentPage/03-ClickDate'))

WebUI.setText(findTestObject('03-MakeAppointmentPage/03-ClickDate'), '01/11/2023')

WebUI.setText(findTestObject('03-MakeAppointmentPage/03-Comment'), 'Test5')

WebUI.click(findTestObject('03-MakeAppointmentPage/03-ClickButtonBookAppointment'))

WebUI.verifyElementText(findTestObject('03-MakeAppointmentPage/03-VerifyAppointmentConfirmation'), 'Appointment Confirmation')

WebUI.verifyElementText(findTestObject('03-MakeAppointmentPage/03-VerifyFacility'), 'Seoul CURA Healthcare Center')

WebUI.verifyElementText(findTestObject('03-MakeAppointmentPage/03-VerifyRedmission'), 'No')

WebUI.verifyElementText(findTestObject('03-MakeAppointmentPage/03-VerifyHealthProgram'), 'Medicare')

