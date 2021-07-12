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

slider_penyakit_kritis_con = slider_penyakit_kritis
println(slider_penyakit_kritis_con)
String slider_penyakit_kritis_fin =""
if(WebUI.verifyMatch(slider_penyakit_kritis_con, "Tidak Menggunakan Slider", false, FailureHandling.OPTIONAL)==true){slider_penyakit_kritis_fin = "0"}
else if(WebUI.verifyMatch(slider_penyakit_kritis_con, "1x Slide", false, FailureHandling.OPTIONAL)==true){slider_penyakit_kritis_fin = "70"}
else if(WebUI.verifyMatch(slider_penyakit_kritis_con, "2x Slide", false, FailureHandling.OPTIONAL)==true){slider_penyakit_kritis_fin = "200"}
else if(WebUI.verifyMatch(slider_penyakit_kritis_con, "3x Slide", false, FailureHandling.OPTIONAL)==true){slider_penyakit_kritis_fin = "300"}
else if(WebUI.verifyMatch(slider_penyakit_kritis_con, "Max", false, FailureHandling.OPTIONAL)==true){slider_penyakit_kritis_fin = "500"}
slider_penyakit_kritis_con = slider_penyakit_kritis_fin
println(slider_penyakit_kritis_con)
//con
WebUI.scrollToElement(Path.SLIDER_SANTUNAN_PENYAKIT_KRITIS_SCRN2, 0)
String myStringd = slider_penyakit_kritis_con;
int vard = Integer.parseInt(myStringd)
WebUI.dragAndDropByOffset(Path.SLIDER_SANTUNAN_PENYAKIT_KRITIS_SCRN2, vard, 0, FailureHandling.OPTIONAL)