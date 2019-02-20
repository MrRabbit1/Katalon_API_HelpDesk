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

a = WS.sendRequest(findTestObject('ITSupporter/24CheckDeviceInfoByCode'))

WS.verifyResponseStatusCode(a, 200)

WS.verifyElementPropertyValue(a, 'IsError', false)

/*WS.verifyElementPropertyValue(a, 'ObjReturn.NumericalOrder', "")

WS.verifyElementPropertyValue(a, 'ObjReturn.DeviceId', 8)

WS.verifyElementPropertyValue(a, 'ObjReturn.AgencyName', "Uni deli")

WS.verifyElementPropertyValue(a, 'ObjReturn.AgencyId', 17)

WS.verifyElementPropertyValue(a, 'ObjReturn.DeviceTypeId', 4)

WS.verifyElementPropertyValue(a, 'ObjReturn.DeviceTypeName', "Pos")

WS.verifyElementPropertyValue(a, 'ObjReturn.DeviceName', "POS Sunmi")

WS.verifyElementPropertyValue(a, 'ObjReturn.DeviceCode', "P00DDS")

WS.verifyElementPropertyValue(a, 'ObjReturn.GuarantyStartDate', "00:00 17/10/2018")

WS.verifyElementPropertyValue(a, 'ObjReturn.GuarantyEndDate', "00:00 17/10/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn.GuarantyStatus', "Còn bảo hành")

WS.verifyElementPropertyValue(a, 'ObjReturn.Ip', "6.3.11.5")

WS.verifyElementPropertyValue(a, 'ObjReturn.Port', "80")

WS.verifyElementPropertyValue(a, 'ObjReturn.DeviceAccount', "admin")

WS.verifyElementPropertyValue(a, 'ObjReturn.DevicePassword', "admin")

WS.verifyElementPropertyValue(a, 'ObjReturn.SettingDate', "00:00 17/10/2018")

WS.verifyElementPropertyValue(a, 'ObjReturn.Other', "sadasd")

WS.verifyElementPropertyValue(a, 'ObjReturn.IsDelete', false)

WS.verifyElementPropertyValue(a, 'ObjReturn.CreateDate', "00:00 10/10/2018")

WS.verifyElementPropertyValue(a, 'ObjReturn.UpdateDate', "00:00 10/10/2018")

WS.verifyElementPropertyValue(a, 'ObjReturn.CompanyName', "Uni space")

WS.verifyElementPropertyValue(a, 'ObjReturn.CompanyId', 2)

WS.verifyElementPropertyValue(a, 'ObjReturn.TicketList[0].TicketId', 11)

WS.verifyElementPropertyValue(a, 'ObjReturn.TicketList[0].RequestId', 4)

WS.verifyElementPropertyValue(a, 'ObjReturn.TicketList[0].DeviceId', 8)

WS.verifyElementPropertyValue(a, 'ObjReturn.TicketList[0].ServiceItemName', "Sửa chữa máy POS  không in được.")

WS.verifyElementPropertyValue(a, 'ObjReturn.TicketList[0].Desciption', "Được Thêm bởi Admin vào lúc 1/17/2019 9:42:44 AM cho sự cố Uni deli - Sửa chữa máy POS  không in được.")

WS.verifyElementPropertyValue(a, 'ObjReturn.TicketList[0].CreateDate', "09:42 17/01/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn.TicketList[0].UpdateDate', "09:42 17/01/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn.TicketList[1].TicketId', 12)

WS.verifyElementPropertyValue(a, 'ObjReturn.TicketList[1].RequestId', 12)

WS.verifyElementPropertyValue(a, 'ObjReturn.TicketList[1].DeviceId', 8)

WS.verifyElementPropertyValue(a, 'ObjReturn.TicketList[1].ServiceItemName', "Sửa chữa máy POS  không in được.")

WS.verifyElementPropertyValue(a, 'ObjReturn.TicketList[1].Desciption', null)

WS.verifyElementPropertyValue(a, 'ObjReturn.TicketList[1].CreateDate', "09:45 17/01/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn.TicketList[1].UpdateDate', null)

WS.verifyElementPropertyValue(a, 'ObjReturn.TicketList[2].TicketId', 13)

WS.verifyElementPropertyValue(a, 'ObjReturn.TicketList[2].RequestId', 8)

WS.verifyElementPropertyValue(a, 'ObjReturn.TicketList[2].DeviceId', 8)

WS.verifyElementPropertyValue(a, 'ObjReturn.TicketList[2].ServiceItemName', "Sửa chữa máy POS  không in được.")

WS.verifyElementPropertyValue(a, 'ObjReturn.TicketList[2].Desciption', "Được Thêm bởi Admin vào lúc 1/17/2019 12:24:23 PM cho sự cố Uni deli - Sửa chữa máy POS  không in được.")

WS.verifyElementPropertyValue(a, 'ObjReturn.TicketList[2].CreateDate', "12:24 17/01/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn.TicketList[2].UpdateDate', null)*/
