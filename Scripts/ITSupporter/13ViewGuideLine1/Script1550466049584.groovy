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

a = WS.sendRequest(findTestObject('ITSupporter/13ViewGuideLine'))

WS.verifyResponseStatusCode(a, 200)

WS.verifyElementPropertyValue(a, 'IsError', false)

/*WS.verifyElementPropertyValue(a, 'ObjReturn[0].order', 1)

WS.verifyElementPropertyValue(a, 'ObjReturn[0].guideline_id', 1)

WS.verifyElementPropertyValue(a, 'ObjReturn[0].service_item_id', 1)

WS.verifyElementPropertyValue(a, 'ObjReturn[0].guideline_name', "Kiểm tra phần cứng")

WS.verifyElementPropertyValue(a, 'ObjReturn[0].start_date', null)

WS.verifyElementPropertyValue(a, 'ObjReturn[0].end_date', null)

WS.verifyElementPropertyValue(a, 'ObjReturn[0].create_date', "00:00:00 08/10/2018")

WS.verifyElementPropertyValue(a, 'ObjReturn[0].update_date', "17:28:42 14/11/2018")

WS.verifyElementPropertyValue(a, 'ObjReturn[1].order', 2)

WS.verifyElementPropertyValue(a, 'ObjReturn[1].guideline_id', 3)

WS.verifyElementPropertyValue(a, 'ObjReturn[1].service_item_id', 1)

WS.verifyElementPropertyValue(a, 'ObjReturn[1].guideline_name', "Kiểm tra hợp đồng mạng")

WS.verifyElementPropertyValue(a, 'ObjReturn[1].start_date', null)

WS.verifyElementPropertyValue(a, 'ObjReturn[1].end_date', null)

WS.verifyElementPropertyValue(a, 'ObjReturn[1].create_date', "00:00:00 10/10/2018")

WS.verifyElementPropertyValue(a, 'ObjReturn[1].update_date', "00:00:00 10/10/2018")

WS.verifyElementPropertyValue(a, 'ObjReturn[2].order', 3)

WS.verifyElementPropertyValue(a, 'ObjReturn[2].guideline_id', 5)

WS.verifyElementPropertyValue(a, 'ObjReturn[2].service_item_id', 1)

WS.verifyElementPropertyValue(a, 'ObjReturn[2].guideline_name', "Kiểm tra kết nối cáp")

WS.verifyElementPropertyValue(a, 'ObjReturn[2].start_date', null)

WS.verifyElementPropertyValue(a, 'ObjReturn[2].end_date', null)

WS.verifyElementPropertyValue(a, 'ObjReturn[2].create_date', "00:00:00 10/11/2018")

WS.verifyElementPropertyValue(a, 'ObjReturn[2].update_date', "00:00:00 10/10/2018")

WS.verifyElementPropertyValue(a, 'ObjReturn[3].order', 4)

WS.verifyElementPropertyValue(a, 'ObjReturn[3].guideline_id', 30)

WS.verifyElementPropertyValue(a, 'ObjReturn[3].service_item_id', 1)

WS.verifyElementPropertyValue(a, 'ObjReturn[3].guideline_name', "Reset routers")

WS.verifyElementPropertyValue(a, 'ObjReturn[3].start_date', null)

WS.verifyElementPropertyValue(a, 'ObjReturn[3].end_date', null)

WS.verifyElementPropertyValue(a, 'ObjReturn[3].create_date', "17:17:47 14/01/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn[3].update_date', "11:03:59 23/01/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn[4].order', 5)

WS.verifyElementPropertyValue(a, 'ObjReturn[4].guideline_id', 31)

WS.verifyElementPropertyValue(a, 'ObjReturn[4].service_item_id', 1)

WS.verifyElementPropertyValue(a, 'ObjReturn[4].guideline_name', "Reset router")

WS.verifyElementPropertyValue(a, 'ObjReturn[4].start_date', null)

WS.verifyElementPropertyValue(a, 'ObjReturn[4].end_date', null)

WS.verifyElementPropertyValue(a, 'ObjReturn[4].create_date', "15:02:53 17/01/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn[4].update_date', "11:44:21 23/01/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn[4].update_date', "11:44:21 23/01/2019")*/