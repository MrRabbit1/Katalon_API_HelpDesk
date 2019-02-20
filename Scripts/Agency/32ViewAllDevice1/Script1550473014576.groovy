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

a = WS.sendRequest(findTestObject('Agency/32ViewAllDevice'))

WS.verifyResponseStatusCode(a, 200)

WS.verifyElementPropertyValue(a, 'IsError', false)

/*WS.verifyElementPropertyValue(a, 'ObjReturn[0].DeviceId', 8)

WS.verifyElementPropertyValue(a, 'ObjReturn[0].AgencyId', 17)

WS.verifyElementPropertyValue(a, 'ObjReturn[0].DeviceTypeId', 4)

WS.verifyElementPropertyValue(a, 'ObjReturn[0].DeviceName', "POS Sunmi")

WS.verifyElementPropertyValue(a, 'ObjReturn[0].DeviceCode', "P00DDS")

WS.verifyElementPropertyValue(a, 'ObjReturn[0].GuarantyStartDate', "00:00 17/10/2018")

WS.verifyElementPropertyValue(a, 'ObjReturn[0].GuarantyEndDate', "00:00 17/10/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn[0].Ip', "6.3.11.5")

WS.verifyElementPropertyValue(a, 'ObjReturn[0].Port', "80")

WS.verifyElementPropertyValue(a, 'ObjReturn[0].DeviceAccount', "admin")

WS.verifyElementPropertyValue(a, 'ObjReturn[0].DevicePassword', "admin")

WS.verifyElementPropertyValue(a, 'ObjReturn[0].SettingDate', "00:00 17/10/2018")

WS.verifyElementPropertyValue(a, 'ObjReturn[0].Other', "sadasd")

WS.verifyElementPropertyValue(a, 'ObjReturn[0].CreateDate', "00:00 10/10/2018")

WS.verifyElementPropertyValue(a, 'ObjReturn[0].UpdateDate', "00:00 10/10/2018")

WS.verifyElementPropertyValue(a, 'ObjReturn[0].CompanyName', "Uni space")

WS.verifyElementPropertyValue(a, 'ObjReturn[0].AgencyName', "Uni deli")

WS.verifyElementPropertyValue(a, 'ObjReturn[0].NumericalOrder', 1)

WS.verifyElementPropertyValue(a, 'ObjReturn[1].DeviceId', 21)

WS.verifyElementPropertyValue(a, 'ObjReturn[1].AgencyId', 17)

WS.verifyElementPropertyValue(a, 'ObjReturn[1].DeviceTypeId', 2)

WS.verifyElementPropertyValue(a, 'ObjReturn[1].DeviceName', "Camera A350")

WS.verifyElementPropertyValue(a, 'ObjReturn[1].DeviceCode', "C1120CS")

WS.verifyElementPropertyValue(a, 'ObjReturn[1].GuarantyStartDate', "00:00 23/10/2018")

WS.verifyElementPropertyValue(a, 'ObjReturn[1].GuarantyEndDate', "00:00 24/10/2018")

WS.verifyElementPropertyValue(a, 'ObjReturn[1].Ip', "65.3.12.50")

WS.verifyElementPropertyValue(a, 'ObjReturn[1].Port', "80")

WS.verifyElementPropertyValue(a, 'ObjReturn[1].DeviceAccount', "1")

WS.verifyElementPropertyValue(a, 'ObjReturn[1].DevicePassword', "1")

WS.verifyElementPropertyValue(a, 'ObjReturn[1].SettingDate', "00:00 29/10/2018")

WS.verifyElementPropertyValue(a, 'ObjReturn[1].Other', "1")

WS.verifyElementPropertyValue(a, 'ObjReturn[1].CreateDate', "12:04 19/10/2018")

WS.verifyElementPropertyValue(a, 'ObjReturn[1].UpdateDate', "12:04 19/10/2018")

WS.verifyElementPropertyValue(a, 'ObjReturn[1].CompanyName', "Uni space")

WS.verifyElementPropertyValue(a, 'ObjReturn[1].AgencyName', "Uni deli")

WS.verifyElementPropertyValue(a, 'ObjReturn[1].NumericalOrder', 2)

WS.verifyElementPropertyValue(a, 'ObjReturn[2].DeviceId', 24)

WS.verifyElementPropertyValue(a, 'ObjReturn[2].AgencyId', 17)

WS.verifyElementPropertyValue(a, 'ObjReturn[2].DeviceTypeId', 1)

WS.verifyElementPropertyValue(a, 'ObjReturn[2].DeviceName', "Router Toto link J15")

WS.verifyElementPropertyValue(a, 'ObjReturn[2].DeviceCode', "W996SD2")

WS.verifyElementPropertyValue(a, 'ObjReturn[2].GuarantyStartDate', "00:00 06/11/2018")

WS.verifyElementPropertyValue(a, 'ObjReturn[2].GuarantyEndDate', "00:00 22/10/2018")

WS.verifyElementPropertyValue(a, 'ObjReturn[2].Ip', "14.2.6.33")

WS.verifyElementPropertyValue(a, 'ObjReturn[2].Port', "82")

WS.verifyElementPropertyValue(a, 'ObjReturn[2].DeviceAccount', "1")

WS.verifyElementPropertyValue(a, 'ObjReturn[2].DevicePassword', "1")

WS.verifyElementPropertyValue(a, 'ObjReturn[2].SettingDate', "00:00 30/10/2018")

WS.verifyElementPropertyValue(a, 'ObjReturn[2].Other', "1")

WS.verifyElementPropertyValue(a, 'ObjReturn[2].CreateDate', "15:20 19/10/2018")

WS.verifyElementPropertyValue(a, 'ObjReturn[2].UpdateDate', "15:20 19/10/2018")

WS.verifyElementPropertyValue(a, 'ObjReturn[2].CompanyName', "Uni space")

WS.verifyElementPropertyValue(a, 'ObjReturn[2].AgencyName', "Uni deli")

WS.verifyElementPropertyValue(a, 'ObjReturn[2].NumericalOrder', 3)

WS.verifyElementPropertyValue(a, 'ObjReturn[3].DeviceId', 60)

WS.verifyElementPropertyValue(a, 'ObjReturn[3].AgencyId', 17)

WS.verifyElementPropertyValue(a, 'ObjReturn[3].DeviceTypeId', 2)

WS.verifyElementPropertyValue(a, 'ObjReturn[3].DeviceName', "test")

WS.verifyElementPropertyValue(a, 'ObjReturn[3].DeviceCode', "12312")

WS.verifyElementPropertyValue(a, 'ObjReturn[3].GuarantyStartDate', "00:00 01/01/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn[3].GuarantyEndDate', "00:00 30/01/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn[3].Ip', "172.16.123.12")

WS.verifyElementPropertyValue(a, 'ObjReturn[3].Port', "13")

WS.verifyElementPropertyValue(a, 'ObjReturn[3].DeviceAccount', "123")

WS.verifyElementPropertyValue(a, 'ObjReturn[3].DevicePassword', "123")

WS.verifyElementPropertyValue(a, 'ObjReturn[3].SettingDate', "00:00 08/01/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn[3].Other', "wdsdqsd")

WS.verifyElementPropertyValue(a, 'ObjReturn[3].CreateDate', "16:23 16/01/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn[3].UpdateDate', null)

WS.verifyElementPropertyValue(a, 'ObjReturn[3].CompanyName', "Uni space")

WS.verifyElementPropertyValue(a, 'ObjReturn[3].AgencyName', "Uni deli")

WS.verifyElementPropertyValue(a, 'ObjReturn[3].NumericalOrder', 4)

WS.verifyElementPropertyValue(a, 'ObjReturn[4].DeviceId', 63)

WS.verifyElementPropertyValue(a, 'ObjReturn[4].AgencyId', 17)

WS.verifyElementPropertyValue(a, 'ObjReturn[4].DeviceTypeId', 1)

WS.verifyElementPropertyValue(a, 'ObjReturn[4].DeviceName', "test2")

WS.verifyElementPropertyValue(a, 'ObjReturn[4].DeviceCode', "123124")

WS.verifyElementPropertyValue(a, 'ObjReturn[4].GuarantyStartDate', "00:00 01/01/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn[4].GuarantyEndDate', "00:00 09/02/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn[4].Ip', "192.123.23.12")

WS.verifyElementPropertyValue(a, 'ObjReturn[4].Port', "80")

WS.verifyElementPropertyValue(a, 'ObjReturn[4].DeviceAccount', "123")

WS.verifyElementPropertyValue(a, 'ObjReturn[4].DevicePassword', "123")

WS.verifyElementPropertyValue(a, 'ObjReturn[4].SettingDate', "00:00 11/01/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn[4].Other', "wdsdqsd")

WS.verifyElementPropertyValue(a, 'ObjReturn[4].CreateDate', "14:18 17/01/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn[4].UpdateDate', null)

WS.verifyElementPropertyValue(a, 'ObjReturn[4].CompanyName', "Uni space")

WS.verifyElementPropertyValue(a, 'ObjReturn[4].AgencyName', "Uni deli")

WS.verifyElementPropertyValue(a, 'ObjReturn[4].NumericalOrder', 5)*/
