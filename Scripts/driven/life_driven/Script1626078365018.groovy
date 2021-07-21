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
import com.kms.katalon.core.webui.common.internal.SmartWait
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
report = ExcelKeywords.getExcelSheet(workbook, 'Life')
ExcelKeywords.setValueToCellByAddress(report, 'C10', dtf.format(now))
ExcelKeywords.setValueToCellByAddress(report, xlvar1, 'Not OK')
ExcelKeywords.setValueToCellByAddress(report, xlvar2, 'Not OK')
ExcelKeywords.setValueToCellByAddress(report, xlvar3, 'Not OK')
ExcelKeywords.setValueToCellByAddress(report, xlvar4, 'Not OK')
ExcelKeywords.setValueToCellByAddress(report, xlvar5, 'Not OK')
ExcelKeywords.setValueToCellByAddress(report, xlvar6, 'Not OK')
ExcelKeywords.setValueToCellByAddress(report, xlvar7, 'Not OK')
ExcelKeywords.setValueToCellByAddress(report, xlvar8, 'Not OK')
ExcelKeywords.setValueToCellByAddress(report, xlvar9, 'Not OK')
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
//STEP 1 PRODUCT LIFE
WebUI.click(Path.BUTTON_LIFE)
WebUI.click(Path.BUTTON_CEK_SEKARANG_LIFE)
ExcelKeywords.setValueToCellByAddress(report, xlvar1, 'OK')
ExcelKeywords.saveWorkbook(excelFile, workbook)

WebUI.click(Path.COMBOBOX_CEK_KESEHATAN_LIFE)
WebUI.click(Path.SELECT_COMBOBOX_CEK_KESEHATAN_TIDAK_LIFE)
WebUI.click(Path.COMBOBOX_PERNAH_MENGAJUKAN_LIFE)
WebUI.click(Path.SELECT_COMBOBOX_PERNAH_MENGAJUKAN_TIDAK_LIFE)
WebUI.click(Path.BUTTON_LANJUT_SCRN1_LIFE)
ExcelKeywords.setValueToCellByAddress(report, xlvar2, 'OK')
ExcelKeywords.saveWorkbook(excelFile, workbook)

//STEP 2 HITUNG PREMI LIFE
WebUI.click(Path.COMBOBOX_GENDER_SCRN2_LIFE)
//convertgender=======================================================================================================
WebUI.callTestCase(findTestCase('call_con/gender'), [('gender') : gender], FailureHandling.STOP_ON_FAILURE)
//=======================================================================================================
WebUI.click(Path.CLOSE_PROMO_POPUP, FailureHandling.OPTIONAL)
WebUI.setText(Path.INPUT_TANGGAL_LAHIR_SCRN2_LIFE, tanggal_lahir)
WebUI.setText(Path.INPUT_BERAT_BADAN_SCRN2_LIFE, berat_badan)
WebUI.setText(Path.INPUT_TINGGI_BADAN_SCRN2_LIFE, tinggi_badan)
WebUI.click(Path.INPUT_UANG_PERTANGGUNGAN_YANG_DIINGINKAN_SCRN2_LIFE)
WebUI.setText(Path.INPUT_UANG_PERTANGGUNGAN_YANG_DIINGINKAN_SCRN2_LIFE, jumlah_uang_pertanggungan)
WebUI.scrollToElement(Path.COMBOBOX_PEMBAYARAN_PREMI_SCRN2_LIFE, 0)
WebUI.click(Path.COMBOBOX_PEMBAYARAN_PREMI_SCRN2_LIFE)
//convertpremi=======================================================================================================
WebUI.callTestCase(findTestCase('call_con/premi'), [('premi') : premi], FailureHandling.STOP_ON_FAILURE)
//=======================================================================================================
WebUI.click(Path.BUTTON_HITUNG_PREMI_SCRN2_LIFE)
ExcelKeywords.setValueToCellByAddress(report, xlvar3, 'OK')
ExcelKeywords.saveWorkbook(excelFile, workbook)

WebUI.click(Path.BUTTON_AMBIL_SCRN2_LIFE)
ExcelKeywords.setValueToCellByAddress(report, xlvar4, 'OK')
ExcelKeywords.saveWorkbook(excelFile, workbook)

