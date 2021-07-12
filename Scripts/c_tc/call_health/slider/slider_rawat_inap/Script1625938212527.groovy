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

slider_rawat_inap_con = slider_rawat_inap
println(slider_rawat_inap_con)
String slider_rawat_inap_fin =""
if (WebUI.verifyMatch(slider_rawat_inap_con, "Tidak Menggunakan Slider", false, FailureHandling.OPTIONAL)==true){slider_rawat_inap_fin = "0"}
else if(WebUI.verifyMatch(slider_rawat_inap_con, "Plus 1x Slide / Plus 100.000", false, FailureHandling.OPTIONAL)==true){slider_rawat_inap_fin = "50"}
else if(WebUI.verifyMatch(slider_rawat_inap_con, "Plus 2x Slide / Plus 200,000", false, FailureHandling.OPTIONAL)==true){slider_rawat_inap_fin = "100"}
else if(WebUI.verifyMatch(slider_rawat_inap_con, "Plus 3x Slide / Plus 300,000", false, FailureHandling.OPTIONAL)==true){slider_rawat_inap_fin = "150"}
else if(WebUI.verifyMatch(slider_rawat_inap_con, "Plus 4x Slide / Plus 400,000", false, FailureHandling.OPTIONAL)==true){slider_rawat_inap_fin = "200"}
else if(WebUI.verifyMatch(slider_rawat_inap_con, "Plus 5x Slide / Plus 500,000", false, FailureHandling.OPTIONAL)==true){slider_rawat_inap_fin = "250"}
else if(WebUI.verifyMatch(slider_rawat_inap_con, "Plus 6x Slide / Plus 600,000", false, FailureHandling.OPTIONAL)==true){slider_rawat_inap_fin = "300"}
else if(WebUI.verifyMatch(slider_rawat_inap_con, "Plus 7x Slide / Plus 700,000", false, FailureHandling.OPTIONAL)==true){slider_rawat_inap_fin = "350"}
else if(WebUI.verifyMatch(slider_rawat_inap_con, "Plus 8x Slide / Plus 800,000", false, FailureHandling.OPTIONAL)==true){slider_rawat_inap_fin = "400"}
else if(WebUI.verifyMatch(slider_rawat_inap_con, "Plus 9x Slide / Plus 900,000", false, FailureHandling.OPTIONAL)==true){slider_rawat_inap_fin = "450"}

slider_rawat_inap_con = slider_rawat_inap_fin
println(slider_rawat_inap_con)
//con
WebUI.scrollToElement(Path.SLIDER_MANFAAT_SANTUNAN_RAWAT_INAP_SCRN2, 0)
String myStringb = slider_rawat_inap_con;
int varb = Integer.parseInt(myStringb)
WebUI.dragAndDropByOffset(Path.SLIDER_MANFAAT_SANTUNAN_RAWAT_INAP_SCRN2, varb, 0, FailureHandling.OPTIONAL)
println(varb)