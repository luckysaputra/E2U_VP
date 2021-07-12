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

harga_kado_con = harga_kado
println(harga_kado_con)
String harga_kado_fin =""
if(WebUI.verifyMatch(harga_kado_con, "Rp100.000", false, FailureHandling.OPTIONAL)==true)
	{
		harga_kado_fin = "/html/body/span/span/span[2]/ul/li[1]"
		println(harga_kado_fin)
	}
else if(WebUI.verifyMatch(harga_kado_con, "Rp450.000", false, FailureHandling.OPTIONAL)==true)
	{
		harga_kado_fin = "/html/body/span/span/span[2]/ul/li[2]"
		println(harga_kado_fin)
	}
else if(WebUI.verifyMatch(harga_kado_con, "Rp500.000", false, FailureHandling.OPTIONAL)==true)
	{
		harga_kado_fin = "/html/body/span/span/span[2]/ul/li[3]"
		println(harga_kado_fin)
	}
harga_kado_con = harga_kado_fin
println(harga_kado_con)
//===============================================================================================
String hargakado = harga_kado_con
TestObject pilih_hargakado = new TestObject("hargakado")
pilih_hargakado.addProperty("xpath", ConditionType.EQUALS, hargakado)
WebUI.click(pilih_hargakado)