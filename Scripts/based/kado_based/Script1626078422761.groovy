import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.nio.file.Path
import java.util.concurrent.ConcurrentHashMap.KeySetView

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
import option.ManageData as Path
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.keyword.excel.ExcelKeywords as ExcelKeywords


String excelFile = '.[report] custom excel report\\[report] single data.xlsx'
workbook = ExcelKeywords.getWorkbook(excelFile)
report = ExcelKeywords.getExcelSheet(workbook, 'Kado')

ExcelKeywords.setValueToCellByAddress(report, 'D2', '=NOW()')
ExcelKeywords.setValueToCellByAddress(report, 'H5', 'Not OK')
ExcelKeywords.setValueToCellByAddress(report, 'H7', 'Not OK')
ExcelKeywords.setValueToCellByAddress(report, 'H8', 'Not OK')
ExcelKeywords.setValueToCellByAddress(report, 'H9', 'Not OK')
ExcelKeywords.saveWorkbook(excelFile, workbook)

//Action.startAddUser()
//OPEN BROWSER
WebUI.openBrowser('')
WebUI.navigateToUrl('https://ilovelife2-uat-bugfix.astralife.co.id/')
WebUI.maximizeWindow()
WebUI.waitForElementVisible(Path.PROMO_BULANAN_CLOSE, 10, FailureHandling.OPTIONAL)
WebUI.click(Path.PROMO_BULANAN_CLOSE, FailureHandling.OPTIONAL)

//STEP 1 PRODUCT KADO
WebUI.click(Path.BUTTON_KADO)
WebUI.click(Path.BUTTON_BELI_KADO)
ExcelKeywords.setValueToCellByAddress(report, 'H5', 'OK')
ExcelKeywords.saveWorkbook(excelFile, workbook)

//STEP 2 DATA PENERIMA KADO
WebUI.setText(Path.INPUT_NAMA_SESUAI_KTP_PENERIMA_KADO, "POLARIS")
WebUI.click(Path.COMBOBOX_HARGA_KADO)
WebUI.click(Path.SELECT_COMBOBOX_HK_450000_KADO)
WebUI.click(Path.TOGGLE_BUTTON_PERSONALISASI_KADO)
WebUI.click(Path.CLOSE_PROMO_POPUP, FailureHandling.OPTIONAL)
WebUI.setText(Path.INPUT_UCAPAN_KADO, "SELAMAT ULANG TAHUN SEMOGA PANJANG UMUR SEHAT SELALU")
WebUI.setText(Path.INPUT_EMAIL_PENERIMA_KADO, "juggernaut@mail.com")
WebUI.setText(Path.INPUT_NO_HP_PENERIMA_KADO, "81548568459")
WebUI.setText(Path.DATEPICKER_TANGGAL_KIRIM_KADO, "20 Maret 2022")
WebUI.sendKeys(Path.DATEPICKER_TANGGAL_KIRIM_KADO, Keys.chord(Keys.ENTER))
WebUI.click(Path.BUTTON_LANJUT_KADO)
ExcelKeywords.setValueToCellByAddress(report, 'H7', 'OK')
ExcelKeywords.saveWorkbook(excelFile, workbook)

//STEP 3 DATA DIRI PENGIRIM KADO
WebUI.setText(Path.INPUT_NAMA_SESUAI_KTP_PENGIRIM_KADO, "STELLAR")
WebUI.setText(Path.INPUT_NO_HP_PENGIRIM_KADO, "81548789548")
WebUI.setText(Path.INPUT_EMAIL_PENGIRIM_KADO, "stormspirit@mail.com")
WebUI.click(Path.BUTTON_LANJUT_DATA_DIRI_KADO)
ExcelKeywords.setValueToCellByAddress(report, 'H8', 'OK')
ExcelKeywords.saveWorkbook(excelFile, workbook)

//STEP 4 RINGKASAN KADO
WebUI.check(Path.CHECKBOX_SYARAT_DAN_KENTENTUAN_KADO)
WebUI.click(Path.BUTTON_SAYA_SETUJU_KADO)
//WebUI.click(Path.BUTTON_BAYAR_KADO)
ExcelKeywords.setValueToCellByAddress(report, 'H9', 'OK')
ExcelKeywords.saveWorkbook(excelFile, workbook)