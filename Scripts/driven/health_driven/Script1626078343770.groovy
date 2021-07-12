import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.nio.file.Path
import java.util.concurrent.ConcurrentHashMap.KeySetView

import javax.print.attribute.IntegerSyntax

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

import groovy.json.internal.NumberValue
import internal.GlobalVariable as GlobalVariable
import option.ManageData as Path
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import java.lang.Integer as Integer
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.keyword.excel.ExcelKeywords as ExcelKeywords
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
LocalDateTime now = LocalDateTime.now();
System.out.println(dtf.format(now));
String excelFile = '.[report] custom excel report\\[report] many data.xlsx'
workbook = ExcelKeywords.getWorkbook(excelFile)
report = ExcelKeywords.getExcelSheet(workbook, 'Flexi_Health')
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
ExcelKeywords.setValueToCellByAddress(report, xlvar10, 'Not OK')
ExcelKeywords.setValueToCellByAddress(report, xlvar11, 'Not OK')
ExcelKeywords.setValueToCellByAddress(report, xlvar12, 'Not OK')
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
//STEP 1 PRODUCT FLEXI HEALTH
WebUI.mouseOver(Path.HEALT_DROPDOWN)
WebUI.click(Path.SELECT_FLEXI_HEALTH)
WebUI.click(Path.BUTTON_CEK_SEKARANG)
ExcelKeywords.setValueToCellByAddress(report, xlvar1, 'OK')
ExcelKeywords.saveWorkbook(excelFile, workbook)
WebUI.click(Path.DROPDOWN_GENDER)
//convertgender=======================================================================================================
WebUI.callTestCase(findTestCase('call_con/gender'), [('gender') : gender], FailureHandling.STOP_ON_FAILURE)
//=======================================================================================================
WebUI.click(Path.CLOSE_PROMO_POPUP, FailureHandling.OPTIONAL)
WebUI.setText(Path.INPUT_USIA, usia)
WebUI.scrollToElement(Path.INPUT_NOMINAL_SANTUNAN_HARIAN, 0)
WebUI.click(Path.INPUT_NOMINAL_SANTUNAN_HARIAN)
WebUI.setText(Path.INPUT_NOMINAL_SANTUNAN_HARIAN, nominal_santunan)
WebUI.scrollToElement(Path.BUTTON_HITUNG_PREMI, 0)
WebUI.click(Path.BUTTON_HITUNG_PREMI)
ExcelKeywords.setValueToCellByAddress(report, xlvar2, 'OK')
ExcelKeywords.saveWorkbook(excelFile, workbook)
//STEP 2 PEMILIHAN MANFAAT
WebUI.scrollToElement(Path.MANFAAT_FLEXI_HEALTH, 0)
WebUI.uncheck(Path.CHECKBOX_RAWAT_INAP)
WebUI.uncheck(Path.CHECKBOX_BIAYA_PEMBEDAHAN)
WebUI.uncheck(Path.CHECKBOX_PENYAKIT_KRITIS)
WebUI.click(Path.BUTTON_LANJUT_ATUR)
ExcelKeywords.setValueToCellByAddress(report, xlvar3, 'OK')
ExcelKeywords.saveWorkbook(excelFile, workbook)
//STEP 3 KUISIONER RIWAYAT PENYAKIT
WebUI.click(Path.DROPDOWN_RIWAYAT_PENYAKIT)
WebUI.click(Path.RIWAYAT_PENYAKIT_TIDAK)
WebUI.click(Path.BUTTON_LANJUT_RIWAYAT_PENYAKIT)
ExcelKeywords.setValueToCellByAddress(report, xlvar4, 'OK')
ExcelKeywords.saveWorkbook(excelFile, workbook)
//STEP 4 VERIFIKASI TANGGAL LAHIR DAN PEMILIHAN MANFAAT
WebUI.setText(Path.INPUT_TANGGAL_LAHIR_HITUNG_PREMI, tanggal_lahir)
WebUI.sendKeys(Path.INPUT_TANGGAL_LAHIR_HITUNG_PREMI, Keys.chord(Keys.ENTER))
WebUI.click(Path.BUTTON_HITUNG_PREMI_STEP2)
ExcelKeywords.setValueToCellByAddress(report, xlvar5, 'OK')
ExcelKeywords.saveWorkbook(excelFile, workbook)
WebUI.click(Path.CHECKBOX_PILIH_SEMUA_MANFAAT_SCRN2)
WebUI.click(Path.CHECKBOX_PILIH_SEMUA_MANFAAT_SCRN2)//clear checkbox
//checkoption1 ================================================================================================================
WebUI.callTestCase(findTestCase('c_tc/call_health/checklist/check1con'), [('check1') : check1], FailureHandling.OPTIONAL)
//checkoption2 ================================================================================================================
WebUI.callTestCase(findTestCase('c_tc/call_health/checklist/check2con'), [('check2') : check2], FailureHandling.OPTIONAL)
//checkoption3 ================================================================================================================
WebUI.callTestCase(findTestCase('c_tc/call_health/checklist/check3con'), [('check3') : check3], FailureHandling.OPTIONAL)
//checkoption4 ================================================================================================================
WebUI.callTestCase(findTestCase('c_tc/call_health/checklist/check4con'), [('check4') : check4], FailureHandling.OPTIONAL)
//checkoption5 ================================================================================================================
WebUI.callTestCase(findTestCase('c_tc/call_health/checklist/check5con'), [('check5') : check5], FailureHandling.OPTIONAL)
//checkoption6 ================================================================================================================
WebUI.callTestCase(findTestCase('c_tc/call_health/checklist/check6con'), [('check6') : check6], FailureHandling.OPTIONAL)
//checkoption7 ================================================================================================================
WebUI.callTestCase(findTestCase('c_tc/call_health/checklist/check7con'), [('check7') : check7], FailureHandling.OPTIONAL)
//end ================================================================================================================
//check option 1
//check option 2
//check option 3
//check option 4
//check option 5
//check option 6
//check option 7
//end ================================================================================================================
//SLIDER
//slider_meninggal_dunia ================================================================================================================
WebUI.callTestCase(findTestCase('c_tc/call_health/slider/slider_meninggal_dunia_group/slider_meninggal_dunia'), [('slider_meninggal_dunia') : slider_meninggal_dunia], FailureHandling.OPTIONAL)
//slider_rawat_inap ================================================================================================================
WebUI.callTestCase(findTestCase('c_tc/call_health/slider/slider_rawat_inap'), [('slider_rawat_inap') : slider_rawat_inap], FailureHandling.OPTIONAL)
//slider_biaya_bedah ================================================================================================================
WebUI.callTestCase(findTestCase('c_tc/call_health/slider/slider_biaya_bedah'), [('slider_biaya_bedah') : slider_biaya_bedah], FailureHandling.OPTIONAL)
//slider_penyakit_kritis ================================================================================================================
WebUI.callTestCase(findTestCase('c_tc/call_health/slider/slider_penyakit_kritis'), [('slider_penyakit_kritis') : slider_penyakit_kritis], FailureHandling.OPTIONAL)
//end ================================================================================================================
//LANJUT
WebUI.click(Path.CLOSE_PROMO_POPUP, FailureHandling.OPTIONAL)
WebUI.click(Path.CLOSE_HELP, FailureHandling.OPTIONAL)
WebUI.sendKeys(Path.BUTTON_LANJUT_SCRN2, Keys.chord(Keys.ENTER))
ExcelKeywords.setValueToCellByAddress(report, xlvar6, 'OK')
ExcelKeywords.saveWorkbook(excelFile, workbook)
//STEP 5 PEMILIHAN PEMBAYARAN PREMI
WebUI.click(Path.CLOSE_HELP, FailureHandling.OPTIONAL)
WebUI.scrollToElement(Path.DROPDOWN_PREMI, 0)
WebUI.click(Path.DROPDOWN_PREMI)
//convertpremi
//convertpremi=======================================================================================================
WebUI.callTestCase(findTestCase('call_con/premi'), [('premi') : premi], FailureHandling.STOP_ON_FAILURE)
//=======================================================================================================
//PROMO
WebUI.click(Path.BUTTON_HEMAT_DENGAN_PROMO)
WebUI.setText(Path.INPUT_KODE_PROMO, kode_promo)
if (WebUI.verifyElementClickable(Path.BUTTON_PAKAI_PROMO, FailureHandling.OPTIONAL) == true)
{
	WebUI.click(Path.BUTTON_PAKAI_PROMO)
	ExcelKeywords.setValueToCellByAddress(report, xlvar8, 'OK')
	ExcelKeywords.saveWorkbook(excelFile, workbook)
}

