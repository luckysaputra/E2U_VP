package option

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import org.eclipse.persistence.internal.helper.CustomObjectInputStream

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.thoughtworks.selenium.webdriven.commands.GetXpathCount

import config.Cases as CustomObject

import internal.GlobalVariable

public class ManageData {

	public static final PROMO_CLOSE = CustomObject.getXpathTestObject("/html/body/div[4]/div[3]/div[4]")
	public static final CLOSE_AVA_ASSISTANT = CustomObject.getClassTestObject("closeButton_6146")
	public static final GENDER_XPATH = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-life-registration/div/section/div/div/div/div[3]/div[1]/h2/ng-select2/select")
	public static final PEMBAYARAN_PREMI = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-life-registration/div/section/div/div/div/div[3]/div[5]/h2/ng-select2/select")
	public static final CLOSE_PROMO_POPUP = CustomObject.getClassTestObject("prehook-close")
	public static final OPEN_HELP = CustomObject.getIdTestObject("jivo_custom_widget")
	public static final CLOSE_HELP = CustomObject.getIdTestObject("jivo_close_button")
	public static final PROMO_BULANAN_CLOSE = CustomObject.getClassTestObject("element-content cf-button cf-button-primary cf-text-element cf-button-slim  cf-button-regular")
	public static final BACK_TO_HOME = CustomObject.getClassTestObject("btn blue min mb-2 js-continue-registration")
	//AL VERIFY
	public static final ILOVELIFE_RESULT = CustomObject.getClassTestObject("description")
	//VERIFY DOKU DEFAULT
	public static final DOKU_RESULT = CustomObject.getXpathTestObject("/html/body/section/section/section/section/div/div[1]")
	//VERIFY DOKU RED
	public static final DOKU_RED_RESULT = CustomObject.getClassTestObject("fleft text-notif-result")
	//PILIH PEMBAYARAN
	public static final PEMBAYARAN_VISA_CC = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-kado-registration/div/div/section/div/div/div[2]/div/div/div/div[1]/div[1]/div[2]")
	public static final PEMBAYARAN_BUTTON_BAYAR_VISA_CC = CustomObject.getClassTestObject("btn max primary js-payment-success")

	//RE-DOKU
	public static final R_DOKU_CCNUM = CustomObject.getIdTestObject("CCNUM")
	public static final R_DOKU_CCEXP = CustomObject.getIdTestObject("CCEXP")
	public static final R_DOKU_CVV2 = CustomObject.getIdTestObject("CVV2")

	public static final R_DOKU_CC_NAME = CustomObject.getIdTestObject("CC_NAME")
	public static final R_DOKU_EMAIL = CustomObject.getIdTestObject("EMAIL")
	public static final R_DOKU_MOBILEPHONE = CustomObject.getIdTestObject("MOBILEPHONE")
	public static final R_DOKU_CC_PAY = CustomObject.getIdTestObject("CC-PAY-LANG")

	public static final R_DOKU_OTP = CustomObject.getXpathTestObject("/html/body/form/table/tbody/tr[2]/td/strong/font")
	public static final R_DOKU_SET_OTP = CustomObject.getIdTestObject("otp")
	public static final R_DOKU_CLICK_SUBMIT_OTP = CustomObject.getValueTestObject("SUBMIT")

	public static final R_DOKU_VERIFY_PAYMENT_SUCCESS_BY_DOKU = CustomObject.getXpathTestObject("/html/body/section/div[1]/div[2]/div[1]")
	public static final R_DOKU_VERIFY_PAYMENT_SUCCESS = CustomObject.getXpathTestObject("/html/body/app-root/div/app-payment-success/div/section/div/div/div/div[2]/div/h2")

	//DOKUDEF
	public static final DOKU_CARDNUMBER = CustomObject.getNameTestObject("CARDNUMBER")
	public static final DOKU_EXPIRYMONTH = CustomObject.getNameTestObject("EXPIRYMONTH")
	public static final DOKU_EXPIRYYEAR = CustomObject.getNameTestObject("EXPIRYYEAR")
	public static final DOKU_CVV2 = CustomObject.getNameTestObject("CVV2")
	public static final DOKU_CCNAME = CustomObject.getNameTestObject("CCNAME")

	public static final DOKU_CCADDRESS = CustomObject.getNameTestObject("CCADDRESS")
	public static final DOKU_CCCITY = CustomObject.getNameTestObject("CCCITY")
	public static final DOKU_CCCOUNTRY = CustomObject.getNameTestObject("CCCOUNTRY")
	public static final DOKU_CCSTATE = CustomObject.getNameTestObject("CCSTATE")
	public static final DOKU_CCZIPCODE = CustomObject.getNameTestObject("CCZIPCODE")
	public static final DOKU_CCEMAIL = CustomObject.getNameTestObject("CCEMAIL")
	public static final DOKU_CCMOBILEPHONE = CustomObject.getNameTestObject("CCMOBILEPHONE")
	public static final DOKU_AUTHSTATUS = CustomObject.getNameTestObject("AUTHSTATUS")
	public static final DOKU_BUTTON_PROSES_REGISTRASI = CustomObject.getValueTestObject("PROSES REGISTRASI")
	public static final DOKU_BUTTON_BATAL = CustomObject.getValueTestObject("BATAL")

	//FLEXI HEALTH (FH)

