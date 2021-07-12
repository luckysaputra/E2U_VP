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
import com.kms.katalon.keyword.excel.ExcelKeywords
import com.thoughtworks.selenium.webdriven.commands.GetValue
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


String excelFile = '.[report] custom excel report\\[report] single data.xlsx'
workbook = ExcelKeywords.getWorkbook(excelFile)
report = ExcelKeywords.getExcelSheet(workbook, 'Flexi_Health')

ExcelKeywords.setValueToCellByAddress(report, 'D2', '=NOW()')
ExcelKeywords.setValueToCellByAddress(report, 'H5', 'Not OK')
ExcelKeywords.setValueToCellByAddress(report, 'H7', 'Not OK')
ExcelKeywords.setValueToCellByAddress(report, 'H8', 'Not OK')
ExcelKeywords.setValueToCellByAddress(report, 'H10', 'Not OK')
ExcelKeywords.setValueToCellByAddress(report, 'H11', 'Not OK')
ExcelKeywords.setValueToCellByAddress(report, 'H12', 'Not OK')
ExcelKeywords.setValueToCellByAddress(report, 'H13', 'Not OK')
ExcelKeywords.setValueToCellByAddress(report, 'H14', 'Not OK')
ExcelKeywords.setValueToCellByAddress(report, 'H15', 'Not OK')
ExcelKeywords.setValueToCellByAddress(report, 'H19', 'Not OK')
ExcelKeywords.setValueToCellByAddress(report, 'H20', 'Not OK')
ExcelKeywords.saveWorkbook(excelFile, workbook)

//Action.startAddUser()
//OPEN BROWSER
WebUI.openBrowser('')
WebUI.navigateToUrl('https://ilovelife2-uat-bugfix.astralife.co.id/')
WebUI.maximizeWindow()
WebUI.waitForElementVisible(Path.PROMO_BULANAN_CLOSE, 10, FailureHandling.OPTIONAL)
WebUI.click(Path.PROMO_BULANAN_CLOSE, FailureHandling.OPTIONAL)

//STEP 1 PRODUCT FLEXI HEALT
WebUI.mouseOver(Path.HEALT_DROPDOWN)
WebUI.click(Path.SELECT_FLEXI_HEALTH)
WebUI.click(Path.BUTTON_CEK_SEKARANG)
ExcelKeywords.setValueToCellByAddress(report, 'H5', 'OK')
ExcelKeywords.saveWorkbook(excelFile, workbook)

WebUI.click(Path.DROPDOWN_GENDER)
WebUI.click(Path.SELECT_GENDER_PRIA)
//WebUI.click(Path.SELECT_GENDER_WANITA)
WebUI.click(Path.CLOSE_PROMO_POPUP, FailureHandling.OPTIONAL)
WebUI.setText(Path.INPUT_USIA, '25')
WebUI.click(Path.INPUT_NOMINAL_SANTUNAN_HARIAN)
WebUI.setText(Path.INPUT_NOMINAL_SANTUNAN_HARIAN, '100000')
WebUI.click(Path.BUTTON_HITUNG_PREMI)
ExcelKeywords.setValueToCellByAddress(report, 'H7', 'OK')
ExcelKeywords.saveWorkbook(excelFile, workbook)



//STEP 2 PEMILIHAN MANFAAT
WebUI.scrollToElement(Path.MANFAAT_FLEXI_HEALTH, 0)
WebUI.check(Path.CHECKBOX_RAWAT_INAP)
WebUI.uncheck(Path.CHECKBOX_BIAYA_PEMBEDAHAN)
WebUI.uncheck(Path.CHECKBOX_PENYAKIT_KRITIS)
WebUI.uncheck(Path.CHECKBOX_RAWAT_INAP)

WebUI.click(Path.BUTTON_LANJUT_ATUR)
ExcelKeywords.setValueToCellByAddress(report, 'H8', 'OK')
ExcelKeywords.saveWorkbook(excelFile, workbook)



//STEP 3 KUISIONER RIWAYAT PENYAKIT
WebUI.click(Path.DROPDOWN_RIWAYAT_PENYAKIT)
WebUI.click(Path.RIWAYAT_PENYAKIT_TIDAK)
WebUI.click(Path.BUTTON_LANJUT_RIWAYAT_PENYAKIT)
ExcelKeywords.setValueToCellByAddress(report, 'H10', 'OK')
ExcelKeywords.saveWorkbook(excelFile, workbook)



//STEP 4 VERIFIKASI TANGGAL LAHIR DAN PEMILIHAN MANFAAT
WebUI.setText(Path.INPUT_TANGGAL_LAHIR_HITUNG_PREMI, "08 Februari 1998")
WebUI.sendKeys(Path.INPUT_TANGGAL_LAHIR_HITUNG_PREMI, Keys.chord(Keys.ENTER))
WebUI.click(Path.BUTTON_HITUNG_PREMI_STEP2)
ExcelKeywords.setValueToCellByAddress(report, 'H11', 'OK')
ExcelKeywords.saveWorkbook(excelFile, workbook)