else if (WebUI.verifyElementClickable(Path.CLOSE_PROMO_HEALT, FailureHandling.OPTIONAL) == true)
{
	WebUI.click(Path.CLOSE_PROMO_HEALT)
	ExcelKeywords.setValueToCellByAddress(report, xlvar8, 'Not Using PROMO')
	ExcelKeywords.saveWorkbook(excelFile, workbook)
}
WebUI.click(Path.CLOSE_HELP, FailureHandling.OPTIONAL)
WebUI.click(Path.BUTTON_LANJUT_PREMI)
ExcelKeywords.setValueToCellByAddress(report, xlvar7, 'OK')
ExcelKeywords.saveWorkbook(excelFile, workbook)
//STEP 6 DATA DIRI
WebUI.click(Path.INPUT_NAMA_SESUAI_KTP)
WebUI.setText(Path.INPUT_NAMA_SESUAI_KTP, nama_ktp)
WebUI.click(Path.INPUT_NO_KTP)
WebUI.setText(Path.INPUT_NO_KTP, no_ktp)
//WebUI.click(Path.BUTTON_UPLOAD)
WebUI.uploadFile(Path.UPLOAD_FILE, file)
WebUI.click(Path.BUTTON_LANJUT_DATA_KTP)
ExcelKeywords.setValueToCellByAddress(report, xlvar9, 'OK')
ExcelKeywords.saveWorkbook(excelFile, workbook)
//START backtohome=========================================================
if (WebUI.verifyElementClickable(Path.BACK_TO_HOME, FailureHandling.OPTIONAL)==true)
								{
									WebUI.click(Path.BACK_TO_HOME)
									KeywordUtil.markPassed("DATA EXIST - BACK TO HOME")
									ExcelKeywords.setValueToCellByAddress(report, xlvar9, 'Data Exist - Back to Home')
									ExcelKeywords.setValueToCellByAddress(report, xlvar10, '')
									ExcelKeywords.setValueToCellByAddress(report, xlvar11, '')
									ExcelKeywords.setValueToCellByAddress(report, xlvar12, '')
									ExcelKeywords.setValueToCellByAddress(report, xlstat, 'PASSED WITH WARNING')
									ExcelKeywords.setValueToCellByAddress(report, xlpay, 'No Such Transaction on DOKU!')
									ExcelKeywords.saveWorkbook(excelFile, workbook)
								}