	//SCRN 1 (FH)
	public static final HEALT_DROPDOWN = CustomObject.getXpathTestObject("/html/body/app-root/div/app-home/section[1]/app-header/div/div[1]/div/div/div[2]/ul/li[2]/a")
	public static final SELECT_FLEXI_HEALTH = CustomObject.getXpathTestObject("/html/body/app-root/div/app-home/section[1]/app-header/div/div[1]/div/div/div[2]/ul/li[2]/div/ul/li[1]/a/div/div/h5")
	public static final BUTTON_CEK_SEKARANG = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-health/section[1]/div[1]/div/div/div/a[1]")
	public static final DROPDOWN_GENDER = CustomObject.getClassTestObject("select2-selection__arrow")
	//public static final PRIA1 = CustomObject.getValueTestObject("M")
	public static final SELECT_GENDER_PRIA = CustomObject.getXpathTestObject("/html/body/span/span/span[2]/ul/li[1]")
	//public static final WANITA1 = CustomObject.getValueTestObject("F")
	public static final SELECT_GENDER_WANITA = CustomObject.getXpathTestObject("/html/body/span/span/span[2]/ul/li[2]")
	public static final INPUT_USIA = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-health/section[3]/div/div/div/div/div/div[1]/h2/input")
	public static final INPUT_NOMINAL_SANTUNAN_HARIAN = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-health/section[3]/div/div/div/div/div/div[2]/div/h2/input")
	public static final BUTTON_HITUNG_PREMI = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-health/section[3]/div/div/div/div/div/div[3]/button")
	public static final MANFAAT_FLEXI_HEALTH = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-health/section[3]/div/div/div/div/div[2]/div[2]/div/table[1]/tbody/tr[1]/td[2]/h5")
	public static final CHECKBOX_RAWAT_INAP = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-health/section[3]/div/div/div/div/div[2]/div[2]/div/table[2]/tbody/tr[4]/td[1]/input")
	public static final CHECKBOX_BIAYA_PEMBEDAHAN = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-health/section[3]/div/div/div/div/div[2]/div[2]/div/table[2]/tbody/tr[5]/td[1]/input")
	public static final CHECKBOX_PENYAKIT_KRITIS = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-health/section[3]/div/div/div/div/div[2]/div[2]/div/table[2]/tbody/tr[6]/td[1]/input")

	//SCREEN 2 (FH)
	public static final BUTTON_LANJUT_ATUR = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-health/section[3]/div/div/div/div/div[2]/div[2]/div/div/button")
	public static final DROPDOWN_RIWAYAT_PENYAKIT = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-health-registration/div/div/section[2]/div/div[2]/div/div/div/div[2]/ng-select2/span/span[1]/span")
	public static final RIWAYAT_PENYAKIT_YA = CustomObject.getXpathTestObject("/html/body/span/span/span[2]/ul/li[1]")
	public static final RIWAYAT_PENYAKIT_TIDAK = CustomObject.getXpathTestObject("/html/body/span/span/span[2]/ul/li[2]")
	public static final BUTTON_LANJUT_RIWAYAT_PENYAKIT = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-health-registration/div/div/section[2]/div/div[2]/div/div/div[2]/button")
	public static final INPUT_TANGGAL_LAHIR_HITUNG_PREMI = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-health-registration/div/div/section[2]/div/div/div/div[3]/div[1]/h2/div/input")
	public static final BUTTON_HITUNG_PREMI_STEP2 = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-health-registration/div/div/section[2]/div/div/div/div[3]/div[3]/button")

	//SCRN 2 DETAIL MANFAAT (FH)
	public static final CHECKBOX_PILIH_SEMUA_MANFAAT_SCRN2 = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-health-registration/div/div/section[2]/div/div/div/div[4]/div[1]/div/table/tbody/tr[2]/td[1]/input")
	public static final CHECKBOX_RAWAT_INAP_ICU_SCRN2 = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-health-registration/div/div/section[2]/div/div/div/div[4]/div[1]/div/table/tbody/tr[6]/td[1]/input")
	public static final CHECKBOX_BIAYA_PEMBEDAHAN_SCRN2 = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-health-registration/div/div/section[2]/div/div/div/div[4]/div[1]/div/table/tbody/tr[7]/td[1]/input")
	public static final CHECKBOX_PENYAKIT_KRITIS_SCRN2 = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-health-registration/div/div/section[2]/div/div/div/div[4]/div[1]/div/table/tbody/tr[8]/td[1]/input")
	public static final CHECKBOX_CEPAT_SEMBUH_SCRN2 = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-health-registration/div/div/section[2]/div/div/div/div[4]/div[1]/div/table/tbody/tr[9]/td[1]/input")
	public static final CHECKBOX_ANEKA_PERAWATAN_SCRN2 = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-health-registration/div/div/section[2]/div/div/div/div[4]/div[1]/div/table/tbody/tr[10]/td[1]/input")
	public static final CHECKBOX_SETELAH_RAWAT_INAP_SCRN2 = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-health-registration/div/div/section[2]/div/div/div/div[4]/div[1]/div/table/tbody/tr[11]/td[1]/input")
	public static final BUTTON_LANJUT_SCRN2 = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-health-registration/div/div/section[2]/div/div/div/div[4]/div[2]/div/div/div[3]/button")

	//SCRN 2 SLIDER
	public static final SLIDER_MANFAAT_MENINGGAL_DUNIA_SCRN2  = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-health-registration/div/div/section[2]/div/div/div/div[4]/div[1]/div/table/tbody/tr[4]/td[2]/div/table/tbody/tr[2]/td[2]/div/div/div/ion-range-slider/span/span[6]")
	public static final SLIDER_MANFAAT_SANTUNAN_RAWAT_INAP_SCRN2 = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-health-registration/div/div/section[2]/div/div/div/div[4]/div[1]/div/table/tbody/tr[5]/td[2]/div/table/tbody/tr[2]/td[2]/div/div/div/ion-range-slider/span/span[6]")
	public static final SLIDER_PENGGANTIAN_BIAYA_BEDAH_SCRN2 = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-health-registration/div/div/section[2]/div/div/div/div[4]/div[1]/div/table/tbody/tr[7]/td[2]/div/table/tbody/tr[2]/td[2]/div/div/div/ion-range-slider/span/span[6]")
	public static final SLIDER_SANTUNAN_PENYAKIT_KRITIS_SCRN2 = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-health-registration/div/div/section[2]/div/div/div/div[4]/div[1]/div/table/tbody/tr[8]/td[2]/div/table/tbody/tr[2]/td[2]/div/div/div/ion-range-slider/span/span[6]")

