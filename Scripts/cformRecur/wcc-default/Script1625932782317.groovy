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

//CCREG
WebUI.setText(Path.DOKU_CARDNUMBER, nomor_credit_card, FailureHandling.OPTIONAL)
WebUI.selectOptionByValue(Path.DOKU_EXPIRYMONTH, bulan_expired_cc, false, FailureHandling.OPTIONAL)
WebUI.selectOptionByValue(Path.DOKU_EXPIRYYEAR, tahun_expired_cc, false, FailureHandling.OPTIONAL)
WebUI.setText(Path.DOKU_CVV2, cvv, FailureHandling.OPTIONAL)
WebUI.setText(Path.DOKU_CCNAME, cc_nama)
//CCFORM
WebUI.setText(Path.DOKU_CCADDRESS, cc_alamat)
WebUI.setText(Path.DOKU_CCCITY, cc_kota)
WebUI.selectOptionByValue(Path.DOKU_CCCOUNTRY, cc_negara, false, FailureHandling.OPTIONAL)
WebUI.setText(Path.DOKU_CCSTATE, cc_provinsi)
WebUI.setText(Path.DOKU_CCZIPCODE, cc_kodepos)
WebUI.setText(Path.DOKU_CCEMAIL, cc_email)
WebUI.setText(Path.DOKU_CCMOBILEPHONE, cc_no_hp)
WebUI.check(Path.DOKU_AUTHSTATUS)
WebUI.click(Path.DOKU_BUTTON_PROSES_REGISTRASI)
