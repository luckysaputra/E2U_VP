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

WebUI.click(Path.INPUT_NO_HP)
WebUI.setText(Path.INPUT_NO_HP, no_hp)
WebUI.click(Path.INPUT_EMAIL)
WebUI.setText(Path.INPUT_EMAIL, email)
WebUI.click(Path.INPUT_ALAMAT)
WebUI.setText(Path.INPUT_ALAMAT, alamat)
WebUI.click(Path.COMBOBOX_PROVINSI)
WebUI.setText(Path.INPUT_SEARCH_PROVINSI, provinsi)
WebUI.sendKeys(Path.INPUT_SEARCH_PROVINSI, Keys.chord(Keys.ENTER))
WebUI.click(Path.CLOSE_HELP, FailureHandling.OPTIONAL)
WebUI.click(Path.INPUT_KODEPOS)
WebUI.setText(Path.INPUT_KODEPOS, kodepos)
WebUI.click(Path.BUTTON_LANJUT_DATA_DIRI)