	//SCRN 3 PREMI (FH)
	public static final DROPDOWN_PREMI = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-health-registration/div/div/section[2]/div/div/div/div[6]/h2/ng-select2/span/span[1]/span")
	public static final SELECT_PREMI_BULAN = CustomObject.getXpathTestObject("/html/body/span/span/span[2]/ul/li[4]")
	public static final SELECT_PREMI_3BULAN = CustomObject.getXpathTestObject("/html/body/span/span/span[2]/ul/li[3]")
	public static final SELECT_PREMI_6BULAN = CustomObject.getXpathTestObject("/html/body/span/span/span[2]/ul/li[2]")
	public static final SELECT_PREMI_TAHUN = CustomObject.getXpathTestObject("/html/body/span/span/span[2]/ul/li[1]")
	public static final BUTTON_LANJUT_PREMI = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-health-registration/div/div/section[2]/div/div/div/div[7]/button")

	//PROMO (FH)
	public static final BUTTON_HEMAT_DENGAN_PROMO = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-health-registration/div/div/section[2]/div/div/div/div[7]/div[2]/h5")
	public static final INPUT_KODE_PROMO = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-health-registration/div/div[2]/div[2]/div/div/div[2]/div[1]/div/h2/input")
	public static final BUTTON_PAKAI_PROMO = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-health-registration/div/div[2]/div[2]/div/div/div[2]/div[2]/button")
	public static final CLOSE_PROMO_HEALT = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-health-registration/div/div[2]/div[2]/div/div/div[1]/div[2]/a")


	//SCRN 4 DATA DIRI (FH)
	public static final INPUT_NAMA_SESUAI_KTP = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-health-registration/div/div/section[2]/div/div/div/div[3]/div/h2/input")
	public static final INPUT_NO_KTP = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-health-registration/div/div/section[2]/div/div/div/div[3]/div[2]/div[1]/h2/input")
	public static final BUTTON_UPLOAD = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-health-registration/div/div/section[2]/div/div/div/div[3]/div[2]/div[2]/div/div/button")
	public static final UPLOAD_FILE = CustomObject.getClassTestObject("js-input-file")
	public static final BUTTON_LANJUT_DATA_KTP = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-health-registration/div/div/section[2]/div/div/div/div[3]/div[2]/div[3]/button")
	public static final INPUT_NO_HP = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-health-registration/div/div/section[2]/div/div/div/div[3]/div[3]/div[2]/h2/input")
	public static final INPUT_EMAIL = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-health-registration/div/div/section[2]/div/div/div/div[3]/div[4]/div/h2/input")
	public static final INPUT_ALAMAT = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-health-registration/div/div/section[2]/div/div/div/div[3]/div[5]/div[1]/h2/input")
	public static final COMBOBOX_PROVINSI = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-health-registration/div/div/section[2]/div/div/div/div[3]/div[5]/div[2]/h2/ng-select2/span/span[1]/span")
	public static final INPUT_SEARCH_PROVINSI = CustomObject.getXpathTestObject("/html/body/span/span/span[1]/input")
	public static final SELECT_PROVINSI_JAWABARAT = CustomObject.getXpathTestObject("/html/body/span/span/span[2]/ul/li[1]")
	public static final INPUT_KODEPOS = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-health-registration/div/div/section[2]/div/div/div/div[3]/div[5]/div[2]/h2/input")
	public static final BUTTON_LANJUT_DATA_DIRI = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-health-registration/div/div/section[2]/div/div/div/div[3]/div[5]/div[3]/button")

	//SCRN 5 RINGKASAN PERTANGGUNGAN (FH)
	public static final CHECKLIST_SYARAT_KETENTUAN = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-health-registration/div/div/section/div/div/div/div[3]/div[2]/div[4]/div/input")
	public static final BUTTON_UBAH_DATA = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-health-registration/div/div/section/div/div/div/div[3]/div[2]/div[5]/a")
	public static final BUTTON_SAYA_SETUJU = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-health-registration/div/div[2]/div[2]/div/div/div[3]/div[2]/button")
	public static final BUTTON_BAYAR_HEALTH = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-health-registration/div/div/section/div/div/div/div[3]/div[2]/button")
	public static final VERIFY_PREMI_HEALTH = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-health-registration/div/div/section/div/div/div/div[3]/div[2]/div[3]")



	//FLEXI CRITICAL ILLNESS (CI)

	//SCRN 1 CI
	public static final SELECT_FLEXI_CI = CustomObject.getXpathTestObject("/html/body/app-root/div/app-home/section[1]/app-header/div/div[1]/div/div/div[2]/ul/li[2]/div/ul/li[2]/a/div/div")
	public static final BUTTON_CEK_SEKARANG_CI = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-ci/section[1]/div[1]/div/div/div/a[1]")
	public static final COMBOBOX_KUISIONER_KESEHATAN_CI = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-ci-registration/div/div/section/div/div[2]/div/div/div/div[2]/ng-select2/span/span[1]/span")
	public static final SELECT_COMBOBOX_KESEHATAN_CI_YA = CustomObject.getXpathTestObject("/html/body/span/span/span[2]/ul/li[1]")
	public static final SELECT_COMBOBOX_KESEHATAN_CI_TIDAK = CustomObject.getXpathTestObject("/html/body/span/span/span[2]/ul/li[2]")
	public static final COMBOBOX_PERNAH_MENGAJUKAN_CI = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-ci-registration/div/div/section/div/div[2]/div/div/div[2]/div[2]/ng-select2/span/span[1]/span")
	public static final SELECT_COMBOBOX_MENGAJUKAN_CI_YA = CustomObject.getXpathTestObject("/html/body/span/span/span[2]/ul/li[1]")
	public static final SELECT_COMBOBOX_MENGAJUKAN_CI_TIDAK = CustomObject.getXpathTestObject("/html/body/span/span/span[2]/ul/li[2]")
	public static final BUTTON_LANJUT_SCRN1_CI = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-ci-registration/div/div/section/div/div[2]/div/div/div[3]/button")

