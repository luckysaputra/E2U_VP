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
import com.kms.katalon.core.testobject.ConditionType
import option.ManageData as Path

personalisasicon = personalisasi_kado
println(personalisasicon)
String personalisasifin =""
if(WebUI.verifyMatch(personalisasicon, "Tidak Pilih Tema", false, FailureHandling.OPTIONAL)==true)
{
	personalisasifin = "/html/body/app-root/div/app-product-kado-registration/div/div/section/div/div[2]/div/div/div[3]/h2/div/label"
	println(personalisasifin)
}
else if(WebUI.verifyMatch(personalisasicon, "Pilih Tema (Lanjut Isi Kolom : pilih_tema)", false, FailureHandling.OPTIONAL)==true)
{
	personalisasifin = ""
	println(personalisasifin)
}
personalisasicon = personalisasifin
println(personalisasicon)
//===============================================================================================
WebUI.scrollToElement(Path.TOGGLE_BUTTON_PERSONALISASI_KADO, 0)
String personalisasi = personalisasicon
TestObject pilih_personalisasi = new TestObject("personalisasi")
pilih_personalisasi.addProperty("xpath", ConditionType.EQUALS, personalisasi)
//===============================================================================================

//===========================================================START==============================================================
pilih_tema_con = pilih_tema
println(pilih_tema_con)
String pilih_tema_fin =""
if(WebUI.verifyMatch(pilih_tema_con, "Astra Life", false, FailureHandling.OPTIONAL)==true){pilih_tema_fin = "/html/body/app-root/div/app-product-kado-registration/div/div/section/div/div[2]/div/div/div[3]/div[2]/div[1]/div[1]/div/div[1]"}
else if(WebUI.verifyMatch(pilih_tema_con, "Kemakmuran", false, FailureHandling.OPTIONAL)==true){pilih_tema_fin = "/html/body/app-root/div/app-product-kado-registration/div/div/section/div/div[2]/div/div/div[3]/div[2]/div[1]/div[1]/div/div[2]"}
else if(WebUI.verifyMatch(pilih_tema_con, "Kebahagiaan", false, FailureHandling.OPTIONAL)==true){pilih_tema_fin = "/html/body/app-root/div/app-product-kado-registration/div/div/section/div/div[2]/div/div/div[3]/div[2]/div[1]/div[1]/div/div[3]"}
else if(WebUI.verifyMatch(pilih_tema_con, "Pengampunan", false, FailureHandling.OPTIONAL)==true){pilih_tema_fin = "/html/body/app-root/div/app-product-kado-registration/div/div/section/div/div[2]/div/div/div[3]/div[2]/div[1]/div[1]/div/div[4]"}
else if(WebUI.verifyMatch(pilih_tema_con, "Apresiasi", false, FailureHandling.OPTIONAL)==true){pilih_tema_fin = "/html/body/app-root/div/app-product-kado-registration/div/div/section/div/div[2]/div/div/div[3]/div[2]/div[1]/div[1]/div/div[5]"}
else if(WebUI.verifyMatch(pilih_tema_con, "Selebrasi", false, FailureHandling.OPTIONAL)==true){pilih_tema_fin = "/html/body/app-root/div/app-product-kado-registration/div/div/section/div/div[2]/div/div/div[3]/div[2]/div[1]/div[1]/div/div[6]"}
else if(WebUI.verifyMatch(pilih_tema_con, "Persahabatan", false, FailureHandling.OPTIONAL)==true){pilih_tema_fin = "/html/body/app-root/div/app-product-kado-registration/div/div/section/div/div[2]/div/div/div[3]/div[2]/div[1]/div[1]/div/div[7]"}
else if(WebUI.verifyMatch(pilih_tema_con, "Kegembiraan", false, FailureHandling.OPTIONAL)==true){pilih_tema_fin = "/html/body/app-root/div/app-product-kado-registration/div/div/section/div/div[2]/div/div/div[3]/div[2]/div[1]/div[1]/div/div[8]"}
else if(WebUI.verifyMatch(pilih_tema_con, "Cinta", false, FailureHandling.OPTIONAL)==true){pilih_tema_fin = "/html/body/app-root/div/app-product-kado-registration/div/div/section/div/div[2]/div/div/div[3]/div[2]/div[1]/div[1]/div/div[9]"}
pilih_tema_con = pilih_tema_fin
println(pilih_tema_con)
//===============================================================================================

//pilih_tema========================================================================================================
WebUI.scrollToElement(Path.PILIH_TEMA_KADO, 0)
String type = pilih_tema_con
TestObject pilih_type = new TestObject("type")
pilih_type.addProperty("xpath", ConditionType.EQUALS, type)
if (WebUI.verifyElementVisible(pilih_personalisasi, FailureHandling.OPTIONAL) == true)
{
	WebUI.click(pilih_personalisasi)
}
else if (WebUI.verifyElementVisible(pilih_type, FailureHandling.OPTIONAL) == true)
{
	WebUI.click(pilih_type)
}

else if (WebUI.callTestCase(findTestCase('c_tc/call_kado/Kado 1'), [('typevar') : pilih_tema_con], , FailureHandling.OPTIONAL) == true)
{
	WebUI.click(pilih_type)
}
		
else if (WebUI.callTestCase(findTestCase('c_tc/call_kado/Kado 2'), [('typevar') : pilih_tema_con], , FailureHandling.OPTIONAL) == true)
{
	WebUI.click(pilih_type)
}
//end pilih_tema========================================================================================================

//===========================================================END==============================================================