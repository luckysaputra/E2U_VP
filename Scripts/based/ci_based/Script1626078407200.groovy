import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.nio.file.Path as Path
import java.util.concurrent.ConcurrentHashMap.KeySetView as KeySetView
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
report = ExcelKeywords.getExcelSheet(workbook, 'Flexi_Critical_Illness')

ExcelKeywords.setValueToCellByAddress(report, 'D2', '=NOW()')
ExcelKeywords.setValueToCellByAddress(report, 'H5', 'Not OK')
ExcelKeywords.setValueToCellByAddress(report, 'H8', 'Not OK')
ExcelKeywords.setValueToCellByAddress(report, 'H9', 'Not OK')
ExcelKeywords.setValueToCellByAddress(report, 'H10', 'Not OK')
ExcelKeywords.setValueToCellByAddress(report, 'H12', 'Not OK')
ExcelKeywords.setValueToCellByAddress(report, 'H15', 'Not OK')
ExcelKeywords.setValueToCellByAddress(report, 'H16', 'Not OK')
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
WebUI.click(Path.SELECT_FLEXI_CI)
WebUI.click(Path.BUTTON_CEK_SEKARANG_CI)
ExcelKeywords.setValueToCellByAddress(report, 'H5', 'OK')
ExcelKeywords.saveWorkbook(excelFile, workbook)

//STEP 2 KUISIONER KESEHATAN
WebUI.click(Path.COMBOBOX_KUISIONER_KESEHATAN_CI)
WebUI.click(Path.SELECT_COMBOBOX_KESEHATAN_CI_TIDAK)
WebUI.click(Path.COMBOBOX_PERNAH_MENGAJUKAN_CI)
WebUI.click(Path.SELECT_COMBOBOX_MENGAJUKAN_CI_TIDAK)
WebUI.click(Path.CLOSE_PROMO_POPUP, FailureHandling.OPTIONAL)
WebUI.click(Path.BUTTON_LANJUT_SCRN1_CI)
ExcelKeywords.setValueToCellByAddress(report, 'H8', 'OK')
ExcelKeywords.saveWorkbook(excelFile, workbook)


//STEP 3 HITUNG PREMI
WebUI.click(Path.COMBOBOX_GENDER_SCRN2_CI)
WebUI.click(Path.SELECT_COMBOBOX_GENDERSCRN2_PRIA)


//USING SINGLE DATA
WebUI.setText(Path.INPUT_TANGGAL_LAHIR_SCRN2_CI, '01 Februari 1999')
WebUI.setText(Path.INPUT_BERAT_BADAN_SCRN2_CI, '55')
WebUI.setText(Path.INPUT_TINGGI_BADAN_SCRN2_CI, '172')
WebUI.waitForElementClickable(Path.INPUT_UANG_PERTANGGUNGAN_YANG_DIINGINKAN_SCRN2_CI, 5)
WebUI.click(Path.INPUT_UANG_PERTANGGUNGAN_YANG_DIINGINKAN_SCRN2_CI)
WebUI.setText(Path.INPUT_UANG_PERTANGGUNGAN_YANG_DIINGINKAN_SCRN2_CI, '200000000')
WebUI.click(Path.COMBOBOX_PEMBAYARAN_PREMI_SCRN2_CI)
WebUI.click(Path.SELECT_COMBOBOX_PEMBAYARAN_PREMI_TAHUN_CI)
WebUI.click(Path.BUTTON_HITUNG_SCRN2_CI)
ExcelKeywords.setValueToCellByAddress(report, 'H9', 'OK')
ExcelKeywords.saveWorkbook(excelFile, workbook)

WebUI.click(Path.BUTTON_AMBIL_SCRN2_CI)
ExcelKeywords.setValueToCellByAddress(report, 'H10', 'OK')
ExcelKeywords.saveWorkbook(excelFile, workbook)

//STEP 4 INPUT INFORMASI NASABAH
WebUI.setText(Path.INPUT_NAMA_SESUAI_KTP_CI, 'Test Nama')
WebUI.setText(Path.INPUT_NO_KTP_CI, '1241256636326236')
WebUI.uploadFile(Path.UPLOAD_FILE, file)
WebUI.click(Path.BUTTON_LANJUT_DATA_DIRI_SCRN3_CI)
ExcelKeywords.setValueToCellByAddress(report, 'H12', 'OK')
ExcelKeywords.saveWorkbook(excelFile, workbook)

WebUI.setText(Path.INPUT_NO_HP_SCRN3_CI, '081354844897')
WebUI.setText(Path.INPUT_EMAIL_SCRN3_CI, 'lucky@mail.com')
WebUI.setText(Path.INPUT_ALAMAT_SCRN3_CI, 'Jalan Testing No.20 Dummy')
WebUI.click(Path.COMBOBOX_PROVINSI_SCRN3_CI)
WebUI.setText(Path.INPUT_PROVINSI_SCRN3_CI, 'JAWA BARAT')
WebUI.sendKeys(Path.INPUT_PROVINSI_SCRN3_CI, Keys.chord(Keys.ENTER))
WebUI.setText(Path.INPUT_KODEPOS_SCRN3_CI, '16555')
WebUI.click(Path.BUTTON_LANJUT_SCRN3_CI)
ExcelKeywords.setValueToCellByAddress(report, 'H15', 'OK')
ExcelKeywords.saveWorkbook(excelFile, workbook)

//STEP 5
WebUI.scrollToElement(Path.LINK_SYARAT_DAN_KETENTUAN_SCRN4_CI, 0)
WebUI.check(Path.CHECKBOX_SYARAT_DAN_KETENTUAN_SCRN4_CI)
WebUI.click(Path.BUTTON_SAYA_SETUJU_SCRN4_CI)
WebUI.verifyElementText(Path.VERIFY_PREMI_CI, "Rp538.000,00", FailureHandling.CONTINUE_ON_FAILURE)
//WebUI.click(Path.BUTTON_BAYAR_SCRN4_CI)
ExcelKeywords.setValueToCellByAddress(report, 'H16', 'OK')
ExcelKeywords.saveWorkbook(excelFile, workbook)
