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

a = WS.sendRequest(findTestObject('Request/57ViewRequestDetail'))

WS.verifyResponseStatusCode(a, 200)

WS.verifyElementPropertyValue(a, 'IsError', false)

/*WS.verifyElementPropertyValue(a, 'ObjReturn.RequestId', 7)

WS.verifyElementPropertyValue(a, 'ObjReturn.AgencyId', 3)

WS.verifyElementPropertyValue(a, 'ObjReturn.AgencyName', "Passio 47 TCV")

WS.verifyElementPropertyValue(a, 'ObjReturn.AgencyAddress', "47 Trần Cao Vân")

WS.verifyElementPropertyValue(a, 'ObjReturn.RequestCategoryId', 3)

WS.verifyElementPropertyValue(a, 'ObjReturn.ServiceId', 14)

WS.verifyElementPropertyValue(a, 'ObjReturn.ServiceName', "SOFTWARE")

WS.verifyElementPropertyValue(a, 'ObjReturn.ServiceItemId', 19)

WS.verifyElementPropertyValue(a, 'ObjReturn.ServiceItemName', "Mở máy tính không lên")

WS.verifyElementPropertyValue(a, 'ObjReturn.RequestName', "Passio 47 TCV - Mở máy tính không lên")

WS.verifyElementPropertyValue(a, 'ObjReturn.RequestDesciption', "dsa")

WS.verifyElementPropertyValue(a, 'ObjReturn.AgencyTelephone', "0966167423")

WS.verifyElementPropertyValue(a, 'ObjReturn.CreateDate', "14:43 16/01/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn.UpdateDate', "14:45 16/01/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn.StartTime', "10:47 16/01/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn.EndTime', "11:47 16/01/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn.RequestStatus', "Hoàn thành")

WS.verifyElementPropertyValue(a, 'ObjReturn.RequestStatusValue', 3)

WS.verifyElementPropertyValue(a, 'ObjReturn.RequestEstimationTime', "19:43 16/01/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn.NumberOfTicketDone', 0)

WS.verifyElementPropertyValue(a, 'ObjReturn.NumberTicketInProcessing', 0)

WS.verifyElementPropertyValue(a, 'ObjReturn.NumberOfTicket', 1)

WS.verifyElementPropertyValue(a, 'ObjReturn.ITSupporterName', "Ngô Thanh Chiến")

WS.verifyElementPropertyValue(a, 'ObjReturn.ITSupporterPhone', "0773909125")

WS.verifyElementPropertyValue(a, 'ObjReturn.FeedBack', "agag")

WS.verifyElementPropertyValue(a, 'ObjReturn.Rating', 3)

WS.verifyElementPropertyValue(a, 'ObjReturn.Priority', "Cao")

WS.verifyElementPropertyValue(a, 'ObjReturn.PriorityValue', 1)

WS.verifyElementPropertyValue(a, 'ObjReturn.Tickets[0].TicketId', 13)

WS.verifyElementPropertyValue(a, 'ObjReturn.Tickets[0].DeviceId', 8)

WS.verifyElementPropertyValue(a, 'ObjReturn.Tickets[0].DeviceCode', "P00DDS")

WS.verifyElementPropertyValue(a, 'ObjReturn.Tickets[0].Desciption', "Được Thêm bởi Admin vào lúc 1/17/2019 12:24:23 PM cho sự cố Uni deli - Sửa chữa máy POS  không in được.")

WS.verifyElementPropertyValue(a, 'ObjReturn.Tickets[0].DeviceName', "POS Sunmi")

WS.verifyElementPropertyValue(a, 'ObjReturn.Tickets[0].CreateDate', "12:24 17/01/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn.Tickets[0].CreateBy', "ADMIN")

WS.verifyElementPropertyValue(a, 'ObjReturn.Tickets[0].CreateBy', "ADMIN")*/