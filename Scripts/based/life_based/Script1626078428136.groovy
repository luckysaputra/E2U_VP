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
report = ExcelKeywords.getExcelSheet(workbook, 'Life')

ExcelKeywords.setValueToCellByAddress(report, 'D2', '=NOW()')
ExcelKeywords.setValueToCellByAddress(report, 'H5', 'Not OK')
ExcelKeywords.setValueToCellByAddress(report, 'H8', 'Not OK')
ExcelKeywords.setValueToCellByAddress(report, 'H9', 'Not OK')
ExcelKeywords.setValueToCellByAddress(report, 'H10', 'Not OK')
ExcelKeywords.setValueToCellByAddress(report, 'H12', 'Not OK')
ExcelKeywords.setValueToCellByAddress(report, 'H15', 'Not OK')
ExcelKeywords.setValueToCellByAddress(report, 'H16', 'Not OK')
ExcelKeywords.setValueToCellByAddress(report, 'H17', 'Not OK')
ExcelKeywords.saveWorkbook(excelFile, workbook)

//Action.startAddUser()
//OPEN BROWSER
WebUI.openBrowser('')
WebUI.navigateToUrl('https://ilovelife2-uat-bugfix.astralife.co.id/')
WebUI.maximizeWindow()
WebUI.waitForElementVisible(Path.PROMO_BULANAN_CLOSE, 10, FailureHandling.OPTIONAL)
WebUI.click(Path.PROMO_BULANAN_CLOSE, FailureHandling.OPTIONAL)

//STEP 1 PRODUCT LIFE
WebUI.click(Path.BUTTON_LIFE)
WebUI.click(Path.BUTTON_CEK_SEKARANG_LIFE)
ExcelKeywords.setValueToCellByAddress(report, 'H5', 'OK')
ExcelKeywords.saveWorkbook(excelFile, workbook)

WebUI.click(Path.COMBOBOX_CEK_KESEHATAN_LIFE)
WebUI.click(Path.SELECT_COMBOBOX_CEK_KESEHATAN_TIDAK_LIFE)
WebUI.click(Path.COMBOBOX_PERNAH_MENGAJUKAN_LIFE)
WebUI.click(Path.SELECT_COMBOBOX_PERNAH_MENGAJUKAN_TIDAK_LIFE)
WebUI.click(Path.CLOSE_PROMO_POPUP, FailureHandling.OPTIONAL)
WebUI.click(Path.BUTTON_LANJUT_SCRN1_LIFE)
ExcelKeywords.setValueToCellByAddress(report, 'H8', 'OK')
ExcelKeywords.saveWorkbook(excelFile, workbook)


//STEP 2 HITUNG PREMI LIFE
WebUI.click(Path.COMBOBOX_GENDER_SCRN2_LIFE)
WebUI.click(Path.SELECT_COMBOBOX_GENDERSCRN2_PRIA_LIFE)
//WebUI.click(Path.SELECT_COMBOBOX_GENDERSCRN2_WANITA_LIFE, FailureHandling.STOP_ON_FAILURE)
//WebUI.selectOptionByValue(Path.GENDER_XPATH, gender, false)
	
WebUI.setText(Path.INPUT_TANGGAL_LAHIR_SCRN2_LIFE, "08 Februari 1994")
WebUI.setText(Path.INPUT_BERAT_BADAN_SCRN2_LIFE, "52")
WebUI.setText(Path.INPUT_TINGGI_BADAN_SCRN2_LIFE, "168")
WebUI.click(Path.INPUT_UANG_PERTANGGUNGAN_YANG_DIINGINKAN_SCRN2_LIFE)
WebUI.setText(Path.INPUT_UANG_PERTANGGUNGAN_YANG_DIINGINKAN_SCRN2_LIFE, "400000000")

WebUI.click(Path.COMBOBOX_PEMBAYARAN_PREMI_SCRN2_LIFE)
WebUI.click(Path.SELECT_PREMI_TAHUN_SCRN2_LIFE)
//WebUI.selectOptionByValue(Path.PEMBAYARAN_PREMI, premi, false, FailureHandling.STOP_ON_FAILURE)

WebUI.click(Path.BUTTON_HITUNG_PREMI_SCRN2_LIFE)
ExcelKeywords.setValueToCellByAddress(report, 'H9', 'OK')
ExcelKeywords.saveWorkbook(excelFile, workbook)

WebUI.click(Path.BUTTON_AMBIL_SCRN2_LIFE)
ExcelKeywords.setValueToCellByAddress(report, 'H10', 'OK')
ExcelKeywords.saveWorkbook(excelFile, workbook)


//STEP 3 DATA DIRI
WebUI.click(Path.INPUT_NAMA_KTP_SCRN3_LIFE)
WebUI.setText(Path.INPUT_NAMA_KTP_SCRN3_LIFE, "WILL I AM")
WebUI.click(Path.INPUT_NO_KTP_SCRN3_LIFE)
WebUI.setText(Path.INPUT_NO_KTP_SCRN3_LIFE, "4687954879548788")
//WebUI.click(Path.BUTTON_UPLOAD)
WebUI.uploadFile(Path.UPLOAD_FILE, file)
WebUI.click(Path.BUTTON_LANJUT_KTP_SCRN3_LIFE)
ExcelKeywords.setValueToCellByAddress(report, 'H12', 'OK')
ExcelKeywords.saveWorkbook(excelFile, workbook)

WebUI.click(Path.INPUT_NO_HP_LIFE)
WebUI.setText(Path.INPUT_NO_HP_LIFE, "83596059607")