	//SCRN 2 CI HITUNG PREMI
	public static final COMBOBOX_GENDER_SCRN2_CI = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-ci-registration/div/div/section/div/div/div/div[3]/div[1]/h2/ng-select2/span/span[1]/span")
	public static final SELECT_COMBOBOX_GENDERSCRN2_PRIA = CustomObject.getXpathTestObject("/html/body/span/span/span[2]/ul/li[1]")
	public static final SELECT_COMBOBOX_GENDERSCRN2_WANITA = CustomObject.getXpathTestObject("/html/body/span/span/span[2]/ul/li[2]")
	public static final INPUT_TANGGAL_LAHIR_SCRN2_CI = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-ci-registration/div/div/section/div/div/div/div[3]/div[1]/h2/div/input")
	public static final INPUT_BERAT_BADAN_SCRN2_CI = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-ci-registration/div/div/section/div/div/div/div[3]/div[2]/h2/input[1]")
	public static final INPUT_TINGGI_BADAN_SCRN2_CI = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-ci-registration/div/div/section/div/div/div/div[3]/div[2]/h2/input[2]")
	public static final INPUT_UANG_PERTANGGUNGAN_YANG_DIINGINKAN_SCRN2_CI = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-ci-registration/div/div/section/div/div/div/div[3]/div[3]/div/h2/input")
	public static final COMBOBOX_PEMBAYARAN_PREMI_SCRN2_CI = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-ci-registration/div/div/section/div/div/div/div[3]/div[6]/h2/ng-select2/span/span[1]/span")
	public static final SELECT_COMBOBOX_PEMBAYARAN_PREMI_BULAN_CI = CustomObject.getXpathTestObject("/html[1]/body[1]/span[1]/span[1]/span[2]/ul[1]/li[4]")
	public static final SELECT_COMBOBOX_PEMBAYARAN_PREMI_3BULAN_CI = CustomObject.getXpathTestObject("/html[1]/body[1]/span[1]/span[1]/span[2]/ul[1]/li[3]")
	public static final SELECT_COMBOBOX_PEMBAYARAN_PREMI_6BULAN_CI = CustomObject.getXpathTestObject("/html[1]/body[1]/span[1]/span[1]/span[2]/ul[1]/li[2]")
	public static final SELECT_COMBOBOX_PEMBAYARAN_PREMI_TAHUN_CI = CustomObject.getXpathTestObject("/html[1]/body[1]/span[1]/span[1]/span[2]/ul[1]/li[1]")
	public static final BUTTON_HITUNG_SCRN2_CI = CustomObject.getXpathTestObject("/html[1]/body[1]/app-root[1]/div[1]/app-product-ci-registration[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[3]/div[8]/button[1]")
	public static final BUTTON_AMBIL_SCRN2_CI = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-ci-registration/div/div/section/div/div/div/div[3]/div[7]/button")
	public static final BUTTON_HITUNG_ULANG_SCRN2_CI = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-ci-registration/div/div/section/div/div/div/div[3]/div[7]/p/u")

	//SCRN 3 CI INFORMASI NASABAH
	public static final INPUT_NAMA_SESUAI_KTP_CI = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-ci-registration/div/div/section/div/div/div/div[3]/div/h2/input")
	public static final INPUT_NO_KTP_CI = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-ci-registration/div/div/section/div/div/div/div[3]/div[2]/div[1]/h2/input")
	public static final BUTTON_UPLOAD_CI = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-ci-registration/div/div/section/div/div/div/div[3]/div[2]/div[2]/div/div/button")
	public static final BUTTON_LANJUT_DATA_DIRI_SCRN3_CI = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-ci-registration/div/div/section/div/div/div/div[3]/div[2]/div[3]/button")
	public static final INPUT_NO_HP_SCRN3_CI = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-ci-registration/div/div/section/div/div/div/div[3]/div[3]/div[2]/h2/input")
	public static final INPUT_EMAIL_SCRN3_CI = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-ci-registration/div/div/section/div/div/div/div[3]/div[4]/div/h2/input")
	public static final INPUT_ALAMAT_SCRN3_CI = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-ci-registration/div/div/section/div/div/div/div[3]/div[5]/div[1]/h2/input")
	public static final COMBOBOX_PROVINSI_SCRN3_CI = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-ci-registration/div/div/section/div/div/div/div[3]/div[5]/div[2]/h2/ng-select2/span/span[1]/span")
	public static final INPUT_PROVINSI_SCRN3_CI = CustomObject.getXpathTestObject("/html/body/span/span/span[1]/input")
	public static final INPUT_KODEPOS_SCRN3_CI = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-ci-registration/div/div/section/div/div/div/div[3]/div[5]/div[2]/h2/input")
	public static final BUTTON_LANJUT_SCRN3_CI = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-ci-registration/div/div/section/div/div/div/div[3]/div[5]/div[3]/button")

	//SCRN 4 CI - SYARAT DAN KETENTUAN
	public static final LINK_SYARAT_DAN_KETENTUAN_SCRN4_CI = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-ci-registration/div/div/section/div/div/div/div[3]/div[2]/div[3]/span/a/strong")
	public static final CHECKBOX_SYARAT_DAN_KETENTUAN_SCRN4_CI = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-ci-registration/div/div/section/div/div/div/div[3]/div[2]/div[3]/div/input")
	public static final BUTTON_SAYA_SETUJU_SCRN4_CI = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-ci-registration/div/div[2]/div[2]/div/div/div[3]/div[2]/button")
	public static final BUTTON_BAYAR_SCRN4_CI = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-ci-registration/div/div/section/div/div/div/div[3]/div[2]/button")
	public static final VERIFY_PREMI_CI = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-ci-registration/div/div/section/div/div/div/div[3]/div[2]/div[2]")



