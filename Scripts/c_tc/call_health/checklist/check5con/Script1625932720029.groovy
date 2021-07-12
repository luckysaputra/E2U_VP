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

check5con = check5
println(check5con)
String check5fin =""
if (WebUI.verifyMatch(check5con, "Pilih Semua Manfaat", false, FailureHandling.OPTIONAL)==true)
		{
			check5fin = "/html/body/app-root/div/app-product-health-registration/div/div/section[2]/div/div/div/div[4]/div[1]/div/table/tbody/tr[2]/td[1]/input"
			println(check5fin)
		}
else if(WebUI.verifyMatch(check5con, "Rawat Inap ICU", false, FailureHandling.OPTIONAL)==true)
		{
			check5fin = "/html/body/app-root/div/app-product-health-registration/div/div/section[2]/div/div/div/div[4]/div[1]/div/table/tbody/tr[6]/td[1]/input"
			println(check5fin)
		}
else if(WebUI.verifyMatch(check5con, "Biaya Pembedahan", false, FailureHandling.OPTIONAL)==true)
		{
			check5fin = "/html/body/app-root/div/app-product-health-registration/div/div/section[2]/div/div/div/div[4]/div[1]/div/table/tbody/tr[7]/td[1]/input"
			println(check5fin)
		}
else if(WebUI.verifyMatch(check5con, "Penyakit Kritis", false, FailureHandling.OPTIONAL)==true)
		{
			check5fin = "/html/body/app-root/div/app-product-health-registration/div/div/section[2]/div/div/div/div[4]/div[1]/div/table/tbody/tr[8]/td[1]/input"
			println(check5fin)
		}
else if(WebUI.verifyMatch(check5con, "Cepat Sembuh", false, FailureHandling.OPTIONAL)==true)
		{
			check5fin = "/html/body/app-root/div/app-product-health-registration/div/div/section[2]/div/div/div/div[4]/div[1]/div/table/tbody/tr[9]/td[1]/input"
			println(check5fin)
		}
else if(WebUI.verifyMatch(check5con, "Aneka Perawatan", false, FailureHandling.OPTIONAL)==true)
		{
			check5fin = "/html/body/app-root/div/app-product-health-registration/div/div/section[2]/div/div/div/div[4]/div[1]/div/table/tbody/tr[10]/td[1]/input"
			println(check5fin)
		}
else if(WebUI.verifyMatch(check5con, "Setelah Rawat Inap", false, FailureHandling.OPTIONAL)==true)
		{
			check5fin = "/html/body/app-root/div/app-product-health-registration/div/div/section[2]/div/div/div/div[4]/div[1]/div/table/tbody/tr[11]/td[1]/input"
			println(check5fin)
		}
check5con = check5fin
println(check5con)
String check5 = check5con
TestObject pilih_check5 = new TestObject("check5")
pilih_check5.addProperty("xpath", ConditionType.EQUALS, check5)
WebUI.scrollToElement(pilih_check5, 0, FailureHandling.OPTIONAL)
WebUI.click(pilih_check5, FailureHandling.OPTIONAL)