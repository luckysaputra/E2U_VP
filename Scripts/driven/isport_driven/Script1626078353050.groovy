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
report = ExcelKeywords.getExcelSheet(workbook, 'iSport')
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
//STEP 1 PRODUCT LIFE
WebUI.click(Path.BUTTON_SPORT)
WebUI.click(Path.BUTTON_BELI_iSport)
ExcelKeywords.setValueToCellByAddress(report, xlvar1, 'OK')
ExcelKeywords.saveWorkbook(excelFile, workbook)
WebUI.click(Path.COMBOBOX_SAYA_MEMBELI_ASURANSI_UNTUK_SPORT)
WebUI.click(Path.CLOSE_PROMO_POPUP, FailureHandling.OPTIONAL)
//untukcon========================================================================================================
WebUI.callTestCase(findTestCase('c_tc/call_sport/untuk'), [('untuk') : untuk], FailureHandling.STOP_ON_FAILURE)
//end untukcon========================================================================================================
WebUI.click(Path.COMBOBOX_OLAHRAGA_PILIHAN_SPORT)
WebUI.setText(Path.INPUT_COMBOBOX_OLAHRAGA_PILIHAN_SPORT, olahraga)
WebUI.sendKeys(Path.INPUT_COMBOBOX_OLAHRAGA_PILIHAN_SPORT, Keys.chord(Keys.ENTER))
WebUI.click(Path.COMBOBOX_BERLAKU_UNTUK_SPORT)
//berlakucom========================================================================================================
WebUI.callTestCase(findTestCase('c_tc/call_sport/berlaku'), [('berlaku') : berlaku], FailureHandling.STOP_ON_FAILURE)
//end berlakucom========================================================================================================
WebUI.setText(Path.DATEPICKER_MULAI_SPORT, tanggal_mulai_asuransi_sport)
WebUI.sendKeys(Path.DATEPICKER_MULAI_SPORT, Keys.chord(Keys.ENTER))
WebUI.click(Path.COMBOBOX_BESAR_PERTANGGUNGAN_SPORT)
//pertanggungancon========================================================================================================
WebUI.callTestCase(findTestCase('c_tc/call_sport/pertanggungan'), [('pertanggungan') : pertanggungan], FailureHandling.STOP_ON_FAILURE)
//end pertanggungancon========================================================================================================
//perlindungantambahan========================================================================================================
WebUI.callTestCase(findTestCase('c_tc/call_sport/perlindungantambahan'), [('perlindungan_tambahan') : perlindungan_tambahan], FailureHandling.STOP_ON_FAILURE)
//end perlindungantambahan========================================================================================================
//perlindungantambahan2========================================================================================================
WebUI.callTestCase(findTestCase('c_tc/call_sport/perlindungantambahan'), [('perlindungan_tambahan') : perlindungan_tambahan_2], FailureHandling.STOP_ON_FAILURE)
//end perlindungantambahan2========================================================================================================
WebUI.click(Path.BUTTON_HITUNG_SPORT)
ExcelKeywords.setValueToCellByAddress(report, xlvar2, 'OK')
ExcelKeywords.saveWorkbook(excelFile, workbook)
WebUI.scrollToElement(Path.BUTTON_AMBIL_SPORT, 0)
WebUI.click(Path.BUTTON_AMBIL_SPORT)
ExcelKeywords.setValueToCellByAddress(report, xlvar3, 'OK')
ExcelKeywords.saveWorkbook(excelFile, workbook)
//STEP 2 KOMUNITAS
WebUI.click(Path.COMBOBOX_KODE_KOMUNITAS_SPORT)
//memiliki_komunitas========================================================================================================
WebUI.callTestCase(findTestCase('c_tc/call_sport/memiliki_komunitas'), [('memiliki_komunitas') : memiliki_komunitas], FailureHandling.STOP_ON_FAILURE)
//end memiliki_komunitas========================================================================================================
WebUI.click(Path.CLOSE_PROMO_POPUP, FailureHandling.OPTIONAL)
WebUI.setText(Path.INPUT_KODE_KOMUNITAS_SPORT, kode_komunitas, FailureHandling.OPTIONAL)
WebUI.click(Path.BUTTON_LANJUT_KOMUNITAS_SPORT)
ExcelKeywords.setValueToCellByAddress(report, xlvar4, 'OK')
ExcelKeywords.saveWorkbook(excelFile, workbook)
//STEP 3 DATA DIRI SPORT
WebUI.setText(Path.INPUT_NAMA_KTP_SPORT, nama_ktp_pembeli)
WebUI.click(Path.COMBOBOX_GENDER_SPORT)
//convertgender=======================================================================================================
WebUI.callTestCase(findTestCase('call_con/gender'), [('gender') : gender], FailureHandling.STOP_ON_FAILURE)
//end convertgender=======================================================================================================
WebUI.setText(Path.DATEPICKER_TANGGAL_LAHIR_SPORT, tanggal_lahir_pembeli)
WebUI.setText(Path.INPUT_NO_KTP_SPORT, no_ktp_pembeli)
WebUI.uploadFile(Path.UPLOAD_KTP_SPORT, foto_ktp_pembeli)
WebUI.click(Path.BUTTON_LANJUT_DATA_DIRI_SPORT)
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
		
		if (WebUI.verifyElementVisible(Path.INPUT_NO_HP_SPORT, FailureHandling.OPTIONAL) == true)
			{
				WebUI.setText(Path.INPUT_NO_HP_SPORT, no_hp_pembeli)
				WebUI.setText(Path.INPUT_EMAIL_SPORT, email_pembeli)
				WebUI.setText(Path.INPUT_TEMPAT_TINGGAL_SPORT, alamat_pembeli)
				WebUI.click(Path.COMBOBOX_PROVINSI_SPORT)
				WebUI.setText(Path.INPUT_COMBOBOX_PROVINSI_SPORT, provinsi_pembeli)
				WebUI.sendKeys(Path.INPUT_COMBOBOX_PROVINSI_SPORT, Keys.chord(Keys.ENTER))
				WebUI.setText(Path.INPUT_KODEPOS_SPORT, kodepos_pembeli)
				if (WebUI.verifyElementClickable(Path.INPUT_NAMA_TERTANGGUNG_SPORT, FailureHandling.OPTIONAL) == true)
				{
				WebUI.setText(Path.INPUT_NAMA_TERTANGGUNG_SPORT, nama_tertanggung)
				WebUI.scrollToElement(Path.COMBOBOX_GENDER_TERTANGGUNG_SPORT, 0)
				WebUI.click(Path.COMBOBOX_GENDER_TERTANGGUNG_SPORT)
				//convertgender=======================================================================================================
				WebUI.callTestCase(findTestCase('call_con/gender'), [('gender') : gender_tertanggung], FailureHandling.STOP_ON_FAILURE)
				//end convertgender=======================================================================================================
				WebUI.setText(Path.DATEPICKER_TL_TERTANGGUNG_SPORT, tanggal_lahir_tertanggung)
				WebUI.sendKeys(Path.DATEPICKER_TL_TERTANGGUNG_SPORT, Keys.chord(Keys.ENTER))
				WebUI.click(Path.BUTTON_LANJUT_DATA_DETAIL_SPORT)
				ExcelKeywords.setValueToCellByAddress(report, xlvar6, 'Rewrite Existing Data')
				ExcelKeywords.saveWorkbook(excelFile, workbook)
				}
				else if (WebUI.verifyElementClickable(Path.BUTTON_LANJUT_SAYA_DETAIL_SPORT, FailureHandling.OPTIONAL) == true)
				{
				WebUI.click(Path.BUTTON_LANJUT_SAYA_DETAIL_SPORT)
				ExcelKeywords.setValueToCellByAddress(report, xlvar6, 'OK')
				ExcelKeywords.saveWorkbook(excelFile, workbook)
				}
				//STEP 5 RINGKASAN iSPORT
				WebUI.check(Path.CHECKBOX_SYARAT_DAN_KETENTUAN_SPORT)
				WebUI.click(Path.CLOSE_HELP, FailureHandling.OPTIONAL)
				WebUI.sendKeys(Path.BUTTON_SAYA_SETUJU_SPORT, Keys.chord(Keys.ENTER))
				if (WebUI.verifyElementText(Path.VERIFY_PREMI_SPORT, verify_premi_sport, FailureHandling.OPTIONAL) == false)
						{
					KeywordUtil.markError("PREMI YANG ANDA INPUT TIDAK SESUAI")
					ExcelKeywords.setValueToCellByAddress(report, xlvar7, 'Unmatch Premi')
					ExcelKeywords.saveWorkbook(excelFile, workbook)
					WebUI.scrollToElement(Path.BUTTON_BAYAR_SPORT, 0)
					WebUI.sendKeys(Path.BUTTON_BAYAR_SPORT, Keys.chord(Keys.ENTER))
					ExcelKeywords.setValueToCellByAddress(report, xlvar8, 'OK')
					ExcelKeywords.setValueToCellByAddress(report, xlstat, 'PASSED WITH WARNING')
					ExcelKeywords.saveWorkbook(excelFile, workbook)
//DOKU=====================================================================================================================
					WebUI.waitForElementVisible(Path.PEMBAYARAN_BUTTON_BAYAR_VISA_CC, 10)
					WebUI.click(Path.PEMBAYARAN_BUTTON_BAYAR_VISA_CC)
					WebUI.callTestCase(findTestCase('cformRecur/wcc-wv'), [('ccnum_1') : ccnum_1, ('ccnum_2') : ccnum_2, ('ccnum_3') : ccnum_3, ('ccnum_4') : ccnum_4
						, ('cc_month_expired') : cc_month_expired, ('cc_year_expired') : cc_year_expired, ('cvv') : cvv, ('cc_name') : nama_ktp_pembeli, ('cc_email') : email_pembeli, ('cc_phone_number') : no_hp_pembeli],
					FailureHandling.STOP_ON_FAILURE)
					OTP = WebUI.getText(Path.R_DOKU_OTP)
					println(OTP);
					//OTP_final = OTP.replace("Kado ", "")
					WebUI.setText(Path.R_DOKU_SET_OTP, OTP)
					WebUI.click(Path.R_DOKU_CLICK_SUBMIT_OTP)
					WebUI.waitForElementVisible(Path.DOKU_RED_RESULT, 30)
					dokustat_print = WebUI.getText(Path.DOKU_RED_RESULT)
					println(dokustat_print);
														//DOKU CONDITION
														if (WebUI.verifyElementText(Path.DOKU_RED_RESULT, "Transaction Successful", FailureHandling.OPTIONAL) == true)
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
														ExcelKeywords.saveWorkbook(excelFile, workbook)
						}
				else
						{
					ExcelKeywords.setValueToCellByAddress(report, xlvar7, 'OK')
					WebUI.scrollToElement(Path.BUTTON_BAYAR_SPORT, 0)
					WebUI.sendKeys(Path.BUTTON_BAYAR_SPORT, Keys.chord(Keys.ENTER))
					ExcelKeywords.setValueToCellByAddress(report, xlvar8, 'OK')
					ExcelKeywords.setValueToCellByAddress(report, xlstat, 'PASSED')
					ExcelKeywords.saveWorkbook(excelFile, workbook)
//DOKU=====================================================================================================================
					
					WebUI.click(Path.PEMBAYARAN_BUTTON_BAYAR_VISA_CC)
					WebUI.callTestCase(findTestCase('cformRecur/wcc-wv'), [('ccnum_1') : ccnum_1, ('ccnum_2') : ccnum_2, ('ccnum_3') : ccnum_3, ('ccnum_4') : ccnum_4
						, ('cc_month_expired') : cc_month_expired, ('cc_year_expired') : cc_year_expired, ('cvv') : cvv, ('cc_name') : nama_ktp_pembeli, ('cc_email') : email_pembeli, ('cc_phone_number') : no_hp_pembeli],
					FailureHandling.STOP_ON_FAILURE)
					OTP = WebUI.getText(Path.R_DOKU_OTP)
					println(OTP);
					//OTP_final = OTP.replace("Kado ", "")
					WebUI.setText(Path.R_DOKU_SET_OTP, OTP)
					WebUI.click(Path.R_DOKU_CLICK_SUBMIT_OTP)
					WebUI.waitForElementVisible(Path.DOKU_RED_RESULT, 30)
					dokustat_print = WebUI.getText(Path.DOKU_RED_RESULT)
					println(dokustat_print);
														//DOKU CONDITION
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
						}
				ExcelKeywords.saveWorkbook(excelFile, workbook)
			}
				
				
		else
			{
				if (WebUI.verifyElementClickable(Path.EXIST_NAMA_TERTANGGUNG, FailureHandling.OPTIONAL) == true)
					{
						WebUI.setText(Path.EXIST_NAMA_TERTANGGUNG, nama_tertanggung)
						WebUI.scrollToElement(Path.EXIST_GENDER_TERTANGGUNG, 0)
						WebUI.click(Path.EXIST_GENDER_TERTANGGUNG)
								//convertgender=======================================================================================================
				WebUI.callTestCase(findTestCase('call_con/gender'), [('gender') : gender_tertanggung], FailureHandling.STOP_ON_FAILURE)
				//end convertgender=======================================================================================================
						WebUI.setText(Path.EXIST_TANGGAL_LAHIR_TERTANGGUNG, tanggal_lahir_tertanggung)
						WebUI.sendKeys(Path.EXIST_TANGGAL_LAHIR_TERTANGGUNG, Keys.chord(Keys.ENTER))
						WebUI.click(Path.EXIST_BUTTON_LANJUT)
						ExcelKeywords.setValueToCellByAddress(report, xlvar6, 'OK')
						ExcelKeywords.saveWorkbook(excelFile, workbook)
						//line
						WebUI.check(Path.CHECKBOX_SYARAT_DAN_KETENTUAN_SPORT)
						WebUI.click(Path.CLOSE_HELP, FailureHandling.OPTIONAL)
						WebUI.sendKeys(Path.BUTTON_SAYA_SETUJU_SPORT, Keys.chord(Keys.ENTER))
						if (WebUI.verifyElementText(Path.VERIFY_PREMI_SPORT, verify_premi_sport, FailureHandling.OPTIONAL) == false)
								{
							KeywordUtil.markError("PREMI YANG ANDA INPUT TIDAK SESUAI")
							ExcelKeywords.setValueToCellByAddress(report, xlvar7, 'Unmatch Premi')
							ExcelKeywords.saveWorkbook(excelFile, workbook)
							WebUI.scrollToElement(Path.BUTTON_BAYAR_SPORT, 0)
							WebUI.sendKeys(Path.BUTTON_BAYAR_SPORT, Keys.chord(Keys.ENTER))
							ExcelKeywords.setValueToCellByAddress(report, xlvar8, 'OK')
							ExcelKeywords.setValueToCellByAddress(report, xlstat, 'PASSED WITH WARNING')
							ExcelKeywords.saveWorkbook(excelFile, workbook)
//DOKU=====================================================================================================================
							WebUI.waitForElementVisible(Path.PEMBAYARAN_BUTTON_BAYAR_VISA_CC, 10)
							WebUI.click(Path.PEMBAYARAN_BUTTON_BAYAR_VISA_CC)
							WebUI.callTestCase(findTestCase('cformRecur/wcc-wv'), [('ccnum_1') : ccnum_1, ('ccnum_2') : ccnum_2, ('ccnum_3') : ccnum_3, ('ccnum_4') : ccnum_4
								, ('cc_month_expired') : cc_month_expired, ('cc_year_expired') : cc_year_expired, ('cvv') : cvv, ('cc_name') : nama_ktp_pembeli, ('cc_email') : email_pembeli, ('cc_phone_number') : no_hp_pembeli],
							FailureHandling.STOP_ON_FAILURE)
							OTP = WebUI.getText(Path.R_DOKU_OTP)
							println(OTP);
							//OTP_final = OTP.replace("Kado ", "")
							WebUI.setText(Path.R_DOKU_SET_OTP, OTP)
							WebUI.click(Path.R_DOKU_CLICK_SUBMIT_OTP)
							WebUI.waitForElementVisible(Path.DOKU_RED_RESULT, 30)
							dokustat_print = WebUI.getText(Path.DOKU_RED_RESULT)
							println(dokustat_print);
																//DOKU CONDITION
																if (WebUI.verifyElementText(Path.DOKU_RED_RESULT, "Transaction Successful", FailureHandling.OPTIONAL) == true)
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
																ExcelKeywords.saveWorkbook(excelFile, workbook)
								}
						else
								{
							ExcelKeywords.setValueToCellByAddress(report, xlvar7, 'OK')
							WebUI.scrollToElement(Path.BUTTON_BAYAR_SPORT, 0)
							WebUI.sendKeys(Path.BUTTON_BAYAR_SPORT, Keys.chord(Keys.ENTER))
							ExcelKeywords.setValueToCellByAddress(report, xlvar8, 'OK')
							ExcelKeywords.setValueToCellByAddress(report, xlstat, 'PASSED')
							ExcelKeywords.saveWorkbook(excelFile, workbook)
								}
						ExcelKeywords.saveWorkbook(excelFile, workbook)
					}
//USING EXISTING DATA	
				else
					{
						ExcelKeywords.setValueToCellByAddress(report, xlvar6, 'Using Existing Data')
						ExcelKeywords.saveWorkbook(excelFile, workbook)
						WebUI.check(Path.CHECKBOX_SYARAT_DAN_KETENTUAN_SPORT)
						WebUI.click(Path.CLOSE_HELP, FailureHandling.OPTIONAL)
						WebUI.sendKeys(Path.BUTTON_SAYA_SETUJU_SPORT, Keys.chord(Keys.ENTER))
						if (WebUI.verifyElementText(Path.VERIFY_PREMI_SPORT, verify_premi_sport, FailureHandling.OPTIONAL) == false)
								{
									KeywordUtil.markError("PREMI YANG ANDA INPUT TIDAK SESUAI")
									ExcelKeywords.setValueToCellByAddress(report, xlvar7, 'Unmatch Premi')
									ExcelKeywords.saveWorkbook(excelFile, workbook)
									WebUI.scrollToElement(Path.BUTTON_BAYAR_SPORT, 0)
									WebUI.sendKeys(Path.BUTTON_BAYAR_SPORT, Keys.chord(Keys.ENTER))
									ExcelKeywords.setValueToCellByAddress(report, xlvar8, 'OK')
									ExcelKeywords.setValueToCellByAddress(report, xlstat, 'PASSED WITH WARNING')
									ExcelKeywords.saveWorkbook(excelFile, workbook)
								}
						else
								{
									ExcelKeywords.setValueToCellByAddress(report, xlvar7, 'OK')
									WebUI.scrollToElement(Path.BUTTON_BAYAR_SPORT, 0)
									WebUI.sendKeys(Path.BUTTON_BAYAR_SPORT, Keys.chord(Keys.ENTER))
									ExcelKeywords.setValueToCellByAddress(report, xlvar8, 'OK')
									ExcelKeywords.setValueToCellByAddress(report, xlstat, 'PASSED')
									ExcelKeywords.saveWorkbook(excelFile, workbook)
//DOKU=====================================================================================================================
									WebUI.waitForElementVisible(Path.PEMBAYARAN_BUTTON_BAYAR_VISA_CC, 10)
									WebUI.click(Path.PEMBAYARAN_BUTTON_BAYAR_VISA_CC)
									WebUI.callTestCase(findTestCase('cformRecur/wcc-wv'), [('ccnum_1') : ccnum_1, ('ccnum_2') : ccnum_2, ('ccnum_3') : ccnum_3, ('ccnum_4') : ccnum_4
										, ('cc_month_expired') : cc_month_expired, ('cc_year_expired') : cc_year_expired, ('cvv') : cvv, ('cc_name') : nama_ktp_pembeli, ('cc_email') : email_pembeli, ('cc_phone_number') : no_hp_pembeli],
									FailureHandling.STOP_ON_FAILURE)
									OTP = WebUI.getText(Path.R_DOKU_OTP)
									println(OTP);
									//OTP_final = OTP.replace("Kado ", "")
									WebUI.setText(Path.R_DOKU_SET_OTP, OTP)
									WebUI.click(Path.R_DOKU_CLICK_SUBMIT_OTP)
									WebUI.waitForElementVisible(Path.DOKU_RED_RESULT, 30)
									dokustat_print = WebUI.getText(Path.DOKU_RED_RESULT)
									println(dokustat_print);
																		//DOKU CONDITION
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
								}
								ExcelKeywords.saveWorkbook(excelFile, workbook)
					}
			}
	}
	