	//LIFE

	//SCRN 1 LIFE
	public static final BUTTON_LIFE = CustomObject.getXpathTestObject("/html/body/app-root/div/app-home/section[1]/app-header/div/div[1]/div/div/div[2]/ul/li[1]/a")
	public static final BUTTON_CEK_SEKARANG_LIFE = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-life/section[1]/div[1]/div/div/div/a[1]")
	public static final COMBOBOX_CEK_KESEHATAN_LIFE = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-life-registration/div/section/div/div[2]/div/div/div/div[2]/ng-select2/span/span[1]/span")
	public static final SELECT_COMBOBOX_CEK_KESEHATAN_YA_LIFE = CustomObject.getXpathTestObject("/html/body/span/span/span[2]/ul/li[1]")
	public static final SELECT_COMBOBOX_CEK_KESEHATAN_TIDAK_LIFE = CustomObject.getXpathTestObject("/html/body/span/span/span[2]/ul/li[2]")
	public static final COMBOBOX_PERNAH_MENGAJUKAN_LIFE = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-life-registration/div/section/div/div[2]/div/div/div[2]/div[2]/ng-select2/span/span[1]/span")
	public static final SELECT_COMBOBOX_PERNAH_MENGAJUKAN_YA_LIFE = CustomObject.getXpathTestObject("/html/body/span/span/span[2]/ul/li[1]")
	public static final SELECT_COMBOBOX_PERNAH_MENGAJUKAN_TIDAK_LIFE = CustomObject.getXpathTestObject("/html/body/span/span/span[2]/ul/li[2]")
	public static final BUTTON_LANJUT_SCRN1_LIFE = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-life-registration/div/section/div/div[2]/div/div/div[3]/button")

	//SCRN 2 HITUNG PREMI
	public static final COMBOBOX_GENDER_SCRN2_LIFE = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-life-registration/div/section/div/div/div/div[3]/div[1]/h2/ng-select2/span/span[1]/span")
	public static final SELECT_COMBOBOX_GENDERSCRN2_PRIA_LIFE = CustomObject.getXpathTestObject("/html/body/span/span/span[2]/ul/li[1]")
	public static final SELECT_COMBOBOX_GENDERSCRN2_WANITA_LIFE = CustomObject.getXpathTestObject("/html/body/span/span/span[2]/ul/li[2]")
	public static final INPUT_TANGGAL_LAHIR_SCRN2_LIFE = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-life-registration/div/section/div/div/div/div[3]/div[1]/h2/div/input")
	public static final INPUT_BERAT_BADAN_SCRN2_LIFE = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-life-registration/div/section/div/div/div/div[3]/div[2]/h2/input[1]")
	public static final INPUT_TINGGI_BADAN_SCRN2_LIFE = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-life-registration/div/section/div/div/div/div[3]/div[2]/h2/input[2]")
	public static final INPUT_UANG_PERTANGGUNGAN_YANG_DIINGINKAN_SCRN2_LIFE = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-life-registration/div/section/div/div/div/div[3]/div[3]/div/h2/input")
	public static final COMBOBOX_PEMBAYARAN_PREMI_SCRN2_LIFE = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-life-registration/div/section/div/div/div/div[3]/div[5]/h2/ng-select2/span/span[1]/span")
	public static final SELECT_PREMI_BULAN_SCRN2_LIFE = CustomObject.getXpathTestObject("/html/body/span/span/span[2]/ul/li[4]")
	public static final SELECT_PREMI_3BULAN_SCRN2_LIFE = CustomObject.getXpathTestObject("/html/body/span/span/span[2]/ul/li[3]")
	public static final SELECT_PREMI_6BULAN_SCRN2_LIFE = CustomObject.getXpathTestObject("/html/body/span/span/span[2]/ul/li[2]")
	public static final SELECT_PREMI_TAHUN_SCRN2_LIFE = CustomObject.getXpathTestObject("/html/body/span/span/span[2]/ul/li[1]")


	public static final BUTTON_HITUNG_PREMI_SCRN2_LIFE = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-life-registration/div/section/div/div/div/div[3]/div[7]/button")
	public static final BUTTON_AMBIL_SCRN2_LIFE = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-life-registration/div/section/div/div/div/div[3]/div[6]/button")
	public static final BUTTON_BAYAR_LIFE = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-life-registration/div/section/div/div/div/div[3]/div[2]/button")

	//SCRN 3 DATA DIRI
	public static final INPUT_NAMA_KTP_SCRN3_LIFE = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-life-registration/div/section/div/div/div/div[3]/div/h2/input")
	public static final INPUT_NO_KTP_SCRN3_LIFE = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-life-registration/div/section/div/div/div/div[3]/div[2]/div[1]/h2/input")
	public static final BUTTON_LANJUT_KTP_SCRN3_LIFE = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-life-registration/div/section/div/div/div/div[3]/div[2]/div[3]/button")
	public static final INPUT_NO_HP_LIFE = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-life-registration/div/section/div/div/div/div[3]/div[3]/div[2]/h2/input")
	public static final INPUT_EMAIL_LIFE = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-life-registration/div/section/div/div/div/div[3]/div[4]/div/h2/input")
	public static final INPUT_ALAMAT_LIFE = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-life-registration/div/section/div/div/div/div[3]/div[5]/div[1]/h2/input")
	public static final COMBOBOX_PROVINSI_LIFE = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-life-registration/div/section/div/div/div/div[3]/div[5]/div[2]/h2/ng-select2/span/span[1]/span")
	public static final INPUT_SEARCH_PROVINSI_LIFE = CustomObject.getXpathTestObject("/html/body/span/span/span[1]/input")
	public static final INPUT_KODEPOS_LIFE = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-life-registration/div/section/div/div/div/div[3]/div[5]/div[2]/h2/input")
	public static final BUTTON_LANJUT_DATA_DIRI_LIFE = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-life-registration/div/section/div/div/div/div[3]/div[5]/div[3]/button")