WebUI.click(Path.INPUT_EMAIL_LIFE)
WebUI.setText(Path.INPUT_EMAIL_LIFE, "email@mail.com")

WebUI.click(Path.INPUT_ALAMAT_LIFE)
WebUI.setText(Path.INPUT_ALAMAT_LIFE, "Test alamat")

WebUI.click(Path.COMBOBOX_PROVINSI_LIFE)
WebUI.setText(Path.INPUT_SEARCH_PROVINSI_LIFE, "JAWA BARAT")
WebUI.sendKeys(Path.INPUT_SEARCH_PROVINSI_LIFE, Keys.chord(Keys.ENTER))

WebUI.click(Path.INPUT_KODEPOS_LIFE)
WebUI.setText(Path.INPUT_KODEPOS_LIFE, "16518")
WebUI.click(Path.BUTTON_LANJUT_DATA_DIRI_LIFE)
ExcelKeywords.setValueToCellByAddress(report, 'H15', 'OK')
ExcelKeywords.saveWorkbook(excelFile, workbook)


// STEP 4 PENERIMA MANFAAT
//PENERIMA MANFAAT 1
WebUI.click(Path.BUTTON_PENERIIMA_MANFAAT_1_LIFE)
WebUI.click(Path.INPUT_NAMA_PENERIMA_MANFAAT_1_LIFE)
WebUI.setText(Path.INPUT_NAMA_PENERIMA_MANFAAT_1_LIFE, "ISTRI")
WebUI.click(Path.COMBOBOX_SIAPA_PENERIMA_MANFAAT_1_LIFE)
WebUI.click(Path.SELECT_PENERIMA_MANFAAT_ISTRI_LIFE)
WebUI.click(Path.INPUT_BESAR_PRESENTASE_MANFAAT_LIFE)
WebUI.setText(Path.INPUT_BESAR_PRESENTASE_MANFAAT_LIFE, "50")
WebUI.uploadFile(Path.UPLOAD_FOTO_PROFIL_PENERIMA_MANFAAT_LIFE, profil_1)
WebUI.click(Path.BUTTON_TAMBAHKAN_PENERIMA_MANFAAT_LIFE)

//PENERIMA MANFAAT 2
WebUI.click(Path.BUTTON_PENERIIMA_MANFAAT_2_LIFE)
WebUI.click(Path.INPUT_NAMA_PENERIMA_MANFAAT_1_LIFE)
WebUI.setText(Path.INPUT_NAMA_PENERIMA_MANFAAT_1_LIFE, "ANAK")
WebUI.click(Path.COMBOBOX_SIAPA_PENERIMA_MANFAAT_1_LIFE)
WebUI.click(Path.SELECT_PENERIMA_MANFAAT_ANAK_LIFE)
WebUI.click(Path.INPUT_BESAR_PRESENTASE_MANFAAT_LIFE)
WebUI.setText(Path.INPUT_BESAR_PRESENTASE_MANFAAT_LIFE, "25")
WebUI.uploadFile(Path.UPLOAD_FOTO_PROFIL_PENERIMA_MANFAAT_LIFE, profil_2)
WebUI.click(Path.BUTTON_TAMBAHKAN_PENERIMA_MANFAAT_LIFE)

//PENERIMA MANFAAT 3
WebUI.click(Path.BUTTON_PENERIIMA_MANFAAT_3_LIFE)
WebUI.click(Path.INPUT_NAMA_PENERIMA_MANFAAT_1_LIFE)
WebUI.setText(Path.INPUT_NAMA_PENERIMA_MANFAAT_1_LIFE, "SAUDARA KANDUNG")
WebUI.click(Path.COMBOBOX_SIAPA_PENERIMA_MANFAAT_1_LIFE)
WebUI.click(Path.SELECT_PENERIMA_MANFAAT_SAUDARA_KANDUNG_LIFE)
WebUI.click(Path.INPUT_BESAR_PRESENTASE_MANFAAT_LIFE)
WebUI.setText(Path.INPUT_BESAR_PRESENTASE_MANFAAT_LIFE, "25")
WebUI.uploadFile(Path.UPLOAD_FOTO_PROFIL_PENERIMA_MANFAAT_LIFE, profil_3)
WebUI.click(Path.BUTTON_TAMBAHKAN_PENERIMA_MANFAAT_LIFE)

WebUI.click(Path.BUTTON_LANJUT_PENERIMA_MANFAAT_LIFE)
//WebUI.delay(8)
//WebUI.takeFullPageScreenshot('C:\\Users\\HP\\git\\astralife-web\\.screenshot_passed\\full_view.png')
ExcelKeywords.setValueToCellByAddress(report, 'H16', 'OK')
ExcelKeywords.saveWorkbook(excelFile, workbook)


//STEP 5 RINGKASAN PERTANGGUNGAN
WebUI.scrollToElement(Path.CHECKBOX_SYARAT_DAN_KETENTUAN_LIFE, 0)
WebUI.check(Path.CHECKBOX_SYARAT_DAN_KETENTUAN_LIFE)
WebUI.click(Path.BUTTON_SAYA_SETUJU_SK_LIFE)
WebUI.verifyElementText(Path.VERIFY_PREMI_LIFE, "Rp1.016.000,00", FailureHandling.CONTINUE_ON_FAILURE)
//WebUI.click(Path.BUTTON_BAYAR_LIFE)
ExcelKeywords.setValueToCellByAddress(report, 'H17', 'OK')
ExcelKeywords.saveWorkbook(excelFile, workbook)