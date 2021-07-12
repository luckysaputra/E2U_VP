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

memiliki_komunitas_con = memiliki_komunitas
println(memiliki_komunitas_con)
String memiliki_komunitas_fin =""
if(WebUI.verifyMatch(memiliki_komunitas_con, "Memiliki", false, FailureHandling.OPTIONAL)==true)
{
	memiliki_komunitas_fin = "/html/body/span/span/span[2]/ul/li[1]"
	println(memiliki_komunitas_fin)
}
else if(WebUI.verifyMatch(memiliki_komunitas_con, "Tidak Memiliki", false, FailureHandling.OPTIONAL)==true)
{
	memiliki_komunitas_fin = "/html/body/span/span/span[2]/ul/li[2]"
	println(memiliki_komunitas_fin)
}
memiliki_komunitas_con = memiliki_komunitas_fin
println(memiliki_komunitas_con)
//===============================================================================================

String memiliki_komunitas = memiliki_komunitas_con
TestObject pilih_memiliki_komunitas = new TestObject("memiliki_komunitas")
pilih_memiliki_komunitas.addProperty("xpath", ConditionType.EQUALS, memiliki_komunitas)
WebUI.click(pilih_memiliki_komunitas)