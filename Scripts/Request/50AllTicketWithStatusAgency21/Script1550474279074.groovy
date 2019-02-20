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

a = WS.sendRequest(findTestObject('Request/50AllTicketWithStatusAgency2'))

WS.verifyResponseStatusCode(a, 200)

WS.verifyElementPropertyValue(a, 'IsError', false)

/*WS.verifyElementPropertyValue(a, 'ObjReturn[0].RequestId', 13)

WS.verifyElementPropertyValue(a, 'ObjReturn[0].AgencyId', 31)

WS.verifyElementPropertyValue(a, 'ObjReturn[0].AgencyName', 'The Coffee House - Chi nhánh số 1')

WS.verifyElementPropertyValue(a, 'ObjReturn[0].AgencyAddress', '88 Ngô Tất Tố, Quận Bình Thạnh')

WS.verifyElementPropertyValue(a, 'ObjReturn[0].RequestCategoryId', 3)

WS.verifyElementPropertyValue(a, 'ObjReturn[0].ServiceId', 1)

WS.verifyElementPropertyValue(a, 'ObjReturn[0].ServiceName', 'WIFI')

WS.verifyElementPropertyValue(a, 'ObjReturn[0].ServiceItemId', 7)

WS.verifyElementPropertyValue(a, 'ObjReturn[0].ServiceItemName', 'Wifi mất kết nối')

WS.verifyElementPropertyValue(a, 'ObjReturn[0].RequestName', 'The Coffee House - Chi nhánh số 1 - Wifi mất kết nối')

WS.verifyElementPropertyValue(a, 'ObjReturn[0].RequestDesciption', 'njnj')

WS.verifyElementPropertyValue(a, 'ObjReturn[0].AgencyTelephone', '0397934468')

WS.verifyElementPropertyValue(a, 'ObjReturn[0].CreateDate', '12:46 17/01/2019')

WS.verifyElementPropertyValue(a, 'ObjReturn[0].UpdateDate', '16:21 17/01/2019')

WS.verifyElementPropertyValue(a, 'ObjReturn[0].StartTime', '10:47 16/01/2019')

WS.verifyElementPropertyValue(a, 'ObjReturn[0].EndTime', '11:46 16/01/2019')

WS.verifyElementPropertyValue(a, 'ObjReturn[0].RequestStatus', 'Tạo mới')

WS.verifyElementPropertyValue(a, 'ObjReturn[0].RequestStatusValue', 5)

WS.verifyElementPropertyValue(a, 'ObjReturn[0].RequestEstimationTime', '18:46 17/01/2019')

WS.verifyElementPropertyValue(a, 'ObjReturn[0].NumberOfTicketDone', 0)

WS.verifyElementPropertyValue(a, 'ObjReturn[0].NumberTicketInProcessing', 0)

WS.verifyElementPropertyValue(a, 'ObjReturn[0].NumberOfTicket', 1)

WS.verifyElementPropertyValue(a, 'ObjReturn[0].ITSupporterName', 'Đỗ Hoàng Long')

WS.verifyElementPropertyValue(a, 'ObjReturn[0].ITSupporterPhone', '02322205')

WS.verifyElementPropertyValue(a, 'ObjReturn[0].FeedBack', '3eq')

WS.verifyElementPropertyValue(a, 'ObjReturn[0].Rating', 2)

WS.verifyElementPropertyValue(a, 'ObjReturn[0].Priority', 'Trung bình')

WS.verifyElementPropertyValue(a, 'ObjReturn[0].PriorityValue', 2)

WS.verifyElementPropertyValue(a, 'ObjReturn[0].Tickets[0].TicketId', 14)

WS.verifyElementPropertyValue(a, 'ObjReturn[0].Tickets[0].DeviceId', 43)

WS.verifyElementPropertyValue(a, 'ObjReturn[0].Tickets[0].DeviceCode', 'N301')

WS.verifyElementPropertyValue(a, 'ObjReturn[0].Tickets[0].Desciption', 'test')

WS.verifyElementPropertyValue(a, 'ObjReturn[0].Tickets[0].DeviceName', 'Router TENDA N301 300Mbps Wireless N')

WS.verifyElementPropertyValue(a, 'ObjReturn[0].Tickets[0].CreateDate', '12:46 17/01/2019')

WS.verifyElementPropertyValue(a, 'ObjReturn[0].Tickets[0].CreateBy', 'ADMIN')

WS.verifyElementPropertyValue(a, 'ObjReturn[1].RequestId', 2)

WS.verifyElementPropertyValue(a, 'ObjReturn[1].AgencyId', 31)

WS.verifyElementPropertyValue(a, 'ObjReturn[1].AgencyName', 'The Coffee House - Chi nhánh số 1')

WS.verifyElementPropertyValue(a, 'ObjReturn[1].AgencyAddress', '88 Ngô Tất Tố, Quận Bình Thạnh')

WS.verifyElementPropertyValue(a, 'ObjReturn[1].RequestCategoryId', 3)

WS.verifyElementPropertyValue(a, 'ObjReturn[1].ServiceId', 2)

WS.verifyElementPropertyValue(a, 'ObjReturn[1].ServiceName', 'CAMERA')

WS.verifyElementPropertyValue(a, 'ObjReturn[1].ServiceItemId', 3)

WS.verifyElementPropertyValue(a, 'ObjReturn[1].ServiceItemName', 'Camera không hiện màu')

WS.verifyElementPropertyValue(a, 'ObjReturn[1].RequestName', 'The Coffee House - Chi nhánh số 1 - Camera không hiện màu')

WS.verifyElementPropertyValue(a, 'ObjReturn[1].RequestDesciption', 'dsdsfdsfsfdfdsfdsfdsfdrgvrdfgdfgdfgdfgdffg')

WS.verifyElementPropertyValue(a, 'ObjReturn[1].AgencyTelephone', '0397934468')

WS.verifyElementPropertyValue(a, 'ObjReturn[1].CreateDate', '09:54 16/01/2019')

WS.verifyElementPropertyValue(a, 'ObjReturn[1].UpdateDate', '17:30 17/01/2019')

WS.verifyElementPropertyValue(a, 'ObjReturn[1].StartTime', '10:47 16/01/2019')

WS.verifyElementPropertyValue(a, 'ObjReturn[1].EndTime', '15:38 18/01/2019')

WS.verifyElementPropertyValue(a, 'ObjReturn[1].RequestStatus', 'Tạo mới')

WS.verifyElementPropertyValue(a, 'ObjReturn[1].RequestStatusValue', 5)

WS.verifyElementPropertyValue(a, 'ObjReturn[1].RequestEstimationTime', '09:54 16/01/2019')

WS.verifyElementPropertyValue(a, 'ObjReturn[1].NumberOfTicketDone', 0)

WS.verifyElementPropertyValue(a, 'ObjReturn[1].NumberTicketInProcessing', 0)

WS.verifyElementPropertyValue(a, 'ObjReturn[1].NumberOfTicket', 1)

WS.verifyElementPropertyValue(a, 'ObjReturn[1].ITSupporterName', 'Phạm Phú Tiến')

WS.verifyElementPropertyValue(a, 'ObjReturn[1].ITSupporterPhone', '0916512300')

WS.verifyElementPropertyValue(a, 'ObjReturn[1].FeedBack', 'So good')

WS.verifyElementPropertyValue(a, 'ObjReturn[1].Rating', 4)

WS.verifyElementPropertyValue(a, 'ObjReturn[1].Priority', 'Trung bình')

WS.verifyElementPropertyValue(a, 'ObjReturn[1].PriorityValue', 2)

WS.verifyElementPropertyValue(a, 'ObjReturn[1].Tickets[0].TicketId', 2)

WS.verifyElementPropertyValue(a, 'ObjReturn[1].Tickets[0].DeviceId', 45)

WS.verifyElementPropertyValue(a, 'ObjReturn[1].Tickets[0].DeviceCode', 'KX-S2001CA4')

WS.verifyElementPropertyValue(a, 'ObjReturn[1].Tickets[0].Desciption', null)

WS.verifyElementPropertyValue(a, 'ObjReturn[1].Tickets[0].DeviceName', 'Camera KBVISION KX-S2001CA4')

WS.verifyElementPropertyValue(a, 'ObjReturn[1].Tickets[0].CreateDate', '09:54 16/01/2019')

WS.verifyElementPropertyValue(a, 'ObjReturn[1].Tickets[0].CreateBy', null)*/