	//SCRN 4 PROFIL PENERIMA MANFAAT
	public static final BUTTON_PENERIIMA_MANFAAT_1_LIFE = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-life-registration/div/section/div/div/div/div[3]/div[1]/div[1]/div/div/div")
	public static final BUTTON_PENERIIMA_MANFAAT_2_LIFE = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-life-registration/div/section/div/div/div/div[3]/div[1]/div[2]/div/div/div")
	public static final BUTTON_PENERIIMA_MANFAAT_3_LIFE = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-life-registration/div/section/div/div/div/div[3]/div[1]/div[3]/div/div/div")
	public static final BUTTON_PENERIIMA_MANFAAT_4_LIFE = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-life-registration/div/section/div/div/div/div[3]/div[1]/div[4]/div/div/div")
	public static final BUTTON_PENERIIMA_MANFAAT_5_LIFE = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-life-registration/div/section/div/div/div/div[3]/div[1]/div[5]/div/div/div")

	public static final INPUT_NAMA_PENERIMA_MANFAAT_1_LIFE = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-life-registration/div[2]/div[2]/div/div/div/div[2]/div[1]/h2/input")
	public static final COMBOBOX_SIAPA_PENERIMA_MANFAAT_1_LIFE = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-life-registration/div[2]/div[2]/div/div/div/div[2]/div[2]/h2/ng-select2/span/span[1]/span")
	public static final SELECT_PENERIMA_MANFAAT_ORANGTUA_LIFE = CustomObject.getXpathTestObject("/html/body/span/span/span[2]/ul/li[1]")
	public static final SELECT_PENERIMA_MANFAAT_ANAK_LIFE = CustomObject.getXpathTestObject("/html/body/span/span/span[2]/ul/li[2]")
	public static final SELECT_PENERIMA_MANFAAT_SAUDARA_KANDUNG_LIFE = CustomObject.getXpathTestObject("/html/body/span/span/span[2]/ul/li[3]")
	public static final SELECT_PENERIMA_MANFAAT_ISTRI_LIFE = CustomObject.getXpathTestObject("/html/body/span/span/span[2]/ul/li[4]")
	public static final INPUT_BESAR_PRESENTASE_MANFAAT_LIFE = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-life-registration/div[2]/div[2]/div/div/div/div[2]/div[3]/div/h2/input")
	public static final UPLOAD_FOTO_PROFIL_PENERIMA_MANFAAT_LIFE = CustomObject.getClassTestObject("js-input-file")
	public static final BUTTON_UPLOAD_FOTO_PROFIL_PENERIMA_MANFAAT_LIFE = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-life-registration/div[2]/div[2]/div/div/div/div[2]/div[4]/div/div/button")
	public static final BUTTON_TAMBAHKAN_PENERIMA_MANFAAT_LIFE = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-life-registration/div[2]/div[2]/div/div/div/div[2]/div[5]/button")
	public static final BUTTON_LANJUT_PENERIMA_MANFAAT_LIFE = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-life-registration/div/section/div/div/div/div[3]/div[3]/button")

	//SCRN 5 RINGKASAN PERTANGGUNGAN
	public static final CHECKBOX_SYARAT_DAN_KETENTUAN_LIFE = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-life-registration/div/section/div/div/div/div[3]/div[2]/div[3]/div/input")
	public static final BUTTON_SAYA_SETUJU_SK_LIFE = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-life-registration/div[2]/div[2]/div/div/div[3]/div[2]/button")
	public static final BUTTON_LANJUT_RINGKASAN_PERTANGGUNGAN_LIFE = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-life-registration/div/section/div/div/div/div[3]/div[2]/button")
	public static final VERIFY_PREMI_LIFE = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-life-registration/div/section/div/div/div/div[3]/div[2]/div[2]")


