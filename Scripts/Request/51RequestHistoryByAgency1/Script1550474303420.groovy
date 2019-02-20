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

a = WS.sendRequest(findTestObject('Request/51RequestHistoryByAgency'))

WS.verifyResponseStatusCode(a, 200)

WS.verifyElementPropertyValue(a, 'IsError', false)

/*WS.verifyElementPropertyValue(a, 'ObjReturn[0].RequestId', 23)

WS.verifyElementPropertyValue(a, 'ObjReturn[0].AgencyId', 3)

WS.verifyElementPropertyValue(a, 'ObjReturn[0].AgencyName', 'Passio 47 TCV')

WS.verifyElementPropertyValue(a, 'ObjReturn[0].AgencyAddress', '47 Trần Cao Vân')

WS.verifyElementPropertyValue(a, 'ObjReturn[0].RequestCategoryId', 3)

WS.verifyElementPropertyValue(a, 'ObjReturn[0].ServiceId', 2)

WS.verifyElementPropertyValue(a, 'ObjReturn[0].ServiceName', 'CAMERA')

WS.verifyElementPropertyValue(a, 'ObjReturn[0].ServiceItemId', 3)

WS.verifyElementPropertyValue(a, 'ObjReturn[0].ServiceItemName', 'Camera không hiện màu')

WS.verifyElementPropertyValue(a, 'ObjReturn[0].RequestName', 'Camera không hiện màu')

WS.verifyElementPropertyValue(a, 'ObjReturn[0].RequestDesciption', 'jejjse8')

WS.verifyElementPropertyValue(a, 'ObjReturn[0].AgencyTelephone', '0966167423')

WS.verifyElementPropertyValue(a, 'ObjReturn[0].CreateDate', '11:25 21/01/2019')

WS.verifyElementPropertyValue(a, 'ObjReturn[0].UpdateDate', '11:40 21/01/2019')

WS.verifyElementPropertyValue(a, 'ObjReturn[0].StartTime', null)

WS.verifyElementPropertyValue(a, 'ObjReturn[0].EndTime', null)

WS.verifyElementPropertyValue(a, 'ObjReturn[0].RequestStatus', 'Hoàn thành')

WS.verifyElementPropertyValue(a, 'ObjReturn[0].RequestStatusValue', 3)

WS.verifyElementPropertyValue(a, 'ObjReturn[0].RequestEstimationTime', '11:25 21/01/2019')

WS.verifyElementPropertyValue(a, 'ObjReturn[0].NumberOfTicketDone', 0)

WS.verifyElementPropertyValue(a, 'ObjReturn[0].NumberTicketInProcessing', 0)

WS.verifyElementPropertyValue(a, 'ObjReturn[0].NumberOfTicket', 1)

WS.verifyElementPropertyValue(a, 'ObjReturn[0].ITSupporterName', 'Chưa có người xử lý')

WS.verifyElementPropertyValue(a, 'ObjReturn[0].ITSupporterPhone', null)

WS.verifyElementPropertyValue(a, 'ObjReturn[0].FeedBack', null)

WS.verifyElementPropertyValue(a, 'ObjReturn[0].Rating', 0)

WS.verifyElementPropertyValue(a, 'ObjReturn[0].Priority', null)

WS.verifyElementPropertyValue(a, 'ObjReturn[0].PriorityValue', 0)

WS.verifyElementPropertyValue(a, 'ObjReturn[0].Tickets[0].TicketId', 18)

WS.verifyElementPropertyValue(a, 'ObjReturn[0].Tickets[0].DeviceId', 26)

WS.verifyElementPropertyValue(a, 'ObjReturn[0].Tickets[0].DeviceCode', 'C9960SD')

WS.verifyElementPropertyValue(a, 'ObjReturn[0].Tickets[0].Desciption', 'Thuộc mAgencyId: 3 thiết bị: Camera Xiaomi RES5Vấn đề: Camera không hiện màu')

WS.verifyElementPropertyValue(a, 'ObjReturn[0].Tickets[0].DeviceName', 'Camera Xiaomi RES5')

WS.verifyElementPropertyValue(a, 'ObjReturn[0].Tickets[0].CreateDate', '11:25 21/01/2019')

WS.verifyElementPropertyValue(a, 'ObjReturn[0].Tickets[0].CreateBy', null)

WS.verifyElementPropertyValue(a, 'ObjReturn[1].RequestId', 11)

WS.verifyElementPropertyValue(a, 'ObjReturn[1].AgencyId', 3)

WS.verifyElementPropertyValue(a, 'ObjReturn[1].AgencyName', 'Passio 47 TCV')

WS.verifyElementPropertyValue(a, 'ObjReturn[1].AgencyAddress', '47 Trần Cao Vân')

WS.verifyElementPropertyValue(a, 'ObjReturn[1].RequestCategoryId', 3)

WS.verifyElementPropertyValue(a, 'ObjReturn[1].ServiceId', 14)

WS.verifyElementPropertyValue(a, 'ObjReturn[1].ServiceName', 'SOFTWARE')

WS.verifyElementPropertyValue(a, 'ObjReturn[1].ServiceItemId', 19)

WS.verifyElementPropertyValue(a, 'ObjReturn[1].ServiceItemName', 'Mở máy tính không lên')

WS.verifyElementPropertyValue(a, 'ObjReturn[1].RequestName', 'Passio 47 TCV - Mở máy tính không lên')

WS.verifyElementPropertyValue(a, 'ObjReturn[1].RequestDesciption', '')

WS.verifyElementPropertyValue(a, 'ObjReturn[1].AgencyTelephone', '0966167423')

WS.verifyElementPropertyValue(a, 'ObjReturn[1].CreateDate', '15:38 16/01/2019')

WS.verifyElementPropertyValue(a, 'ObjReturn[1].UpdateDate', '15:38 16/01/2019')

WS.verifyElementPropertyValue(a, 'ObjReturn[1].StartTime', '10:47 16/01/2019')

WS.verifyElementPropertyValue(a, 'ObjReturn[1].EndTime', null)

WS.verifyElementPropertyValue(a, 'ObjReturn[1].RequestStatus', 'Hoàn thành')

WS.verifyElementPropertyValue(a, 'ObjReturn[1].RequestStatusValue', 3)

WS.verifyElementPropertyValue(a, 'ObjReturn[1].RequestEstimationTime', '15:38 16/01/2019')

WS.verifyElementPropertyValue(a, 'ObjReturn[1].NumberOfTicketDone', 0)

WS.verifyElementPropertyValue(a, 'ObjReturn[1].NumberTicketInProcessing', 0)

WS.verifyElementPropertyValue(a, 'ObjReturn[1].NumberOfTicket', 0)

WS.verifyElementPropertyValue(a, 'ObjReturn[1].ITSupporterName', 'Chưa có người xử lý')

WS.verifyElementPropertyValue(a, 'ObjReturn[1].ITSupporterPhone', null)

WS.verifyElementPropertyValue(a, 'ObjReturn[1].FeedBack', null)

WS.verifyElementPropertyValue(a, 'ObjReturn[1].Rating', 4)

WS.verifyElementPropertyValue(a, 'ObjReturn[1].Priority', null)

WS.verifyElementPropertyValue(a, 'ObjReturn[1].PriorityValue', 0)

WS.verifyElementPropertyValue(a, 'ObjReturn[2].RequestId', 10)

WS.verifyElementPropertyValue(a, 'ObjReturn[2].AgencyId', 3)

WS.verifyElementPropertyValue(a, 'ObjReturn[2].AgencyName', 'Passio 47 TCV')

WS.verifyElementPropertyValue(a, 'ObjReturn[2].AgencyAddress', '47 Trần Cao Vân')

WS.verifyElementPropertyValue(a, 'ObjReturn[2].RequestCategoryId', 3)

WS.verifyElementPropertyValue(a, 'ObjReturn[2].ServiceId', 14)

WS.verifyElementPropertyValue(a, 'ObjReturn[2].ServiceName', 'SOFTWARE')

WS.verifyElementPropertyValue(a, 'ObjReturn[2].ServiceItemId', 19)

WS.verifyElementPropertyValue(a, 'ObjReturn[2].ServiceItemName', 'Mở máy tính không lên')

WS.verifyElementPropertyValue(a, 'ObjReturn[2].RequestName', 'Passio 47 TCV - Mở máy tính không lên')

WS.verifyElementPropertyValue(a, 'ObjReturn[2].RequestDesciption', 'ádsad')

WS.verifyElementPropertyValue(a, 'ObjReturn[2].AgencyTelephone', '0966167423')

WS.verifyElementPropertyValue(a, 'ObjReturn[2].CreateDate', '15:36 16/01/2019')

WS.verifyElementPropertyValue(a, 'ObjReturn[2].UpdateDate', '15:36 16/01/2019')

WS.verifyElementPropertyValue(a, 'ObjReturn[2].StartTime', '10:47 16/01/2019')

WS.verifyElementPropertyValue(a, 'ObjReturn[2].EndTime', null)

WS.verifyElementPropertyValue(a, 'ObjReturn[2].RequestStatus', 'Hoàn thành')

WS.verifyElementPropertyValue(a, 'ObjReturn[2].RequestStatusValue', 3)

WS.verifyElementPropertyValue(a, 'ObjReturn[2].RequestEstimationTime', '15:36 16/01/2019')

WS.verifyElementPropertyValue(a, 'ObjReturn[2].NumberOfTicketDone', 0)

WS.verifyElementPropertyValue(a, 'ObjReturn[2].NumberTicketInProcessing', 0)

WS.verifyElementPropertyValue(a, 'ObjReturn[2].NumberOfTicket', 0)

WS.verifyElementPropertyValue(a, 'ObjReturn[2].ITSupporterName', 'Chưa có người xử lý')

WS.verifyElementPropertyValue(a, 'ObjReturn[2].ITSupporterPhone', null)

WS.verifyElementPropertyValue(a, 'ObjReturn[2].FeedBack', null)

WS.verifyElementPropertyValue(a, 'ObjReturn[2].Rating', null)

WS.verifyElementPropertyValue(a, 'ObjReturn[2].Priority', null)

WS.verifyElementPropertyValue(a, 'ObjReturn[2].PriorityValue', null)

WS.verifyElementPropertyValue(a, 'ObjReturn[3].RequestId', 9)

WS.verifyElementPropertyValue(a, 'ObjReturn[3].AgencyId', 3)

WS.verifyElementPropertyValue(a, 'ObjReturn[3].AgencyName', 'Passio 47 TCV')

WS.verifyElementPropertyValue(a, 'ObjReturn[3].AgencyAddress', '47 Trần Cao Vân')

WS.verifyElementPropertyValue(a, 'ObjReturn[3].RequestCategoryId', 3)

WS.verifyElementPropertyValue(a, 'ObjReturn[3].ServiceId', 14)

WS.verifyElementPropertyValue(a, 'ObjReturn[3].ServiceName', 'SOFTWARE')

WS.verifyElementPropertyValue(a, 'ObjReturn[3].ServiceItemId', 19)

WS.verifyElementPropertyValue(a, 'ObjReturn[3].ServiceItemName', 'Mở máy tính không lên')

WS.verifyElementPropertyValue(a, 'ObjReturn[3].RequestName', 'Passio 47 TCV - Mở máy tính không lên')

WS.verifyElementPropertyValue(a, 'ObjReturn[3].RequestDesciption', '')

WS.verifyElementPropertyValue(a, 'ObjReturn[3].AgencyTelephone', '0966167423')

WS.verifyElementPropertyValue(a, 'ObjReturn[3].CreateDate', '15:10 16/01/2019')

WS.verifyElementPropertyValue(a, 'ObjReturn[3].UpdateDate', '15:11 16/01/2019')

WS.verifyElementPropertyValue(a, 'ObjReturn[3].StartTime', '10:47 16/01/2019')

WS.verifyElementPropertyValue(a, 'ObjReturn[3].EndTime', null)

WS.verifyElementPropertyValue(a, 'ObjReturn[3].RequestStatus', 'Hoàn thành')

WS.verifyElementPropertyValue(a, 'ObjReturn[3].RequestStatusValue', 3)

WS.verifyElementPropertyValue(a, 'ObjReturn[3].RequestEstimationTime', '15:38 16/01/2019')

WS.verifyElementPropertyValue(a, 'ObjReturn[3].NumberOfTicketDone', 0)

WS.verifyElementPropertyValue(a, 'ObjReturn[3].NumberTicketInProcessing', 0)

WS.verifyElementPropertyValue(a, 'ObjReturn[3].NumberOfTicket', 0)

WS.verifyElementPropertyValue(a, 'ObjReturn[3].ITSupporterName', 'Chưa có người xử lý')

WS.verifyElementPropertyValue(a, 'ObjReturn[3].ITSupporterPhone', null)

WS.verifyElementPropertyValue(a, 'ObjReturn[3].FeedBack', null)

WS.verifyElementPropertyValue(a, 'ObjReturn[3].Rating', 4)

WS.verifyElementPropertyValue(a, 'ObjReturn[3].Priority', null)

WS.verifyElementPropertyValue(a, 'ObjReturn[3].PriorityValue', 0)

WS.verifyElementPropertyValue(a, 'ObjReturn[4].RequestId', 7)

WS.verifyElementPropertyValue(a, 'ObjReturn[4].AgencyId', 3)

WS.verifyElementPropertyValue(a, 'ObjReturn[4].AgencyName', 'Passio 47 TCV')

WS.verifyElementPropertyValue(a, 'ObjReturn[4].AgencyAddress', '47 Trần Cao Vân')

WS.verifyElementPropertyValue(a, 'ObjReturn[4].RequestCategoryId', 3)

WS.verifyElementPropertyValue(a, 'ObjReturn[4].ServiceId', 14)

WS.verifyElementPropertyValue(a, 'ObjReturn[4].ServiceName', 'SOFTWARE')

WS.verifyElementPropertyValue(a, 'ObjReturn[4].ServiceItemId', 19)

WS.verifyElementPropertyValue(a, 'ObjReturn[4].ServiceItemName', 'Mở máy tính không lên')

WS.verifyElementPropertyValue(a, 'ObjReturn[4].RequestName', 'Passio 47 TCV - Mở máy tính không lên')

WS.verifyElementPropertyValue(a, 'ObjReturn[4].RequestDesciption', 'dsa')

WS.verifyElementPropertyValue(a, 'ObjReturn[4].AgencyTelephone', '0966167423')

WS.verifyElementPropertyValue(a, 'ObjReturn[4].CreateDate', '14:43 16/01/2019')

WS.verifyElementPropertyValue(a, 'ObjReturn[4].UpdateDate', '14:45 16/01/2019')

WS.verifyElementPropertyValue(a, 'ObjReturn[4].StartTime', '10:47 16/01/2019')

WS.verifyElementPropertyValue(a, 'ObjReturn[4].EndTime', '11:47 16/01/2019')

WS.verifyElementPropertyValue(a, 'ObjReturn[4].RequestStatus', 'Hoàn thành')

WS.verifyElementPropertyValue(a, 'ObjReturn[4].RequestStatusValue', 3)

WS.verifyElementPropertyValue(a, 'ObjReturn[4].RequestEstimationTime', '19:43 16/01/2019')

WS.verifyElementPropertyValue(a, 'ObjReturn[4].NumberOfTicketDone', 0)

WS.verifyElementPropertyValue(a, 'ObjReturn[4].NumberTicketInProcessing', 0)

WS.verifyElementPropertyValue(a, 'ObjReturn[4].NumberOfTicket', 1)

WS.verifyElementPropertyValue(a, 'ObjReturn[4].ITSupporterName', 'Ngô Thanh Chiến')

WS.verifyElementPropertyValue(a, 'ObjReturn[4].ITSupporterPhone', '0773909125')

WS.verifyElementPropertyValue(a, 'ObjReturn[4].FeedBack', 'agag')

WS.verifyElementPropertyValue(a, 'ObjReturn[4].Rating', 3)

WS.verifyElementPropertyValue(a, 'ObjReturn[4].Priority', 'Cao')

WS.verifyElementPropertyValue(a, 'ObjReturn[4].PriorityValue', 1)

WS.verifyElementPropertyValue(a, 'ObjReturn[4].Tickets[0].TicketId', 13)

WS.verifyElementPropertyValue(a, 'ObjReturn[4].Tickets[0].DeviceId', 8)

WS.verifyElementPropertyValue(a, 'ObjReturn[4].Tickets[0].DeviceCode', 'P00DDS')

WS.verifyElementPropertyValue(a, 'ObjReturn[4].Tickets[0].Desciption', 'Được Thêm bởi Admin vào lúc 1/17/2019 12:24:23 PM cho sự cố Uni deli - Sửa chữa máy POS  không in được.')

WS.verifyElementPropertyValue(a, 'ObjReturn[4].Tickets[0].DeviceName', 'POS Sunmi')

WS.verifyElementPropertyValue(a, 'ObjReturn[4].Tickets[0].CreateDate', '12:24 17/01/2019')

WS.verifyElementPropertyValue(a, 'ObjReturn[4].Tickets[0].CreateBy', 'ADMIN')

WS.verifyElementPropertyValue(a, 'ObjReturn[5].RequestId', 5)

WS.verifyElementPropertyValue(a, 'ObjReturn[5].AgencyId', 3)

WS.verifyElementPropertyValue(a, 'ObjReturn[5].AgencyName', 'Passio 47 TCV')

WS.verifyElementPropertyValue(a, 'ObjReturn[5].AgencyAddress', '47 Trần Cao Vân')

WS.verifyElementPropertyValue(a, 'ObjReturn[5].RequestCategoryId', 3)

WS.verifyElementPropertyValue(a, 'ObjReturn[5].ServiceId', 14)

WS.verifyElementPropertyValue(a, 'ObjReturn[5].ServiceName', 'SOFTWARE')

WS.verifyElementPropertyValue(a, 'ObjReturn[5].ServiceItemId', 19)

WS.verifyElementPropertyValue(a, 'ObjReturn[5].ServiceItemName', 'Mở máy tính không lên')

WS.verifyElementPropertyValue(a, 'ObjReturn[5].RequestName', 'Passio 47 TCV - Mở máy tính không lên')

WS.verifyElementPropertyValue(a, 'ObjReturn[5].RequestDesciption', '')

WS.verifyElementPropertyValue(a, 'ObjReturn[5].AgencyTelephone', '0966167423')

WS.verifyElementPropertyValue(a, 'ObjReturn[5].CreateDate', '14:21 16/01/2019')

WS.verifyElementPropertyValue(a, 'ObjReturn[5].UpdateDate', '14:31 16/01/2019')

WS.verifyElementPropertyValue(a, 'ObjReturn[5].StartTime', '10:47 16/01/2019')

WS.verifyElementPropertyValue(a, 'ObjReturn[5].EndTime', null)

WS.verifyElementPropertyValue(a, 'ObjReturn[5].RequestStatus', 'Hoàn thành')

WS.verifyElementPropertyValue(a, 'ObjReturn[5].RequestStatusValue', 3)

WS.verifyElementPropertyValue(a, 'ObjReturn[5].RequestEstimationTime', '14:21 16/01/2019')

WS.verifyElementPropertyValue(a, 'ObjReturn[5].NumberOfTicketDone', 0)

WS.verifyElementPropertyValue(a, 'ObjReturn[5].NumberTicketInProcessing', 0)

WS.verifyElementPropertyValue(a, 'ObjReturn[5].NumberOfTicket', 0)

WS.verifyElementPropertyValue(a, 'ObjReturn[5].ITSupporterName', 'Chưa có người xử lý')

WS.verifyElementPropertyValue(a, 'ObjReturn[5].ITSupporterPhone', null)

WS.verifyElementPropertyValue(a, 'ObjReturn[5].FeedBack', null)

WS.verifyElementPropertyValue(a, 'ObjReturn[5].Rating', null)

WS.verifyElementPropertyValue(a, 'ObjReturn[5].Priority', null)

WS.verifyElementPropertyValue(a, 'ObjReturn[5].PriorityValue', null)

WS.sendRequest(findTestObject(null))*/

