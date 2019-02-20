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

a = WS.sendRequest(findTestObject('ITSupporter/15ViewITSupporterStatisticAll'))

WS.verifyResponseStatusCode(a, 200)

WS.verifyElementPropertyValue(a, 'IsError', false)

/*WS.verifyElementPropertyValue(a, 'ObjReturn.ITSupporterId', 1)

WS.verifyElementPropertyValue(a, 'ObjReturn.ITSupporterName', "Lê Hồng Ân")

WS.verifyElementPropertyValue(a, 'ObjReturn.TotalTimesSupport', 1)

WS.verifyElementPropertyValue(a, 'ObjReturn.TotalTimeSupport', "15 giờ 38 phút")

WS.verifyElementPropertyValue(a, 'ObjReturn.TotalTimesSupportInThisMonth', 0)

WS.verifyElementPropertyValue(a, 'ObjReturn.TotalTimeSupportInThisMonth', "0 giờ 00 phút")

WS.verifyElementPropertyValue(a, 'ObjReturn.RequestOfITSupporter[0].MonthYearGroup', "Tháng 2/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn.RequestOfITSupporter[0].RequestOfITSupporter[0].RequestId', 1)

WS.verifyElementPropertyValue(a, 'ObjReturn.RequestOfITSupporter[0].RequestOfITSupporter[0].AgencyId', 31)

WS.verifyElementPropertyValue(a, 'ObjReturn.RequestOfITSupporter[0].RequestOfITSupporter[0].AgencyName', "The Coffee House - Chi nhánh số 1")

WS.verifyElementPropertyValue(a, 'ObjReturn.RequestOfITSupporter[0].RequestOfITSupporter[0].AgencyAddress', "88 Ngô Tất Tố, Quận Bình Thạnh")

WS.verifyElementPropertyValue(a, 'ObjReturn.RequestOfITSupporter[0].RequestOfITSupporter[0].RequestCategoryId', 3)

WS.verifyElementPropertyValue(a, 'ObjReturn.RequestOfITSupporter[0].RequestOfITSupporter[0].ServiceId', 1)

WS.verifyElementPropertyValue(a, 'ObjReturn.RequestOfITSupporter[0].RequestOfITSupporter[0].ServiceName', "WIFI")

WS.verifyElementPropertyValue(a, 'ObjReturn.RequestOfITSupporter[0].RequestOfITSupporter[0].ServiceItemId', 6)

WS.verifyElementPropertyValue(a, 'ObjReturn.RequestOfITSupporter[0].RequestOfITSupporter[0].ServiceItemName', "Wifi chậm")

WS.verifyElementPropertyValue(a, 'ObjReturn.RequestOfITSupporter[0].RequestOfITSupporter[0].RequestName', "The Coffee House - Chi nhánh số 1 - Wifi chậm")

WS.verifyElementPropertyValue(a, 'ObjReturn.RequestOfITSupporter[0].RequestOfITSupporter[0].RequestDesciption', "anh")

WS.verifyElementPropertyValue(a, 'ObjReturn.RequestOfITSupporter[0].RequestOfITSupporter[0].AgencyTelephone', "0397934468")

WS.verifyElementPropertyValue(a, 'ObjReturn.RequestOfITSupporter[0].RequestOfITSupporter[0].CreateDate', "09:47 16/02/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn.RequestOfITSupporter[0].RequestOfITSupporter[0].UpdateDate', "15:39 17/02/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn.RequestOfITSupporter[0].RequestOfITSupporter[0].StartTime', "00:00 02/02/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn.RequestOfITSupporter[0].RequestOfITSupporter[0].EndTime', "15:38 02/02/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn.RequestOfITSupporter[0].RequestOfITSupporter[0].RequestStatus', "Chờ nhân viên xử lý")

WS.verifyElementPropertyValue(a, 'ObjReturn.RequestOfITSupporter[0].RequestOfITSupporter[0].RequestStatusValue', 1)

WS.verifyElementPropertyValue(a, 'ObjReturn.RequestOfITSupporter[0].RequestOfITSupporter[0].RequestEstimationTime', "12")

WS.verifyElementPropertyValue(a, 'ObjReturn.RequestOfITSupporter[0].RequestOfITSupporter[0].NumberOfTicketDone', 1)

WS.verifyElementPropertyValue(a, 'ObjReturn.RequestOfITSupporter[0].RequestOfITSupporter[0].NumberTicketInProcessing', 1)

WS.verifyElementPropertyValue(a, 'ObjReturn.RequestOfITSupporter[0].RequestOfITSupporter[0].NumberOfTicket', 1)

WS.verifyElementPropertyValue(a, 'ObjReturn.RequestOfITSupporter[0].RequestOfITSupporter[0].ITSupporterName', "Lê Hồng Ân")

WS.verifyElementPropertyValue(a, 'ObjReturn.RequestOfITSupporter[0].RequestOfITSupporter[0].ITSupporterPhone', "0152012421")

WS.verifyElementPropertyValue(a, 'ObjReturn.RequestOfITSupporter[0].RequestOfITSupporter[0].FeedBack', "Nice job test!")

WS.verifyElementPropertyValue(a, 'ObjReturn.RequestOfITSupporter[0].RequestOfITSupporter[0].Rating', 5)

WS.verifyElementPropertyValue(a, 'ObjReturn.RequestOfITSupporter[0].RequestOfITSupporter[0].Priority', "Thấp")

WS.verifyElementPropertyValue(a, 'ObjReturn.RequestOfITSupporter[0].RequestOfITSupporter[0].PriorityValue', 3)

WS.verifyElementPropertyValue(a, 'ObjReturn.RequestOfITSupporter[0].RequestOfITSupporter[0].Tickets', "1")*/


