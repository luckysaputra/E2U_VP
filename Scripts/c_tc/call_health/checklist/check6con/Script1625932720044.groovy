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

check6con = check6
println(check6con)
String check6fin =""
if (WebUI.verifyMatch(check6con, "Pilih Semua Manfaat", false, FailureHandling.OPTIONAL)==true)
		{
			check6fin = "/html/body/app-root/div/app-product-health-registration/div/div/section[2]/div/div/div/div[4]/div[1]/div/table/tbody/tr[2]/td[1]/input"
			println(check6fin)
		}
else if(WebUI.verifyMatch(check6con, "Rawat Inap ICU", false, FailureHandling.OPTIONAL)==true)
		{
			check6fin = "/html/body/app-root/div/app-product-health-registration/div/div/section[2]/div/div/div/div[4]/div[1]/div/table/tbody/tr[6]/td[1]/input"
			println(check6fin)
		}
else if(WebUI.verifyMatch(check6con, "Biaya Pembedahan", false, FailureHandling.OPTIONAL)==true)
		{
			check6fin = "/html/body/app-root/div/app-product-health-registration/div/div/section[2]/div/div/div/div[4]/div[1]/div/table/tbody/tr[7]/td[1]/input"
			println(check6fin)
		}
else if(WebUI.verifyMatch(check6con, "Penyakit Kritis", false, FailureHandling.OPTIONAL)==true)
		{
			check6fin = "/html/body/app-root/div/app-product-health-registration/div/div/section[2]/div/div/div/div[4]/div[1]/div/table/tbody/tr[8]/td[1]/input"
			println(check6fin)
		}
else if(WebUI.verifyMatch(check6con, "Cepat Sembuh", false, FailureHandling.OPTIONAL)==true)
		{
			check6fin = "/html/body/app-root/div/app-product-health-registration/div/div/section[2]/div/div/div/div[4]/div[1]/div/table/tbody/tr[9]/td[1]/input"
			println(check6fin)
		}
else if(WebUI.verifyMatch(check6con, "Aneka Perawatan", false, FailureHandling.OPTIONAL)==true)
		{
			check6fin = "/html/body/app-root/div/app-product-health-registration/div/div/section[2]/div/div/div/div[4]/div[1]/div/table/tbody/tr[10]/td[1]/input"
			println(check6fin)
		}
else if(WebUI.verifyMatch(check6con, "Setelah Rawat Inap", false, FailureHandling.OPTIONAL)==true)
		{
			check6fin = "/html/body/app-root/div/app-product-health-registration/div/div/section[2]/div/div/div/div[4]/div[1]/div/table/tbody/tr[11]/td[1]/input"
			println(check6fin)
		}
check6con = check6fin
println(check6con)
String check6 = check6con
TestObject pilih_check6 = new TestObject("check6")
pilih_check6.addProperty("xpath", ConditionType.EQUALS, check6)
WebUI.scrollToElement(pilih_check6, 0, FailureHandling.OPTIONAL)
WebUI.click(pilih_check6, FailureHandling.OPTIONAL)