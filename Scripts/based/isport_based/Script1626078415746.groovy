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
report = ExcelKeywords.getExcelSheet(workbook, 'Sport')

ExcelKeywords.setValueToCellByAddress(report, 'D2', '=NOW()')
ExcelKeywords.setValueToCellByAddress(report, 'H5', 'Not OK')
ExcelKeywords.setValueToCellByAddress(report, 'H7', 'Not OK')
ExcelKeywords.setValueToCellByAddress(report, 'H8', 'Not OK')
ExcelKeywords.setValueToCellByAddress(report, 'H10', 'Not OK')
ExcelKeywords.setValueToCellByAddress(report, 'H11', 'Not OK')
ExcelKeywords.setValueToCellByAddress(report, 'H12', 'Not OK')
ExcelKeywords.setValueToCellByAddress(report, 'H13', 'Not OK')
ExcelKeywords.saveWorkbook(excelFile, workbook)

//Action.startAddUser()

//OPEN BROWSER
WebUI.openBrowser('')
WebUI.navigateToUrl('https://ilovelife2-uat-bugfix.astralife.co.id/')
WebUI.maximizeWindow()
WebUI.waitForElementVisible(Path.PROMO_BULANAN_CLOSE, 10, FailureHandling.OPTIONAL)
WebUI.click(Path.PROMO_BULANAN_CLOSE, FailureHandling.OPTIONAL)

//STEP 1 PRODUCT LIFE
WebUI.click(Path.BUTTON_SPORT)
WebUI.click(Path.BUTTON_BELI_iSport)
ExcelKeywords.setValueToCellByAddress(report, 'H5', 'OK')
ExcelKeywords.saveWorkbook(excelFile, workbook)

WebUI.click(Path.COMBOBOX_SAYA_MEMBELI_ASURANSI_UNTUK_SPORT)
WebUI.click(Path.SELECT_COMBOBOX_SMAU_SAYA_SENDIRI_SPORT)
WebUI.click(Path.COMBOBOX_OLAHRAGA_PILIHAN_SPORT)
WebUI.setText(Path.INPUT_COMBOBOX_OLAHRAGA_PILIHAN_SPORT, "BMX")
WebUI.sendKeys(Path.INPUT_COMBOBOX_OLAHRAGA_PILIHAN_SPORT, Keys.chord(Keys.ENTER))
WebUI.click(Path.COMBOBOX_BERLAKU_UNTUK_SPORT)
WebUI.click(Path.SELECT_COMBOBX_BU_1MINGGU_SPORT)
WebUI.setText(Path.DATEPICKER_MULAI_SPORT, "13 Maret 2022")
WebUI.sendKeys(Path.DATEPICKER_MULAI_SPORT, Keys.chord(Keys.ENTER))
//WebUI.click(Path.TOGGLE_BUTTON_TAMBAHKAN_KE_KALENDER_SPORT)
WebUI.click(Path.CLOSE_PROMO_POPUP, FailureHandling.OPTIONAL)
WebUI.click(Path.COMBOBOX_BESAR_PERTANGGUNGAN_SPORT)
WebUI.scrollToElement(Path.SELECT_COMBOBOX_BP_100_SPORT, 0)
WebUI.click(Path.SELECT_COMBOBOX_BP_100_SPORT)
WebUI.check(Path.CHECKBOX_PATAH_TULANG_SPORT)
WebUI.click(Path.BUTTON_HITUNG_SPORT)
ExcelKeywords.setValueToCellByAddress(report, 'H7', 'OK')
ExcelKeywords.saveWorkbook(excelFile, workbook)

WebUI.click(Path.BUTTON_AMBIL_SPORT)
ExcelKeywords.setValueToCellByAddress(report, 'H8', 'OK')
ExcelKeywords.saveWorkbook(excelFile, workbook)

//STEP 2 KOMUNITAS
WebUI.click(Path.COMBOBOX_KODE_KOMUNITAS_SPORT)
WebUI.click(Path.SELECT_COMBOBOX_KK_MEMILIKI_SPORT)
WebUI.setText(Path.INPUT_KODE_KOMUNITAS_SPORT, "5487456847")
WebUI.click(Path.BUTTON_LANJUT_KOMUNITAS_SPORT)
ExcelKeywords.setValueToCellByAddress(report, 'H10', 'OK')
ExcelKeywords.saveWorkbook(excelFile, workbook)

//STEP 3 DATA DIRI SPORT
WebUI.setText(Path.INPUT_NAMA_KTP_SPORT, "Testing DOM")
WebUI.click(Path.COMBOBOX_GENDER_SPORT)
WebUI.click(Path.SELECT_COMBOBOX_GENDER_PRIA_SPORT)
WebUI.setText(Path.DATEPICKER_TANGGAL_LAHIR_SPORT, "01 Januari 1998")
WebUI.setText(Path.INPUT_NO_KTP_SPORT, "1241241241251251")
WebUI.uploadFile(Path.UPLOAD_KTP_SPORT, file)
WebUI.click(Path.BUTTON_LANJUT_DATA_DIRI_SPORT)
ExcelKeywords.setValueToCellByAddress(report, 'H11', 'OK')
ExcelKeywords.saveWorkbook(excelFile, workbook)

//STEP 4 DETAIL DATA SPORT
WebUI.setText(Path.INPUT_NO_HP_SPORT, "81310548756")
WebUI.setText(Path.INPUT_EMAIL_SPORT, "mail@mail.com")
WebUI.setText(Path.INPUT_TEMPAT_TINGGAL_SPORT, "JAKARTA")
WebUI.click(Path.COMBOBOX_PROVINSI_SPORT)
WebUI.setText(Path.INPUT_COMBOBOX_PROVINSI_SPORT, "DKI JAKARTA")
WebUI.sendKeys(Path.INPUT_COMBOBOX_PROVINSI_SPORT, Keys.chord(Keys.ENTER))
WebUI.setText(Path.INPUT_KODEPOS_SPORT, "15846")

/*
WebUI.setText(Path.INPUT_NAMA_PENERIMA_SPORT, "NAMA ANAK")
WebUI.scrollToElement(Path.COMBOBOX_GENDER_PENERIMA_SPORT, 0)
WebUI.click(Path.COMBOBOX_GENDER_PENERIMA_SPORT)
WebUI.click(Path.SELECT_COMBOBOX_GP_PRIA_SPORT)
WebUI.setText(Path.DATEPICKER_TL_PENERIMA_SPORT, "01 November 2010")
WebUI.sendKeys(Path.DATEPICKER_TL_PENERIMA_SPORT, Keys.chord(Keys.ENTER))
WebUI.click(Path.BUTTON_LANJUT_DATA_DETAIL_SPORT)
*/

WebUI.click(Path.BUTTON_LANJUT_SAYA_DETAIL_SPORT)
ExcelKeywords.setValueToCellByAddress(report, 'H12', 'OK')
ExcelKeywords.saveWorkbook(excelFile, workbook)

//STEP 5 RINGKASAN iSPORT
WebUI.check(Path.CHECKBOX_SYARAT_DAN_KETENTUAN_SPORT)
WebUI.click(Path.BUTTON_SAYA_SETUJU_SPORT)
WebUI.verifyElementText(Path.VERIFY_PREMI_SPORT, "Rp122.800,00", FailureHandling.CONTINUE_ON_FAILURE)
//WebUI.click(Path.BUTTON_BAYAR_SPORT)
ExcelKeywords.setValueToCellByAddress(report, 'H13', 'OK')
ExcelKeywords.saveWorkbook(excelFile, workbook)