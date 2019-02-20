import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

a = WS.sendRequest(findTestObject('Agency/40ServiceItem'))

WS.verifyResponseStatusCode(a, 200)

WS.verifyElementPropertyValue(a, 'IsError', false)

/*WS.verifyElementPropertyValue(a, 'ObjReturn[0].NumericalOrder', 1)

WS.verifyElementPropertyValue(a, 'ObjReturn[0].ServiceId', 1)

WS.verifyElementPropertyValue(a, 'ObjReturn[0].ServiceItemId', 1)

WS.verifyElementPropertyValue(a, 'ObjReturn[0].ServiceItemName', "Wifi không vào được")

WS.verifyElementPropertyValue(a, 'ObjReturn[0].Description', "Wifi của bạn không vào được? Bạn không biết làm gì để sửa chúng! Hãy để chúng tôi giúp bạn")

WS.verifyElementPropertyValue(a, 'ObjReturn[0].CreateDate', "00:00 03/10/2018")

WS.verifyElementPropertyValue(a, 'ObjReturn[0].UpdateDate', "11:35 14/11/2018")

WS.verifyElementPropertyValue(a, 'ObjReturn[0].ServiceName', "WIFI")

WS.verifyElementPropertyValue(a, 'ObjReturn[1].NumericalOrder', 2)

WS.verifyElementPropertyValue(a, 'ObjReturn[1].ServiceId', 1)

WS.verifyElementPropertyValue(a, 'ObjReturn[1].ServiceItemId', 6)

WS.verifyElementPropertyValue(a, 'ObjReturn[1].ServiceItemName', "Wifi chậm")

WS.verifyElementPropertyValue(a, 'ObjReturn[1].Description', "Wifi bạn chậm quá! Hãy để chúng tôi giúp cho nhé")

WS.verifyElementPropertyValue(a, 'ObjReturn[1].CreateDate', "00:00 19/10/2018")

WS.verifyElementPropertyValue(a, 'ObjReturn[1].UpdateDate', "00:00 19/10/2018")

WS.verifyElementPropertyValue(a, 'ObjReturn[1].ServiceName', "WIFI")

WS.verifyElementPropertyValue(a, 'ObjReturn[2].NumericalOrder', 3)

WS.verifyElementPropertyValue(a, 'ObjReturn[2].ServiceId', 1)

WS.verifyElementPropertyValue(a, 'ObjReturn[2].ServiceItemId', 7)

WS.verifyElementPropertyValue(a, 'ObjReturn[2].ServiceItemName', "Wifi mất kết nối")

WS.verifyElementPropertyValue(a, 'ObjReturn[2].Description', null)

WS.verifyElementPropertyValue(a, 'ObjReturn[2].CreateDate', "10:49 14/11/2018")

WS.verifyElementPropertyValue(a, 'ObjReturn[2].UpdateDate', "12:38 21/01/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn[2].ServiceName', "WIFI")

WS.verifyElementPropertyValue(a, 'ObjReturn[3].NumericalOrder', 4)

WS.verifyElementPropertyValue(a, 'ObjReturn[3].ServiceId', 1)

WS.verifyElementPropertyValue(a, 'ObjReturn[3].ServiceItemId', 20)

WS.verifyElementPropertyValue(a, 'ObjReturn[3].ServiceItemName', "Wifi chậm")

WS.verifyElementPropertyValue(a, 'ObjReturn[3].Description', null)

WS.verifyElementPropertyValue(a, 'ObjReturn[3].CreateDate', "16:52 14/01/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn[3].UpdateDate', "15:13 17/01/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn[3].ServiceName', "WIFI")*/

