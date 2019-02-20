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

a = WS.sendRequest(findTestObject('Agency/38GetDeviceByDeviceTypeID'))

WS.verifyResponseStatusCode(a, 200)

WS.verifyElementPropertyValue(a, 'IsError', false)

/*WS.verifyElementPropertyValue(a, 'ObjReturn[0].DeviceId', 24)

WS.verifyElementPropertyValue(a, 'ObjReturn[0].AgencyId', 17)

WS.verifyElementPropertyValue(a, 'ObjReturn[0].DeviceTypeId', 1)

WS.verifyElementPropertyValue(a, 'ObjReturn[0].DeviceName', "Router Toto link J15")

WS.verifyElementPropertyValue(a, 'ObjReturn[0].DeviceCode', "W996SD2")

WS.verifyElementPropertyValue(a, 'ObjReturn[0].GuarantyStartDate', "00:00 06/11/2018")

WS.verifyElementPropertyValue(a, 'ObjReturn[0].GuarantyEndDate', "00:00 22/10/2018")

WS.verifyElementPropertyValue(a, 'ObjReturn[0].Ip', "14.2.6.33")

WS.verifyElementPropertyValue(a, 'ObjReturn[0].Port', "82")

WS.verifyElementPropertyValue(a, 'ObjReturn[0].DeviceAccount', "1")

WS.verifyElementPropertyValue(a, 'ObjReturn[0].DevicePassword', "1")

WS.verifyElementPropertyValue(a, 'ObjReturn[0].SettingDate', "00:00 30/10/2018")

WS.verifyElementPropertyValue(a, 'ObjReturn[0].Other', "1")

WS.verifyElementPropertyValue(a, 'ObjReturn[0].CreateDate', "15:20 19/10/2018")

WS.verifyElementPropertyValue(a, 'ObjReturn[0].UpdateDate', "15:20 19/10/2018")

WS.verifyElementPropertyValue(a, 'ObjReturn[0].CompanyName', "Uni space")

WS.verifyElementPropertyValue(a, 'ObjReturn[0].AgencyName', "Uni deli")

WS.verifyElementPropertyValue(a, 'ObjReturn[0].NumericalOrder', 1)

WS.verifyElementPropertyValue(a, 'ObjReturn[1].DeviceId', 63)

WS.verifyElementPropertyValue(a, 'ObjReturn[1].AgencyId', 17)

WS.verifyElementPropertyValue(a, 'ObjReturn[1].DeviceTypeId', 1)

WS.verifyElementPropertyValue(a, 'ObjReturn[1].DeviceName', "test2")

WS.verifyElementPropertyValue(a, 'ObjReturn[1].DeviceCode', "123124")

WS.verifyElementPropertyValue(a, 'ObjReturn[1].GuarantyStartDate', "00:00 01/01/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn[1].GuarantyEndDate', "00:00 09/02/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn[1].Ip', "192.123.23.12")

WS.verifyElementPropertyValue(a, 'ObjReturn[1].Port', "80")

WS.verifyElementPropertyValue(a, 'ObjReturn[1].DeviceAccount', "123")

WS.verifyElementPropertyValue(a, 'ObjReturn[1].DevicePassword', "123")

WS.verifyElementPropertyValue(a, 'ObjReturn[1].SettingDate', "00:00 11/01/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn[1].Other', "wdsdqsd")

WS.verifyElementPropertyValue(a, 'ObjReturn[1].CreateDate', "14:18 17/01/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn[1].UpdateDate', null)

WS.verifyElementPropertyValue(a, 'ObjReturn[1].CompanyName', "Uni space")

WS.verifyElementPropertyValue(a, 'ObjReturn[1].AgencyName', "Uni deli")

WS.verifyElementPropertyValue(a, 'ObjReturn[1].NumericalOrder', 2)*/