	//iSport
	public static final EXIST_NAMA_TERTANGGUNG = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-isport-registration/div/div/section/div/div/div/div[3]/div[4]/div[1]/h2/input")
	public static final EXIST_GENDER_TERTANGGUNG = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-isport-registration/div/div/section/div/div/div/div[3]/div[4]/div[1]/h2/ng-select2/span/span[1]/span")
	public static final EXIST_TANGGAL_LAHIR_TERTANGGUNG = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-isport-registration/div/div/section/div/div/div/div[3]/div[4]/div[2]/h2/div/input")
	public static final EXIST_BUTTON_LANJUT = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-isport-registration/div/div/section/div/div/div/div[3]/div[5]/button")
	//SCRN 1 iSport
	public static final BUTTON_SPORT = CustomObject.getXpathTestObject("/html/body/app-root/div/app-home/section[1]/app-header/div/div[1]/div/div/div[2]/ul/li[3]/a")
	public static final BUTTON_BELI_iSport = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-isport/section[1]/div[1]/div/div/div/a[1]")
	public static final COMBOBOX_SAYA_MEMBELI_ASURANSI_UNTUK_SPORT = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-isport-registration/div/div/section/div/div[2]/div/div/div/h2/ng-select2/span/span[1]/span")
	public static final SELECT_COMBOBOX_SMAU_SAYA_SENDIRI_SPORT = CustomObject.getXpathTestObject("/html/body/span/span/span[2]/ul/li[1]")
	public static final SELECT_COMBOBOX_SMAU_ANAK_SAYA_SPORT = CustomObject.getXpathTestObject("/html/body/span/span/span[2]/ul/li[2]")
	public static final COMBOBOX_OLAHRAGA_PILIHAN_SPORT = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-isport-registration/div/div/section/div/div[2]/div/div/div[2]/h2/ng-select2/span/span[1]/span")
	public static final INPUT_COMBOBOX_OLAHRAGA_PILIHAN_SPORT = CustomObject.getXpathTestObject("/html/body/span/span/span[1]/input")
	public static final COMBOBOX_BERLAKU_UNTUK_SPORT = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-isport-registration/div/div/section/div/div[2]/div/div/div[3]/h2/ng-select2/span/span[1]/span")
	public static final SELECT_COMBOBX_BU_1MINGGU_SPORT = CustomObject.getXpathTestObject("/html/body/span/span/span[2]/ul/li[1]")
	public static final SELECT_COMBOBX_BU_1BULAN_SPORT = CustomObject.getXpathTestObject("/html/body/span/span/span[2]/ul/li[2]")
	public static final DATEPICKER_MULAI_SPORT = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-isport-registration/div/div/section/div/div[2]/div/div/div[4]/h2/div[1]/input")
	public static final TOGGLE_BUTTON_TAMBAHKAN_KE_KALENDER_SPORT = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-isport-registration/div/div/section/div/div[2]/div/div/div[5]/h2/div/label")
	public static final COMBOBOX_BESAR_PERTANGGUNGAN_SPORT = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-isport-registration/div/div/section/div/div[2]/div/div/div[6]/h2/ng-select2/span/span[1]/span")
	public static final SELECT_COMBOBOX_BP_50_SPORT = CustomObject.getXpathTestObject("/html/body/span/span/span[2]/ul/li[1]")
	public static final SELECT_COMBOBOX_BP_100_SPORT = CustomObject.getXpathTestObject("/html/body/span/span/span[2]/ul/li[2]")
	public static final CHECKBOX_FISIOTERAPI_SPORT = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-isport-registration/div/div/section/div/div[2]/div/div/div[7]/div/div[2]/div/div[1]/div[1]/input")
	public static final CHECKBOX_PATAH_TULANG_SPORT = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-isport-registration/div/div/section/div/div[2]/div/div/div[7]/div/div[2]/div/div[2]/div[1]/input")
	public static final BUTTON_HITUNG_SPORT = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-isport-registration/div/div/section/div/div[2]/div/div/div[8]/button")
	public static final BUTTON_AMBIL_SPORT = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-isport-registration/div/div/section/div/div[2]/div/div/div[8]/button")

	//STEP 2 KOMUNITAS SPORT
	public static final COMBOBOX_KODE_KOMUNITAS_SPORT = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-isport-registration/div/div/section/div/div[2]/div/div/div[9]/h2/ng-select2/span/span[1]/span")
	public static final SELECT_COMBOBOX_KK_MEMILIKI_SPORT = CustomObject.getXpathTestObject("/html/body/span/span/span[2]/ul/li[1]")
	public static final SELECT_COMBOBOX_KK_TIDAK_MEMILIKI_SPORT = CustomObject.getXpathTestObject("/html/body/span/span/span[2]/ul/li[2]")
	public static final INPUT_KODE_KOMUNITAS_SPORT = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-isport-registration/div/div/section/div/div[2]/div/div/div[9]/h2/span/input")
	public static final BUTTON_LANJUT_KOMUNITAS_SPORT = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-isport-registration/div/div/section/div/div[2]/div/div/div[9]/button")


	//STEP 3 DATA DIRI SPORT
	public static final INPUT_NAMA_KTP_SPORT = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-isport-registration/div/div/section/div/div/div/div[3]/div[1]/h2/input")
	public static final COMBOBOX_GENDER_SPORT = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-isport-registration/div/div/section/div/div/div/div[3]/div[1]/h2/ng-select2/span/span[1]/span")
	public static final SELECT_COMBOBOX_GENDER_PRIA_SPORT = CustomObject.getXpathTestObject("/html/body/span/span/span[2]/ul/li[1]")
	public static final SELECT_COMBOBOX_GENDER_WANITA_SPORT = CustomObject.getXpathTestObject("/html/body/span/span/span[2]/ul/li[2]")
	public static final DATEPICKER_TANGGAL_LAHIR_SPORT = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-isport-registration/div/div/section/div/div/div/div[3]/div[2]/h2/div/input")
	public static final INPUT_NO_KTP_SPORT = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-isport-registration/div/div/section/div/div/div/div[3]/div[3]/div[1]/h2/input")
	public static final UPLOAD_KTP_SPORT = CustomObject.getClassTestObject("js-input-file")
	public static final BUTTON_LANJUT_DATA_DIRI_SPORT = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-isport-registration/div/div/section/div/div/div/div[3]/div[3]/div[3]/button")


	//STEP 4 DETAIL DATA SPORT
	public static final INPUT_NO_HP_SPORT = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-isport-registration/div/div/section/div/div/div/div[3]/div[4]/div[2]/h2/input")
	public static final INPUT_EMAIL_SPORT = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-isport-registration/div/div/section/div/div/div/div[3]/div[5]/div/h2/input")
	public static final INPUT_TEMPAT_TINGGAL_SPORT = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-isport-registration/div/div/section/div/div/div/div[3]/div[6]/div[1]/h2/input")
	public static final COMBOBOX_PROVINSI_SPORT = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-isport-registration/div/div/section/div/div/div/div[3]/div[6]/div[2]/h2/ng-select2/span/span[1]/span")
	public static final INPUT_COMBOBOX_PROVINSI_SPORT = CustomObject.getXpathTestObject("/html/body/span/span/span[1]/input")
	public static final INPUT_KODEPOS_SPORT = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-isport-registration/div/div/section/div/div/div/div[3]/div[6]/div[2]/h2/input")
	public static final INPUT_NAMA_TERTANGGUNG_SPORT = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-isport-registration/div/div/section/div/div/div/div[3]/div[7]/div[1]/h2/input")
	public static final COMBOBOX_GENDER_TERTANGGUNG_SPORT = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-isport-registration/div/div/section/div/div/div/div[3]/div[7]/div[1]/h2/ng-select2/span/span[1]/span")
	public static final SELECT_COMBOBOX_GP_PRIA_SPORT = CustomObject.getXpathTestObject("/html/body/span/span/span[2]/ul/li[1]")
	public static final SELECT_COMBOBOX_GP_WANITA_SPORT = CustomObject.getXpathTestObject("/html/body/span/span/span[2]/ul/li[2]")
	public static final DATEPICKER_TL_TERTANGGUNG_SPORT = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-isport-registration/div/div/section/div/div/div/div[3]/div[7]/div[2]/h2/div/input")
	public static final BUTTON_LANJUT_DATA_DETAIL_SPORT = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-isport-registration/div/div/section/div/div/div/div[3]/div[8]/button")
	public static final BUTTON_LANJUT_SAYA_DETAIL_SPORT = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-isport-registration/div/div/section/div/div/div/div[3]/div[7]/button")

