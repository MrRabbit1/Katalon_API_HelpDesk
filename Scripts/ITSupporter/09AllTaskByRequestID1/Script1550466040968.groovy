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

a = WS.sendRequest(findTestObject('ITSupporter/09AllTaskByRequestID'))

WS.verifyResponseStatusCode(a, 200)

WS.verifyElementPropertyValue(a, 'IsError', false)

/*WS.verifyElementPropertyValue(a, 'ObjReturn[0].request_id', 1)

WS.verifyElementPropertyValue(a, 'ObjReturn[0].request_task_id', 1)

WS.verifyElementPropertyValue(a, 'ObjReturn[0].task_status', 2)

WS.verifyElementPropertyValue(a, 'ObjReturn[0].task_detail', "anh")

WS.verifyElementPropertyValue(a, 'ObjReturn[0].create_by', 1)

WS.verifyElementPropertyValue(a, 'ObjReturn[0].start_time', "00:00:00 10/10/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn[0].end_time', "00:00:00 11/10/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn[0].priority', 1)

WS.verifyElementPropertyValue(a, 'ObjReturn[0].pre_task_condition', 2)

WS.verifyElementPropertyValue(a, 'ObjReturn[1].request_id', 1)

WS.verifyElementPropertyValue(a, 'ObjReturn[1].request_task_id', 4)

WS.verifyElementPropertyValue(a, 'ObjReturn[1].task_status', 2)

WS.verifyElementPropertyValue(a, 'ObjReturn[1].task_detail', "nguyen")

WS.verifyElementPropertyValue(a, 'ObjReturn[1].create_by', 3)

WS.verifyElementPropertyValue(a, 'ObjReturn[1].start_time', "00:00:00 04/04/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn[1].end_time', "00:00:00 01/08/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn[1].priority', 3)

WS.verifyElementPropertyValue(a, 'ObjReturn[1].pre_task_condition', 4)

WS.verifyElementPropertyValue(a, 'ObjReturn[2].request_id', 1)

WS.verifyElementPropertyValue(a, 'ObjReturn[2].request_task_id', 12)

WS.verifyElementPropertyValue(a, 'ObjReturn[2].task_status', 1)

WS.verifyElementPropertyValue(a, 'ObjReturn[2].task_detail', "kiem tra create_task_by_guideline")

WS.verifyElementPropertyValue(a, 'ObjReturn[2].create_by', 8)

WS.verifyElementPropertyValue(a, 'ObjReturn[2].start_time', "17:08:57 02-02-2019")

WS.verifyElementPropertyValue(a, 'ObjReturn[2].end_time', "00:00:00 02-03-2019")

WS.verifyElementPropertyValue(a, 'ObjReturn[2].priority', 3)

WS.verifyElementPropertyValue(a, 'ObjReturn[2].pre_task_condition', 1)

WS.verifyElementPropertyValue(a, 'ObjReturn[2].pre_task_condition', 1)*/

