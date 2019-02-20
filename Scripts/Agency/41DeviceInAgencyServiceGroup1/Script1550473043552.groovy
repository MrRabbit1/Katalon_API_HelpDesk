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

a = WS.sendRequest(findTestObject('Agency/41DeviceInAgencyServiceGroup'))

WS.verifyResponseStatusCode(a, 200)

WS.verifyElementPropertyValue(a, 'IsError', false)

/*WS.verifyElementPropertyValue(a, 'ObjReturn[0].DeviceId', 19)

WS.verifyElementPropertyValue(a, 'ObjReturn[0].AgencyId', 3)

WS.verifyElementPropertyValue(a, 'ObjReturn[0].DeviceTypeId', 4)

WS.verifyElementPropertyValue(a, 'ObjReturn[0].DeviceName', "POS115")

WS.verifyElementPropertyValue(a, 'ObjReturn[0].DeviceCode', "PKADS85")

WS.verifyElementPropertyValue(a, 'ObjReturn[0].GuarantyStartDate', "00:00 23/10/2018")

WS.verifyElementPropertyValue(a, 'ObjReturn[0].GuarantyEndDate', "00:00 31/10/2018")

WS.verifyElementPropertyValue(a, 'ObjReturn[0].Ip', "35.35.145.1")

WS.verifyElementPropertyValue(a, 'ObjReturn[0].Port', "80")

WS.verifyElementPropertyValue(a, 'ObjReturn[0].DeviceAccount', "1")

WS.verifyElementPropertyValue(a, 'ObjReturn[0].DevicePassword', "1")

WS.verifyElementPropertyValue(a, 'ObjReturn[0].SettingDate', "00:00 30/10/2018")

WS.verifyElementPropertyValue(a, 'ObjReturn[0].Other', "1")

WS.verifyElementPropertyValue(a, 'ObjReturn[0].CreateDate', "11:04 19/10/2018")

WS.verifyElementPropertyValue(a, 'ObjReturn[0].UpdateDate', "11:04 19/10/2018")

WS.verifyElementPropertyValue(a, 'ObjReturn[0].CompanyName', "Passio")

WS.verifyElementPropertyValue(a, 'ObjReturn[0].AgencyName', "Passio 47 TCV")

WS.verifyElementPropertyValue(a, 'ObjReturn[0].NumericalOrder', 1)

WS.verifyElementPropertyValue(a, 'ObjReturn[1].DeviceId', 20)

WS.verifyElementPropertyValue(a, 'ObjReturn[1].AgencyId', 3)

WS.verifyElementPropertyValue(a, 'ObjReturn[1].DeviceTypeId', 4)

WS.verifyElementPropertyValue(a, 'ObjReturn[1].DeviceName', "Pos Sentos")

WS.verifyElementPropertyValue(a, 'ObjReturn[1].DeviceCode', "PUUns20")

WS.verifyElementPropertyValue(a, 'ObjReturn[1].GuarantyStartDate', "00:00 24/10/2018")

WS.verifyElementPropertyValue(a, 'ObjReturn[1].GuarantyEndDate', "00:00 31/10/2018")

WS.verifyElementPropertyValue(a, 'ObjReturn[1].Ip', "85.3.3.15")

WS.verifyElementPropertyValue(a, 'ObjReturn[1].Port', "80")

WS.verifyElementPropertyValue(a, 'ObjReturn[1].DeviceAccount', "1")

WS.verifyElementPropertyValue(a, 'ObjReturn[1].DevicePassword', "1")

WS.verifyElementPropertyValue(a, 'ObjReturn[1].SettingDate', "00:00 16/10/2018")

WS.verifyElementPropertyValue(a, 'ObjReturn[1].Other', "1")

WS.verifyElementPropertyValue(a, 'ObjReturn[1].CreateDate', "12:02 19/10/2018")

WS.verifyElementPropertyValue(a, 'ObjReturn[1].UpdateDate', "12:02 19/10/2018")

WS.verifyElementPropertyValue(a, 'ObjReturn[1].CompanyName', "Passio")

WS.verifyElementPropertyValue(a, 'ObjReturn[1].AgencyName', "Passio 47 TCV")

WS.verifyElementPropertyValue(a, 'ObjReturn[1].NumericalOrder', 2)*/