//STEP 3 DATA DIRI
WebUI.click(Path.INPUT_NAMA_KTP_SCRN3_LIFE)
WebUI.setText(Path.INPUT_NAMA_KTP_SCRN3_LIFE, nama_sesuai_ktp)
WebUI.click(Path.INPUT_NO_KTP_SCRN3_LIFE)
WebUI.setText(Path.INPUT_NO_KTP_SCRN3_LIFE, no_ktp)
WebUI.uploadFile(Path.UPLOAD_FILE, file)
WebUI.click(Path.BUTTON_LANJUT_KTP_SCRN3_LIFE)
ExcelKeywords.setValueToCellByAddress(report, xlvar5, 'OK')
ExcelKeywords.saveWorkbook(excelFile, workbook)
dataexistcon = existing
println(dataexistcon)
String dataexistfin =""

if (WebUI.verifyMatch(dataexistcon, "Buat Data Baru", false, FailureHandling.OPTIONAL)==true)
{
	dataexistfin = "text-center block js-use-new-data"
	println(dataexistfin)
}
else if(WebUI.verifyMatch(dataexistcon, "Pakai Data Existing", false, FailureHandling.OPTIONAL)==true)
{
	dataexistfin = "btn primary min mb-2 js-use-existing-data"
	println(dataexistfin)
}
dataexistcon = dataexistfin
println(dataexistcon)
//convertexisting 1 -------------------------------------------------------
	String dataexist = dataexistcon
	TestObject btnexist = new TestObject("existing")
	btnexist.addProperty("class", ConditionType.EQUALS, dataexist)
