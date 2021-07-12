import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.nio.file.Path
import java.util.concurrent.ConcurrentHashMap.KeySetView

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
import option.ManageData as Path
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


WebUI.click(Path.BUTTON_PENERIIMA_MANFAAT_3_LIFE)
WebUI.click(Path.INPUT_NAMA_PENERIMA_MANFAAT_1_LIFE)
WebUI.setText(Path.INPUT_NAMA_PENERIMA_MANFAAT_1_LIFE, penerima_manfaat_3)
WebUI.click(Path.COMBOBOX_SIAPA_PENERIMA_MANFAAT_1_LIFE)
//WebUI.click(Path.SELECT_PENERIMA_MANFAAT_SAUDARA_KANDUNG_LIFE)
String diaadalah3 = dia_adalah_3
TestObject pilih_diaadalah3 = new TestObject("diaadalah3")
pilih_diaadalah3.addProperty("xpath", ConditionType.EQUALS, diaadalah3)
WebUI.click(pilih_diaadalah3)
WebUI.click(Path.CLOSE_HELP, FailureHandling.OPTIONAL)
WebUI.click(Path.INPUT_BESAR_PRESENTASE_MANFAAT_LIFE)
WebUI.setText(Path.INPUT_BESAR_PRESENTASE_MANFAAT_LIFE, presentase_manfaat_3)
WebUI.uploadFile(Path.UPLOAD_FOTO_PROFIL_PENERIMA_MANFAAT_LIFE, profil_3, FailureHandling.OPTIONAL)
WebUI.click(Path.BUTTON_TAMBAHKAN_PENERIMA_MANFAAT_LIFE)

WebUI.verifyElementClickable(Path.BUTTON_LANJUT_PENERIMA_MANFAAT_LIFE)