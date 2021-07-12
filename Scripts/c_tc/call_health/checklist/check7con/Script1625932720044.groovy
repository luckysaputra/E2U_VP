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

check7con = check7
println(check7con)
String check7fin =""
if (WebUI.verifyMatch(check7con, "Pilih Semua Manfaat", false, FailureHandling.OPTIONAL)==true)
		{
			check7fin = "/html/body/app-root/div/app-product-health-registration/div/div/section[2]/div/div/div/div[4]/div[1]/div/table/tbody/tr[2]/td[1]/input"
			println(check7fin)
		}
else if(WebUI.verifyMatch(check7con, "Rawat Inap ICU", false, FailureHandling.OPTIONAL)==true)
		{
			check7fin = "/html/body/app-root/div/app-product-health-registration/div/div/section[2]/div/div/div/div[4]/div[1]/div/table/tbody/tr[6]/td[1]/input"
			println(check7fin)
		}
else if(WebUI.verifyMatch(check7con, "Biaya Pembedahan", false, FailureHandling.OPTIONAL)==true)
		{
			check7fin = "/html/body/app-root/div/app-product-health-registration/div/div/section[2]/div/div/div/div[4]/div[1]/div/table/tbody/tr[7]/td[1]/input"
			println(check7fin)
		}
else if(WebUI.verifyMatch(check7con, "Penyakit Kritis", false, FailureHandling.OPTIONAL)==true)
		{
			check7fin = "/html/body/app-root/div/app-product-health-registration/div/div/section[2]/div/div/div/div[4]/div[1]/div/table/tbody/tr[8]/td[1]/input"
			println(check7fin)
		}
else if(WebUI.verifyMatch(check7con, "Cepat Sembuh", false, FailureHandling.OPTIONAL)==true)
		{
			check7fin = "/html/body/app-root/div/app-product-health-registration/div/div/section[2]/div/div/div/div[4]/div[1]/div/table/tbody/tr[9]/td[1]/input"
			println(check7fin)
		}
else if(WebUI.verifyMatch(check7con, "Aneka Perawatan", false, FailureHandling.OPTIONAL)==true)
		{
			check7fin = "/html/body/app-root/div/app-product-health-registration/div/div/section[2]/div/div/div/div[4]/div[1]/div/table/tbody/tr[10]/td[1]/input"
			println(check7fin)
		}
else if(WebUI.verifyMatch(check7con, "Setelah Rawat Inap", false, FailureHandling.OPTIONAL)==true)
		{
			check7fin = "/html/body/app-root/div/app-product-health-registration/div/div/section[2]/div/div/div/div[4]/div[1]/div/table/tbody/tr[11]/td[1]/input"
			println(check7fin)
		}
check7con = check7fin
println(check7con)
String check7 = check7con
TestObject pilih_check7 = new TestObject("check7")
pilih_check7.addProperty("xpath", ConditionType.EQUALS, check7)
WebUI.scrollToElement(pilih_check7, 0, FailureHandling.OPTIONAL)
WebUI.click(pilih_check7, FailureHandling.OPTIONAL)