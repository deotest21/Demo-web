import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
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
import org.openqa.selenium.Keys as Keys

WebUI.click(findTestObject('Object Repository/Page_My account - My Store/a_T-shirts'))

WebUI.click(findTestObject('Object Repository/Page_T-shirts - My Store/input_(1)_layered_id_attribute_group_3'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_T-shirts  Size L - My Store/a_Faded Short Sleeve T-shirts'), 
    'Faded Short Sleeve T-shirts')

WebUI.verifyElementText(findTestObject('Page_T-shirts  Size L - My Store/span_Importo'), '$16.51')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_T-shirts  Size L - My Store/span_In stock'), 0)

WebUI.click(findTestObject('Object Repository/Page_T-shirts  Size L - My Store/span_Add to cart'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_T-shirts  Size L - My Store/h2_Product successfully added to your shopp_45f75f'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_T-shirts  Size L - My Store/span_Importo_1'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_T-shirts  Size L - My Store/span_Faded Short Sleeve T-shirts'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_T-shirts  Size L - My Store/span_Proceed to checkout'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Order - My Store/a_Faded Short Sleeve T-shirts'), 'Faded Short Sleeve T-shirts')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Order - My Store/span_Importo'), '$16.51')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Order - My Store/span_Totale'), '$19.25')

WebUI.click(findTestObject('Object Repository/Page_Order - My Store/span_Proceed to checkout'))

WebUI.click(findTestObject('Object Repository/Page_Order - My Store/span_Proceed to checkout'))

WebUI.click(findTestObject('Object Repository/Page_Order - My Store/input_2.00_cgv'))

WebUI.click(findTestObject('Object Repository/Page_Order - My Store/span_Proceed to checkout_1'))

WebUI.click(findTestObject('Object Repository/Page_Order - My Store/a_Pay by bank wire (order processing will b_e7efad'))

WebUI.click(findTestObject('Object Repository/Page_My Store/span_I confirm my order'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Order confirmation - My Store/strong_Your order on My Store is complete'), 
    'Your order on My Store is complete.')

