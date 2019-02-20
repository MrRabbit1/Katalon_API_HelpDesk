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

a = WS.sendRequest(findTestObject('Request/47AllTicket'))

WS.verifyResponseStatusCode(a, 200)

WS.verifyElementPropertyValue(a, 'IsError', false)

/*WS.verifyElementPropertyValue(a, 'ObjReturn[0].RequestId', 1)

WS.verifyElementPropertyValue(a, 'ObjReturn[0].RequestName', "The Coffee House - Chi nhánh số 1 - Wifi chậm")

WS.verifyElementPropertyValue(a, 'ObjReturn[0].CreateDate', "09:47 16/02/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn[0].AgencyName', "The Coffee House - Chi nhánh số 1")

WS.verifyElementPropertyValue(a, 'ObjReturn[0].ITSupporterName', "Lê Hồng Ân")

WS.verifyElementPropertyValue(a, 'ObjReturn[0].IssueName', "Wifi chậm")

WS.verifyElementPropertyValue(a, 'ObjReturn[0].ITName', "Lê Hồng Ân")

WS.verifyElementPropertyValue(a, 'ObjReturn[0].RequestStatus', "Chờ nhân viên xử lý")

WS.verifyElementPropertyValue(a, 'ObjReturn[0].RequestStatusId', 1)

WS.verifyElementPropertyValue(a, 'ObjReturn[0].StatusName', "Chờ nhân viên xử lý")

WS.verifyElementPropertyValue(a, 'ObjReturn[0].NumberOfRecord', 1)

WS.verifyElementPropertyValue(a, 'ObjReturn[0].Priority', "Thấp")

WS.verifyElementPropertyValue(a, 'ObjReturn[21].RequestId', 2)

WS.verifyElementPropertyValue(a, 'ObjReturn[21].RequestName', "The Coffee House - Chi nhánh số 1 - Camera không hiện màu")

WS.verifyElementPropertyValue(a, 'ObjReturn[21].CreateDate', "09:54 16/01/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn[21].AgencyName', "The Coffee House - Chi nhánh số 1")

WS.verifyElementPropertyValue(a, 'ObjReturn[21].ITSupporterName', "Phạm Phú Tiến")

WS.verifyElementPropertyValue(a, 'ObjReturn[21].IssueName', "Camera không hiện màu")

WS.verifyElementPropertyValue(a, 'ObjReturn[21].ITName', "Phạm Phú Tiến")

WS.verifyElementPropertyValue(a, 'ObjReturn[21].RequestStatus', "Tạo mới")

WS.verifyElementPropertyValue(a, 'ObjReturn[21].RequestStatusId', 5)

WS.verifyElementPropertyValue(a, 'ObjReturn[21].StatusName', "Tạo mới")

WS.verifyElementPropertyValue(a, 'ObjReturn[21].NumberOfRecord', 2)

WS.verifyElementPropertyValue(a, 'ObjReturn[21].Priority', "Trung bình")

WS.verifyElementPropertyValue(a, 'ObjReturn[20].RequestId', 3)

WS.verifyElementPropertyValue(a, 'ObjReturn[20].RequestName', "Uni deli - Sửa chữa máy POS  không in được.")

WS.verifyElementPropertyValue(a, 'ObjReturn[20].CreateDate', "13:25 16/01/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn[20].AgencyName', "Uni deli")

WS.verifyElementPropertyValue(a, 'ObjReturn[20].ITSupporterName', "Đỗ Hoàng Long")

WS.verifyElementPropertyValue(a, 'ObjReturn[20].IssueName', "Sửa chữa máy POS  không in được.")

WS.verifyElementPropertyValue(a, 'ObjReturn[20].ITName', "Đỗ Hoàng Long")

WS.verifyElementPropertyValue(a, 'ObjReturn[20].RequestStatus', "Hoàn thành")

WS.verifyElementPropertyValue(a, 'ObjReturn[20].RequestStatusId', 3)

WS.verifyElementPropertyValue(a, 'ObjReturn[20].StatusName', "Hoàn thành")

WS.verifyElementPropertyValue(a, 'ObjReturn[20].NumberOfRecord', 3)

WS.verifyElementPropertyValue(a, 'ObjReturn[20].Priority', "Cao")

WS.verifyElementPropertyValue(a, 'ObjReturn[19].RequestId', 4)

WS.verifyElementPropertyValue(a, 'ObjReturn[19].RequestName', "Uni deli - Sửa chữa máy POS  không in được.")

WS.verifyElementPropertyValue(a, 'ObjReturn[19].CreateDate', "14:10 16/01/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn[19].AgencyName', "Uni deli")

WS.verifyElementPropertyValue(a, 'ObjReturn[19].ITSupporterName', null)

WS.verifyElementPropertyValue(a, 'ObjReturn[19].IssueName', "Sửa chữa máy POS  không in được.")

WS.verifyElementPropertyValue(a, 'ObjReturn[19].ITName', null)

WS.verifyElementPropertyValue(a, 'ObjReturn[19].RequestStatus', "Tạo mới")

WS.verifyElementPropertyValue(a, 'ObjReturn[19].RequestStatusId', 5)

WS.verifyElementPropertyValue(a, 'ObjReturn[19].StatusName', "Tạo mới")

WS.verifyElementPropertyValue(a, 'ObjReturn[19].NumberOfRecord', 4)

WS.verifyElementPropertyValue(a, 'ObjReturn[19].Priority', "Cao")

WS.verifyElementPropertyValue(a, 'ObjReturn[18].RequestId', 5)

WS.verifyElementPropertyValue(a, 'ObjReturn[18].RequestName', "Passio 47 TCV - Mở máy tính không lên")

WS.verifyElementPropertyValue(a, 'ObjReturn[18].CreateDate', "14:21 16/01/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn[18].AgencyName', "Passio 47 TCV")

WS.verifyElementPropertyValue(a, 'ObjReturn[18].ITSupporterName', null)

WS.verifyElementPropertyValue(a, 'ObjReturn[18].IssueName', "Mở máy tính không lên")

WS.verifyElementPropertyValue(a, 'ObjReturn[18].ITName', null)

WS.verifyElementPropertyValue(a, 'ObjReturn[18].RequestStatus', "Hoàn thành")

WS.verifyElementPropertyValue(a, 'ObjReturn[18].RequestStatusId', 3)

WS.verifyElementPropertyValue(a, 'ObjReturn[18].StatusName', "Hoàn thành")

WS.verifyElementPropertyValue(a, 'ObjReturn[18].NumberOfRecord', 5)

WS.verifyElementPropertyValue(a, 'ObjReturn[18].Priority', null)*/

