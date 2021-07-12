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
report = ExcelKeywords.getExcelSheet(workbook, 'Flexi_Critical_Illness')
ExcelKeywords.setValueToCellByAddress(report, 'C10', dtf.format(now))
ExcelKeywords.setValueToCellByAddress(report, xlvar1, 'Not OK')
ExcelKeywords.setValueToCellByAddress(report, xlvar2, 'Not OK')
ExcelKeywords.setValueToCellByAddress(report, xlvar3, 'Not OK')
ExcelKeywords.setValueToCellByAddress(report, xlvar4, 'Not OK')
ExcelKeywords.setValueToCellByAddress(report, xlvar5, 'Not OK')
ExcelKeywords.setValueToCellByAddress(report, xlvar6, 'Not OK')
ExcelKeywords.setValueToCellByAddress(report, xlvar7, 'Not OK')
ExcelKeywords.setValueToCellByAddress(report, xlvar8, 'Not OK')
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
//STEP 1 PRODUCT FLEXI HEALT
WebUI.mouseOver(Path.HEALT_DROPDOWN)
WebUI.click(Path.SELECT_FLEXI_CI)
WebUI.click(Path.BUTTON_CEK_SEKARANG_CI)
ExcelKeywords.setValueToCellByAddress(report, xlvar1, 'OK')
ExcelKeywords.saveWorkbook(excelFile, workbook)
//STEP 2 KUISIONER KESEHATAN
WebUI.click(Path.COMBOBOX_KUISIONER_KESEHATAN_CI)
WebUI.click(Path.SELECT_COMBOBOX_KESEHATAN_CI_TIDAK)
WebUI.click(Path.COMBOBOX_PERNAH_MENGAJUKAN_CI)
WebUI.click(Path.SELECT_COMBOBOX_MENGAJUKAN_CI_TIDAK)
WebUI.click(Path.CLOSE_PROMO_POPUP, FailureHandling.OPTIONAL)
WebUI.click(Path.BUTTON_LANJUT_SCRN1_CI)
ExcelKeywords.setValueToCellByAddress(report, xlvar2, 'OK')
ExcelKeywords.saveWorkbook(excelFile, workbook)
//STEP 3 HITUNG PREMI
WebUI.click(Path.COMBOBOX_GENDER_SCRN2_CI)
//convertgender=======================================================================================================
WebUI.callTestCase(findTestCase('call_con/gender'), [('gender') : gender], FailureHandling.STOP_ON_FAILURE)
//=======================================================================================================
WebUI.setText(Path.INPUT_TANGGAL_LAHIR_SCRN2_CI, tanggal_lahir)
WebUI.setText(Path.INPUT_BERAT_BADAN_SCRN2_CI, berat_badan)
WebUI.setText(Path.INPUT_TINGGI_BADAN_SCRN2_CI, tinggi_badan)
WebUI.waitForElementClickable(Path.INPUT_UANG_PERTANGGUNGAN_YANG_DIINGINKAN_SCRN2_CI, 1)
WebUI.click(Path.INPUT_UANG_PERTANGGUNGAN_YANG_DIINGINKAN_SCRN2_CI)
WebUI.setText(Path.INPUT_UANG_PERTANGGUNGAN_YANG_DIINGINKAN_SCRN2_CI, jumlah_pertanggungan)
WebUI.click(Path.COMBOBOX_PEMBAYARAN_PREMI_SCRN2_CI)
WebUI.scrollToElement(Path.BUTTON_HITUNG_SCRN2_CI, 0)
//convertpremi=======================================================================================================
WebUI.callTestCase(findTestCase('call_con/premi'), [('premi') : premi], FailureHandling.STOP_ON_FAILURE)
//=======================================================================================================
WebUI.click(Path.BUTTON_HITUNG_SCRN2_CI)
ExcelKeywords.setValueToCellByAddress(report, xlvar3, 'OK')
ExcelKeywords.saveWorkbook(excelFile, workbook)
WebUI.click(Path.BUTTON_AMBIL_SCRN2_CI)
ExcelKeywords.setValueToCellByAddress(report, xlvar4, 'OK')
ExcelKeywords.saveWorkbook(excelFile, workbook)
//STEP 4 INPUT INFORMASI NASABAH
WebUI.setText(Path.INPUT_NAMA_SESUAI_KTP_CI, nama_sesuai_ktp)
WebUI.setText(Path.INPUT_NO_KTP_CI, no_ktp)
WebUI.uploadFile(Path.UPLOAD_FILE, file)
WebUI.click(Path.BUTTON_LANJUT_DATA_DIRI_SCRN3_CI)
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

	
		if (WebUI.verifyElementVisible(Path.INPUT_NO_HP_SCRN3_CI, FailureHandling.OPTIONAL) == true)
		{
			WebUI.setText(Path.INPUT_NO_HP_SCRN3_CI, no_hp)
			WebUI.setText(Path.INPUT_EMAIL_SCRN3_CI, email)
			WebUI.setText(Path.INPUT_ALAMAT_SCRN3_CI, alamat)
			WebUI.click(Path.COMBOBOX_PROVINSI_SCRN3_CI)
			WebUI.setText(Path.INPUT_PROVINSI_SCRN3_CI, provinsi)
			WebUI.sendKeys(Path.INPUT_PROVINSI_SCRN3_CI, Keys.chord(Keys.ENTER))
			WebUI.setText(Path.INPUT_KODEPOS_SCRN3_CI, kodepos)
			WebUI.click(Path.BUTTON_LANJUT_SCRN3_CI)
			ExcelKeywords.setValueToCellByAddress(report, xlvar6, 'Rewrite Existing Data')
			ExcelKeywords.saveWorkbook(excelFile, workbook)
			//STEP 5
			WebUI.scrollToElement(Path.LINK_SYARAT_DAN_KETENTUAN_SCRN4_CI, 0)
			WebUI.click(Path.LINK_SYARAT_DAN_KETENTUAN_SCRN4_CI)
			WebUI.click(Path.CLOSE_HELP, FailureHandling.OPTIONAL)
			WebUI.click(Path.BUTTON_SAYA_SETUJU_SCRN4_CI)
			WebUI.scrollToElement(Path.VERIFY_PREMI_CI, 0)
				
					if (WebUI.verifyElementText(Path.VERIFY_PREMI_CI, verify_premi_ci, FailureHandling.OPTIONAL) == false)
						{
							actual_premi = (WebUI.getText(Path.VERIFY_PREMI_CI))
							ExcelKeywords.setValueToCellByAddress(report, xlpremi, actual_premi)
							ExcelKeywords.saveWorkbook(excelFile, workbook)
							KeywordUtil.markError("PREMI YANG ANDA INPUT TIDAK SESUAI")
							ExcelKeywords.setValueToCellByAddress(report, xlvar7, 'Unmatch Premi')
							WebUI.click(Path.BUTTON_BAYAR_SCRN4_CI)
							ExcelKeywords.setValueToCellByAddress(report, xlvar8, 'OK')
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
							actual_premi = (WebUI.getText(Path.VERIFY_PREMI_CI))
							ExcelKeywords.setValueToCellByAddress(report, xlpremi, actual_premi)
							ExcelKeywords.saveWorkbook(excelFile, workbook)
							ExcelKeywords.setValueToCellByAddress(report, xlvar7, 'OK')
							WebUI.click(Path.BUTTON_BAYAR_SCRN4_CI)
							ExcelKeywords.setValueToCellByAddress(report, xlvar8, 'OK')
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
//USING EXISTING DATA
		else
		{
			ExcelKeywords.setValueToCellByAddress(report, xlvar6, 'Using Existing Data')
			ExcelKeywords.saveWorkbook(excelFile, workbook)
			WebUI.scrollToElement(Path.LINK_SYARAT_DAN_KETENTUAN_SCRN4_CI, 0)
			WebUI.click(Path.LINK_SYARAT_DAN_KETENTUAN_SCRN4_CI)
			WebUI.click(Path.CLOSE_HELP, FailureHandling.OPTIONAL)
			WebUI.click(Path.BUTTON_SAYA_SETUJU_SCRN4_CI)
			WebUI.scrollToElement(Path.VERIFY_PREMI_CI, 0)
				
					if (WebUI.verifyElementText(Path.VERIFY_PREMI_CI, verify_premi_ci, FailureHandling.OPTIONAL) == false)
						{
							actual_premi = (WebUI.getText(Path.VERIFY_PREMI_CI))
							ExcelKeywords.setValueToCellByAddress(report, xlpremi, actual_premi)
							ExcelKeywords.saveWorkbook(excelFile, workbook)
							KeywordUtil.markError("PREMI YANG ANDA INPUT TIDAK SESUAI")
							ExcelKeywords.setValueToCellByAddress(report, xlvar7, 'Unmatch Premi')
							WebUI.click(Path.BUTTON_BAYAR_SCRN4_CI)
							ExcelKeywords.setValueToCellByAddress(report, xlvar8, 'OK')
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
							actual_premi = (WebUI.getText(Path.VERIFY_PREMI_CI))
							ExcelKeywords.setValueToCellByAddress(report, xlpremi, actual_premi)
							ExcelKeywords.saveWorkbook(excelFile, workbook)
							ExcelKeywords.setValueToCellByAddress(report, xlvar7, 'OK')
							WebUI.click(Path.BUTTON_BAYAR_SCRN4_CI)
							ExcelKeywords.setValueToCellByAddress(report, xlvar8, 'OK')
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
WebUI.setText(Path.INPUT_NO_HP_SCRN3_CI, no_hp)
WebUI.setText(Path.INPUT_EMAIL_SCRN3_CI, email)
WebUI.setText(Path.INPUT_ALAMAT_SCRN3_CI, alamat)
WebUI.click(Path.COMBOBOX_PROVINSI_SCRN3_CI)
WebUI.setText(Path.INPUT_PROVINSI_SCRN3_CI, provinsi)
WebUI.sendKeys(Path.INPUT_PROVINSI_SCRN3_CI, Keys.chord(Keys.ENTER))
WebUI.setText(Path.INPUT_KODEPOS_SCRN3_CI, kodepos)
WebUI.click(Path.BUTTON_LANJUT_SCRN3_CI)
ExcelKeywords.setValueToCellByAddress(report, xlvar6, 'OK')
ExcelKeywords.saveWorkbook(excelFile, workbook)
//STEP 5
WebUI.scrollToElement(Path.LINK_SYARAT_DAN_KETENTUAN_SCRN4_CI, 0)
WebUI.click(Path.LINK_SYARAT_DAN_KETENTUAN_SCRN4_CI)
WebUI.click(Path.CLOSE_HELP, FailureHandling.OPTIONAL)
WebUI.click(Path.BUTTON_SAYA_SETUJU_SCRN4_CI)
WebUI.scrollToElement(Path.VERIFY_PREMI_CI, 0)
					if (WebUI.verifyElementText(Path.VERIFY_PREMI_CI, verify_premi_ci, FailureHandling.OPTIONAL) == false)
							{
								actual_premi = (WebUI.getText(Path.VERIFY_PREMI_CI))
								ExcelKeywords.setValueToCellByAddress(report, xlpremi, actual_premi)
								ExcelKeywords.saveWorkbook(excelFile, workbook)
								KeywordUtil.markError("PREMI YANG ANDA INPUT TIDAK SESUAI")
								ExcelKeywords.setValueToCellByAddress(report, xlvar7, 'Unmatch Premi')
								WebUI.click(Path.BUTTON_BAYAR_SCRN4_CI)
								ExcelKeywords.setValueToCellByAddress(report, xlvar8, 'OK')
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
								actual_premi = (WebUI.getText(Path.VERIFY_PREMI_CI))
								ExcelKeywords.setValueToCellByAddress(report, xlpremi, actual_premi)
								ExcelKeywords.saveWorkbook(excelFile, workbook)
								ExcelKeywords.setValueToCellByAddress(report, xlvar7, 'OK')
								WebUI.click(Path.BUTTON_BAYAR_SCRN4_CI)
								ExcelKeywords.setValueToCellByAddress(report, xlvar8, 'OK')
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