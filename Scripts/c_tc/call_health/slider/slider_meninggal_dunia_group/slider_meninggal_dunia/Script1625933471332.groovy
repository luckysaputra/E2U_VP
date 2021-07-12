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
import option.ManageData as Path


WebUI.callTestCase(findTestCase('c_tc/call_health/slider/slider_meninggal_dunia_group/1_slider_meninggal_dunia_0-100'),[('slider_meninggal_dunia') : slider_meninggal_dunia], FailureHandling.OPTIONAL)
WebUI.callTestCase(findTestCase('c_tc/call_health/slider/slider_meninggal_dunia_group/2_slider_meninggal_dunia_110-200'),[('slider_meninggal_dunia') : slider_meninggal_dunia], FailureHandling.OPTIONAL)
WebUI.callTestCase(findTestCase('c_tc/call_health/slider/slider_meninggal_dunia_group/3_slider_meninggal_dunia_210-300'),[('slider_meninggal_dunia') : slider_meninggal_dunia], FailureHandling.OPTIONAL)
WebUI.callTestCase(findTestCase('c_tc/call_health/slider/slider_meninggal_dunia_group/4_slider_meninggal_dunia_310-400'),[('slider_meninggal_dunia') : slider_meninggal_dunia], FailureHandling.OPTIONAL)
WebUI.callTestCase(findTestCase('c_tc/call_health/slider/slider_meninggal_dunia_group/5_slider_meninggal_dunia_410-500'),[('slider_meninggal_dunia') : slider_meninggal_dunia], FailureHandling.OPTIONAL)



