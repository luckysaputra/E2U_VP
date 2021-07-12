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
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.keyword.excel.ExcelKeywords as ExcelKeywords
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
LocalDateTime now = LocalDateTime.now();
System.out.println(dtf.format(now));
String excelFile = '.[report] custom excel report\\[report] many data.xlsx'
workbook = ExcelKeywords.getWorkbook(excelFile)
report = ExcelKeywords.getExcelSheet(workbook, 'Kado')
ExcelKeywords.setValueToCellByAddress(report, 'C10', dtf.format(now))
ExcelKeywords.setValueToCellByAddress(report, xlvar1, 'Not OK')
ExcelKeywords.setValueToCellByAddress(report, xlvar2, 'Not OK')
ExcelKeywords.setValueToCellByAddress(report, xlvar3, 'Not OK')
ExcelKeywords.setValueToCellByAddress(report, xlvar4, 'Not OK')
ExcelKeywords.setValueToCellByAddress(report, xlstat, 'FAILED')
ExcelKeywords.setValueToCellByAddress(report, xlpay, 'No Such Transaction on DOKU!')
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
ExcelKeywords.setValueToCellByAddress(report, xlvar1, 'OK')
ExcelKeywords.saveWorkbook(excelFile, workbook)
//STEP 2 DATA PENERIMA KADO
WebUI.setText(Path.INPUT_NAMA_SESUAI_KTP_PENERIMA_KADO, nama_penerima_sesuai_ktp)
WebUI.click(Path.COMBOBOX_HARGA_KADO)
//harga_kado con========================================================================================================
WebUI.callTestCase(findTestCase('c_tc/call_kado/harga_kado'), [('harga_kado') : harga_kado], FailureHandling.STOP_ON_FAILURE)
//end harga_kado con========================================================================================================
//pilih_tema/personalisasi========================================================================================================
WebUI.callTestCase(findTestCase('c_tc/call_kado/personalisasi'), [('personalisasi_kado') : personalisasi_kado, ('pilih_tema') : pilih_tema], FailureHandling.STOP_ON_FAILURE)
//end pilih_tema/personalisasi========================================================================================================
WebUI.setText(Path.INPUT_UCAPAN_KADO, ucapan)
WebUI.click(Path.CLOSE_PROMO_POPUP, FailureHandling.OPTIONAL)
WebUI.setText(Path.INPUT_EMAIL_PENERIMA_KADO, email_penerima)
WebUI.setText(Path.INPUT_NO_HP_PENERIMA_KADO, no_hp_penerima)
WebUI.setText(Path.DATEPICKER_TANGGAL_KIRIM_KADO, tanggal_kirim_kado)
WebUI.sendKeys(Path.DATEPICKER_TANGGAL_KIRIM_KADO, Keys.chord(Keys.ENTER))
WebUI.click(Path.BUTTON_LANJUT_KADO)
ExcelKeywords.setValueToCellByAddress(report, xlvar2, 'OK')
ExcelKeywords.saveWorkbook(excelFile, workbook)
//STEP 3 DATA DIRI PENGIRIM KADO
WebUI.setText(Path.INPUT_NAMA_SESUAI_KTP_PENGIRIM_KADO, nama_pengirim_kado)
WebUI.setText(Path.INPUT_NO_HP_PENGIRIM_KADO, no_hp_pengirim)
WebUI.setText(Path.INPUT_EMAIL_PENGIRIM_KADO, email_pengirim)
WebUI.click(Path.BUTTON_LANJUT_DATA_DIRI_KADO)
ExcelKeywords.setValueToCellByAddress(report, xlvar3, 'OK')
ExcelKeywords.saveWorkbook(excelFile, workbook)
//STEP 4 RINGKASAN KADO
WebUI.check(Path.CHECKBOX_SYARAT_DAN_KENTENTUAN_KADO)
WebUI.click(Path.CLOSE_HELP, FailureHandling.OPTIONAL)
WebUI.click(Path.BUTTON_SAYA_SETUJU_KADO)
WebUI.click(Path.BUTTON_BAYAR_KADO)
ExcelKeywords.setValueToCellByAddress(report, xlvar4, 'OK')
//ExcelKeywords.setValueToCellByAddress(report, xlstat, 'PASSED')
ExcelKeywords.saveWorkbook(excelFile, workbook)
WebUI.waitForElementVisible(Path.PEMBAYARAN_BUTTON_BAYAR_VISA_CC, 30)
WebUI.click(Path.PEMBAYARAN_BUTTON_BAYAR_VISA_CC)
WebUI.callTestCase(findTestCase('cformRecur/wcc-wv'), [('ccnum_1') : ccnum_1, ('ccnum_2') : ccnum_2, ('ccnum_3') : ccnum_3, ('ccnum_4') : ccnum_4
	, ('cc_month_expired') : cc_month_expired, ('cc_year_expired') : cc_year_expired, ('cvv') : cvv, ('cc_name') : nama_pengirim_kado, ('cc_email') : email_pengirim, ('cc_phone_number') : no_hp_pengirim],
FailureHandling.STOP_ON_FAILURE)
OTP = WebUI.getText(Path.R_DOKU_OTP)
println(OTP);
//OTP_final = OTP.replace("Kado ", "")
WebUI.setText(Path.R_DOKU_SET_OTP, OTP)
WebUI.click(Path.R_DOKU_CLICK_SUBMIT_OTP)
									//DOKU CONDITION	
WebUI.waitForElementVisible(Path.DOKU_RED_RESULT, 30)
dokustat_print = WebUI.getText(Path.DOKU_RED_RESULT)
println(dokustat_print);
									if (WebUI.verifyElementText(Path.DOKU_RED_RESULT, "Transaction Successful", FailureHandling.OPTIONAL) == true)
											{
												KeywordUtil.markPassed("TRANSAKSI SUKSES")
												WebUI.waitForElementVisible(Path.ILOVELIFE_RESULT, 20)
												status = WebUI.getText(Path.ILOVELIFE_RESULT)
												println(status);
												ExcelKeywords.setValueToCellByAddress(report, xlpay, 'Transaction Successful')
												ExcelKeywords.setValueToCellByAddress(report, xlstat, 'PASSED')
											}
									else
											{
												KeywordUtil.markFailed("TRANSAKSI GAGAL")
												WebUI.waitForElementVisible(Path.ILOVELIFE_RESULT, 20)
												status = WebUI.getText(Path.ILOVELIFE_RESULT)
												println(status);
												ExcelKeywords.setValueToCellByAddress(report, xlpay, 'Transaction Failed')
												ExcelKeywords.setValueToCellByAddress(report, xlstat, 'PASSED WITH WARNING')
											}
									ExcelKeywords.saveWorkbook(excelFile, workbook)