//END backtohome=========================================================
//ELSEBACK TO HOME==================================================
else {								
//ELSEBACK TO HOME==================================================
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
String dataexist = dataexistcon
TestObject btnexist = new TestObject("existing")
btnexist.addProperty("class", ConditionType.EQUALS, dataexist)
if (WebUI.verifyElementVisible(btnexist, FailureHandling.OPTIONAL) == true)
	{
		WebUI.click(btnexist)	
		ExcelKeywords.setValueToCellByAddress(report, xlvar9, 'OK')
		ExcelKeywords.saveWorkbook(excelFile, workbook)
		
			if (WebUI.verifyElementVisible(Path.INPUT_NO_HP, FailureHandling.OPTIONAL) == true)
				{
//calltestcasehp
					WebUI.callTestCase(findTestCase('c_tc/call_health/no_hp'), [('no_hp') : no_hp, ('email') : email, ('alamat') : alamat, ('provinsi') : provinsi, ('kodepos') : kodepos], FailureHandling.STOP_ON_FAILURE)
					ExcelKeywords.setValueToCellByAddress(report, xlvar10, 'Rewrite Existing Data')
					ExcelKeywords.saveWorkbook(excelFile, workbook)
					//STEP 7 RINGKASAN PERTANGGUNGAN
					WebUI.scrollToElement(Path.CHECKLIST_SYARAT_KETENTUAN, 0)
					WebUI.click(Path.CLOSE_HELP, FailureHandling.OPTIONAL)
					WebUI.check(Path.CHECKLIST_SYARAT_KETENTUAN)
					WebUI.click(Path.CLOSE_HELP, FailureHandling.OPTIONAL)
					WebUI.click(Path.BUTTON_SAYA_SETUJU)
					WebUI.scrollToElement(Path.VERIFY_PREMI_HEALTH, 0)
					if (WebUI.verifyElementText(Path.VERIFY_PREMI_HEALTH, verify_premi_health, FailureHandling.OPTIONAL) == false)
							{
						KeywordUtil.markError("PREMI YANG ANDA INPUT TIDAK SESUAI")
						ExcelKeywords.setValueToCellByAddress(report, xlvar11, 'Unmatch Premi')
						WebUI.click(Path.BUTTON_BAYAR_HEALTH)
						ExcelKeywords.setValueToCellByAddress(report, xlvar12, 'OK')
						ExcelKeywords.setValueToCellByAddress(report, xlstat, 'PASSED WITH WARNING')
						WebUI.waitForElementVisible(Path.PEMBAYARAN_BUTTON_BAYAR_VISA_CC, 30)
						WebUI.click(Path.PEMBAYARAN_BUTTON_BAYAR_VISA_CC)
						WebUI.callTestCase(findTestCase('cformRecur/wcc-default'), [('nomor_credit_card') : nomor_credit_card, ('bulan_expired_cc') : bulan_expired_cc, ('tahun_expired_cc') : tahun_expired_cc
							, ('cvv') : cvv, ('cc_nama') : nama_ktp, ('cc_alamat') : alamat, ('cc_kota') : cc_kota, ('cc_negara') : cc_negara, ('cc_provinsi') : provinsi
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
						ExcelKeywords.setValueToCellByAddress(report, xlvar11, 'OK')
						WebUI.click(Path.BUTTON_BAYAR_HEALTH)
						ExcelKeywords.setValueToCellByAddress(report, xlvar12, 'OK')
						ExcelKeywords.setValueToCellByAddress(report, xlstat, 'PASSED')
						WebUI.waitForElementVisible(Path.PEMBAYARAN_BUTTON_BAYAR_VISA_CC, 30)
						WebUI.click(Path.PEMBAYARAN_BUTTON_BAYAR_VISA_CC)
						WebUI.callTestCase(findTestCase('cformRecur/wcc-default'), [('nomor_credit_card') : nomor_credit_card, ('bulan_expired_cc') : bulan_expired_cc, ('tahun_expired_cc') : tahun_expired_cc
							, ('cvv') : cvv, ('cc_nama') : nama_ktp, ('cc_alamat') : alamat, ('cc_kota') : cc_kota, ('cc_negara') : cc_negara, ('cc_provinsi') : provinsi
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
//USING EXISTING DATA		
			else
							{
								ExcelKeywords.setValueToCellByAddress(report, xlvar10, 'Using Existing Data')
								ExcelKeywords.saveWorkbook(excelFile, workbook)
								WebUI.scrollToElement(Path.CHECKLIST_SYARAT_KETENTUAN, 0)
								WebUI.click(Path.CLOSE_HELP, FailureHandling.OPTIONAL)
								WebUI.check(Path.CHECKLIST_SYARAT_KETENTUAN)
								WebUI.click(Path.CLOSE_HELP, FailureHandling.OPTIONAL)
								WebUI.click(Path.BUTTON_SAYA_SETUJU)
								WebUI.scrollToElement(Path.VERIFY_PREMI_HEALTH, 0)
								if (WebUI.verifyElementText(Path.VERIFY_PREMI_HEALTH, verify_premi_health, FailureHandling.OPTIONAL) == false)
										{
									KeywordUtil.markError("PREMI YANG ANDA INPUT TIDAK SESUAI")
									ExcelKeywords.setValueToCellByAddress(report, xlvar11, 'Unmatch Premi')
									WebUI.click(Path.BUTTON_BAYAR_HEALTH)
									ExcelKeywords.setValueToCellByAddress(report, xlvar12, 'OK')
									ExcelKeywords.setValueToCellByAddress(report, xlstat, 'PASSED WITH WARNING')
									WebUI.waitForElementVisible(Path.PEMBAYARAN_BUTTON_BAYAR_VISA_CC, 30)
									WebUI.click(Path.PEMBAYARAN_BUTTON_BAYAR_VISA_CC)
									WebUI.callTestCase(findTestCase('cformRecur/wcc-default'), [('nomor_credit_card') : nomor_credit_card, ('bulan_expired_cc') : bulan_expired_cc, ('tahun_expired_cc') : tahun_expired_cc
										, ('cvv') : cvv, ('cc_nama') : nama_ktp, ('cc_alamat') : alamat, ('cc_kota') : cc_kota, ('cc_negara') : cc_negara, ('cc_provinsi') : provinsi
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
									ExcelKeywords.setValueToCellByAddress(report, xlvar11, 'OK')
									WebUI.click(Path.BUTTON_BAYAR_HEALTH)
									ExcelKeywords.setValueToCellByAddress(report, xlvar12, 'OK')
									ExcelKeywords.setValueToCellByAddress(report, xlstat, 'PASSED')
									WebUI.waitForElementVisible(Path.PEMBAYARAN_BUTTON_BAYAR_VISA_CC, 30)
									WebUI.click(Path.PEMBAYARAN_BUTTON_BAYAR_VISA_CC)
									WebUI.callTestCase(findTestCase('cformRecur/wcc-default'), [('nomor_credit_card') : nomor_credit_card, ('bulan_expired_cc') : bulan_expired_cc, ('tahun_expired_cc') : tahun_expired_cc
										, ('cvv') : cvv, ('cc_nama') : nama_ktp, ('cc_alamat') : alamat, ('cc_kota') : cc_kota, ('cc_negara') : cc_negara, ('cc_provinsi') : provinsi
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
WebUI.callTestCase(findTestCase('c_tc/call_health/no_hp'), [('no_hp') : no_hp, ('email') : email, ('alamat') : alamat, ('provinsi') : provinsi, ('kodepos') : kodepos], FailureHandling.STOP_ON_FAILURE)
ExcelKeywords.setValueToCellByAddress(report, xlvar10, 'OK')
ExcelKeywords.saveWorkbook(excelFile, workbook)
//STEP 7 RINGKASAN PERTANGGUNGAN
WebUI.scrollToElement(Path.CHECKLIST_SYARAT_KETENTUAN, 0)
WebUI.click(Path.CLOSE_HELP, FailureHandling.OPTIONAL)
WebUI.check(Path.CHECKLIST_SYARAT_KETENTUAN)
WebUI.click(Path.CLOSE_HELP, FailureHandling.OPTIONAL)
WebUI.click(Path.BUTTON_SAYA_SETUJU)
WebUI.scrollToElement(Path.VERIFY_PREMI_HEALTH, 0)
if (WebUI.verifyElementText(Path.VERIFY_PREMI_HEALTH, verify_premi_health, FailureHandling.OPTIONAL) == false)
		{
	KeywordUtil.markError("PREMI YANG ANDA INPUT TIDAK SESUAI")
	ExcelKeywords.setValueToCellByAddress(report, xlvar11, 'Unmatch Premi')
	WebUI.click(Path.BUTTON_BAYAR_HEALTH)
	ExcelKeywords.setValueToCellByAddress(report, xlvar12, 'OK')
	ExcelKeywords.setValueToCellByAddress(report, xlstat, 'PASSED WITH WARNING')
	WebUI.waitForElementVisible(Path.PEMBAYARAN_BUTTON_BAYAR_VISA_CC, 30)
	WebUI.click(Path.PEMBAYARAN_BUTTON_BAYAR_VISA_CC)
	WebUI.callTestCase(findTestCase('cformRecur/wcc-default'), [('nomor_credit_card') : nomor_credit_card, ('bulan_expired_cc') : bulan_expired_cc, ('tahun_expired_cc') : tahun_expired_cc
		, ('cvv') : cvv, ('cc_nama') : nama_ktp, ('cc_alamat') : alamat, ('cc_kota') : cc_kota, ('cc_negara') : cc_negara, ('cc_provinsi') : provinsi
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
	ExcelKeywords.setValueToCellByAddress(report, xlvar11, 'OK')
	WebUI.click(Path.BUTTON_BAYAR_HEALTH)
	ExcelKeywords.setValueToCellByAddress(report, xlvar12, 'OK')
	ExcelKeywords.setValueToCellByAddress(report, xlstat, 'PASSED')
	WebUI.waitForElementVisible(Path.PEMBAYARAN_BUTTON_BAYAR_VISA_CC, 30)
	WebUI.click(Path.PEMBAYARAN_BUTTON_BAYAR_VISA_CC)
	WebUI.callTestCase(findTestCase('cformRecur/wcc-default'), [('nomor_credit_card') : nomor_credit_card, ('bulan_expired_cc') : bulan_expired_cc, ('tahun_expired_cc') : tahun_expired_cc
		, ('cvv') : cvv, ('cc_nama') : nama_ktp, ('cc_alamat') : alamat, ('cc_kota') : cc_kota, ('cc_negara') : cc_negara, ('cc_provinsi') : provinsi
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