WebUI.click(Path.CHECKBOX_PILIH_SEMUA_MANFAAT_SCRN2)

//SLIDER
WebUI.scrollToElement(Path.SLIDER_MANFAAT_MENINGGAL_DUNIA_SCRN2, 0)
WebUI.dragAndDropByOffset(Path.SLIDER_MANFAAT_MENINGGAL_DUNIA_SCRN2, 200, 0, FailureHandling.OPTIONAL)

WebUI.scrollToElement(Path.SLIDER_MANFAAT_SANTUNAN_RAWAT_INAP_SCRN2, 0)
WebUI.dragAndDropByOffset(Path.SLIDER_MANFAAT_SANTUNAN_RAWAT_INAP_SCRN2, 200, 0, FailureHandling.OPTIONAL)

WebUI.scrollToElement(Path.SLIDER_PENGGANTIAN_BIAYA_BEDAH_SCRN2, 0)
WebUI.dragAndDropByOffset(Path.SLIDER_PENGGANTIAN_BIAYA_BEDAH_SCRN2, 200, 0, FailureHandling.OPTIONAL)

WebUI.scrollToElement(Path.SLIDER_SANTUNAN_PENYAKIT_KRITIS_SCRN2, 0)
WebUI.dragAndDropByOffset(Path.SLIDER_SANTUNAN_PENYAKIT_KRITIS_SCRN2, 300, 0, FailureHandling.OPTIONAL)

WebUI.click(Path.BUTTON_LANJUT_SCRN2)
ExcelKeywords.setValueToCellByAddress(report, 'H12', 'OK')
ExcelKeywords.saveWorkbook(excelFile, workbook)



//STEP 5 PEMILIHAN PEMBAYARAN PREMI
WebUI.click(Path.DROPDOWN_PREMI)
WebUI.click(Path.SELECT_PREMI_6BULAN)
//PROMO
WebUI.click(Path.BUTTON_HEMAT_DENGAN_PROMO)
WebUI.setText(Path.INPUT_KODE_PROMO, "PROMOLUCKY")
WebUI.click(Path.BUTTON_PAKAI_PROMO)
ExcelKeywords.setValueToCellByAddress(report, 'H13', 'OK')
ExcelKeywords.saveWorkbook(excelFile, workbook)

WebUI.click(Path.BUTTON_LANJUT_PREMI)
ExcelKeywords.setValueToCellByAddress(report, 'H14', 'OK')
ExcelKeywords.saveWorkbook(excelFile, workbook)



//STEP 6 DATA DIRI
WebUI.click(Path.INPUT_NAMA_SESUAI_KTP)
WebUI.setText(Path.INPUT_NAMA_SESUAI_KTP, "Test Data")
WebUI.click(Path.INPUT_NO_KTP)
WebUI.setText(Path.INPUT_NO_KTP, "4687954879548801")
//WebUI.click(Path.BUTTON_UPLOAD)
WebUI.uploadFile(Path.UPLOAD_FILE, file)
WebUI.click(Path.BUTTON_LANJUT_DATA_KTP)
ExcelKeywords.setValueToCellByAddress(report, 'H15', 'OK')
ExcelKeywords.saveWorkbook(excelFile, workbook)

WebUI.click(Path.INPUT_NO_HP)
WebUI.setText(Path.INPUT_NO_HP, "83596059607")
WebUI.click(Path.INPUT_EMAIL)
WebUI.setText(Path.INPUT_EMAIL, "lucky@mail.com")
WebUI.click(Path.INPUT_ALAMAT)
WebUI.setText(Path.INPUT_ALAMAT, "Test alamat")
WebUI.click(Path.COMBOBOX_PROVINSI)
WebUI.setText(Path.INPUT_SEARCH_PROVINSI, "JAWA BARAT")
WebUI.sendKeys(Path.INPUT_SEARCH_PROVINSI, Keys.chord(Keys.ENTER))
WebUI.click(Path.INPUT_KODEPOS)
WebUI.setText(Path.INPUT_KODEPOS, "16518")
WebUI.click(Path.BUTTON_LANJUT_DATA_DIRI)
ExcelKeywords.setValueToCellByAddress(report, 'H19', 'OK')
ExcelKeywords.saveWorkbook(excelFile, workbook)



//STEP 7 RINGKASAN PERTANGGUNGAN
WebUI.scrollToElement(Path.CHECKLIST_SYARAT_KETENTUAN, 0)
WebUI.check(Path.CHECKLIST_SYARAT_KETENTUAN)
WebUI.click(Path.BUTTON_SAYA_SETUJU)
WebUI.verifyElementText(Path.VERIFY_PREMI_HEALTH, "Rp595.700,00", FailureHandling.CONTINUE_ON_FAILURE)
//WebUI.click(Path.BUTTON_BAYAR_HEALTH)
ExcelKeywords.setValueToCellByAddress(report, 'H20', 'OK')
ExcelKeywords.saveWorkbook(excelFile, workbook)