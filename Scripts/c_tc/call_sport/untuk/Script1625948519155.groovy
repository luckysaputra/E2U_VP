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

untukcon = untuk
println(untukcon)
String untukfin =""
if(WebUI.verifyMatch(untukcon, "Saya", false, FailureHandling.OPTIONAL)==true)
{
	untukfin = "/html/body/span/span/span[2]/ul/li[1]"
	println(untukfin)
}
else if(WebUI.verifyMatch(untukcon, "Anak Saya", false, FailureHandling.OPTIONAL)==true)
{
	untukfin = "/html/body/span/span/span[2]/ul/li[2]"
	println(untukfin)
}
untukcon = untukfin
println(untukcon)
//===============================================================================================
String untuk = untukcon
TestObject pilih_untuk = new TestObject("untuk")
pilih_untuk.addProperty("xpath", ConditionType.EQUALS, untuk)
WebUI.click(pilih_untuk)