	//STEP 5 RINGKASAN iSPORT
	public static final CHECKBOX_SYARAT_DAN_KETENTUAN_SPORT = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-isport-registration/div/div/section/div/div/div/div[3]/div[2]/div[3]/div/input")
	public static final BUTTON_SAYA_SETUJU_SPORT = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-isport-registration/div[2]/div[2]/div/div/div[3]/div[2]/button")
	public static final BUTTON_BAYAR_SPORT = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-isport-registration/div/div/section/div/div/div/div[3]/div[2]/button")
	public static final VERIFY_PREMI_SPORT = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-isport-registration/div/div/section/div/div/div/div[3]/div[2]/div[2]")


	//KADO

	//SCRN 1 KADO
	public static final BUTTON_KADO = CustomObject.getXpathTestObject("/html/body/app-root/div/app-home/section[1]/app-header/div/div[1]/div/div/div[2]/ul/li[4]/a")
	public static final BUTTON_BELI_KADO = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-kado/section[1]/div[1]/div/div/div/a[1]")

	//SCRN 2 DATA PENERIMA KADO
	public static final INPUT_NAMA_SESUAI_KTP_PENERIMA_KADO = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-kado-registration/div/div/section/div/div[2]/div/div/div/h2/input")
	public static final COMBOBOX_HARGA_KADO = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-kado-registration/div/div/section/div/div[2]/div/div/div[2]/h2/ng-select2/span/span[1]/span")
	public static final SELECT_COMBOBOX_HK_100000_KADO = CustomObject.getXpathTestObject("/html/body/span/span/span[2]/ul/li[1]")
	public static final SELECT_COMBOBOX_HK_450000_KADO = CustomObject.getXpathTestObject("/html/body/span/span/span[2]/ul/li[2]")
	public static final SELECT_COMBOBOX_HK_500000_KADO = CustomObject.getXpathTestObject("/html/body/span/span/span[2]/ul/li[3]")
	public static final TOGGLE_BUTTON_PERSONALISASI_KADO = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-kado-registration/div/div/section/div/div[2]/div/div/div[3]/h2/div/label")
	public static final NEXT_TYPE = CustomObject.getClassTestObject("swiper-button-next slick-next slick-arrow")
	public static final INPUT_UCAPAN_KADO = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-kado-registration/div/div/section/div/div[2]/div/div/div[3]/div[2]/div/div[1]/div/div/textarea")
	public static final BUTTON_UBAH_PESAN_KADO = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-kado-registration/div/div/section/div/div[2]/div/div/div[3]/div[2]/div/div[2]/span")
	public static final INPUT_EMAIL_PENERIMA_KADO = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-kado-registration/div/div/section/div/div[2]/div/div/div[4]/div[2]/h2/input")
	public static final INPUT_NO_HP_PENERIMA_KADO = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-kado-registration/div/div/section/div/div[2]/div/div/div[5]/h2/input")
	public static final DATEPICKER_TANGGAL_KIRIM_KADO = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-kado-registration/div/div/section/div/div[2]/div/div/div[6]/h2/div/input")
	public static final BUTTON_LANJUT_KADO = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-kado-registration/div/div/section/div/div[2]/div/div/div[6]/button")
	public static final PILIH_TEMA_KADO = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-kado-registration/div/div/section/div/div[2]/div/div/div[3]/h2")
	public static final VIEW = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-kado-registration/div/div/section/div/div[2]/div/div/div[2]")


	//SCRN 3 LENGKAPI DATA DIRI KADO
	public static final INPUT_NAMA_SESUAI_KTP_PENGIRIM_KADO = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-kado-registration/div/div/section/div/div/div/div[3]/div[1]/h2/input")
	public static final INPUT_NO_HP_PENGIRIM_KADO = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-kado-registration/div/div/section/div/div/div/div[3]/div[2]/h2/input")
	public static final INPUT_EMAIL_PENGIRIM_KADO = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-kado-registration/div/div/section/div/div/div/div[3]/div[3]/h2/input")
	public static final BUTTON_LANJUT_DATA_DIRI_KADO = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-kado-registration/div/div/section/div/div/div/div[3]/div[4]/button")

	//SCRN 4 RINGKASAN KADO
	public static final CHECKBOX_SYARAT_DAN_KENTENTUAN_KADO = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-kado-registration/div/div/section/div/div/div/div[3]/div/div[4]/div/div/input")
	public static final BUTTON_SAYA_SETUJU_KADO = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-kado-registration/div[2]/div[2]/div/div/div[3]/div[2]/button")
	public static final BUTTON_DOWNLOAD_RINGKASAN_KADO = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-kado-registration/div[2]/div[2]/div/div/div[2]/div/p[26]/strong/a")
	public static final BUTTON_BAYAR_KADO = CustomObject.getXpathTestObject("/html/body/app-root/div/app-product-kado-registration/div/div/section/div/div/div/div[3]/div/div[4]/button")


}