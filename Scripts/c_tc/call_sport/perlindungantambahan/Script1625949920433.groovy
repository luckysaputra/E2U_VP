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

perlindungan_tambahan_con = perlindungan_tambahan
println(perlindungan_tambahan_con)
String perlindungan_tambahan_fin =""
if(WebUI.verifyMatch(perlindungan_tambahan_con, "Tanpa Perlindungan Tambahan", false, FailureHandling.OPTIONAL)==true)
	{
		perlindungan_tambahan_fin = "/html/body/app-root/div/app-product-isport-registration/div/div/section/div/div[2]/div/div/div[7]/div/div[2]/h2"
		println(perlindungan_tambahan_fin)
	}
else if(WebUI.verifyMatch(perlindungan_tambahan_con, "Fisioterapi", false, FailureHandling.OPTIONAL)==true)
	{
		perlindungan_tambahan_fin = "/html/body/app-root/div/app-product-isport-registration/div/div/section/div/div[2]/div/div/div[7]/div/div[2]/div/div[1]/div[1]/input"
		println(perlindungan_tambahan_fin)
	}
else if(WebUI.verifyMatch(perlindungan_tambahan_con, "Patah Tulang", false, FailureHandling.OPTIONAL)==true)
	{
		perlindungan_tambahan_fin = "/html/body/app-root/div/app-product-isport-registration/div/div/section/div/div[2]/div/div/div[7]/div/div[2]/div/div[2]/div[1]/input"
		println(perlindungan_tambahan_fin)
	}
perlindungan_tambahan_con = perlindungan_tambahan_fin
println(perlindungan_tambahan_con)
//===============================================================================================
String perlindungantambahan = perlindungan_tambahan_con
TestObject pilih_perlindungantambahan = new TestObject("perlindungantambahan")
pilih_perlindungantambahan.addProperty("xpath", ConditionType.EQUALS, perlindungantambahan)
WebUI.click(pilih_perlindungantambahan)