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

slider_biaya_bedah_con = slider_biaya_bedah
println(slider_biaya_bedah_con)
String slider_biaya_bedah_fin =""
if(WebUI.verifyMatch(slider_biaya_bedah_con, "Tidak Menggunakan Slider", false, FailureHandling.OPTIONAL)==true){slider_biaya_bedah_fin = "0"}
else if(WebUI.verifyMatch(slider_biaya_bedah_con, "1x Slide", false, FailureHandling.OPTIONAL)==true){slider_biaya_bedah_fin = "200"}
else if(WebUI.verifyMatch(slider_biaya_bedah_con, "2x Slide", false, FailureHandling.OPTIONAL)==true){slider_biaya_bedah_fin = "400"}
slider_biaya_bedah_con = slider_biaya_bedah_fin
println(slider_biaya_bedah_con)
//con
WebUI.scrollToElement(Path.SLIDER_PENGGANTIAN_BIAYA_BEDAH_SCRN2, 0)
String myStringc = slider_biaya_bedah_con;
int varc = Integer.parseInt(myStringc)
WebUI.dragAndDropByOffset(Path.SLIDER_PENGGANTIAN_BIAYA_BEDAH_SCRN2, varc, 0, FailureHandling.OPTIONAL)