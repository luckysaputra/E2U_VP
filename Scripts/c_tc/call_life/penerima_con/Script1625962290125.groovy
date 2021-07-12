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
import com.kms.katalon.core.testobject.ConditionType

//=================================================1===============================================================
dia_adalah_1_con = dia_adalah_1
println(dia_adalah_1_con)
String dia_adalah_1_fin =""
if(WebUI.verifyMatch(dia_adalah_1_con, "Orang Tua", false, FailureHandling.OPTIONAL)==true){dia_adalah_1_fin = "/html/body/span/span/span[2]/ul/li[1]"}
else if(WebUI.verifyMatch(dia_adalah_1_con, "Anak", false, FailureHandling.OPTIONAL)==true){dia_adalah_1_fin = "/html/body/span/span/span[2]/ul/li[2]"}
else if(WebUI.verifyMatch(dia_adalah_1_con, "Saudara Kandung", false, FailureHandling.OPTIONAL)==true){dia_adalah_1_fin = "/html/body/span/span/span[2]/ul/li[3]"}
else if(WebUI.verifyMatch(dia_adalah_1_con, "Suami / Istri", false, FailureHandling.OPTIONAL)==true){dia_adalah_1_fin = "/html/body/span/span/span[2]/ul/li[4]"}
dia_adalah_1_con = dia_adalah_1_fin
println(dia_adalah_1_con)
//=================================================2===============================================================
dia_adalah_2_con = dia_adalah_2
println(dia_adalah_2_con)
String dia_adalah_2_fin =""
if(WebUI.verifyMatch(dia_adalah_2_con, "Orang Tua", false, FailureHandling.OPTIONAL)==true){dia_adalah_2_fin = "/html/body/span/span/span[2]/ul/li[1]"}
else if(WebUI.verifyMatch(dia_adalah_2_con, "Anak", false, FailureHandling.OPTIONAL)==true){dia_adalah_2_fin = "/html/body/span/span/span[2]/ul/li[2]"}
else if(WebUI.verifyMatch(dia_adalah_2_con, "Saudara Kandung", false, FailureHandling.OPTIONAL)==true){dia_adalah_2_fin = "/html/body/span/span/span[2]/ul/li[3]"}
else if(WebUI.verifyMatch(dia_adalah_2_con, "Suami / Istri", false, FailureHandling.OPTIONAL)==true){dia_adalah_2_fin = "/html/body/span/span/span[2]/ul/li[4]"}
dia_adalah_2_con = dia_adalah_2_fin
println(dia_adalah_2_con)
//=================================================3===============================================================
dia_adalah_3_con = dia_adalah_3
println(dia_adalah_3_con)
String dia_adalah_3_fin =""
if(WebUI.verifyMatch(dia_adalah_3_con, "Orang Tua", false, FailureHandling.OPTIONAL)==true){dia_adalah_3_fin = "/html/body/span/span/span[2]/ul/li[1]"}
else if(WebUI.verifyMatch(dia_adalah_3_con, "Anak", false, FailureHandling.OPTIONAL)==true){dia_adalah_3_fin = "/html/body/span/span/span[2]/ul/li[2]"}
else if(WebUI.verifyMatch(dia_adalah_3_con, "Saudara Kandung", false, FailureHandling.OPTIONAL)==true){dia_adalah_3_fin = "/html/body/span/span/span[2]/ul/li[3]"}
else if(WebUI.verifyMatch(dia_adalah_3_con, "Suami / Istri", false, FailureHandling.OPTIONAL)==true){dia_adalah_3_fin = "/html/body/span/span/span[2]/ul/li[4]"}
dia_adalah_3_con = dia_adalah_3_fin
println(dia_adalah_3_con)
//=================================================4===============================================================
dia_adalah_4_con = dia_adalah_4
println(dia_adalah_4_con)
String dia_adalah_4_fin =""
if(WebUI.verifyMatch(dia_adalah_4_con, "Orang Tua", false, FailureHandling.OPTIONAL)==true){dia_adalah_4_fin = "/html/body/span/span/span[2]/ul/li[1]"}
else if(WebUI.verifyMatch(dia_adalah_4_con, "Anak", false, FailureHandling.OPTIONAL)==true){dia_adalah_4_fin = "/html/body/span/span/span[2]/ul/li[2]"}
else if(WebUI.verifyMatch(dia_adalah_4_con, "Saudara Kandung", false, FailureHandling.OPTIONAL)==true){dia_adalah_4_fin = "/html/body/span/span/span[2]/ul/li[3]"}
else if(WebUI.verifyMatch(dia_adalah_4_con, "Suami / Istri", false, FailureHandling.OPTIONAL)==true){dia_adalah_4_fin = "/html/body/span/span/span[2]/ul/li[4]"}
dia_adalah_4_con = dia_adalah_4_fin
println(dia_adalah_4_con)
//=================================================5===============================================================
dia_adalah_5_con = dia_adalah_5
println(dia_adalah_5_con)
String dia_adalah_5_fin =""
if(WebUI.verifyMatch(dia_adalah_5_con, "Orang Tua", false, FailureHandling.OPTIONAL)==true){dia_adalah_5_fin = "/html/body/span/span/span[2]/ul/li[1]"}
else if(WebUI.verifyMatch(dia_adalah_5_con, "Anak", false, FailureHandling.OPTIONAL)==true){dia_adalah_5_fin = "/html/body/span/span/span[2]/ul/li[2]"}
else if(WebUI.verifyMatch(dia_adalah_5_con, "Saudara Kandung", false, FailureHandling.OPTIONAL)==true){dia_adalah_5_fin = "/html/body/span/span/span[2]/ul/li[3]"}
else if(WebUI.verifyMatch(dia_adalah_5_con, "Suami / Istri", false, FailureHandling.OPTIONAL)==true){dia_adalah_5_fin = "/html/body/span/span/span[2]/ul/li[4]"}
dia_adalah_5_con = dia_adalah_5_fin
println(dia_adalah_5_con)
//===============================================================================================
if (WebUI.callTestCase(findTestCase('c_tc/call_life/tc_penerima/penerima_life_1'), [('penerima_manfaat_1') : penerima_manfaat_1
	, ('dia_adalah_1') : dia_adalah_1_con, ('presentase_manfaat_1') : presentase_manfaat_1, ('profil_1') : profil_1], FailureHandling.OPTIONAL) == true)
{
	WebUI.click(Path.CLOSE_HELP, FailureHandling.OPTIONAL)
	WebUI.click(Path.BUTTON_LANJUT_PENERIMA_MANFAAT_LIFE)
}
//PENERIMA MANFAAT 2
else if (WebUI.callTestCase(findTestCase('c_tc/call_life/tc_penerima/penerima_life_2'), [('penerima_manfaat_2') : penerima_manfaat_2
	, ('dia_adalah_2') : dia_adalah_2_con, ('presentase_manfaat_2') : presentase_manfaat_2, ('profil_2') : profil_2], FailureHandling.OPTIONAL) == true)
{
	WebUI.click(Path.CLOSE_HELP, FailureHandling.OPTIONAL)
	WebUI.click(Path.BUTTON_LANJUT_PENERIMA_MANFAAT_LIFE)
}
//PENERIMA MANFAAT 3
else if (WebUI.callTestCase(findTestCase('c_tc/call_life/tc_penerima/penerima_life_3'), [('penerima_manfaat_3') : penerima_manfaat_3
	, ('dia_adalah_3') : dia_adalah_3_con, ('presentase_manfaat_3') : presentase_manfaat_3, ('profil_3') : profil_3], FailureHandling.OPTIONAL) == true)
{
	WebUI.click(Path.CLOSE_HELP, FailureHandling.OPTIONAL)
	WebUI.click(Path.BUTTON_LANJUT_PENERIMA_MANFAAT_LIFE)
}
//PENERIMA MANFAAT 4
else if (WebUI.callTestCase(findTestCase('c_tc/call_life/tc_penerima/penerima_life_4'), [('penerima_manfaat_4') : penerima_manfaat_4
	, ('dia_adalah_4') : dia_adalah_4_con, ('presentase_manfaat_4') : presentase_manfaat_4, ('profil_4') : profil_4], FailureHandling.OPTIONAL) == true)
{
	WebUI.click(Path.CLOSE_HELP, FailureHandling.OPTIONAL)
	WebUI.click(Path.BUTTON_LANJUT_PENERIMA_MANFAAT_LIFE)
}
//PENERIMA MANFAAT 5
else if (WebUI.callTestCase(findTestCase('c_tc/call_life/tc_penerima/penerima_life_5'), [('penerima_manfaat_5') : penerima_manfaat_5
	, ('dia_adalah_5') : dia_adalah_5_con, ('presentase_manfaat_5') : presentase_manfaat_5, ('profil_5') : profil_5], FailureHandling.OPTIONAL) == true)
{
	WebUI.click(Path.BUTTON_LANJUT_PENERIMA_MANFAAT_LIFE)
	WebUI.click(Path.CLOSE_HELP, FailureHandling.OPTIONAL)
}