else
{
//STEP 4 DETAIL DATA SPORT
WebUI.setText(Path.INPUT_NO_HP_SPORT, no_hp_pembeli)
WebUI.setText(Path.INPUT_EMAIL_SPORT, email_pembeli)
WebUI.setText(Path.INPUT_TEMPAT_TINGGAL_SPORT, alamat_pembeli)
WebUI.click(Path.COMBOBOX_PROVINSI_SPORT)
WebUI.setText(Path.INPUT_COMBOBOX_PROVINSI_SPORT, provinsi_pembeli)
WebUI.sendKeys(Path.INPUT_COMBOBOX_PROVINSI_SPORT, Keys.chord(Keys.ENTER))
WebUI.setText(Path.INPUT_KODEPOS_SPORT, kodepos_pembeli)
if (WebUI.verifyElementClickable(Path.INPUT_NAMA_TERTANGGUNG_SPORT, FailureHandling.OPTIONAL) == true)
{
WebUI.setText(Path.INPUT_NAMA_TERTANGGUNG_SPORT, nama_tertanggung)
WebUI.scrollToElement(Path.COMBOBOX_GENDER_TERTANGGUNG_SPORT, 0)
WebUI.click(Path.COMBOBOX_GENDER_TERTANGGUNG_SPORT)
				//convertgender=======================================================================================================
				WebUI.callTestCase(findTestCase('call_con/gender'), [('gender') : gender_tertanggung], FailureHandling.STOP_ON_FAILURE)
				//end convertgender=======================================================================================================
WebUI.setText(Path.DATEPICKER_TL_TERTANGGUNG_SPORT, tanggal_lahir_tertanggung)
WebUI.sendKeys(Path.DATEPICKER_TL_TERTANGGUNG_SPORT, Keys.chord(Keys.ENTER))
WebUI.click(Path.BUTTON_LANJUT_DATA_DETAIL_SPORT)
ExcelKeywords.setValueToCellByAddress(report, xlvar6, 'OK')
ExcelKeywords.saveWorkbook(excelFile, workbook)
}
else if (WebUI.verifyElementClickable(Path.BUTTON_LANJUT_SAYA_DETAIL_SPORT, FailureHandling.OPTIONAL) == true)
{
WebUI.click(Path.BUTTON_LANJUT_SAYA_DETAIL_SPORT)
ExcelKeywords.setValueToCellByAddress(report, xlvar6, 'OK')
ExcelKeywords.saveWorkbook(excelFile, workbook)
}
//STEP 5 RINGKASAN iSPORT
WebUI.check(Path.CHECKBOX_SYARAT_DAN_KETENTUAN_SPORT)
WebUI.click(Path.CLOSE_HELP, FailureHandling.OPTIONAL)
WebUI.sendKeys(Path.BUTTON_SAYA_SETUJU_SPORT, Keys.chord(Keys.ENTER))
if (WebUI.verifyElementText(Path.VERIFY_PREMI_SPORT, verify_premi_sport, FailureHandling.OPTIONAL) == false)
		{
	KeywordUtil.markError("PREMI YANG ANDA INPUT TIDAK SESUAI")
	ExcelKeywords.setValueToCellByAddress(report, xlvar7, 'Unmatch Premi')
	ExcelKeywords.saveWorkbook(excelFile, workbook)
	WebUI.scrollToElement(Path.BUTTON_BAYAR_SPORT, 0)
	WebUI.sendKeys(Path.BUTTON_BAYAR_SPORT, Keys.chord(Keys.ENTER))
	ExcelKeywords.setValueToCellByAddress(report, xlvar8, 'OK')
	ExcelKeywords.setValueToCellByAddress(report, xlstat, 'PASSED WITH WARNING')
	ExcelKeywords.saveWorkbook(excelFile, workbook)
//DOKU=====================================================================================================================
	WebUI.waitForElementVisible(Path.PEMBAYARAN_BUTTON_BAYAR_VISA_CC, 10)
	WebUI.click(Path.PEMBAYARAN_BUTTON_BAYAR_VISA_CC)
	WebUI.callTestCase(findTestCase('cformRecur/wcc-wv'), [('ccnum_1') : ccnum_1, ('ccnum_2') : ccnum_2, ('ccnum_3') : ccnum_3, ('ccnum_4') : ccnum_4
		, ('cc_month_expired') : cc_month_expired, ('cc_year_expired') : cc_year_expired, ('cvv') : cvv, ('cc_name') : nama_ktp_pembeli, ('cc_email') : email_pembeli, ('cc_phone_number') : no_hp_pembeli],
	FailureHandling.STOP_ON_FAILURE)
	OTP = WebUI.getText(Path.R_DOKU_OTP)
	println(OTP);
	//OTP_final = OTP.replace("Kado ", "")
	WebUI.setText(Path.R_DOKU_SET_OTP, OTP)
	WebUI.click(Path.R_DOKU_CLICK_SUBMIT_OTP)
	WebUI.waitForElementVisible(Path.DOKU_RED_RESULT, 30)
	dokustat_print = WebUI.getText(Path.DOKU_RED_RESULT)
	println(dokustat_print);
										//DOKU CONDITION
										if (WebUI.verifyElementText(Path.DOKU_RED_RESULT, "Transaction Successful", FailureHandling.OPTIONAL) == true)
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
										ExcelKeywords.saveWorkbook(excelFile, workbook)
		}
else
		{
	ExcelKeywords.setValueToCellByAddress(report, xlvar7, 'OK')
	WebUI.scrollToElement(Path.BUTTON_BAYAR_SPORT, 0)
	WebUI.sendKeys(Path.BUTTON_BAYAR_SPORT, Keys.chord(Keys.ENTER))
	ExcelKeywords.setValueToCellByAddress(report, xlvar8, 'OK')
	ExcelKeywords.setValueToCellByAddress(report, xlstat, 'PASSED')
	ExcelKeywords.saveWorkbook(excelFile, workbook)
	WebUI.waitForElementVisible(Path.PEMBAYARAN_BUTTON_BAYAR_VISA_CC, 10)
	WebUI.click(Path.PEMBAYARAN_BUTTON_BAYAR_VISA_CC)
	WebUI.callTestCase(findTestCase('cformRecur/wcc-wv'), [('ccnum_1') : ccnum_1, ('ccnum_2') : ccnum_2, ('ccnum_3') : ccnum_3, ('ccnum_4') : ccnum_4
		, ('cc_month_expired') : cc_month_expired, ('cc_year_expired') : cc_year_expired, ('cvv') : cvv, ('cc_name') : nama_ktp_pembeli, ('cc_email') : email_pembeli, ('cc_phone_number') : no_hp_pembeli],
	FailureHandling.STOP_ON_FAILURE)
	OTP = WebUI.getText(Path.R_DOKU_OTP)
	println(OTP);
	//OTP_final = OTP.replace("Kado ", "")
	WebUI.setText(Path.R_DOKU_SET_OTP, OTP)
	WebUI.click(Path.R_DOKU_CLICK_SUBMIT_OTP)
	WebUI.waitForElementVisible(Path.DOKU_RED_RESULT, 30)
	dokustat_print = WebUI.getText(Path.DOKU_RED_RESULT)
	println(dokustat_print);
										//DOKU CONDITION
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
		}
ExcelKeywords.saveWorkbook(excelFile, workbook)
}