if (WebUI.verifyElementVisible(btnexist, FailureHandling.OPTIONAL) == true)
	{
		WebUI.click(btnexist)
		ExcelKeywords.setValueToCellByAddress(report, xlvar5, 'OK')
		ExcelKeywords.saveWorkbook(excelFile, workbook)
//RECREATE EXISTING DATA	
		if (WebUI.verifyElementVisible(Path.INPUT_NO_HP_LIFE, FailureHandling.OPTIONAL) == true)
			{
				WebUI.click(Path.INPUT_NO_HP_LIFE)
				WebUI.setText(Path.INPUT_NO_HP_LIFE, no_hp)
				WebUI.click(Path.INPUT_EMAIL_LIFE)
				WebUI.setText(Path.INPUT_EMAIL_LIFE, email)
				WebUI.click(Path.INPUT_ALAMAT_LIFE)
				WebUI.setText(Path.INPUT_ALAMAT_LIFE, alamat)
				WebUI.click(Path.COMBOBOX_PROVINSI_LIFE)
				WebUI.setText(Path.INPUT_SEARCH_PROVINSI_LIFE, provinsi)
				WebUI.sendKeys(Path.INPUT_SEARCH_PROVINSI_LIFE, Keys.chord(Keys.ENTER))
				WebUI.click(Path.INPUT_KODEPOS_LIFE)
				WebUI.setText(Path.INPUT_KODEPOS_LIFE, kodepos)
				WebUI.click(Path.BUTTON_LANJUT_DATA_DIRI_LIFE)
				ExcelKeywords.setValueToCellByAddress(report, xlvar6, 'Rewrite Existing Data')
				ExcelKeywords.saveWorkbook(excelFile, workbook)
				
				// STEP 4 PENERIMA MANFAAT
				//PENERIMA MANFAAT 1
//=============================================================================================
				WebUI.callTestCase(findTestCase('c_tc/call_life/penerima_con'), [('dia_adalah_1') : dia_adalah_1, ('dia_adalah_2') : dia_adalah_2, ('dia_adalah_3') : dia_adalah_3
					, ('dia_adalah_4') : dia_adalah_4, ('dia_adalah_5') : dia_adalah_5, ('penerima_manfaat_1') : penerima_manfaat_1, ('penerima_manfaat_2') : penerima_manfaat_2, ('penerima_manfaat_3') : penerima_manfaat_3
					, ('penerima_manfaat_4') : penerima_manfaat_4, ('penerima_manfaat_5') : penerima_manfaat_5, ('presentase_manfaat_1') : presentase_manfaat_1, ('presentase_manfaat_2') : presentase_manfaat_2
					, ('presentase_manfaat_3') : presentase_manfaat_3, ('presentase_manfaat_4') : presentase_manfaat_4, ('presentase_manfaat_5') : presentase_manfaat_5, ('profil_1') : profil_1
					, ('profil_2') : profil_2, ('profil_3') : profil_3, ('profil_4') : profil_4, ('profil_5') : profil_5], FailureHandling.STOP_ON_FAILURE)
//=============================================================================================
				ExcelKeywords.setValueToCellByAddress(report, xlvar7, 'OK')
				ExcelKeywords.saveWorkbook(excelFile, workbook)
				
				//STEP 5 RINGKASAN PERTANGGUNGAN
				WebUI.check(Path.CHECKBOX_SYARAT_DAN_KETENTUAN_LIFE)
				WebUI.click(Path.CLOSE_HELP, FailureHandling.OPTIONAL)
				WebUI.sendKeys(Path.BUTTON_SAYA_SETUJU_SK_LIFE, Keys.chord(Keys.ENTER))
				//WebUI.click(Path.BUTTON_SAYA_SETUJU_SK_LIFE)
				if (WebUI.verifyElementText(Path.VERIFY_PREMI_LIFE, verify_premi_life, FailureHandling.OPTIONAL) == false)
					{
						actual_premi = (WebUI.getText(Path.VERIFY_PREMI_LIFE))
						ExcelKeywords.setValueToCellByAddress(report, xlpremi, actual_premi)
						ExcelKeywords.saveWorkbook(excelFile, workbook)
						KeywordUtil.markError("PREMI YANG ANDA INPUT TIDAK SESUAI")
						ExcelKeywords.setValueToCellByAddress(report, xlvar8, 'Unmatch Premi')
						WebUI.click(Path.BUTTON_BAYAR_LIFE)
						ExcelKeywords.setValueToCellByAddress(report, xlvar9, 'OK')
						ExcelKeywords.setValueToCellByAddress(report, xlstat, 'PASSED WITH WARNING')
						WebUI.waitForElementVisible(Path.PEMBAYARAN_BUTTON_BAYAR_VISA_CC, 30)
						WebUI.click(Path.PEMBAYARAN_BUTTON_BAYAR_VISA_CC)
						WebUI.callTestCase(findTestCase('cformRecur/wcc-default'), [('nomor_credit_card') : nomor_credit_card, ('bulan_expired_cc') : bulan_expired_cc, ('tahun_expired_cc') : tahun_expired_cc
							, ('cvv') : cvv, ('cc_nama') : nama_sesuai_ktp, ('cc_alamat') : alamat, ('cc_kota') : cc_kota, ('cc_negara') : cc_negara, ('cc_provinsi') : provinsi
							, ('cc_kodepos') : kodepos, ('cc_email') : email, ('cc_no_hp') : no_hp], FailureHandling.STOP_ON_FAILURE)
						OTP = WebUI.getText(Path.R_DOKU_OTP)
						println(OTP);
						WebUI.setText(Path.R_DOKU_SET_OTP, OTP)
						WebUI.click(Path.R_DOKU_CLICK_SUBMIT_OTP)
						WebUI.waitForElementVisible(Path.DOKU_RESULT, 30)
						doku_result = WebUI.getText(Path.DOKU_RESULT)
						println(doku_result);
								if (WebUI.verifyElementText(Path.DOKU_RESULT, "TRANSAKSI SUKSES", FailureHandling.OPTIONAL) == true)
									{
										KeywordUtil.markPassed("TRANSAKSI SUKSES")
										WebUI.waitForElementVisible(Path.ILOVELIFE_RESULT, 20)
										status = WebUI.getText(Path.ILOVELIFE_RESULT)
										println(status);
										ExcelKeywords.setValueToCellByAddress(report, xlpay, 'Transaction Successful')
										ExcelKeywords.setValueToCellByAddress(report, xlstat, 'PASSED WITH WARNING')
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
					}
				else
					{
						actual_premi = (WebUI.getText(Path.VERIFY_PREMI_LIFE))
						ExcelKeywords.setValueToCellByAddress(report, xlpremi, actual_premi)
						ExcelKeywords.saveWorkbook(excelFile, workbook)
						ExcelKeywords.setValueToCellByAddress(report, xlvar8, 'OK')
						WebUI.click(Path.BUTTON_BAYAR_LIFE)
						ExcelKeywords.setValueToCellByAddress(report, xlvar9, 'OK')
						ExcelKeywords.setValueToCellByAddress(report, xlstat, 'PASSED')
						WebUI.waitForElementVisible(Path.PEMBAYARAN_BUTTON_BAYAR_VISA_CC, 30)
						WebUI.click(Path.PEMBAYARAN_BUTTON_BAYAR_VISA_CC)
						WebUI.callTestCase(findTestCase('cformRecur/wcc-default'), [('nomor_credit_card') : nomor_credit_card, ('bulan_expired_cc') : bulan_expired_cc, ('tahun_expired_cc') : tahun_expired_cc
							, ('cvv') : cvv, ('cc_nama') : nama_sesuai_ktp, ('cc_alamat') : alamat, ('cc_kota') : cc_kota, ('cc_negara') : cc_negara, ('cc_provinsi') : provinsi
							, ('cc_kodepos') : kodepos, ('cc_email') : email, ('cc_no_hp') : no_hp], FailureHandling.STOP_ON_FAILURE)
						OTP = WebUI.getText(Path.R_DOKU_OTP)
						println(OTP);
						WebUI.setText(Path.R_DOKU_SET_OTP, OTP)
						WebUI.click(Path.R_DOKU_CLICK_SUBMIT_OTP)
						WebUI.waitForElementVisible(Path.DOKU_RESULT, 30)
						doku_result = WebUI.getText(Path.DOKU_RESULT)
						println(doku_result);
								if (WebUI.verifyElementText(Path.DOKU_RESULT, "TRANSAKSI SUKSES", FailureHandling.OPTIONAL) == true)
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
					}
				ExcelKeywords.saveWorkbook(excelFile, workbook)
			}
//USE EXISTING DATA		
		else
			{
				ExcelKeywords.setValueToCellByAddress(report, xlvar6, 'Using Existing Data')
				ExcelKeywords.saveWorkbook(excelFile, workbook)
				// STEP 4 PENERIMA MANFAAT
				//PENERIMA MANFAAT 1
				if (WebUI.callTestCase(findTestCase('c_tc/call_life/tc_penerima/penerima_life_1'), [('penerima_manfaat_1') : penerima_manfaat_1
					, ('dia_adalah_1') : dia_adalah_1, ('presentase_manfaat_1') : presentase_manfaat_1, ('profil_1') : profil_1], FailureHandling.OPTIONAL) == true)
				{
					WebUI.click(Path.CLOSE_HELP, FailureHandling.OPTIONAL)
					WebUI.click(Path.BUTTON_LANJUT_PENERIMA_MANFAAT_LIFE)
				}
				//PENERIMA MANFAAT 2
				else if (WebUI.callTestCase(findTestCase('c_tc/call_life/tc_penerima/penerima_life_2'), [('penerima_manfaat_2') : penerima_manfaat_2
					, ('dia_adalah_2') : dia_adalah_2, ('presentase_manfaat_2') : presentase_manfaat_2, ('profil_2') : profil_2], FailureHandling.OPTIONAL) == true)
				{
					WebUI.click(Path.CLOSE_HELP, FailureHandling.OPTIONAL)
					WebUI.click(Path.BUTTON_LANJUT_PENERIMA_MANFAAT_LIFE)
				}
				//PENERIMA MANFAAT 3
				else if (WebUI.callTestCase(findTestCase('c_tc/call_life/tc_penerima/penerima_life_3'), [('penerima_manfaat_3') : penerima_manfaat_3
					, ('dia_adalah_3') : dia_adalah_3, ('presentase_manfaat_3') : presentase_manfaat_3, ('profil_3') : profil_3], FailureHandling.OPTIONAL) == true)
				{
					WebUI.click(Path.CLOSE_HELP, FailureHandling.OPTIONAL)
					WebUI.click(Path.BUTTON_LANJUT_PENERIMA_MANFAAT_LIFE)
				}
				//PENERIMA MANFAAT 4
				else if (WebUI.callTestCase(findTestCase('c_tc/call_life/tc_penerima/penerima_life_4'), [('penerima_manfaat_4') : penerima_manfaat_4
					, ('dia_adalah_4') : dia_adalah_4, ('presentase_manfaat_4') : presentase_manfaat_4, ('profil_4') : profil_4], FailureHandling.OPTIONAL) == true)
				{
					WebUI.click(Path.CLOSE_HELP, FailureHandling.OPTIONAL)
					WebUI.click(Path.BUTTON_LANJUT_PENERIMA_MANFAAT_LIFE)
				}
				//PENERIMA MANFAAT 5
				else if (WebUI.callTestCase(findTestCase('c_tc/call_life/tc_penerima/penerima_life_5'), [('penerima_manfaat_5') : penerima_manfaat_5
					, ('dia_adalah_5') : dia_adalah_5, ('presentase_manfaat_5') : presentase_manfaat_5, ('profil_5') : profil_5], FailureHandling.OPTIONAL) == true)
				{
					WebUI.click(Path.BUTTON_LANJUT_PENERIMA_MANFAAT_LIFE)
					WebUI.click(Path.CLOSE_HELP, FailureHandling.OPTIONAL)
				}
				ExcelKeywords.setValueToCellByAddress(report, xlvar7, 'OK')
				ExcelKeywords.saveWorkbook(excelFile, workbook)
				
				//STEP 5 RINGKASAN PERTANGGUNGAN
				WebUI.check(Path.CHECKBOX_SYARAT_DAN_KETENTUAN_LIFE)
				WebUI.click(Path.CLOSE_HELP, FailureHandling.OPTIONAL)
				WebUI.sendKeys(Path.BUTTON_SAYA_SETUJU_SK_LIFE, Keys.chord(Keys.ENTER))
				//WebUI.click(Path.BUTTON_SAYA_SETUJU_SK_LIFE)
				if (WebUI.verifyElementText(Path.VERIFY_PREMI_LIFE, verify_premi_life, FailureHandling.OPTIONAL) == false)
					{
						actual_premi = (WebUI.getText(Path.VERIFY_PREMI_LIFE))
						ExcelKeywords.setValueToCellByAddress(report, xlpremi, actual_premi)
						ExcelKeywords.saveWorkbook(excelFile, workbook)
						KeywordUtil.markError("PREMI YANG ANDA INPUT TIDAK SESUAI")
						ExcelKeywords.setValueToCellByAddress(report, xlvar8, 'Unmatch Premi')
						WebUI.click(Path.BUTTON_BAYAR_LIFE)
						ExcelKeywords.setValueToCellByAddress(report, xlvar9, 'OK')
						ExcelKeywords.setValueToCellByAddress(report, xlstat, 'PASSED WITH WARNING')
						WebUI.waitForElementVisible(Path.PEMBAYARAN_BUTTON_BAYAR_VISA_CC, 30)
						WebUI.click(Path.PEMBAYARAN_BUTTON_BAYAR_VISA_CC)
						WebUI.callTestCase(findTestCase('cformRecur/wcc-default'), [('nomor_credit_card') : nomor_credit_card, ('bulan_expired_cc') : bulan_expired_cc, ('tahun_expired_cc') : tahun_expired_cc
							, ('cvv') : cvv, ('cc_nama') : nama_sesuai_ktp, ('cc_alamat') : alamat, ('cc_kota') : cc_kota, ('cc_negara') : cc_negara, ('cc_provinsi') : provinsi
							, ('cc_kodepos') : kodepos, ('cc_email') : email, ('cc_no_hp') : no_hp], FailureHandling.STOP_ON_FAILURE)
						OTP = WebUI.getText(Path.R_DOKU_OTP)
						println(OTP);
						WebUI.setText(Path.R_DOKU_SET_OTP, OTP)
						WebUI.click(Path.R_DOKU_CLICK_SUBMIT_OTP)
						WebUI.waitForElementVisible(Path.DOKU_RESULT, 30)
						doku_result = WebUI.getText(Path.DOKU_RESULT)
						println(doku_result);
								if (WebUI.verifyElementText(Path.DOKU_RESULT, "TRANSAKSI SUKSES", FailureHandling.OPTIONAL) == true)
									{
										KeywordUtil.markPassed("TRANSAKSI SUKSES")
										WebUI.waitForElementVisible(Path.ILOVELIFE_RESULT, 20)
										status = WebUI.getText(Path.ILOVELIFE_RESULT)
										println(status);
										ExcelKeywords.setValueToCellByAddress(report, xlpay, 'Transaction Successful')
										ExcelKeywords.setValueToCellByAddress(report, xlstat, 'PASSED WITH WARNING')
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
					}
				else
					{
						actual_premi = (WebUI.getText(Path.VERIFY_PREMI_LIFE))
						ExcelKeywords.setValueToCellByAddress(report, xlpremi, actual_premi)
						ExcelKeywords.saveWorkbook(excelFile, workbook)
						ExcelKeywords.setValueToCellByAddress(report, xlvar8, 'OK')
						WebUI.click(Path.BUTTON_BAYAR_LIFE)
						ExcelKeywords.setValueToCellByAddress(report, xlvar9, 'OK')
						ExcelKeywords.setValueToCellByAddress(report, xlstat, 'PASSED')
						WebUI.waitForElementVisible(Path.PEMBAYARAN_BUTTON_BAYAR_VISA_CC, 30)
						WebUI.click(Path.PEMBAYARAN_BUTTON_BAYAR_VISA_CC)
						WebUI.callTestCase(findTestCase('cformRecur/wcc-default'), [('nomor_credit_card') : nomor_credit_card, ('bulan_expired_cc') : bulan_expired_cc, ('tahun_expired_cc') : tahun_expired_cc
							, ('cvv') : cvv, ('cc_nama') : nama_sesuai_ktp, ('cc_alamat') : alamat, ('cc_kota') : cc_kota, ('cc_negara') : cc_negara, ('cc_provinsi') : provinsi
							, ('cc_kodepos') : kodepos, ('cc_email') : email, ('cc_no_hp') : no_hp], FailureHandling.STOP_ON_FAILURE)
						OTP = WebUI.getText(Path.R_DOKU_OTP)
						println(OTP);
						WebUI.setText(Path.R_DOKU_SET_OTP, OTP)
						WebUI.click(Path.R_DOKU_CLICK_SUBMIT_OTP)
						WebUI.waitForElementVisible(Path.DOKU_RESULT, 30)
						doku_result = WebUI.getText(Path.DOKU_RESULT)
						println(doku_result);
								if (WebUI.verifyElementText(Path.DOKU_RESULT, "TRANSAKSI SUKSES", FailureHandling.OPTIONAL) == true)
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
					}
				ExcelKeywords.saveWorkbook(excelFile, workbook)
			}
	}

else
{
WebUI.click(Path.INPUT_NO_HP_LIFE)
WebUI.setText(Path.INPUT_NO_HP_LIFE, no_hp)
WebUI.click(Path.INPUT_EMAIL_LIFE)
WebUI.setText(Path.INPUT_EMAIL_LIFE, email)
WebUI.click(Path.INPUT_ALAMAT_LIFE)
WebUI.setText(Path.INPUT_ALAMAT_LIFE, alamat)
WebUI.click(Path.COMBOBOX_PROVINSI_LIFE)
WebUI.setText(Path.INPUT_SEARCH_PROVINSI_LIFE, provinsi)
WebUI.sendKeys(Path.INPUT_SEARCH_PROVINSI_LIFE, Keys.chord(Keys.ENTER))
WebUI.click(Path.INPUT_KODEPOS_LIFE)
WebUI.setText(Path.INPUT_KODEPOS_LIFE, kodepos)
WebUI.click(Path.BUTTON_LANJUT_DATA_DIRI_LIFE)
ExcelKeywords.setValueToCellByAddress(report, xlvar6, 'OK')
ExcelKeywords.saveWorkbook(excelFile, workbook)

// STEP 4 PENERIMA MANFAAT
//PENERIMA MANFAAT 1
if (WebUI.callTestCase(findTestCase('c_tc/call_life/tc_penerima/penerima_life_1'), [('penerima_manfaat_1') : penerima_manfaat_1
	, ('dia_adalah_1') : dia_adalah_1, ('presentase_manfaat_1') : presentase_manfaat_1, ('profil_1') : profil_1], FailureHandling.OPTIONAL) == true)
{
	WebUI.click(Path.CLOSE_HELP, FailureHandling.OPTIONAL)
	WebUI.click(Path.BUTTON_LANJUT_PENERIMA_MANFAAT_LIFE)
}
//PENERIMA MANFAAT 2
else if (WebUI.callTestCase(findTestCase('c_tc/call_life/tc_penerima/penerima_life_2'), [('penerima_manfaat_2') : penerima_manfaat_2
	, ('dia_adalah_2') : dia_adalah_2, ('presentase_manfaat_2') : presentase_manfaat_2, ('profil_2') : profil_2], FailureHandling.OPTIONAL) == true)
{
	WebUI.click(Path.CLOSE_HELP, FailureHandling.OPTIONAL)
	WebUI.click(Path.BUTTON_LANJUT_PENERIMA_MANFAAT_LIFE)
}
//PENERIMA MANFAAT 3
else if (WebUI.callTestCase(findTestCase('c_tc/call_life/tc_penerima/penerima_life_3'), [('penerima_manfaat_3') : penerima_manfaat_3
	, ('dia_adalah_3') : dia_adalah_3, ('presentase_manfaat_3') : presentase_manfaat_3, ('profil_3') : profil_3], FailureHandling.OPTIONAL) == true)
{
	WebUI.click(Path.CLOSE_HELP, FailureHandling.OPTIONAL)
	WebUI.click(Path.BUTTON_LANJUT_PENERIMA_MANFAAT_LIFE)
}
//PENERIMA MANFAAT 4
else if (WebUI.callTestCase(findTestCase('c_tc/call_life/tc_penerima/penerima_life_4'), [('penerima_manfaat_4') : penerima_manfaat_4
	, ('dia_adalah_4') : dia_adalah_4, ('presentase_manfaat_4') : presentase_manfaat_4, ('profil_4') : profil_4], FailureHandling.OPTIONAL) == true)
{
	WebUI.click(Path.CLOSE_HELP, FailureHandling.OPTIONAL)
	WebUI.click(Path.BUTTON_LANJUT_PENERIMA_MANFAAT_LIFE)
}
//PENERIMA MANFAAT 5
else if (WebUI.callTestCase(findTestCase('c_tc/call_life/tc_penerima/penerima_life_5'), [('penerima_manfaat_5') : penerima_manfaat_5
	, ('dia_adalah_5') : dia_adalah_5, ('presentase_manfaat_5') : presentase_manfaat_5, ('profil_5') : profil_5], FailureHandling.OPTIONAL) == true)
{
	WebUI.click(Path.BUTTON_LANJUT_PENERIMA_MANFAAT_LIFE)
	WebUI.click(Path.CLOSE_HELP, FailureHandling.OPTIONAL)
}
ExcelKeywords.setValueToCellByAddress(report, xlvar7, 'OK')
ExcelKeywords.saveWorkbook(excelFile, workbook)

//STEP 5 RINGKASAN PERTANGGUNGAN
WebUI.check(Path.CHECKBOX_SYARAT_DAN_KETENTUAN_LIFE)
WebUI.click(Path.CLOSE_HELP, FailureHandling.OPTIONAL)
WebUI.sendKeys(Path.BUTTON_SAYA_SETUJU_SK_LIFE, Keys.chord(Keys.ENTER))
//WebUI.click(Path.BUTTON_SAYA_SETUJU_SK_LIFE)
if (WebUI.verifyElementText(Path.VERIFY_PREMI_LIFE, verify_premi_life, FailureHandling.OPTIONAL) == false)
	{
		actual_premi = (WebUI.getText(Path.VERIFY_PREMI_LIFE))
		ExcelKeywords.setValueToCellByAddress(report, xlpremi, actual_premi)
		ExcelKeywords.saveWorkbook(excelFile, workbook)
		KeywordUtil.markError("PREMI YANG ANDA INPUT TIDAK SESUAI")
		ExcelKeywords.setValueToCellByAddress(report, xlvar8, 'Unmatch Premi')
		WebUI.click(Path.BUTTON_BAYAR_LIFE)
		ExcelKeywords.setValueToCellByAddress(report, xlvar9, 'OK')
		ExcelKeywords.setValueToCellByAddress(report, xlstat, 'PASSED WITH WARNING')
		WebUI.waitForElementVisible(Path.PEMBAYARAN_BUTTON_BAYAR_VISA_CC, 30)
		WebUI.click(Path.PEMBAYARAN_BUTTON_BAYAR_VISA_CC)
		WebUI.callTestCase(findTestCase('cformRecur/wcc-default'), [('nomor_credit_card') : nomor_credit_card, ('bulan_expired_cc') : bulan_expired_cc, ('tahun_expired_cc') : tahun_expired_cc
			, ('cvv') : cvv, ('cc_nama') : nama_sesuai_ktp, ('cc_alamat') : alamat, ('cc_kota') : cc_kota, ('cc_negara') : cc_negara, ('cc_provinsi') : provinsi
			, ('cc_kodepos') : kodepos, ('cc_email') : email, ('cc_no_hp') : no_hp], FailureHandling.STOP_ON_FAILURE)
		OTP = WebUI.getText(Path.R_DOKU_OTP)
		println(OTP);
		WebUI.setText(Path.R_DOKU_SET_OTP, OTP)
		WebUI.click(Path.R_DOKU_CLICK_SUBMIT_OTP)
		WebUI.waitForElementVisible(Path.DOKU_RESULT, 30)
		doku_result = WebUI.getText(Path.DOKU_RESULT)
		println(doku_result);
				if (WebUI.verifyElementText(Path.DOKU_RESULT, "TRANSAKSI SUKSES", FailureHandling.OPTIONAL) == true)
					{
						KeywordUtil.markPassed("TRANSAKSI SUKSES")
						WebUI.waitForElementVisible(Path.ILOVELIFE_RESULT, 20)
						status = WebUI.getText(Path.ILOVELIFE_RESULT)
						println(status);
						ExcelKeywords.setValueToCellByAddress(report, xlpay, 'Transaction Successful')
						ExcelKeywords.setValueToCellByAddress(report, xlstat, 'PASSED WITH WARNING')
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
	}
else
	{
		actual_premi = (WebUI.getText(Path.VERIFY_PREMI_LIFE))
		ExcelKeywords.setValueToCellByAddress(report, xlpremi, actual_premi)
		ExcelKeywords.saveWorkbook(excelFile, workbook)
		ExcelKeywords.setValueToCellByAddress(report, xlvar8, 'OK')
		WebUI.click(Path.BUTTON_BAYAR_LIFE)
		ExcelKeywords.setValueToCellByAddress(report, xlvar9, 'OK')
		ExcelKeywords.setValueToCellByAddress(report, xlstat, 'PASSED')
		WebUI.waitForElementVisible(Path.PEMBAYARAN_BUTTON_BAYAR_VISA_CC, 30)
		WebUI.click(Path.PEMBAYARAN_BUTTON_BAYAR_VISA_CC)
		WebUI.callTestCase(findTestCase('cformRecur/wcc-default'), [('nomor_credit_card') : nomor_credit_card, ('bulan_expired_cc') : bulan_expired_cc, ('tahun_expired_cc') : tahun_expired_cc
			, ('cvv') : cvv, ('cc_nama') : nama_sesuai_ktp, ('cc_alamat') : alamat, ('cc_kota') : cc_kota, ('cc_negara') : cc_negara, ('cc_provinsi') : provinsi
			, ('cc_kodepos') : kodepos, ('cc_email') : email, ('cc_no_hp') : no_hp], FailureHandling.STOP_ON_FAILURE)
		OTP = WebUI.getText(Path.R_DOKU_OTP)
		println(OTP);
		WebUI.setText(Path.R_DOKU_SET_OTP, OTP)
		WebUI.click(Path.R_DOKU_CLICK_SUBMIT_OTP)
		WebUI.waitForElementVisible(Path.DOKU_RESULT, 30)
		doku_result = WebUI.getText(Path.DOKU_RESULT)
		println(doku_result);
				if (WebUI.verifyElementText(Path.DOKU_RESULT, "TRANSAKSI SUKSES", FailureHandling.OPTIONAL) == true)
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
	}
ExcelKeywords.saveWorkbook(excelFile, workbook)
}