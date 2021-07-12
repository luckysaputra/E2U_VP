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

premicon = premi
println(premicon)
String premifin =""
if(WebUI.verifyMatch(premicon, "BULAN", false, FailureHandling.OPTIONAL)==true)
	{
			premifin = "/html/body/span/span/span[2]/ul/li[4]"
			println(premifin)
	}
else if(WebUI.verifyMatch(premicon, "3 BULAN", false, FailureHandling.OPTIONAL)==true)
	{
			premifin = "/html/body/span/span/span[2]/ul/li[3]"
			println(premifin)
	}
else if(WebUI.verifyMatch(premicon, "6 BULAN", false, FailureHandling.OPTIONAL)==true)
	{
			premifin = "/html/body/span/span/span[2]/ul/li[2]"
			println(premifin)
		
	}
else if(WebUI.verifyMatch(premicon, "TAHUN", false, FailureHandling.OPTIONAL)==true)
		{
			premifin = "/html/body/span/span/span[2]/ul/li[1]"
			println(premifin)
		}
premicon = premifin
println(premicon)
String premi = premicon
TestObject pilih_premi = new TestObject("premi")
pilih_premi.addProperty("xpath", ConditionType.EQUALS, premi)
WebUI.scrollToElement(pilih_premi, 0)
WebUI.click(pilih_premi)